package com.google.android.material.appbar;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import o0.d;

/* loaded from: classes.dex */
public class d implements o0.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f7156a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f7157b;

    public d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z10) {
        this.f7156a = appBarLayout;
        this.f7157b = z10;
    }

    @Override // o0.d
    public boolean a(View view, d.a aVar) {
        this.f7156a.setExpanded(this.f7157b);
        return true;
    }
}
