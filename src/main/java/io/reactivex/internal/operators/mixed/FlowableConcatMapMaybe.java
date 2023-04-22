package io.reactivex.internal.operators.mixed;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableConcatMapMaybe<T, R> extends Flowable<R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
    public final int prefetch;
    public final Flowable<T> source;

    /* loaded from: classes2.dex */
    public static final class ConcatMapMaybeSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, d {
        public static final int STATE_ACTIVE = 1;
        public static final int STATE_INACTIVE = 0;
        public static final int STATE_RESULT_VALUE = 2;
        private static final long serialVersionUID = -9140123220065488293L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public final c<? super R> downstream;
        public long emitted;
        public final ErrorMode errorMode;
        public R item;
        public final Function<? super T, ? extends MaybeSource<? extends R>> mapper;
        public final int prefetch;
        public final SimplePlainQueue<T> queue;
        public volatile int state;
        public d upstream;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final ConcatMapMaybeObserver<R> inner = new ConcatMapMaybeObserver<>(this);

        /* loaded from: classes2.dex */
        public static final class ConcatMapMaybeObserver<R> extends AtomicReference<Disposable> implements MaybeObserver<R> {
            private static final long serialVersionUID = -3051469169682093892L;
            public final ConcatMapMaybeSubscriber<?, R> parent;

            public ConcatMapMaybeObserver(ConcatMapMaybeSubscriber<?, R> concatMapMaybeSubscriber) {
                this.parent = concatMapMaybeSubscriber;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(Throwable th) {
                this.parent.innerError(th);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.replace(this, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(R r10) {
                this.parent.innerSuccess(r10);
            }
        }

        public ConcatMapMaybeSubscriber(c<? super R> cVar, Function<? super T, ? extends MaybeSource<? extends R>> function, int i10, ErrorMode errorMode) {
            this.downstream = cVar;
            this.mapper = function;
            this.prefetch = i10;
            this.errorMode = errorMode;
            this.queue = new SpscArrayQueue(i10);
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
                this.item = null;
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            c<? super R> cVar = this.downstream;
            ErrorMode errorMode = this.errorMode;
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            AtomicLong atomicLong = this.requested;
            int i10 = this.prefetch;
            int i11 = i10 - (i10 >> 1);
            int i12 = 1;
            while (true) {
                if (this.cancelled) {
                    simplePlainQueue.clear();
                    this.item = null;
                } else {
                    int i13 = this.state;
                    if (atomicThrowable.get() == null || (errorMode != ErrorMode.IMMEDIATE && (errorMode != ErrorMode.BOUNDARY || i13 != 0))) {
                        if (i13 == 0) {
                            boolean z10 = this.done;
                            T poll = simplePlainQueue.poll();
                            boolean z11 = poll == null;
                            if (z10 && z11) {
                                Throwable terminate = atomicThrowable.terminate();
                                if (terminate == null) {
                                    cVar.onComplete();
                                    return;
                                } else {
                                    cVar.onError(terminate);
                                    return;
                                }
                            } else if (!z11) {
                                int i14 = this.consumed + 1;
                                if (i14 == i11) {
                                    this.consumed = 0;
                                    this.upstream.request(i11);
                                } else {
                                    this.consumed = i14;
                                }
                                try {
                                    MaybeSource maybeSource = (MaybeSource) ObjectHelper.requireNonNull(this.mapper.apply(poll), "The mapper returned a null MaybeSource");
                                    this.state = 1;
                                    maybeSource.subscribe(this.inner);
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    this.upstream.cancel();
                                    simplePlainQueue.clear();
                                    atomicThrowable.addThrowable(th);
                                    cVar.onError(atomicThrowable.terminate());
                                    return;
                                }
                            }
                        } else if (i13 == 2) {
                            long j10 = this.emitted;
                            if (j10 != atomicLong.get()) {
                                this.item = null;
                                cVar.onNext((R) this.item);
                                this.emitted = j10 + 1;
                                this.state = 0;
                            }
                        }
                    }
                }
                i12 = addAndGet(-i12);
                if (i12 == 0) {
                    return;
                }
            }
            simplePlainQueue.clear();
            this.item = null;
            cVar.onError(atomicThrowable.terminate());
        }

        public void innerComplete() {
            this.state = 0;
            drain();
        }

        public void innerError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errorMode != ErrorMode.END) {
                this.upstream.cancel();
            }
            this.state = 0;
            drain();
        }

        public void innerSuccess(R r10) {
            this.item = r10;
            this.state = 2;
            drain();
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
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                this.inner.dispose();
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.queue.offer(t2)) {
                drain();
                return;
            }
            this.upstream.cancel();
            onError(new MissingBackpressureException("queue full?!"));
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        @Override // df.d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
            drain();
        }
    }

    public FlowableConcatMapMaybe(Flowable<T> flowable, Function<? super T, ? extends MaybeSource<? extends R>> function, ErrorMode errorMode, int i10) {
        this.source = flowable;
        this.mapper = function;
        this.errorMode = errorMode;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe((FlowableSubscriber) new ConcatMapMaybeSubscriber(cVar, this.mapper, this.prefetch, this.errorMode));
    }
}
