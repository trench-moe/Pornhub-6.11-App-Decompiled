package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.circularreveal.c f7878a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f7879b;

    public b(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.c cVar, Drawable drawable) {
        this.f7878a = cVar;
        this.f7879b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7878a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7878a.setCircularRevealOverlayDrawable(this.f7879b);
    }
}
