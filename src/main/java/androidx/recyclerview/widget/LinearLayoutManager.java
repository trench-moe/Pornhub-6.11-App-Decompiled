package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public final a A;
    public final b B;
    public int C;
    public int[] D;

    /* renamed from: p  reason: collision with root package name */
    public int f2738p;

    /* renamed from: q  reason: collision with root package name */
    public c f2739q;

    /* renamed from: r  reason: collision with root package name */
    public y f2740r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2741s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2742t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2743u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2744v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2745w;

    /* renamed from: x  reason: collision with root package name */
    public int f2746x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public d f2747z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public y f2748a;

        /* renamed from: b  reason: collision with root package name */
        public int f2749b;

        /* renamed from: c  reason: collision with root package name */
        public int f2750c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2751e;

        public a() {
            d();
        }

        public void a() {
            this.f2750c = this.d ? this.f2748a.g() : this.f2748a.k();
        }

        public void b(View view, int i10) {
            if (this.d) {
                this.f2750c = this.f2748a.m() + this.f2748a.b(view);
            } else {
                this.f2750c = this.f2748a.e(view);
            }
            this.f2749b = i10;
        }

        public void c(View view, int i10) {
            int m10 = this.f2748a.m();
            if (m10 >= 0) {
                b(view, i10);
                return;
            }
            this.f2749b = i10;
            if (!this.d) {
                int e10 = this.f2748a.e(view);
                int k10 = e10 - this.f2748a.k();
                this.f2750c = e10;
                if (k10 > 0) {
                    int g10 = (this.f2748a.g() - Math.min(0, (this.f2748a.g() - m10) - this.f2748a.b(view))) - (this.f2748a.c(view) + e10);
                    if (g10 < 0) {
                        this.f2750c -= Math.min(k10, -g10);
                        return;
                    }
                    return;
                }
                return;
            }
            int g11 = (this.f2748a.g() - m10) - this.f2748a.b(view);
            this.f2750c = this.f2748a.g() - g11;
            if (g11 > 0) {
                int c10 = this.f2750c - this.f2748a.c(view);
                int k11 = this.f2748a.k();
                int min = c10 - (Math.min(this.f2748a.e(view) - k11, 0) + k11);
                if (min < 0) {
                    this.f2750c = Math.min(g11, -min) + this.f2750c;
                }
            }
        }

        public void d() {
            this.f2749b = -1;
            this.f2750c = IntCompanionObject.MIN_VALUE;
            this.d = false;
            this.f2751e = false;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("AnchorInfo{mPosition=");
            m10.append(this.f2749b);
            m10.append(", mCoordinate=");
            m10.append(this.f2750c);
            m10.append(", mLayoutFromEnd=");
            m10.append(this.d);
            m10.append(", mValid=");
            return a0.a.l(m10, this.f2751e, '}');
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2752a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2753b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2754c;
        public boolean d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f2756b;

        /* renamed from: c  reason: collision with root package name */
        public int f2757c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f2758e;

        /* renamed from: f  reason: collision with root package name */
        public int f2759f;

        /* renamed from: g  reason: collision with root package name */
        public int f2760g;

        /* renamed from: j  reason: collision with root package name */
        public int f2763j;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2765l;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2755a = true;

        /* renamed from: h  reason: collision with root package name */
        public int f2761h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f2762i = 0;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.z> f2764k = null;

        public void a(View view) {
            int a10;
            int size = this.f2764k.size();
            View view2 = null;
            int i10 = IntCompanionObject.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f2764k.get(i11).f2885a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.c() && (a10 = (layoutParams.a() - this.d) * this.f2758e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).a();
            }
        }

        public boolean b(RecyclerView.w wVar) {
            int i10 = this.d;
            return i10 >= 0 && i10 < wVar.b();
        }

        public View c(RecyclerView.r rVar) {
            List<RecyclerView.z> list = this.f2764k;
            if (list == null) {
                View view = rVar.j(this.d, false, Long.MAX_VALUE).f2885a;
                this.d += this.f2758e;
                return view;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = this.f2764k.get(i10).f2885a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view2.getLayoutParams();
                if (!layoutParams.c() && this.d == layoutParams.a()) {
                    a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2766c;

        /* renamed from: f  reason: collision with root package name */
        public int f2767f;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2768j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f2766c = parcel.readInt();
            this.f2767f = parcel.readInt();
            this.f2768j = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f2766c = dVar.f2766c;
            this.f2767f = dVar.f2767f;
            this.f2768j = dVar.f2768j;
        }

        public boolean a() {
            return this.f2766c >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2766c);
            parcel.writeInt(this.f2767f);
            parcel.writeInt(this.f2768j ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i10, boolean z10) {
        this.f2738p = 1;
        this.f2742t = false;
        this.f2743u = false;
        this.f2744v = false;
        this.f2745w = true;
        this.f2746x = -1;
        this.y = IntCompanionObject.MIN_VALUE;
        this.f2747z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        o1(i10);
        d(null);
        if (z10 == this.f2742t) {
            return;
        }
        this.f2742t = z10;
        w0();
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2738p = 1;
        this.f2742t = false;
        this.f2743u = false;
        this.f2744v = false;
        this.f2745w = true;
        this.f2746x = -1;
        this.y = IntCompanionObject.MIN_VALUE;
        this.f2747z = null;
        this.A = new a();
        this.B = new b();
        this.C = 2;
        this.D = new int[2];
        RecyclerView.l.d Q = RecyclerView.l.Q(context, attributeSet, i10, i11);
        o1(Q.f2836a);
        boolean z10 = Q.f2838c;
        d(null);
        if (z10 != this.f2742t) {
            this.f2742t = z10;
            w0();
        }
        p1(Q.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean H0() {
        boolean z10;
        if (this.f2832m != 1073741824 && this.f2831l != 1073741824) {
            int x10 = x();
            int i10 = 0;
            while (true) {
                if (i10 >= x10) {
                    z10 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = w(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void J0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        r rVar = new r(recyclerView.getContext());
        rVar.f2853a = i10;
        K0(rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean L0() {
        return this.f2747z == null && this.f2741s == this.f2744v;
    }

    public void M0(RecyclerView.w wVar, int[] iArr) {
        int i10;
        int l10 = wVar.f2866a != -1 ? this.f2740r.l() : 0;
        if (this.f2739q.f2759f == -1) {
            i10 = 0;
        } else {
            i10 = l10;
            l10 = 0;
        }
        iArr[0] = l10;
        iArr[1] = i10;
    }

    public void N0(RecyclerView.w wVar, c cVar, RecyclerView.l.c cVar2) {
        int i10 = cVar.d;
        if (i10 < 0 || i10 >= wVar.b()) {
            return;
        }
        ((p.b) cVar2).a(i10, Math.max(0, cVar.f2760g));
    }

    public final int O0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        S0();
        return d0.a(wVar, this.f2740r, W0(!this.f2745w, true), V0(!this.f2745w, true), this, this.f2745w);
    }

    public final int P0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        S0();
        return d0.b(wVar, this.f2740r, W0(!this.f2745w, true), V0(!this.f2745w, true), this, this.f2745w, this.f2743u);
    }

    public final int Q0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        S0();
        return d0.c(wVar, this.f2740r, W0(!this.f2745w, true), V0(!this.f2745w, true), this, this.f2745w);
    }

    public int R0(int i10) {
        if (i10 == 1) {
            return (this.f2738p != 1 && g1()) ? 1 : -1;
        } else if (i10 == 2) {
            return (this.f2738p != 1 && g1()) ? -1 : 1;
        } else if (i10 == 17) {
            if (this.f2738p == 0) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        } else if (i10 == 33) {
            if (this.f2738p == 1) {
                return -1;
            }
            return IntCompanionObject.MIN_VALUE;
        } else if (i10 == 66) {
            if (this.f2738p == 0) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        } else {
            if (i10 == 130 && this.f2738p == 1) {
                return 1;
            }
            return IntCompanionObject.MIN_VALUE;
        }
    }

    public void S0() {
        if (this.f2739q == null) {
            this.f2739q = new c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean T() {
        return true;
    }

    public int T0(RecyclerView.r rVar, c cVar, RecyclerView.w wVar, boolean z10) {
        int i10 = cVar.f2757c;
        int i11 = cVar.f2760g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f2760g = i11 + i10;
            }
            j1(rVar, cVar);
        }
        int i12 = cVar.f2757c + cVar.f2761h;
        b bVar = this.B;
        while (true) {
            if (!cVar.f2765l && i12 <= 0) {
                break;
            }
            if (!cVar.b(wVar)) {
                break;
            }
            bVar.f2752a = 0;
            bVar.f2753b = false;
            bVar.f2754c = false;
            bVar.d = false;
            h1(rVar, wVar, cVar, bVar);
            if (!bVar.f2753b) {
                int i13 = cVar.f2756b;
                int i14 = bVar.f2752a;
                cVar.f2756b = (cVar.f2759f * i14) + i13;
                if (!bVar.f2754c || cVar.f2764k != null || !wVar.f2871g) {
                    cVar.f2757c -= i14;
                    i12 -= i14;
                }
                int i15 = cVar.f2760g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    cVar.f2760g = i16;
                    int i17 = cVar.f2757c;
                    if (i17 < 0) {
                        cVar.f2760g = i16 + i17;
                    }
                    j1(rVar, cVar);
                }
                if (z10 && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f2757c;
    }

    public int U0() {
        View a12 = a1(0, x(), true, false);
        if (a12 == null) {
            return -1;
        }
        return P(a12);
    }

    public View V0(boolean z10, boolean z11) {
        return this.f2743u ? a1(0, x(), z10, z11) : a1(x() - 1, -1, z10, z11);
    }

    public View W0(boolean z10, boolean z11) {
        return this.f2743u ? a1(x() - 1, -1, z10, z11) : a1(0, x(), z10, z11);
    }

    public int X0() {
        View a12 = a1(0, x(), false, true);
        if (a12 == null) {
            return -1;
        }
        return P(a12);
    }

    public int Y0() {
        View a12 = a1(x() - 1, -1, false, true);
        if (a12 == null) {
            return -1;
        }
        return P(a12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void Z(RecyclerView recyclerView, RecyclerView.r rVar) {
    }

    public View Z0(int i10, int i11) {
        int i12;
        int i13;
        S0();
        if (i11 > i10 ? true : i11 < i10 ? true : false) {
            if (this.f2740r.e(w(i10)) < this.f2740r.k()) {
                i12 = 16644;
                i13 = 16388;
            } else {
                i12 = 4161;
                i13 = 4097;
            }
            return this.f2738p == 0 ? this.f2823c.a(i10, i11, i12, i13) : this.d.a(i10, i11, i12, i13);
        }
        return w(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v.b
    public PointF a(int i10) {
        if (x() == 0) {
            return null;
        }
        int i11 = 1;
        if ((i10 < P(w(0))) != this.f2743u) {
            i11 = -1;
        }
        return this.f2738p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View a0(View view, int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        int R0;
        m1();
        if (x() == 0 || (R0 = R0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        S0();
        q1(R0, (int) (this.f2740r.l() * 0.33333334f), false, wVar);
        c cVar = this.f2739q;
        cVar.f2760g = IntCompanionObject.MIN_VALUE;
        cVar.f2755a = false;
        T0(rVar, cVar, wVar, true);
        View Z0 = R0 == -1 ? this.f2743u ? Z0(x() - 1, -1) : Z0(0, x()) : this.f2743u ? Z0(0, x()) : Z0(x() - 1, -1);
        View f12 = R0 == -1 ? f1() : e1();
        if (f12.hasFocusable()) {
            if (Z0 == null) {
                return null;
            }
            return f12;
        }
        return Z0;
    }

    public View a1(int i10, int i11, boolean z10, boolean z11) {
        S0();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return this.f2738p == 0 ? this.f2823c.a(i10, i11, i13, i12) : this.d.a(i10, i11, i13, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(X0());
            accessibilityEvent.setToIndex(Y0());
        }
    }

    public View b1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z10, boolean z11) {
        int i10;
        int i11;
        S0();
        int x10 = x();
        int i12 = -1;
        if (z11) {
            i10 = x() - 1;
            i11 = -1;
        } else {
            i12 = x10;
            i10 = 0;
            i11 = 1;
        }
        int b10 = wVar.b();
        int k10 = this.f2740r.k();
        int g10 = this.f2740r.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i10 != i12) {
            View w10 = w(i10);
            int P = P(w10);
            int e10 = this.f2740r.e(w10);
            int b11 = this.f2740r.b(w10);
            if (P >= 0 && P < b10) {
                if (!((RecyclerView.LayoutParams) w10.getLayoutParams()).c()) {
                    boolean z12 = b11 <= k10 && e10 < k10;
                    boolean z13 = e10 >= g10 && b11 > g10;
                    if (!z12 && !z13) {
                        return w10;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = w10;
                        }
                        view2 = w10;
                    } else {
                        if (!z12) {
                            if (view != null) {
                            }
                            view = w10;
                        }
                        view2 = w10;
                    }
                } else if (view3 == null) {
                    view3 = w10;
                }
            }
            i10 += i11;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public final int c1(int i10, RecyclerView.r rVar, RecyclerView.w wVar, boolean z10) {
        int g10;
        int g11 = this.f2740r.g() - i10;
        if (g11 > 0) {
            int i11 = -n1(-g11, rVar, wVar);
            int i12 = i10 + i11;
            if (!z10 || (g10 = this.f2740r.g() - i12) <= 0) {
                return i11;
            }
            this.f2740r.p(g10);
            return g10 + i11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void d(String str) {
        RecyclerView recyclerView;
        if (this.f2747z == null && (recyclerView = this.f2822b) != null) {
            recyclerView.i(str);
        }
    }

    public final int d1(int i10, RecyclerView.r rVar, RecyclerView.w wVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f2740r.k();
        if (k11 > 0) {
            int i11 = -n1(k11, rVar, wVar);
            int i12 = i10 + i11;
            if (!z10 || (k10 = i12 - this.f2740r.k()) <= 0) {
                return i11;
            }
            this.f2740r.p(-k10);
            return i11 - k10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean e() {
        return this.f2738p == 0;
    }

    public final View e1() {
        return w(this.f2743u ? 0 : x() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f() {
        return this.f2738p == 1;
    }

    public final View f1() {
        return w(this.f2743u ? x() - 1 : 0);
    }

    public boolean g1() {
        return I() == 1;
    }

    public void h1(RecyclerView.r rVar, RecyclerView.w wVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int d10;
        View c10 = cVar.c(rVar);
        if (c10 == null) {
            bVar.f2753b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) c10.getLayoutParams();
        if (cVar.f2764k == null) {
            if (this.f2743u == (cVar.f2759f == -1)) {
                c(c10, -1, false);
            } else {
                c(c10, 0, false);
            }
        } else {
            if (this.f2743u == (cVar.f2759f == -1)) {
                c(c10, -1, true);
            } else {
                c(c10, 0, true);
            }
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) c10.getLayoutParams();
        Rect M = this.f2822b.M(c10);
        int y = RecyclerView.l.y(this.n, this.f2831l, N() + M() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + M.left + M.right + 0, ((ViewGroup.MarginLayoutParams) layoutParams2).width, e());
        int y10 = RecyclerView.l.y(this.f2833o, this.f2832m, L() + O() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + M.top + M.bottom + 0, ((ViewGroup.MarginLayoutParams) layoutParams2).height, f());
        if (G0(c10, y, y10, layoutParams2)) {
            c10.measure(y, y10);
        }
        bVar.f2752a = this.f2740r.c(c10);
        if (this.f2738p == 1) {
            if (g1()) {
                d10 = this.n - N();
                i13 = d10 - this.f2740r.d(c10);
            } else {
                i13 = M();
                d10 = this.f2740r.d(c10) + i13;
            }
            if (cVar.f2759f == -1) {
                int i14 = cVar.f2756b;
                i12 = i14;
                i11 = d10;
                i10 = i14 - bVar.f2752a;
            } else {
                int i15 = cVar.f2756b;
                i10 = i15;
                i11 = d10;
                i12 = bVar.f2752a + i15;
            }
        } else {
            int O = O();
            int d11 = this.f2740r.d(c10) + O;
            if (cVar.f2759f == -1) {
                int i16 = cVar.f2756b;
                i11 = i16;
                i10 = O;
                i12 = d11;
                i13 = i16 - bVar.f2752a;
            } else {
                int i17 = cVar.f2756b;
                i10 = O;
                i11 = bVar.f2752a + i17;
                i12 = d11;
                i13 = i17;
            }
        }
        V(c10, i13, i10, i11, i12);
        if (layoutParams.c() || layoutParams.b()) {
            bVar.f2754c = true;
        }
        bVar.d = c10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i(int i10, int i11, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        if (this.f2738p != 0) {
            i10 = i11;
        }
        if (x() != 0) {
            if (i10 == 0) {
                return;
            }
            S0();
            q1(i10 > 0 ? 1 : -1, Math.abs(i10), true, wVar);
            N0(wVar, this.f2739q, cVar);
        }
    }

    public void i1(RecyclerView.r rVar, RecyclerView.w wVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(int i10, RecyclerView.l.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.f2747z;
        int i12 = -1;
        if (dVar == null || !dVar.a()) {
            m1();
            z10 = this.f2743u;
            i11 = this.f2746x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.f2747z;
            z10 = dVar2.f2768j;
            i11 = dVar2.f2766c;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            ((p.b) cVar).a(i11, 0);
            i11 += i12;
        }
    }

    public final void j1(RecyclerView.r rVar, c cVar) {
        int i10;
        if (cVar.f2755a) {
            if (!cVar.f2765l) {
                int i11 = cVar.f2760g;
                int i12 = cVar.f2762i;
                if (cVar.f2759f == -1) {
                    int x10 = x();
                    if (i11 < 0) {
                        return;
                    }
                    int f10 = (this.f2740r.f() - i11) + i12;
                    if (this.f2743u) {
                        while (i10 < x10) {
                            View w10 = w(i10);
                            i10 = (this.f2740r.e(w10) >= f10 && this.f2740r.o(w10) >= f10) ? i10 + 1 : 0;
                            k1(rVar, 0, i10);
                            return;
                        }
                    }
                    int i13 = x10 - 1;
                    for (int i14 = i13; i14 >= 0; i14--) {
                        View w11 = w(i14);
                        if (this.f2740r.e(w11) >= f10 && this.f2740r.o(w11) >= f10) {
                        }
                        k1(rVar, i13, i14);
                        return;
                    }
                } else if (i11 >= 0) {
                    int i15 = i11 - i12;
                    int x11 = x();
                    if (this.f2743u) {
                        int i16 = x11 - 1;
                        for (int i17 = i16; i17 >= 0; i17--) {
                            View w12 = w(i17);
                            if (this.f2740r.b(w12) <= i15 && this.f2740r.n(w12) <= i15) {
                            }
                            k1(rVar, i16, i17);
                            return;
                        }
                    }
                    for (int i18 = 0; i18 < x11; i18++) {
                        View w13 = w(i18);
                        if (this.f2740r.b(w13) <= i15 && this.f2740r.n(w13) <= i15) {
                        }
                        k1(rVar, 0, i18);
                        break;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int k(RecyclerView.w wVar) {
        return O0(wVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k0(androidx.recyclerview.widget.RecyclerView.r r17, androidx.recyclerview.widget.RecyclerView.w r18) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.k0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public final void k1(RecyclerView.r rVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 > i10) {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                t0(i12, rVar);
            }
        } else {
            while (i10 > i11) {
                t0(i10, rVar);
                i10--;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.w wVar) {
        return P0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void l0(RecyclerView.w wVar) {
        this.f2747z = null;
        this.f2746x = -1;
        this.y = IntCompanionObject.MIN_VALUE;
        this.A.d();
    }

    public boolean l1() {
        return this.f2740r.i() == 0 && this.f2740r.f() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void m0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.f2747z = dVar;
            if (this.f2746x != -1) {
                dVar.f2766c = -1;
            }
            w0();
        }
    }

    public final void m1() {
        if (this.f2738p == 1 || !g1()) {
            this.f2743u = this.f2742t;
        } else {
            this.f2743u = !this.f2742t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int n(RecyclerView.w wVar) {
        return O0(wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public Parcelable n0() {
        d dVar = this.f2747z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (x() > 0) {
            S0();
            boolean z10 = this.f2741s ^ this.f2743u;
            dVar2.f2768j = z10;
            if (z10) {
                View e12 = e1();
                dVar2.f2767f = this.f2740r.g() - this.f2740r.b(e12);
                dVar2.f2766c = P(e12);
            } else {
                View f12 = f1();
                dVar2.f2766c = P(f12);
                dVar2.f2767f = this.f2740r.e(f12) - this.f2740r.k();
            }
        } else {
            dVar2.f2766c = -1;
        }
        return dVar2;
    }

    public int n1(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (x() == 0 || i10 == 0) {
            return 0;
        }
        S0();
        this.f2739q.f2755a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        q1(i11, abs, true, wVar);
        c cVar = this.f2739q;
        int T0 = T0(rVar, cVar, wVar, false) + cVar.f2760g;
        if (T0 < 0) {
            return 0;
        }
        if (abs > T0) {
            i10 = i11 * T0;
        }
        this.f2740r.p(-i10);
        this.f2739q.f2763j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.w wVar) {
        return P0(wVar);
    }

    public void o1(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a1.a.j("invalid orientation:", i10));
        }
        d(null);
        if (i10 != this.f2738p || this.f2740r == null) {
            y a10 = y.a(this, i10);
            this.f2740r = a10;
            this.A.f2748a = a10;
            this.f2738p = i10;
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int p(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    public void p1(boolean z10) {
        d(null);
        if (this.f2744v == z10) {
            return;
        }
        this.f2744v = z10;
        w0();
    }

    public final void q1(int i10, int i11, boolean z10, RecyclerView.w wVar) {
        int k10;
        this.f2739q.f2765l = l1();
        this.f2739q.f2759f = i10;
        int[] iArr = this.D;
        iArr[0] = 0;
        int i12 = 1;
        iArr[1] = 0;
        M0(wVar, iArr);
        int max = Math.max(0, this.D[0]);
        int max2 = Math.max(0, this.D[1]);
        boolean z11 = i10 == 1;
        c cVar = this.f2739q;
        int i13 = z11 ? max2 : max;
        cVar.f2761h = i13;
        if (!z11) {
            max = max2;
        }
        cVar.f2762i = max;
        if (z11) {
            cVar.f2761h = this.f2740r.h() + i13;
            View e12 = e1();
            c cVar2 = this.f2739q;
            if (this.f2743u) {
                i12 = -1;
            }
            cVar2.f2758e = i12;
            int P = P(e12);
            c cVar3 = this.f2739q;
            cVar2.d = P + cVar3.f2758e;
            cVar3.f2756b = this.f2740r.b(e12);
            k10 = this.f2740r.b(e12) - this.f2740r.g();
        } else {
            View f12 = f1();
            c cVar4 = this.f2739q;
            cVar4.f2761h = this.f2740r.k() + cVar4.f2761h;
            c cVar5 = this.f2739q;
            if (!this.f2743u) {
                i12 = -1;
            }
            cVar5.f2758e = i12;
            int P2 = P(f12);
            c cVar6 = this.f2739q;
            cVar5.d = P2 + cVar6.f2758e;
            cVar6.f2756b = this.f2740r.e(f12);
            k10 = (-this.f2740r.e(f12)) + this.f2740r.k();
        }
        c cVar7 = this.f2739q;
        cVar7.f2757c = i11;
        if (z10) {
            cVar7.f2757c = i11 - k10;
        }
        cVar7.f2760g = k10;
    }

    public final void r1(int i10, int i11) {
        this.f2739q.f2757c = this.f2740r.g() - i11;
        c cVar = this.f2739q;
        cVar.f2758e = this.f2743u ? -1 : 1;
        cVar.d = i10;
        cVar.f2759f = 1;
        cVar.f2756b = i11;
        cVar.f2760g = IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public View s(int i10) {
        int x10 = x();
        if (x10 == 0) {
            return null;
        }
        int P = i10 - P(w(0));
        if (P >= 0 && P < x10) {
            View w10 = w(P);
            if (P(w10) == i10) {
                return w10;
            }
        }
        return super.s(i10);
    }

    public final void s1(int i10, int i11) {
        this.f2739q.f2757c = i11 - this.f2740r.k();
        c cVar = this.f2739q;
        cVar.d = i10;
        cVar.f2758e = this.f2743u ? 1 : -1;
        cVar.f2759f = -1;
        cVar.f2756b = i11;
        cVar.f2760g = IntCompanionObject.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.LayoutParams t() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int x0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f2738p == 1) {
            return 0;
        }
        return n1(i10, rVar, wVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void y0(int i10) {
        this.f2746x = i10;
        this.y = IntCompanionObject.MIN_VALUE;
        d dVar = this.f2747z;
        if (dVar != null) {
            dVar.f2766c = -1;
        }
        w0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int z0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f2738p == 0) {
            return 0;
        }
        return n1(i10, rVar, wVar);
    }
}
