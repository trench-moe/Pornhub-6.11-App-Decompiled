package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* loaded from: classes2.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    public final int bufferSize;
    public final boolean delayErrors;
    public final Function<? super T, ? extends b<? extends U>> mapper;
    public final int maxConcurrency;
    public final b<T> source;

    public FlowableFlatMapPublisher(b<T> bVar, Function<? super T, ? extends b<? extends U>> function, boolean z10, int i10, int i11) {
        this.source = bVar;
        this.mapper = function;
        this.delayErrors = z10;
        this.maxConcurrency = i10;
        this.bufferSize = i11;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super U> cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
