package w6;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import k8.m;
import k8.y;
import w6.k0;
import w6.n;
import w6.n0;
import w6.o0;
import w6.w;
import w6.x0;
import w7.k;

/* loaded from: classes2.dex */
public final class u extends e implements n {
    public w7.k A;
    public n0.b B;
    public d0 C;
    public l0 D;
    public int E;
    public long F;

    /* renamed from: b  reason: collision with root package name */
    public final i8.m f16722b;

    /* renamed from: c  reason: collision with root package name */
    public final n0.b f16723c;
    public final q0[] d;

    /* renamed from: e  reason: collision with root package name */
    public final i8.l f16724e;

    /* renamed from: f  reason: collision with root package name */
    public final k8.i f16725f;

    /* renamed from: g  reason: collision with root package name */
    public final w.e f16726g;

    /* renamed from: h  reason: collision with root package name */
    public final w f16727h;

    /* renamed from: i  reason: collision with root package name */
    public final k8.m<n0.c> f16728i;

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArraySet<n.a> f16729j;

    /* renamed from: k  reason: collision with root package name */
    public final x0.b f16730k;

    /* renamed from: l  reason: collision with root package name */
    public final List<a> f16731l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f16732m;
    public final w7.i n;

    /* renamed from: o  reason: collision with root package name */
    public final x6.b0 f16733o;

    /* renamed from: p  reason: collision with root package name */
    public final Looper f16734p;

    /* renamed from: q  reason: collision with root package name */
    public final j8.b f16735q;

    /* renamed from: r  reason: collision with root package name */
    public final long f16736r;

    /* renamed from: s  reason: collision with root package name */
    public final long f16737s;

    /* renamed from: t  reason: collision with root package name */
    public final k8.b f16738t;

    /* renamed from: u  reason: collision with root package name */
    public int f16739u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16740v;

    /* renamed from: w  reason: collision with root package name */
    public int f16741w;

    /* renamed from: x  reason: collision with root package name */
    public int f16742x;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public int f16743z;

    /* loaded from: classes2.dex */
    public static final class a implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public final Object f16744a;

        /* renamed from: b  reason: collision with root package name */
        public x0 f16745b;

        public a(Object obj, x0 x0Var) {
            this.f16744a = obj;
            this.f16745b = x0Var;
        }

        @Override // w6.i0
        public Object a() {
            return this.f16744a;
        }

        @Override // w6.i0
        public x0 b() {
            return this.f16745b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public u(q0[] q0VarArr, i8.l lVar, w7.i iVar, b0 b0Var, j8.b bVar, x6.b0 b0Var2, boolean z10, u0 u0Var, long j10, long j11, a0 a0Var, long j12, boolean z11, k8.b bVar2, Looper looper, n0 n0Var, n0.b bVar3) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = k8.c0.f11942e;
        StringBuilder n = a0.a.n(a0.a.e(str, a0.a.e(hexString, 30)), "Init ", hexString, " [", "ExoPlayerLib/2.15.0");
        n.append("] [");
        n.append(str);
        n.append("]");
        Log.i("ExoPlayerImpl", n.toString());
        boolean z12 = false;
        k8.a.f(q0VarArr.length > 0);
        this.d = q0VarArr;
        Objects.requireNonNull(lVar);
        this.f16724e = lVar;
        this.n = iVar;
        this.f16735q = bVar;
        this.f16733o = b0Var2;
        this.f16732m = z10;
        this.f16736r = j10;
        this.f16737s = j11;
        this.f16734p = looper;
        this.f16738t = bVar2;
        this.f16739u = 0;
        this.f16728i = new k8.m<>(new CopyOnWriteArraySet(), looper, bVar2, new f4.i(n0Var, 5));
        this.f16729j = new CopyOnWriteArraySet<>();
        this.f16731l = new ArrayList();
        this.A = new k.a(0, new Random());
        this.f16722b = new i8.m(new s0[q0VarArr.length], new i8.f[q0VarArr.length], null);
        this.f16730k = new x0.b();
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 12, 13, 14, 15, 16, 17, 18, 19};
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = iArr[i10];
            k8.a.f(!false);
            sparseBooleanArray.append(i11, true);
        }
        k8.h hVar = bVar3.f16681a;
        for (int i12 = 0; i12 < hVar.b(); i12++) {
            k8.a.e(i12, 0, hVar.b());
            int keyAt = hVar.f11956a.keyAt(i12);
            k8.a.f(true);
            sparseBooleanArray.append(keyAt, true);
        }
        k8.a.f(true);
        k8.h hVar2 = new k8.h(sparseBooleanArray, null);
        this.f16723c = new n0.b(hVar2, null);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        for (int i13 = 0; i13 < hVar2.b(); i13++) {
            k8.a.e(i13, 0, hVar2.b());
            int keyAt2 = hVar2.f11956a.keyAt(i13);
            k8.a.f(true);
            sparseBooleanArray2.append(keyAt2, true);
        }
        k8.a.f(true);
        sparseBooleanArray2.append(3, true);
        k8.a.f(true);
        sparseBooleanArray2.append(9, true);
        k8.a.f(true);
        this.B = new n0.b(new k8.h(sparseBooleanArray2, null), null);
        this.C = d0.D;
        this.E = -1;
        this.f16725f = bVar2.b(looper, null);
        s4.f fVar = new s4.f(this, 8);
        this.f16726g = fVar;
        this.D = l0.i(this.f16722b);
        if (b0Var2 != null) {
            k8.a.f((b0Var2.f17960u == null || b0Var2.f17958m.f17963b.isEmpty()) ? true : true);
            b0Var2.f17960u = n0Var;
            b0Var2.f17961w = b0Var2.f17955c.b(looper, null);
            k8.m<x6.c0> mVar = b0Var2.f17959t;
            b0Var2.f17959t = new k8.m<>(mVar.d, looper, mVar.f11967a, new s6.r(b0Var2, n0Var, 1));
            o(b0Var2);
            bVar.d(new Handler(looper), b0Var2);
        }
        this.f16727h = new w(q0VarArr, lVar, this.f16722b, b0Var, bVar, this.f16739u, this.f16740v, b0Var2, u0Var, a0Var, j12, z11, looper, bVar2, fVar);
    }

    public static long j0(l0 l0Var) {
        x0.c cVar = new x0.c();
        x0.b bVar = new x0.b();
        l0Var.f16659a.h(l0Var.f16660b.f16912a, bVar);
        long j10 = l0Var.f16661c;
        return j10 == -9223372036854775807L ? l0Var.f16659a.n(bVar.f16841c, cVar).f16858m : bVar.f16842e + j10;
    }

    public static boolean k0(l0 l0Var) {
        return l0Var.f16662e == 3 && l0Var.f16669l && l0Var.f16670m == 0;
    }

    @Override // w6.n0
    public PlaybackException B() {
        return this.D.f16663f;
    }

    @Override // w6.n0
    public void C(boolean z10) {
        p0(z10, 0, 1);
    }

    @Override // w6.n0
    public long D() {
        return this.f16737s;
    }

    @Override // w6.n0
    public long E() {
        if (a()) {
            l0 l0Var = this.D;
            l0Var.f16659a.h(l0Var.f16660b.f16912a, this.f16730k);
            l0 l0Var2 = this.D;
            return l0Var2.f16661c == -9223372036854775807L ? l0Var2.f16659a.n(z(), this.f16558a).a() : g.c(this.f16730k.f16842e) + g.c(this.D.f16661c);
        }
        return getCurrentPosition();
    }

    @Override // w6.n0
    public List F() {
        return ImmutableList.w();
    }

    @Override // w6.n0
    public int G() {
        if (a()) {
            return this.D.f16660b.f16913b;
        }
        return -1;
    }

    @Override // w6.n0
    public void I(SurfaceView surfaceView) {
    }

    @Override // w6.n0
    public void J(n0.e eVar) {
        n0(eVar);
    }

    @Override // w6.n0
    public int K() {
        return this.D.f16670m;
    }

    @Override // w6.n0
    public w7.o L() {
        return this.D.f16665h;
    }

    @Override // w6.n0
    public x0 M() {
        return this.D.f16659a;
    }

    @Override // w6.n0
    public Looper N() {
        return this.f16734p;
    }

    @Override // w6.n0
    public boolean O() {
        return this.f16740v;
    }

    @Override // w6.n0
    public long P() {
        if (this.D.f16659a.q()) {
            return this.F;
        }
        l0 l0Var = this.D;
        if (l0Var.f16668k.d != l0Var.f16660b.d) {
            return l0Var.f16659a.n(z(), this.f16558a).b();
        }
        long j10 = l0Var.f16673q;
        if (this.D.f16668k.a()) {
            l0 l0Var2 = this.D;
            x0.b h10 = l0Var2.f16659a.h(l0Var2.f16668k.f16912a, this.f16730k);
            long c10 = h10.c(this.D.f16668k.f16913b);
            if (c10 == Long.MIN_VALUE) {
                j10 = h10.d;
                l0 l0Var3 = this.D;
                return g.c(m0(l0Var3.f16659a, l0Var3.f16668k, j10));
            }
            j10 = c10;
        }
        l0 l0Var32 = this.D;
        return g.c(m0(l0Var32.f16659a, l0Var32.f16668k, j10));
    }

    @Override // w6.n0
    public void S(TextureView textureView) {
    }

    @Override // w6.n0
    public i8.j T() {
        return new i8.j(this.D.f16666i.f10671c);
    }

    @Override // w6.n0
    public d0 V() {
        return this.C;
    }

    @Override // w6.n0
    public long W() {
        return this.f16736r;
    }

    @Override // w6.n0
    public boolean a() {
        return this.D.f16660b.a();
    }

    @Override // w6.n0
    public void b(m0 m0Var) {
        if (m0Var == null) {
            m0Var = m0.d;
        }
        if (this.D.n.equals(m0Var)) {
            return;
        }
        l0 f10 = this.D.f(m0Var);
        this.f16741w++;
        ((y.b) this.f16727h.f16803u.j(4, m0Var)).b();
        s0(f10, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // w6.n0
    public long c() {
        return g.c(this.D.f16674r);
    }

    @Override // w6.n0
    public void d(int i10, long j10) {
        x0 x0Var = this.D.f16659a;
        if (i10 < 0 || (!x0Var.q() && i10 >= x0Var.p())) {
            throw new IllegalSeekPositionException(x0Var, i10, j10);
        }
        this.f16741w++;
        if (a()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            w.d dVar = new w.d(this.D);
            dVar.a(1);
            u uVar = (u) ((s4.f) this.f16726g).f14830f;
            uVar.f16725f.b(new g4.s(uVar, dVar, 2));
            return;
        }
        int i11 = this.D.f16662e != 1 ? 2 : 1;
        int z10 = z();
        l0 l02 = l0(this.D.g(i11), x0Var, i0(x0Var, i10, j10));
        ((y.b) this.f16727h.f16803u.j(3, new w.g(x0Var, i10, g.b(j10)))).b();
        s0(l02, 0, 1, true, true, 1, g0(l02), z10);
    }

    @Override // w6.n0
    public m0 e() {
        return this.D.n;
    }

    @Override // w6.n0
    public void f() {
        l0 l0Var = this.D;
        if (l0Var.f16662e != 1) {
            return;
        }
        l0 e10 = l0Var.e(null);
        l0 g10 = e10.g(e10.f16659a.q() ? 4 : 2);
        this.f16741w++;
        ((y.b) this.f16727h.f16803u.c(0)).b();
        s0(g10, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public o0 f0(o0.b bVar) {
        return new o0(this.f16727h, bVar, this.D.f16659a, z(), this.f16738t, this.f16727h.y);
    }

    @Override // w6.n0
    public int g() {
        return this.D.f16662e;
    }

    public final long g0(l0 l0Var) {
        return l0Var.f16659a.q() ? g.b(this.F) : l0Var.f16660b.a() ? l0Var.f16675s : m0(l0Var.f16659a, l0Var.f16660b, l0Var.f16675s);
    }

    @Override // w6.n0
    public long getCurrentPosition() {
        return g.c(g0(this.D));
    }

    @Override // w6.n0
    public long getDuration() {
        if (a()) {
            l0 l0Var = this.D;
            i.a aVar = l0Var.f16660b;
            l0Var.f16659a.h(aVar.f16912a, this.f16730k);
            return g.c(this.f16730k.a(aVar.f16913b, aVar.f16914c));
        }
        x0 M = M();
        if (M.q()) {
            return -9223372036854775807L;
        }
        return M.n(z(), this.f16558a).b();
    }

    public final int h0() {
        if (this.D.f16659a.q()) {
            return this.E;
        }
        l0 l0Var = this.D;
        return l0Var.f16659a.h(l0Var.f16660b.f16912a, this.f16730k).f16841c;
    }

    @Override // w6.n0
    public n0.b i() {
        return this.B;
    }

    public final Pair<Object, Long> i0(x0 x0Var, int i10, long j10) {
        if (x0Var.q()) {
            this.E = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.F = j10;
            return null;
        }
        if (i10 == -1 || i10 >= x0Var.p()) {
            i10 = x0Var.a(this.f16740v);
            j10 = x0Var.n(i10, this.f16558a).a();
        }
        return x0Var.j(this.f16558a, this.f16730k, i10, g.b(j10));
    }

    @Override // w6.n0
    public void j(n0.e eVar) {
        o(eVar);
    }

    @Override // w6.n0
    public boolean k() {
        return this.D.f16669l;
    }

    @Override // w6.n0
    public void l(final boolean z10) {
        if (this.f16740v != z10) {
            this.f16740v = z10;
            ((y.b) this.f16727h.f16803u.a(12, z10 ? 1 : 0, 0)).b();
            this.f16728i.b(10, new m.a() { // from class: w6.t
                @Override // k8.m.a
                public final void invoke(Object obj) {
                    ((n0.c) obj).z(z10);
                }
            });
            r0();
            this.f16728i.a();
        }
    }

    public final l0 l0(l0 l0Var, x0 x0Var, Pair<Object, Long> pair) {
        i.a aVar;
        i8.m mVar;
        int i10;
        k8.a.c(x0Var.q() || pair != null);
        x0 x0Var2 = l0Var.f16659a;
        l0 h10 = l0Var.h(x0Var);
        if (x0Var.q()) {
            i.a aVar2 = l0.f16658t;
            i.a aVar3 = l0.f16658t;
            long b10 = g.b(this.F);
            l0 a10 = h10.b(aVar3, b10, b10, b10, 0L, w7.o.f16943m, this.f16722b, ImmutableList.w()).a(aVar3);
            a10.f16673q = a10.f16675s;
            return a10;
        }
        Object obj = h10.f16660b.f16912a;
        int i11 = k8.c0.f11939a;
        boolean z10 = !obj.equals(pair.first);
        i.a aVar4 = z10 ? new i.a(pair.first) : h10.f16660b;
        long longValue = ((Long) pair.second).longValue();
        long b11 = g.b(E());
        if (!x0Var2.q()) {
            b11 -= x0Var2.h(obj, this.f16730k).f16842e;
        }
        if (z10 || longValue < b11) {
            k8.a.f(!aVar4.a());
            w7.o oVar = z10 ? w7.o.f16943m : h10.f16665h;
            if (z10) {
                aVar = aVar4;
                mVar = this.f16722b;
            } else {
                aVar = aVar4;
                mVar = h10.f16666i;
            }
            l0 a11 = h10.b(aVar, longValue, longValue, longValue, 0L, oVar, mVar, z10 ? ImmutableList.w() : h10.f16667j).a(aVar);
            a11.f16673q = longValue;
            return a11;
        }
        if (i10 == 0) {
            int b12 = x0Var.b(h10.f16668k.f16912a);
            if (b12 == -1 || x0Var.f(b12, this.f16730k).f16841c != x0Var.h(aVar4.f16912a, this.f16730k).f16841c) {
                x0Var.h(aVar4.f16912a, this.f16730k);
                long a12 = aVar4.a() ? this.f16730k.a(aVar4.f16913b, aVar4.f16914c) : this.f16730k.d;
                h10 = h10.b(aVar4, h10.f16675s, h10.f16675s, h10.d, a12 - h10.f16675s, h10.f16665h, h10.f16666i, h10.f16667j).a(aVar4);
                h10.f16673q = a12;
            }
        } else {
            k8.a.f(!aVar4.a());
            long max = Math.max(0L, h10.f16674r - (longValue - b11));
            long j10 = h10.f16673q;
            if (h10.f16668k.equals(h10.f16660b)) {
                j10 = longValue + max;
            }
            h10 = h10.b(aVar4, longValue, longValue, longValue, max, h10.f16665h, h10.f16666i, h10.f16667j);
            h10.f16673q = j10;
        }
        return h10;
    }

    @Override // w6.n
    public i8.l m() {
        return this.f16724e;
    }

    public final long m0(x0 x0Var, i.a aVar, long j10) {
        x0Var.h(aVar.f16912a, this.f16730k);
        return j10 + this.f16730k.f16842e;
    }

    public void n0(n0.c cVar) {
        k8.m<n0.c> mVar = this.f16728i;
        Iterator<m.c<n0.c>> it = mVar.d.iterator();
        while (true) {
            while (it.hasNext()) {
                m.c<n0.c> next = it.next();
                if (next.f11973a.equals(cVar)) {
                    m.b<n0.c> bVar = mVar.f11969c;
                    next.d = true;
                    if (next.f11975c) {
                        bVar.e(next.f11973a, next.f11974b.b());
                    }
                    mVar.d.remove(next);
                }
            }
            return;
        }
    }

    @Override // w6.n0
    public void o(n0.c cVar) {
        k8.m<n0.c> mVar = this.f16728i;
        if (mVar.f11972g) {
            return;
        }
        Objects.requireNonNull(cVar);
        mVar.d.add(new m.c<>(cVar));
    }

    public final void o0(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f16731l.remove(i12);
        }
        this.A = this.A.a(i10, i11);
    }

    @Override // w6.n0
    public int p() {
        return 3000;
    }

    public void p0(boolean z10, int i10, int i11) {
        l0 l0Var = this.D;
        if (l0Var.f16669l == z10 && l0Var.f16670m == i10) {
            return;
        }
        this.f16741w++;
        l0 d = l0Var.d(z10, i10);
        ((y.b) this.f16727h.f16803u.a(1, z10 ? 1 : 0, i10)).b();
        s0(d, 0, i11, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // w6.n0
    public void q(final int i10) {
        if (this.f16739u != i10) {
            this.f16739u = i10;
            ((y.b) this.f16727h.f16803u.a(11, i10, 0)).b();
            this.f16728i.b(9, new m.a() { // from class: w6.r
                @Override // k8.m.a
                public final void invoke(Object obj) {
                    ((n0.c) obj).L(i10);
                }
            });
            r0();
            this.f16728i.a();
        }
    }

    public void q0(boolean z10, ExoPlaybackException exoPlaybackException) {
        l0 a10;
        Pair<Object, Long> i02;
        Pair<Object, Long> i03;
        if (z10) {
            int size = this.f16731l.size();
            k8.a.c(size >= 0 && size <= this.f16731l.size());
            int z11 = z();
            x0 x0Var = this.D.f16659a;
            int size2 = this.f16731l.size();
            this.f16741w++;
            o0(0, size);
            p0 p0Var = new p0(this.f16731l, this.A);
            l0 l0Var = this.D;
            long E = E();
            if (x0Var.q() || p0Var.q()) {
                boolean z12 = !x0Var.q() && p0Var.q();
                int h02 = z12 ? -1 : h0();
                if (z12) {
                    E = -9223372036854775807L;
                }
                i02 = i0(p0Var, h02, E);
            } else {
                i02 = x0Var.j(this.f16558a, this.f16730k, z(), g.b(E));
                int i10 = k8.c0.f11939a;
                Object obj = i02.first;
                if (p0Var.b(obj) == -1) {
                    Object N = w.N(this.f16558a, this.f16730k, this.f16739u, this.f16740v, obj, x0Var, p0Var);
                    if (N != null) {
                        p0Var.h(N, this.f16730k);
                        int i11 = this.f16730k.f16841c;
                        i03 = i0(p0Var, i11, p0Var.n(i11, this.f16558a).a());
                    } else {
                        i03 = i0(p0Var, -1, -9223372036854775807L);
                    }
                    i02 = i03;
                }
            }
            l0 l02 = l0(l0Var, p0Var, i02);
            int i12 = l02.f16662e;
            if (i12 != 1 && i12 != 4 && size > 0 && size == size2 && z11 >= l02.f16659a.p()) {
                l02 = l02.g(4);
            }
            ((y.b) this.f16727h.f16803u.f(20, 0, size, this.A)).b();
            a10 = l02.e(null);
        } else {
            l0 l0Var2 = this.D;
            a10 = l0Var2.a(l0Var2.f16660b);
            a10.f16673q = a10.f16675s;
            a10.f16674r = 0L;
        }
        l0 g10 = a10.g(1);
        if (exoPlaybackException != null) {
            g10 = g10.e(exoPlaybackException);
        }
        this.f16741w++;
        ((y.b) this.f16727h.f16803u.c(6)).b();
        s0(g10, 0, 1, false, g10.f16659a.q() && !this.D.f16659a.q(), 4, g0(g10), -1);
    }

    @Override // w6.n0
    public int r() {
        if (this.D.f16659a.q()) {
            return 0;
        }
        l0 l0Var = this.D;
        return l0Var.f16659a.b(l0Var.f16660b.f16912a);
    }

    public final void r0() {
        n0.b bVar = this.B;
        n0.b bVar2 = this.f16723c;
        n0.b.a aVar = new n0.b.a();
        aVar.a(bVar2);
        boolean z10 = true;
        aVar.b(3, !a());
        aVar.b(4, d0() && !a());
        aVar.b(5, a0() && !a());
        aVar.b(6, !M().q() && (a0() || !c0() || d0()) && !a());
        aVar.b(7, Z() && !a());
        aVar.b(8, !M().q() && (Z() || (c0() && b0())) && !a());
        aVar.b(9, !a());
        aVar.b(10, d0() && !a());
        aVar.b(11, (!d0() || a()) ? false : false);
        n0.b c10 = aVar.c();
        this.B = c10;
        if (!c10.equals(bVar)) {
            this.f16728i.b(14, new g4.g(this));
        }
    }

    @Override // w6.n0
    public int s() {
        return this.f16739u;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0(final w6.l0 r38, int r39, final int r40, boolean r41, boolean r42, final int r43, long r44, int r46) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.u.s0(w6.l0, int, int, boolean, boolean, int, long, int):void");
    }

    @Override // w6.n0
    public void t(TextureView textureView) {
    }

    @Override // w6.n0
    public l8.s u() {
        return l8.s.f12742e;
    }

    @Override // w6.n0
    public void v(List<c0> list, boolean z10) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(this.n.a(list.get(i11)));
        }
        int h02 = h0();
        long currentPosition = getCurrentPosition();
        this.f16741w++;
        if (!this.f16731l.isEmpty()) {
            o0(0, this.f16731l.size());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            k0.c cVar = new k0.c((com.google.android.exoplayer2.source.i) arrayList.get(i12), this.f16732m);
            arrayList2.add(cVar);
            this.f16731l.add(i12 + 0, new a(cVar.f16650b, cVar.f16649a.n));
        }
        w7.k f10 = this.A.f(0, arrayList2.size());
        this.A = f10;
        p0 p0Var = new p0(this.f16731l, f10);
        if (!p0Var.q() && -1 >= p0Var.f16705e) {
            throw new IllegalSeekPositionException(p0Var, -1, -9223372036854775807L);
        }
        if (z10) {
            i10 = p0Var.a(this.f16740v);
            currentPosition = -9223372036854775807L;
        } else {
            i10 = h02;
        }
        l0 l02 = l0(this.D, p0Var, i0(p0Var, i10, currentPosition));
        int i13 = l02.f16662e;
        if (i10 != -1 && i13 != 1) {
            i13 = (p0Var.q() || i10 >= p0Var.f16705e) ? 4 : 2;
        }
        l0 g10 = l02.g(i13);
        ((y.b) this.f16727h.f16803u.j(17, new w.a(arrayList2, this.A, i10, g.b(currentPosition), null))).b();
        s0(g10, 0, 1, false, (this.D.f16660b.f16912a.equals(g10.f16660b.f16912a) || this.D.f16659a.q()) ? false : true, 4, g0(g10), -1);
    }

    @Override // w6.n0
    public int w() {
        if (a()) {
            return this.D.f16660b.f16914c;
        }
        return -1;
    }

    @Override // w6.n0
    public void x(SurfaceView surfaceView) {
    }

    @Override // w6.n0
    public int z() {
        int h02 = h0();
        if (h02 == -1) {
            return 0;
        }
        return h02;
    }
}
