package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import com.app.pornhub.R;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.d0;
import n0.x;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements t, n0.k, n0.l {
    public static final int[] R = {R.attr.actionBarSize, 16842841};
    public boolean A;
    public int B;
    public int C;
    public final Rect D;
    public final Rect E;
    public final Rect F;
    public n0.d0 G;
    public n0.d0 H;
    public n0.d0 I;
    public n0.d0 J;
    public d K;
    public OverScroller L;
    public ViewPropertyAnimator M;
    public final AnimatorListenerAdapter N;
    public final Runnable O;
    public final Runnable P;
    public final n0.m Q;

    /* renamed from: c  reason: collision with root package name */
    public int f723c;

    /* renamed from: f  reason: collision with root package name */
    public int f724f;

    /* renamed from: j  reason: collision with root package name */
    public ContentFrameLayout f725j;

    /* renamed from: m  reason: collision with root package name */
    public ActionBarContainer f726m;
    public u n;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f727t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f728u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f729w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f730z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = null;
            actionBarOverlayLayout.A = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = null;
            actionBarOverlayLayout.A = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = actionBarOverlayLayout.f726m.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.N);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = actionBarOverlayLayout.f726m.animate().translationY(-ActionBarOverlayLayout.this.f726m.getHeight()).setListener(ActionBarOverlayLayout.this.N);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f724f = 0;
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        n0.d0 d0Var = n0.d0.f13112b;
        this.G = d0Var;
        this.H = d0Var;
        this.I = d0Var;
        this.J = d0Var;
        this.N = new a();
        this.O = new b();
        this.P = new c();
        r(context);
        this.Q = new n0.m();
    }

    @Override // androidx.appcompat.widget.t
    public void a(Menu menu, i.a aVar) {
        s();
        this.n.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.t
    public boolean b() {
        s();
        return this.n.b();
    }

    @Override // androidx.appcompat.widget.t
    public void c() {
        s();
        this.n.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.t
    public boolean d() {
        s();
        return this.n.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f727t != null && !this.f728u) {
            if (this.f726m.getVisibility() == 0) {
                i10 = (int) (this.f726m.getTranslationY() + this.f726m.getBottom() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f727t.setBounds(0, i10, getWidth(), this.f727t.getIntrinsicHeight() + i10);
            this.f727t.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.t
    public boolean e() {
        s();
        return this.n.e();
    }

    @Override // androidx.appcompat.widget.t
    public boolean f() {
        s();
        return this.n.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.t
    public boolean g() {
        s();
        return this.n.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f726m;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.Q.a();
    }

    public CharSequence getTitle() {
        s();
        return this.n.getTitle();
    }

    @Override // androidx.appcompat.widget.t
    public void h(int i10) {
        s();
        if (i10 == 2) {
            this.n.t();
        } else if (i10 == 5) {
            this.n.u();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.t
    public void i() {
        s();
        this.n.h();
    }

    @Override // n0.l
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // n0.k
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // n0.k
    public boolean l(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // n0.k
    public void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // n0.k
    public void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // n0.k
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        n0.d0 k10 = n0.d0.k(windowInsets, this);
        boolean p10 = p(this.f726m, new Rect(k10.c(), k10.e(), k10.d(), k10.b()), true, true, false, true);
        Rect rect = this.D;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.i.b(this, k10, rect);
        Rect rect2 = this.D;
        n0.d0 j10 = k10.f13113a.j(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.G = j10;
        boolean z10 = true;
        if (!this.H.equals(j10)) {
            this.H = this.G;
            p10 = true;
        }
        if (this.E.equals(this.D)) {
            z10 = p10;
        } else {
            this.E.set(this.D);
        }
        if (z10) {
            requestLayout();
        }
        return k10.f13113a.a().a().f13113a.b().i();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        s();
        measureChildWithMargins(this.f726m, i10, 0, i11, 0);
        LayoutParams layoutParams = (LayoutParams) this.f726m.getLayoutParams();
        int max = Math.max(0, this.f726m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = Math.max(0, this.f726m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f726m.getMeasuredState());
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        boolean z10 = (x.d.g(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f723c;
            if (this.y && this.f726m.getTabContainer() != null) {
                measuredHeight += this.f723c;
            }
        } else {
            measuredHeight = this.f726m.getVisibility() != 8 ? this.f726m.getMeasuredHeight() : 0;
        }
        this.F.set(this.D);
        n0.d0 d0Var = this.G;
        this.I = d0Var;
        if (this.f729w || z10) {
            e0.b a10 = e0.b.a(d0Var.c(), this.I.e() + measuredHeight, this.I.d(), this.I.b() + 0);
            n0.d0 d0Var2 = this.I;
            int i12 = Build.VERSION.SDK_INT;
            d0.e dVar = i12 >= 30 ? new d0.d(d0Var2) : i12 >= 29 ? new d0.c(d0Var2) : new d0.b(d0Var2);
            dVar.d(a10);
            this.I = dVar.b();
        } else {
            Rect rect = this.F;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.I = d0Var.f13113a.j(0, measuredHeight, 0, 0);
        }
        p(this.f725j, this.F, true, true, true, true);
        if (!this.J.equals(this.I)) {
            n0.d0 d0Var3 = this.I;
            this.J = d0Var3;
            n0.x.e(this.f725j, d0Var3);
        }
        measureChildWithMargins(this.f725j, i10, 0, i11, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f725j.getLayoutParams();
        int max3 = Math.max(max, this.f725j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = Math.max(max2, this.f725j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f725j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (this.f730z && z10) {
            this.L.fling(0, 0, 0, (int) f11, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
            if (this.L.getFinalY() > this.f726m.getHeight()) {
                q();
                this.P.run();
            } else {
                q();
                this.O.run();
            }
            this.A = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.B + i11;
        this.B = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        androidx.appcompat.app.f fVar;
        j.g gVar;
        this.Q.f13149a = i10;
        this.B = getActionBarHideOffset();
        q();
        d dVar = this.K;
        if (dVar == null || (gVar = (fVar = (androidx.appcompat.app.f) dVar).f582t) == null) {
            return;
        }
        gVar.a();
        fVar.f582t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f726m.getVisibility() == 0) {
            return this.f730z;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f730z && !this.A) {
            if (this.B <= this.f726m.getHeight()) {
                q();
                postDelayed(this.O, 600L);
            } else {
                q();
                postDelayed(this.P, 600L);
            }
        }
        d dVar = this.K;
        if (dVar != null) {
            Objects.requireNonNull(dVar);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.C ^ i10;
        this.C = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.K;
        if (dVar != null) {
            ((androidx.appcompat.app.f) dVar).f578p = !z11;
            if (!z10 && z11) {
                androidx.appcompat.app.f fVar = (androidx.appcompat.app.f) dVar;
                if (!fVar.f579q) {
                    fVar.f579q = true;
                    fVar.v(true);
                }
            }
            androidx.appcompat.app.f fVar2 = (androidx.appcompat.app.f) dVar;
            if (fVar2.f579q) {
                fVar2.f579q = false;
                fVar2.v(true);
            }
        }
        if ((i11 & 256) != 0 && this.K != null) {
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            x.h.c(this);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f724f = i10;
        d dVar = this.K;
        if (dVar != null) {
            ((androidx.appcompat.app.f) dVar).f577o = i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.View r6, android.graphics.Rect r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            r6 = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r6 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r6
            r0 = 1
            if (r8 == 0) goto L18
            int r8 = r6.leftMargin
            r3 = 4
            int r1 = r7.left
            r4 = 5
            if (r8 == r1) goto L18
            r3 = 1
            r6.leftMargin = r1
            r2 = 1
            r8 = r2
            goto L1a
        L18:
            r4 = 4
            r8 = 0
        L1a:
            if (r9 == 0) goto L29
            r3 = 5
            int r9 = r6.topMargin
            r4 = 6
            int r1 = r7.top
            r3 = 6
            if (r9 == r1) goto L29
            r6.topMargin = r1
            r3 = 6
            r8 = 1
        L29:
            r3 = 7
            if (r11 == 0) goto L37
            int r9 = r6.rightMargin
            int r11 = r7.right
            if (r9 == r11) goto L37
            r6.rightMargin = r11
            r4 = 3
            r2 = 1
            r8 = r2
        L37:
            r4 = 7
            if (r10 == 0) goto L46
            int r9 = r6.bottomMargin
            r3 = 2
            int r7 = r7.bottom
            if (r9 == r7) goto L46
            r4 = 3
            r6.bottomMargin = r7
            r3 = 3
            goto L47
        L46:
            r0 = r8
        L47:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public void q() {
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        this.f723c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f727t = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f728u = context.getApplicationInfo().targetSdkVersion < 19;
        this.L = new OverScroller(context);
    }

    public void s() {
        u wrapper;
        if (this.f725j == null) {
            this.f725j = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f726m = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof u) {
                wrapper = (u) findViewById;
            } else if (!(findViewById instanceof Toolbar)) {
                StringBuilder m10 = a1.a.m("Can't make a decor toolbar out of ");
                m10.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(m10.toString());
            } else {
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.n = wrapper;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f726m.setTranslationY(-Math.max(0, Math.min(i10, this.f726m.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.K = dVar;
        if (getWindowToken() != null) {
            ((androidx.appcompat.app.f) this.K).f577o = this.f724f;
            int i10 = this.C;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
                x.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.y = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f730z) {
            this.f730z = z10;
            if (!z10) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        s();
        this.n.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.n.setIcon(drawable);
    }

    public void setLogo(int i10) {
        s();
        this.n.m(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f729w = z10;
        this.f728u = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.t
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.n.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.t
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.n.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
