package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import c7.t;
import c7.u;
import c7.w;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.e;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.upstream.Loader;
import j8.r;
import j8.s;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k8.c0;
import kotlin.jvm.internal.IntCompanionObject;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import w6.u0;
import w6.y;
import w6.z;

/* loaded from: classes.dex */
public final class m implements h, c7.j, Loader.b<a>, Loader.f, p.d {

    /* renamed from: c0  reason: collision with root package name */
    public static final Map<String, String> f6351c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final y f6352d0;
    public final l B;
    public h.a G;
    public s7.b H;
    public boolean K;
    public boolean L;
    public boolean M;
    public e N;
    public u O;
    public boolean Q;
    public boolean S;
    public boolean T;
    public int U;
    public long W;
    public boolean Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6353a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6354b0;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f6355c;

    /* renamed from: f  reason: collision with root package name */
    public final j8.f f6356f;

    /* renamed from: j  reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.d f6357j;

    /* renamed from: m  reason: collision with root package name */
    public final r f6358m;
    public final j.a n;

    /* renamed from: t  reason: collision with root package name */
    public final c.a f6359t;

    /* renamed from: u  reason: collision with root package name */
    public final b f6360u;

    /* renamed from: w  reason: collision with root package name */
    public final j8.i f6361w;
    public final String y;

    /* renamed from: z  reason: collision with root package name */
    public final long f6362z;
    public final Loader A = new Loader("ProgressiveMediaPeriod");
    public final k8.d C = new k8.d();
    public final Runnable D = new u.a(this, 3);
    public final Runnable E = new j1.p(this, 4);
    public final Handler F = c0.j();
    public d[] J = new d[0];
    public p[] I = new p[0];
    public long X = -9223372036854775807L;
    public long V = -1;
    public long P = -9223372036854775807L;
    public int R = 1;

    /* loaded from: classes.dex */
    public final class a implements Loader.e, e.a {

        /* renamed from: b  reason: collision with root package name */
        public final Uri f6364b;

        /* renamed from: c  reason: collision with root package name */
        public final s f6365c;
        public final l d;

        /* renamed from: e  reason: collision with root package name */
        public final c7.j f6366e;

        /* renamed from: f  reason: collision with root package name */
        public final k8.d f6367f;

        /* renamed from: h  reason: collision with root package name */
        public volatile boolean f6369h;

        /* renamed from: j  reason: collision with root package name */
        public long f6371j;

        /* renamed from: m  reason: collision with root package name */
        public w f6374m;
        public boolean n;

        /* renamed from: g  reason: collision with root package name */
        public final t f6368g = new t();

        /* renamed from: i  reason: collision with root package name */
        public boolean f6370i = true;

        /* renamed from: l  reason: collision with root package name */
        public long f6373l = -1;

        /* renamed from: a  reason: collision with root package name */
        public final long f6363a = w7.c.a();

        /* renamed from: k  reason: collision with root package name */
        public j8.h f6372k = c(0);

        public a(Uri uri, j8.f fVar, l lVar, c7.j jVar, k8.d dVar) {
            this.f6364b = uri;
            this.f6365c = new s(fVar);
            this.d = lVar;
            this.f6366e = jVar;
            this.f6367f = dVar;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            j8.d dVar;
            int i10;
            int i11 = 0;
            while (i11 == 0 && !this.f6369h) {
                try {
                    long j10 = this.f6368g.f3828a;
                    j8.h c10 = c(j10);
                    this.f6372k = c10;
                    long j11 = this.f6365c.j(c10);
                    this.f6373l = j11;
                    if (j11 != -1) {
                        this.f6373l = j11 + j10;
                    }
                    m.this.H = s7.b.a(this.f6365c.k());
                    s sVar = this.f6365c;
                    s7.b bVar = m.this.H;
                    if (bVar == null || (i10 = bVar.f14921t) == -1) {
                        dVar = sVar;
                    } else {
                        dVar = new com.google.android.exoplayer2.source.e(sVar, i10, this);
                        m mVar = m.this;
                        Objects.requireNonNull(mVar);
                        w A = mVar.A(new d(0, true));
                        this.f6374m = A;
                        ((p) A).d(m.f6352d0);
                    }
                    long j12 = j10;
                    ((l6.r) this.d).c(dVar, this.f6364b, this.f6365c.k(), j10, this.f6373l, this.f6366e);
                    if (m.this.H != null) {
                        Object obj = ((l6.r) this.d).f12310f;
                        if (((c7.h) obj) instanceof i7.d) {
                            ((i7.d) ((c7.h) obj)).f10567r = true;
                        }
                    }
                    if (this.f6370i) {
                        l lVar = this.d;
                        long j13 = this.f6371j;
                        c7.h hVar = (c7.h) ((l6.r) lVar).f12310f;
                        Objects.requireNonNull(hVar);
                        hVar.g(j12, j13);
                        this.f6370i = false;
                    }
                    while (true) {
                        long j14 = j12;
                        while (i11 == 0 && !this.f6369h) {
                            try {
                                k8.d dVar2 = this.f6367f;
                                synchronized (dVar2) {
                                    while (!dVar2.f11950a) {
                                        dVar2.wait();
                                    }
                                }
                                l lVar2 = this.d;
                                t tVar = this.f6368g;
                                l6.r rVar = (l6.r) lVar2;
                                c7.h hVar2 = (c7.h) rVar.f12310f;
                                Objects.requireNonNull(hVar2);
                                c7.i iVar = (c7.i) rVar.f12311j;
                                Objects.requireNonNull(iVar);
                                i11 = hVar2.h(iVar, tVar);
                                j12 = ((l6.r) this.d).a();
                                if (j12 > m.this.f6362z + j14) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f6367f.a();
                        m mVar2 = m.this;
                        mVar2.F.post(mVar2.E);
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (((l6.r) this.d).a() != -1) {
                        this.f6368g.f3828a = ((l6.r) this.d).a();
                    }
                    s sVar2 = this.f6365c;
                    if (sVar2 != null) {
                        try {
                            sVar2.f11647a.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (i11 != 1 && ((l6.r) this.d).a() != -1) {
                        this.f6368g.f3828a = ((l6.r) this.d).a();
                    }
                    s sVar3 = this.f6365c;
                    int i12 = c0.f11939a;
                    if (sVar3 != null) {
                        try {
                            sVar3.f11647a.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
            this.f6369h = true;
        }

        public final j8.h c(long j10) {
            Collections.emptyMap();
            Uri uri = this.f6364b;
            String str = m.this.y;
            Map<String, String> map = m.f6351c0;
            k8.a.h(uri, "The uri must be set.");
            return new j8.h(uri, 0L, 1, null, map, j10, -1L, str, 6, null);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public final class c implements w7.j {

        /* renamed from: c  reason: collision with root package name */
        public final int f6376c;

        public c(int i10) {
            this.f6376c = i10;
        }

        @Override // w7.j
        public int a(z zVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            int i11;
            m mVar = m.this;
            int i12 = this.f6376c;
            if (mVar.C()) {
                return -3;
            }
            mVar.y(i12);
            p pVar = mVar.I[i12];
            boolean z10 = mVar.f6353a0;
            boolean z11 = (i10 & 2) != 0;
            p.b bVar = pVar.f6409b;
            synchronized (pVar) {
                decoderInputBuffer.f6109m = false;
                i11 = -5;
                if (pVar.n()) {
                    y yVar = pVar.f6410c.b(pVar.j()).f6434a;
                    if (!z11 && yVar == pVar.f6414h) {
                        int k10 = pVar.k(pVar.f6425t);
                        if (pVar.p(k10)) {
                            decoderInputBuffer.f21800c = pVar.n[k10];
                            long j10 = pVar.f6420o[k10];
                            decoderInputBuffer.n = j10;
                            if (j10 < pVar.f6426u) {
                                decoderInputBuffer.f(IntCompanionObject.MIN_VALUE);
                            }
                            bVar.f6431a = pVar.f6419m[k10];
                            bVar.f6432b = pVar.f6418l[k10];
                            bVar.f6433c = pVar.f6421p[k10];
                            i11 = -4;
                        } else {
                            decoderInputBuffer.f6109m = true;
                            i11 = -3;
                        }
                    }
                    pVar.q(yVar, zVar);
                } else {
                    if (!z10 && !pVar.f6429x) {
                        y yVar2 = pVar.A;
                        if (yVar2 == null || (!z11 && yVar2 == pVar.f6414h)) {
                            i11 = -3;
                        } else {
                            pVar.q(yVar2, zVar);
                        }
                    }
                    decoderInputBuffer.f21800c = 4;
                    i11 = -4;
                }
            }
            if (i11 == -4 && !decoderInputBuffer.j()) {
                boolean z12 = (i10 & 1) != 0;
                if ((i10 & 4) == 0) {
                    if (z12) {
                        o oVar = pVar.f6408a;
                        o.f(oVar.f6401e, decoderInputBuffer, pVar.f6409b, oVar.f6400c);
                    } else {
                        o oVar2 = pVar.f6408a;
                        oVar2.f6401e = o.f(oVar2.f6401e, decoderInputBuffer, pVar.f6409b, oVar2.f6400c);
                    }
                }
                if (!z12) {
                    pVar.f6425t++;
                }
            }
            if (i11 == -3) {
                mVar.z(i12);
            }
            return i11;
        }

        @Override // w7.j
        public void b() {
            m mVar = m.this;
            p pVar = mVar.I[this.f6376c];
            DrmSession drmSession = pVar.f6415i;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException error = pVar.f6415i.getError();
                Objects.requireNonNull(error);
                throw error;
            }
            mVar.A.c(((com.google.android.exoplayer2.upstream.a) mVar.f6358m).a(mVar.R));
        }

        /* JADX WARN: Finally extract failed */
        @Override // w7.j
        public int c(long j10) {
            int i10;
            m mVar = m.this;
            int i11 = this.f6376c;
            boolean z10 = false;
            if (mVar.C()) {
                return 0;
            }
            mVar.y(i11);
            p pVar = mVar.I[i11];
            boolean z11 = mVar.f6353a0;
            synchronized (pVar) {
                try {
                    int k10 = pVar.k(pVar.f6425t);
                    if (pVar.n() && j10 >= pVar.f6420o[k10]) {
                        if (j10 <= pVar.f6428w || !z11) {
                            i10 = pVar.h(k10, pVar.f6422q - pVar.f6425t, j10, true);
                            if (i10 == -1) {
                                i10 = 0;
                            }
                        } else {
                            i10 = pVar.f6422q - pVar.f6425t;
                        }
                    }
                    i10 = 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (pVar) {
                if (i10 >= 0) {
                    try {
                        if (pVar.f6425t + i10 <= pVar.f6422q) {
                            z10 = true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                k8.a.c(z10);
                pVar.f6425t += i10;
            }
            if (i10 == 0) {
                mVar.z(i11);
            }
            return i10;
        }

        @Override // w7.j
        public boolean f() {
            m mVar = m.this;
            return !mVar.C() && mVar.I[this.f6376c].o(mVar.f6353a0);
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f6378a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6379b;

        public d(int i10, boolean z10) {
            this.f6378a = i10;
            this.f6379b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                return this.f6378a == dVar.f6378a && this.f6379b == dVar.f6379b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f6378a * 31) + (this.f6379b ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final w7.o f6380a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f6381b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean[] f6382c;
        public final boolean[] d;

        public e(w7.o oVar, boolean[] zArr) {
            this.f6380a = oVar;
            this.f6381b = zArr;
            int i10 = oVar.f16944c;
            this.f6382c = new boolean[i10];
            this.d = new boolean[i10];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f6351c0 = Collections.unmodifiableMap(hashMap);
        y.b bVar = new y.b();
        bVar.f16870a = "icy";
        bVar.f16879k = "application/x-icy";
        f6352d0 = bVar.a();
    }

    public m(Uri uri, j8.f fVar, l lVar, com.google.android.exoplayer2.drm.d dVar, c.a aVar, r rVar, j.a aVar2, b bVar, j8.i iVar, String str, int i10) {
        this.f6355c = uri;
        this.f6356f = fVar;
        this.f6357j = dVar;
        this.f6359t = aVar;
        this.f6358m = rVar;
        this.n = aVar2;
        this.f6360u = bVar;
        this.f6361w = iVar;
        this.y = str;
        this.f6362z = i10;
        this.B = lVar;
    }

    public final w A(d dVar) {
        int length = this.I.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.J[i10])) {
                return this.I[i10];
            }
        }
        j8.i iVar = this.f6361w;
        Looper looper = this.F.getLooper();
        com.google.android.exoplayer2.drm.d dVar2 = this.f6357j;
        c.a aVar = this.f6359t;
        Objects.requireNonNull(looper);
        Objects.requireNonNull(dVar2);
        Objects.requireNonNull(aVar);
        p pVar = new p(iVar, looper, dVar2, aVar);
        pVar.f6413g = this;
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.J, i11);
        dVarArr[length] = dVar;
        int i12 = c0.f11939a;
        this.J = dVarArr;
        p[] pVarArr = (p[]) Arrays.copyOf(this.I, i11);
        pVarArr[length] = pVar;
        this.I = pVarArr;
        return pVar;
    }

    public final void B() {
        a aVar = new a(this.f6355c, this.f6356f, this.B, this, this.C);
        if (this.L) {
            k8.a.f(w());
            long j10 = this.P;
            if (j10 != -9223372036854775807L && this.X > j10) {
                this.f6353a0 = true;
                this.X = -9223372036854775807L;
                return;
            }
            u uVar = this.O;
            Objects.requireNonNull(uVar);
            long j11 = uVar.i(this.X).f3829a.f3835b;
            long j12 = this.X;
            aVar.f6368g.f3828a = j11;
            aVar.f6371j = j12;
            aVar.f6370i = true;
            aVar.n = false;
            for (p pVar : this.I) {
                pVar.f6426u = this.X;
            }
            this.X = -9223372036854775807L;
        }
        this.Z = u();
        this.n.j(new w7.c(aVar.f6363a, aVar.f6372k, this.A.e(aVar, this, ((com.google.android.exoplayer2.upstream.a) this.f6358m).a(this.R))), 1, -1, null, 0, null, aVar.f6371j, this.P);
    }

    public final boolean C() {
        if (!this.T && !w()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long a() {
        if (this.U == 0) {
            return Long.MIN_VALUE;
        }
        return d();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean b(long j10) {
        if (!this.f6353a0) {
            if (!(this.A.f6700c != null) && !this.Y && (!this.L || this.U != 0)) {
                boolean b10 = this.C.b();
                if (this.A.b()) {
                    return b10;
                }
                B();
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean c() {
        boolean z10;
        if (this.A.b()) {
            k8.d dVar = this.C;
            synchronized (dVar) {
                try {
                    z10 = dVar.f11950a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long d() {
        long j10;
        boolean z10;
        long j11;
        t();
        boolean[] zArr = this.N.f6381b;
        if (this.f6353a0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.X;
        }
        if (this.M) {
            int length = this.I.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10]) {
                    p pVar = this.I[i10];
                    synchronized (pVar) {
                        try {
                            z10 = pVar.f6429x;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!z10) {
                        p pVar2 = this.I[i10];
                        synchronized (pVar2) {
                            j11 = pVar2.f6428w;
                        }
                        j10 = Math.min(j10, j11);
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = v();
        }
        return j10 == Long.MIN_VALUE ? this.W : j10;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void e(long j10) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void f(a aVar, long j10, long j11, boolean z10) {
        a aVar2 = aVar;
        s sVar = aVar2.f6365c;
        w7.c cVar = new w7.c(aVar2.f6363a, aVar2.f6372k, sVar.f11649c, sVar.d, j10, j11, sVar.f11648b);
        Objects.requireNonNull(this.f6358m);
        this.n.d(cVar, 1, -1, null, 0, null, aVar2.f6371j, this.P);
        if (z10) {
            return;
        }
        if (this.V == -1) {
            this.V = aVar2.f6373l;
        }
        for (p pVar : this.I) {
            pVar.r(false);
        }
        if (this.U > 0) {
            h.a aVar3 = this.G;
            Objects.requireNonNull(aVar3);
            aVar3.f(this);
        }
    }

    @Override // c7.j
    public void g(u uVar) {
        this.F.post(new r6.c(this, uVar, 3));
    }

    @Override // com.google.android.exoplayer2.source.h
    public long h(long j10, u0 u0Var) {
        t();
        if (this.O.d()) {
            u.a i10 = this.O.i(j10);
            long j11 = i10.f3829a.f3834a;
            long j12 = i10.f3830b.f3834a;
            long j13 = u0Var.f16747a;
            if (j13 == 0 && u0Var.f16748b == 0) {
                return j10;
            }
            int i11 = c0.f11939a;
            long j14 = j10 - j13;
            long j15 = ((j13 ^ j10) & (j10 ^ j14)) >= 0 ? j14 : Long.MIN_VALUE;
            long j16 = u0Var.f16748b;
            long j17 = j10 + j16;
            long j18 = ((j16 ^ j17) & (j10 ^ j17)) >= 0 ? j17 : Long.MAX_VALUE;
            boolean z10 = false;
            boolean z11 = j15 <= j11 && j11 <= j18;
            if (j15 <= j12 && j12 <= j18) {
                z10 = true;
            }
            if (z11 && z10) {
                if (Math.abs(j11 - j10) <= Math.abs(j12 - j10)) {
                    return j11;
                }
            } else if (z11) {
                return j11;
            } else {
                if (!z10) {
                    return j15;
                }
            }
            return j12;
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    public void i(a aVar, long j10, long j11) {
        u uVar;
        a aVar2 = aVar;
        if (this.P == -9223372036854775807L && (uVar = this.O) != null) {
            boolean d10 = uVar.d();
            long v2 = v();
            long j12 = v2 == Long.MIN_VALUE ? 0L : v2 + 10000;
            this.P = j12;
            ((n) this.f6360u).v(j12, d10, this.Q);
        }
        s sVar = aVar2.f6365c;
        w7.c cVar = new w7.c(aVar2.f6363a, aVar2.f6372k, sVar.f11649c, sVar.d, j10, j11, sVar.f11648b);
        Objects.requireNonNull(this.f6358m);
        this.n.f(cVar, 1, -1, null, 0, null, aVar2.f6371j, this.P);
        if (this.V == -1) {
            this.V = aVar2.f6373l;
        }
        this.f6353a0 = true;
        h.a aVar3 = this.G;
        Objects.requireNonNull(aVar3);
        aVar3.f(this);
    }

    @Override // com.google.android.exoplayer2.source.h
    public void j() {
        this.A.c(((com.google.android.exoplayer2.upstream.a) this.f6358m).a(this.R));
        if (this.f6353a0 && !this.L) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long k(long j10) {
        boolean z10;
        t();
        boolean[] zArr = this.N.f6381b;
        if (!this.O.d()) {
            j10 = 0;
        }
        this.T = false;
        this.W = j10;
        if (w()) {
            this.X = j10;
            return j10;
        }
        if (this.R != 7) {
            int length = this.I.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.I[i10].t(j10, false) || (!zArr[i10] && this.M)) {
                }
                z10 = false;
                break;
            }
            z10 = true;
            if (z10) {
                return j10;
            }
        }
        this.Y = false;
        this.X = j10;
        this.f6353a0 = false;
        if (this.A.b()) {
            for (p pVar : this.I) {
                pVar.g();
            }
            Loader.d<? extends Loader.e> dVar = this.A.f6699b;
            k8.a.g(dVar);
            dVar.a(false);
        } else {
            this.A.f6700c = null;
            for (p pVar2 : this.I) {
                pVar2.r(false);
            }
        }
        return j10;
    }

    @Override // c7.j
    public void l() {
        this.K = true;
        this.F.post(this.D);
    }

    @Override // com.google.android.exoplayer2.source.h
    public long m() {
        if (!this.T || (!this.f6353a0 && u() <= this.Z)) {
            return -9223372036854775807L;
        }
        this.T = false;
        return this.W;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void n(h.a aVar, long j10) {
        this.G = aVar;
        this.C.b();
        B();
    }

    @Override // com.google.android.exoplayer2.source.h
    public w7.o o() {
        t();
        return this.N.f6380a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r14 != 0) goto L20;
     */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long p(i8.f[] r10, boolean[] r11, w7.j[] r12, boolean[] r13, long r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.m.p(i8.f[], boolean[], w7.j[], boolean[], long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.upstream.Loader.c q(com.google.android.exoplayer2.source.m.a r26, long r27, long r29, java.io.IOException r31, int r32) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.m.q(com.google.android.exoplayer2.upstream.Loader$e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$c");
    }

    @Override // c7.j
    public w r(int i10, int i11) {
        return A(new d(i10, false));
    }

    @Override // com.google.android.exoplayer2.source.h
    public void s(long j10, boolean z10) {
        long j11;
        int i10;
        t();
        if (w()) {
            return;
        }
        boolean[] zArr = this.N.f6382c;
        int length = this.I.length;
        for (int i11 = 0; i11 < length; i11++) {
            p pVar = this.I[i11];
            boolean z11 = zArr[i11];
            o oVar = pVar.f6408a;
            synchronized (pVar) {
                int i12 = pVar.f6422q;
                j11 = -1;
                if (i12 != 0) {
                    long[] jArr = pVar.f6420o;
                    int i13 = pVar.f6424s;
                    if (j10 >= jArr[i13]) {
                        int h10 = pVar.h(i13, (!z11 || (i10 = pVar.f6425t) == i12) ? i12 : i10 + 1, j10, z10);
                        if (h10 != -1) {
                            j11 = pVar.f(h10);
                        }
                    }
                }
            }
            oVar.a(j11);
        }
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void t() {
        k8.a.f(this.L);
        Objects.requireNonNull(this.N);
        Objects.requireNonNull(this.O);
    }

    public final int u() {
        int i10 = 0;
        for (p pVar : this.I) {
            i10 += pVar.m();
        }
        return i10;
    }

    public final long v() {
        p[] pVarArr;
        long j10;
        long j11 = Long.MIN_VALUE;
        for (p pVar : this.I) {
            synchronized (pVar) {
                j10 = pVar.f6428w;
            }
            j11 = Math.max(j11, j10);
        }
        return j11;
    }

    public final boolean w() {
        return this.X != -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.m.x():void");
    }

    public final void y(int i10) {
        t();
        e eVar = this.N;
        boolean[] zArr = eVar.d;
        if (!zArr[i10]) {
            y yVar = eVar.f6380a.f16945f[i10].f16941f[0];
            this.n.b(k8.p.g(yVar.B), yVar, 0, null, this.W);
            zArr[i10] = true;
        }
    }

    public final void z(int i10) {
        t();
        boolean[] zArr = this.N.f6381b;
        if (this.Y && zArr[i10]) {
            if (this.I[i10].o(false)) {
                return;
            }
            this.X = 0L;
            this.Y = false;
            this.T = true;
            this.W = 0L;
            this.Z = 0;
            for (p pVar : this.I) {
                pVar.r(false);
            }
            h.a aVar = this.G;
            Objects.requireNonNull(aVar);
            aVar.f(this);
        }
    }
}
