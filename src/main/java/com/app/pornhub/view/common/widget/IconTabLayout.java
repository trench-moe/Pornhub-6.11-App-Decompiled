package com.app.pornhub.view.common.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public class IconTabLayout extends TabLayout {

    /* renamed from: l0  reason: collision with root package name */
    public ViewPager f4987l0;

    /* loaded from: classes.dex */
    public interface b {
        Drawable a(Context context, int i10);

        Drawable b(Context context, int i10);
    }

    /* loaded from: classes.dex */
    public class c implements TabLayout.d {
        public c(a aVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            ViewPager viewPager = IconTabLayout.this.f4987l0;
            if (viewPager != null && (viewPager.getAdapter() instanceof b)) {
                gVar.a(((b) IconTabLayout.this.f4987l0.getAdapter()).a(IconTabLayout.this.getContext(), gVar.d));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
            ViewPager viewPager = IconTabLayout.this.f4987l0;
            if (viewPager != null && (viewPager.getAdapter() instanceof b)) {
                gVar.a(((b) IconTabLayout.this.f4987l0.getAdapter()).b(IconTabLayout.this.getContext(), gVar.d));
            }
        }
    }

    public IconTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c cVar = new c(null);
        if (this.f7691a0.contains(cVar)) {
            return;
        }
        this.f7691a0.add(cVar);
    }

    public IconTabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c cVar = new c(null);
        if (this.f7691a0.contains(cVar)) {
            return;
        }
        this.f7691a0.add(cVar);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void a(TabLayout.g gVar, int i10, boolean z10) {
        ViewPager viewPager = this.f4987l0;
        if (viewPager != null && (viewPager.getAdapter() instanceof b)) {
            gVar.a(((b) this.f4987l0.getAdapter()).b(getContext(), i10));
        }
        super.a(gVar, i10, z10);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void m(ViewPager viewPager, boolean z10) {
        this.f4987l0 = viewPager;
        n(viewPager, z10, false);
    }

    @Override // com.google.android.material.tabs.TabLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (this.f4987l0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                this.f4987l0 = (ViewPager) parent;
            }
        }
        super.onAttachedToWindow();
    }
}
