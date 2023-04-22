package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import c0.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] w0 = {16842931};

    /* renamed from: x0  reason: collision with root package name */
    public static final Comparator<e> f3293x0 = new a();

    /* renamed from: y0  reason: collision with root package name */
    public static final Interpolator f3294y0 = new b();

    /* renamed from: z0  reason: collision with root package name */
    public static final l f3295z0 = new l();
    public boolean A;
    public j B;
    public int C;
    public Drawable D;
    public int E;
    public int F;
    public float G;
    public float H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public float U;
    public float V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public VelocityTracker f3296a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f3297b0;

    /* renamed from: c  reason: collision with root package name */
    public int f3298c;

    /* renamed from: c0  reason: collision with root package name */
    public int f3299c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3300d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f3301e0;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<e> f3302f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f3303f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f3304g0;

    /* renamed from: h0  reason: collision with root package name */
    public EdgeEffect f3305h0;

    /* renamed from: i0  reason: collision with root package name */
    public EdgeEffect f3306i0;

    /* renamed from: j  reason: collision with root package name */
    public final e f3307j;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3308j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3309k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3310l0;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f3311m;

    /* renamed from: m0  reason: collision with root package name */
    public List<h> f3312m0;
    public y1.a n;

    /* renamed from: n0  reason: collision with root package name */
    public h f3313n0;

    /* renamed from: o0  reason: collision with root package name */
    public h f3314o0;

    /* renamed from: p0  reason: collision with root package name */
    public List<g> f3315p0;

    /* renamed from: q0  reason: collision with root package name */
    public i f3316q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f3317r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f3318s0;

    /* renamed from: t  reason: collision with root package name */
    public int f3319t;

    /* renamed from: t0  reason: collision with root package name */
    public ArrayList<View> f3320t0;

    /* renamed from: u  reason: collision with root package name */
    public int f3321u;

    /* renamed from: u0  reason: collision with root package name */
    public final Runnable f3322u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f3323v0;

    /* renamed from: w  reason: collision with root package name */
    public Parcelable f3324w;
    public ClassLoader y;

    /* renamed from: z  reason: collision with root package name */
    public Scroller f3325z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3326a;

        /* renamed from: b  reason: collision with root package name */
        public int f3327b;

        /* renamed from: c  reason: collision with root package name */
        public float f3328c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public int f3329e;

        /* renamed from: f  reason: collision with root package name */
        public int f3330f;

        public LayoutParams() {
            super(-1, -1);
            this.f3328c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3328c = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.w0);
            this.f3327b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public int compare(e eVar, e eVar2) {
            return eVar.f3333b - eVar2.f3333b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.v(viewPager.f3319t);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface d {
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f3332a;

        /* renamed from: b  reason: collision with root package name */
        public int f3333b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3334c;
        public float d;

        /* renamed from: e  reason: collision with root package name */
        public float f3335e;
    }

    /* loaded from: classes.dex */
    public class f extends n0.a {
        public f() {
        }

        @Override // n0.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            y1.a aVar;
            this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            y1.a aVar2 = ViewPager.this.n;
            boolean z10 = true;
            accessibilityEvent.setScrollable((aVar2 == null || aVar2.e() <= 1) ? false : false);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.n) != null) {
                accessibilityEvent.setItemCount(aVar.e());
                accessibilityEvent.setFromIndex(ViewPager.this.f3319t);
                accessibilityEvent.setToIndex(ViewPager.this.f3319t);
            }
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            bVar.f13479a.setClassName(ViewPager.class.getName());
            y1.a aVar = ViewPager.this.n;
            bVar.f13479a.setScrollable(aVar != null && aVar.e() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.f13479a.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.f13479a.addAction(ConstantsKt.DEFAULT_BUFFER_SIZE);
            }
        }

        @Override // n0.a
        public boolean g(View view, int i10, Bundle bundle) {
            if (super.g(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (ViewPager.this.canScrollHorizontally(1)) {
                    ViewPager viewPager = ViewPager.this;
                    viewPager.setCurrentItem(viewPager.f3319t + 1);
                    return true;
                }
                return false;
            } else if (i10 == 8192 && ViewPager.this.canScrollHorizontally(-1)) {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f3319t - 1);
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void d(ViewPager viewPager, y1.a aVar, y1.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(int i10, float f10, int i11);

        void b(int i10);

        void c(int i10);
    }

    /* loaded from: classes.dex */
    public interface i {
    }

    /* loaded from: classes.dex */
    public class j extends DataSetObserver {
        public j() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    /* loaded from: classes.dex */
    public static class k extends s0.a {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public int f3337j;

        /* renamed from: m  reason: collision with root package name */
        public Parcelable f3338m;
        public ClassLoader n;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<k> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new k(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public k createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new k[i10];
            }
        }

        public k(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? k.class.getClassLoader() : classLoader;
            this.f3337j = parcel.readInt();
            this.f3338m = parcel.readParcelable(classLoader);
            this.n = classLoader;
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("FragmentPager.SavedState{");
            m10.append(Integer.toHexString(System.identityHashCode(this)));
            m10.append(" position=");
            return android.support.v4.media.a.j(m10, this.f3337j, "}");
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f3337j);
            parcel.writeParcelable(this.f3338m, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class l implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z10 = layoutParams.f3326a;
            return z10 != layoutParams2.f3326a ? z10 ? 1 : -1 : layoutParams.f3329e - layoutParams2.f3329e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3302f = new ArrayList<>();
        this.f3307j = new e();
        this.f3311m = new Rect();
        this.f3321u = -1;
        this.f3324w = null;
        this.y = null;
        this.G = -3.4028235E38f;
        this.H = Float.MAX_VALUE;
        this.M = 1;
        this.W = -1;
        this.f3308j0 = true;
        this.f3322u0 = new c();
        this.f3323v0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f3325z = new Scroller(context2, f3294y0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.R = viewConfiguration.getScaledPagingTouchSlop();
        this.f3297b0 = (int) (400.0f * f10);
        this.f3299c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3305h0 = new EdgeEffect(context2);
        this.f3306i0 = new EdgeEffect(context2);
        this.f3300d0 = (int) (25.0f * f10);
        this.f3301e0 = (int) (2.0f * f10);
        this.P = (int) (f10 * 16.0f);
        x.v(this, new f());
        if (x.d.c(this) == 0) {
            x.d.s(this, 1);
        }
        x.i.u(this, new y1.b(this));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
        }
    }

    public void A(int i10, boolean z10) {
        this.L = false;
        B(i10, z10, false, 0);
    }

    public void B(int i10, boolean z10, boolean z11, int i11) {
        y1.a aVar = this.n;
        if (aVar != null && aVar.e() > 0) {
            if (!z11 && this.f3319t == i10 && this.f3302f.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 >= this.n.e()) {
                i10 = this.n.e() - 1;
            }
            int i12 = this.M;
            int i13 = this.f3319t;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f3302f.size(); i14++) {
                    this.f3302f.get(i14).f3334c = true;
                }
            }
            boolean z12 = this.f3319t != i10;
            if (!this.f3308j0) {
                v(i10);
                z(i10, z10, i11, z12);
                return;
            }
            this.f3319t = i10;
            if (z12) {
                i(i10);
            }
            requestLayout();
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void C(boolean z10, i iVar) {
        int i10 = 1;
        boolean z11 = iVar != null;
        boolean z12 = z11 != (this.f3316q0 != null);
        this.f3316q0 = iVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            if (z10) {
                i10 = 2;
            }
            this.f3318s0 = i10;
            this.f3317r0 = 2;
        } else {
            this.f3318s0 = 0;
        }
        if (z12) {
            v(this.f3319t);
        }
    }

    public final void D() {
        if (this.f3318s0 != 0) {
            ArrayList<View> arrayList = this.f3320t0;
            if (arrayList == null) {
                this.f3320t0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f3320t0.add(getChildAt(i10));
            }
            Collections.sort(this.f3320t0, f3295z0);
        }
    }

    public e a(int i10, int i11) {
        e eVar = new e();
        eVar.f3333b = i10;
        eVar.f3332a = this.n.g(this, i10);
        Objects.requireNonNull(this.n);
        eVar.d = 1.0f;
        if (i11 >= 0 && i11 < this.f3302f.size()) {
            this.f3302f.add(i11, eVar);
            return eVar;
        }
        this.f3302f.add(eVar);
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        e m10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f3333b == this.f3319t) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        e m10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f3333b == this.f3319t) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z10 = layoutParams2.f3326a | (view.getClass().getAnnotation(d.class) != null);
        layoutParams2.f3326a = z10;
        if (!this.J) {
            super.addView(view, i10, layoutParams);
        } else if (z10) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            layoutParams2.d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(g gVar) {
        if (this.f3315p0 == null) {
            this.f3315p0 = new ArrayList();
        }
        this.f3315p0.add(gVar);
    }

    public void c(h hVar) {
        if (this.f3312m0 == null) {
            this.f3312m0 = new ArrayList();
        }
        this.f3312m0.add(hVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        boolean z10 = false;
        if (this.n == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            if (scrollX > ((int) (clientWidth * this.G))) {
                z10 = true;
            }
            return z10;
        }
        if (i10 > 0 && scrollX < ((int) (clientWidth * this.H))) {
            z10 = true;
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.A = true;
        if (this.f3325z.isFinished() || !this.f3325z.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3325z.getCurrX();
        int currY = this.f3325z.getCurrY();
        if (scrollX == currX) {
            if (scrollY != currY) {
            }
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.k(this);
        }
        scrollTo(currX, currY);
        if (!t(currX)) {
            this.f3325z.abortAnimation();
            scrollTo(0, currY);
        }
        WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
        x.d.k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.d(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r9) {
        /*
            r8 = this;
            r5 = r8
            boolean r7 = super.dispatchKeyEvent(r9)
            r0 = r7
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L70
            r7 = 1
            int r7 = r9.getAction()
            r0 = r7
            if (r0 != 0) goto L6c
            r7 = 5
            int r0 = r9.getKeyCode()
            r3 = 21
            r4 = 2
            r7 = 5
            if (r0 == r3) goto L56
            r3 = 22
            if (r0 == r3) goto L40
            r7 = 61
            r3 = r7
            if (r0 == r3) goto L27
            goto L6c
        L27:
            boolean r0 = r9.hasNoModifiers()
            if (r0 == 0) goto L33
            boolean r7 = r5.d(r4)
            r9 = r7
            goto L6e
        L33:
            r7 = 3
            boolean r9 = r9.hasModifiers(r2)
            if (r9 == 0) goto L6c
            boolean r7 = r5.d(r2)
            r9 = r7
            goto L6e
        L40:
            r7 = 5
            boolean r7 = r9.hasModifiers(r4)
            r9 = r7
            if (r9 == 0) goto L4d
            boolean r9 = r5.s()
            goto L6e
        L4d:
            r7 = 66
            r9 = r7
            boolean r7 = r5.d(r9)
            r9 = r7
            goto L6e
        L56:
            r7 = 3
            boolean r9 = r9.hasModifiers(r4)
            if (r9 == 0) goto L63
            r7 = 7
            boolean r9 = r5.r()
            goto L6e
        L63:
            r7 = 6
            r9 = 17
            boolean r7 = r5.d(r9)
            r9 = r7
            goto L6e
        L6c:
            r7 = 0
            r9 = r7
        L6e:
            if (r9 == 0) goto L71
        L70:
            r1 = 1
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e m10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f3333b == this.f3319t && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.D;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public boolean e(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && e(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    public final void f(boolean z10) {
        boolean z11 = this.f3323v0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f3325z.isFinished()) {
                this.f3325z.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3325z.getCurrX();
                int currY = this.f3325z.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        t(currX);
                    }
                }
            }
        }
        this.L = false;
        for (int i10 = 0; i10 < this.f3302f.size(); i10++) {
            e eVar = this.f3302f.get(i10);
            if (eVar.f3334c) {
                eVar.f3334c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (!z10) {
                this.f3322u0.run();
                return;
            }
            Runnable runnable = this.f3322u0;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.m(this, runnable);
        }
    }

    public void g() {
        int e10 = this.n.e();
        this.f3298c = e10;
        boolean z10 = this.f3302f.size() < (this.M * 2) + 1 && this.f3302f.size() < e10;
        int i10 = this.f3319t;
        for (int i11 = 0; i11 < this.f3302f.size(); i11++) {
            y1.a aVar = this.n;
            Object obj = this.f3302f.get(i11).f3332a;
            Objects.requireNonNull(aVar);
        }
        Collections.sort(this.f3302f, f3293x0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
                if (!layoutParams.f3326a) {
                    layoutParams.f3328c = 0.0f;
                }
            }
            B(i10, false, true, 0);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public y1.a getAdapter() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f3318s0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((LayoutParams) this.f3320t0.get(i11).getLayoutParams()).f3330f;
    }

    public int getCurrentItem() {
        return this.f3319t;
    }

    public int getOffscreenPageLimit() {
        return this.M;
    }

    public int getPageMargin() {
        return this.C;
    }

    public final int h(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f3300d0 || Math.abs(i11) <= this.f3297b0) {
            i10 += (int) (f10 + (i10 >= this.f3319t ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f3302f.size() > 0) {
            ArrayList<e> arrayList = this.f3302f;
            return Math.max(this.f3302f.get(0).f3333b, Math.min(i10, arrayList.get(arrayList.size() - 1).f3333b));
        }
        return i10;
    }

    public final void i(int i10) {
        h hVar = this.f3313n0;
        if (hVar != null) {
            hVar.c(i10);
        }
        List<h> list = this.f3312m0;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar2 = this.f3312m0.get(i11);
                if (hVar2 != null) {
                    hVar2.c(i10);
                }
            }
        }
        h hVar3 = this.f3314o0;
        if (hVar3 != null) {
            hVar3.c(i10);
        }
    }

    public void j() {
        if (!this.f3303f0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.n != null) {
            VelocityTracker velocityTracker = this.f3296a0;
            velocityTracker.computeCurrentVelocity(1000, this.f3299c0);
            int xVelocity = (int) velocityTracker.getXVelocity(this.W);
            this.L = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            e n = n();
            B(h(n.f3333b, ((scrollX / clientWidth) - n.f3335e) / n.d, xVelocity, (int) (this.S - this.U)), true, true, xVelocity);
        }
        this.N = false;
        this.O = false;
        VelocityTracker velocityTracker2 = this.f3296a0;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f3296a0 = null;
        }
        this.f3303f0 = false;
    }

    public void k(float f10) {
        ArrayList<e> arrayList;
        if (!this.f3303f0) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.n == null) {
            return;
        }
        this.S += f10;
        float scrollX = getScrollX() - f10;
        float clientWidth = getClientWidth();
        float f11 = this.G * clientWidth;
        float f12 = this.H * clientWidth;
        e eVar = this.f3302f.get(0);
        e eVar2 = this.f3302f.get(arrayList.size() - 1);
        if (eVar.f3333b != 0) {
            f11 = eVar.f3335e * clientWidth;
        }
        if (eVar2.f3333b != this.n.e() - 1) {
            f12 = eVar2.f3335e * clientWidth;
        }
        if (scrollX < f11) {
            scrollX = f11;
        } else if (scrollX > f12) {
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.S = (scrollX - i10) + this.S;
        scrollTo(i10, getScrollY());
        t(i10);
        MotionEvent obtain = MotionEvent.obtain(this.f3304g0, SystemClock.uptimeMillis(), 2, this.S, 0.0f, 0);
        this.f3296a0.addMovement(obtain);
        obtain.recycle();
    }

    public final Rect l(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while (true) {
            ViewParent viewParent = parent;
            if (!(viewParent instanceof ViewGroup) || viewParent == this) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) viewParent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public e m(View view) {
        for (int i10 = 0; i10 < this.f3302f.size(); i10++) {
            e eVar = this.f3302f.get(i10);
            if (this.n.h(view, eVar.f3332a)) {
                return eVar;
            }
        }
        return null;
    }

    public final e n() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.C / clientWidth : 0.0f;
        e eVar = null;
        float f12 = 0.0f;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = true;
        while (i12 < this.f3302f.size()) {
            e eVar2 = this.f3302f.get(i12);
            if (!z10 && eVar2.f3333b != (i10 = i11 + 1)) {
                eVar2 = this.f3307j;
                eVar2.f3335e = f10 + f12 + f11;
                eVar2.f3333b = i10;
                Objects.requireNonNull(this.n);
                eVar2.d = 1.0f;
                i12--;
            }
            f10 = eVar2.f3335e;
            float f13 = eVar2.d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return eVar;
            }
            if (scrollX < f13 || i12 == this.f3302f.size() - 1) {
                return eVar2;
            }
            i11 = eVar2.f3333b;
            f12 = eVar2.d;
            i12++;
            eVar = eVar2;
            z10 = false;
        }
        return eVar;
    }

    public e o(int i10) {
        for (int i11 = 0; i11 < this.f3302f.size(); i11++) {
            e eVar = this.f3302f.get(i11);
            if (eVar.f3333b == i10) {
                return eVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3308j0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3322u0);
        Scroller scroller = this.f3325z;
        if (scroller != null && !scroller.isFinished()) {
            this.f3325z.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.C <= 0 || this.D == null || this.f3302f.size() <= 0 || this.n == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f12 = this.C / width2;
        int i11 = 0;
        e eVar = this.f3302f.get(0);
        float f13 = eVar.f3335e;
        int size = this.f3302f.size();
        int i12 = eVar.f3333b;
        int i13 = this.f3302f.get(size - 1).f3333b;
        while (i12 < i13) {
            while (true) {
                i10 = eVar.f3333b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                eVar = this.f3302f.get(i11);
            }
            if (i12 == i10) {
                float f14 = eVar.f3335e;
                float f15 = eVar.d;
                f10 = (f14 + f15) * width2;
                f13 = f14 + f15 + f12;
            } else {
                Objects.requireNonNull(this.n);
                f10 = (f13 + 1.0f) * width2;
                f13 = 1.0f + f12 + f13;
            }
            if (this.C + f10 > scrollX) {
                f11 = f12;
                this.D.setBounds(Math.round(f10), this.E, Math.round(this.C + f10), this.F);
                this.D.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
        if (action == 3 || action == 1) {
            y();
            return false;
        }
        if (action != 0) {
            if (this.N) {
                return true;
            }
            if (this.O) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.U = x10;
            this.S = x10;
            float y = motionEvent.getY();
            this.V = y;
            this.T = y;
            this.W = motionEvent.getPointerId(0);
            this.O = false;
            this.A = true;
            this.f3325z.computeScrollOffset();
            if (this.f3323v0 != 2 || Math.abs(this.f3325z.getFinalX() - this.f3325z.getCurrX()) <= this.f3301e0) {
                f(false);
                this.N = false;
            } else {
                this.f3325z.abortAnimation();
                this.L = false;
                v(this.f3319t);
                this.N = true;
                x(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.W;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.S;
                float abs = Math.abs(f10);
                float y10 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y10 - this.V);
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    float f11 = this.S;
                    if (!((f11 < ((float) this.Q) && i11 > 0) || (f11 > ((float) (getWidth() - this.Q)) && f10 < 0.0f)) && e(this, false, (int) f10, (int) x11, (int) y10)) {
                        this.S = x11;
                        this.T = y10;
                        this.O = true;
                        return false;
                    }
                }
                int i12 = this.R;
                if (abs > i12 && abs * 0.5f > abs2) {
                    this.N = true;
                    x(true);
                    setScrollState(1);
                    float f12 = this.U;
                    float f13 = this.R;
                    this.S = i11 > 0 ? f12 + f13 : f12 - f13;
                    this.T = y10;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i12) {
                    this.O = true;
                }
                if (this.N && u(x11)) {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    x.d.k(this);
                }
            }
        } else if (action == 6) {
            q(motionEvent);
        }
        if (this.f3296a0 == null) {
            this.f3296a0 = VelocityTracker.obtain();
        }
        this.f3296a0.addMovement(motionEvent);
        return this.N;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        e m10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (m10 = m(childAt)) != null && m10.f3333b == this.f3319t && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.f14775c);
        y1.a aVar = this.n;
        if (aVar != null) {
            aVar.i(kVar.f3338m, kVar.n);
            B(kVar.f3337j, false, true, 0);
            return;
        }
        this.f3321u = kVar.f3337j;
        this.f3324w = kVar.f3338m;
        this.y = kVar.n;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f3337j = this.f3319t;
        y1.a aVar = this.n;
        if (aVar != null) {
            kVar.f3338m = aVar.j();
        }
        return kVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.C;
            w(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y1.a aVar;
        if (this.f3303f0) {
            return true;
        }
        boolean z10 = false;
        if ((motionEvent.getAction() != 0 || motionEvent.getEdgeFlags() == 0) && (aVar = this.n) != null && aVar.e() != 0) {
            if (this.f3296a0 == null) {
                this.f3296a0 = VelocityTracker.obtain();
            }
            this.f3296a0.addMovement(motionEvent);
            int action = motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE;
            if (action == 0) {
                this.f3325z.abortAnimation();
                this.L = false;
                v(this.f3319t);
                float x10 = motionEvent.getX();
                this.U = x10;
                this.S = x10;
                float y = motionEvent.getY();
                this.V = y;
                this.T = y;
                this.W = motionEvent.getPointerId(0);
            } else if (action != 1) {
                if (action == 2) {
                    if (!this.N) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.W);
                        if (findPointerIndex == -1) {
                            z10 = y();
                        } else {
                            float x11 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x11 - this.S);
                            float y10 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y10 - this.T);
                            if (abs > this.R && abs > abs2) {
                                this.N = true;
                                x(true);
                                float f10 = this.U;
                                this.S = x11 - f10 > 0.0f ? f10 + this.R : f10 - this.R;
                                this.T = y10;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.N) {
                        z10 = false | u(motionEvent.getX(motionEvent.findPointerIndex(this.W)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.S = motionEvent.getX(actionIndex);
                        this.W = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        q(motionEvent);
                        this.S = motionEvent.getX(motionEvent.findPointerIndex(this.W));
                    }
                } else if (this.N) {
                    z(this.f3319t, true, 0, false);
                    z10 = y();
                }
            } else if (this.N) {
                VelocityTracker velocityTracker = this.f3296a0;
                velocityTracker.computeCurrentVelocity(1000, this.f3299c0);
                int xVelocity = (int) velocityTracker.getXVelocity(this.W);
                this.L = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                e n = n();
                float f11 = clientWidth;
                B(h(n.f3333b, ((scrollX / f11) - n.f3335e) / (n.d + (this.C / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.W)) - this.U)), true, true, xVelocity);
                z10 = y();
            }
            if (z10) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.k(this);
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(int r18, float r19, int r20) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.p(int, float, int):void");
    }

    public final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.S = motionEvent.getX(i10);
            this.W = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f3296a0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean r() {
        int i10 = this.f3319t;
        if (i10 > 0) {
            A(i10 - 1, true);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.J) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s() {
        y1.a aVar = this.n;
        if (aVar == null || this.f3319t >= aVar.e() - 1) {
            return false;
        }
        A(this.f3319t + 1, true);
        return true;
    }

    public void setAdapter(y1.a aVar) {
        y1.a aVar2 = this.n;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f18385b = null;
            }
            this.n.l(this);
            for (int i10 = 0; i10 < this.f3302f.size(); i10++) {
                e eVar = this.f3302f.get(i10);
                this.n.c(this, eVar.f3333b, eVar.f3332a);
            }
            this.n.d(this);
            this.f3302f.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i11).getLayoutParams()).f3326a) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.f3319t = 0;
            scrollTo(0, 0);
        }
        y1.a aVar3 = this.n;
        this.n = aVar;
        this.f3298c = 0;
        if (aVar != null) {
            if (this.B == null) {
                this.B = new j();
            }
            y1.a aVar4 = this.n;
            j jVar = this.B;
            synchronized (aVar4) {
                try {
                    aVar4.f18385b = jVar;
                } finally {
                }
            }
            this.L = false;
            boolean z10 = this.f3308j0;
            this.f3308j0 = true;
            this.f3298c = this.n.e();
            if (this.f3321u >= 0) {
                this.n.i(this.f3324w, this.y);
                B(this.f3321u, false, true, 0);
                this.f3321u = -1;
                this.f3324w = null;
                this.y = null;
            } else if (z10) {
                requestLayout();
            } else {
                v(this.f3319t);
            }
        }
        List<g> list = this.f3315p0;
        if (list != null && !list.isEmpty()) {
            int size = this.f3315p0.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f3315p0.get(i12).d(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.L = false;
        B(i10, !this.f3308j0, false, 0);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.M) {
            this.M = i10;
            v(this.f3319t);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.f3313n0 = hVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.C;
        this.C = i10;
        int width = getWidth();
        w(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = c0.a.f3717a;
        setPageMarginDrawable(a.c.b(context, i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.D = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.f3323v0 == i10) {
            return;
        }
        this.f3323v0 = i10;
        if (this.f3316q0 != null) {
            boolean z10 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z10 ? this.f3317r0 : 0, null);
            }
        }
        h hVar = this.f3313n0;
        if (hVar != null) {
            hVar.b(i10);
        }
        List<h> list = this.f3312m0;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                h hVar2 = this.f3312m0.get(i12);
                if (hVar2 != null) {
                    hVar2.b(i10);
                }
            }
        }
        h hVar3 = this.f3314o0;
        if (hVar3 != null) {
            hVar3.b(i10);
        }
    }

    public final boolean t(int i10) {
        if (this.f3302f.size() == 0) {
            if (this.f3308j0) {
                return false;
            }
            this.f3309k0 = false;
            p(0, 0.0f, 0);
            if (this.f3309k0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        e n = n();
        int clientWidth = getClientWidth();
        int i11 = this.C;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = n.f3333b;
        float f11 = ((i10 / f10) - n.f3335e) / (n.d + (i11 / f10));
        this.f3309k0 = false;
        p(i13, f11, (int) (i12 * f11));
        if (this.f3309k0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean u(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.S - f10;
        this.S = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.G * clientWidth;
        float f13 = this.H * clientWidth;
        boolean z12 = false;
        e eVar = this.f3302f.get(0);
        ArrayList<e> arrayList = this.f3302f;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f3333b != 0) {
            f12 = eVar.f3335e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f3333b != this.n.e() - 1) {
            f13 = eVar2.f3335e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f3305h0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f3306i0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.S = (scrollX - i10) + this.S;
        scrollTo(i10, getScrollY());
        t(i10);
        return z12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r5 == r6) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0332  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v(int r15) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.v(int):void");
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.D) {
            return false;
        }
        return true;
    }

    public final void w(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f3302f.isEmpty()) {
            if (this.f3325z.isFinished()) {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            } else {
                this.f3325z.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
        }
        e o10 = o(this.f3319t);
        int min = (int) ((o10 != null ? Math.min(o10.f3335e, this.H) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            f(false);
            scrollTo(min, getScrollY());
        }
    }

    public final void x(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final boolean y() {
        this.W = -1;
        this.N = false;
        this.O = false;
        VelocityTracker velocityTracker = this.f3296a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3296a0 = null;
        }
        this.f3305h0.onRelease();
        this.f3306i0.onRelease();
        if (!this.f3305h0.isFinished() && !this.f3306i0.isFinished()) {
            return false;
        }
        return true;
    }

    public final void z(int i10, boolean z10, int i11, boolean z11) {
        int scrollX;
        int abs;
        e o10 = o(i10);
        int max = o10 != null ? (int) (Math.max(this.G, Math.min(o10.f3335e, this.H)) * getClientWidth()) : 0;
        if (z10) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.f3325z;
                if ((scroller == null || scroller.isFinished()) ? false : true) {
                    scrollX = this.A ? this.f3325z.getCurrX() : this.f3325z.getStartX();
                    this.f3325z.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int i12 = scrollX;
                int scrollY = getScrollY();
                int i13 = max - i12;
                int i14 = 0 - scrollY;
                if (i13 == 0 && i14 == 0) {
                    f(false);
                    v(this.f3319t);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    float f10 = clientWidth;
                    float f11 = clientWidth / 2;
                    float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                    int abs2 = Math.abs(i11);
                    if (abs2 > 0) {
                        abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        Objects.requireNonNull(this.n);
                        abs = (int) (((Math.abs(i13) / ((f10 * 1.0f) + this.C)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(abs, 600);
                    this.A = false;
                    this.f3325z.startScroll(i12, scrollY, i13, i14, min);
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    x.d.k(this);
                }
            }
            if (z11) {
                i(i10);
            }
        } else {
            if (z11) {
                i(i10);
            }
            f(false);
            scrollTo(max, 0);
            t(max);
        }
    }
}
