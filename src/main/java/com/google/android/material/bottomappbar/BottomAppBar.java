package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.g;
import cb.k;
import com.app.pornhub.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ga.i;
import ia.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.x;
import ua.j;
import ua.m;
import ua.n;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int F0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public AnimatorListenerAdapter D0;
    public i<FloatingActionButton> E0;

    /* renamed from: k0  reason: collision with root package name */
    public Integer f7182k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f7183l0;

    /* renamed from: m0  reason: collision with root package name */
    public final g f7184m0;

    /* renamed from: n0  reason: collision with root package name */
    public Animator f7185n0;

    /* renamed from: o0  reason: collision with root package name */
    public Animator f7186o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f7187p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f7188q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f7189r0;

    /* renamed from: s0  reason: collision with root package name */
    public final boolean f7190s0;

    /* renamed from: t0  reason: collision with root package name */
    public final boolean f7191t0;

    /* renamed from: u0  reason: collision with root package name */
    public final boolean f7192u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f7193v0;
    public int w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f7194x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f7195y0;

    /* renamed from: z0  reason: collision with root package name */
    public Behavior f7196z0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f7197e;

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f7198f;

        /* renamed from: g  reason: collision with root package name */
        public int f7199g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f7200h;

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = Behavior.this.f7198f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect = Behavior.this.f7197e;
                    rect.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    floatingActionButton.l(rect);
                    int height = Behavior.this.f7197e.height();
                    bottomAppBar.L(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f3963e.a(new RectF(Behavior.this.f7197e)));
                    CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
                    if (Behavior.this.f7199g == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = bottomAppBar.getRightInset();
                        if (n.f(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) eVar).leftMargin += bottomAppBar.f7183l0;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar).rightMargin += bottomAppBar.f7183l0;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f7200h = new a();
            this.f7197e = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7200h = new a();
            this.f7197e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f7198f = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.F0;
            View E = bottomAppBar.E();
            if (E != null) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                if (!x.g.c(E)) {
                    CoordinatorLayout.e eVar = (CoordinatorLayout.e) E.getLayoutParams();
                    eVar.d = 49;
                    this.f7199g = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (E instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) E;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f7200h);
                        floatingActionButton.d(bottomAppBar.D0);
                        floatingActionButton.e(new ia.e(bottomAppBar));
                        floatingActionButton.f(bottomAppBar.E0);
                    }
                    bottomAppBar.K();
                }
            }
            coordinatorLayout.w(bottomAppBar, i10);
            this.f7164a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i10 == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (!bottomAppBar.f7194x0) {
                bottomAppBar.I(bottomAppBar.f7187p0, bottomAppBar.f7195y0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements i<FloatingActionButton> {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements n.b {
        public c() {
        }

        @Override // ua.n.b
        public d0 a(View view, d0 d0Var, n.c cVar) {
            boolean z10;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f7190s0) {
                bottomAppBar.A0 = d0Var.b();
            }
            BottomAppBar bottomAppBar2 = BottomAppBar.this;
            boolean z11 = false;
            if (bottomAppBar2.f7191t0) {
                z10 = bottomAppBar2.C0 != d0Var.c();
                BottomAppBar.this.C0 = d0Var.c();
            } else {
                z10 = false;
            }
            BottomAppBar bottomAppBar3 = BottomAppBar.this;
            if (bottomAppBar3.f7192u0) {
                boolean z12 = bottomAppBar3.B0 != d0Var.d();
                BottomAppBar.this.B0 = d0Var.d();
                z11 = z12;
            }
            if (!z10) {
                if (z11) {
                }
                return d0Var;
            }
            BottomAppBar bottomAppBar4 = BottomAppBar.this;
            Animator animator = bottomAppBar4.f7186o0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = bottomAppBar4.f7185n0;
            if (animator2 != null) {
                animator2.cancel();
            }
            BottomAppBar.this.K();
            BottomAppBar.this.J();
            return d0Var;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.x(BottomAppBar.this);
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.f7194x0 = false;
            bottomAppBar.f7186o0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f7193v0++;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends s0.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public int f7206j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f7207m;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7206j = parcel.readInt();
            this.f7207m = parcel.readInt() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f7206j);
            parcel.writeInt(this.f7207m ? 1 : 0);
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018187), attributeSet, i10);
        g gVar = new g();
        this.f7184m0 = gVar;
        this.f7193v0 = 0;
        this.w0 = 0;
        this.f7194x0 = false;
        this.f7195y0 = true;
        this.D0 = new a();
        this.E0 = new b();
        Context context2 = getContext();
        TypedArray d10 = j.d(context2, attributeSet, m9.a.A, i10, 2132018187, new int[0]);
        ColorStateList a10 = za.c.a(context2, d10, 0);
        if (d10.hasValue(8)) {
            setNavigationIconTint(d10.getColor(8, -1));
        }
        int dimensionPixelSize = d10.getDimensionPixelSize(1, 0);
        this.f7187p0 = d10.getInt(2, 0);
        this.f7188q0 = d10.getInt(3, 0);
        this.f7189r0 = d10.getBoolean(7, false);
        this.f7190s0 = d10.getBoolean(9, false);
        this.f7191t0 = d10.getBoolean(10, false);
        this.f7192u0 = d10.getBoolean(11, false);
        d10.recycle();
        this.f7183l0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        f fVar = new f(d10.getDimensionPixelOffset(4, 0), d10.getDimensionPixelOffset(5, 0), d10.getDimensionPixelOffset(6, 0));
        k.b bVar = new k.b();
        bVar.f3978i = fVar;
        gVar.f3929c.f3938a = bVar.a();
        gVar.invalidateSelf();
        gVar.v(2);
        gVar.t(Paint.Style.FILL);
        gVar.f3929c.f3939b = new ra.a(context2);
        gVar.C();
        setElevation(dimensionPixelSize);
        gVar.setTintList(a10);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.q(this, gVar);
        c cVar = new c();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m9.a.R, i10, 2132018187);
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        boolean z11 = obtainStyledAttributes.getBoolean(1, false);
        boolean z12 = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        n.a(this, new m(z10, z11, z12, cVar));
    }

    public static /* synthetic */ f C(BottomAppBar bottomAppBar) {
        return bottomAppBar.getTopEdgeTreatment();
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.A0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return G(this.f7187p0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.B0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f getTopEdgeTreatment() {
        return (f) this.f7184m0.f3929c.f3938a.f3967i;
    }

    public static void x(BottomAppBar bottomAppBar) {
        bottomAppBar.f7193v0--;
    }

    public final FloatingActionButton D() {
        View E = E();
        if (E instanceof FloatingActionButton) {
            return (FloatingActionButton) E;
        }
        return null;
    }

    public final View E() {
        if (getParent() instanceof CoordinatorLayout) {
            for (View view : ((CoordinatorLayout) getParent()).p(this)) {
                if (!(view instanceof FloatingActionButton)) {
                    if (view instanceof ExtendedFloatingActionButton) {
                    }
                }
                return view;
            }
            return null;
        }
        return null;
    }

    public int F(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 == 1 && z10) {
            boolean f10 = n.f(this);
            int measuredWidth = f10 ? getMeasuredWidth() : 0;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f449a & 8388615) == 8388611) {
                    if (f10) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((f10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (f10 ? this.B0 : -this.C0));
        }
        return 0;
    }

    public final float G(int i10) {
        boolean f10 = n.f(this);
        if (i10 == 1) {
            return ((getMeasuredWidth() / 2) - (this.f7183l0 + (f10 ? this.C0 : this.B0))) * (f10 ? -1 : 1);
        }
        return 0.0f;
    }

    public final boolean H() {
        FloatingActionButton D = D();
        return D != null && D.k();
    }

    public final void I(int i10, boolean z10) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (!x.g.c(this)) {
            this.f7194x0 = false;
            int i11 = this.w0;
            if (i11 != 0) {
                this.w0 = 0;
                getMenu().clear();
                n(i11);
                return;
            }
            return;
        }
        Animator animator = this.f7186o0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!H()) {
            i10 = 0;
            z10 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            if (Math.abs(actionMenuView.getTranslationX() - F(actionMenuView, i10, z10)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.addListener(new ia.c(this, actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.playSequentially(ofFloat2, ofFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f7186o0 = animatorSet2;
        animatorSet2.addListener(new d());
        this.f7186o0.start();
    }

    public final void J() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f7186o0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (H()) {
            actionMenuView.setTranslationX(F(actionMenuView, this.f7187p0, this.f7195y0));
        } else {
            actionMenuView.setTranslationX(F(actionMenuView, 0, false));
        }
    }

    public final void K() {
        getTopEdgeTreatment().T = getFabTranslationX();
        View E = E();
        this.f7184m0.s((this.f7195y0 && H()) ? 1.0f : 0.0f);
        if (E != null) {
            E.setTranslationY(getFabTranslationY());
            E.setTranslationX(getFabTranslationX());
        }
    }

    public boolean L(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().R) {
            getTopEdgeTreatment().R = f10;
            this.f7184m0.invalidateSelf();
            return true;
        }
        return false;
    }

    public ColorStateList getBackgroundTint() {
        return this.f7184m0.f3929c.f3943g;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f7196z0 == null) {
            this.f7196z0 = new Behavior();
        }
        return this.f7196z0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().S;
    }

    public int getFabAlignmentMode() {
        return this.f7187p0;
    }

    public int getFabAnimationMode() {
        return this.f7188q0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().Q;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().P;
    }

    public boolean getHideOnScroll() {
        return this.f7189r0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.a.D(this, this.f7184m0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f7186o0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f7185n0;
            if (animator2 != null) {
                animator2.cancel();
            }
            K();
        }
        J();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f14775c);
        this.f7187p0 = eVar.f7206j;
        this.f7195y0 = eVar.f7207m;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f7206j = this.f7187p0;
        eVar.f7207m = this.f7195y0;
        return eVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.f7184m0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().l0(f10);
            this.f7184m0.invalidateSelf();
            K();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        g gVar = this.f7184m0;
        g.b bVar = gVar.f3929c;
        if (bVar.f3950o != f10) {
            bVar.f3950o = f10;
            gVar.C();
        }
        g gVar2 = this.f7184m0;
        int k10 = gVar2.f3929c.f3953r - gVar2.k();
        Behavior behavior = getBehavior();
        behavior.f7166c = k10;
        if (behavior.f7165b == 1) {
            setTranslationY(behavior.f7164a + k10);
        }
    }

    public void setFabAlignmentMode(int i10) {
        this.w0 = 0;
        this.f7194x0 = true;
        I(i10, this.f7195y0);
        if (this.f7187p0 != i10) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.g.c(this)) {
                Animator animator = this.f7185n0;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f7188q0 == 1) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(D(), "translationX", G(i10));
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                } else {
                    FloatingActionButton D = D();
                    if (D != null) {
                        if (!D.j()) {
                            this.f7193v0++;
                            D.i(new ia.b(this, i10), true);
                        }
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                this.f7185n0 = animatorSet;
                animatorSet.addListener(new ia.a(this));
                this.f7185n0.start();
            }
            this.f7187p0 = i10;
        }
        this.f7187p0 = i10;
    }

    public void setFabAnimationMode(int i10) {
        this.f7188q0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().U) {
            getTopEdgeTreatment().U = f10;
            this.f7184m0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().Q = f10;
            this.f7184m0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().P = f10;
            this.f7184m0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f7189r0 = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f7182k0 != null) {
            drawable = f0.a.h(drawable.mutate());
            drawable.setTint(this.f7182k0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f7182k0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
