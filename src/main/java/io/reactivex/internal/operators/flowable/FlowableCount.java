package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* loaded from: classes2.dex */
public final class FlowableCount<T> extends AbstractFlowableWithUpstream<T, Long> {

    /* loaded from: classes2.dex */
    public static final class CountSubscriber extends DeferredScalarSubscription<Long> implements FlowableSubscriber<Object> {
        private static final long serialVersionUID = 4973004223787171406L;
        public long count;
        public d upstream;

        public CountSubscriber(c<? super Long> cVar) {
            super(cVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            complete(Long.valueOf(this.count));
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(Object obj) {
            this.count++;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableCount(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Long> cVar) {
        this.source.subscribe((FlowableSubscriber) new CountSubscriber(cVar));
    }
}
