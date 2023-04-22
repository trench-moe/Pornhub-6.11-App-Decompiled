package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposables;

/* loaded from: classes2.dex */
public final class SingleJust<T> extends Single<T> {
    public final T value;

    public SingleJust(T t2) {
        this.value = t2;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(Disposables.disposed());
        singleObserver.onSuccess((T) this.value);
    }
}
