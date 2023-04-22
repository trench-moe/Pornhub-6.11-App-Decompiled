package io.reactivex.internal.operators.single;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {
    public final Function<? super T, ? extends Iterable<? extends R>> mapper;
    public final SingleSource<T> source;

    /* loaded from: classes2.dex */
    public static final class FlatMapIterableObserver<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        public volatile boolean cancelled;
        public final c<? super R> downstream;
        public volatile Iterator<? extends R> it;
        public final Function<? super T, ? extends Iterable<? extends R>> mapper;
        public boolean outputFused;
        public final AtomicLong requested = new AtomicLong();
        public Disposable upstream;

        public FlatMapIterableObserver(c<? super R> cVar, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.downstream = cVar;
            this.mapper = function;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.it = null;
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            c<? super R> cVar = this.downstream;
            Iterator<? extends R> it = this.it;
            if (this.outputFused && it != null) {
                cVar.onNext(null);
                cVar.onComplete();
                return;
            }
            int i10 = 1;
            while (true) {
                while (true) {
                    if (it != null) {
                        long j10 = this.requested.get();
                        if (j10 == Long.MAX_VALUE) {
                            slowPath(cVar, it);
                            return;
                        }
                        long j11 = 0;
                        while (j11 != j10) {
                            if (this.cancelled) {
                                return;
                            }
                            try {
                                cVar.onNext((Object) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                                if (this.cancelled) {
                                    return;
                                }
                                j11++;
                                try {
                                    if (!it.hasNext()) {
                                        cVar.onComplete();
                                        return;
                                    }
                                } catch (Throwable th) {
                                    Exceptions.throwIfFatal(th);
                                    cVar.onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                cVar.onError(th2);
                                return;
                            }
                        }
                        if (j11 != 0) {
                            BackpressureHelper.produced(this.requested, j11);
                        }
                    }
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                    if (it == null) {
                        it = this.it;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.it == null;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t2) {
            try {
                Iterator<? extends R> it = this.mapper.apply(t2).iterator();
                if (!it.hasNext()) {
                    this.downstream.onComplete();
                    return;
                }
                this.it = it;
                drain();
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public R poll() {
            Iterator<? extends R> it = this.it;
            if (it != null) {
                R r10 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
                if (!it.hasNext()) {
                    this.it = null;
                }
                return r10;
            }
            return null;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }

        public void slowPath(c<? super R> cVar, Iterator<? extends R> it) {
            while (!this.cancelled) {
                try {
                    cVar.onNext((R) it.next());
                    if (this.cancelled) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            cVar.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        cVar.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    cVar.onError(th2);
                    return;
                }
            }
        }
    }

    public SingleFlatMapIterableFlowable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.source = singleSource;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new FlatMapIterableObserver(cVar, this.mapper));
    }
}
