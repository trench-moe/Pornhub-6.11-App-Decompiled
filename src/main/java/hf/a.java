package hf;

import gf.t;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import retrofit2.adapter.rxjava2.HttpException;

/* loaded from: classes2.dex */
public final class a<T> extends Observable<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Observable<t<T>> f10430c;

    /* renamed from: hf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0151a<R> implements Observer<t<R>> {

        /* renamed from: c  reason: collision with root package name */
        public final Observer<? super R> f10431c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10432f;

        public C0151a(Observer<? super R> observer) {
            this.f10431c = observer;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f10432f) {
                return;
            }
            this.f10431c.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.f10432f) {
                this.f10431c.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            RxJavaPlugins.onError(assertionError);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            t tVar = (t) obj;
            if (tVar.a()) {
                this.f10431c.onNext((T) tVar.f10077b);
                return;
            }
            this.f10432f = true;
            HttpException httpException = new HttpException(tVar);
            try {
                this.f10431c.onError(httpException);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                RxJavaPlugins.onError(new CompositeException(httpException, th));
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f10431c.onSubscribe(disposable);
        }
    }

    public a(Observable<t<T>> observable) {
        this.f10430c = observable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f10430c.subscribe(new C0151a(observer));
    }
}
