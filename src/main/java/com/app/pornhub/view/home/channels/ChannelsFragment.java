package com.app.pornhub.view.home.channels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b3.c;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.ChannelsConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.channels.a;
import d3.d;
import f3.m;
import f3.o;
import g4.p;
import h4.h;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.a0;
import x2.z;

/* loaded from: classes.dex */
public class ChannelsFragment extends d4.a implements a.b {
    public static final /* synthetic */ int J0 = 0;
    public o A0;
    public m B0;
    public UserOrientation C0;
    public NavigationViewModel D0;
    public HomeActivityViewModel E0;
    public a F0;
    public CompositeDisposable G0;
    public Disposable H0;
    public ChannelsConfig.ChannelOrder I0;

    /* renamed from: z0  reason: collision with root package name */
    public d f5128z0;

    @Override // d4.a
    public void K0() {
        if (this.I0 == null) {
            return;
        }
        Disposable disposable = this.H0;
        if (disposable != null && !disposable.isDisposed()) {
            this.H0.dispose();
        }
        String order = ChannelsConfig.Companion.getChannelsOrderAbbr(this.I0);
        d dVar = this.f5128z0;
        int a10 = this.F0.a();
        Objects.requireNonNull(dVar);
        Intrinsics.checkNotNullParameter(order, "order");
        Observable startWith = ((c) dVar.f8752f).b(16, a10, order).toObservable().map(z.f17903t).onErrorReturn(a0.f17675u).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "channelsRepository.getCh…th(UseCaseResult.Loading)");
        this.H0 = startWith.subscribe(new x2.a(this, 11));
    }

    @Override // d4.a
    public c4.a L0() {
        return this.F0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_channels_to_display);
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.F0 = new a(this);
    }

    @Override // d4.a, androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        androidx.lifecycle.z zVar = new androidx.lifecycle.z(s0(), this.f8758n0);
        this.D0 = (NavigationViewModel) zVar.a(NavigationViewModel.class);
        this.E0 = (HomeActivityViewModel) zVar.a(HomeActivityViewModel.class);
        this.C0 = this.A0.a().getOrientation();
        return super.W(layoutInflater, viewGroup, bundle);
    }

    @Override // d4.a
    public void W0() {
        t3.a.x(q(), "Home", "Channels");
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        this.U = true;
        CompositeDisposable compositeDisposable = this.G0;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.G0.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        Disposable disposable = this.H0;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.H0.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        CompositeDisposable compositeDisposable = this.G0;
        if (compositeDisposable != null) {
            if (compositeDisposable.isDisposed()) {
            }
            int i10 = this.E0.f5019r;
            RecyclerView recyclerView = this.f8767x0;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, this.f8767x0.getPaddingRight(), this.f8767x0.getPaddingBottom());
            this.D0.f5041m.f(K(), new p(this, 3));
            this.E0.f5013k.f(K(), new h(this, 2));
        }
        CompositeDisposable compositeDisposable2 = new CompositeDisposable();
        this.G0 = compositeDisposable2;
        compositeDisposable2.add(this.B0.a(false).subscribe(new x2.c(this, 13)));
        int i102 = this.E0.f5019r;
        RecyclerView recyclerView2 = this.f8767x0;
        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), i102, this.f8767x0.getPaddingRight(), this.f8767x0.getPaddingBottom());
        this.D0.f5041m.f(K(), new p(this, 3));
        this.E0.f5013k.f(K(), new h(this, 2));
    }
}
