package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.i;
import n0.j;
import n0.l;
import n0.m;
import n0.x;
import o0.b;
import q0.e;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements l, i {
    public static final a Q = new a();
    public static final int[] R = {16843130};
    public VelocityTracker A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final int[] H;
    public final int[] I;
    public int J;
    public int K;
    public c L;
    public final m M;
    public final j N;
    public float O;
    public b P;

    /* renamed from: c  reason: collision with root package name */
    public long f1884c;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f1885f;

    /* renamed from: j  reason: collision with root package name */
    public OverScroller f1886j;

    /* renamed from: m  reason: collision with root package name */
    public EdgeEffect f1887m;
    public EdgeEffect n;

    /* renamed from: t  reason: collision with root package name */
    public int f1888t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1889u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1890w;
    public View y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1891z;

    /* loaded from: classes.dex */
    public static class a extends n0.a {
        @Override // n0.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            int scrollRange;
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            bVar.f13479a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            bVar.f13479a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                bVar.a(b.a.f13486i);
                bVar.a(b.a.f13490m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                bVar.a(b.a.f13485h);
                bVar.a(b.a.n);
            }
        }

        @Override // n0.a
        public boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i10 != 4096) {
                    if (i10 == 8192 || i10 == 16908344) {
                        int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (max != nestedScrollView.getScrollY()) {
                            nestedScrollView.z(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), 250, true);
                            return true;
                        }
                        return false;
                    } else if (i10 != 16908346) {
                        return false;
                    }
                }
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min != nestedScrollView.getScrollY()) {
                    nestedScrollView.z(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* loaded from: classes.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f1892c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f1892c = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("HorizontalScrollView.SavedState{");
            m10.append(Integer.toHexString(System.identityHashCode(this)));
            m10.append(" scrollPosition=");
            return android.support.v4.media.a.j(m10, this.f1892c, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1892c);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1885f = new Rect();
        this.f1889u = true;
        this.f1890w = false;
        this.y = null;
        this.f1891z = false;
        this.C = true;
        this.G = -1;
        this.H = new int[2];
        this.I = new int[2];
        this.f1887m = i0.a.a() ? e.a.a(context, attributeSet) : new EdgeEffect(context);
        this.n = i0.a.a() ? e.a.a(context, attributeSet) : new EdgeEffect(context);
        this.f1886j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.D = viewConfiguration.getScaledTouchSlop();
        this.E = viewConfiguration.getScaledMinimumFlingVelocity();
        this.F = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.M = new m();
        this.N = new j(this);
        setNestedScrollingEnabled(true);
        x.v(this, Q);
    }

    public static int c(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.O == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.O = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.O;
    }

    public static boolean q(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && q((View) parent, view2);
    }

    public boolean A(int i10, int i11) {
        return this.N.k(i10, i11);
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z10;
        if (e.a(this.f1887m) != 0.0f) {
            e.b(this.f1887m, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        } else {
            z10 = false;
        }
        if (e.a(this.n) != 0.0f) {
            e.b(this.n, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            return true;
        }
        return z10;
    }

    public void C(int i10) {
        this.N.l(i10);
    }

    public final void a() {
        this.f1886j.abortAnimation();
        this.N.l(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !r(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1885f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1885f);
            f(d(this.f1885f));
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && (!r(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f1886j.isFinished()) {
            return;
        }
        this.f1886j.computeScrollOffset();
        int currY = this.f1886j.getCurrY();
        int i10 = currY - this.K;
        this.K = currY;
        int[] iArr = this.I;
        boolean z10 = false;
        iArr[1] = 0;
        e(0, i10, iArr, null, 1);
        int i11 = i10 - this.I[1];
        int scrollRange = getScrollRange();
        if (i11 != 0) {
            int scrollY = getScrollY();
            u(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.I;
            iArr2[1] = 0;
            this.N.g(0, scrollY2, 0, i12, this.H, 1, iArr2);
            i11 = i12 - this.I[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i11 < 0) {
                    if (this.f1887m.isFinished()) {
                        this.f1887m.onAbsorb((int) this.f1886j.getCurrVelocity());
                    }
                } else if (this.n.isFinished()) {
                    this.n.onAbsorb((int) this.f1886j.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f1886j.isFinished()) {
            this.N.l(1);
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.k(this);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    public int d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !g(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.N.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.N.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return e(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.N.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f1887m.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.f1887m.setSize(width, height);
            if (this.f1887m.draw(canvas)) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.n.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.n.setSize(width2, height2);
            if (this.n.draw(canvas)) {
                WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                x.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public boolean e(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.N.d(i10, i11, iArr, iArr2, i12);
    }

    public final void f(int i10) {
        if (i10 != 0) {
            if (this.C) {
                z(0, i10, 250, false);
                return;
            }
            scrollBy(0, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(android.view.KeyEvent r9) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.g(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.M.a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public void h(int i10) {
        if (getChildCount() > 0) {
            this.f1886j.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, 0, 0);
            w(true);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return p(0);
    }

    public boolean i(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1885f;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1885f.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1885f;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1885f;
        return x(i10, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.N.d;
    }

    @Override // n0.l
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        s(i13, i14, iArr);
    }

    @Override // n0.k
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        s(i13, i14, null);
    }

    @Override // n0.k
    public boolean l(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // n0.k
    public void m(View view, View view2, int i10, int i11) {
        m mVar = this.M;
        if (i11 == 1) {
            mVar.f13150b = i10;
        } else {
            mVar.f13149a = i10;
        }
        A(2, i11);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // n0.k
    public void n(View view, int i10) {
        m mVar = this.M;
        if (i10 == 1) {
            mVar.f13150b = 0;
        } else {
            mVar.f13149a = 0;
        }
        C(i10);
    }

    @Override // n0.k
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        e(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1890w = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0) {
            if (motionEvent.getAction() == 8) {
                if (!this.f1891z) {
                    float axisValue = motionEvent.getAxisValue(9);
                    if (axisValue != 0.0f) {
                        int scrollRange = getScrollRange();
                        int scrollY = getScrollY();
                        int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                        if (verticalScrollFactorCompat < 0) {
                            scrollRange = 0;
                        } else if (verticalScrollFactorCompat <= scrollRange) {
                            scrollRange = verticalScrollFactorCompat;
                        }
                        if (scrollRange != scrollY) {
                            super.scrollTo(getScrollX(), scrollRange);
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f1889u = false;
        View view = this.y;
        if (view != null && q(view, this)) {
            y(this.y);
        }
        this.y = null;
        if (!this.f1890w) {
            if (this.L != null) {
                scrollTo(getScrollX(), this.L.f1892c);
                this.L = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c10 = c(scrollY, paddingTop, i14);
            if (c10 != scrollY) {
                scrollTo(getScrollX(), c10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1890w = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.B && View.MeasureSpec.getMode(i11) != 0) {
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
                if (measuredHeight < measuredHeight2) {
                    childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        h((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        e(i10, i11, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        s(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.M.f13149a = i10;
        A(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && !(true ^ r(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.L = cVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f1892c = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        b bVar = this.P;
        if (bVar != null) {
            bVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null) {
            if (this == findFocus) {
                return;
            }
            if (r(findFocus, 0, i13)) {
                findFocus.getDrawingRect(this.f1885f);
                offsetDescendantRectToMyCoords(findFocus, this.f1885f);
                f(d(this.f1885f));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.M.f13149a = 0;
        C(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0267  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(int i10) {
        return this.N.h(i10) != null;
    }

    public final boolean r(View view, int i10, int i11) {
        view.getDrawingRect(this.f1885f);
        offsetDescendantRectToMyCoords(view, this.f1885f);
        return this.f1885f.bottom + i10 >= getScrollY() && this.f1885f.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1889u) {
            this.y = view2;
        } else {
            y(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d = d(rect);
        boolean z11 = d != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, d);
                return z11;
            }
            z(0, d, 250, false);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            v();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1889u = true;
        super.requestLayout();
    }

    public final void s(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.N.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c10 = c(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c11 = c(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c10 == getScrollX()) {
                if (c11 != getScrollY()) {
                }
            }
            super.scrollTo(c10, c11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.B) {
            this.B = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        j jVar = this.N;
        if (jVar.d) {
            View view = jVar.f13147c;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.i.z(view);
        }
        jVar.d = z10;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.P = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.C = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.N.k(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.N.l(0);
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.G) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1888t = (int) motionEvent.getY(i10);
            this.G = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.A;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 7
            r4 = 0
            r5 = 0
            r5 = 1
            if (r2 <= r3) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L22
            r3 = 1
            goto L23
        L22:
            r3 = 0
        L23:
            if (r1 == 0) goto L2d
            if (r1 != r5) goto L2a
            if (r2 == 0) goto L2a
            goto L2d
        L2a:
            r2 = 1
            r2 = 0
            goto L2f
        L2d:
            r2 = 0
            r2 = 1
        L2f:
            if (r1 == 0) goto L38
            if (r1 != r5) goto L36
            if (r3 == 0) goto L36
            goto L38
        L36:
            r1 = 0
            goto L39
        L38:
            r1 = 1
        L39:
            int r3 = r15 + r13
            if (r2 != 0) goto L3f
            r2 = 0
            goto L41
        L3f:
            r2 = r19
        L41:
            int r6 = r16 + r14
            if (r1 != 0) goto L48
            r1 = 7
            r1 = 0
            goto L4a
        L48:
            r1 = r20
        L4a:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L56
            r3 = r2
        L53:
            r2 = 6
            r2 = 1
            goto L5c
        L56:
            if (r3 >= r7) goto L5a
            r3 = r7
            goto L53
        L5a:
            r2 = 2
            r2 = 0
        L5c:
            if (r6 <= r1) goto L62
            r6 = r1
        L5f:
            r1 = 2
            r1 = 1
            goto L68
        L62:
            if (r6 >= r8) goto L66
            r6 = r8
            goto L5f
        L66:
            r1 = 7
            r1 = 0
        L68:
            if (r1 == 0) goto L89
            boolean r7 = r12.p(r5)
            if (r7 != 0) goto L89
            android.widget.OverScroller r7 = r0.f1886j
            r8 = 3
            r8 = 0
            r9 = 0
            r10 = 5
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L89:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L90
            if (r1 == 0) goto L91
        L90:
            r4 = 1
        L91:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(int, int, int, int, int, int, int, int):boolean");
    }

    public final void v() {
        VelocityTracker velocityTracker = this.A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A = null;
        }
    }

    public final void w(boolean z10) {
        if (z10) {
            A(2, 1);
        } else {
            this.N.l(1);
        }
        this.K = getScrollY();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.k(this);
    }

    public final boolean x(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = (View) focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z14) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            f(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    public final void y(View view) {
        view.getDrawingRect(this.f1885f);
        offsetDescendantRectToMyCoords(view, this.f1885f);
        int d = d(this.f1885f);
        if (d != 0) {
            scrollBy(0, d);
        }
    }

    public final void z(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1884c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f1886j;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
            w(z10);
        } else {
            if (!this.f1886j.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f1884c = AnimationUtils.currentAnimationTimeMillis();
    }
}
