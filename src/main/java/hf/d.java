package hf;

import gf.t;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d<T> extends Observable<c> {

    /* renamed from: c  reason: collision with root package name */
    public final Observable<t<T>> f10438c;

    /* loaded from: classes2.dex */
    public static class a<R> implements Observer<t<R>> {

        /* renamed from: c  reason: collision with root package name */
        public final Observer<? super c> f10439c;

        public a(Observer<? super c> observer) {
            this.f10439c = observer;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f10439c.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            try {
                Observer<? super c> observer = this.f10439c;
                Objects.requireNonNull(th, "error == null");
                observer.onNext(new c((Object) null, th));
                this.f10439c.onComplete();
            } catch (Throwable th2) {
                try {
                    this.f10439c.onError(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    RxJavaPlugins.onError(new CompositeException(th2, th3));
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            t tVar = (t) obj;
            Observer<? super c> observer = this.f10439c;
            Objects.requireNonNull(tVar, "response == null");
            observer.onNext(new c(tVar, (Object) null));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f10439c.onSubscribe(disposable);
        }
    }

    public d(Observable<t<T>> observable) {
        this.f10438c = observable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super c> observer) {
        this.f10438c.subscribe(new a(observer));
    }
}
