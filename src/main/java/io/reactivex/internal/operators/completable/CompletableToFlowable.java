package io.reactivex.internal.operators.completable;

import df.c;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;

/* loaded from: classes2.dex */
public final class CompletableToFlowable<T> extends Flowable<T> {
    public final CompletableSource source;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.source = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe(new SubscriberCompletableObserver(cVar));
    }
}
