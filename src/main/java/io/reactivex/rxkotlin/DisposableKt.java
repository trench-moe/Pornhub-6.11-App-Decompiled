package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\u0002¨\u0006\u0007"}, d2 = {"addTo", "Lio/reactivex/disposables/Disposable;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "plusAssign", BuildConfig.FLAVOR, "disposable", "rxkotlin"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class DisposableKt {
    public static final Disposable addTo(Disposable disposable, CompositeDisposable compositeDisposable) {
        compositeDisposable.add(disposable);
        return disposable;
    }

    public static final void plusAssign(CompositeDisposable compositeDisposable, Disposable disposable) {
        compositeDisposable.add(disposable);
    }
}
