package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7666a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7666a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7666a.f7637c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
