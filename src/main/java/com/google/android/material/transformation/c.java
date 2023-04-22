package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.c;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.c f7880a;

    public c(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.c cVar) {
        this.f7880a = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        c.e revealInfo = this.f7880a.getRevealInfo();
        revealInfo.f7331c = Float.MAX_VALUE;
        this.f7880a.setRevealInfo(revealInfo);
    }
}
