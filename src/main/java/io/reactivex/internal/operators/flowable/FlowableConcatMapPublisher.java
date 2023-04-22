package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

/* loaded from: classes2.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final int prefetch;
    public final b<T> source;

    public FlowableConcatMapPublisher(b<T> bVar, Function<? super T, ? extends b<? extends R>> function, int i10, ErrorMode errorMode) {
        this.source = bVar;
        this.mapper = function;
        this.prefetch = i10;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(cVar, this.mapper, this.prefetch, this.errorMode));
    }
}
