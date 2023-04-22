package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.m;
import j8.f;
import j8.r;
import j8.t;
import java.util.Objects;
import w6.c0;
import w6.x0;

/* loaded from: classes.dex */
public final class n extends com.google.android.exoplayer2.source.a implements m.b {

    /* renamed from: g  reason: collision with root package name */
    public final c0 f6383g;

    /* renamed from: h  reason: collision with root package name */
    public final c0.g f6384h;

    /* renamed from: i  reason: collision with root package name */
    public final f.a f6385i;

    /* renamed from: j  reason: collision with root package name */
    public final l.a f6386j;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.d f6387k;

    /* renamed from: l  reason: collision with root package name */
    public final r f6388l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6389m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public long f6390o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6391p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6392q;

    /* renamed from: r  reason: collision with root package name */
    public t f6393r;

    /* loaded from: classes.dex */
    public class a extends w7.b {
        public a(x0 x0Var) {
            super(x0Var);
        }

        @Override // w7.b, w6.x0
        public x0.b g(int i10, x0.b bVar, boolean z10) {
            super.g(i10, bVar, z10);
            bVar.f16843f = true;
            return bVar;
        }

        @Override // w7.b, w6.x0
        public x0.c o(int i10, x0.c cVar, long j10) {
            super.o(i10, cVar, j10);
            cVar.f16857l = true;
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements w7.i {

        /* renamed from: a  reason: collision with root package name */
        public final f.a f6394a;

        /* renamed from: b  reason: collision with root package name */
        public l.a f6395b;

        /* renamed from: c  reason: collision with root package name */
        public b7.d f6396c;
        public r d;

        /* renamed from: e  reason: collision with root package name */
        public int f6397e;

        public b(f.a aVar, c7.l lVar) {
            g4.g gVar = new g4.g(lVar);
            this.f6394a = aVar;
            this.f6395b = gVar;
            this.f6396c = new com.google.android.exoplayer2.drm.a();
            this.d = new com.google.android.exoplayer2.upstream.a();
            this.f6397e = 1048576;
        }

        @Override // w7.i
        public i a(c0 c0Var) {
            com.google.android.exoplayer2.drm.d dVar;
            Objects.requireNonNull(c0Var.f16453b);
            Object obj = c0Var.f16453b.f16502h;
            f.a aVar = this.f6394a;
            l.a aVar2 = this.f6395b;
            com.google.android.exoplayer2.drm.a aVar3 = (com.google.android.exoplayer2.drm.a) this.f6396c;
            Objects.requireNonNull(aVar3);
            Objects.requireNonNull(c0Var.f16453b);
            c0.e eVar = c0Var.f16453b.f16498c;
            if (eVar == null || k8.c0.f11939a < 18) {
                dVar = com.google.android.exoplayer2.drm.d.f6186a;
            } else {
                synchronized (aVar3.f6170a) {
                    if (!k8.c0.a(eVar, aVar3.f6171b)) {
                        aVar3.f6171b = eVar;
                        aVar3.f6172c = aVar3.a(eVar);
                    }
                    dVar = aVar3.f6172c;
                    Objects.requireNonNull(dVar);
                }
            }
            return new n(c0Var, aVar, aVar2, dVar, this.d, this.f6397e, null);
        }
    }

    public n(c0 c0Var, f.a aVar, l.a aVar2, com.google.android.exoplayer2.drm.d dVar, r rVar, int i10, a aVar3) {
        c0.g gVar = c0Var.f16453b;
        Objects.requireNonNull(gVar);
        this.f6384h = gVar;
        this.f6383g = c0Var;
        this.f6385i = aVar;
        this.f6386j = aVar2;
        this.f6387k = dVar;
        this.f6388l = rVar;
        this.f6389m = i10;
        this.n = true;
        this.f6390o = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.i
    public h a(i.a aVar, j8.i iVar, long j10) {
        j8.f a10 = this.f6385i.a();
        t tVar = this.f6393r;
        if (tVar != null) {
            a10.n(tVar);
        }
        return new m(this.f6384h.f16496a, a10, new l6.r((c7.l) ((g4.g) this.f6386j).f9736c), this.f6387k, this.d.g(0, aVar), this.f6388l, this.f6284c.l(0, aVar, 0L), this, iVar, this.f6384h.f16500f, this.f6389m);
    }

    @Override // com.google.android.exoplayer2.source.i
    public c0 f() {
        return this.f6383g;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void i() {
    }

    @Override // com.google.android.exoplayer2.source.i
    public void k(h hVar) {
        p[] pVarArr;
        m mVar = (m) hVar;
        if (mVar.L) {
            for (p pVar : mVar.I) {
                pVar.g();
                DrmSession drmSession = pVar.f6415i;
                if (drmSession != null) {
                    drmSession.b(pVar.f6411e);
                    pVar.f6415i = null;
                    pVar.f6414h = null;
                }
            }
        }
        mVar.A.d(mVar);
        mVar.F.removeCallbacksAndMessages(null);
        mVar.G = null;
        mVar.f6354b0 = true;
    }

    @Override // com.google.android.exoplayer2.source.a
    public void r(t tVar) {
        this.f6393r = tVar;
        this.f6387k.f();
        u();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void t() {
        this.f6387k.a();
    }

    public final void u() {
        x0 lVar = new w7.l(this.f6390o, this.f6391p, false, this.f6392q, null, this.f6383g);
        if (this.n) {
            lVar = new a(lVar);
        }
        s(lVar);
    }

    public void v(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.f6390o;
        }
        if (!this.n && this.f6390o == j10 && this.f6391p == z10 && this.f6392q == z11) {
            return;
        }
        this.f6390o = j10;
        this.f6391p = z10;
        this.f6392q = z11;
        this.n = false;
        u();
    }
}
