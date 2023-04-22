package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class z extends f0 {
    public y d;

    /* renamed from: e  reason: collision with root package name */
    public y f3124e;

    /* loaded from: classes.dex */
    public class a extends r {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.r, androidx.recyclerview.widget.RecyclerView.v
        public void f(View view, RecyclerView.w wVar, RecyclerView.v.a aVar) {
            z zVar = z.this;
            int[] b10 = zVar.b(zVar.f2977a.getLayoutManager(), view);
            int i10 = b10[0];
            int i11 = b10[1];
            int j10 = j(Math.max(Math.abs(i10), Math.abs(i11)));
            if (j10 > 0) {
                aVar.b(i10, i11, j10, this.f3111j);
            }
        }

        @Override // androidx.recyclerview.widget.r
        public float i(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.r
        public int k(int i10) {
            return Math.min(100, super.k(i10));
        }
    }

    @Override // androidx.recyclerview.widget.f0
    public int[] b(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.e()) {
            iArr[0] = g(view, i(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.f()) {
            iArr[1] = g(view, j(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.f0
    public RecyclerView.v c(RecyclerView.l lVar) {
        if (lVar instanceof RecyclerView.v.b) {
            return new a(this.f2977a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f0
    public View d(RecyclerView.l lVar) {
        if (lVar.f()) {
            return h(lVar, j(lVar));
        }
        if (lVar.e()) {
            return h(lVar, i(lVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f0
    public int e(RecyclerView.l lVar, int i10, int i11) {
        PointF a10;
        int H = lVar.H();
        if (H == 0) {
            return -1;
        }
        View view = null;
        y j10 = lVar.f() ? j(lVar) : lVar.e() ? i(lVar) : null;
        if (j10 == null) {
            return -1;
        }
        int x10 = lVar.x();
        boolean z10 = false;
        View view2 = null;
        int i12 = IntCompanionObject.MIN_VALUE;
        int i13 = IntCompanionObject.MAX_VALUE;
        for (int i14 = 0; i14 < x10; i14++) {
            View w10 = lVar.w(i14);
            if (w10 != null) {
                int g10 = g(w10, j10);
                if (g10 <= 0 && g10 > i12) {
                    view2 = w10;
                    i12 = g10;
                }
                if (g10 >= 0 && g10 < i13) {
                    view = w10;
                    i13 = g10;
                }
            }
        }
        boolean z11 = !lVar.e() ? i11 <= 0 : i10 <= 0;
        if (!z11 || view == null) {
            if (z11 || view2 == null) {
                if (z11) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int P = lVar.P(view);
                int H2 = lVar.H();
                if ((lVar instanceof RecyclerView.v.b) && (a10 = ((RecyclerView.v.b) lVar).a(H2 - 1)) != null && (a10.x < 0.0f || a10.y < 0.0f)) {
                    z10 = true;
                }
                int i15 = P + (z10 == z11 ? -1 : 1);
                if (i15 < 0 || i15 >= H) {
                    return -1;
                }
                return i15;
            }
            return lVar.P(view2);
        }
        return lVar.P(view);
    }

    public final int g(View view, y yVar) {
        return ((yVar.c(view) / 2) + yVar.e(view)) - ((yVar.l() / 2) + yVar.k());
    }

    public final View h(RecyclerView.l lVar, y yVar) {
        int x10 = lVar.x();
        View view = null;
        if (x10 == 0) {
            return null;
        }
        int l10 = (yVar.l() / 2) + yVar.k();
        int i10 = IntCompanionObject.MAX_VALUE;
        for (int i11 = 0; i11 < x10; i11++) {
            View w10 = lVar.w(i11);
            int abs = Math.abs(((yVar.c(w10) / 2) + yVar.e(w10)) - l10);
            if (abs < i10) {
                view = w10;
                i10 = abs;
            }
        }
        return view;
    }

    public final y i(RecyclerView.l lVar) {
        y yVar = this.f3124e;
        if (yVar == null || yVar.f3121a != lVar) {
            this.f3124e = new w(lVar);
        }
        return this.f3124e;
    }

    public final y j(RecyclerView.l lVar) {
        y yVar = this.d;
        if (yVar == null || yVar.f3121a != lVar) {
            this.d = new x(lVar);
        }
        return this.d;
    }
}
