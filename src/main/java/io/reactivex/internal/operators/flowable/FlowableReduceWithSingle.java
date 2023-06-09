package io.reactivex.internal.operators.flowable;

import df.b;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class FlowableReduceWithSingle<T, R> extends Single<R> {
    public final BiFunction<R, ? super T, R> reducer;
    public final Callable<R> seedSupplier;
    public final b<T> source;

    public FlowableReduceWithSingle(b<T> bVar, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.source = bVar;
        this.seedSupplier = callable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        try {
            this.source.subscribe(new FlowableReduceSeedSingle.ReduceSeedObserver(singleObserver, this.reducer, ObjectHelper.requireNonNull(this.seedSupplier.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptyDisposable.error(th, singleObserver);
        }
    }
}
