package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cb.g;
import cb.k;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.x;
import o0.b;
import t0.c;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public float A;
    public int B;
    public float C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public t0.c H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public WeakReference<V> O;
    public WeakReference<View> P;
    public final ArrayList<c> Q;
    public VelocityTracker R;
    public int S;
    public int T;
    public boolean U;
    public Map<View, Integer> V;
    public int W;
    public final c.AbstractC0267c X;

    /* renamed from: a  reason: collision with root package name */
    public int f7208a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7209b;

    /* renamed from: c  reason: collision with root package name */
    public float f7210c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7211e;

    /* renamed from: f  reason: collision with root package name */
    public int f7212f;

    /* renamed from: g  reason: collision with root package name */
    public int f7213g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7214h;

    /* renamed from: i  reason: collision with root package name */
    public g f7215i;

    /* renamed from: j  reason: collision with root package name */
    public int f7216j;

    /* renamed from: k  reason: collision with root package name */
    public int f7217k;

    /* renamed from: l  reason: collision with root package name */
    public int f7218l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7219m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7220o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f7221p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7222q;

    /* renamed from: r  reason: collision with root package name */
    public int f7223r;

    /* renamed from: s  reason: collision with root package name */
    public int f7224s;

    /* renamed from: t  reason: collision with root package name */
    public k f7225t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7226u;

    /* renamed from: v  reason: collision with root package name */
    public BottomSheetBehavior<V>.e f7227v;

    /* renamed from: w  reason: collision with root package name */
    public ValueAnimator f7228w;

    /* renamed from: x  reason: collision with root package name */
    public int f7229x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f7230z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f7231c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7232f;

        public a(View view, int i10) {
            this.f7231c = view;
            this.f7232f = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.G(this.f7231c, this.f7232f);
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.AbstractC0267c {
        public b() {
        }

        @Override // t0.c.AbstractC0267c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // t0.c.AbstractC0267c
        public int b(View view, int i10, int i11) {
            int A = BottomSheetBehavior.this.A();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return t3.a.g(i10, A, bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B);
        }

        @Override // t0.c.AbstractC0267c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.D ? bottomSheetBehavior.N : bottomSheetBehavior.B;
        }

        @Override // t0.c.AbstractC0267c
        public void h(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.F) {
                    bottomSheetBehavior.F(1);
                }
            }
        }

        @Override // t0.c.AbstractC0267c
        public void i(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.w(i11);
        }

        @Override // t0.c.AbstractC0267c
        public void j(View view, float f10, float f11) {
            int i10;
            int i11 = 4;
            if (f11 < 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f7209b) {
                    i10 = bottomSheetBehavior.y;
                } else {
                    int top = view.getTop();
                    System.currentTimeMillis();
                    Objects.requireNonNull(BottomSheetBehavior.this);
                    BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                    int i12 = bottomSheetBehavior2.f7230z;
                    if (top > i12) {
                        i10 = i12;
                        i11 = 6;
                    } else {
                        i10 = bottomSheetBehavior2.A();
                    }
                }
                i11 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (bottomSheetBehavior3.D && bottomSheetBehavior3.I(view, f11)) {
                    if (Math.abs(f10) < Math.abs(f11)) {
                        if (f11 <= 500.0f) {
                        }
                        i10 = BottomSheetBehavior.this.N;
                        i11 = 5;
                    }
                    int top2 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                    if (!(top2 > (bottomSheetBehavior4.A() + bottomSheetBehavior4.N) / 2)) {
                        BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                        if (bottomSheetBehavior5.f7209b) {
                            i10 = bottomSheetBehavior5.y;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.A()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f7230z)) {
                            i10 = BottomSheetBehavior.this.A();
                        } else {
                            i10 = BottomSheetBehavior.this.f7230z;
                            i11 = 6;
                        }
                        i11 = 3;
                    }
                    i10 = BottomSheetBehavior.this.N;
                    i11 = 5;
                } else {
                    if (f11 != 0.0f && Math.abs(f10) <= Math.abs(f11)) {
                        BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                        if (bottomSheetBehavior6.f7209b) {
                            i10 = bottomSheetBehavior6.B;
                        } else {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - BottomSheetBehavior.this.f7230z) < Math.abs(top3 - BottomSheetBehavior.this.B)) {
                                Objects.requireNonNull(BottomSheetBehavior.this);
                                i10 = BottomSheetBehavior.this.f7230z;
                                i11 = 6;
                            } else {
                                i10 = BottomSheetBehavior.this.B;
                            }
                        }
                    }
                    int top4 = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior7 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior7.f7209b) {
                        int i13 = bottomSheetBehavior7.f7230z;
                        if (top4 < i13) {
                            if (top4 < Math.abs(top4 - bottomSheetBehavior7.B)) {
                                i10 = BottomSheetBehavior.this.A();
                                i11 = 3;
                            } else {
                                Objects.requireNonNull(BottomSheetBehavior.this);
                                i10 = BottomSheetBehavior.this.f7230z;
                            }
                        } else if (Math.abs(top4 - i13) < Math.abs(top4 - BottomSheetBehavior.this.B)) {
                            Objects.requireNonNull(BottomSheetBehavior.this);
                            i10 = BottomSheetBehavior.this.f7230z;
                        } else {
                            i10 = BottomSheetBehavior.this.B;
                        }
                        i11 = 6;
                    } else if (Math.abs(top4 - bottomSheetBehavior7.y) < Math.abs(top4 - BottomSheetBehavior.this.B)) {
                        i10 = BottomSheetBehavior.this.y;
                        i11 = 3;
                    } else {
                        i10 = BottomSheetBehavior.this.B;
                    }
                }
            }
            BottomSheetBehavior bottomSheetBehavior8 = BottomSheetBehavior.this;
            Objects.requireNonNull(bottomSheetBehavior8);
            bottomSheetBehavior8.J(view, i11, i10, true);
        }

        @Override // t0.c.AbstractC0267c
        public boolean k(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.G;
            boolean z10 = false;
            if (i11 != 1 && !bottomSheetBehavior.U) {
                if (i11 == 3 && bottomSheetBehavior.S == i10) {
                    WeakReference<View> weakReference = bottomSheetBehavior.P;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.O;
                if (weakReference2 != null && weakReference2.get() == view) {
                    z10 = true;
                }
                return z10;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a(View view, float f10);

        public abstract void b(View view, int i10);
    }

    /* loaded from: classes.dex */
    public static class d extends s0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public final int f7235j;

        /* renamed from: m  reason: collision with root package name */
        public int f7236m;
        public boolean n;

        /* renamed from: t  reason: collision with root package name */
        public boolean f7237t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f7238u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7235j = parcel.readInt();
            this.f7236m = parcel.readInt();
            this.n = parcel.readInt() == 1;
            this.f7237t = parcel.readInt() == 1;
            this.f7238u = parcel.readInt() == 1;
        }

        public d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f7235j = bottomSheetBehavior.G;
            this.f7236m = bottomSheetBehavior.d;
            this.n = bottomSheetBehavior.f7209b;
            this.f7237t = bottomSheetBehavior.D;
            this.f7238u = bottomSheetBehavior.E;
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f7235j);
            parcel.writeInt(this.f7236m);
            parcel.writeInt(this.n ? 1 : 0);
            parcel.writeInt(this.f7237t ? 1 : 0);
            parcel.writeInt(this.f7238u ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final View f7239c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f7240f;

        /* renamed from: j  reason: collision with root package name */
        public int f7241j;

        public e(View view, int i10) {
            this.f7239c = view;
            this.f7241j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            t0.c cVar = BottomSheetBehavior.this.H;
            if (cVar == null || !cVar.j(true)) {
                BottomSheetBehavior.this.F(this.f7241j);
            } else {
                View view = this.f7239c;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.m(view, this);
            }
            this.f7240f = false;
        }
    }

    public BottomSheetBehavior() {
        this.f7208a = 0;
        this.f7209b = true;
        this.f7216j = -1;
        this.f7217k = -1;
        this.f7227v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f7208a = 0;
        this.f7209b = true;
        this.f7216j = -1;
        this.f7217k = -1;
        this.f7227v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<>();
        this.W = -1;
        this.X = new b();
        this.f7213g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.C);
        this.f7214h = obtainStyledAttributes.hasValue(17);
        int i11 = 3;
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        if (hasValue) {
            v(context, attributeSet, hasValue, za.c.a(context, obtainStyledAttributes, 3));
        } else {
            v(context, attributeSet, hasValue, null);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7228w = ofFloat;
        ofFloat.setDuration(500L);
        this.f7228w.addUpdateListener(new ka.a(this));
        this.C = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f7216j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f7217k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            D(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            D(i10);
        }
        C(obtainStyledAttributes.getBoolean(8, false));
        this.f7219m = obtainStyledAttributes.getBoolean(12, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f7209b != z10) {
            this.f7209b = z10;
            if (this.O != null) {
                t();
            }
            F((this.f7209b && this.G == 6) ? i11 : this.G);
            K();
        }
        this.E = obtainStyledAttributes.getBoolean(11, false);
        this.F = obtainStyledAttributes.getBoolean(4, true);
        this.f7208a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.A = f10;
        if (this.O != null) {
            this.f7230z = (int) ((1.0f - f10) * this.N);
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f7229x = dimensionPixelOffset;
        } else {
            int i12 = peekValue2.data;
            if (i12 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
            this.f7229x = i12;
        }
        this.n = obtainStyledAttributes.getBoolean(13, false);
        this.f7220o = obtainStyledAttributes.getBoolean(14, false);
        this.f7221p = obtainStyledAttributes.getBoolean(15, false);
        this.f7222q = obtainStyledAttributes.getBoolean(16, true);
        obtainStyledAttributes.recycle();
        this.f7210c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> BottomSheetBehavior<V> y(V v2) {
        ViewGroup.LayoutParams layoutParams = v2.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.e) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) layoutParams).f1788a;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public int A() {
        if (this.f7209b) {
            return this.y;
        }
        return Math.max(this.f7229x, this.f7222q ? 0 : this.f7224s);
    }

    public final void B(V v2, b.a aVar, int i10) {
        x.t(v2, aVar, null, new ka.c(this, i10));
    }

    public void C(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            if (!z10 && this.G == 5) {
                E(4);
            }
            K();
        }
    }

    public void D(int i10) {
        boolean z10 = true;
        if (i10 == -1) {
            if (!this.f7211e) {
                this.f7211e = true;
            }
            z10 = false;
        } else {
            if (!this.f7211e) {
                if (this.d != i10) {
                }
                z10 = false;
            }
            this.f7211e = false;
            this.d = Math.max(0, i10);
        }
        if (z10) {
            N(false);
        }
    }

    public void E(int i10) {
        if (i10 == this.G) {
            return;
        }
        if (this.O != null) {
            H(i10);
            return;
        }
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.D && i10 == 5)) {
            this.G = i10;
        }
    }

    public void F(int i10) {
        V v2;
        if (this.G == i10) {
            return;
        }
        this.G = i10;
        if (i10 != 4 && i10 != 3 && i10 != 6) {
            boolean z10 = this.D;
        }
        WeakReference<V> weakReference = this.O;
        if (weakReference == null || (v2 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            M(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            M(false);
        }
        L(i10);
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            this.Q.get(i11).b(v2, i10);
        }
        K();
    }

    public void G(View view, int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            i11 = this.B;
        } else if (i10 == 6) {
            int i13 = this.f7230z;
            if (!this.f7209b || i13 > (i12 = this.y)) {
                i11 = i13;
            } else {
                i11 = i12;
                i10 = 3;
            }
        } else if (i10 == 3) {
            i11 = A();
        } else if (!this.D || i10 != 5) {
            Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
            return;
        } else {
            i11 = this.N;
        }
        J(view, i10, i11, false);
    }

    public final void H(int i10) {
        V v2 = this.O.get();
        if (v2 == null) {
            return;
        }
        ViewParent parent = v2.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.g.b(v2)) {
                v2.post(new a(v2, i10));
                return;
            }
        }
        G(v2, i10);
    }

    public boolean I(View view, float f10) {
        if (this.E) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        return Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.B)) / ((float) u()) > 0.5f;
    }

    public void J(View view, int i10, int i11, boolean z10) {
        t0.c cVar = this.H;
        if (!(cVar != null && (!z10 ? !cVar.z(view, view.getLeft(), i11) : !cVar.x(view.getLeft(), i11)))) {
            F(i10);
            return;
        }
        F(2);
        L(i10);
        if (this.f7227v == null) {
            this.f7227v = new e(view, i10);
        }
        BottomSheetBehavior<V>.e eVar = this.f7227v;
        if (eVar.f7240f) {
            eVar.f7241j = i10;
            return;
        }
        eVar.f7241j = i10;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.m(view, eVar);
        this.f7227v.f7240f = true;
    }

    public final void K() {
        V v2;
        int i10;
        WeakReference<V> weakReference = this.O;
        if (weakReference != null && (v2 = weakReference.get()) != null) {
            x.s(524288, v2);
            x.m(v2, 0);
            x.s(262144, v2);
            x.m(v2, 0);
            x.s(1048576, v2);
            x.m(v2, 0);
            int i11 = this.W;
            if (i11 != -1) {
                x.s(i11, v2);
                x.m(v2, 0);
            }
            if (!this.f7209b && this.G != 6) {
                String string = v2.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                ka.c cVar = new ka.c(this, 6);
                List<b.a> j10 = x.j(v2);
                int i12 = 0;
                while (true) {
                    if (i12 >= j10.size()) {
                        int i13 = -1;
                        int i14 = 0;
                        while (true) {
                            int[] iArr = x.f13159e;
                            if (i14 >= iArr.length || i13 != -1) {
                                break;
                            }
                            int i15 = iArr[i14];
                            boolean z10 = true;
                            for (int i16 = 0; i16 < j10.size(); i16++) {
                                z10 &= j10.get(i16).a() != i15;
                            }
                            if (z10) {
                                i13 = i15;
                            }
                            i14++;
                        }
                        i10 = i13;
                    } else if (TextUtils.equals(string, j10.get(i12).b())) {
                        i10 = j10.get(i12).a();
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i10 != -1) {
                    x.a(v2, new b.a(null, i10, string, cVar, null));
                }
                this.W = i10;
            }
            if (this.D && this.G != 5) {
                B(v2, b.a.f13489l, 5);
            }
            int i17 = this.G;
            if (i17 == 3) {
                B(v2, b.a.f13488k, this.f7209b ? 4 : 6);
            } else if (i17 == 4) {
                B(v2, b.a.f13487j, this.f7209b ? 3 : 6);
            } else if (i17 == 6) {
                B(v2, b.a.f13488k, 4);
                B(v2, b.a.f13487j, 3);
            }
        }
    }

    public final void L(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f7226u != z10) {
            this.f7226u = z10;
            if (this.f7215i != null && (valueAnimator = this.f7228w) != null) {
                if (valueAnimator.isRunning()) {
                    this.f7228w.reverse();
                    return;
                }
                float f10 = z10 ? 0.0f : 1.0f;
                this.f7228w.setFloatValues(1.0f - f10, f10);
                this.f7228w.start();
            }
        }
    }

    public final void M(boolean z10) {
        WeakReference<V> weakReference = this.O;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.V != null) {
                    return;
                }
                this.V = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.O.get() && z10) {
                    this.V.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (!z10) {
                this.V = null;
            }
        }
    }

    public final void N(boolean z10) {
        V v2;
        if (this.O != null) {
            t();
            if (this.G == 4 && (v2 = this.O.get()) != null) {
                if (z10) {
                    H(this.G);
                    return;
                }
                v2.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void c(CoordinatorLayout.e eVar) {
        this.O = null;
        this.H = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void f() {
        this.O = null;
        this.H = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        t0.c cVar;
        boolean z10 = false;
        if (v2.isShown() && this.F) {
            int actionMasked = motionEvent.getActionMasked();
            View view = null;
            if (actionMasked == 0) {
                this.S = -1;
                VelocityTracker velocityTracker = this.R;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.R = null;
                }
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x10 = (int) motionEvent.getX();
                this.T = (int) motionEvent.getY();
                if (this.G != 2) {
                    WeakReference<View> weakReference = this.P;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && coordinatorLayout.u(view2, x10, this.T)) {
                        this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.U = true;
                    }
                }
                this.I = this.S == -1 && !coordinatorLayout.u(v2, x10, this.T);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.U = false;
                this.S = -1;
                if (this.I) {
                    this.I = false;
                    return false;
                }
            }
            if (this.I || (cVar = this.H) == null || !cVar.y(motionEvent)) {
                WeakReference<View> weakReference2 = this.P;
                if (weakReference2 != null) {
                    view = weakReference2.get();
                }
                if (actionMasked == 2 && view != null && !this.I && this.G != 1 && !coordinatorLayout.u(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.H != null && Math.abs(this.T - motionEvent.getY()) > this.H.f15078b) {
                    z10 = true;
                }
                return z10;
            }
            return true;
        }
        this.I = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r11, V r12, int r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean i(CoordinatorLayout coordinatorLayout, V v2, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        v2.measure(z(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f7216j, marginLayoutParams.width), z(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f7217k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean j(CoordinatorLayout coordinatorLayout, V v2, View view, float f10, float f11) {
        WeakReference<View> weakReference = this.P;
        return (weakReference == null || view != weakReference.get() || this.G == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v2.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < A()) {
                iArr[1] = top - A();
                x.o(v2, -iArr[1]);
                F(3);
            } else if (!this.F) {
                return;
            } else {
                iArr[1] = i11;
                x.o(v2, -i11);
                F(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i14 = this.B;
            if (i13 > i14 && !this.D) {
                iArr[1] = top - i14;
                x.o(v2, -iArr[1]);
                F(4);
            }
            if (!this.F) {
                return;
            }
            iArr[1] = i11;
            x.o(v2, -i11);
            F(1);
        }
        w(v2.getTop());
        this.J = i11;
        this.K = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void l(CoordinatorLayout coordinatorLayout, V v2, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void n(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f7208a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.d = dVar.f7236m;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f7209b = dVar.n;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.D = dVar.f7237t;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.E = dVar.f7238u;
            }
        }
        int i11 = dVar.f7235j;
        if (i11 == 1 || i11 == 2) {
            this.G = 4;
        } else {
            this.G = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable o(CoordinatorLayout coordinatorLayout, V v2) {
        return new d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i10, int i11) {
        this.J = 0;
        this.K = false;
        return (i10 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i10) {
        int i11;
        float yVelocity;
        int i12 = 3;
        if (v2.getTop() == A()) {
            F(3);
            return;
        }
        WeakReference<View> weakReference = this.P;
        if (weakReference != null && view == weakReference.get() && this.K) {
            if (this.J <= 0) {
                if (this.D) {
                    VelocityTracker velocityTracker = this.R;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f7210c);
                        yVelocity = this.R.getYVelocity(this.S);
                    }
                    if (I(v2, yVelocity)) {
                        i11 = this.N;
                        i12 = 5;
                    }
                }
                if (this.J == 0) {
                    int top = v2.getTop();
                    if (!this.f7209b) {
                        int i13 = this.f7230z;
                        if (top < i13) {
                            if (top < Math.abs(top - this.B)) {
                                i11 = A();
                            } else {
                                i11 = this.f7230z;
                            }
                        } else if (Math.abs(top - i13) < Math.abs(top - this.B)) {
                            i11 = this.f7230z;
                        } else {
                            i11 = this.B;
                            i12 = 4;
                        }
                        i12 = 6;
                    } else if (Math.abs(top - this.y) < Math.abs(top - this.B)) {
                        i11 = this.y;
                    } else {
                        i11 = this.B;
                        i12 = 4;
                    }
                } else {
                    if (this.f7209b) {
                        i11 = this.B;
                    } else {
                        int top2 = v2.getTop();
                        if (Math.abs(top2 - this.f7230z) < Math.abs(top2 - this.B)) {
                            i11 = this.f7230z;
                            i12 = 6;
                        } else {
                            i11 = this.B;
                        }
                    }
                    i12 = 4;
                }
            } else if (this.f7209b) {
                i11 = this.y;
            } else {
                int top3 = v2.getTop();
                int i14 = this.f7230z;
                if (top3 > i14) {
                    i11 = i14;
                    i12 = 6;
                } else {
                    i11 = A();
                }
            }
            J(v2, i12, i11, false);
            this.K = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            boolean r8 = r9.isShown()
            r5 = 0
            r0 = r5
            if (r8 != 0) goto L9
            return r0
        L9:
            r6 = 2
            int r8 = r10.getActionMasked()
            int r1 = r7.G
            r5 = 1
            r2 = r5
            if (r1 != r2) goto L18
            if (r8 != 0) goto L18
            r6 = 1
            return r2
        L18:
            t0.c r3 = r7.H
            r6 = 5
            if (r3 == 0) goto L29
            r6 = 6
            boolean r4 = r7.F
            if (r4 != 0) goto L26
            r6 = 4
            if (r1 != r2) goto L29
            r6 = 1
        L26:
            r1 = 1
            r6 = 6
            goto L2b
        L29:
            r1 = 0
            r6 = 2
        L2b:
            if (r1 == 0) goto L31
            r3.r(r10)
            r6 = 1
        L31:
            r6 = 2
            if (r8 != 0) goto L46
            r5 = -1
            r1 = r5
            r7.S = r1
            r6 = 4
            android.view.VelocityTracker r1 = r7.R
            r6 = 1
            if (r1 == 0) goto L46
            r6 = 4
            r1.recycle()
            r5 = 0
            r1 = r5
            r7.R = r1
        L46:
            android.view.VelocityTracker r1 = r7.R
            if (r1 != 0) goto L51
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r7.R = r1
            r6 = 6
        L51:
            android.view.VelocityTracker r1 = r7.R
            r1.addMovement(r10)
            t0.c r1 = r7.H
            r6 = 6
            if (r1 == 0) goto L67
            boolean r1 = r7.F
            if (r1 != 0) goto L65
            r6 = 3
            int r1 = r7.G
            if (r1 != r2) goto L67
            r6 = 5
        L65:
            r0 = 1
            r6 = 1
        L67:
            r6 = 4
            if (r0 == 0) goto L99
            r0 = 2
            r6 = 5
            if (r8 != r0) goto L99
            boolean r8 = r7.I
            r6 = 6
            if (r8 != 0) goto L99
            r6 = 6
            int r8 = r7.T
            float r8 = (float) r8
            float r0 = r10.getY()
            float r8 = r8 - r0
            r6 = 5
            float r8 = java.lang.Math.abs(r8)
            t0.c r0 = r7.H
            int r1 = r0.f15078b
            r6 = 4
            float r1 = (float) r1
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r6 = 4
            if (r8 <= 0) goto L99
            int r5 = r10.getActionIndex()
            r8 = r5
            int r5 = r10.getPointerId(r8)
            r8 = r5
            r0.c(r9, r8)
        L99:
            boolean r8 = r7.I
            r8 = r8 ^ r2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public void s(c cVar) {
        if (!this.Q.contains(cVar)) {
            this.Q.add(cVar);
        }
    }

    public final void t() {
        int u2 = u();
        if (this.f7209b) {
            this.B = Math.max(this.N - u2, this.y);
        } else {
            this.B = this.N - u2;
        }
    }

    public final int u() {
        int i10;
        return this.f7211e ? Math.min(Math.max(this.f7212f, this.N - ((this.M * 9) / 16)), this.L) + this.f7223r : (this.f7219m || this.n || (i10 = this.f7218l) <= 0) ? this.d + this.f7223r : Math.max(this.d, i10 + this.f7213g);
    }

    public final void v(Context context, AttributeSet attributeSet, boolean z10, ColorStateList colorStateList) {
        if (this.f7214h) {
            this.f7225t = k.c(context, attributeSet, R.attr.bottomSheetStyle, 2132018030).a();
            g gVar = new g(this.f7225t);
            this.f7215i = gVar;
            gVar.f3929c.f3939b = new ra.a(context);
            gVar.C();
            if (z10 && colorStateList != null) {
                this.f7215i.r(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f7215i.setTint(typedValue.data);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050 A[LOOP:0: B:15:0x0047->B:17:0x0050, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r7) {
        /*
            r6 = this;
            r3 = r6
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.O
            r5 = 4
            java.lang.Object r5 = r0.get()
            r0 = r5
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L63
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r1 = r3.Q
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L63
            r5 = 2
            int r1 = r3.B
            if (r7 > r1) goto L35
            r5 = 3
            int r2 = r3.A()
            if (r1 != r2) goto L23
            r5 = 3
            goto L36
        L23:
            r5 = 3
            int r1 = r3.B
            r5 = 6
            int r7 = r1 - r7
            float r7 = (float) r7
            r5 = 1
            int r5 = r3.A()
            r2 = r5
            int r1 = r1 - r2
            r5 = 3
            float r1 = (float) r1
            r5 = 6
            goto L43
        L35:
            r5 = 7
        L36:
            int r1 = r3.B
            r5 = 2
            int r7 = r1 - r7
            r5 = 5
            float r7 = (float) r7
            int r2 = r3.N
            int r2 = r2 - r1
            r5 = 2
            float r1 = (float) r2
            r5 = 7
        L43:
            float r7 = r7 / r1
            r5 = 1
            r5 = 0
            r1 = r5
        L47:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r2 = r3.Q
            int r5 = r2.size()
            r2 = r5
            if (r1 >= r2) goto L63
            r5 = 1
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r2 = r3.Q
            r5 = 6
            java.lang.Object r5 = r2.get(r1)
            r2 = r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior.c) r2
            r2.a(r0, r7)
            r5 = 2
            int r1 = r1 + 1
            r5 = 4
            goto L47
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.w(int):void");
    }

    public View x(View view) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View x10 = x(viewGroup.getChildAt(i10));
                if (x10 != null) {
                    return x10;
                }
            }
        }
        return null;
    }

    public final int z(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, IntCompanionObject.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }
}
