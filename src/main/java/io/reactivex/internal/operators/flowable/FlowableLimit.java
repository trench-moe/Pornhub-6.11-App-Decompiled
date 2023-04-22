package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long n;

    /* loaded from: classes2.dex */
    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 2288246011222124525L;
        public final c<? super T> downstream;
        public long remaining;
        public d upstream;

        public LimitSubscriber(c<? super T> cVar, long j10) {
            this.downstream = cVar;
            this.remaining = j10;
            lazySet(j10);
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.remaining <= 0) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.remaining = 0L;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            long j10 = this.remaining;
            if (j10 > 0) {
                long j11 = j10 - 1;
                this.remaining = j11;
                this.downstream.onNext(t2);
                if (j11 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                if (this.remaining == 0) {
                    dVar.cancel();
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // df.d
        public void request(long j10) {
            long j11;
            long j12;
            if (SubscriptionHelper.validate(j10)) {
                do {
                    j11 = get();
                    if (j11 == 0) {
                        return;
                    }
                    j12 = j11 <= j10 ? j11 : j10;
                } while (!compareAndSet(j11, j11 - j12));
                this.upstream.request(j12);
            }
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j10) {
        super(flowable);
        this.n = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(cVar, this.n));
    }
}
