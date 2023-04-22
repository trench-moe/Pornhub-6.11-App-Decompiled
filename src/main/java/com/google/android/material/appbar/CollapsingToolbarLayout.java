package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import c0.a;
import com.app.pornhub.R;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import n0.a0;
import n0.d0;
import n0.n;
import n0.x;
import ua.j;

/* loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public final com.google.android.material.internal.a A;
    public final ra.a B;
    public boolean C;
    public boolean D;
    public Drawable E;
    public Drawable F;
    public int G;
    public boolean H;
    public ValueAnimator I;
    public long J;
    public int K;
    public AppBarLayout.f L;
    public int M;
    public int N;
    public d0 O;
    public int P;
    public boolean Q;
    public int R;
    public boolean S;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7118c;

    /* renamed from: f  reason: collision with root package name */
    public int f7119f;

    /* renamed from: j  reason: collision with root package name */
    public ViewGroup f7120j;

    /* renamed from: m  reason: collision with root package name */
    public View f7121m;
    public View n;

    /* renamed from: t  reason: collision with root package name */
    public int f7122t;

    /* renamed from: u  reason: collision with root package name */
    public int f7123u;

    /* renamed from: w  reason: collision with root package name */
    public int f7124w;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f7125z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f7126a;

        /* renamed from: b  reason: collision with root package name */
        public float f7127b;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f7126a = 0;
            this.f7127b = 0.5f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7126a = 0;
            this.f7127b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.K);
            this.f7126a = obtainStyledAttributes.getInt(0, 0);
            this.f7127b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7126a = 0;
            this.f7127b = 0.5f;
        }
    }

    /* loaded from: classes.dex */
    public class a implements n {
        public a() {
        }

        @Override // n0.n
        public d0 a(View view, d0 d0Var) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            Objects.requireNonNull(collapsingToolbarLayout);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            d0 d0Var2 = x.d.b(collapsingToolbarLayout) ? d0Var : null;
            if (!Objects.equals(collapsingToolbarLayout.O, d0Var2)) {
                collapsingToolbarLayout.O = d0Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return d0Var.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements AppBarLayout.f {
        public b() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, int i10) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.M = i10;
            d0 d0Var = collapsingToolbarLayout.O;
            int e10 = d0Var != null ? d0Var.e() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                f d = CollapsingToolbarLayout.d(childAt);
                int i12 = layoutParams.f7126a;
                if (i12 == 1) {
                    d.b(t3.a.g(-i10, 0, CollapsingToolbarLayout.this.c(childAt)));
                } else if (i12 == 2) {
                    d.b(Math.round((-i10) * layoutParams.f7127b));
                }
            }
            CollapsingToolbarLayout.this.h();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.F != null && e10 > 0) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.k(collapsingToolbarLayout2);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            int d10 = (height - x.d.d(collapsingToolbarLayout3)) - e10;
            com.google.android.material.internal.a aVar = CollapsingToolbarLayout.this.A;
            float f10 = d10;
            float min = Math.min(1.0f, (height - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f10);
            aVar.f7548e = min;
            aVar.f7550f = a0.a.b(1.0f, min, 0.5f, min);
            CollapsingToolbarLayout collapsingToolbarLayout4 = CollapsingToolbarLayout.this;
            com.google.android.material.internal.a aVar2 = collapsingToolbarLayout4.A;
            aVar2.f7552g = collapsingToolbarLayout4.M + d10;
            aVar2.v(Math.abs(i10) / f10);
        }
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018031), attributeSet, i10);
        int i11;
        this.f7118c = true;
        this.f7125z = new Rect();
        this.K = -1;
        this.P = 0;
        this.R = 0;
        Context context2 = getContext();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.A = aVar;
        aVar.O = ga.a.f9889e;
        aVar.l(false);
        aVar.F = false;
        this.B = new ra.a(context2);
        int[] iArr = m9.a.J;
        j.a(context2, attributeSet, i10, 2132018031);
        j.b(context2, attributeSet, iArr, i10, 2132018031, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i10, 2132018031);
        aVar.t(obtainStyledAttributes.getInt(4, 8388691));
        aVar.p(obtainStyledAttributes.getInt(0, 8388627));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        this.y = dimensionPixelSize;
        this.f7124w = dimensionPixelSize;
        this.f7123u = dimensionPixelSize;
        this.f7122t = dimensionPixelSize;
        if (obtainStyledAttributes.hasValue(8)) {
            this.f7122t = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f7124w = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        }
        if (obtainStyledAttributes.hasValue(9)) {
            this.f7123u = obtainStyledAttributes.getDimensionPixelSize(9, 0);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.y = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        }
        this.C = obtainStyledAttributes.getBoolean(20, true);
        setTitle(obtainStyledAttributes.getText(18));
        aVar.r(2132017677);
        aVar.n(2132017645);
        if (obtainStyledAttributes.hasValue(10)) {
            aVar.r(obtainStyledAttributes.getResourceId(10, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            aVar.n(obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            aVar.s(za.c.a(context2, obtainStyledAttributes, 11));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            aVar.o(za.c.a(context2, obtainStyledAttributes, 2));
        }
        this.K = obtainStyledAttributes.getDimensionPixelSize(16, -1);
        if (obtainStyledAttributes.hasValue(14) && (i11 = obtainStyledAttributes.getInt(14, 1)) != aVar.f7551f0) {
            aVar.f7551f0 = i11;
            aVar.e();
            aVar.l(false);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            aVar.x(AnimationUtils.loadInterpolator(context2, obtainStyledAttributes.getResourceId(21, 0)));
        }
        this.J = obtainStyledAttributes.getInt(15, 600);
        setContentScrim(obtainStyledAttributes.getDrawable(3));
        setStatusBarScrim(obtainStyledAttributes.getDrawable(17));
        setTitleCollapseMode(obtainStyledAttributes.getInt(19, 0));
        this.f7119f = obtainStyledAttributes.getResourceId(22, -1);
        this.Q = obtainStyledAttributes.getBoolean(13, false);
        this.S = obtainStyledAttributes.getBoolean(12, false);
        obtainStyledAttributes.recycle();
        setWillNotDraw(false);
        a aVar2 = new a();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.i.u(this, aVar2);
    }

    public static int b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    public static f d(View view) {
        f fVar = (f) view.getTag(R.id.view_offset_helper);
        if (fVar == null) {
            fVar = new f(view);
            view.setTag(R.id.view_offset_helper, fVar);
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006a A[LOOP:1: B:21:0x004c->B:32:0x006a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            boolean r0 = r10.f7118c
            r7 = 4
            if (r0 != 0) goto L6
            return
        L6:
            r9 = 1
            r0 = 0
            r8 = 6
            r10.f7120j = r0
            r10.f7121m = r0
            r9 = 2
            int r1 = r10.f7119f
            r9 = 3
            r6 = -1
            r2 = r6
            if (r1 == r2) goto L3d
            r7 = 4
            android.view.View r1 = r10.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r10.f7120j = r1
            if (r1 == 0) goto L3d
            r8 = 1
            android.view.ViewParent r2 = r1.getParent()
        L25:
            if (r2 == r10) goto L3a
            r9 = 6
            if (r2 == 0) goto L3a
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L33
            r7 = 2
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            r9 = 5
        L33:
            r8 = 2
            android.view.ViewParent r6 = r2.getParent()
            r2 = r6
            goto L25
        L3a:
            r10.f7121m = r1
            r8 = 7
        L3d:
            android.view.ViewGroup r1 = r10.f7120j
            r8 = 5
            r6 = 0
            r2 = r6
            if (r1 != 0) goto L71
            r8 = 3
            int r6 = r10.getChildCount()
            r1 = r6
            r6 = 0
            r3 = r6
        L4c:
            if (r3 >= r1) goto L6f
            android.view.View r6 = r10.getChildAt(r3)
            r4 = r6
            boolean r5 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r5 != 0) goto L60
            boolean r5 = r4 instanceof android.widget.Toolbar
            r7 = 6
            if (r5 == 0) goto L5d
            goto L61
        L5d:
            r7 = 7
            r5 = 0
            goto L63
        L60:
            r7 = 1
        L61:
            r6 = 1
            r5 = r6
        L63:
            if (r5 == 0) goto L6a
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = 2
            goto L6f
        L6a:
            r9 = 6
            int r3 = r3 + 1
            r9 = 6
            goto L4c
        L6f:
            r10.f7120j = r0
        L71:
            r8 = 7
            r10.g()
            r8 = 2
            r10.f7118c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.a():void");
    }

    public final int c(View view) {
        return ((getHeight() - d(view).f7160b) - view.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.f7120j == null && (drawable = this.E) != null && this.G > 0) {
            drawable.mutate().setAlpha(this.G);
            this.E.draw(canvas);
        }
        if (this.C && this.D) {
            if (this.f7120j != null && this.E != null && this.G > 0 && e()) {
                com.google.android.material.internal.a aVar = this.A;
                if (aVar.f7545c < aVar.f7550f) {
                    int save = canvas.save();
                    canvas.clipRect(this.E.getBounds(), Region.Op.DIFFERENCE);
                    this.A.f(canvas);
                    canvas.restoreToCount(save);
                    if (this.F != null || this.G <= 0) {
                    }
                    d0 d0Var = this.O;
                    int e10 = d0Var != null ? d0Var.e() : 0;
                    if (e10 > 0) {
                        this.F.setBounds(0, -this.M, getWidth(), e10 - this.M);
                        this.F.mutate().setAlpha(this.G);
                        this.F.draw(canvas);
                        return;
                    }
                    return;
                }
            }
            this.A.f(canvas);
        }
        if (this.F != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r11 == r9.f7120j) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        /*
            r9 = this;
            r5 = r9
            android.graphics.drawable.Drawable r0 = r5.E
            r8 = 6
            r7 = 1
            r1 = r7
            r8 = 0
            r2 = r8
            if (r0 == 0) goto L51
            r7 = 4
            int r3 = r5.G
            r8 = 3
            if (r3 <= 0) goto L51
            r8 = 3
            android.view.View r3 = r5.f7121m
            r7 = 7
            if (r3 == 0) goto L1e
            r8 = 7
            if (r3 != r5) goto L1a
            goto L1f
        L1a:
            if (r11 != r3) goto L27
            r7 = 1
            goto L24
        L1e:
            r8 = 7
        L1f:
            android.view.ViewGroup r3 = r5.f7120j
            r8 = 4
            if (r11 != r3) goto L27
        L24:
            r8 = 1
            r3 = r8
            goto L2a
        L27:
            r7 = 4
            r8 = 0
            r3 = r8
        L2a:
            if (r3 == 0) goto L51
            r8 = 5
            int r7 = r5.getWidth()
            r3 = r7
            int r7 = r5.getHeight()
            r4 = r7
            r5.f(r0, r11, r3, r4)
            r8 = 1
            android.graphics.drawable.Drawable r0 = r5.E
            android.graphics.drawable.Drawable r7 = r0.mutate()
            r0 = r7
            int r3 = r5.G
            r7 = 3
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r5.E
            r0.draw(r10)
            r7 = 5
            r7 = 1
            r0 = r7
            goto L54
        L51:
            r7 = 5
            r0 = 0
            r7 = 3
        L54:
            boolean r10 = super.drawChild(r10, r11, r12)
            if (r10 != 0) goto L60
            if (r0 == 0) goto L5d
            goto L61
        L5d:
            r8 = 4
            r1 = 0
            r7 = 6
        L60:
            r8 = 5
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.F;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.A;
        if (aVar != null) {
            z10 |= aVar.y(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final boolean e() {
        return this.N == 1;
    }

    public final void f(Drawable drawable, View view, int i10, int i11) {
        if (e() && view != null && this.C) {
            i11 = view.getBottom();
        }
        drawable.setBounds(0, 0, i10, i11);
    }

    public final void g() {
        View view;
        if (!this.C && (view = this.n) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.n);
            }
        }
        if (this.C && this.f7120j != null) {
            if (this.n == null) {
                this.n = new View(getContext());
            }
            if (this.n.getParent() == null) {
                this.f7120j.addView(this.n, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.A.f7560l;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A.f7571x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.E;
    }

    public int getExpandedTitleGravity() {
        return this.A.f7559k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.y;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f7124w;
    }

    public int getExpandedTitleMarginStart() {
        return this.f7122t;
    }

    public int getExpandedTitleMarginTop() {
        return this.f7123u;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A.y;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.A.f7557i0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.A.Z;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.A.Z.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.A.Z.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.A.f7551f0;
    }

    public int getScrimAlpha() {
        return this.G;
    }

    public long getScrimAnimationDuration() {
        return this.J;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10 = this.K;
        if (i10 >= 0) {
            return i10 + this.P + this.R;
        }
        d0 d0Var = this.O;
        int e10 = d0Var != null ? d0Var.e() : 0;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int d = x.d.d(this);
        return d > 0 ? Math.min((d * 2) + e10, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.F;
    }

    public CharSequence getTitle() {
        if (this.C) {
            return this.A.C;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.N;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.A.N;
    }

    public final void h() {
        if (this.E == null && this.F == null) {
            return;
        }
        setScrimsShown(getHeight() + this.M < getScrimVisibleHeightTrigger());
    }

    public final void i(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        int i14;
        int i15;
        int i16;
        if (!this.C || (view = this.n) == null) {
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int i17 = 0;
        boolean z11 = x.g.b(view) && this.n.getVisibility() == 0;
        this.D = z11;
        if (z11 || z10) {
            boolean z12 = x.e.d(this) == 1;
            View view2 = this.f7121m;
            if (view2 == null) {
                view2 = this.f7120j;
            }
            int c10 = c(view2);
            ua.a.a(this, this.n, this.f7125z);
            ViewGroup viewGroup = this.f7120j;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                i17 = toolbar.getTitleMarginStart();
                i15 = toolbar.getTitleMarginEnd();
                i16 = toolbar.getTitleMarginTop();
                i14 = toolbar.getTitleMarginBottom();
            } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                i14 = 0;
                i15 = 0;
                i16 = 0;
            } else {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                i17 = toolbar2.getTitleMarginStart();
                i15 = toolbar2.getTitleMarginEnd();
                i16 = toolbar2.getTitleMarginTop();
                i14 = toolbar2.getTitleMarginBottom();
            }
            com.google.android.material.internal.a aVar = this.A;
            Rect rect = this.f7125z;
            int i18 = rect.left + (z12 ? i15 : i17);
            int i19 = rect.top + c10 + i16;
            int i20 = rect.right;
            if (!z12) {
                i17 = i15;
            }
            int i21 = i20 - i17;
            int i22 = (rect.bottom + c10) - i14;
            if (!com.google.android.material.internal.a.m(aVar.f7556i, i18, i19, i21, i22)) {
                aVar.f7556i.set(i18, i19, i21, i22);
                aVar.K = true;
                aVar.k();
            }
            com.google.android.material.internal.a aVar2 = this.A;
            int i23 = z12 ? this.f7124w : this.f7122t;
            int i24 = this.f7125z.top + this.f7123u;
            int i25 = (i12 - i10) - (z12 ? this.f7122t : this.f7124w);
            int i26 = (i13 - i11) - this.y;
            if (!com.google.android.material.internal.a.m(aVar2.f7554h, i23, i24, i25, i26)) {
                aVar2.f7554h.set(i23, i24, i25, i26);
                aVar2.K = true;
                aVar2.k();
            }
            this.A.l(z10);
        }
    }

    public final void j() {
        if (this.f7120j != null && this.C && TextUtils.isEmpty(this.A.C)) {
            ViewGroup viewGroup = this.f7120j;
            setTitle(viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (e()) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            setFitsSystemWindows(x.d.b(appBarLayout));
            if (this.L == null) {
                this.L = new b();
            }
            AppBarLayout.f fVar = this.L;
            if (appBarLayout.f7103w == null) {
                appBarLayout.f7103w = new ArrayList();
            }
            if (fVar != null && !appBarLayout.f7103w.contains(fVar)) {
                appBarLayout.f7103w.add(fVar);
            }
            x.h.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        List<AppBarLayout.b> list;
        ViewParent parent = getParent();
        AppBarLayout.f fVar = this.L;
        if (fVar != null && (parent instanceof AppBarLayout) && (list = ((AppBarLayout) parent).f7103w) != null && fVar != null) {
            list.remove(fVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d0 d0Var = this.O;
        if (d0Var != null) {
            int e10 = d0Var.e();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                if (!x.d.b(childAt) && childAt.getTop() < e10) {
                    x.o(childAt, e10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            f d = d(getChildAt(i15));
            d.f7160b = d.f7159a.getTop();
            d.f7161c = d.f7159a.getLeft();
        }
        i(i10, i11, i12, i13, false);
        j();
        h();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            d(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        a();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        d0 d0Var = this.O;
        int e10 = d0Var != null ? d0Var.e() : 0;
        if ((mode == 0 || this.Q) && e10 > 0) {
            this.P = e10;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + e10, 1073741824));
        }
        if (this.S && this.A.f7551f0 > 1) {
            j();
            i(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            com.google.android.material.internal.a aVar = this.A;
            int i12 = aVar.f7564q;
            if (i12 > 1) {
                TextPaint textPaint = aVar.M;
                textPaint.setTextSize(aVar.f7561m);
                textPaint.setTypeface(aVar.y);
                textPaint.setLetterSpacing(aVar.Y);
                this.R = (i12 - 1) * Math.round(aVar.M.descent() + (-aVar.M.ascent()));
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.R, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f7120j;
        if (viewGroup != null) {
            View view = this.f7121m;
            if (view != null && view != this) {
                setMinimumHeight(b(view));
                return;
            }
            setMinimumHeight(b(viewGroup));
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.E;
        if (drawable != null) {
            f(drawable, this.f7120j, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        com.google.android.material.internal.a aVar = this.A;
        if (aVar.f7560l != i10) {
            aVar.f7560l = i10;
            aVar.l(false);
        }
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.A.n(i10);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.a aVar = this.A;
        if (aVar.f7563p != colorStateList) {
            aVar.f7563p = colorStateList;
            aVar.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.A.q(typeface);
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.E = mutate;
            if (mutate != null) {
                f(mutate, this.f7120j, getWidth(), getHeight());
                this.E.setCallback(this);
                this.E.setAlpha(this.G);
            }
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.k(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        Context context = getContext();
        Object obj = c0.a.f3717a;
        setContentScrim(a.c.b(context, i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        com.google.android.material.internal.a aVar = this.A;
        if (aVar.f7559k != i10) {
            aVar.f7559k = i10;
            aVar.l(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.y = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f7124w = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f7122t = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f7123u = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.A.r(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.a aVar = this.A;
        if (aVar.f7562o != colorStateList) {
            aVar.f7562o = colorStateList;
            aVar.l(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.A.u(typeface);
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.S = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.Q = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.A.f7557i0 = i10;
    }

    public void setLineSpacingAdd(float f10) {
        this.A.f7553g0 = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.A.f7555h0 = f10;
    }

    public void setMaxLines(int i10) {
        com.google.android.material.internal.a aVar = this.A;
        if (i10 != aVar.f7551f0) {
            aVar.f7551f0 = i10;
            aVar.e();
            aVar.l(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.A.F = z10;
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.G) {
            if (this.E != null && (viewGroup = this.f7120j) != null) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.k(viewGroup);
            }
            this.G = i10;
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            x.d.k(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.J = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.K != i10) {
            this.K = i10;
            h();
        }
    }

    public void setScrimsShown(boolean z10) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int i10 = 0;
        boolean z11 = x.g.c(this) && !isInEditMode();
        if (this.H != z10) {
            int i11 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (z11) {
                if (!z10) {
                    i11 = 0;
                }
                a();
                ValueAnimator valueAnimator = this.I;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.I = valueAnimator2;
                    valueAnimator2.setInterpolator(i11 > this.G ? ga.a.f9888c : ga.a.d);
                    this.I.addUpdateListener(new e(this));
                } else if (valueAnimator.isRunning()) {
                    this.I.cancel();
                }
                this.I.setDuration(this.J);
                this.I.setIntValues(this.G, i11);
                this.I.start();
            } else {
                if (z10) {
                    i10 = KotlinVersion.MAX_COMPONENT_VALUE;
                }
                setScrimAlpha(i10);
            }
            this.H = z10;
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.F;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.F = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.F.setState(getDrawableState());
                }
                Drawable drawable4 = this.F;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                f0.a.c(drawable4, x.e.d(this));
                this.F.setVisible(getVisibility() == 0, false);
                this.F.setCallback(this);
                this.F.setAlpha(this.G);
            }
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            x.d.k(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        Context context = getContext();
        Object obj = c0.a.f3717a;
        setStatusBarScrim(a.c.b(context, i10));
    }

    public void setTitle(CharSequence charSequence) {
        this.A.z(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i10) {
        this.N = i10;
        boolean e10 = e();
        this.A.d = e10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (e()) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (e10 && this.E == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            ra.a aVar = this.B;
            setContentScrimColor(aVar.a(aVar.d, dimension));
        }
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.C) {
            this.C = z10;
            setContentDescription(getTitle());
            g();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        com.google.android.material.internal.a aVar = this.A;
        aVar.N = timeInterpolator;
        aVar.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.F;
        if (drawable != null && drawable.isVisible() != z10) {
            this.F.setVisible(z10, false);
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.E.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.E) {
            if (drawable != this.F) {
                return false;
            }
        }
        return true;
    }
}
