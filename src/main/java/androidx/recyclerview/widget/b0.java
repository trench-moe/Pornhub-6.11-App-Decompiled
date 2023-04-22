package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public class b0 implements a.InterfaceC0038a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2949a;

    public b0(RecyclerView recyclerView) {
        this.f2949a = recyclerView;
    }

    public void a(a.b bVar) {
        int i10 = bVar.f2944a;
        if (i10 == 1) {
            RecyclerView recyclerView = this.f2949a;
            recyclerView.C.f0(recyclerView, bVar.f2945b, bVar.d);
        } else if (i10 == 2) {
            RecyclerView recyclerView2 = this.f2949a;
            recyclerView2.C.i0(recyclerView2, bVar.f2945b, bVar.d);
        } else if (i10 == 4) {
            RecyclerView recyclerView3 = this.f2949a;
            recyclerView3.C.j0(recyclerView3, bVar.f2945b, bVar.d, bVar.f2946c);
        } else if (i10 != 8) {
        } else {
            RecyclerView recyclerView4 = this.f2949a;
            recyclerView4.C.h0(recyclerView4, bVar.f2945b, bVar.d, 1);
        }
    }

    public RecyclerView.z b(int i10) {
        RecyclerView recyclerView = this.f2949a;
        int h10 = recyclerView.n.h();
        int i11 = 0;
        RecyclerView.z zVar = null;
        while (true) {
            if (i11 >= h10) {
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.n.g(i11));
            if (K != null && !K.n()) {
                if (K.f2887c != i10) {
                    continue;
                } else if (!recyclerView.n.k(K.f2885a)) {
                    zVar = K;
                    break;
                } else {
                    zVar = K;
                }
            }
            i11++;
        }
        if (zVar == null || this.f2949a.n.k(zVar.f2885a)) {
            return null;
        }
        return zVar;
    }

    public void c(int i10, int i11, Object obj) {
        int i12;
        RecyclerView recyclerView = this.f2949a;
        int h10 = recyclerView.n.h();
        int i13 = i11 + i10;
        for (int i14 = 0; i14 < h10; i14++) {
            View g10 = recyclerView.n.g(i14);
            RecyclerView.z K = RecyclerView.K(g10);
            if (K != null) {
                if (!K.v()) {
                    int i15 = K.f2887c;
                    if (i15 >= i10 && i15 < i13) {
                        K.b(2);
                        K.a(obj);
                        ((RecyclerView.LayoutParams) g10.getLayoutParams()).f2809c = true;
                    }
                }
            }
        }
        RecyclerView.r rVar = recyclerView.f2775f;
        int size = rVar.f2846c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f2949a.B0 = true;
                return;
            }
            RecyclerView.z zVar = rVar.f2846c.get(size);
            if (zVar != null && (i12 = zVar.f2887c) >= i10 && i12 < i13) {
                zVar.b(2);
                rVar.f(size);
            }
        }
    }

    public void d(int i10, int i11) {
        RecyclerView recyclerView = this.f2949a;
        int h10 = recyclerView.n.h();
        for (int i12 = 0; i12 < h10; i12++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.n.g(i12));
            if (K != null && !K.v() && K.f2887c >= i10) {
                K.r(i11, false);
                recyclerView.f2798x0.f2870f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f2775f;
        int size = rVar.f2846c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.z zVar = rVar.f2846c.get(i13);
            if (zVar != null && zVar.f2887c >= i10) {
                zVar.r(i11, false);
            }
        }
        recyclerView.requestLayout();
        this.f2949a.A0 = true;
    }

    public void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f2949a;
        int h10 = recyclerView.n.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.n.g(i20));
            if (K != null && (i18 = K.f2887c) >= i13) {
                if (i18 <= i12) {
                    if (i18 == i10) {
                        K.r(i11 - i10, false);
                    } else {
                        K.r(i14, false);
                    }
                    recyclerView.f2798x0.f2870f = true;
                }
            }
        }
        RecyclerView.r rVar = recyclerView.f2775f;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = rVar.f2846c.size();
        for (int i21 = 0; i21 < size; i21++) {
            RecyclerView.z zVar = rVar.f2846c.get(i21);
            if (zVar != null && (i17 = zVar.f2887c) >= i16) {
                if (i17 <= i15) {
                    if (i17 == i10) {
                        zVar.r(i11 - i10, false);
                    } else {
                        zVar.r(i19, false);
                    }
                }
            }
        }
        recyclerView.requestLayout();
        this.f2949a.A0 = true;
    }
}
