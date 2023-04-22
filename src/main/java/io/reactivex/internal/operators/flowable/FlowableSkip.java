package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* loaded from: classes2.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {
    public final long n;

    /* loaded from: classes2.dex */
    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, d {
        public final c<? super T> downstream;
        public long remaining;
        public d upstream;

        public SkipSubscriber(c<? super T> cVar, long j10) {
            this.downstream = cVar;
            this.remaining = j10;
        }

        @Override // df.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            long j10 = this.remaining;
            if (j10 != 0) {
                this.remaining = j10 - 1;
            } else {
                this.downstream.onNext(t2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                long j10 = this.remaining;
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(j10);
            }
        }

        @Override // df.d
        public void request(long j10) {
            this.upstream.request(j10);
        }
    }

    public FlowableSkip(Flowable<T> flowable, long j10) {
        super(flowable);
        this.n = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipSubscriber(cVar, this.n));
    }
}
