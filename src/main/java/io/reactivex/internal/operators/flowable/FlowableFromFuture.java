package io.reactivex.internal.operators.flowable;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class FlowableFromFuture<T> extends Flowable<T> {
    public final Future<? extends T> future;
    public final long timeout;
    public final TimeUnit unit;

    public FlowableFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.future = future;
        this.timeout = j10;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(cVar);
        cVar.onSubscribe(deferredScalarSubscription);
        try {
            TimeUnit timeUnit = this.unit;
            T t2 = timeUnit != null ? this.future.get(this.timeout, timeUnit) : this.future.get();
            if (t2 == null) {
                cVar.onError(new NullPointerException("The future returned null"));
            } else {
                deferredScalarSubscription.complete(t2);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            if (deferredScalarSubscription.isCancelled()) {
                return;
            }
            cVar.onError(th);
        }
    }
}
