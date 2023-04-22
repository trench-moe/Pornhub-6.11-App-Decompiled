package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ga.g;
import ga.h;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f7863c;
    public final RectF d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f7864e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f7865f;

    /* renamed from: g  reason: collision with root package name */
    public float f7866g;

    /* renamed from: h  reason: collision with root package name */
    public float f7867h;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7868a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f7869b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f7870c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z10, View view, View view2) {
            this.f7868a = z10;
            this.f7869b = view;
            this.f7870c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7868a) {
                return;
            }
            this.f7869b.setVisibility(4);
            this.f7870c.setAlpha(1.0f);
            this.f7870c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f7868a) {
                this.f7869b.setVisibility(0);
                this.f7870c.setAlpha(0.0f);
                this.f7870c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f7871a;

        /* renamed from: b  reason: collision with root package name */
        public r3.c f7872b;
    }

    public FabTransformationBehavior() {
        this.f7863c = new Rect();
        this.d = new RectF();
        this.f7864e = new RectF();
        this.f7865f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7863c = new Rect();
        this.d = new RectF();
        this.f7864e = new RectF();
        this.f7865f = new int[2];
    }

    public abstract b A(Context context, boolean z10);

    public final ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void c(CoordinatorLayout.e eVar) {
        if (eVar.f1794h == 0) {
            eVar.f1794h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03be A[LOOP:0: B:100:0x03bc->B:101:0x03be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x033a  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.AnimatorSet u(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.u(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final Pair<h, h> v(float f10, float f11, boolean z10, b bVar) {
        h hVar;
        h hVar2;
        int i10;
        if (f10 != 0.0f && f11 != 0.0f) {
            if (z10) {
                if (f11 >= 0.0f) {
                }
                hVar2 = bVar.f7871a.f("translationXCurveUpwards");
                hVar = bVar.f7871a.f("translationYCurveUpwards");
                return new Pair<>(hVar2, hVar);
            }
            if (z10 || i10 <= 0) {
                hVar2 = bVar.f7871a.f("translationXCurveDownwards");
                hVar = bVar.f7871a.f("translationYCurveDownwards");
                return new Pair<>(hVar2, hVar);
            }
            hVar2 = bVar.f7871a.f("translationXCurveUpwards");
            hVar = bVar.f7871a.f("translationYCurveUpwards");
            return new Pair<>(hVar2, hVar);
        }
        hVar2 = bVar.f7871a.f("translationXLinear");
        hVar = bVar.f7871a.f("translationYLinear");
        return new Pair<>(hVar2, hVar);
    }

    public final float w(View view, View view2, r3.c cVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.f7864e;
        z(view, rectF);
        rectF.offset(this.f7866g, this.f7867h);
        z(view2, rectF2);
        Objects.requireNonNull(cVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float x(View view, View view2, r3.c cVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.f7864e;
        z(view, rectF);
        rectF.offset(this.f7866g, this.f7867h);
        z(view2, rectF2);
        Objects.requireNonNull(cVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float y(b bVar, h hVar, float f10, float f11) {
        long j10 = hVar.f9899a;
        long j11 = hVar.f9900b;
        h f12 = bVar.f7871a.f("expansion");
        return ga.a.a(f10, f11, hVar.b().getInterpolation(((float) (((f12.f9899a + f12.f9900b) + 17) - j10)) / ((float) j11)));
    }

    public final void z(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f7865f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }
}
