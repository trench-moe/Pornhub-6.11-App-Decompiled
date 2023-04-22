package w6;

import android.net.Uri;
import android.util.Pair;
import java.util.Objects;
import w6.c0;
import x7.a;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public static final x0 f16838a = new a();

    /* loaded from: classes2.dex */
    public class a extends x0 {
        @Override // w6.x0
        public int b(Object obj) {
            return -1;
        }

        @Override // w6.x0
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // w6.x0
        public int i() {
            return 0;
        }

        @Override // w6.x0
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // w6.x0
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // w6.x0
        public int p() {
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Object f16839a;

        /* renamed from: b  reason: collision with root package name */
        public Object f16840b;

        /* renamed from: c  reason: collision with root package name */
        public int f16841c;
        public long d;

        /* renamed from: e  reason: collision with root package name */
        public long f16842e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16843f;

        /* renamed from: g  reason: collision with root package name */
        public x7.a f16844g = x7.a.f18048g;

        static {
            k0.c cVar = k0.c.f11746w;
        }

        public long a(int i10, int i11) {
            a.C0293a a10 = this.f16844g.a(i10);
            if (a10.f18056b != -1) {
                return a10.f18058e[i11];
            }
            return -9223372036854775807L;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0064 A[EDGE_INSN: B:31:0x0064->B:26:0x0064 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int b(long r12) {
            /*
                r11 = this;
                x7.a r0 = r11.f16844g
                long r1 = r11.d
                java.util.Objects.requireNonNull(r0)
                r3 = -9223372036854775808
                r9 = -1
                r5 = r9
                int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
                if (r6 == 0) goto L6b
                r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
                if (r8 == 0) goto L1f
                r10 = 6
                int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                r10 = 3
                if (r6 < 0) goto L1f
                goto L6b
            L1f:
                r10 = 7
                int r1 = r0.f18053e
                r10 = 2
            L23:
                int r2 = r0.f18051b
                r10 = 5
                if (r1 >= r2) goto L64
                r10 = 7
                x7.a$a r9 = r0.a(r1)
                r2 = r9
                long r6 = r2.f18055a
                r10 = 2
                int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                r10 = 1
                if (r2 == 0) goto L41
                x7.a$a r9 = r0.a(r1)
                r2 = r9
                long r6 = r2.f18055a
                int r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                if (r2 <= 0) goto L5f
            L41:
                x7.a$a r2 = r0.a(r1)
                int r6 = r2.f18056b
                r10 = 4
                if (r6 == r5) goto L5b
                r10 = 5
                int r9 = r2.a(r5)
                r6 = r9
                int r2 = r2.f18056b
                r10 = 2
                if (r6 >= r2) goto L57
                r10 = 3
                goto L5b
            L57:
                r10 = 4
                r9 = 0
                r2 = r9
                goto L5c
            L5b:
                r2 = 1
            L5c:
                if (r2 != 0) goto L64
                r10 = 7
            L5f:
                r10 = 2
                int r1 = r1 + 1
                r10 = 4
                goto L23
            L64:
                int r12 = r0.f18051b
                r10 = 7
                if (r1 >= r12) goto L6b
                r10 = 2
                r5 = r1
            L6b:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: w6.x0.b.b(long):int");
        }

        public long c(int i10) {
            return this.f16844g.a(i10).f18055a;
        }

        public int d(int i10) {
            return this.f16844g.a(i10).a(-1);
        }

        public boolean e(int i10) {
            return this.f16844g.a(i10).f18060g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                return k8.c0.a(this.f16839a, bVar.f16839a) && k8.c0.a(this.f16840b, bVar.f16840b) && this.f16841c == bVar.f16841c && this.d == bVar.d && this.f16842e == bVar.f16842e && this.f16843f == bVar.f16843f && k8.c0.a(this.f16844g, bVar.f16844g);
            }
            return false;
        }

        public b f(Object obj, Object obj2, int i10, long j10, long j11, x7.a aVar, boolean z10) {
            this.f16839a = obj;
            this.f16840b = obj2;
            this.f16841c = i10;
            this.d = j10;
            this.f16842e = j11;
            this.f16844g = aVar;
            this.f16843f = z10;
            return this;
        }

        public int hashCode() {
            Object obj = this.f16839a;
            int i10 = 0;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f16840b;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            }
            long j10 = this.d;
            long j11 = this.f16842e;
            return this.f16844g.hashCode() + ((((((((((hashCode + i10) * 31) + this.f16841c) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f16843f ? 1 : 0)) * 31);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: r  reason: collision with root package name */
        public static final Object f16845r = new Object();

        /* renamed from: s  reason: collision with root package name */
        public static final c0 f16846s;
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public Object f16848b;
        public Object d;

        /* renamed from: e  reason: collision with root package name */
        public long f16850e;

        /* renamed from: f  reason: collision with root package name */
        public long f16851f;

        /* renamed from: g  reason: collision with root package name */
        public long f16852g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f16853h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16854i;
        @Deprecated

        /* renamed from: j  reason: collision with root package name */
        public boolean f16855j;

        /* renamed from: k  reason: collision with root package name */
        public c0.f f16856k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16857l;

        /* renamed from: m  reason: collision with root package name */
        public long f16858m;
        public long n;

        /* renamed from: o  reason: collision with root package name */
        public int f16859o;

        /* renamed from: p  reason: collision with root package name */
        public int f16860p;

        /* renamed from: q  reason: collision with root package name */
        public long f16861q;

        /* renamed from: a  reason: collision with root package name */
        public Object f16847a = f16845r;

        /* renamed from: c  reason: collision with root package name */
        public c0 f16849c = f16846s;

        static {
            c0.c cVar = new c0.c();
            cVar.f16458a = "com.google.android.exoplayer2.Timeline";
            cVar.f16459b = Uri.EMPTY;
            f16846s = cVar.a();
        }

        public long a() {
            return g.c(this.f16858m);
        }

        public long b() {
            return g.c(this.n);
        }

        public boolean c() {
            k8.a.f(this.f16855j == (this.f16856k != null));
            return this.f16856k != null;
        }

        public c d(Object obj, c0 c0Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, c0.f fVar, long j13, long j14, int i10, int i11, long j15) {
            c0.g gVar;
            this.f16847a = obj;
            this.f16849c = c0Var != null ? c0Var : f16846s;
            this.f16848b = (c0Var == null || (gVar = c0Var.f16453b) == null) ? null : gVar.f16502h;
            this.d = obj2;
            this.f16850e = j10;
            this.f16851f = j11;
            this.f16852g = j12;
            this.f16853h = z10;
            this.f16854i = z11;
            this.f16855j = fVar != null;
            this.f16856k = fVar;
            this.f16858m = j13;
            this.n = j14;
            this.f16859o = i10;
            this.f16860p = i11;
            this.f16861q = j15;
            this.f16857l = false;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && c.class.equals(obj.getClass())) {
                c cVar = (c) obj;
                return k8.c0.a(this.f16847a, cVar.f16847a) && k8.c0.a(this.f16849c, cVar.f16849c) && k8.c0.a(this.d, cVar.d) && k8.c0.a(this.f16856k, cVar.f16856k) && this.f16850e == cVar.f16850e && this.f16851f == cVar.f16851f && this.f16852g == cVar.f16852g && this.f16853h == cVar.f16853h && this.f16854i == cVar.f16854i && this.f16857l == cVar.f16857l && this.f16858m == cVar.f16858m && this.n == cVar.n && this.f16859o == cVar.f16859o && this.f16860p == cVar.f16860p && this.f16861q == cVar.f16861q;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = (this.f16849c.hashCode() + ((this.f16847a.hashCode() + 217) * 31)) * 31;
            Object obj = this.d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            c0.f fVar = this.f16856k;
            int hashCode3 = fVar != null ? fVar.hashCode() : 0;
            long j10 = this.f16850e;
            long j11 = this.f16851f;
            long j12 = this.f16852g;
            long j13 = this.f16858m;
            long j14 = this.n;
            long j15 = this.f16861q;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f16853h ? 1 : 0)) * 31) + (this.f16854i ? 1 : 0)) * 31) + (this.f16857l ? 1 : 0)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f16859o) * 31) + this.f16860p) * 31) + ((int) (j15 ^ (j15 >>> 32)));
        }
    }

    public int a(boolean z10) {
        return q() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = g(i10, bVar, false).f16841c;
        if (n(i12, cVar).f16860p == i10) {
            int e10 = e(i12, i11, z10);
            if (e10 == -1) {
                return -1;
            }
            return n(e10, cVar).f16859o;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == c(z10) ? a(z10) : i10 + 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            if (x0Var.p() == p() && x0Var.i() == i()) {
                c cVar = new c();
                b bVar = new b();
                c cVar2 = new c();
                b bVar2 = new b();
                for (int i10 = 0; i10 < p(); i10++) {
                    if (!n(i10, cVar).equals(x0Var.n(i10, cVar2))) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < i(); i11++) {
                    if (!g(i11, bVar, true).equals(x0Var.g(i11, bVar2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int p10 = p() + 217;
        for (int i10 = 0; i10 < p(); i10++) {
            p10 = (p10 * 31) + n(i10, cVar).hashCode();
        }
        int i11 = i() + (p10 * 31);
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        return i11;
    }

    public abstract int i();

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        Pair<Object, Long> k10 = k(cVar, bVar, i10, j10, 0L);
        Objects.requireNonNull(k10);
        return k10;
    }

    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        k8.a.e(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.f16858m;
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f16859o;
        f(i11, bVar);
        while (i11 < cVar.f16860p && bVar.f16842e != j10) {
            int i12 = i11 + 1;
            if (f(i12, bVar).f16842e > j10) {
                break;
            }
            i11 = i12;
        }
        g(i11, bVar, true);
        Object obj = bVar.f16840b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(j10 - bVar.f16842e));
    }

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        } else if (i11 != 1) {
            if (i11 == 2) {
                return i10 == a(z10) ? c(z10) : i10 - 1;
            }
            throw new IllegalStateException();
        } else {
            return i10;
        }
    }

    public abstract Object m(int i10);

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public final boolean q() {
        return p() == 0;
    }
}
