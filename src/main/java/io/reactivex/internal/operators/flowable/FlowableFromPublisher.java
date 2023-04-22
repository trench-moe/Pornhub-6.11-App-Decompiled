package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;

/* loaded from: classes2.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    public final b<? extends T> publisher;

    public FlowableFromPublisher(b<? extends T> bVar) {
        this.publisher = bVar;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.publisher.subscribe(cVar);
    }
}
