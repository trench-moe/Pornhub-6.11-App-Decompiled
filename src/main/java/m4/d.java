package m4;

import android.os.Bundle;
import android.view.View;
import b3.f;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.usecase.UseCaseResult;
import f3.m;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import m4.c;
import x2.a0;
import x2.g;
import x2.z;

/* loaded from: classes2.dex */
public class d extends d4.a implements c.b {
    public static final /* synthetic */ int F0 = 0;
    public m A0;
    public UserOrientation B0;
    public c C0;
    public CompositeDisposable D0;
    public Disposable E0;

    /* renamed from: z0  reason: collision with root package name */
    public d3.d f12900z0;

    @Override // d4.a
    public void K0() {
        d3.d dVar = this.f12900z0;
        Observable startWith = ((f) dVar.f8752f).a(DvdsConfig.DEFAULT_ORDER_PARAM, null, null, 16, this.C0.a()).toObservable().map(z.B).onErrorReturn(a0.B).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "source\n            .toOb…th(UseCaseResult.Loading)");
        this.E0 = startWith.subscribe(new g(this, 12));
    }

    @Override // d4.a
    public c4.a L0() {
        return this.C0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_dvds_to_display);
    }

    @Override // d4.a
    public int O0() {
        return 2;
    }

    @Override // d4.a
    public void P0() {
        this.C0 = new c(this);
    }

    @Override // d4.a
    public void W0() {
        t3.a.x(q(), "Home", "DVDs");
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        this.U = true;
        CompositeDisposable compositeDisposable = this.D0;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        Disposable disposable = this.E0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        CompositeDisposable compositeDisposable = this.D0;
        if (compositeDisposable != null) {
            if (compositeDisposable.isDisposed()) {
            }
        }
        CompositeDisposable compositeDisposable2 = new CompositeDisposable();
        this.D0 = compositeDisposable2;
        compositeDisposable2.add(this.A0.a(true).subscribe(new x2.b(this, 8)));
    }
}
