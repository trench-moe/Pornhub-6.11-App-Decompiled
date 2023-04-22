package w6;

import android.util.Pair;
import com.google.android.exoplayer2.source.i;
import java.util.Objects;
import w6.k0;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final com.google.android.exoplayer2.source.h f16559a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16560b;

    /* renamed from: c  reason: collision with root package name */
    public final w7.j[] f16561c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16562e;

    /* renamed from: f  reason: collision with root package name */
    public f0 f16563f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16564g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f16565h;

    /* renamed from: i  reason: collision with root package name */
    public final r0[] f16566i;

    /* renamed from: j  reason: collision with root package name */
    public final i8.l f16567j;

    /* renamed from: k  reason: collision with root package name */
    public final k0 f16568k;

    /* renamed from: l  reason: collision with root package name */
    public e0 f16569l;

    /* renamed from: m  reason: collision with root package name */
    public w7.o f16570m;
    public i8.m n;

    /* renamed from: o  reason: collision with root package name */
    public long f16571o;

    public e0(r0[] r0VarArr, long j10, i8.l lVar, j8.i iVar, k0 k0Var, f0 f0Var, i8.m mVar) {
        this.f16566i = r0VarArr;
        this.f16571o = j10;
        this.f16567j = lVar;
        this.f16568k = k0Var;
        i.a aVar = f0Var.f16580a;
        this.f16560b = aVar.f16912a;
        this.f16563f = f0Var;
        this.f16570m = w7.o.f16943m;
        this.n = mVar;
        this.f16561c = new w7.j[r0VarArr.length];
        this.f16565h = new boolean[r0VarArr.length];
        long j11 = f0Var.f16581b;
        long j12 = f0Var.d;
        Objects.requireNonNull(k0Var);
        Pair pair = (Pair) aVar.f16912a;
        Object obj = pair.first;
        i.a b10 = aVar.b(pair.second);
        k0.c cVar = k0Var.f16634c.get(obj);
        Objects.requireNonNull(cVar);
        k0Var.f16638h.add(cVar);
        k0.b bVar = k0Var.f16637g.get(cVar);
        if (bVar != null) {
            bVar.f16646a.n(bVar.f16647b);
        }
        cVar.f16651c.add(b10);
        com.google.android.exoplayer2.source.h a10 = cVar.f16649a.a(b10, iVar, j11);
        k0Var.f16633b.put(a10, cVar);
        k0Var.d();
        this.f16559a = j12 != -9223372036854775807L ? new com.google.android.exoplayer2.source.b(a10, true, 0L, j12) : a10;
    }

    public long a(i8.m mVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= mVar.f10669a) {
                break;
            }
            boolean[] zArr2 = this.f16565h;
            if (z10 || !mVar.a(this.n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        w7.j[] jVarArr = this.f16561c;
        int i11 = 0;
        while (true) {
            r0[] r0VarArr = this.f16566i;
            if (i11 >= r0VarArr.length) {
                break;
            }
            if (((f) r0VarArr[i11]).f16572c == 7) {
                jVarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.n = mVar;
        c();
        long p10 = this.f16559a.p(mVar.f10671c, this.f16565h, this.f16561c, zArr, j10);
        w7.j[] jVarArr2 = this.f16561c;
        int i12 = 0;
        while (true) {
            r0[] r0VarArr2 = this.f16566i;
            if (i12 >= r0VarArr2.length) {
                break;
            }
            if (((f) r0VarArr2[i12]).f16572c == 7 && this.n.b(i12)) {
                jVarArr2[i12] = new t3.a();
            }
            i12++;
        }
        this.f16562e = false;
        int i13 = 0;
        while (true) {
            w7.j[] jVarArr3 = this.f16561c;
            if (i13 >= jVarArr3.length) {
                return p10;
            }
            if (jVarArr3[i13] != null) {
                k8.a.f(mVar.b(i13));
                if (((f) this.f16566i[i13]).f16572c != 7) {
                    this.f16562e = true;
                }
            } else {
                k8.a.f(mVar.f10671c[i13] == null);
            }
            i13++;
        }
    }

    public final void b() {
        if (!g()) {
            return;
        }
        int i10 = 0;
        while (true) {
            i8.m mVar = this.n;
            if (i10 >= mVar.f10669a) {
                return;
            }
            boolean b10 = mVar.b(i10);
            i8.f fVar = this.n.f10671c[i10];
            if (b10 && fVar != null) {
                fVar.h();
            }
            i10++;
        }
    }

    public final void c() {
        if (!g()) {
            return;
        }
        int i10 = 0;
        while (true) {
            i8.m mVar = this.n;
            if (i10 >= mVar.f10669a) {
                return;
            }
            boolean b10 = mVar.b(i10);
            i8.f fVar = this.n.f10671c[i10];
            if (b10 && fVar != null) {
                fVar.k();
            }
            i10++;
        }
    }

    public long d() {
        if (this.d) {
            long d = this.f16562e ? this.f16559a.d() : Long.MIN_VALUE;
            if (d == Long.MIN_VALUE) {
                d = this.f16563f.f16583e;
            }
            return d;
        }
        return this.f16563f.f16581b;
    }

    public long e() {
        return this.f16563f.f16581b + this.f16571o;
    }

    public boolean f() {
        if (!this.d || (this.f16562e && this.f16559a.d() != Long.MIN_VALUE)) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        return this.f16569l == null;
    }

    public void h() {
        b();
        k0 k0Var = this.f16568k;
        com.google.android.exoplayer2.source.h hVar = this.f16559a;
        try {
            if (hVar instanceof com.google.android.exoplayer2.source.b) {
                k0Var.h(((com.google.android.exoplayer2.source.b) hVar).f6287c);
            } else {
                k0Var.h(hVar);
            }
        } catch (RuntimeException e10) {
            k8.a.i("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public i8.m i(float f10, x0 x0Var) {
        i8.f[] fVarArr;
        i8.m b10 = this.f16567j.b(this.f16566i, this.f16570m, this.f16563f.f16580a, x0Var);
        for (i8.f fVar : b10.f10671c) {
            if (fVar != null) {
                fVar.m(f10);
            }
        }
        return b10;
    }

    public void j() {
        com.google.android.exoplayer2.source.h hVar = this.f16559a;
        if (hVar instanceof com.google.android.exoplayer2.source.b) {
            long j10 = this.f16563f.d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            com.google.android.exoplayer2.source.b bVar = (com.google.android.exoplayer2.source.b) hVar;
            bVar.n = 0L;
            bVar.f6291t = j10;
        }
    }
}
