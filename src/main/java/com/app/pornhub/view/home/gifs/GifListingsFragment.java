package com.app.pornhub.view.home.gifs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import b4.f;
import c4.h;
import c4.i;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.gifs.GifListingsFragment;
import com.app.pornhub.view.home.topnav.TopNavigation;
import d4.a;
import f3.n;
import f3.o;
import g4.c;
import i4.g;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x2.b;
import x2.i1;
import x2.m;
import x2.y;

/* loaded from: classes.dex */
public class GifListingsFragment extends a implements h.a {
    public static final /* synthetic */ int P0 = 0;
    public o A0;
    public n B0;
    public NavigationViewModel C0;
    public HomeActivityViewModel D0;
    public UserSettings E0;
    public h F0;
    public h G0;
    public int H0;
    public Disposable I0;
    public CompositeDisposable J0;
    public GifsConfig.GifOrder K0;
    public FiltersConfig.Time L0;
    public GifsConfig.GifOrder M0;
    public FiltersConfig.Time N0;
    public String O0;

    /* renamed from: z0  reason: collision with root package name */
    public h3.a f5240z0;

    @Override // d4.a
    public void K0() {
        if (this.K0 == null) {
            return;
        }
        Disposable disposable = this.I0;
        if (disposable != null) {
            disposable.dispose();
        }
        String order = GifsConfig.Companion.getOrderAbbr(this.K0);
        String filterAbbr = FiltersConfig.Companion.getFilterAbbr(this.L0);
        h3.a aVar = this.f5240z0;
        int a10 = this.F0.a();
        String str = this.O0;
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter(order, "order");
        Observable startWith = aVar.f10110a.d(order, filterAbbr, 16, a10, str).toObservable().map(y.B).onErrorReturn(i1.f17750z).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "gifsRepository.getGifs(\n…th(UseCaseResult.Loading)");
        this.I0 = startWith.subscribe(new b(this, 10));
    }

    @Override // d4.a
    public c4.a L0() {
        return this.F0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_gifs_to_display);
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.F0 = new i(this);
        this.f8761q0 = true;
    }

    @Override // d4.a, androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z zVar = new z(s0(), this.f8758n0);
        this.C0 = (NavigationViewModel) zVar.a(NavigationViewModel.class);
        this.D0 = (HomeActivityViewModel) zVar.a(HomeActivityViewModel.class);
        this.E0 = this.A0.a();
        return super.W(layoutInflater, viewGroup, bundle);
    }

    @Override // d4.a
    public void W0() {
        t3.a.x(q(), "Home", "Gifs");
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        this.U = true;
        CompositeDisposable compositeDisposable = this.J0;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

    public final void X0(final h hVar, List<GifMetaData> list) {
        NotifyingGridLayoutManager N0 = N0();
        Function1 action = new Function1() { // from class: p4.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GifListingsFragment.this.D0.f(t3.o.c(hVar, ((Integer) obj).intValue()));
                return null;
            }
        };
        Objects.requireNonNull(N0);
        Intrinsics.checkNotNullParameter(action, "action");
        N0.D1(new f(N0, action));
        hVar.q(list);
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        Disposable disposable = this.I0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void Y0() {
        NavigationViewModel navigationViewModel = this.C0;
        boolean z10 = this.G0 != null;
        Objects.requireNonNull(navigationViewModel);
        navigationViewModel.k(TopNavigation.ChildItem.GifOrders.INSTANCE, TopNavigation.ChildItem.GifFilters.INSTANCE, z10);
        this.C0.z(this.K0, this.L0);
    }

    @Override // c4.h.a
    public void h(String str) {
        I0(GifDetailsActivity.D(q(), str));
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        CompositeDisposable compositeDisposable = this.J0;
        if (compositeDisposable != null) {
            if (compositeDisposable.isDisposed()) {
            }
            int i10 = this.D0.f5019r;
            RecyclerView recyclerView = this.f8767x0;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, this.f8767x0.getPaddingRight(), this.f8767x0.getPaddingBottom());
            this.D0.f5013k.f(K(), new g(this, 2));
            this.C0.f5041m.f(K(), new c(this, 2));
        }
        CompositeDisposable compositeDisposable2 = new CompositeDisposable();
        this.J0 = compositeDisposable2;
        compositeDisposable2.add(this.B0.a(false).subscribe(new m(this, 13)));
        int i102 = this.D0.f5019r;
        RecyclerView recyclerView2 = this.f8767x0;
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), i102, this.f8767x0.getPaddingRight(), this.f8767x0.getPaddingBottom());
        this.D0.f5013k.f(K(), new g(this, 2));
        this.C0.f5041m.f(K(), new c(this, 2));
    }
}
