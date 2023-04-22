package hf;

import gf.t;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes2.dex */
public final class b<T> extends Observable<t<T>> {

    /* renamed from: c  reason: collision with root package name */
    public final gf.b<T> f10433c;

    /* loaded from: classes2.dex */
    public static final class a implements Disposable {

        /* renamed from: c  reason: collision with root package name */
        public final gf.b<?> f10434c;

        /* renamed from: f  reason: collision with root package name */
        public volatile boolean f10435f;

        public a(gf.b<?> bVar) {
            this.f10434c = bVar;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f10435f = true;
            this.f10434c.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f10435f;
        }
    }

    public b(gf.b<T> bVar) {
        this.f10433c = bVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super t<T>> observer) {
        boolean z10;
        gf.b<T> S = this.f10433c.S();
        a aVar = new a(S);
        observer.onSubscribe(aVar);
        if (aVar.f10435f) {
            return;
        }
        try {
            t<T> e10 = S.e();
            if (!aVar.f10435f) {
                observer.onNext(e10);
            }
            if (aVar.f10435f) {
                return;
            }
            try {
                observer.onComplete();
            } catch (Throwable th) {
                th = th;
                z10 = true;
                Exceptions.throwIfFatal(th);
                if (z10) {
                    RxJavaPlugins.onError(th);
                } else if (aVar.f10435f) {
                } else {
                    try {
                        observer.onError(th);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(new CompositeException(th, th2));
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = false;
        }
    }
}
