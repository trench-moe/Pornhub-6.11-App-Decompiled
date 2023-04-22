package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

/* loaded from: classes.dex */
public class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7668a;

    public c(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f7668a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.n;
        this.f7668a.f7637c.setTranslationY(intValue);
    }
}
