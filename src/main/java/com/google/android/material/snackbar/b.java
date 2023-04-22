package com.google.android.material.snackbar;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7667a;

    public b(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7667a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f7667a.f7637c.setScaleX(floatValue);
        this.f7667a.f7637c.setScaleY(floatValue);
    }
}
