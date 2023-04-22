package w6;

import android.os.Handler;
import android.util.Pair;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import w6.x0;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final x0.b f16596a = new x0.b();

    /* renamed from: b  reason: collision with root package name */
    public final x0.c f16597b = new x0.c();

    /* renamed from: c  reason: collision with root package name */
    public final x6.b0 f16598c;
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public long f16599e;

    /* renamed from: f  reason: collision with root package name */
    public int f16600f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16601g;

    /* renamed from: h  reason: collision with root package name */
    public e0 f16602h;

    /* renamed from: i  reason: collision with root package name */
    public e0 f16603i;

    /* renamed from: j  reason: collision with root package name */
    public e0 f16604j;

    /* renamed from: k  reason: collision with root package name */
    public int f16605k;

    /* renamed from: l  reason: collision with root package name */
    public Object f16606l;

    /* renamed from: m  reason: collision with root package name */
    public long f16607m;

    public h0(x6.b0 b0Var, Handler handler) {
        this.f16598c = b0Var;
        this.d = handler;
    }

    public static i.a p(x0 x0Var, Object obj, long j10, long j11, x0.b bVar) {
        x0Var.h(obj, bVar);
        x7.a aVar = bVar.f16844g;
        long j12 = bVar.d;
        int i10 = aVar.f18051b - 1;
        while (i10 >= 0) {
            boolean z10 = false;
            if (j10 != Long.MIN_VALUE) {
                long j13 = aVar.a(i10).f18055a;
                if (j13 != Long.MIN_VALUE ? j10 < j13 : !(j12 != -9223372036854775807L && j10 >= j12)) {
                    z10 = true;
                }
            }
            if (!z10) {
                break;
            }
            i10--;
        }
        i10 = (i10 < 0 || !aVar.a(i10).b()) ? -1 : -1;
        if (i10 == -1) {
            return new i.a(obj, j11, bVar.b(j10));
        }
        return new i.a(obj, i10, bVar.d(i10), j11);
    }

    public e0 a() {
        e0 e0Var = this.f16602h;
        if (e0Var == null) {
            return null;
        }
        if (e0Var == this.f16603i) {
            this.f16603i = e0Var.f16569l;
        }
        e0Var.h();
        int i10 = this.f16605k - 1;
        this.f16605k = i10;
        if (i10 == 0) {
            this.f16604j = null;
            e0 e0Var2 = this.f16602h;
            this.f16606l = e0Var2.f16560b;
            this.f16607m = e0Var2.f16563f.f16580a.d;
        }
        this.f16602h = this.f16602h.f16569l;
        l();
        return this.f16602h;
    }

    public void b() {
        if (this.f16605k == 0) {
            return;
        }
        e0 e0Var = this.f16602h;
        k8.a.g(e0Var);
        this.f16606l = e0Var.f16560b;
        this.f16607m = e0Var.f16563f.f16580a.d;
        while (e0Var != null) {
            e0Var.h();
            e0Var = e0Var.f16569l;
        }
        this.f16602h = null;
        this.f16604j = null;
        this.f16603i = null;
        this.f16605k = 0;
        l();
    }

    public final f0 c(x0 x0Var, e0 e0Var, long j10) {
        long j11;
        f0 f0Var = e0Var.f16563f;
        long j12 = (e0Var.f16571o + f0Var.f16583e) - j10;
        long j13 = 0;
        if (f0Var.f16585g) {
            int d = x0Var.d(x0Var.b(f0Var.f16580a.f16912a), this.f16596a, this.f16597b, this.f16600f, this.f16601g);
            if (d == -1) {
                return null;
            }
            int i10 = x0Var.g(d, this.f16596a, true).f16841c;
            Object obj = this.f16596a.f16840b;
            long j14 = f0Var.f16580a.d;
            if (x0Var.n(i10, this.f16597b).f16859o == d) {
                Pair<Object, Long> k10 = x0Var.k(this.f16597b, this.f16596a, i10, -9223372036854775807L, Math.max(0L, j12));
                if (k10 == null) {
                    return null;
                }
                obj = k10.first;
                long longValue = ((Long) k10.second).longValue();
                e0 e0Var2 = e0Var.f16569l;
                if (e0Var2 == null || !e0Var2.f16560b.equals(obj)) {
                    j14 = this.f16599e;
                    this.f16599e = 1 + j14;
                } else {
                    j14 = e0Var2.f16563f.f16580a.d;
                }
                j11 = longValue;
                j13 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            return d(x0Var, p(x0Var, obj, j11, j14, this.f16596a), j13, j11);
        }
        i.a aVar = f0Var.f16580a;
        x0Var.h(aVar.f16912a, this.f16596a);
        if (!aVar.a()) {
            int d10 = this.f16596a.d(aVar.f16915e);
            if (d10 == this.f16596a.f16844g.a(aVar.f16915e).f18056b) {
                return f(x0Var, aVar.f16912a, g(x0Var, aVar.f16912a, aVar.f16915e), f0Var.f16583e, aVar.d);
            }
            return e(x0Var, aVar.f16912a, aVar.f16915e, d10, f0Var.f16583e, aVar.d);
        }
        int i11 = aVar.f16913b;
        int i12 = this.f16596a.f16844g.a(i11).f18056b;
        if (i12 == -1) {
            return null;
        }
        int a10 = this.f16596a.f16844g.a(i11).a(aVar.f16914c);
        if (a10 < i12) {
            return e(x0Var, aVar.f16912a, i11, a10, f0Var.f16582c, aVar.d);
        }
        long j15 = f0Var.f16582c;
        if (j15 == -9223372036854775807L) {
            x0.c cVar = this.f16597b;
            x0.b bVar = this.f16596a;
            Pair<Object, Long> k11 = x0Var.k(cVar, bVar, bVar.f16841c, -9223372036854775807L, Math.max(0L, j12));
            if (k11 == null) {
                return null;
            }
            j15 = ((Long) k11.second).longValue();
        }
        return f(x0Var, aVar.f16912a, Math.max(g(x0Var, aVar.f16912a, aVar.f16913b), j15), f0Var.f16582c, aVar.d);
    }

    public final f0 d(x0 x0Var, i.a aVar, long j10, long j11) {
        x0Var.h(aVar.f16912a, this.f16596a);
        return aVar.a() ? e(x0Var, aVar.f16912a, aVar.f16913b, aVar.f16914c, j10, aVar.d) : f(x0Var, aVar.f16912a, j11, j10, aVar.d);
    }

    public final f0 e(x0 x0Var, Object obj, int i10, int i11, long j10, long j11) {
        i.a aVar = new i.a(obj, i10, i11, j11);
        long a10 = x0Var.h(obj, this.f16596a).a(i10, i11);
        long j12 = i11 == this.f16596a.f16844g.a(i10).a(-1) ? this.f16596a.f16844g.f18052c : 0L;
        return new f0(aVar, (a10 == -9223372036854775807L || j12 < a10) ? j12 : Math.max(0L, a10 - 1), j10, -9223372036854775807L, a10, this.f16596a.f16844g.a(i10).f18060g, false, false, false);
    }

    public final f0 f(x0 x0Var, Object obj, long j10, long j11, long j12) {
        long j13 = j10;
        x0Var.h(obj, this.f16596a);
        int b10 = this.f16596a.b(j13);
        i.a aVar = new i.a(obj, j12, b10);
        boolean i10 = i(aVar);
        boolean k10 = k(x0Var, aVar);
        boolean j14 = j(x0Var, aVar, i10);
        boolean z10 = b10 != -1 && this.f16596a.e(b10);
        long c10 = b10 != -1 ? this.f16596a.c(b10) : -9223372036854775807L;
        long j15 = (c10 == -9223372036854775807L || c10 == Long.MIN_VALUE) ? this.f16596a.d : c10;
        if (j15 != -9223372036854775807L && j13 >= j15) {
            j13 = Math.max(0L, j15 - 1);
        }
        return new f0(aVar, j13, j11, c10, j15, z10, i10, k10, j14);
    }

    public final long g(x0 x0Var, Object obj, int i10) {
        x0Var.h(obj, this.f16596a);
        long j10 = this.f16596a.f16844g.a(i10).f18055a;
        return j10 == Long.MIN_VALUE ? this.f16596a.d : j10 + this.f16596a.f16844g.a(i10).f18059f;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w6.f0 h(w6.x0 r19, w6.f0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.exoplayer2.source.i$a r3 = r2.f16580a
            boolean r12 = r0.i(r3)
            boolean r13 = r0.k(r1, r3)
            boolean r14 = r0.j(r1, r3, r12)
            com.google.android.exoplayer2.source.i$a r4 = r2.f16580a
            java.lang.Object r4 = r4.f16912a
            w6.x0$b r5 = r0.f16596a
            r1.h(r4, r5)
            boolean r1 = r3.a()
            r4 = 3
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L36
            int r1 = r3.f16915e
            if (r1 != r4) goto L2f
            goto L36
        L2f:
            w6.x0$b r7 = r0.f16596a
            long r7 = r7.c(r1)
            goto L37
        L36:
            r7 = r5
        L37:
            boolean r1 = r3.a()
            if (r1 == 0) goto L49
            w6.x0$b r1 = r0.f16596a
            int r5 = r3.f16913b
            int r6 = r3.f16914c
            long r5 = r1.a(r5, r6)
        L47:
            r9 = r5
            goto L5b
        L49:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L56
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L54
            goto L56
        L54:
            r9 = r7
            goto L5b
        L56:
            w6.x0$b r1 = r0.f16596a
            long r5 = r1.d
            goto L47
        L5b:
            boolean r1 = r3.a()
            if (r1 == 0) goto L6b
            w6.x0$b r1 = r0.f16596a
            int r4 = r3.f16913b
            boolean r1 = r1.e(r4)
            r11 = r1
            goto L7e
        L6b:
            int r1 = r3.f16915e
            if (r1 == r4) goto L7a
            w6.x0$b r4 = r0.f16596a
            boolean r1 = r4.e(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            r11 = 1
            goto L7e
        L7a:
            r1 = 1
            r1 = 0
            r11 = 2
            r11 = 0
        L7e:
            w6.f0 r15 = new w6.f0
            long r4 = r2.f16581b
            long r1 = r2.f16582c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.h0.h(w6.x0, w6.f0):w6.f0");
    }

    public final boolean i(i.a aVar) {
        return !aVar.a() && aVar.f16915e == -1;
    }

    public final boolean j(x0 x0Var, i.a aVar, boolean z10) {
        int b10 = x0Var.b(aVar.f16912a);
        boolean z11 = false;
        if (!x0Var.n(x0Var.f(b10, this.f16596a).f16841c, this.f16597b).f16854i) {
            if ((x0Var.d(b10, this.f16596a, this.f16597b, this.f16600f, this.f16601g) == -1) && z10) {
                z11 = true;
            }
        }
        return z11;
    }

    public final boolean k(x0 x0Var, i.a aVar) {
        if (i(aVar)) {
            return x0Var.n(x0Var.h(aVar.f16912a, this.f16596a).f16841c, this.f16597b).f16860p == x0Var.b(aVar.f16912a);
        }
        return false;
    }

    public final void l() {
        if (this.f16598c != null) {
            kb.a aVar = ImmutableList.f7944f;
            ImmutableList.a aVar2 = new ImmutableList.a();
            for (e0 e0Var = this.f16602h; e0Var != null; e0Var = e0Var.f16569l) {
                aVar2.b(e0Var.f16563f.f16580a);
            }
            e0 e0Var2 = this.f16603i;
            this.d.post(new g0(this, aVar2, e0Var2 == null ? null : e0Var2.f16563f.f16580a, 0));
        }
    }

    public void m(long j10) {
        e0 e0Var = this.f16604j;
        if (e0Var != null) {
            k8.a.f(e0Var.g());
            if (e0Var.d) {
                e0Var.f16559a.e(j10 - e0Var.f16571o);
            }
        }
    }

    public boolean n(e0 e0Var) {
        boolean z10 = false;
        k8.a.f(e0Var != null);
        if (e0Var.equals(this.f16604j)) {
            return false;
        }
        this.f16604j = e0Var;
        while (true) {
            e0Var = e0Var.f16569l;
            if (e0Var == null) {
                break;
            }
            if (e0Var == this.f16603i) {
                this.f16603i = this.f16602h;
                z10 = true;
            }
            e0Var.h();
            this.f16605k--;
        }
        e0 e0Var2 = this.f16604j;
        if (e0Var2.f16569l != null) {
            e0Var2.b();
            e0Var2.f16569l = null;
            e0Var2.c();
        }
        l();
        return z10;
    }

    public i.a o(x0 x0Var, Object obj, long j10) {
        long j11;
        int b10;
        int i10 = x0Var.h(obj, this.f16596a).f16841c;
        Object obj2 = this.f16606l;
        if (obj2 == null || (b10 = x0Var.b(obj2)) == -1 || x0Var.f(b10, this.f16596a).f16841c != i10) {
            e0 e0Var = this.f16602h;
            while (true) {
                if (e0Var == null) {
                    e0 e0Var2 = this.f16602h;
                    while (true) {
                        if (e0Var2 != null) {
                            int b11 = x0Var.b(e0Var2.f16560b);
                            if (b11 != -1 && x0Var.f(b11, this.f16596a).f16841c == i10) {
                                j11 = e0Var2.f16563f.f16580a.d;
                                break;
                            }
                            e0Var2 = e0Var2.f16569l;
                        } else {
                            j11 = this.f16599e;
                            this.f16599e = 1 + j11;
                            if (this.f16602h == null) {
                                this.f16606l = obj;
                                this.f16607m = j11;
                            }
                        }
                    }
                } else if (e0Var.f16560b.equals(obj)) {
                    j11 = e0Var.f16563f.f16580a.d;
                    break;
                } else {
                    e0Var = e0Var.f16569l;
                }
            }
        } else {
            j11 = this.f16607m;
        }
        return p(x0Var, obj, j10, j11, this.f16596a);
    }

    public final boolean q(x0 x0Var) {
        e0 e0Var;
        e0 e0Var2 = this.f16602h;
        if (e0Var2 == null) {
            return true;
        }
        int b10 = x0Var.b(e0Var2.f16560b);
        while (true) {
            b10 = x0Var.d(b10, this.f16596a, this.f16597b, this.f16600f, this.f16601g);
            while (true) {
                e0Var = e0Var2.f16569l;
                if (e0Var == null || e0Var2.f16563f.f16585g) {
                    break;
                }
                e0Var2 = e0Var;
            }
            if (b10 == -1 || e0Var == null || x0Var.b(e0Var.f16560b) != b10) {
                break;
            }
            e0Var2 = e0Var;
        }
        boolean n = n(e0Var2);
        e0Var2.f16563f = h(x0Var, e0Var2.f16563f);
        return !n;
    }

    public boolean r(x0 x0Var, long j10, long j11) {
        boolean n;
        f0 f0Var;
        e0 e0Var = this.f16602h;
        e0 e0Var2 = null;
        while (e0Var != null) {
            f0 f0Var2 = e0Var.f16563f;
            if (e0Var2 != null) {
                f0 c10 = c(x0Var, e0Var2, j10);
                if (c10 == null) {
                    n = n(e0Var2);
                } else {
                    if (f0Var2.f16581b == c10.f16581b && f0Var2.f16580a.equals(c10.f16580a)) {
                        f0Var = c10;
                    } else {
                        n = n(e0Var2);
                    }
                }
                return !n;
            }
            f0Var = h(x0Var, f0Var2);
            e0Var.f16563f = f0Var.a(f0Var2.f16582c);
            long j12 = f0Var2.f16583e;
            if (!(j12 == -9223372036854775807L || j12 == f0Var.f16583e)) {
                e0Var.j();
                long j13 = f0Var.f16583e;
                return (n(e0Var) || (e0Var == this.f16603i && !e0Var.f16563f.f16584f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j13 + e0Var.f16571o) ? 1 : (j11 == ((j13 > (-9223372036854775807L) ? 1 : (j13 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : j13 + e0Var.f16571o) ? 0 : -1)) >= 0))) ? false : true;
            }
            e0Var2 = e0Var;
            e0Var = e0Var.f16569l;
        }
        return true;
    }
}
