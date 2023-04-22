package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.os.Handler;

/* loaded from: classes.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7669a;

    public d(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7669a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Handler handler = BaseTransientBottomBar.n;
        this.f7669a.f7637c.setTranslationY(intValue);
    }
}
