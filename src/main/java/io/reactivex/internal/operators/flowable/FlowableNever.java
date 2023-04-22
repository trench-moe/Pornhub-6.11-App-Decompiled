package io.reactivex.internal.operators.flowable;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.EmptySubscription;

/* loaded from: classes2.dex */
public final class FlowableNever extends Flowable<Object> {
    public static final Flowable<Object> INSTANCE = new FlowableNever();

    private FlowableNever() {
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super Object> cVar) {
        cVar.onSubscribe(EmptySubscription.INSTANCE);
    }
}
