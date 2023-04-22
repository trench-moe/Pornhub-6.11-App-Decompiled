package com.app.pornhub.view.common;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z3.f;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/app/pornhub/view/common/TopNavigationBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TopNavigationBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f4969a;

    /* renamed from: b  reason: collision with root package name */
    public float f4970b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f4971c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4972e;

    /* renamed from: f  reason: collision with root package name */
    public a f4973f;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TopNavigationBehavior<V> f4974a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f4975b;

        public b(TopNavigationBehavior<V> topNavigationBehavior, boolean z10) {
            this.f4974a = topNavigationBehavior;
            this.f4975b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ValueAnimator valueAnimator = this.f4974a.f4971c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
            }
            TopNavigationBehavior<V> topNavigationBehavior = this.f4974a;
            topNavigationBehavior.f4971c = null;
            if (this.f4975b) {
                a aVar = topNavigationBehavior.f4973f;
                if (aVar == null) {
                    return;
                }
                aVar.a();
                return;
            }
            a aVar2 = topNavigationBehavior.f4973f;
            if (aVar2 == null) {
                return;
            }
            aVar2.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopNavigationBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f4970b = Float.MIN_VALUE;
        this.d = 150L;
        this.f4972e = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void k(CoordinatorLayout coordinatorLayout, V child, View target, int i10, int i11, int[] consumed, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        float height = child.getHeight();
        if (this.f4972e) {
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            child.setTranslationY(Math.min(0.0f, Math.max(-(height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) == null ? 0 : marginLayoutParams.topMargin)), child.getTranslationY() - i11)));
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int i10, int i11) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        if (i10 == 2 && this.f4972e) {
            this.f4969a = i11;
            if (this.f4970b == Float.MIN_VALUE) {
                this.f4970b = child.getTranslationY();
            }
            ValueAnimator valueAnimator = this.f4971c;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void q(CoordinatorLayout coordinatorLayout, V child, View target, int i10) {
        a aVar;
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.f4972e) {
            boolean z10 = true;
            if (this.f4969a != 0 && i10 != 1) {
                return;
            }
            if (((float) child.getHeight()) == (-child.getTranslationY())) {
                if (!(this.f4970b == child.getTranslationY())) {
                    a aVar2 = this.f4973f;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                    this.f4970b = Float.MIN_VALUE;
                }
            }
            if (child.getTranslationY() == 0.0f) {
                if (this.f4970b != 0.0f) {
                    z10 = false;
                }
                if (!z10 && (aVar = this.f4973f) != null) {
                    aVar.a();
                }
            }
            this.f4970b = Float.MIN_VALUE;
        }
    }

    public final void s(View view, boolean z10, long j10) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f10;
        if (this.f4971c != null) {
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        valueAnimator.setDuration(j10);
        this.f4971c = valueAnimator;
        valueAnimator.addUpdateListener(new f(view, 0));
        float height = view.getHeight();
        if (z10) {
            f10 = 0.0f;
        } else {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            f10 = -(height + ((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) == null ? 0 : marginLayoutParams.topMargin));
        }
        ValueAnimator valueAnimator2 = this.f4971c;
        if (valueAnimator2 != null) {
            valueAnimator2.setFloatValues(view.getTranslationY(), f10);
        }
        ValueAnimator valueAnimator3 = this.f4971c;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new b(this, z10));
        }
        ValueAnimator valueAnimator4 = this.f4971c;
        if (valueAnimator4 == null) {
            return;
        }
        valueAnimator4.start();
    }
}
