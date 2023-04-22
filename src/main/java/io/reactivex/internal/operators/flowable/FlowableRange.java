package io.reactivex.internal.operators.flowable;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;

/* loaded from: classes2.dex */
public final class FlowableRange extends Flowable<Integer> {
    public final int end;
    public final int start;

    /* loaded from: classes2.dex */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public final int end;
        public int index;

        public BaseRangeSubscription(int i10, int i11) {
            this.index = i10;
            this.end = i11;
        }

        @Override // io.reactivex.internal.subscriptions.BasicQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public final void cancel() {
            this.cancelled = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.index = this.end;
        }

        public abstract void fastPath();

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final Integer poll() {
            int i10 = this.index;
            if (i10 == this.end) {
                return null;
            }
            this.index = i10 + 1;
            return Integer.valueOf(i10);
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

    /* loaded from: classes2.dex */
    public static final class RangeConditionalSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        public final ConditionalSubscriber<? super Integer> downstream;

        public RangeConditionalSubscription(ConditionalSubscriber<? super Integer> conditionalSubscriber, int i10, int i11) {
            super(i10, i11);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i10 = this.end;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            for (int i11 = this.index; i11 != i10; i11++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Integer.valueOf(i11));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void slowPath(long j10) {
            int i10 = this.end;
            int i11 = this.index;
            ConditionalSubscriber<? super Integer> conditionalSubscriber = this.downstream;
            do {
                long j11 = 0;
                do {
                    while (j11 != j10 && i11 != i10) {
                        if (this.cancelled) {
                            return;
                        }
                        if (conditionalSubscriber.tryOnNext(Integer.valueOf(i11))) {
                            j11++;
                        }
                        i11++;
                    }
                    if (i11 == i10) {
                        if (!this.cancelled) {
                            conditionalSubscriber.onComplete();
                        }
                        return;
                    }
                    j10 = get();
                } while (j11 != j10);
                this.index = i11;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        public final c<? super Integer> downstream;

        public RangeSubscription(c<? super Integer> cVar, int i10, int i11) {
            super(i10, i11);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void fastPath() {
            int i10 = this.end;
            c<? super Integer> cVar = this.downstream;
            for (int i11 = this.index; i11 != i10; i11++) {
                if (this.cancelled) {
                    return;
                }
                cVar.onNext(Integer.valueOf(i11));
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        public void slowPath(long j10) {
            int i10 = this.end;
            int i11 = this.index;
            c<? super Integer> cVar = this.downstream;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i11 == i10) {
                        if (i11 == i10) {
                            if (!this.cancelled) {
                                cVar.onComplete();
                            }
                            return;
                        }
                        j10 = get();
                        if (j11 == j10) {
                            this.index = i11;
                            j10 = addAndGet(-j11);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        cVar.onNext(Integer.valueOf(i11));
                        j11++;
                        i11++;
                    }
                }
            } while (j10 != 0);
        }
    }

    public FlowableRange(int i10, int i11) {
        this.start = i10;
        this.end = i10 + i11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Integer> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) cVar, this.start, this.end));
        } else {
            cVar.onSubscribe(new RangeSubscription(cVar, this.start, this.end));
        }
    }
}
