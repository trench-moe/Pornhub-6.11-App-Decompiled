package w6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import i8.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.y;
import o7.a;
import w6.c0;
import w6.k0;
import w6.l;
import w6.o0;
import w6.x0;

/* loaded from: classes2.dex */
public final class w implements Handler.Callback, h.a, l.a, k0.d, l.a, o0.a {
    public final x0.b A;
    public final long B;
    public final boolean C;
    public final l D;
    public final ArrayList<c> E;
    public final k8.b F;
    public final e G;
    public final h0 H;
    public final k0 I;
    public final a0 J;
    public final long K;
    public u0 L;
    public l0 M;
    public d N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public g Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f16794a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f16795b0;

    /* renamed from: c  reason: collision with root package name */
    public final q0[] f16796c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16797c0;

    /* renamed from: d0  reason: collision with root package name */
    public ExoPlaybackException f16798d0;

    /* renamed from: f  reason: collision with root package name */
    public final r0[] f16799f;

    /* renamed from: j  reason: collision with root package name */
    public final i8.l f16800j;

    /* renamed from: m  reason: collision with root package name */
    public final i8.m f16801m;
    public final b0 n;

    /* renamed from: t  reason: collision with root package name */
    public final j8.b f16802t;

    /* renamed from: u  reason: collision with root package name */
    public final k8.i f16803u;

    /* renamed from: w  reason: collision with root package name */
    public final HandlerThread f16804w;
    public final Looper y;

    /* renamed from: z  reason: collision with root package name */
    public final x0.c f16805z;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<k0.c> f16806a;

        /* renamed from: b  reason: collision with root package name */
        public final w7.k f16807b;

        /* renamed from: c  reason: collision with root package name */
        public final int f16808c;
        public final long d;

        public a(List list, w7.k kVar, int i10, long j10, v vVar) {
            this.f16806a = list;
            this.f16807b = kVar;
            this.f16808c = i10;
            this.d = j10;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
    }

    /* loaded from: classes2.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: c  reason: collision with root package name */
        public final o0 f16809c;

        /* renamed from: f  reason: collision with root package name */
        public int f16810f;

        /* renamed from: j  reason: collision with root package name */
        public long f16811j;

        /* renamed from: m  reason: collision with root package name */
        public Object f16812m;

        public void b(int i10, long j10, Object obj) {
            this.f16810f = i10;
            this.f16811j = j10;
            this.f16812m = obj;
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            c cVar2 = cVar;
            Object obj = this.f16812m;
            int i10 = 1;
            if ((obj == null) != (cVar2.f16812m == null)) {
                if (obj != null) {
                    i10 = -1;
                }
                return i10;
            } else if (obj == null) {
                return 0;
            } else {
                int i11 = this.f16810f - cVar2.f16810f;
                if (i11 != 0) {
                    return i11;
                }
                long j10 = this.f16811j;
                long j11 = cVar2.f16811j;
                int i12 = k8.c0.f11939a;
                int i13 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                if (i13 < 0) {
                    i10 = -1;
                    return i10;
                }
                if (i13 == 0) {
                    i10 = 0;
                }
                return i10;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16813a;

        /* renamed from: b  reason: collision with root package name */
        public l0 f16814b;

        /* renamed from: c  reason: collision with root package name */
        public int f16815c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public int f16816e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16817f;

        /* renamed from: g  reason: collision with root package name */
        public int f16818g;

        public d(l0 l0Var) {
            this.f16814b = l0Var;
        }

        public void a(int i10) {
            this.f16813a |= i10 > 0;
            this.f16815c += i10;
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
    }

    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final i.a f16819a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16820b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16821c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f16822e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f16823f;

        public f(i.a aVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f16819a = aVar;
            this.f16820b = j10;
            this.f16821c = j11;
            this.d = z10;
            this.f16822e = z11;
            this.f16823f = z12;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final x0 f16824a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16825b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16826c;

        public g(x0 x0Var, int i10, long j10) {
            this.f16824a = x0Var;
            this.f16825b = i10;
            this.f16826c = j10;
        }
    }

    public w(q0[] q0VarArr, i8.l lVar, i8.m mVar, b0 b0Var, j8.b bVar, int i10, boolean z10, x6.b0 b0Var2, u0 u0Var, a0 a0Var, long j10, boolean z11, Looper looper, k8.b bVar2, e eVar) {
        this.G = eVar;
        this.f16796c = q0VarArr;
        this.f16800j = lVar;
        this.f16801m = mVar;
        this.n = b0Var;
        this.f16802t = bVar;
        this.T = i10;
        this.U = z10;
        this.L = u0Var;
        this.J = a0Var;
        this.K = j10;
        this.P = z11;
        this.F = bVar2;
        this.B = b0Var.c();
        this.C = b0Var.a();
        l0 i11 = l0.i(mVar);
        this.M = i11;
        this.N = new d(i11);
        this.f16799f = new r0[q0VarArr.length];
        for (int i12 = 0; i12 < q0VarArr.length; i12++) {
            q0VarArr[i12].g(i12);
            this.f16799f[i12] = q0VarArr[i12].m();
        }
        this.D = new l(this, bVar2);
        this.E = new ArrayList<>();
        this.f16805z = new x0.c();
        this.A = new x0.b();
        lVar.f10667a = this;
        lVar.f10668b = bVar;
        this.f16797c0 = true;
        Handler handler = new Handler(looper);
        this.H = new h0(b0Var2, handler);
        this.I = new k0(this, b0Var2, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f16804w = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.y = looper2;
        this.f16803u = bVar2.b(looper2, this);
    }

    public static boolean K(c cVar, x0 x0Var, x0 x0Var2, int i10, boolean z10, x0.c cVar2, x0.b bVar) {
        Object obj = cVar.f16812m;
        if (obj == null) {
            Objects.requireNonNull(cVar.f16809c);
            Objects.requireNonNull(cVar.f16809c);
            long b10 = w6.g.b(-9223372036854775807L);
            o0 o0Var = cVar.f16809c;
            Pair<Object, Long> M = M(x0Var, new g(o0Var.d, o0Var.f16699h, b10), false, i10, z10, cVar2, bVar);
            if (M == null) {
                return false;
            }
            cVar.b(x0Var.b(M.first), ((Long) M.second).longValue(), M.first);
            Objects.requireNonNull(cVar.f16809c);
            return true;
        }
        int b11 = x0Var.b(obj);
        if (b11 == -1) {
            return false;
        }
        Objects.requireNonNull(cVar.f16809c);
        cVar.f16810f = b11;
        x0Var2.h(cVar.f16812m, bVar);
        if (bVar.f16843f && x0Var2.n(bVar.f16841c, cVar2).f16859o == x0Var2.b(cVar.f16812m)) {
            Pair<Object, Long> j10 = x0Var.j(cVar2, bVar, x0Var.h(cVar.f16812m, bVar).f16841c, cVar.f16811j + bVar.f16842e);
            cVar.b(x0Var.b(j10.first), ((Long) j10.second).longValue(), j10.first);
        }
        return true;
    }

    public static Pair<Object, Long> M(x0 x0Var, g gVar, boolean z10, int i10, boolean z11, x0.c cVar, x0.b bVar) {
        Pair<Object, Long> j10;
        Object N;
        x0 x0Var2 = gVar.f16824a;
        if (x0Var.q()) {
            return null;
        }
        x0 x0Var3 = x0Var2.q() ? x0Var : x0Var2;
        try {
            j10 = x0Var3.j(cVar, bVar, gVar.f16825b, gVar.f16826c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (x0Var.equals(x0Var3)) {
            return j10;
        }
        if (x0Var.b(j10.first) != -1) {
            return (x0Var3.h(j10.first, bVar).f16843f && x0Var3.n(bVar.f16841c, cVar).f16859o == x0Var3.b(j10.first)) ? x0Var.j(cVar, bVar, x0Var.h(j10.first, bVar).f16841c, gVar.f16826c) : j10;
        }
        if (z10 && (N = N(cVar, bVar, i10, z11, j10.first, x0Var3, x0Var)) != null) {
            return x0Var.j(cVar, bVar, x0Var.h(N, bVar).f16841c, -9223372036854775807L);
        }
        return null;
    }

    public static Object N(x0.c cVar, x0.b bVar, int i10, boolean z10, Object obj, x0 x0Var, x0 x0Var2) {
        int b10 = x0Var.b(obj);
        int i11 = x0Var.i();
        int i12 = b10;
        int i13 = -1;
        for (int i14 = 0; i14 < i11 && i13 == -1; i14++) {
            i12 = x0Var.d(i12, bVar, cVar, i10, z10);
            if (i12 == -1) {
                break;
            }
            i13 = x0Var2.b(x0Var.m(i12));
        }
        if (i13 == -1) {
            return null;
        }
        return x0Var2.m(i13);
    }

    public static y[] i(i8.f fVar) {
        int length = fVar != null ? fVar.length() : 0;
        y[] yVarArr = new y[length];
        for (int i10 = 0; i10 < length; i10++) {
            yVarArr[i10] = fVar.b(i10);
        }
        return yVarArr;
    }

    public static boolean w(q0 q0Var) {
        return q0Var.getState() != 0;
    }

    public static boolean y(l0 l0Var, x0.b bVar) {
        i.a aVar = l0Var.f16660b;
        x0 x0Var = l0Var.f16659a;
        return x0Var.q() || x0Var.h(aVar.f16912a, bVar).f16843f;
    }

    public final void A() {
        d dVar = this.N;
        l0 l0Var = this.M;
        boolean z10 = dVar.f16813a | (dVar.f16814b != l0Var);
        dVar.f16813a = z10;
        dVar.f16814b = l0Var;
        if (z10) {
            u uVar = (u) ((s4.f) this.G).f14830f;
            uVar.f16725f.b(new g4.s(uVar, dVar, 2));
            this.N = new d(this.M);
        }
    }

    public final void B() {
        r(this.I.c(), true);
    }

    public final void C(b bVar) {
        boolean z10 = true;
        this.N.a(1);
        k0 k0Var = this.I;
        Objects.requireNonNull(bVar);
        Objects.requireNonNull(k0Var);
        if (k0Var.e() < 0) {
            z10 = false;
        }
        k8.a.c(z10);
        k0Var.f16639i = null;
        r(k0Var.c(), false);
    }

    public final void D() {
        this.N.a(1);
        H(false, false, false, true);
        this.n.d();
        f0(this.M.f16659a.q() ? 4 : 2);
        k0 k0Var = this.I;
        j8.t c10 = this.f16802t.c();
        k8.a.f(!k0Var.f16640j);
        k0Var.f16641k = c10;
        for (int i10 = 0; i10 < k0Var.f16632a.size(); i10++) {
            k0.c cVar = k0Var.f16632a.get(i10);
            k0Var.g(cVar);
            k0Var.f16638h.add(cVar);
        }
        k0Var.f16640j = true;
        this.f16803u.e(2);
    }

    public final void E() {
        H(true, false, true, false);
        this.n.e();
        f0(1);
        this.f16804w.quit();
        synchronized (this) {
            this.O = true;
            notifyAll();
        }
    }

    public final void F(int i10, int i11, w7.k kVar) {
        boolean z10 = true;
        this.N.a(1);
        k0 k0Var = this.I;
        Objects.requireNonNull(k0Var);
        if (i10 < 0 || i10 > i11 || i11 > k0Var.e()) {
            z10 = false;
        }
        k8.a.c(z10);
        k0Var.f16639i = kVar;
        k0Var.i(i10, i11);
        r(k0Var.c(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.w.G():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.w.H(boolean, boolean, boolean, boolean):void");
    }

    public final void I() {
        e0 e0Var = this.H.f16602h;
        this.Q = e0Var != null && e0Var.f16563f.f16586h && this.P;
    }

    public final void J(long j10) {
        q0[] q0VarArr;
        i8.f[] fVarArr;
        e0 e0Var = this.H.f16602h;
        if (e0Var != null) {
            j10 += e0Var.f16571o;
        }
        this.f16794a0 = j10;
        this.D.f16653c.a(j10);
        for (q0 q0Var : this.f16796c) {
            if (w(q0Var)) {
                q0Var.v(this.f16794a0);
            }
        }
        for (e0 e0Var2 = this.H.f16602h; e0Var2 != null; e0Var2 = e0Var2.f16569l) {
            for (i8.f fVar : e0Var2.n.f10671c) {
                if (fVar != null) {
                    fVar.n();
                }
            }
        }
    }

    public final void L(x0 x0Var, x0 x0Var2) {
        if (x0Var.q() && x0Var2.q()) {
            return;
        }
        int size = this.E.size();
        while (true) {
            while (true) {
                size--;
                if (size < 0) {
                    Collections.sort(this.E);
                    return;
                } else if (!K(this.E.get(size), x0Var, x0Var2, this.T, this.U, this.f16805z, this.A)) {
                    this.E.get(size).f16809c.c(false);
                    this.E.remove(size);
                }
            }
        }
    }

    public final void O(long j10, long j11) {
        this.f16803u.i(2);
        this.f16803u.h(2, j10 + j11);
    }

    public final void P(boolean z10) {
        i.a aVar = this.H.f16602h.f16563f.f16580a;
        long S = S(aVar, this.M.f16675s, true, false);
        if (S != this.M.f16675s) {
            l0 l0Var = this.M;
            this.M = u(aVar, S, l0Var.f16661c, l0Var.d, z10, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: all -> 0x014b, TryCatch #1 {all -> 0x014b, blocks: (B:22:0x00a4, B:24:0x00ae, B:27:0x00b5, B:29:0x00bb, B:30:0x00be, B:32:0x00c4, B:34:0x00ce, B:36:0x00d4, B:40:0x00dc, B:42:0x00e6, B:44:0x00f6, B:48:0x0102, B:52:0x0114, B:56:0x011d), top: B:74:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(w6.w.g r20) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.w.Q(w6.w$g):void");
    }

    public final long R(i.a aVar, long j10, boolean z10) {
        h0 h0Var = this.H;
        return S(aVar, j10, h0Var.f16602h != h0Var.f16603i, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long S(com.google.android.exoplayer2.source.i.a r11, long r12, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.w.S(com.google.android.exoplayer2.source.i$a, long, boolean, boolean):long");
    }

    public final void T(o0 o0Var) {
        if (o0Var.f16698g != this.y) {
            ((y.b) this.f16803u.j(15, o0Var)).b();
            return;
        }
        b(o0Var);
        int i10 = this.M.f16662e;
        if (i10 != 3 && i10 != 2) {
            return;
        }
        this.f16803u.e(2);
    }

    public final void U(o0 o0Var) {
        Looper looper = o0Var.f16698g;
        if (looper.getThread().isAlive()) {
            this.F.b(looper, null).b(new w.s(this, o0Var, 1));
            return;
        }
        Log.w("TAG", "Trying to send message on a dead thread.");
        o0Var.c(false);
    }

    public final void V(q0 q0Var, long j10) {
        q0Var.l();
        if (q0Var instanceof y7.j) {
            y7.j jVar = (y7.j) q0Var;
            k8.a.f(jVar.f16579z);
            jVar.P = j10;
        }
    }

    public final void W(boolean z10, AtomicBoolean atomicBoolean) {
        q0[] q0VarArr;
        if (this.V != z10) {
            this.V = z10;
            if (!z10) {
                for (q0 q0Var : this.f16796c) {
                    if (!w(q0Var)) {
                        q0Var.a();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void X(a aVar) {
        this.N.a(1);
        if (aVar.f16808c != -1) {
            this.Z = new g(new p0(aVar.f16806a, aVar.f16807b), aVar.f16808c, aVar.d);
        }
        k0 k0Var = this.I;
        List<k0.c> list = aVar.f16806a;
        w7.k kVar = aVar.f16807b;
        k0Var.i(0, k0Var.f16632a.size());
        r(k0Var.a(k0Var.f16632a.size(), list, kVar), false);
    }

    public final void Y(boolean z10) {
        if (z10 == this.X) {
            return;
        }
        this.X = z10;
        l0 l0Var = this.M;
        int i10 = l0Var.f16662e;
        if (!z10 && i10 != 4 && i10 != 1) {
            this.f16803u.e(2);
            return;
        }
        this.M = l0Var.c(z10);
    }

    public final void Z(boolean z10) {
        this.P = z10;
        I();
        if (this.Q) {
            h0 h0Var = this.H;
            if (h0Var.f16603i != h0Var.f16602h) {
                P(true);
                q(false);
            }
        }
    }

    public final void a(a aVar, int i10) {
        this.N.a(1);
        k0 k0Var = this.I;
        if (i10 == -1) {
            i10 = k0Var.e();
        }
        r(k0Var.a(i10, aVar.f16806a, aVar.f16807b), false);
    }

    public final void a0(boolean z10, int i10, boolean z11, int i11) {
        i8.f[] fVarArr;
        this.N.a(z11 ? 1 : 0);
        d dVar = this.N;
        dVar.f16813a = true;
        dVar.f16817f = true;
        dVar.f16818g = i11;
        this.M = this.M.d(z10, i10);
        this.R = false;
        for (e0 e0Var = this.H.f16602h; e0Var != null; e0Var = e0Var.f16569l) {
            for (i8.f fVar : e0Var.n.f10671c) {
                if (fVar != null) {
                    fVar.j(z10);
                }
            }
        }
        if (!g0()) {
            k0();
            n0();
            return;
        }
        int i12 = this.M.f16662e;
        if (i12 == 3) {
            i0();
            this.f16803u.e(2);
            return;
        }
        if (i12 == 2) {
            this.f16803u.e(2);
        }
    }

    public final void b(o0 o0Var) {
        o0Var.b();
        try {
            o0Var.f16693a.r(o0Var.f16696e, o0Var.f16697f);
            o0Var.c(true);
        } catch (Throwable th) {
            o0Var.c(true);
            throw th;
        }
    }

    public final void b0(m0 m0Var) {
        this.D.b(m0Var);
        m0 e10 = this.D.e();
        t(e10, e10.f16678a, true, true);
    }

    public final void c(q0 q0Var) {
        if (q0Var.getState() != 0) {
            l lVar = this.D;
            if (q0Var == lVar.f16655j) {
                lVar.f16656m = null;
                lVar.f16655j = null;
                lVar.n = true;
            }
            if (q0Var.getState() == 2) {
                q0Var.stop();
            }
            q0Var.h();
            this.Y--;
        }
    }

    public final void c0(int i10) {
        this.T = i10;
        h0 h0Var = this.H;
        x0 x0Var = this.M.f16659a;
        h0Var.f16600f = i10;
        if (!h0Var.q(x0Var)) {
            P(true);
        }
        q(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x04a2, code lost:
        if (r36.n.f(m(), r36.D.e().f16678a, r36.R, r32) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
        if (r6 != (-9223372036854775807L)) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.w.d():void");
    }

    public final void d0(boolean z10) {
        this.U = z10;
        h0 h0Var = this.H;
        x0 x0Var = this.M.f16659a;
        h0Var.f16601g = z10;
        if (!h0Var.q(x0Var)) {
            P(true);
        }
        q(false);
    }

    public final void e() {
        h(new boolean[this.f16796c.length]);
    }

    public final void e0(w7.k kVar) {
        this.N.a(1);
        k0 k0Var = this.I;
        int e10 = k0Var.e();
        if (kVar.b() != e10) {
            kVar = kVar.h().f(0, e10);
        }
        k0Var.f16639i = kVar;
        r(k0Var.c(), false);
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public void f(com.google.android.exoplayer2.source.h hVar) {
        ((y.b) this.f16803u.j(9, hVar)).b();
    }

    public final void f0(int i10) {
        l0 l0Var = this.M;
        if (l0Var.f16662e != i10) {
            this.M = l0Var.g(i10);
        }
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void g(com.google.android.exoplayer2.source.h hVar) {
        ((y.b) this.f16803u.j(8, hVar)).b();
    }

    public final boolean g0() {
        l0 l0Var = this.M;
        return l0Var.f16669l && l0Var.f16670m == 0;
    }

    public final void h(boolean[] zArr) {
        k8.o oVar;
        e0 e0Var = this.H.f16603i;
        i8.m mVar = e0Var.n;
        for (int i10 = 0; i10 < this.f16796c.length; i10++) {
            if (!mVar.b(i10)) {
                this.f16796c[i10].a();
            }
        }
        for (int i11 = 0; i11 < this.f16796c.length; i11++) {
            if (mVar.b(i11)) {
                boolean z10 = zArr[i11];
                q0 q0Var = this.f16796c[i11];
                if (w(q0Var)) {
                    continue;
                } else {
                    h0 h0Var = this.H;
                    e0 e0Var2 = h0Var.f16603i;
                    boolean z11 = e0Var2 == h0Var.f16602h;
                    i8.m mVar2 = e0Var2.n;
                    s0 s0Var = mVar2.f10670b[i11];
                    y[] i12 = i(mVar2.f10671c[i11]);
                    boolean z12 = g0() && this.M.f16662e == 3;
                    boolean z13 = !z10 && z12;
                    this.Y++;
                    q0Var.i(s0Var, i12, e0Var2.f16561c[i11], this.f16794a0, z13, z11, e0Var2.e(), e0Var2.f16571o);
                    q0Var.r(103, new v(this));
                    l lVar = this.D;
                    Objects.requireNonNull(lVar);
                    k8.o x10 = q0Var.x();
                    if (x10 != null && x10 != (oVar = lVar.f16656m)) {
                        if (oVar != null) {
                            throw ExoPlaybackException.b(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        lVar.f16656m = x10;
                        lVar.f16655j = q0Var;
                        x10.b(lVar.f16653c.n);
                    }
                    if (z12) {
                        q0Var.start();
                    }
                }
            }
        }
        e0Var.f16564g = true;
    }

    public final boolean h0(x0 x0Var, i.a aVar) {
        if (aVar.a() || x0Var.q()) {
            return false;
        }
        x0Var.n(x0Var.h(aVar.f16912a, this.A).f16841c, this.f16805z);
        if (this.f16805z.c()) {
            x0.c cVar = this.f16805z;
            return cVar.f16854i && cVar.f16851f != -9223372036854775807L;
        }
        return false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        e0 e0Var;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    D();
                    break;
                case 1:
                    a0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    d();
                    break;
                case 3:
                    Q((g) message.obj);
                    break;
                case 4:
                    b0((m0) message.obj);
                    break;
                case 5:
                    this.L = (u0) message.obj;
                    break;
                case 6:
                    j0(false, true);
                    break;
                case 7:
                    E();
                    return true;
                case 8:
                    s((com.google.android.exoplayer2.source.h) message.obj);
                    break;
                case 9:
                    o((com.google.android.exoplayer2.source.h) message.obj);
                    break;
                case 10:
                    G();
                    break;
                case 11:
                    c0(message.arg1);
                    break;
                case 12:
                    d0(message.arg1 != 0);
                    break;
                case 13:
                    W(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    o0 o0Var = (o0) message.obj;
                    Objects.requireNonNull(o0Var);
                    T(o0Var);
                    break;
                case 15:
                    U((o0) message.obj);
                    break;
                case 16:
                    m0 m0Var = (m0) message.obj;
                    t(m0Var, m0Var.f16678a, true, false);
                    break;
                case 17:
                    X((a) message.obj);
                    break;
                case 18:
                    a((a) message.obj, message.arg1);
                    break;
                case 19:
                    C((b) message.obj);
                    break;
                case 20:
                    F(message.arg1, message.arg2, (w7.k) message.obj);
                    break;
                case 21:
                    e0((w7.k) message.obj);
                    break;
                case 22:
                    B();
                    break;
                case 23:
                    Z(message.arg1 != 0);
                    break;
                case 24:
                    Y(message.arg1 == 1);
                    break;
                case 25:
                    P(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e10) {
            e = e10;
            if (e.type == 1 && (e0Var = this.H.f16603i) != null) {
                e = e.a(e0Var.f16563f.f16580a);
            }
            if (e.isRecoverable && this.f16798d0 == null) {
                k8.a.k("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f16798d0 = e;
                k8.i iVar = this.f16803u;
                iVar.g(iVar.j(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.f16798d0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.f16798d0;
                }
                k8.a.i("ExoPlayerImplInternal", "Playback error", e);
                j0(true, false);
                this.M = this.M.e(e);
            }
        } catch (ParserException e11) {
            int i11 = e11.dataType;
            if (i11 == 1) {
                i10 = e11.contentIsMalformed ? 3001 : 3003;
            } else if (i11 == 4) {
                i10 = e11.contentIsMalformed ? 3002 : 3004;
            }
            p(e11, i10);
        } catch (DrmSession.DrmSessionException e12) {
            p(e12, e12.errorCode);
        } catch (DataSourceException e13) {
            p(e13, e13.reason);
        } catch (IOException e14) {
            p(e14, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
        } catch (RuntimeException e15) {
            if (!(e15 instanceof IllegalStateException)) {
                if (e15 instanceof IllegalArgumentException) {
                }
                ExoPlaybackException b10 = ExoPlaybackException.b(e15, i10);
                k8.a.i("ExoPlayerImplInternal", "Playback error", b10);
                j0(true, false);
                this.M = this.M.e(b10);
            }
            i10 = 1004;
            ExoPlaybackException b102 = ExoPlaybackException.b(e15, i10);
            k8.a.i("ExoPlayerImplInternal", "Playback error", b102);
            j0(true, false);
            this.M = this.M.e(b102);
        }
        A();
        return true;
    }

    public final void i0() {
        q0[] q0VarArr;
        this.R = false;
        l lVar = this.D;
        lVar.f16657t = true;
        lVar.f16653c.c();
        for (q0 q0Var : this.f16796c) {
            if (w(q0Var)) {
                q0Var.start();
            }
        }
    }

    public final long j(x0 x0Var, Object obj, long j10) {
        x0Var.n(x0Var.h(obj, this.A).f16841c, this.f16805z);
        x0.c cVar = this.f16805z;
        if (cVar.f16851f != -9223372036854775807L && cVar.c()) {
            x0.c cVar2 = this.f16805z;
            if (cVar2.f16854i) {
                long j11 = cVar2.f16852g;
                int i10 = k8.c0.f11939a;
                return w6.g.b((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.f16805z.f16851f) - (j10 + this.A.f16842e);
            }
        }
        return -9223372036854775807L;
    }

    public final void j0(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && this.V) {
            z12 = false;
            H(z12, false, true, false);
            this.N.a(z11 ? 1 : 0);
            this.n.i();
            f0(1);
        }
        z12 = true;
        H(z12, false, true, false);
        this.N.a(z11 ? 1 : 0);
        this.n.i();
        f0(1);
    }

    public final long k() {
        e0 e0Var = this.H.f16603i;
        if (e0Var == null) {
            return 0L;
        }
        long j10 = e0Var.f16571o;
        if (!e0Var.d) {
            return j10;
        }
        int i10 = 0;
        while (true) {
            q0[] q0VarArr = this.f16796c;
            if (i10 >= q0VarArr.length) {
                return j10;
            }
            if (w(q0VarArr[i10])) {
                if (this.f16796c[i10].s() != e0Var.f16561c[i10]) {
                    i10++;
                } else {
                    long u2 = this.f16796c[i10].u();
                    if (u2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    j10 = Math.max(u2, j10);
                }
            }
            i10++;
        }
    }

    public final void k0() {
        q0[] q0VarArr;
        l lVar = this.D;
        lVar.f16657t = false;
        k8.w wVar = lVar.f16653c;
        if (wVar.f12027f) {
            wVar.a(wVar.n());
            wVar.f12027f = false;
        }
        for (q0 q0Var : this.f16796c) {
            if (w(q0Var) && q0Var.getState() == 2) {
                q0Var.stop();
            }
        }
    }

    public final Pair<i.a, Long> l(x0 x0Var) {
        if (x0Var.q()) {
            i.a aVar = l0.f16658t;
            return Pair.create(l0.f16658t, 0L);
        }
        Pair<Object, Long> j10 = x0Var.j(this.f16805z, this.A, x0Var.a(this.U), -9223372036854775807L);
        i.a o10 = this.H.o(x0Var, j10.first, 0L);
        long longValue = ((Long) j10.second).longValue();
        if (o10.a()) {
            x0Var.h(o10.f16912a, this.A);
            longValue = o10.f16914c == this.A.d(o10.f16913b) ? this.A.f16844g.f18052c : 0L;
        }
        return Pair.create(o10, Long.valueOf(longValue));
    }

    public final void l0() {
        e0 e0Var = this.H.f16604j;
        boolean z10 = this.S || (e0Var != null && e0Var.f16559a.c());
        l0 l0Var = this.M;
        if (z10 != l0Var.f16664g) {
            this.M = new l0(l0Var.f16659a, l0Var.f16660b, l0Var.f16661c, l0Var.d, l0Var.f16662e, l0Var.f16663f, z10, l0Var.f16665h, l0Var.f16666i, l0Var.f16667j, l0Var.f16668k, l0Var.f16669l, l0Var.f16670m, l0Var.n, l0Var.f16673q, l0Var.f16674r, l0Var.f16675s, l0Var.f16671o, l0Var.f16672p);
        }
    }

    public final long m() {
        return n(this.M.f16673q);
    }

    public final void m0(x0 x0Var, i.a aVar, x0 x0Var2, i.a aVar2, long j10) {
        if (!x0Var.q() && h0(x0Var, aVar)) {
            x0Var.n(x0Var.h(aVar.f16912a, this.A).f16841c, this.f16805z);
            a0 a0Var = this.J;
            c0.f fVar = this.f16805z.f16856k;
            int i10 = k8.c0.f11939a;
            j jVar = (j) a0Var;
            Objects.requireNonNull(jVar);
            jVar.d = w6.g.b(fVar.f16492a);
            jVar.f16613g = w6.g.b(fVar.f16493b);
            jVar.f16614h = w6.g.b(fVar.f16494c);
            float f10 = fVar.d;
            if (f10 == -3.4028235E38f) {
                f10 = 0.97f;
            }
            jVar.f16617k = f10;
            float f11 = fVar.f16495e;
            if (f11 == -3.4028235E38f) {
                f11 = 1.03f;
            }
            jVar.f16616j = f11;
            jVar.a();
            if (j10 != -9223372036854775807L) {
                j jVar2 = (j) this.J;
                jVar2.f16611e = j(x0Var, aVar.f16912a, j10);
                jVar2.a();
                return;
            }
            if (!k8.c0.a(x0Var2.q() ? null : x0Var2.n(x0Var2.h(aVar2.f16912a, this.A).f16841c, this.f16805z).f16847a, this.f16805z.f16847a)) {
                j jVar3 = (j) this.J;
                jVar3.f16611e = -9223372036854775807L;
                jVar3.a();
            }
            return;
        }
        float f12 = this.D.e().f16678a;
        m0 m0Var = this.M.n;
        if (f12 != m0Var.f16678a) {
            this.D.b(m0Var);
        }
    }

    public final long n(long j10) {
        e0 e0Var = this.H.f16604j;
        if (e0Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.f16794a0 - e0Var.f16571o));
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x019c A[LOOP:2: B:78:0x0180->B:88:0x019c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0141 -> B:64:0x0149). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x017f -> B:78:0x0180). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0() {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.w.n0():void");
    }

    public final void o(com.google.android.exoplayer2.source.h hVar) {
        h0 h0Var = this.H;
        e0 e0Var = h0Var.f16604j;
        if (e0Var != null && e0Var.f16559a == hVar) {
            h0Var.m(this.f16794a0);
            z();
        }
    }

    public final void p(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i10);
        e0 e0Var = this.H.f16602h;
        if (e0Var != null) {
            exoPlaybackException = exoPlaybackException.a(e0Var.f16563f.f16580a);
        }
        k8.a.i("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        j0(false, false);
        this.M = this.M.e(exoPlaybackException);
    }

    public final void q(boolean z10) {
        e0 e0Var = this.H.f16604j;
        i.a aVar = e0Var == null ? this.M.f16660b : e0Var.f16563f.f16580a;
        boolean z11 = !this.M.f16668k.equals(aVar);
        if (z11) {
            this.M = this.M.a(aVar);
        }
        l0 l0Var = this.M;
        l0Var.f16673q = e0Var == null ? l0Var.f16675s : e0Var.d();
        this.M.f16674r = m();
        if (!z11) {
            if (z10) {
            }
        }
        if (e0Var != null && e0Var.d) {
            this.n.b(this.f16796c, e0Var.f16570m, e0Var.n.f10671c);
        }
    }

    public final void r(x0 x0Var, boolean z10) {
        Object obj;
        i.a aVar;
        int i10;
        Object obj2;
        long j10;
        long j11;
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        boolean z14;
        boolean z15;
        long j12;
        long j13;
        f fVar;
        long j14;
        int i14;
        long longValue;
        Object obj3;
        boolean z16;
        int i15;
        int i16;
        boolean z17;
        boolean z18;
        boolean z19;
        long j15;
        g gVar;
        boolean z20;
        boolean z21;
        boolean z22;
        l0 l0Var = this.M;
        g gVar2 = this.Z;
        h0 h0Var = this.H;
        int i17 = this.T;
        boolean z23 = this.U;
        x0.c cVar = this.f16805z;
        x0.b bVar = this.A;
        if (x0Var.q()) {
            i.a aVar2 = l0.f16658t;
            fVar = new f(l0.f16658t, 0L, -9223372036854775807L, false, true, false);
        } else {
            i.a aVar3 = l0Var.f16660b;
            Object obj4 = aVar3.f16912a;
            boolean y = y(l0Var, bVar);
            long j16 = (l0Var.f16660b.a() || y) ? l0Var.f16661c : l0Var.f16675s;
            if (gVar2 != null) {
                Object obj5 = obj4;
                Pair<Object, Long> M = M(x0Var, gVar2, true, i17, z23, cVar, bVar);
                if (M == null) {
                    i16 = x0Var.a(z23);
                    j15 = j16;
                    z19 = false;
                    z18 = false;
                    z17 = true;
                } else {
                    if (gVar2.f16826c == -9223372036854775807L) {
                        i15 = x0Var.h(M.first, bVar).f16841c;
                        longValue = j16;
                        obj3 = obj5;
                        z16 = false;
                    } else {
                        Object obj6 = M.first;
                        longValue = ((Long) M.second).longValue();
                        obj3 = obj6;
                        z16 = true;
                        i15 = -1;
                    }
                    obj5 = obj3;
                    i16 = i15;
                    z17 = false;
                    long j17 = longValue;
                    z18 = l0Var.f16662e == 4;
                    z19 = z16;
                    j15 = j17;
                }
                z13 = z19;
                z11 = z18;
                j11 = j15;
                z12 = z17;
                aVar = aVar3;
                i12 = -1;
                i11 = i16;
                obj2 = obj5;
            } else {
                if (l0Var.f16659a.q()) {
                    i10 = x0Var.a(z23);
                    obj = obj4;
                } else if (x0Var.b(obj4) == -1) {
                    obj = obj4;
                    Object N = N(cVar, bVar, i17, z23, obj4, l0Var.f16659a, x0Var);
                    if (N == null) {
                        i13 = x0Var.a(z23);
                        z14 = true;
                    } else {
                        i13 = x0Var.h(N, bVar).f16841c;
                        z14 = false;
                    }
                    z15 = z14;
                    aVar = aVar3;
                    i11 = i13;
                    z12 = z15;
                    obj2 = obj;
                    j11 = j16;
                    i12 = -1;
                    z11 = false;
                    z13 = false;
                } else {
                    obj = obj4;
                    if (j16 == -9223372036854775807L) {
                        i10 = x0Var.h(obj, bVar).f16841c;
                    } else if (y) {
                        aVar = aVar3;
                        l0Var.f16659a.h(aVar.f16912a, bVar);
                        if (l0Var.f16659a.n(bVar.f16841c, cVar).f16859o == l0Var.f16659a.b(aVar.f16912a)) {
                            Pair<Object, Long> j18 = x0Var.j(cVar, bVar, x0Var.h(obj, bVar).f16841c, j16 + bVar.f16842e);
                            Object obj7 = j18.first;
                            long longValue2 = ((Long) j18.second).longValue();
                            obj2 = obj7;
                            j10 = longValue2;
                        } else {
                            obj2 = obj;
                            j10 = j16;
                        }
                        j11 = j10;
                        i11 = -1;
                        i12 = -1;
                        z11 = false;
                        z12 = false;
                        z13 = true;
                    } else {
                        aVar = aVar3;
                        i10 = -1;
                        i13 = i10;
                        z15 = false;
                        i11 = i13;
                        z12 = z15;
                        obj2 = obj;
                        j11 = j16;
                        i12 = -1;
                        z11 = false;
                        z13 = false;
                    }
                }
                aVar = aVar3;
                i13 = i10;
                z15 = false;
                i11 = i13;
                z12 = z15;
                obj2 = obj;
                j11 = j16;
                i12 = -1;
                z11 = false;
                z13 = false;
            }
            if (i11 != i12) {
                Pair<Object, Long> j19 = x0Var.j(cVar, bVar, i11, -9223372036854775807L);
                Object obj8 = j19.first;
                long longValue3 = ((Long) j19.second).longValue();
                obj2 = obj8;
                j11 = longValue3;
                j12 = -9223372036854775807L;
            } else {
                j12 = j11;
            }
            i.a o10 = h0Var.o(x0Var, obj2, j11);
            boolean z24 = o10.f16915e == -1 || ((i14 = aVar.f16915e) != -1 && o10.f16913b >= i14);
            boolean equals = aVar.f16912a.equals(obj2);
            boolean z25 = equals && !aVar.a() && !o10.a() && z24;
            x0Var.h(obj2, bVar);
            boolean z26 = equals && !y && j16 == j12 && ((o10.a() && bVar.e(o10.f16913b)) || (aVar.a() && bVar.e(aVar.f16913b)));
            if (z25 || z26) {
                o10 = aVar;
            }
            if (o10.a()) {
                if (o10.equals(aVar)) {
                    j14 = l0Var.f16675s;
                } else {
                    x0Var.h(o10.f16912a, bVar);
                    j14 = o10.f16914c == bVar.d(o10.f16913b) ? bVar.f16844g.f18052c : 0L;
                }
                j13 = j14;
            } else {
                j13 = j11;
            }
            fVar = new f(o10, j13, j12, z11, z12, z13);
        }
        f fVar2 = fVar;
        i.a aVar4 = fVar2.f16819a;
        long j20 = fVar2.f16821c;
        boolean z27 = fVar2.d;
        long j21 = fVar2.f16820b;
        boolean z28 = (this.M.f16660b.equals(aVar4) && j21 == this.M.f16675s) ? false : true;
        try {
            if (fVar2.f16822e) {
                if (this.M.f16662e != 1) {
                    f0(4);
                }
                H(false, false, false, true);
            }
            try {
                if (z28) {
                    z21 = false;
                    z22 = true;
                    if (!x0Var.q()) {
                        for (e0 e0Var = this.H.f16602h; e0Var != null; e0Var = e0Var.f16569l) {
                            if (e0Var.f16563f.f16580a.equals(aVar4)) {
                                e0Var.f16563f = this.H.h(x0Var, e0Var.f16563f);
                                e0Var.j();
                            }
                        }
                        j21 = R(aVar4, j21, z27);
                    }
                } else {
                    try {
                        z21 = false;
                        z22 = true;
                        if (!this.H.r(x0Var, this.f16794a0, k())) {
                            P(false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        z20 = true;
                        gVar = null;
                        l0 l0Var2 = this.M;
                        g gVar3 = gVar;
                        m0(x0Var, aVar4, l0Var2.f16659a, l0Var2.f16660b, fVar2.f16823f ? j21 : -9223372036854775807L);
                        if (z28 || j20 != this.M.f16661c) {
                            l0 l0Var3 = this.M;
                            Object obj9 = l0Var3.f16660b.f16912a;
                            x0 x0Var2 = l0Var3.f16659a;
                            this.M = u(aVar4, j21, j20, this.M.d, (!z28 || !z10 || x0Var2.q() || x0Var2.h(obj9, this.A).f16843f) ? false : false, x0Var.b(obj9) == -1 ? 4 : 3);
                        }
                        I();
                        L(x0Var, this.M.f16659a);
                        this.M = this.M.h(x0Var);
                        if (!x0Var.q()) {
                            this.Z = gVar3;
                        }
                        q(false);
                        throw th;
                    }
                }
                l0 l0Var4 = this.M;
                m0(x0Var, aVar4, l0Var4.f16659a, l0Var4.f16660b, fVar2.f16823f ? j21 : -9223372036854775807L);
                if (z28 || j20 != this.M.f16661c) {
                    l0 l0Var5 = this.M;
                    Object obj10 = l0Var5.f16660b.f16912a;
                    x0 x0Var3 = l0Var5.f16659a;
                    this.M = u(aVar4, j21, j20, this.M.d, (!z28 || !z10 || x0Var3.q() || x0Var3.h(obj10, this.A).f16843f) ? false : false, x0Var.b(obj10) == -1 ? 4 : 3);
                }
                I();
                L(x0Var, this.M.f16659a);
                this.M = this.M.h(x0Var);
                if (!x0Var.q()) {
                    this.Z = null;
                }
                q(z21);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            gVar = null;
            z20 = true;
        }
    }

    public final void s(com.google.android.exoplayer2.source.h hVar) {
        e0 e0Var = this.H.f16604j;
        if (e0Var != null && e0Var.f16559a == hVar) {
            float f10 = this.D.e().f16678a;
            x0 x0Var = this.M.f16659a;
            e0Var.d = true;
            e0Var.f16570m = e0Var.f16559a.o();
            i8.m i10 = e0Var.i(f10, x0Var);
            f0 f0Var = e0Var.f16563f;
            long j10 = f0Var.f16581b;
            long j11 = f0Var.f16583e;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0L, j11 - 1);
            }
            long a10 = e0Var.a(i10, j10, false, new boolean[e0Var.f16566i.length]);
            long j12 = e0Var.f16571o;
            f0 f0Var2 = e0Var.f16563f;
            e0Var.f16571o = (f0Var2.f16581b - a10) + j12;
            e0Var.f16563f = f0Var2.b(a10);
            this.n.b(this.f16796c, e0Var.f16570m, e0Var.n.f10671c);
            if (e0Var == this.H.f16602h) {
                J(e0Var.f16563f.f16581b);
                e();
                l0 l0Var = this.M;
                i.a aVar = l0Var.f16660b;
                long j13 = e0Var.f16563f.f16581b;
                this.M = u(aVar, j13, l0Var.f16661c, j13, false, 5);
            }
            z();
        }
    }

    public final void t(m0 m0Var, float f10, boolean z10, boolean z11) {
        int i10;
        if (z10) {
            if (z11) {
                this.N.a(1);
            }
            this.M = this.M.f(m0Var);
        }
        float f11 = m0Var.f16678a;
        e0 e0Var = this.H.f16602h;
        while (true) {
            i10 = 0;
            if (e0Var == null) {
                break;
            }
            i8.f[] fVarArr = e0Var.n.f10671c;
            int length = fVarArr.length;
            while (i10 < length) {
                i8.f fVar = fVarArr[i10];
                if (fVar != null) {
                    fVar.m(f11);
                }
                i10++;
            }
            e0Var = e0Var.f16569l;
        }
        q0[] q0VarArr = this.f16796c;
        int length2 = q0VarArr.length;
        while (i10 < length2) {
            q0 q0Var = q0VarArr[i10];
            if (q0Var != null) {
                q0Var.o(f10, m0Var.f16678a);
            }
            i10++;
        }
    }

    public final l0 u(i.a aVar, long j10, long j11, long j12, boolean z10, int i10) {
        w7.o oVar;
        i8.m mVar;
        ImmutableList immutableList;
        w7.o oVar2;
        int i11 = 0;
        this.f16797c0 = (!this.f16797c0 && j10 == this.M.f16675s && aVar.equals(this.M.f16660b)) ? false : true;
        I();
        l0 l0Var = this.M;
        w7.o oVar3 = l0Var.f16665h;
        i8.m mVar2 = l0Var.f16666i;
        List<o7.a> list = l0Var.f16667j;
        if (this.I.f16640j) {
            e0 e0Var = this.H.f16602h;
            w7.o oVar4 = e0Var == null ? w7.o.f16943m : e0Var.f16570m;
            i8.m mVar3 = e0Var == null ? this.f16801m : e0Var.n;
            i8.f[] fVarArr = mVar3.f10671c;
            kb.d.b(4, "initialCapacity");
            Object[] objArr = new Object[4];
            int length = fVarArr.length;
            int i12 = 0;
            boolean z11 = false;
            int i13 = 0;
            while (i12 < length) {
                i8.f fVar = fVarArr[i12];
                if (fVar != null) {
                    o7.a aVar2 = fVar.b(i11).f16869z;
                    if (aVar2 == null) {
                        oVar2 = oVar4;
                        o7.a aVar3 = new o7.a(new a.b[i11]);
                        int i14 = i13 + 1;
                        if (objArr.length < i14) {
                            objArr = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i14));
                        }
                        objArr[i13] = aVar3;
                        i13 = i14;
                    } else {
                        oVar2 = oVar4;
                        int i15 = i13 + 1;
                        if (objArr.length < i15) {
                            objArr = Arrays.copyOf(objArr, ImmutableCollection.b.a(objArr.length, i15));
                        }
                        objArr[i13] = aVar2;
                        i13 = i15;
                        z11 = true;
                    }
                } else {
                    oVar2 = oVar4;
                }
                i12++;
                oVar4 = oVar2;
                i11 = 0;
            }
            w7.o oVar5 = oVar4;
            ImmutableList p10 = z11 ? ImmutableList.p(objArr, i13) : ImmutableList.w();
            if (e0Var != null) {
                f0 f0Var = e0Var.f16563f;
                if (f0Var.f16582c != j11) {
                    e0Var.f16563f = f0Var.a(j11);
                }
            }
            immutableList = p10;
            mVar = mVar3;
            oVar = oVar5;
        } else if (aVar.equals(l0Var.f16660b)) {
            oVar = oVar3;
            mVar = mVar2;
            immutableList = list;
        } else {
            oVar = w7.o.f16943m;
            mVar = this.f16801m;
            immutableList = ImmutableList.w();
        }
        if (z10) {
            d dVar = this.N;
            if (!dVar.d || dVar.f16816e == 5) {
                dVar.f16813a = true;
                dVar.d = true;
                dVar.f16816e = i10;
            } else {
                k8.a.c(i10 == 5);
            }
        }
        return this.M.b(aVar, j10, j11, j12, m(), oVar, mVar, immutableList);
    }

    public final boolean v() {
        e0 e0Var = this.H.f16604j;
        if (e0Var == null) {
            return false;
        }
        return (!e0Var.d ? 0L : e0Var.f16559a.a()) != Long.MIN_VALUE;
    }

    public final boolean x() {
        e0 e0Var = this.H.f16602h;
        long j10 = e0Var.f16563f.f16583e;
        return e0Var.d && (j10 == -9223372036854775807L || this.M.f16675s < j10 || !g0());
    }

    public final void z() {
        long j10;
        long j11;
        boolean g10;
        if (v()) {
            e0 e0Var = this.H.f16604j;
            long n = n(!e0Var.d ? 0L : e0Var.f16559a.a());
            if (e0Var == this.H.f16602h) {
                j10 = this.f16794a0;
                j11 = e0Var.f16571o;
            } else {
                j10 = this.f16794a0 - e0Var.f16571o;
                j11 = e0Var.f16563f.f16581b;
            }
            g10 = this.n.g(j10 - j11, n, this.D.e().f16678a);
        } else {
            g10 = false;
        }
        this.S = g10;
        if (g10) {
            e0 e0Var2 = this.H.f16604j;
            long j12 = this.f16794a0;
            k8.a.f(e0Var2.g());
            e0Var2.f16559a.b(j12 - e0Var2.f16571o);
        }
        l0();
    }
}
