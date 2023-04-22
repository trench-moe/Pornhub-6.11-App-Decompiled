package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;

/* loaded from: classes2.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    public final b<? extends T> other;

    /* loaded from: classes2.dex */
    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        public final c<? super T> downstream;
        public final b<? extends T> other;
        public boolean empty = true;
        public final SubscriptionArbiter arbiter = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(c<? super T> cVar, b<? extends T> bVar) {
            this.downstream = cVar;
            this.other = bVar;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (!this.empty) {
                this.downstream.onComplete();
                return;
            }
            this.empty = false;
            this.other.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t2);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            this.arbiter.setSubscription(dVar);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, b<? extends T> bVar) {
        super(flowable);
        this.other = bVar;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(cVar, this.other);
        cVar.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }
}
