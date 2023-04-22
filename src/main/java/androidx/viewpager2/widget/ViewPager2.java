package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import androidx.viewpager2.widget.c;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import o0.d;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public z A;
    public androidx.viewpager2.widget.c B;
    public androidx.viewpager2.widget.a C;
    public a2.c D;
    public androidx.viewpager2.widget.b E;
    public RecyclerView.i F;
    public boolean G;
    public boolean H;
    public int I;
    public d J;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f3339c;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3340f;

    /* renamed from: j  reason: collision with root package name */
    public androidx.viewpager2.widget.a f3341j;

    /* renamed from: m  reason: collision with root package name */
    public int f3342m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public RecyclerView.f f3343t;

    /* renamed from: u  reason: collision with root package name */
    public LinearLayoutManager f3344u;

    /* renamed from: w  reason: collision with root package name */
    public int f3345w;
    public Parcelable y;

    /* renamed from: z  reason: collision with root package name */
    public RecyclerView f3346z;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.n = true;
            viewPager2.B.f3375l = true;
        }
    }

    /* loaded from: classes.dex */
    public class b extends g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.e();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3342m != i10) {
                viewPager2.f3342m = i10;
                viewPager2.J.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends g {
        public c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3346z.requestFocus(2);
            }
        }
    }

    /* loaded from: classes.dex */
    public abstract class d {
        public d(ViewPager2 viewPager2, a aVar) {
        }

        public abstract void a(androidx.viewpager2.widget.a aVar, RecyclerView recyclerView);

        public abstract void b();
    }

    /* loaded from: classes.dex */
    public static abstract class e extends RecyclerView.f {
        public e(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void c(int i10, int i11, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void f(int i10, int i11) {
            a();
        }
    }

    /* loaded from: classes.dex */
    public class f extends LinearLayoutManager {
        public f(Context context) {
            super(1, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void M0(RecyclerView.w wVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.M0(wVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void c0(RecyclerView.r rVar, RecyclerView.w wVar, o0.b bVar) {
            super.c0(rVar, wVar, bVar);
            Objects.requireNonNull(ViewPager2.this.J);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public boolean p0(RecyclerView.r rVar, RecyclerView.w wVar, int i10, Bundle bundle) {
            Objects.requireNonNull(ViewPager2.this.J);
            return super.p0(rVar, wVar, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public boolean v0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a(int i10) {
        }

        public void b(int i10, float f10, int i11) {
        }

        public void c(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public class h extends d {

        /* renamed from: a  reason: collision with root package name */
        public final o0.d f3350a;

        /* renamed from: b  reason: collision with root package name */
        public final o0.d f3351b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.f f3352c;

        /* loaded from: classes.dex */
        public class a implements o0.d {
            public a() {
            }

            @Override // o0.d
            public boolean a(View view, d.a aVar) {
                h.this.c(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class b implements o0.d {
            public b() {
            }

            @Override // o0.d
            public boolean a(View view, d.a aVar) {
                h.this.c(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        public class c extends e {
            public c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.f
            public void a() {
                h.this.d();
            }
        }

        public h() {
            super(ViewPager2.this, null);
            this.f3350a = new a();
            this.f3351b = new b();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.d
        public void a(androidx.viewpager2.widget.a aVar, RecyclerView recyclerView) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.s(recyclerView, 2);
            this.f3352c = new c();
            if (x.d.c(ViewPager2.this) == 0) {
                x.d.s(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.d
        public void b() {
            d();
        }

        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.H) {
                viewPager2.d(i10, true);
            }
        }

        public void d() {
            int a10;
            ViewPager2 viewPager2 = ViewPager2.this;
            x.r(viewPager2, 16908360);
            x.s(16908361, viewPager2);
            x.m(viewPager2, 0);
            x.s(16908358, viewPager2);
            x.m(viewPager2, 0);
            x.s(16908359, viewPager2);
            x.m(viewPager2, 0);
            if (ViewPager2.this.getAdapter() == null || (a10 = ViewPager2.this.getAdapter().a()) == 0) {
                return;
            }
            ViewPager2 viewPager22 = ViewPager2.this;
            if (viewPager22.H) {
                if (viewPager22.getOrientation() == 0) {
                    boolean b10 = ViewPager2.this.b();
                    int i10 = b10 ? 16908360 : 16908361;
                    int i11 = b10 ? 16908361 : 16908360;
                    if (ViewPager2.this.f3342m < a10 - 1) {
                        x.t(viewPager2, new b.a(i10, null), null, this.f3350a);
                    }
                    if (ViewPager2.this.f3342m > 0) {
                        x.t(viewPager2, new b.a(i11, null), null, this.f3351b);
                    }
                } else {
                    if (ViewPager2.this.f3342m < a10 - 1) {
                        x.t(viewPager2, new b.a(16908359, null), null, this.f3350a);
                    }
                    if (ViewPager2.this.f3342m > 0) {
                        x.t(viewPager2, new b.a(16908358, null), null, this.f3351b);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(View view, float f10);
    }

    /* loaded from: classes.dex */
    public class j extends z {
        public j() {
        }

        @Override // androidx.recyclerview.widget.z, androidx.recyclerview.widget.f0
        public View d(RecyclerView.l lVar) {
            if (((androidx.viewpager2.widget.c) ViewPager2.this.D.f167f).f3376m) {
                return null;
            }
            return super.d(lVar);
        }
    }

    /* loaded from: classes.dex */
    public class k extends RecyclerView {
        public k(Context context) {
            super(context, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            Objects.requireNonNull(ViewPager2.this.J);
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3342m);
            accessibilityEvent.setToIndex(ViewPager2.this.f3342m);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.H && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.H && super.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes.dex */
    public static class l extends View.BaseSavedState {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f3357c;

        /* renamed from: f  reason: collision with root package name */
        public int f3358f;

        /* renamed from: j  reason: collision with root package name */
        public Parcelable f3359j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new l(parcel, null) : new l(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new l(parcel, classLoader) : new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcel parcel) {
            super(parcel);
            this.f3357c = parcel.readInt();
            this.f3358f = parcel.readInt();
            this.f3359j = parcel.readParcelable(null);
        }

        public l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3357c = parcel.readInt();
            this.f3358f = parcel.readInt();
            this.f3359j = parcel.readParcelable(classLoader);
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3357c);
            parcel.writeInt(this.f3358f);
            parcel.writeParcelable(this.f3359j, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class m implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final int f3360c;

        /* renamed from: f  reason: collision with root package name */
        public final RecyclerView f3361f;

        public m(int i10, RecyclerView recyclerView) {
            this.f3360c = i10;
            this.f3361f = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3361f.l0(this.f3360c);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3339c = new Rect();
        this.f3340f = new Rect();
        this.f3341j = new androidx.viewpager2.widget.a(3);
        this.n = false;
        this.f3343t = new a();
        this.f3345w = -1;
        this.F = null;
        this.G = false;
        this.H = true;
        this.I = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3339c = new Rect();
        this.f3340f = new Rect();
        this.f3341j = new androidx.viewpager2.widget.a(3);
        this.n = false;
        this.f3343t = new a();
        this.f3345w = -1;
        this.F = null;
        this.G = false;
        this.H = true;
        this.I = -1;
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.J = new h();
        k kVar = new k(context);
        this.f3346z = kVar;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        kVar.setId(x.e.a());
        this.f3346z.setDescendantFocusability(131072);
        f fVar = new f(context);
        this.f3344u = fVar;
        this.f3346z.setLayoutManager(fVar);
        this.f3346z.setScrollingTouchSlop(1);
        int[] iArr = t3.a.f15105t;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.f3346z.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            RecyclerView recyclerView = this.f3346z;
            a2.d dVar = new a2.d(this);
            if (recyclerView.S == null) {
                recyclerView.S = new ArrayList();
            }
            recyclerView.S.add(dVar);
            androidx.viewpager2.widget.c cVar = new androidx.viewpager2.widget.c(this);
            this.B = cVar;
            this.D = new a2.c(this, cVar, this.f3346z);
            j jVar = new j();
            this.A = jVar;
            jVar.a(this.f3346z);
            this.f3346z.h(this.B);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a(3);
            this.C = aVar;
            this.B.f3365a = aVar;
            b bVar = new b();
            c cVar2 = new c();
            aVar.f3362a.add(bVar);
            this.C.f3362a.add(cVar2);
            this.J.a(this.C, this.f3346z);
            androidx.viewpager2.widget.a aVar2 = this.C;
            aVar2.f3362a.add(this.f3341j);
            androidx.viewpager2.widget.b bVar2 = new androidx.viewpager2.widget.b(this.f3344u);
            this.E = bVar2;
            this.C.f3362a.add(bVar2);
            RecyclerView recyclerView2 = this.f3346z;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public boolean b() {
        return this.f3344u.I() == 1;
    }

    public final void c() {
        RecyclerView.Adapter adapter;
        if (this.f3345w == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.y;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.a) {
                ((androidx.viewpager2.adapter.a) adapter).b(parcelable);
            }
            this.y = null;
        }
        int max = Math.max(0, Math.min(this.f3345w, adapter.a() - 1));
        this.f3342m = max;
        this.f3345w = -1;
        this.f3346z.g0(max);
        ((h) this.J).d();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f3346z.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f3346z.canScrollVertically(i10);
    }

    public void d(int i10, boolean z10) {
        g gVar;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.f3345w != -1) {
                this.f3345w = Math.max(i10, 0);
            }
        } else if (adapter.a() <= 0) {
        } else {
            int min = Math.min(Math.max(i10, 0), adapter.a() - 1);
            int i11 = this.f3342m;
            if (min == i11) {
                if (this.B.f3369f == 0) {
                    return;
                }
            }
            if (min == i11 && z10) {
                return;
            }
            double d10 = i11;
            this.f3342m = min;
            ((h) this.J).d();
            androidx.viewpager2.widget.c cVar = this.B;
            if (!(cVar.f3369f == 0)) {
                cVar.i();
                c.a aVar = cVar.f3370g;
                d10 = aVar.f3377a + aVar.f3378b;
            }
            androidx.viewpager2.widget.c cVar2 = this.B;
            cVar2.f3368e = z10 ? 2 : 3;
            cVar2.f3376m = false;
            boolean z11 = cVar2.f3372i != min;
            cVar2.f3372i = min;
            cVar2.g(2);
            if (z11 && (gVar = cVar2.f3365a) != null) {
                gVar.c(min);
            }
            if (!z10) {
                this.f3346z.g0(min);
                return;
            }
            double d11 = min;
            if (Math.abs(d11 - d10) <= 3.0d) {
                this.f3346z.l0(min);
                return;
            }
            this.f3346z.g0(d11 > d10 ? min - 3 : min + 3);
            RecyclerView recyclerView = this.f3346z;
            recyclerView.post(new m(min, recyclerView));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof l) {
            int i10 = ((l) parcelable).f3357c;
            sparseArray.put(this.f3346z.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        c();
    }

    public void e() {
        z zVar = this.A;
        if (zVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View d10 = zVar.d(this.f3344u);
        if (d10 == null) {
            return;
        }
        int P = this.f3344u.P(d10);
        if (P != this.f3342m && getScrollState() == 0) {
            this.C.c(P);
        }
        this.n = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        d dVar = this.J;
        Objects.requireNonNull(dVar);
        if (dVar instanceof h) {
            Objects.requireNonNull(this.J);
            return "androidx.viewpager.widget.ViewPager";
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f3346z.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3342m;
    }

    public int getItemDecorationCount() {
        return this.f3346z.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.I;
    }

    public int getOrientation() {
        return this.f3344u.f2738p;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f3346z;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.B.f3369f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r9) {
        /*
            r8 = this;
            super.onInitializeAccessibilityNodeInfo(r9)
            androidx.viewpager2.widget.ViewPager2$d r0 = r8.J
            r7 = 6
            androidx.viewpager2.widget.ViewPager2$h r0 = (androidx.viewpager2.widget.ViewPager2.h) r0
            r6 = 7
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            r7 = 1
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = r1.getAdapter()
            r1 = r5
            r5 = 1
            r2 = r5
            r5 = 0
            r3 = r5
            if (r1 == 0) goto L3f
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            r7 = 1
            int r5 = r1.getOrientation()
            r1 = r5
            if (r1 != r2) goto L2f
            r7 = 2
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            r7 = 5
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            int r5 = r1.a()
            r1 = r5
            goto L41
        L2f:
            r6 = 2
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            r7 = 5
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            int r1 = r1.a()
            r4 = r1
            r5 = 0
            r1 = r5
            goto L43
        L3f:
            r5 = 0
            r1 = r5
        L41:
            r5 = 0
            r4 = r5
        L43:
            o0.b$b r1 = o0.b.C0228b.a(r1, r4, r3, r3)
            java.lang.Object r1 = r1.f13495a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r1
            r6 = 4
            r9.setCollectionInfo(r1)
            r6 = 1
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            r6 = 5
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            if (r1 != 0) goto L5b
            r6 = 2
            goto L88
        L5b:
            int r1 = r1.a()
            if (r1 == 0) goto L88
            r6 = 7
            androidx.viewpager2.widget.ViewPager2 r3 = androidx.viewpager2.widget.ViewPager2.this
            r6 = 4
            boolean r4 = r3.H
            if (r4 != 0) goto L6a
            goto L88
        L6a:
            int r3 = r3.f3342m
            if (r3 <= 0) goto L74
            r3 = 8192(0x2000, float:1.148E-41)
            r9.addAction(r3)
            r6 = 5
        L74:
            androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
            r7 = 7
            int r0 = r0.f3342m
            r6 = 5
            int r1 = r1 - r2
            r6 = 4
            if (r0 >= r1) goto L85
            r5 = 4096(0x1000, float:5.74E-42)
            r0 = r5
            r9.addAction(r0)
            r7 = 4
        L85:
            r9.setScrollable(r2)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f3346z.getMeasuredWidth();
        int measuredHeight = this.f3346z.getMeasuredHeight();
        this.f3339c.left = getPaddingLeft();
        this.f3339c.right = (i12 - i10) - getPaddingRight();
        this.f3339c.top = getPaddingTop();
        this.f3339c.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3339c, this.f3340f);
        RecyclerView recyclerView = this.f3346z;
        Rect rect = this.f3340f;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.n) {
            e();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        measureChild(this.f3346z, i10, i11);
        int measuredWidth = this.f3346z.getMeasuredWidth();
        int measuredHeight = this.f3346z.getMeasuredHeight();
        int measuredState = this.f3346z.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.f3345w = lVar.f3358f;
        this.y = lVar.f3359j;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f3357c = this.f3346z.getId();
        int i10 = this.f3345w;
        if (i10 == -1) {
            i10 = this.f3342m;
        }
        lVar.f3358f = i10;
        Parcelable parcelable = this.y;
        if (parcelable != null) {
            lVar.f3359j = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f3346z.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.a) {
                lVar.f3359j = ((androidx.viewpager2.adapter.a) adapter).a();
            }
        }
        return lVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(int r9, android.os.Bundle r10) {
        /*
            r8 = this;
            androidx.viewpager2.widget.ViewPager2$d r0 = r8.J
            r6 = 6
            androidx.viewpager2.widget.ViewPager2$h r0 = (androidx.viewpager2.widget.ViewPager2.h) r0
            r7 = 3
            java.util.Objects.requireNonNull(r0)
            r5 = 0
            r0 = r5
            r5 = 1
            r1 = r5
            r2 = 4096(0x1000, float:5.74E-42)
            r5 = 8192(0x2000, float:1.148E-41)
            r3 = r5
            if (r9 == r3) goto L1b
            if (r9 != r2) goto L17
            goto L1c
        L17:
            r7 = 3
            r5 = 0
            r4 = r5
            goto L1d
        L1b:
            r7 = 5
        L1c:
            r4 = 1
        L1d:
            if (r4 == 0) goto L53
            androidx.viewpager2.widget.ViewPager2$d r10 = r8.J
            r6 = 5
            androidx.viewpager2.widget.ViewPager2$h r10 = (androidx.viewpager2.widget.ViewPager2.h) r10
            r6 = 5
            java.util.Objects.requireNonNull(r10)
            if (r9 == r3) goto L2e
            r7 = 5
            if (r9 != r2) goto L31
            r6 = 7
        L2e:
            r7 = 2
            r0 = 1
            r6 = 7
        L31:
            if (r0 == 0) goto L4c
            if (r9 != r3) goto L40
            r6 = 7
            androidx.viewpager2.widget.ViewPager2 r9 = androidx.viewpager2.widget.ViewPager2.this
            r6 = 5
            int r5 = r9.getCurrentItem()
            r9 = r5
            int r9 = r9 - r1
            goto L48
        L40:
            androidx.viewpager2.widget.ViewPager2 r9 = androidx.viewpager2.widget.ViewPager2.this
            r7 = 5
            int r9 = r9.getCurrentItem()
            int r9 = r9 + r1
        L48:
            r10.c(r9)
            return r1
        L4c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r6 = 4
            r9.<init>()
            throw r9
        L53:
            r7 = 2
            boolean r9 = super.performAccessibilityAction(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f3346z.getAdapter();
        h hVar = (h) this.J;
        Objects.requireNonNull(hVar);
        if (adapter2 != null) {
            adapter2.f2802a.unregisterObserver(hVar.f3352c);
        }
        if (adapter2 != null) {
            adapter2.f2802a.unregisterObserver(this.f3343t);
        }
        this.f3346z.setAdapter(adapter);
        this.f3342m = 0;
        c();
        h hVar2 = (h) this.J;
        hVar2.d();
        if (adapter != null) {
            adapter.f2802a.registerObserver(hVar2.f3352c);
        }
        if (adapter != null) {
            adapter.f2802a.registerObserver(this.f3343t);
        }
    }

    public void setCurrentItem(int i10) {
        if (((androidx.viewpager2.widget.c) this.D.f167f).f3376m) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        d(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        ((h) this.J).d();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.I = i10;
        this.f3346z.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f3344u.o1(i10);
        ((h) this.J).d();
    }

    public void setPageTransformer(i iVar) {
        if (iVar != null) {
            if (!this.G) {
                this.F = this.f3346z.getItemAnimator();
                this.G = true;
            }
            this.f3346z.setItemAnimator(null);
        } else if (this.G) {
            this.f3346z.setItemAnimator(this.F);
            this.F = null;
            this.G = false;
        }
        androidx.viewpager2.widget.b bVar = this.E;
        if (iVar == bVar.f3364b) {
            return;
        }
        bVar.f3364b = iVar;
        if (iVar == null) {
            return;
        }
        androidx.viewpager2.widget.c cVar = this.B;
        cVar.i();
        c.a aVar = cVar.f3370g;
        double d10 = aVar.f3377a + aVar.f3378b;
        int i10 = (int) d10;
        float f10 = (float) (d10 - i10);
        this.E.b(i10, f10, Math.round(getPageSize() * f10));
    }

    public void setUserInputEnabled(boolean z10) {
        this.H = z10;
        ((h) this.J).d();
    }
}
