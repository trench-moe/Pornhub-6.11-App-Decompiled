package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ cb.g f7147a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f7148b;

    public a(AppBarLayout appBarLayout, cb.g gVar) {
        this.f7148b = appBarLayout;
        this.f7147a = gVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f7147a.q(floatValue);
        Drawable drawable = this.f7148b.H;
        if (drawable instanceof cb.g) {
            ((cb.g) drawable).q(floatValue);
        }
        for (AppBarLayout.e eVar : this.f7148b.F) {
            eVar.a(floatValue, this.f7147a.K);
        }
    }
}
