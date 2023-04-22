package vc;

import io.reactivex.Observable;
import io.reactivex.Observer;

/* loaded from: classes2.dex */
public abstract class a<T> extends Observable<T> {
    public abstract T a();

    public abstract void b(Observer<? super T> observer);

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        b(observer);
        observer.onNext(a());
    }
}
