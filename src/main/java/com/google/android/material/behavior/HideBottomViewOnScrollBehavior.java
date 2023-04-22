package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f7164a;

    /* renamed from: b  reason: collision with root package name */
    public int f7165b;

    /* renamed from: c  reason: collision with root package name */
    public int f7166c;
    public ViewPropertyAnimator d;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f7164a = 0;
        this.f7165b = 2;
        this.f7166c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7164a = 0;
        this.f7165b = 2;
        this.f7166c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i10) {
        this.f7164a = v2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void l(CoordinatorLayout coordinatorLayout, V v2, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            if (this.f7165b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v2.clearAnimation();
            }
            this.f7165b = 1;
            s(v2, this.f7164a + this.f7166c, 175L, ga.a.f9888c);
        } else if (i11 < 0) {
            if (this.f7165b == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                v2.clearAnimation();
            }
            this.f7165b = 2;
            s(v2, 0, 225L, ga.a.d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(V v2, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.d = v2.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }
}
