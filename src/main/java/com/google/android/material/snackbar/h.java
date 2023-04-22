package com.google.android.material.snackbar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Objects;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f7673c;

    public h(BaseTransientBottomBar baseTransientBottomBar) {
        this.f7673c = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        BaseTransientBottomBar.i iVar = this.f7673c.f7637c;
        if (iVar == null) {
            return;
        }
        if (iVar.getParent() != null) {
            this.f7673c.f7637c.setVisibility(0);
        }
        if (this.f7673c.f7637c.getAnimationMode() != 1) {
            BaseTransientBottomBar baseTransientBottomBar = this.f7673c;
            int c10 = baseTransientBottomBar.c();
            baseTransientBottomBar.f7637c.setTranslationY(c10);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(c10, 0);
            valueAnimator.setInterpolator(ga.a.f9887b);
            valueAnimator.setDuration(250L);
            valueAnimator.addListener(new db.c(baseTransientBottomBar));
            valueAnimator.addUpdateListener(new c(baseTransientBottomBar, c10));
            valueAnimator.start();
            return;
        }
        BaseTransientBottomBar baseTransientBottomBar2 = this.f7673c;
        Objects.requireNonNull(baseTransientBottomBar2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(ga.a.f9886a);
        ofFloat.addUpdateListener(new a(baseTransientBottomBar2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat2.setInterpolator(ga.a.d);
        ofFloat2.addUpdateListener(new b(baseTransientBottomBar2));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new db.a(baseTransientBottomBar2));
        animatorSet.start();
    }
}
