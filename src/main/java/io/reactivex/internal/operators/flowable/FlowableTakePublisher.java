package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;

/* loaded from: classes2.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    public final long limit;
    public final b<T> source;

    public FlowableTakePublisher(b<T> bVar, long j10) {
        this.source = bVar;
        this.limit = j10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(cVar, this.limit));
    }
}
