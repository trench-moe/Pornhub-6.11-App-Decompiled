package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class FlowableDefer<T> extends Flowable<T> {
    public final Callable<? extends b<? extends T>> supplier;

    public FlowableDefer(Callable<? extends b<? extends T>> callable) {
        this.supplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        try {
            ((b) ObjectHelper.requireNonNull(this.supplier.call(), "The publisher supplied is null")).subscribe(cVar);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
