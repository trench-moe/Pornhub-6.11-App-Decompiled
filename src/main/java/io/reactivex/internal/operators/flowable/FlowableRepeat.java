package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long count;

    /* loaded from: classes2.dex */
    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        public final c<? super T> downstream;
        public long produced;
        public long remaining;

        /* renamed from: sa  reason: collision with root package name */
        public final SubscriptionArbiter f10740sa;
        public final b<? extends T> source;

        public RepeatSubscriber(c<? super T> cVar, long j10, SubscriptionArbiter subscriptionArbiter, b<? extends T> bVar) {
            this.downstream = cVar;
            this.f10740sa = subscriptionArbiter;
            this.source = bVar;
            this.remaining = j10;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            long j10 = this.remaining;
            if (j10 != Long.MAX_VALUE) {
                this.remaining = j10 - 1;
            }
            if (j10 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.produced++;
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            this.f10740sa.setSubscription(dVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i10 = 1;
                while (!this.f10740sa.isCancelled()) {
                    long j10 = this.produced;
                    if (j10 != 0) {
                        this.produced = 0L;
                        this.f10740sa.produced(j10);
                    }
                    this.source.subscribe(this);
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                    }
                }
            }
        }
    }

    public FlowableRepeat(Flowable<T> flowable, long j10) {
        super(flowable);
        this.count = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        long j10 = this.count;
        new RepeatSubscriber(cVar, j10 != Long.MAX_VALUE ? j10 - 1 : Long.MAX_VALUE, subscriptionArbiter, this.source).subscribeNext();
    }
}
