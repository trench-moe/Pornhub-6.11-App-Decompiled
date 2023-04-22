package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.i;
import java.io.IOException;
import java.util.Objects;
import k8.c0;
import w6.u0;
import x7.b;

/* loaded from: classes.dex */
public final class f implements h, h.a {

    /* renamed from: c  reason: collision with root package name */
    public final i.a f6316c;

    /* renamed from: f  reason: collision with root package name */
    public final long f6317f;

    /* renamed from: j  reason: collision with root package name */
    public final j8.i f6318j;

    /* renamed from: m  reason: collision with root package name */
    public i f6319m;
    public h n;

    /* renamed from: t  reason: collision with root package name */
    public h.a f6320t;

    /* renamed from: u  reason: collision with root package name */
    public a f6321u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6322w;
    public long y = -9223372036854775807L;

    /* loaded from: classes.dex */
    public interface a {
    }

    public f(i.a aVar, j8.i iVar, long j10) {
        this.f6316c = aVar;
        this.f6318j = iVar;
        this.f6317f = j10;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long a() {
        h hVar = this.n;
        int i10 = c0.f11939a;
        return hVar.a();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean b(long j10) {
        h hVar = this.n;
        return hVar != null && hVar.b(j10);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean c() {
        h hVar = this.n;
        return hVar != null && hVar.c();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long d() {
        h hVar = this.n;
        int i10 = c0.f11939a;
        return hVar.d();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void e(long j10) {
        h hVar = this.n;
        int i10 = c0.f11939a;
        hVar.e(j10);
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public void f(h hVar) {
        h.a aVar = this.f6320t;
        int i10 = c0.f11939a;
        aVar.f(this);
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void g(h hVar) {
        h.a aVar = this.f6320t;
        int i10 = c0.f11939a;
        aVar.g(this);
        if (this.f6321u != null) {
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long h(long j10, u0 u0Var) {
        h hVar = this.n;
        int i10 = c0.f11939a;
        return hVar.h(j10, u0Var);
    }

    public void i(i.a aVar) {
        long j10 = this.f6317f;
        long j11 = this.y;
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        i iVar = this.f6319m;
        Objects.requireNonNull(iVar);
        h a10 = iVar.a(aVar, this.f6318j, j10);
        this.n = a10;
        if (this.f6320t != null) {
            a10.n(this, j10);
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x001f -> B:15:0x0020). Please submit an issue!!! */
    @Override // com.google.android.exoplayer2.source.h
    public void j() {
        h hVar;
        try {
            hVar = this.n;
        } catch (IOException e10) {
            a aVar = this.f6321u;
            if (aVar == null) {
                throw e10;
            }
            if (!this.f6322w) {
                this.f6322w = true;
                Objects.requireNonNull((b.a) aVar);
                i.a aVar2 = x7.b.f18061j;
                throw null;
            }
        }
        if (hVar != null) {
            hVar.j();
            return;
        }
        i iVar = this.f6319m;
        if (iVar != null) {
            iVar.i();
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long k(long j10) {
        h hVar = this.n;
        int i10 = c0.f11939a;
        return hVar.k(j10);
    }

    public void l() {
        if (this.n != null) {
            i iVar = this.f6319m;
            Objects.requireNonNull(iVar);
            iVar.k(this.n);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long m() {
        h hVar = this.n;
        int i10 = c0.f11939a;
        return hVar.m();
    }

    @Override // com.google.android.exoplayer2.source.h
    public void n(h.a aVar, long j10) {
        this.f6320t = aVar;
        h hVar = this.n;
        if (hVar != null) {
            long j11 = this.f6317f;
            long j12 = this.y;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            hVar.n(this, j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public w7.o o() {
        h hVar = this.n;
        int i10 = c0.f11939a;
        return hVar.o();
    }

    @Override // com.google.android.exoplayer2.source.h
    public long p(i8.f[] fVarArr, boolean[] zArr, w7.j[] jVarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.y;
        if (j12 == -9223372036854775807L || j10 != this.f6317f) {
            j11 = j10;
        } else {
            this.y = -9223372036854775807L;
            j11 = j12;
        }
        h hVar = this.n;
        int i10 = c0.f11939a;
        return hVar.p(fVarArr, zArr, jVarArr, zArr2, j11);
    }

    public void q(i iVar) {
        k8.a.f(this.f6319m == null);
        this.f6319m = iVar;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void s(long j10, boolean z10) {
        h hVar = this.n;
        int i10 = c0.f11939a;
        hVar.s(j10, z10);
    }
}
