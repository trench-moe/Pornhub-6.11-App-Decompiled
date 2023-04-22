package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;

/* loaded from: classes2.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    public final Function<? super T, ? extends U> mapper;
    public final b<T> source;

    public FlowableMapPublisher(b<T> bVar, Function<? super T, ? extends U> function) {
        this.source = bVar;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super U> cVar) {
        this.source.subscribe(new FlowableMap.MapSubscriber(cVar, this.mapper));
    }
}
