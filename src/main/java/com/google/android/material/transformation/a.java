package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f7877a;

    public a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f7877a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f7877a.invalidate();
    }
}
