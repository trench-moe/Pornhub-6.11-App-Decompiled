package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscribers.InnerQueuedSubscriber;
import io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableConcatMapEager<T, R> extends AbstractFlowableWithUpstream<T, R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final int maxConcurrency;
    public final int prefetch;

    /* loaded from: classes2.dex */
    public static final class ConcatMapEagerDelayErrorSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d, InnerQueuedSubscriberSupport<R> {
        private static final long serialVersionUID = -4255299542215038287L;
        public volatile boolean cancelled;
        public volatile InnerQueuedSubscriber<R> current;
        public volatile boolean done;
        public final c<? super R> downstream;
        public final ErrorMode errorMode;
        public final Function<? super T, ? extends b<? extends R>> mapper;
        public final int maxConcurrency;
        public final int prefetch;
        public final SpscLinkedArrayQueue<InnerQueuedSubscriber<R>> subscribers;
        public d upstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicLong requested = new AtomicLong();

        public ConcatMapEagerDelayErrorSubscriber(c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
            this.downstream = cVar;
            this.mapper = function;
            this.maxConcurrency = i10;
            this.prefetch = i11;
            this.errorMode = errorMode;
            this.subscribers = new SpscLinkedArrayQueue<>(Math.min(i11, i10));
        }

        @Override // df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            drainAndCancel();
        }

        public void cancelAll() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber = this.current;
            this.current = null;
            if (innerQueuedSubscriber != null) {
                innerQueuedSubscriber.cancel();
            }
            while (true) {
                InnerQueuedSubscriber<R> poll = this.subscribers.poll();
                if (poll == null) {
                    return;
                }
                poll.cancel();
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void drain() {
            InnerQueuedSubscriber<R> innerQueuedSubscriber;
            int i10;
            long j10;
            boolean z10;
            SimpleQueue<R> queue;
            int i11;
            if (getAndIncrement() != 0) {
                return;
            }
            InnerQueuedSubscriber<R> innerQueuedSubscriber2 = this.current;
            c<? super R> cVar = this.downstream;
            ErrorMode errorMode = this.errorMode;
            int i12 = 1;
            while (true) {
                long j11 = this.requested.get();
                if (innerQueuedSubscriber2 != null) {
                    innerQueuedSubscriber = innerQueuedSubscriber2;
                } else if (errorMode != ErrorMode.END && this.errors.get() != null) {
                    cancelAll();
                    cVar.onError(this.errors.terminate());
                    return;
                } else {
                    boolean z11 = this.done;
                    innerQueuedSubscriber = this.subscribers.poll();
                    if (z11 && innerQueuedSubscriber == null) {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != null) {
                            cVar.onError(terminate);
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    } else if (innerQueuedSubscriber != null) {
                        this.current = innerQueuedSubscriber;
                    }
                }
                if (innerQueuedSubscriber == null || (queue = innerQueuedSubscriber.queue()) == null) {
                    i10 = i12;
                    j10 = 0;
                    z10 = false;
                } else {
                    i10 = i12;
                    j10 = 0;
                    while (true) {
                        i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                        if (i11 == 0) {
                            break;
                        } else if (this.cancelled) {
                            cancelAll();
                            return;
                        } else if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            innerQueuedSubscriber.cancel();
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        } else {
                            boolean isDone = innerQueuedSubscriber.isDone();
                            try {
                                R poll = queue.poll();
                                boolean z12 = poll == null;
                                if (isDone && z12) {
                                    this.current = null;
                                    this.upstream.request(1L);
                                    innerQueuedSubscriber = null;
                                    z10 = true;
                                    break;
                                } else if (z12) {
                                    break;
                                } else {
                                    cVar.onNext(poll);
                                    j10++;
                                    innerQueuedSubscriber.requestOne();
                                }
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                this.current = null;
                                innerQueuedSubscriber.cancel();
                                cancelAll();
                                cVar.onError(th);
                                return;
                            }
                        }
                    }
                    z10 = false;
                    if (i11 == 0) {
                        if (this.cancelled) {
                            cancelAll();
                            return;
                        } else if (errorMode == ErrorMode.IMMEDIATE && this.errors.get() != null) {
                            this.current = null;
                            innerQueuedSubscriber.cancel();
                            cancelAll();
                            cVar.onError(this.errors.terminate());
                            return;
                        } else {
                            boolean isDone2 = innerQueuedSubscriber.isDone();
                            boolean isEmpty = queue.isEmpty();
                            if (isDone2 && isEmpty) {
                                this.current = null;
                                this.upstream.request(1L);
                                innerQueuedSubscriber = null;
                                z10 = true;
                            }
                        }
                    }
                }
                if (j10 != 0 && j11 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j10);
                }
                if (z10) {
                    innerQueuedSubscriber2 = innerQueuedSubscriber;
                    i12 = i10;
                } else {
                    i12 = addAndGet(-i10);
                    if (i12 == 0) {
                        return;
                    }
                    innerQueuedSubscriber2 = innerQueuedSubscriber;
                }
            }
        }

        public void drainAndCancel() {
            if (getAndIncrement() == 0) {
                do {
                    cancelAll();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerComplete(InnerQueuedSubscriber<R> innerQueuedSubscriber) {
            innerQueuedSubscriber.setDone();
            drain();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerError(InnerQueuedSubscriber<R> innerQueuedSubscriber, Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            innerQueuedSubscriber.setDone();
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            drain();
        }

        @Override // io.reactivex.internal.subscribers.InnerQueuedSubscriberSupport
        public void innerNext(InnerQueuedSubscriber<R> innerQueuedSubscriber, R r10) {
            if (innerQueuedSubscriber.queue().offer(r10)) {
                drain();
                return;
            }
            innerQueuedSubscriber.cancel();
            innerError(innerQueuedSubscriber, new MissingBackpressureException());
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null Publisher");
                InnerQueuedSubscriber<R> innerQueuedSubscriber = new InnerQueuedSubscriber<>(this, this.prefetch);
                if (this.cancelled) {
                    return;
                }
                this.subscribers.offer(innerQueuedSubscriber);
                bVar.subscribe(innerQueuedSubscriber);
                if (this.cancelled) {
                    innerQueuedSubscriber.cancel();
                    drainAndCancel();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                int i10 = this.maxConcurrency;
                dVar.request(i10 == Integer.MAX_VALUE ? Long.MAX_VALUE : i10);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public FlowableConcatMapEager(Flowable<T> flowable, Function<? super T, ? extends b<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
        super(flowable);
        this.mapper = function;
        this.maxConcurrency = i10;
        this.prefetch = i11;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapEagerDelayErrorSubscriber(cVar, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
