package io.reactivex.internal.operators.flowable;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class FlowableReduce<T> extends AbstractFlowableWithUpstream<T, T> {
    public final BiFunction<T, T, T> reducer;

    /* loaded from: classes2.dex */
    public static final class ReduceSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4663883003264602070L;
        public final BiFunction<T, T, T> reducer;
        public d upstream;

        public ReduceSubscriber(c<? super T> cVar, BiFunction<T, T, T> biFunction) {
            super(cVar);
            this.reducer = biFunction;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            d dVar = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar == subscriptionHelper) {
                return;
            }
            this.upstream = subscriptionHelper;
            T t2 = this.value;
            if (t2 != null) {
                complete(t2);
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            d dVar = this.upstream;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar == subscriptionHelper) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.upstream = subscriptionHelper;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.upstream == SubscriptionHelper.CANCELLED) {
                return;
            }
            T t8 = this.value;
            if (t8 == null) {
                this.value = t2;
                return;
            }
            try {
                this.value = (T) ObjectHelper.requireNonNull(this.reducer.apply(t8, t2), "The reducer returned a null value");
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
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

    public FlowableReduce(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        super(flowable);
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((FlowableSubscriber) new ReduceSubscriber(cVar, this.reducer));
    }
}
