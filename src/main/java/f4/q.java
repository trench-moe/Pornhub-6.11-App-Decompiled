package f4;

import android.os.Bundle;
import c4.h;
import com.app.pornhub.R;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.i1;
import x2.y;

/* loaded from: classes.dex */
public class q extends d4.a implements h.a {
    public static final /* synthetic */ int E0 = 0;
    public f3.o A0;
    public String B0;
    public c4.h C0;
    public CompositeDisposable D0;

    /* renamed from: z0  reason: collision with root package name */
    public h3.a f9426z0;

    @Override // d4.a
    public void K0() {
        CompositeDisposable compositeDisposable = this.D0;
        h3.a aVar = this.f9426z0;
        String gifId = this.B0;
        int a10 = this.C0.a();
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Observable startWith = aVar.f10110a.b(gifId, 8, a10).toObservable().map(y.C).onErrorReturn(i1.A).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "gifsRepository.getRelate…th(UseCaseResult.Loading)");
        compositeDisposable.add(startWith.subscribe(new x2.a(this, 7)));
    }

    @Override // d4.a
    public c4.a L0() {
        return this.C0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_gifs);
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.C0 = new c4.i(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.B0 = this.f2019u.getString("gif_id");
        this.D0 = new CompositeDisposable();
    }

    @Override // d4.a
    public void W0() {
        t3.a.x(q(), "Gif", "GifDetailRelated");
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        CompositeDisposable compositeDisposable = this.D0;
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }

    @Override // c4.h.a
    public void h(String str) {
        I0(GifDetailsActivity.D(q(), str));
    }
}
