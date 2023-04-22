package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7458a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f7459b;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, f fVar) {
        this.f7459b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f7458a = true;
        this.f7459b.a();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f7459b.e();
        if (this.f7458a) {
            return;
        }
        this.f7459b.g(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7459b.onAnimationStart(animator);
        this.f7458a = false;
    }
}
