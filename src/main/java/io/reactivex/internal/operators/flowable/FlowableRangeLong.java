package io.reactivex.internal.operators.flowable;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;

/* loaded from: classes2.dex */
public final class FlowableRangeLong extends Flowable<Long> {
    public final long end;
    public final long start;

    /* loaded from: classes2.dex */
    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Long> {
        private static final long serialVersionUID = -2252972430506210021L;
        public volatile boolean cancelled;
        public final long end;
        public long index;

        public BaseRangeSubscription(long j10, long j11) {
            this.index = j10;
            this.end = j11;
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
        public final Long poll() {
            long j10 = this.index;
            if (j10 == this.end) {
                return null;
            }
            this.index = 1 + j10;
            return Long.valueOf(j10);
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
        public final ConditionalSubscriber<? super Long> downstream;

        public RangeConditionalSubscription(ConditionalSubscriber<? super Long> conditionalSubscriber, long j10, long j11) {
            super(j10, j11);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void fastPath() {
            long j10 = this.end;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            for (long j11 = this.index; j11 != j10; j11++) {
                if (this.cancelled) {
                    return;
                }
                conditionalSubscriber.tryOnNext(Long.valueOf(j11));
            }
            if (this.cancelled) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void slowPath(long j10) {
            long j11 = this.end;
            long j12 = this.index;
            ConditionalSubscriber<? super Long> conditionalSubscriber = this.downstream;
            do {
                long j13 = 0;
                while (true) {
                    if (j13 == j10 || j12 == j11) {
                        if (j12 == j11) {
                            if (this.cancelled) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                        j10 = get();
                        if (j13 == j10) {
                            this.index = j12;
                            j10 = addAndGet(-j13);
                        }
                    } else if (this.cancelled) {
                        return;
                    } else {
                        if (conditionalSubscriber.tryOnNext(Long.valueOf(j12))) {
                            j13++;
                        }
                        j12++;
                    }
                }
            } while (j10 != 0);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RangeSubscription extends BaseRangeSubscription {
        private static final long serialVersionUID = 2587302975077663557L;
        public final c<? super Long> downstream;

        public RangeSubscription(c<? super Long> cVar, long j10, long j11) {
            super(j10, j11);
            this.downstream = cVar;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void fastPath() {
            long j10 = this.end;
            c<? super Long> cVar = this.downstream;
            for (long j11 = this.index; j11 != j10; j11++) {
                if (this.cancelled) {
                    return;
                }
                cVar.onNext(Long.valueOf(j11));
            }
            if (this.cancelled) {
                return;
            }
            cVar.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRangeLong.BaseRangeSubscription
        public void slowPath(long j10) {
            long j11 = this.end;
            long j12 = this.index;
            c<? super Long> cVar = this.downstream;
            do {
                long j13 = 0;
                do {
                    while (j13 != j10 && j12 != j11) {
                        if (this.cancelled) {
                            return;
                        }
                        cVar.onNext(Long.valueOf(j12));
                        j13++;
                        j12++;
                    }
                    if (j12 == j11) {
                        if (!this.cancelled) {
                            cVar.onComplete();
                        }
                        return;
                    }
                    j10 = get();
                } while (j13 != j10);
                this.index = j12;
                j10 = addAndGet(-j13);
            } while (j10 != 0);
        }
    }

    public FlowableRangeLong(long j10, long j11) {
        this.start = j10;
        this.end = j10 + j11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Long> cVar) {
        if (cVar instanceof ConditionalSubscriber) {
            cVar.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) cVar, this.start, this.end));
        } else {
            cVar.onSubscribe(new RangeSubscription(cVar, this.start, this.end));
        }
    }
}
