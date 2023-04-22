package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;

/* loaded from: classes2.dex */
public final class FlowableConcatMapEagerPublisher<T, R> extends Flowable<R> {
    public final ErrorMode errorMode;
    public final Function<? super T, ? extends b<? extends R>> mapper;
    public final int maxConcurrency;
    public final int prefetch;
    public final b<T> source;

    public FlowableConcatMapEagerPublisher(b<T> bVar, Function<? super T, ? extends b<? extends R>> function, int i10, int i11, ErrorMode errorMode) {
        this.source = bVar;
        this.mapper = function;
        this.maxConcurrency = i10;
        this.prefetch = i11;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        this.source.subscribe(new FlowableConcatMapEager.ConcatMapEagerDelayErrorSubscriber(cVar, this.mapper, this.maxConcurrency, this.prefetch, this.errorMode));
    }
}
