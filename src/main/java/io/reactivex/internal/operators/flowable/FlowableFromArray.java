package io.reactivex.internal.operators.flowable;

import a0.a;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;

/* loaded from: classes2.dex */
public final class FlowableFromArray<T> extends Flowable<T> {
    public final T[] array;

    /* loaded from: classes2.dex */
    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final ConditionalSubscriber<? super T> downstream;

        public ArrayConditionalSubscription(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            for (int i10 = this.index; i10 != length; i10++) {
                if (this.cancelled) {
                    return;
                }
                T t2 = tArr[i10];
                if (t2 == null) {
                    conditionalSubscriber.onError(new NullPointerException(a.k("The element at index ", i10, " is null")));
                    return;
                }
                conditionalSubscriber.tryOnNext(t2);
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void slowPath(long j10) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i10 = this.index;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.downstream;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                        j10 = get();
                        if (j11 == j10) {
                            this.index = i10;
                            j10 = addAndGet(-j11);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        T t2 = tArr[i10];
                        if (t2 == null) {
                            conditionalSubscriber.onError(new NullPointerException(a.k("The element at index ", i10, " is null")));
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(t2)) {
                            j11++;
                        }
                        i10++;
                    }
                }
            } while (j10 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {
        private static final long serialVersionUID = 2587302975077663557L;
        public final c<? super T> downstream;

        public ArraySubscription(c<? super T> cVar, T[] tArr) {
            super(tArr);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void fastPath() {
            T[] tArr = this.array;
            int length = tArr.length;
            c<? super T> cVar = this.downstream;
            for (int i10 = this.index; i10 != length; i10++) {
                if (this.cancelled) {
                    return;
                }
                T t2 = tArr[i10];
                if (t2 == null) {
                    cVar.onError(new NullPointerException(a.k("The element at index ", i10, " is null")));
                    return;
                }
                cVar.onNext(t2);
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        public void slowPath(long j10) {
            T[] tArr = this.array;
            int length = tArr.length;
            int i10 = this.index;
            c<? super T> cVar = this.downstream;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.cancelled) {
                                return;
                            }
                            cVar.onComplete();
                            return;
                        }
                        j10 = get();
                        if (j11 == j10) {
                            this.index = i10;
                            j10 = addAndGet(-j11);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        T t2 = tArr[i10];
                        if (t2 == null) {
                            cVar.onError(new NullPointerException(a.k("The element at index ", i10, " is null")));
                            return;
                        }
                        cVar.onNext(t2);
                        j11++;
                        i10++;
                    }
                }
            } while (j10 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {
        private static final long serialVersionUID = -2252972430506210021L;
        public final T[] array;
        public volatile boolean cancelled;
        public int index;

        public BaseArraySubscription(T[] tArr) {
            this.array = tArr;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.array.length;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i10 = this.index;
            T[] tArr = this.array;
            if (i10 == tArr.length) {
                return null;
            }
            this.index = i10 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i10], "array element is null");
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    fastPath();
                } else {
                    slowPath(j10);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 1;
        }

        public abstract void slowPath(long j10);
    }

    public FlowableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) cVar, this.array));
        } else {
            cVar.onSubscribe(new ArraySubscription(cVar, this.array));
        }
    }
}
