package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableSequenceEqual<T> extends Flowable<Boolean> {
    public final BiPredicate<? super T, ? super T> comparer;
    public final b<? extends T> first;
    public final int prefetch;
    public final b<? extends T> second;

    /* loaded from: classes2.dex */
    public static final class EqualCoordinator<T> extends DeferredScalarSubscription<Boolean> implements EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        public final BiPredicate<? super T, ? super T> comparer;
        public final AtomicThrowable error;
        public final EqualSubscriber<T> first;
        public final EqualSubscriber<T> second;

        /* renamed from: v1  reason: collision with root package name */
        public T f10745v1;
        public T v2;
        public final AtomicInteger wip;

        public EqualCoordinator(c<? super Boolean> cVar, int i10, BiPredicate<? super T, ? super T> biPredicate) {
            super(cVar);
            this.comparer = biPredicate;
            this.wip = new AtomicInteger();
            this.first = new EqualSubscriber<>(this, i10);
            this.second = new EqualSubscriber<>(this, i10);
            this.error = new AtomicThrowable();
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            super.cancel();
            this.first.cancel();
            this.second.cancel();
            if (this.wip.getAndIncrement() == 0) {
                this.first.clear();
                this.second.clear();
            }
        }

        public void cancelAndClear() {
            this.first.cancel();
            this.first.clear();
            this.second.cancel();
            this.second.clear();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            int i10 = 1;
            do {
                SimpleQueue<T> simpleQueue = this.first.queue;
                SimpleQueue<T> simpleQueue2 = this.second.queue;
                if (simpleQueue != null && simpleQueue2 != null) {
                    while (!isCancelled()) {
                        if (this.error.get() != null) {
                            cancelAndClear();
                            this.downstream.onError(this.error.terminate());
                            return;
                        }
                        boolean z10 = this.first.done;
                        T t2 = this.f10745v1;
                        if (t2 == null) {
                            try {
                                t2 = simpleQueue.poll();
                                this.f10745v1 = t2;
                            } catch (Throwable th) {
                                Exceptions.throwIfFatal(th);
                                cancelAndClear();
                                this.error.addThrowable(th);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z11 = t2 == null;
                        boolean z12 = this.second.done;
                        T t8 = this.v2;
                        if (t8 == null) {
                            try {
                                t8 = simpleQueue2.poll();
                                this.v2 = t8;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                cancelAndClear();
                                this.error.addThrowable(th2);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                        boolean z13 = t8 == null;
                        if (z10 && z12 && z11 && z13) {
                            complete(Boolean.TRUE);
                            return;
                        } else if (z10 && z12 && z11 != z13) {
                            cancelAndClear();
                            complete(Boolean.FALSE);
                            return;
                        } else if (!z11 && !z13) {
                            try {
                                if (!this.comparer.test(t2, t8)) {
                                    cancelAndClear();
                                    complete(Boolean.FALSE);
                                    return;
                                }
                                this.f10745v1 = null;
                                this.v2 = null;
                                this.first.request();
                                this.second.request();
                            } catch (Throwable th3) {
                                Exceptions.throwIfFatal(th3);
                                cancelAndClear();
                                this.error.addThrowable(th3);
                                this.downstream.onError(this.error.terminate());
                                return;
                            }
                        }
                    }
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (isCancelled()) {
                    this.first.clear();
                    this.second.clear();
                    return;
                } else if (this.error.get() != null) {
                    cancelAndClear();
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                i10 = this.wip.addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(Throwable th) {
            if (this.error.addThrowable(th)) {
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void subscribe(b<? extends T> bVar, b<? extends T> bVar2) {
            bVar.subscribe(this.first);
            bVar2.subscribe(this.second);
        }
    }

    /* loaded from: classes2.dex */
    public interface EqualCoordinatorHelper {
        void drain();

        void innerError(Throwable th);
    }

    /* loaded from: classes2.dex */
    public static final class EqualSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4804128302091633067L;
        public volatile boolean done;
        public final int limit;
        public final EqualCoordinatorHelper parent;
        public final int prefetch;
        public long produced;
        public volatile SimpleQueue<T> queue;
        public int sourceMode;

        public EqualSubscriber(EqualCoordinatorHelper equalCoordinatorHelper, int i10) {
            this.parent = equalCoordinatorHelper;
            this.limit = i10 - (i10 >> 2);
            this.prefetch = i10;
        }

        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        public void clear() {
            SimpleQueue<T> simpleQueue = this.queue;
            if (simpleQueue != null) {
                simpleQueue.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.sourceMode != 0 || this.queue.offer(t2)) {
                this.parent.drain();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(3);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                dVar.request(this.prefetch);
            }
        }

        public void request() {
            if (this.sourceMode != 1) {
                long j10 = this.produced + 1;
                if (j10 >= this.limit) {
                    this.produced = 0L;
                    get().request(j10);
                    return;
                }
                this.produced = j10;
            }
        }
    }

    public FlowableSequenceEqual(b<? extends T> bVar, b<? extends T> bVar2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        this.first = bVar;
        this.second = bVar2;
        this.comparer = biPredicate;
        this.prefetch = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Boolean> cVar) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(cVar, this.prefetch, this.comparer);
        cVar.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe(this.first, this.second);
    }
}
