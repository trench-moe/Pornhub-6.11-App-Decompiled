package com.google.android.material.appbar;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f7158a;

    public e(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f7158a = collapsingToolbarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7158a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
