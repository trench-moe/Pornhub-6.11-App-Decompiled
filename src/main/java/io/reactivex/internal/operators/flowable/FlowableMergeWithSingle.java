package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    public final SingleSource<? extends T> other;

    /* loaded from: classes2.dex */
    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        public static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        public static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        public volatile boolean cancelled;
        public int consumed;
        public final c<? super T> downstream;
        public long emitted;
        public final int limit;
        public volatile boolean mainDone;
        public volatile int otherState;
        public final int prefetch;
        public volatile SimplePlainQueue<T> queue;
        public T singleItem;
        public final AtomicReference<d> mainSubscription = new AtomicReference<>();
        public final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        public final AtomicThrowable error = new AtomicThrowable();
        public final AtomicLong requested = new AtomicLong();

        /* loaded from: classes2.dex */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            public final MergeWithObserver<T> parent;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t2) {
                this.parent.otherSuccess(t2);
            }
        }

        public MergeWithObserver(c<? super T> cVar) {
            this.downstream = cVar;
            int bufferSize = Flowable.bufferSize();
            this.prefetch = bufferSize;
            this.limit = bufferSize - (bufferSize >> 2);
        }

        @Override // df.d
        public void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            int i10;
            c<? super T> cVar = this.downstream;
            long j10 = this.emitted;
            int i11 = this.consumed;
            int i12 = this.limit;
            int i13 = 1;
            int i14 = 1;
            while (true) {
                long j11 = this.requested.get();
                while (true) {
                    i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                    if (i10 == 0) {
                        break;
                    } else if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    } else if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    } else {
                        int i15 = this.otherState;
                        if (i15 == i13) {
                            this.singleItem = null;
                            this.otherState = 2;
                            cVar.onNext((T) this.singleItem);
                            j10++;
                        } else {
                            boolean z10 = this.mainDone;
                            SimplePlainQueue<T> simplePlainQueue = this.queue;
                            T poll = simplePlainQueue != null ? simplePlainQueue.poll() : (Object) null;
                            boolean z11 = poll == null;
                            if (z10 && z11 && i15 == 2) {
                                this.queue = null;
                                cVar.onComplete();
                                return;
                            } else if (z11) {
                                break;
                            } else {
                                cVar.onNext(poll);
                                j10++;
                                i11++;
                                if (i11 == i12) {
                                    this.mainSubscription.get().request(i12);
                                    i11 = 0;
                                }
                                i13 = 1;
                            }
                        }
                    }
                }
                if (i10 == 0) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    } else if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    } else {
                        boolean z12 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                        boolean z13 = simplePlainQueue2 == null || simplePlainQueue2.isEmpty();
                        if (z12 && z13 && this.otherState == 2) {
                            this.queue = null;
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j10;
                this.consumed = i11;
                i14 = addAndGet(-i14);
                if (i14 == 0) {
                    return;
                }
                i13 = 1;
            }
        }

        public SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                simplePlainQueue = new SpscArrayQueue<>(Flowable.bufferSize());
                this.queue = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            DisposableHelper.dispose(this.otherObserver);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (compareAndSet(0, 1)) {
                long j10 = this.emitted;
                if (this.requested.get() != j10) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue != null && !simplePlainQueue.isEmpty()) {
                        simplePlainQueue.offer(t2);
                    }
                    this.emitted = j10 + 1;
                    this.downstream.onNext(t2);
                    int i10 = this.consumed + 1;
                    if (i10 == this.limit) {
                        this.consumed = 0;
                        this.mainSubscription.get().request(i10);
                    } else {
                        this.consumed = i10;
                    }
                } else {
                    getOrCreateQueue().offer(t2);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t2);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this.mainSubscription, dVar, this.prefetch);
        }

        public void otherError(Throwable th) {
            if (!this.error.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            SubscriptionHelper.cancel(this.mainSubscription);
            drain();
        }

        public void otherSuccess(T t2) {
            if (compareAndSet(0, 1)) {
                long j10 = this.emitted;
                if (this.requested.get() != j10) {
                    this.emitted = j10 + 1;
                    this.downstream.onNext(t2);
                    this.otherState = 2;
                    drainLoop();
                }
                this.singleItem = t2;
                this.otherState = 1;
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                this.singleItem = t2;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // df.d
        public void request(long j10) {
            BackpressureHelper.add(this.requested, j10);
            drain();
        }
    }

    public FlowableMergeWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.other = singleSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(cVar);
        cVar.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
