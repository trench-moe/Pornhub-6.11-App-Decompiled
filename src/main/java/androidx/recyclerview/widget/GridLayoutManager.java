package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import o0.b;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public b K;
    public final Rect L;

    /* loaded from: classes.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public int f2734e;

        /* renamed from: f  reason: collision with root package name */
        public int f2735f;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f2734e = -1;
            this.f2735f = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2734e = -1;
            this.f2735f = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2734e = -1;
            this.f2735f = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2734e = -1;
            this.f2735f = 0;
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int b(int i10, int i11) {
            return i10 % i11;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int c(int i10) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f2736a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f2737b = new SparseIntArray();

        public int a(int i10, int i11) {
            int c10 = c(i10);
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int c11 = c(i14);
                i12 += c11;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = c11;
                }
            }
            return i12 + c10 > i11 ? i13 + 1 : i13;
        }

        public int b(int i10, int i11) {
            int c10 = c(i10);
            if (c10 == i11) {
                return 0;
            }
            int i12 = 0;
            for (int i13 = 0; i13 < i10; i13++) {
                int c11 = c(i13);
                i12 += c11;
                if (i12 == i11) {
                    i12 = 0;
                } else if (i12 > i11) {
                    i12 = c11;
                }
            }
            if (c10 + i12 <= i11) {
                return i12;
            }
            return 0;
        }

        public abstract int c(int i10);
    }

    public GridLayoutManager(Context context, int i10) {
        super(1, false);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        B1(i10);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(i11, z10);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        B1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new a();
        this.L = new Rect();
        B1(RecyclerView.l.Q(context, attributeSet, i10, i11).f2837b);
    }

    public final void A1(View view, int i10, int i11, boolean z10) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z10 ? I0(view, i10, i11, layoutParams) : G0(view, i10, i11, layoutParams)) {
            view.measure(i10, i11);
        }
    }

    public void B1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(a1.a.j("Span count should be at least 1. Provided ", i10));
        }
        this.F = i10;
        this.K.f2736a.clear();
        w0();
    }

    public final void C1() {
        int L;
        int O;
        if (this.f2738p == 1) {
            L = this.n - N();
            O = M();
        } else {
            L = this.f2833o - L();
            O = O();
        }
        t1(L - O);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void D0(Rect rect, int i10, int i11) {
        int h10;
        int h11;
        if (this.G == null) {
            super.D0(rect, i10, i11);
        }
        int N = N() + M();
        int L = L() + O();
        if (this.f2738p == 1) {
            h11 = RecyclerView.l.h(i11, rect.height() + L, J());
            int[] iArr = this.G;
            h10 = RecyclerView.l.h(i10, iArr[iArr.length - 1] + N, K());
        } else {
            h10 = RecyclerView.l.h(i10, rect.width() + N, K());
            int[] iArr2 = this.G;
            h11 = RecyclerView.l.h(i11, iArr2[iArr2.length - 1] + L, J());
        }
        this.f2822b.setMeasuredDimension(h10, h11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public boolean L0() {
        return this.f2747z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void N0(RecyclerView.w wVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F && cVar.b(wVar) && i10 > 0; i11++) {
            int i12 = cVar.d;
            ((p.b) cVar2).a(i12, Math.max(0, cVar.f2760g));
            i10 -= this.K.c(i12);
            cVar.d += cVar.f2758e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int R(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f2738p == 0) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return w1(rVar, wVar, wVar.b() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010e, code lost:
        if (r13 == (r2 > r8)) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View a0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.r r25, androidx.recyclerview.widget.RecyclerView.w r26) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View b1(RecyclerView.r rVar, RecyclerView.w wVar, boolean z10, boolean z11) {
        int i10;
        int x10 = x();
        int i11 = -1;
        int i12 = 1;
        if (z11) {
            i10 = x() - 1;
            i12 = -1;
        } else {
            i11 = x10;
            i10 = 0;
        }
        int b10 = wVar.b();
        S0();
        int k10 = this.f2740r.k();
        int g10 = this.f2740r.g();
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View w10 = w(i10);
            int P = P(w10);
            if (P >= 0 && P < b10 && x1(rVar, wVar, P) == 0) {
                if (!((RecyclerView.LayoutParams) w10.getLayoutParams()).c()) {
                    if (this.f2740r.e(w10) < g10 && this.f2740r.b(w10) >= k10) {
                        return w10;
                    }
                    if (view == null) {
                        view = w10;
                    }
                } else if (view2 == null) {
                    view2 = w10;
                }
            }
            i10 += i12;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void e0(RecyclerView.r rVar, RecyclerView.w wVar, View view, o0.b bVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            d0(view, bVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int w12 = w1(rVar, wVar, layoutParams2.a());
        if (this.f2738p == 0) {
            bVar.r(b.c.a(layoutParams2.f2734e, layoutParams2.f2735f, w12, 1, false, false));
        } else {
            bVar.r(b.c.a(w12, 1, layoutParams2.f2734e, layoutParams2.f2735f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void f0(RecyclerView recyclerView, int i10, int i11) {
        this.K.f2736a.clear();
        this.K.f2737b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void g0(RecyclerView recyclerView) {
        this.K.f2736a.clear();
        this.K.f2737b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void h0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.K.f2736a.clear();
        this.K.f2737b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r21.f2753b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v28 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h1(androidx.recyclerview.widget.RecyclerView.r r18, androidx.recyclerview.widget.RecyclerView.w r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.h1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void i0(RecyclerView recyclerView, int i10, int i11) {
        this.K.f2736a.clear();
        this.K.f2737b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void i1(RecyclerView.r rVar, RecyclerView.w wVar, LinearLayoutManager.a aVar, int i10) {
        C1();
        if (wVar.b() > 0 && !wVar.f2871g) {
            boolean z10 = i10 == 1;
            int x12 = x1(rVar, wVar, aVar.f2749b);
            if (z10) {
                while (x12 > 0) {
                    int i11 = aVar.f2749b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f2749b = i12;
                    x12 = x1(rVar, wVar, i12);
                }
            } else {
                int b10 = wVar.b() - 1;
                int i13 = aVar.f2749b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int x13 = x1(rVar, wVar, i14);
                    if (x13 <= x12) {
                        break;
                    }
                    i13 = i14;
                    x12 = x13;
                }
                aVar.f2749b = i13;
            }
        }
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.K.f2736a.clear();
        this.K.f2737b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public void k0(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (wVar.f2871g) {
            int x10 = x();
            for (int i10 = 0; i10 < x10; i10++) {
                LayoutParams layoutParams = (LayoutParams) w(i10).getLayoutParams();
                int a10 = layoutParams.a();
                this.I.put(a10, layoutParams.f2735f);
                this.J.put(a10, layoutParams.f2734e);
            }
        }
        super.k0(rVar, wVar);
        this.I.clear();
        this.J.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public int l(RecyclerView.w wVar) {
        return P0(wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public void l0(RecyclerView.w wVar) {
        super.l0(wVar);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public int m(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public int o(RecyclerView.w wVar) {
        return P0(wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public int p(RecyclerView.w wVar) {
        return Q0(wVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void p1(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        d(null);
        if (this.f2744v) {
            this.f2744v = false;
            w0();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.LayoutParams t() {
        return this.f2738p == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    public final void t1(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.LayoutParams u(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final void u1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public RecyclerView.LayoutParams v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int v1(int i10, int i11) {
        if (this.f2738p != 1 || !g1()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int w1(RecyclerView.r rVar, RecyclerView.w wVar, int i10) {
        if (wVar.f2871g) {
            int c10 = rVar.c(i10);
            if (c10 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
                return 0;
            }
            return this.K.a(c10, this.F);
        }
        return this.K.a(i10, this.F);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public int x0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        C1();
        u1();
        if (this.f2738p == 1) {
            return 0;
        }
        return n1(i10, rVar, wVar);
    }

    public final int x1(RecyclerView.r rVar, RecyclerView.w wVar, int i10) {
        if (wVar.f2871g) {
            int i11 = this.J.get(i10, -1);
            if (i11 != -1) {
                return i11;
            }
            int c10 = rVar.c(i10);
            if (c10 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
                return 0;
            }
            return this.K.b(c10, this.F);
        }
        return this.K.b(i10, this.F);
    }

    public final int y1(RecyclerView.r rVar, RecyclerView.w wVar, int i10) {
        if (wVar.f2871g) {
            int i11 = this.I.get(i10, -1);
            if (i11 != -1) {
                return i11;
            }
            int c10 = rVar.c(i10);
            if (c10 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
                return 1;
            }
            return this.K.c(c10);
        }
        return this.K.c(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public int z(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f2738p == 1) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return w1(rVar, wVar, wVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.l
    public int z0(int i10, RecyclerView.r rVar, RecyclerView.w wVar) {
        C1();
        u1();
        if (this.f2738p == 0) {
            return 0;
        }
        return n1(i10, rVar, wVar);
    }

    public final void z1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f2808b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int v12 = v1(layoutParams.f2734e, layoutParams.f2735f);
        if (this.f2738p == 1) {
            i12 = RecyclerView.l.y(v12, i10, i14, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i11 = RecyclerView.l.y(this.f2740r.l(), this.f2832m, i13, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int y = RecyclerView.l.y(v12, i10, i13, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int y10 = RecyclerView.l.y(this.f2740r.l(), this.f2831l, i14, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i11 = y;
            i12 = y10;
        }
        A1(view, i12, i11, z10);
    }
}
