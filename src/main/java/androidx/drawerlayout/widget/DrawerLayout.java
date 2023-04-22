package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c0.a;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.x;
import o0.b;
import o0.d;
import t0.c;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    public static final int[] T = {16843828};
    public static final int[] U = {16842931};
    public static final boolean V;
    public static final boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public static boolean f1910a0;
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public e I;
    public List<e> J;
    public float K;
    public float L;
    public Drawable M;
    public Object N;
    public boolean O;
    public final ArrayList<View> P;
    public Rect Q;
    public Matrix R;
    public final o0.d S;

    /* renamed from: c  reason: collision with root package name */
    public final d f1911c;

    /* renamed from: f  reason: collision with root package name */
    public float f1912f;

    /* renamed from: j  reason: collision with root package name */
    public int f1913j;

    /* renamed from: m  reason: collision with root package name */
    public int f1914m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public Paint f1915t;

    /* renamed from: u  reason: collision with root package name */
    public final t0.c f1916u;

    /* renamed from: w  reason: collision with root package name */
    public final t0.c f1917w;
    public final g y;

    /* renamed from: z  reason: collision with root package name */
    public final g f1918z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1919a;

        /* renamed from: b  reason: collision with root package name */
        public float f1920b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1921c;
        public int d;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f1919a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1919a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.U);
            this.f1919a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1919a = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1919a = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f1919a = 0;
            this.f1919a = layoutParams.f1919a;
        }
    }

    /* loaded from: classes.dex */
    public class a implements o0.d {
        public a() {
        }

        @Override // o0.d
        public boolean a(View view, d.a aVar) {
            if (!DrawerLayout.this.k(view) || DrawerLayout.this.g(view) == 2) {
                return false;
            }
            DrawerLayout.this.b(view);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnApplyWindowInsetsListener {
        public b(DrawerLayout drawerLayout) {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z10 = true;
            boolean z11 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.N = windowInsets;
            drawerLayout.O = z11;
            drawerLayout.setWillNotDraw((z11 || drawerLayout.getBackground() != null) ? false : false);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    public class c extends n0.a {
        public final Rect d = new Rect();

        public c() {
        }

        @Override // n0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.getText();
                View f10 = DrawerLayout.this.f();
                if (f10 != null) {
                    int h10 = DrawerLayout.this.h(f10);
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    Objects.requireNonNull(drawerLayout);
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    Gravity.getAbsoluteGravity(h10, x.e.d(drawerLayout));
                }
                return true;
            }
            return this.f13090a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // n0.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            if (DrawerLayout.V) {
                this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(bVar.f13479a);
                this.f13090a.onInitializeAccessibilityNodeInfo(view, obtain);
                bVar.f13481c = -1;
                bVar.f13479a.setSource(view);
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                ViewParent f10 = x.d.f(view);
                if (f10 instanceof View) {
                    bVar.t((View) f10);
                }
                Rect rect = this.d;
                obtain.getBoundsInScreen(rect);
                bVar.f13479a.setBoundsInScreen(rect);
                bVar.f13479a.setVisibleToUser(obtain.isVisibleToUser());
                bVar.f13479a.setPackageName(obtain.getPackageName());
                bVar.f13479a.setClassName(obtain.getClassName());
                bVar.f13479a.setContentDescription(obtain.getContentDescription());
                bVar.f13479a.setEnabled(obtain.isEnabled());
                bVar.f13479a.setFocused(obtain.isFocused());
                bVar.f13479a.setAccessibilityFocused(obtain.isAccessibilityFocused());
                bVar.f13479a.setSelected(obtain.isSelected());
                bVar.f13479a.addAction(obtain.getActions());
                obtain.recycle();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (DrawerLayout.i(childAt)) {
                        bVar.f13479a.addChild(childAt);
                    }
                }
            }
            bVar.f13479a.setClassName("androidx.drawerlayout.widget.DrawerLayout");
            bVar.f13479a.setFocusable(false);
            bVar.f13479a.setFocused(false);
            bVar.o(b.a.f13482e);
            bVar.o(b.a.f13483f);
        }

        @Override // n0.a
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!DrawerLayout.V && !DrawerLayout.i(view)) {
                return false;
            }
            return this.f13090a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends n0.a {
        @Override // n0.a
        public void d(View view, o0.b bVar) {
            this.f13090a.onInitializeAccessibilityNodeInfo(view, bVar.f13479a);
            if (!DrawerLayout.i(view)) {
                bVar.t(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    /* loaded from: classes.dex */
    public static class f extends s0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public int f1924j;

        /* renamed from: m  reason: collision with root package name */
        public int f1925m;
        public int n;

        /* renamed from: t  reason: collision with root package name */
        public int f1926t;

        /* renamed from: u  reason: collision with root package name */
        public int f1927u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1924j = 0;
            this.f1924j = parcel.readInt();
            this.f1925m = parcel.readInt();
            this.n = parcel.readInt();
            this.f1926t = parcel.readInt();
            this.f1927u = parcel.readInt();
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f1924j = 0;
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f1924j);
            parcel.writeInt(this.f1925m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.f1926t);
            parcel.writeInt(this.f1927u);
        }
    }

    /* loaded from: classes.dex */
    public class g extends c.AbstractC0267c {

        /* renamed from: a  reason: collision with root package name */
        public final int f1928a;

        /* renamed from: b  reason: collision with root package name */
        public t0.c f1929b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f1930c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                View d;
                int width;
                g gVar = g.this;
                int i10 = gVar.f1929b.f15089o;
                boolean z10 = gVar.f1928a == 3;
                if (z10) {
                    d = DrawerLayout.this.d(3);
                    width = (d != null ? -d.getWidth() : 0) + i10;
                } else {
                    d = DrawerLayout.this.d(5);
                    width = DrawerLayout.this.getWidth() - i10;
                }
                if (d != null && (((z10 && d.getLeft() < width) || (!z10 && d.getLeft() > width)) && DrawerLayout.this.g(d) == 0)) {
                    gVar.f1929b.z(d, width, d.getTop());
                    ((LayoutParams) d.getLayoutParams()).f1921c = true;
                    DrawerLayout.this.invalidate();
                    gVar.l();
                    DrawerLayout drawerLayout = DrawerLayout.this;
                    if (!drawerLayout.H) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        int childCount = drawerLayout.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            drawerLayout.getChildAt(i11).dispatchTouchEvent(obtain);
                        }
                        obtain.recycle();
                        drawerLayout.H = true;
                    }
                }
            }
        }

        public g(int i10) {
            this.f1928a = i10;
        }

        @Override // t0.c.AbstractC0267c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // t0.c.AbstractC0267c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // t0.c.AbstractC0267c
        public int c(View view) {
            if (DrawerLayout.this.l(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // t0.c.AbstractC0267c
        public void e(int i10, int i11) {
            View d = (i10 & 1) == 1 ? DrawerLayout.this.d(3) : DrawerLayout.this.d(5);
            if (d == null || DrawerLayout.this.g(d) != 0) {
                return;
            }
            this.f1929b.c(d, i11);
        }

        @Override // t0.c.AbstractC0267c
        public void f(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f1930c, 160L);
        }

        @Override // t0.c.AbstractC0267c
        public void g(View view, int i10) {
            ((LayoutParams) view.getLayoutParams()).f1921c = false;
            l();
        }

        @Override // t0.c.AbstractC0267c
        public void h(int i10) {
            DrawerLayout.this.r(i10, this.f1929b.f15094t);
        }

        @Override // t0.c.AbstractC0267c
        public void i(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.a(view, 3) ? i10 + width : DrawerLayout.this.getWidth() - i10) / width;
            DrawerLayout.this.o(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // t0.c.AbstractC0267c
        public void j(View view, float f10, float f11) {
            int i10;
            Objects.requireNonNull(DrawerLayout.this);
            float f12 = ((LayoutParams) view.getLayoutParams()).f1920b;
            int width = view.getWidth();
            if (DrawerLayout.this.a(view, 3)) {
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                i10 = (i11 > 0 || (i11 == 0 && f12 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 >= 0.0f) {
                    if (f10 == 0.0f && f12 > 0.5f) {
                    }
                    i10 = width2;
                }
                width2 -= width;
                i10 = width2;
            }
            this.f1929b.x(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // t0.c.AbstractC0267c
        public boolean k(View view, int i10) {
            return DrawerLayout.this.l(view) && DrawerLayout.this.a(view, this.f1928a) && DrawerLayout.this.g(view) == 0;
        }

        public final void l() {
            int i10 = 3;
            if (this.f1928a == 3) {
                i10 = 5;
            }
            View d = DrawerLayout.this.d(i10);
            if (d != null) {
                DrawerLayout.this.b(d);
            }
        }

        public void m() {
            DrawerLayout.this.removeCallbacks(this.f1930c);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        V = true;
        W = true;
        f1910a0 = i10 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1911c = new d();
        this.f1914m = -1728053248;
        this.f1915t = new Paint();
        this.C = true;
        this.D = 3;
        this.E = 3;
        this.F = 3;
        this.G = 3;
        this.S = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f1913j = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        g gVar = new g(3);
        this.y = gVar;
        g gVar2 = new g(5);
        this.f1918z = gVar2;
        t0.c k10 = t0.c.k(this, 1.0f, gVar);
        this.f1916u = k10;
        k10.f15091q = 1;
        k10.n = f11;
        gVar.f1929b = k10;
        t0.c k11 = t0.c.k(this, 1.0f, gVar2);
        this.f1917w = k11;
        k11.f15091q = 2;
        k11.n = f11;
        gVar2.f1929b = k11;
        setFocusableInTouchMode(true);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.s(this, 1);
        x.v(this, new c());
        setMotionEventSplittingEnabled(false);
        if (x.d.b(this)) {
            setOnApplyWindowInsetsListener(new b(this));
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(T);
            try {
                this.M = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, x.c.f17618u, i10, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1912f = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f1912f = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.P = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static boolean i(View view) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return (x.d.c(view) == 4 || x.d.c(view) == 2) ? false : true;
    }

    public boolean a(View view, int i10) {
        return (h(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!l(childAt)) {
                this.P.add(childAt);
            } else if (k(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.P.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.P.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.P.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addView(android.view.View r5, int r6, android.view.ViewGroup.LayoutParams r7) {
        /*
            r4 = this;
            r0 = r4
            super.addView(r5, r6, r7)
            android.view.View r2 = r0.e()
            r6 = r2
            if (r6 != 0) goto L1f
            r2 = 4
            boolean r3 = r0.l(r5)
            r6 = r3
            if (r6 == 0) goto L14
            goto L20
        L14:
            r2 = 7
            r2 = 1
            r6 = r2
            java.util.WeakHashMap<android.view.View, n0.a0> r7 = n0.x.f13156a
            r2 = 2
            n0.x.d.s(r5, r6)
            r3 = 7
            goto L28
        L1f:
            r2 = 5
        L20:
            r2 = 4
            r6 = r2
            java.util.WeakHashMap<android.view.View, n0.a0> r7 = n0.x.f13156a
            n0.x.d.s(r5, r6)
            r2 = 4
        L28:
            boolean r6 = androidx.drawerlayout.widget.DrawerLayout.V
            if (r6 != 0) goto L31
            androidx.drawerlayout.widget.DrawerLayout$d r6 = r0.f1911c
            n0.x.v(r5, r6)
        L31:
            r3 = 1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    public void b(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.C) {
            layoutParams.f1920b = 0.0f;
            layoutParams.d = 0;
        } else {
            layoutParams.d |= 4;
            if (a(view, 3)) {
                this.f1916u.z(view, -view.getWidth(), view.getTop());
            } else {
                this.f1917w.z(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public void c(boolean z10) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (l(childAt)) {
                if (!z10 || layoutParams.f1921c) {
                    z11 |= a(childAt, 3) ? this.f1916u.z(childAt, -childAt.getWidth(), childAt.getTop()) : this.f1917w.z(childAt, getWidth(), childAt.getTop());
                    layoutParams.f1921c = false;
                }
            }
        }
        this.y.m();
        this.f1918z.m();
        if (z11) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            f10 = Math.max(f10, ((LayoutParams) getChildAt(i10).getLayoutParams()).f1920b);
        }
        this.n = f10;
        boolean j10 = this.f1916u.j(true);
        boolean j11 = this.f1917w.j(true);
        if (!j10 && !j11) {
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.k(this);
    }

    public View d(int i10) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, x.e.d(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((h(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.n <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount != 0) {
            float x10 = motionEvent.getX();
            float y = motionEvent.getY();
            for (int i10 = childCount - 1; i10 >= 0; i10--) {
                View childAt = getChildAt(i10);
                if (this.Q == null) {
                    this.Q = new Rect();
                }
                childAt.getHitRect(this.Q);
                if (this.Q.contains((int) x10, (int) y) && !j(childAt)) {
                    if (childAt.getMatrix().isIdentity()) {
                        float scrollX = getScrollX() - childAt.getLeft();
                        float scrollY = getScrollY() - childAt.getTop();
                        motionEvent.offsetLocation(scrollX, scrollY);
                        dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                        motionEvent.offsetLocation(-scrollX, -scrollY);
                    } else {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.offsetLocation(getScrollX() - childAt.getLeft(), getScrollY() - childAt.getTop());
                        Matrix matrix = childAt.getMatrix();
                        if (!matrix.isIdentity()) {
                            if (this.R == null) {
                                this.R = new Matrix();
                            }
                            matrix.invert(this.R);
                            obtain.transform(this.R);
                        }
                        dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                        obtain.recycle();
                    }
                    if (dispatchGenericMotionEvent) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean j11 = j(view);
        int width = getWidth();
        int save = canvas.save();
        int i10 = 0;
        if (j11) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if ((background != null && background.getOpacity() == -1) && l(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i11) {
                                i11 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        float f10 = this.n;
        if (f10 > 0.0f && j11) {
            int i13 = this.f1914m;
            this.f1915t.setColor((((int) ((((-16777216) & i13) >>> 24) * f10)) << 24) | (i13 & 16777215));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f1915t);
        }
        return drawChild;
    }

    public View e() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                if (!l(childAt)) {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
                if (((LayoutParams) childAt.getLayoutParams()).f1920b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public int g(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        int i10 = ((LayoutParams) view.getLayoutParams()).f1919a;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int d10 = x.e.d(this);
        if (i10 == 3) {
            int i11 = this.D;
            if (i11 != 3) {
                return i11;
            }
            int i12 = d10 == 0 ? this.F : this.G;
            if (i12 != 3) {
                return i12;
            }
        } else if (i10 == 5) {
            int i13 = this.E;
            if (i13 != 3) {
                return i13;
            }
            int i14 = d10 == 0 ? this.G : this.F;
            if (i14 != 3) {
                return i14;
            }
        } else if (i10 == 8388611) {
            int i15 = this.F;
            if (i15 != 3) {
                return i15;
            }
            int i16 = d10 == 0 ? this.D : this.E;
            if (i16 != 3) {
                return i16;
            }
        } else if (i10 != 8388613) {
            return 0;
        } else {
            int i17 = this.G;
            if (i17 != 3) {
                return i17;
            }
            int i18 = d10 == 0 ? this.E : this.D;
            if (i18 != 3) {
                return i18;
            }
        }
        return 0;
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
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (W) {
            return this.f1912f;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.M;
    }

    public int h(View view) {
        int i10 = ((LayoutParams) view.getLayoutParams()).f1919a;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return Gravity.getAbsoluteGravity(i10, x.e.d(this));
    }

    public boolean j(View view) {
        return ((LayoutParams) view.getLayoutParams()).f1919a == 0;
    }

    public boolean k(View view) {
        if (l(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean l(View view) {
        int i10 = ((LayoutParams) view.getLayoutParams()).f1919a;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, x.e.d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public void m(View view) {
        if (!l(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.C) {
            layoutParams.f1920b = 1.0f;
            layoutParams.d = 1;
            q(view, true);
            p(view);
        } else {
            layoutParams.d |= 2;
            if (a(view, 3)) {
                this.f1916u.z(view, 0, view.getTop());
            } else {
                this.f1917w.z(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public void n(int i10, int i11) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i11, x.e.d(this));
        if (i11 == 3) {
            this.D = i10;
        } else if (i11 == 5) {
            this.E = i10;
        } else if (i11 == 8388611) {
            this.F = i10;
        } else if (i11 == 8388613) {
            this.G = i10;
        }
        if (i10 != 0) {
            (absoluteGravity == 3 ? this.f1916u : this.f1917w).b();
        }
        if (i10 == 1) {
            View d10 = d(absoluteGravity);
            if (d10 != null) {
                b(d10);
            }
        } else if (i10 != 2) {
        } else {
            View d11 = d(absoluteGravity);
            if (d11 != null) {
                m(d11);
            }
        }
    }

    public void o(View view, float f10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f10 == layoutParams.f1920b) {
            return;
        }
        layoutParams.f1920b = f10;
        List<e> list = this.J;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.J.get(size).d(view, f10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.O || this.M == null) {
            return;
        }
        Object obj = this.N;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.M.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.M.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[LOOP:1: B:11:0x0033->B:21:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x006b A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (f() != null) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            View f10 = f();
            if (f10 != null && g(f10) == 0) {
                c(false);
            }
            return f10 != null;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        int i14;
        float f10;
        int i15;
        this.B = true;
        int i16 = i12 - i10;
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (j(childAt)) {
                    int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i18, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f11 = measuredWidth;
                        i15 = (-measuredWidth) + ((int) (layoutParams.f1920b * f11));
                        f10 = (measuredWidth + i15) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i16 - i14) / f12;
                        i15 = i16 - ((int) (layoutParams.f1920b * f12));
                    }
                    boolean z11 = f10 != layoutParams.f1920b;
                    int i19 = layoutParams.f1919a & 112;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = i20 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i23 > i24) {
                                i21 = i24 - measuredHeight;
                            }
                        }
                        childAt.layout(i15, i21, measuredWidth + i15, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i15, i25, measuredWidth + i15, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i15, (i26 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i15, i26 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z11) {
                        o(childAt, f10);
                    }
                    int i27 = layoutParams.f1920b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
        }
        if (f1910a0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            e0.b h10 = d0.k(rootWindowInsets, null).f13113a.h();
            t0.c cVar = this.f1916u;
            cVar.f15089o = Math.max(cVar.f15090p, h10.f8967a);
            t0.c cVar2 = this.f1917w;
            cVar2.f15089o = Math.max(cVar2.f15090p, h10.f8969c);
        }
        this.B = false;
        this.C = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // android.view.View
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        View d10;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f14775c);
        int i10 = fVar.f1924j;
        if (i10 != 0 && (d10 = d(i10)) != null) {
            m(d10);
        }
        int i11 = fVar.f1925m;
        if (i11 != 3) {
            n(i11, 3);
        }
        int i12 = fVar.n;
        if (i12 != 3) {
            n(i12, 5);
        }
        int i13 = fVar.f1926t;
        if (i13 != 3) {
            n(i13, 8388611);
        }
        int i14 = fVar.f1927u;
        if (i14 != 3) {
            n(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (W) {
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.e.d(this);
        x.e.d(this);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i10).getLayoutParams();
            int i11 = layoutParams.d;
            boolean z10 = true;
            boolean z11 = i11 == 1;
            if (i11 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                fVar.f1924j = layoutParams.f1919a;
                break;
            }
        }
        fVar.f1925m = this.D;
        fVar.n = this.E;
        fVar.f1926t = this.F;
        fVar.f1927u = this.G;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        if (g(r11) != 2) goto L21;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r6 = r10
            t0.c r0 = r6.f1916u
            r8 = 5
            r0.r(r11)
            t0.c r0 = r6.f1917w
            r9 = 3
            r0.r(r11)
            int r8 = r11.getAction()
            r0 = r8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            r8 = 2
            if (r0 == 0) goto L78
            r8 = 3
            if (r0 == r2) goto L29
            r9 = 3
            r9 = 3
            r11 = r9
            if (r0 == r11) goto L23
            r9 = 3
            goto L89
        L23:
            r6.c(r2)
            r6.H = r1
            goto L89
        L29:
            float r0 = r11.getX()
            float r9 = r11.getY()
            r11 = r9
            t0.c r3 = r6.f1916u
            int r4 = (int) r0
            int r5 = (int) r11
            r8 = 4
            android.view.View r8 = r3.m(r4, r5)
            r3 = r8
            if (r3 == 0) goto L71
            r8 = 4
            boolean r9 = r6.j(r3)
            r3 = r9
            if (r3 == 0) goto L71
            float r3 = r6.K
            float r0 = r0 - r3
            r8 = 2
            float r3 = r6.L
            r9 = 5
            float r11 = r11 - r3
            r9 = 5
            t0.c r3 = r6.f1916u
            int r3 = r3.f15078b
            float r0 = r0 * r0
            float r11 = r11 * r11
            r9 = 6
            float r11 = r11 + r0
            int r3 = r3 * r3
            r9 = 2
            float r0 = (float) r3
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 >= 0) goto L71
            android.view.View r11 = r6.e()
            if (r11 == 0) goto L71
            r8 = 6
            int r9 = r6.g(r11)
            r11 = r9
            r8 = 2
            r0 = r8
            if (r11 != r0) goto L73
        L71:
            r8 = 1
            r1 = r8
        L73:
            r6.c(r1)
            r9 = 5
            goto L89
        L78:
            float r0 = r11.getX()
            float r9 = r11.getY()
            r11 = r9
            r6.K = r0
            r6.L = r11
            r8 = 6
            r6.H = r1
            r9 = 3
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        b.a aVar = b.a.f13489l;
        x.s(aVar.a(), view);
        x.m(view, 0);
        if (k(view) && g(view) != 2) {
            x.t(view, aVar, null, this.S);
        }
    }

    public final void q(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || l(childAt)) && (!z10 || childAt != view)) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.s(childAt, 4);
            }
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            x.d.s(childAt, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(int r10, android.view.View r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.r(int, android.view.View):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.B) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.f1912f = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (l(childAt)) {
                float f11 = this.f1912f;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.i.s(childAt, f11);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r5.J != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
        r5.J = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        r5.J.add(r6);
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setDrawerListener(androidx.drawerlayout.widget.DrawerLayout.e r6) {
        /*
            r5 = this;
            r2 = r5
            androidx.drawerlayout.widget.DrawerLayout$e r0 = r2.I
            r4 = 1
            if (r0 == 0) goto L14
            if (r0 != 0) goto L9
            goto L15
        L9:
            r4 = 3
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$e> r1 = r2.J
            r4 = 4
            if (r1 != 0) goto L11
            r4 = 2
            goto L15
        L11:
            r1.remove(r0)
        L14:
            r4 = 4
        L15:
            if (r6 == 0) goto L2f
            r4 = 3
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$e> r0 = r2.J
            r4 = 1
            if (r0 != 0) goto L28
            r4 = 3
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 5
            r0.<init>()
            r4 = 7
            r2.J = r0
            r4 = 4
        L28:
            r4 = 2
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$e> r0 = r2.J
            r4 = 7
            r0.add(r6)
        L2f:
            r4 = 3
            r2.I = r6
            r4 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.setDrawerListener(androidx.drawerlayout.widget.DrawerLayout$e):void");
    }

    public void setDrawerLockMode(int i10) {
        n(i10, 3);
        n(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f1914m = i10;
        invalidate();
    }

    public void setStatusBarBackground(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = c0.a.f3717a;
            drawable = a.c.b(context, i10);
        } else {
            drawable = null;
        }
        this.M = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.M = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.M = new ColorDrawable(i10);
        invalidate();
    }
}
