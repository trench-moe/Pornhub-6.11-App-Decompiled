package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.pornhub.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final Property<View, Float> V = new c(Float.class, "width");
    public static final Property<View, Float> W = new d(Float.class, "height");

    /* renamed from: a0  reason: collision with root package name */
    public static final Property<View, Float> f7433a0 = new e(Float.class, "paddingStart");

    /* renamed from: b0  reason: collision with root package name */
    public static final Property<View, Float> f7434b0 = new f(Float.class, "paddingEnd");
    public int I;
    public final com.google.android.material.floatingactionbutton.f J;
    public final com.google.android.material.floatingactionbutton.f K;
    public final com.google.android.material.floatingactionbutton.f L;
    public final com.google.android.material.floatingactionbutton.f M;
    public final int N;
    public int O;
    public int P;
    public final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public ColorStateList U;

    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f7435a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f7436b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f7437c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f7436b = false;
            this.f7437c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.M);
            this.f7436b = obtainStyledAttributes.getBoolean(0, false);
            this.f7437c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void c(CoordinatorLayout.e eVar) {
            if (eVar.f1794h == 0) {
                eVar.f1794h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).f1788a instanceof BottomSheetBehavior : false) {
                    u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> i11 = coordinatorLayout.i(extendedFloatingActionButton);
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = i11.get(i12);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.e ? ((CoordinatorLayout.e) layoutParams).f1788a instanceof BottomSheetBehavior : false) && u(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.w(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean s(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.e eVar = (CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams();
            if ((this.f7436b || this.f7437c) && eVar.f1792f == view.getId()) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (s(appBarLayout, extendedFloatingActionButton)) {
                if (this.f7435a == null) {
                    this.f7435a = new Rect();
                }
                Rect rect = this.f7435a;
                ua.a.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    ExtendedFloatingActionButton.i(extendedFloatingActionButton, this.f7437c ? extendedFloatingActionButton.J : extendedFloatingActionButton.M);
                } else {
                    ExtendedFloatingActionButton.i(extendedFloatingActionButton, this.f7437c ? extendedFloatingActionButton.K : extendedFloatingActionButton.L);
                }
                return true;
            }
            return false;
        }

        public final boolean u(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (s(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    ExtendedFloatingActionButton.i(extendedFloatingActionButton, this.f7437c ? extendedFloatingActionButton.J : extendedFloatingActionButton.M);
                } else {
                    ExtendedFloatingActionButton.i(extendedFloatingActionButton, this.f7437c ? extendedFloatingActionButton.K : extendedFloatingActionButton.L);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a implements k {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int a() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int b() {
            return ExtendedFloatingActionButton.this.P;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int c() {
            int measuredWidth = ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2);
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            return measuredWidth + extendedFloatingActionButton.O + extendedFloatingActionButton.P;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public ViewGroup.LayoutParams d() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int e() {
            return ExtendedFloatingActionButton.this.O;
        }
    }

    /* loaded from: classes.dex */
    public class b implements k {
        public b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int a() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int c() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public ViewGroup.LayoutParams d() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.getCollapsedSize(), ExtendedFloatingActionButton.this.getCollapsedSize());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.k
        public int e() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().width = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().height = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, Float> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            return Float.valueOf(x.e.f(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f10) {
            View view2 = view;
            int intValue = f10.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.e.k(view2, intValue, paddingTop, x.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, Float> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            return Float.valueOf(x.e.e(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f10) {
            View view2 = view;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.e.k(view2, x.e.f(view2), view2.getPaddingTop(), f10.intValue(), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public class g extends ta.a {

        /* renamed from: g  reason: collision with root package name */
        public final k f7440g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f7441h;

        public g(u1.f fVar, k kVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, fVar);
            this.f7440g = kVar;
            this.f7441h = z10;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int b() {
            return this.f7441h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void c() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.R = this.f7441h;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f7440g.d().width;
            layoutParams.height = this.f7440g.d().height;
            ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
            int e10 = this.f7440g.e();
            int paddingTop = ExtendedFloatingActionButton.this.getPaddingTop();
            int b10 = this.f7440g.b();
            int paddingBottom = ExtendedFloatingActionButton.this.getPaddingBottom();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.e.k(extendedFloatingActionButton2, e10, paddingTop, b10, paddingBottom);
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            boolean z10 = this.f7441h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (z10 != extendedFloatingActionButton.R && extendedFloatingActionButton.getIcon() != null && !TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText())) {
                return false;
            }
            return true;
        }

        @Override // ta.a, com.google.android.material.floatingactionbutton.f
        public void e() {
            super.e();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.S = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f7440g.d().width;
            layoutParams.height = this.f7440g.d().height;
        }

        @Override // ta.a, com.google.android.material.floatingactionbutton.f
        public AnimatorSet f() {
            ga.g i10 = i();
            if (i10.g("width")) {
                PropertyValuesHolder[] e10 = i10.e("width");
                e10[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f7440g.c());
                i10.f9898b.put("width", e10);
            }
            if (i10.g("height")) {
                PropertyValuesHolder[] e11 = i10.e("height");
                e11[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f7440g.a());
                i10.f9898b.put("height", e11);
            }
            if (i10.g("paddingStart")) {
                PropertyValuesHolder[] e12 = i10.e("paddingStart");
                PropertyValuesHolder propertyValuesHolder = e12[0];
                ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                propertyValuesHolder.setFloatValues(x.e.f(extendedFloatingActionButton), this.f7440g.e());
                i10.f9898b.put("paddingStart", e12);
            }
            if (i10.g("paddingEnd")) {
                PropertyValuesHolder[] e13 = i10.e("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = e13[0];
                ExtendedFloatingActionButton extendedFloatingActionButton2 = ExtendedFloatingActionButton.this;
                WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                propertyValuesHolder2.setFloatValues(x.e.e(extendedFloatingActionButton2), this.f7440g.b());
                i10.f9898b.put("paddingEnd", e13);
            }
            if (i10.g("labelOpacity")) {
                PropertyValuesHolder[] e14 = i10.e("labelOpacity");
                boolean z10 = this.f7441h;
                e14[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
                i10.f9898b.put("labelOpacity", e14);
            }
            return h(i10);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g(i iVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            u1.f fVar = this.d;
            Animator animator2 = (Animator) fVar.f15477c;
            if (animator2 != null) {
                animator2.cancel();
            }
            fVar.f15477c = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.R = this.f7441h;
            extendedFloatingActionButton.S = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }
    }

    /* loaded from: classes.dex */
    public class h extends ta.a {

        /* renamed from: g  reason: collision with root package name */
        public boolean f7443g;

        public h(u1.f fVar) {
            super(ExtendedFloatingActionButton.this, fVar);
        }

        @Override // ta.a, com.google.android.material.floatingactionbutton.f
        public void a() {
            this.d.f15477c = null;
            this.f7443g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int b() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void c() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            Property<View, Float> property = ExtendedFloatingActionButton.V;
            boolean z10 = false;
            if (extendedFloatingActionButton.getVisibility() != 0 ? extendedFloatingActionButton.I != 2 : extendedFloatingActionButton.I == 1) {
                z10 = true;
            }
            return z10;
        }

        @Override // ta.a, com.google.android.material.floatingactionbutton.f
        public void e() {
            super.e();
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.I = 0;
            if (!this.f7443g) {
                extendedFloatingActionButton.setVisibility(8);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g(i iVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            u1.f fVar = this.d;
            Animator animator2 = (Animator) fVar.f15477c;
            if (animator2 != null) {
                animator2.cancel();
            }
            fVar.f15477c = animator;
            this.f7443g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.I = 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
    }

    /* loaded from: classes.dex */
    public class j extends ta.a {
        public j(u1.f fVar) {
            super(ExtendedFloatingActionButton.this, fVar);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int b() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void c() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            Property<View, Float> property = ExtendedFloatingActionButton.V;
            return extendedFloatingActionButton.j();
        }

        @Override // ta.a, com.google.android.material.floatingactionbutton.f
        public void e() {
            super.e();
            ExtendedFloatingActionButton.this.I = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void g(i iVar) {
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            u1.f fVar = this.d;
            Animator animator2 = (Animator) fVar.f15477c;
            if (animator2 != null) {
                animator2.cancel();
            }
            fVar.f15477c = animator;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.I = 2;
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        int a();

        int b();

        int c();

        ViewGroup.LayoutParams d();

        int e();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018223), attributeSet, i10);
        this.I = 0;
        u1.f fVar = new u1.f();
        j jVar = new j(fVar);
        this.L = jVar;
        h hVar = new h(fVar);
        this.M = hVar;
        this.R = true;
        this.S = false;
        this.T = false;
        Context context2 = getContext();
        this.Q = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray d10 = ua.j.d(context2, attributeSet, m9.a.L, i10, 2132018223, new int[0]);
        ga.g a10 = ga.g.a(context2, d10, 4);
        ga.g a11 = ga.g.a(context2, d10, 3);
        ga.g a12 = ga.g.a(context2, d10, 2);
        ga.g a13 = ga.g.a(context2, d10, 5);
        this.N = d10.getDimensionPixelSize(0, -1);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        this.O = x.e.f(this);
        this.P = x.e.e(this);
        u1.f fVar2 = new u1.f();
        g gVar = new g(fVar2, new a(), true);
        this.K = gVar;
        g gVar2 = new g(fVar2, new b(), false);
        this.J = gVar2;
        jVar.f15386f = a10;
        hVar.f15386f = a11;
        gVar.f15386f = a12;
        gVar2.f15386f = a13;
        d10.recycle();
        setShapeAppearanceModel(cb.k.d(context2, attributeSet, i10, 2132018223, cb.k.f3959m).a());
        k();
    }

    public static void i(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.f fVar) {
        Objects.requireNonNull(extendedFloatingActionButton);
        if (fVar.d()) {
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (!((x.g.c(extendedFloatingActionButton) || (!extendedFloatingActionButton.j() && extendedFloatingActionButton.T)) && !extendedFloatingActionButton.isInEditMode())) {
            fVar.c();
            fVar.g(null);
            return;
        }
        extendedFloatingActionButton.measure(0, 0);
        AnimatorSet f10 = fVar.f();
        f10.addListener(new com.google.android.material.floatingactionbutton.a(extendedFloatingActionButton, fVar));
        for (Animator.AnimatorListener animatorListener : ((ta.a) fVar).f15384c) {
            f10.addListener(animatorListener);
        }
        f10.start();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.Q;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.N;
        if (i10 < 0) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            return (Math.min(x.e.f(this), x.e.e(this)) * 2) + getIconSize();
        }
        return i10;
    }

    public ga.g getExtendMotionSpec() {
        return ((ta.a) this.K).f15386f;
    }

    public ga.g getHideMotionSpec() {
        return ((ta.a) this.M).f15386f;
    }

    public ga.g getShowMotionSpec() {
        return ((ta.a) this.L).f15386f;
    }

    public ga.g getShrinkMotionSpec() {
        return ((ta.a) this.J).f15386f;
    }

    public final boolean j() {
        if (getVisibility() != 0) {
            return this.I == 2;
        }
        return this.I != 1;
    }

    public final void k() {
        this.U = getTextColors();
    }

    public void l(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.R && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.R = false;
            this.J.c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.T = z10;
    }

    public void setExtendMotionSpec(ga.g gVar) {
        ((ta.a) this.K).f15386f = gVar;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(ga.g.b(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.R == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z10 ? this.K : this.J;
        if (fVar.d()) {
            return;
        }
        fVar.c();
    }

    public void setHideMotionSpec(ga.g gVar) {
        ((ta.a) this.M).f15386f = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(ga.g.b(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.R || this.S) {
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        this.O = x.e.f(this);
        this.P = x.e.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.R || this.S) {
            return;
        }
        this.O = i10;
        this.P = i12;
    }

    public void setShowMotionSpec(ga.g gVar) {
        ((ta.a) this.L).f15386f = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(ga.g.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(ga.g gVar) {
        ((ta.a) this.J).f15386f = gVar;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(ga.g.b(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        k();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        k();
    }
}
