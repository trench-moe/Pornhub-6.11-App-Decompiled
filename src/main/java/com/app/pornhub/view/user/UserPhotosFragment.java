package com.app.pornhub.view.user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import d5.d;
import f3.k;
import f3.s;
import io.reactivex.disposables.CompositeDisposable;
import x2.h;
import z2.cp;

/* loaded from: classes.dex */
public class UserPhotosFragment extends Fragment implements cp {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ int f5513t0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public s f5514n0;

    /* renamed from: o0  reason: collision with root package name */
    public k f5515o0;

    /* renamed from: p0  reason: collision with root package name */
    public ViewPager f5516p0;

    /* renamed from: q0  reason: collision with root package name */
    public CompositeDisposable f5517q0;

    /* renamed from: r0  reason: collision with root package name */
    public String f5518r0 = BuildConfig.FLAVOR;

    /* renamed from: s0  reason: collision with root package name */
    public String f5519s0;

    /* loaded from: classes.dex */
    public class a implements ViewPager.h {
        public a(UserPhotosFragment userPhotosFragment) {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void a(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void c(int i10) {
        }
    }

    public final void K0() {
        d dVar = new d(q(), p(), this.f5519s0);
        this.f5516p0.c(new a(this));
        this.f5516p0.setAdapter(dVar);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UserMetaData a10 = this.f5515o0.a();
        if (a10 != null) {
            this.f5518r0 = a10.getId();
        }
        this.f5519s0 = this.f2019u.getString("targetUserId");
        View inflate = layoutInflater.inflate(R.layout.fragment_user_albums, viewGroup, false);
        if (this.f5519s0.equals(this.f5518r0)) {
            PagerTabStrip pagerTabStrip = (PagerTabStrip) inflate.findViewById(R.id.pager_title_strip);
            pagerTabStrip.getLayoutParams().height = E().getDimensionPixelSize(R.dimen.top_nav_container_height);
            pagerTabStrip.requestLayout();
        }
        this.f5516p0 = (ViewPager) inflate.findViewById(R.id.pager);
        K0();
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f5517q0 = compositeDisposable;
        compositeDisposable.add(this.f5514n0.a(false).subscribe(new h(this, 14)));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        this.f5517q0.clear();
    }
}
