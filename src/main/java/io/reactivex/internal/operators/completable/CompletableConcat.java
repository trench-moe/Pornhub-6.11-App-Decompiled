package io.reactivex.internal.operators.completable;

import df.b;
import df.d;
import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class CompletableConcat extends Completable {
    public final int prefetch;
    public final b<? extends CompletableSource> sources;

    /* loaded from: classes2.dex */
    public static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {
        private static final long serialVersionUID = 9032184911934499404L;
        public volatile boolean active;
        public int consumed;
        public volatile boolean done;
        public final CompletableObserver downstream;
        public final int limit;
        public final int prefetch;
        public SimpleQueue<CompletableSource> queue;
        public int sourceFused;
        public d upstream;
        public final ConcatInnerObserver inner = new ConcatInnerObserver(this);
        public final AtomicBoolean once = new AtomicBoolean();

        /* loaded from: classes2.dex */
        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {
            private static final long serialVersionUID = -5454794857847146511L;
            public final CompletableConcatSubscriber parent;

            public ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.parent = completableConcatSubscriber;
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }
        }

        public CompletableConcatSubscriber(CompletableObserver completableObserver, int i10) {
            this.downstream = completableObserver;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            DisposableHelper.dispose(this.inner);
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.active) {
                    boolean z10 = this.done;
                    try {
                        CompletableSource poll = this.queue.poll();
                        boolean z11 = poll == null;
                        if (z10 && z11) {
                            if (this.once.compareAndSet(false, true)) {
                                this.downstream.onComplete();
                                return;
                            }
                            return;
                        } else if (!z11) {
                            this.active = true;
                            poll.subscribe(this.inner);
                            request();
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        public void innerError(Throwable th) {
            if (!this.once.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.upstream.cancel();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.inner.get());
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.once.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th);
                return;
            }
            DisposableHelper.dispose(this.inner);
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(CompletableSource completableSource) {
            if (this.sourceFused != 0 || this.queue.offer(completableSource)) {
                drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                int i10 = this.prefetch;
                long j10 = i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceFused = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceFused = requestFusion;
                        this.queue = queueSubscription;
                        this.downstream.onSubscribe(this);
                        dVar.request(j10);
                        return;
                    }
                }
                if (this.prefetch == Integer.MAX_VALUE) {
                    this.queue = new SpscLinkedArrayQueue(Flowable.bufferSize());
                } else {
                    this.queue = new SpscArrayQueue(this.prefetch);
                }
                this.downstream.onSubscribe(this);
                dVar.request(j10);
            }
        }

        public void request() {
            if (this.sourceFused != 1) {
                int i10 = this.consumed + 1;
                if (i10 != this.limit) {
                    this.consumed = i10;
                    return;
                }
                this.consumed = 0;
                this.upstream.request(i10);
            }
        }
    }

    public CompletableConcat(b<? extends CompletableSource> bVar, int i10) {
        this.sources = bVar;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.sources.subscribe(new CompletableConcatSubscriber(completableObserver, this.prefetch));
    }
}
