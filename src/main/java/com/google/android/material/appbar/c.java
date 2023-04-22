package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import o0.d;

/* loaded from: classes.dex */
public class c implements o0.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f7152a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f7153b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f7154c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f7155e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f7155e = baseBehavior;
        this.f7152a = coordinatorLayout;
        this.f7153b = appBarLayout;
        this.f7154c = view;
        this.d = i10;
    }

    @Override // o0.d
    public boolean a(View view, d.a aVar) {
        this.f7155e.G(this.f7152a, this.f7153b, this.f7154c, this.d, new int[]{0, 0});
        return true;
    }
}
