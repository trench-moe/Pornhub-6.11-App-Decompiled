package w6;

import android.util.Pair;
import java.util.Objects;
import w6.x0;

/* loaded from: classes2.dex */
public abstract class a extends x0 {

    /* renamed from: b  reason: collision with root package name */
    public final int f16442b;

    /* renamed from: c  reason: collision with root package name */
    public final w7.k f16443c;
    public final boolean d;

    public a(boolean z10, w7.k kVar) {
        this.d = z10;
        this.f16443c = kVar;
        this.f16442b = kVar.b();
    }

    @Override // w6.x0
    public int a(boolean z10) {
        if (this.f16442b == 0) {
            return -1;
        }
        if (this.d) {
            z10 = false;
        }
        int c10 = z10 ? this.f16443c.c() : 0;
        do {
            p0 p0Var = (p0) this;
            if (!p0Var.f16709i[c10].q()) {
                return p0Var.f16709i[c10].a(z10) + p0Var.f16708h[c10];
            }
            c10 = r(c10, z10);
        } while (c10 != -1);
        return -1;
    }

    @Override // w6.x0
    public final int b(Object obj) {
        int b10;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            p0 p0Var = (p0) this;
            Integer num = p0Var.f16711k.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (b10 = p0Var.f16709i[intValue].b(obj3)) != -1) {
                return p0Var.f16707g[intValue] + b10;
            }
            return -1;
        }
        return -1;
    }

    @Override // w6.x0
    public int c(boolean z10) {
        int i10 = this.f16442b;
        if (i10 == 0) {
            return -1;
        }
        if (this.d) {
            z10 = false;
        }
        int g10 = z10 ? this.f16443c.g() : i10 - 1;
        do {
            p0 p0Var = (p0) this;
            if (!p0Var.f16709i[g10].q()) {
                return p0Var.f16709i[g10].c(z10) + p0Var.f16708h[g10];
            }
            g10 = s(g10, z10);
        } while (g10 != -1);
        return -1;
    }

    @Override // w6.x0
    public int e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        p0 p0Var = (p0) this;
        int d = k8.c0.d(p0Var.f16708h, i10 + 1, false, false);
        int i13 = p0Var.f16708h[d];
        x0 x0Var = p0Var.f16709i[d];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int e10 = x0Var.e(i14, i12, z10);
        if (e10 != -1) {
            return i13 + e10;
        }
        int r10 = r(d, z10);
        while (r10 != -1 && p0Var.f16709i[r10].q()) {
            r10 = r(r10, z10);
        }
        if (r10 != -1) {
            return p0Var.f16709i[r10].a(z10) + p0Var.f16708h[r10];
        } else if (i11 == 2) {
            return a(z10);
        } else {
            return -1;
        }
    }

    @Override // w6.x0
    public final x0.b g(int i10, x0.b bVar, boolean z10) {
        p0 p0Var = (p0) this;
        int d = k8.c0.d(p0Var.f16707g, i10 + 1, false, false);
        int i11 = p0Var.f16708h[d];
        p0Var.f16709i[d].g(i10 - p0Var.f16707g[d], bVar, z10);
        bVar.f16841c += i11;
        if (z10) {
            Object obj = p0Var.f16710j[d];
            Object obj2 = bVar.f16840b;
            Objects.requireNonNull(obj2);
            bVar.f16840b = Pair.create(obj, obj2);
        }
        return bVar;
    }

    @Override // w6.x0
    public final x0.b h(Object obj, x0.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        p0 p0Var = (p0) this;
        Integer num = p0Var.f16711k.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i10 = p0Var.f16708h[intValue];
        p0Var.f16709i[intValue].h(obj3, bVar);
        bVar.f16841c += i10;
        bVar.f16840b = obj;
        return bVar;
    }

    @Override // w6.x0
    public int l(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        p0 p0Var = (p0) this;
        int d = k8.c0.d(p0Var.f16708h, i10 + 1, false, false);
        int i13 = p0Var.f16708h[d];
        x0 x0Var = p0Var.f16709i[d];
        int i14 = i10 - i13;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = x0Var.l(i14, i12, z10);
        if (l10 != -1) {
            return i13 + l10;
        }
        int s10 = s(d, z10);
        while (s10 != -1 && p0Var.f16709i[s10].q()) {
            s10 = s(s10, z10);
        }
        if (s10 != -1) {
            return p0Var.f16709i[s10].c(z10) + p0Var.f16708h[s10];
        } else if (i11 == 2) {
            return c(z10);
        } else {
            return -1;
        }
    }

    @Override // w6.x0
    public final Object m(int i10) {
        p0 p0Var = (p0) this;
        int d = k8.c0.d(p0Var.f16707g, i10 + 1, false, false);
        return Pair.create(p0Var.f16710j[d], p0Var.f16709i[d].m(i10 - p0Var.f16707g[d]));
    }

    @Override // w6.x0
    public final x0.c o(int i10, x0.c cVar, long j10) {
        p0 p0Var = (p0) this;
        int d = k8.c0.d(p0Var.f16708h, i10 + 1, false, false);
        int i11 = p0Var.f16708h[d];
        int i12 = p0Var.f16707g[d];
        p0Var.f16709i[d].o(i10 - i11, cVar, j10);
        Object obj = p0Var.f16710j[d];
        if (!x0.c.f16845r.equals(cVar.f16847a)) {
            obj = Pair.create(obj, cVar.f16847a);
        }
        cVar.f16847a = obj;
        cVar.f16859o += i12;
        cVar.f16860p += i12;
        return cVar;
    }

    public final int r(int i10, boolean z10) {
        if (z10) {
            return this.f16443c.e(i10);
        }
        if (i10 < this.f16442b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public final int s(int i10, boolean z10) {
        if (z10) {
            return this.f16443c.d(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }
}
