package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.i;
import j8.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import w6.c0;
import w6.x0;

/* loaded from: classes.dex */
public final class ClippingMediaSource extends c<Void> {

    /* renamed from: j  reason: collision with root package name */
    public final i f6259j;

    /* renamed from: k  reason: collision with root package name */
    public final long f6260k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6261l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f6262m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6263o;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<b> f6264p;

    /* renamed from: q  reason: collision with root package name */
    public final x0.c f6265q;

    /* renamed from: r  reason: collision with root package name */
    public a f6266r;

    /* renamed from: s  reason: collision with root package name */
    public IllegalClippingException f6267s;

    /* renamed from: t  reason: collision with root package name */
    public long f6268t;

    /* renamed from: u  reason: collision with root package name */
    public long f6269u;

    /* loaded from: classes.dex */
    public static final class IllegalClippingException extends IOException {
        public final int reason;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public IllegalClippingException(int r4) {
            /*
                r3 = this;
                if (r4 == 0) goto L11
                r0 = 1
                if (r4 == r0) goto Le
                r0 = 2
                if (r4 == r0) goto Lb
                java.lang.String r0 = "unknown"
                goto L13
            Lb:
                java.lang.String r0 = "start exceeds end"
                goto L13
            Le:
                java.lang.String r0 = "not seekable to start"
                goto L13
            L11:
                java.lang.String r0 = "invalid period count"
            L13:
                int r1 = r0.length()
                java.lang.String r2 = "Illegal clipping: "
                if (r1 == 0) goto L20
                java.lang.String r0 = r2.concat(r0)
                goto L25
            L20:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r2)
            L25:
                r3.<init>(r0)
                r3.reason = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException.<init>(int):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends w7.b {

        /* renamed from: c  reason: collision with root package name */
        public final long f6270c;
        public final long d;

        /* renamed from: e  reason: collision with root package name */
        public final long f6271e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f6272f;

        public a(x0 x0Var, long j10, long j11) {
            super(x0Var);
            boolean z10 = true;
            if (x0Var.i() != 1) {
                throw new IllegalClippingException(0);
            }
            x0.c n = x0Var.n(0, new x0.c());
            long max = Math.max(0L, j10);
            if (!n.f16857l && max != 0 && !n.f16853h) {
                throw new IllegalClippingException(1);
            }
            long max2 = j11 == Long.MIN_VALUE ? n.n : Math.max(0L, j11);
            long j12 = n.n;
            int i10 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
            if (i10 != 0) {
                max2 = max2 > j12 ? j12 : max2;
                if (max > max2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f6270c = max;
            this.d = max2;
            int i11 = (max2 > (-9223372036854775807L) ? 1 : (max2 == (-9223372036854775807L) ? 0 : -1));
            this.f6271e = i11 != 0 ? max2 - max : -9223372036854775807L;
            if (!n.f16854i || (i11 != 0 && (i10 == 0 || max2 != j12))) {
                z10 = false;
            }
            this.f6272f = z10;
        }

        @Override // w7.b, w6.x0
        public x0.b g(int i10, x0.b bVar, boolean z10) {
            this.f16903b.g(0, bVar, z10);
            long j10 = bVar.f16842e - this.f6270c;
            long j11 = this.f6271e;
            bVar.f(bVar.f16839a, bVar.f16840b, 0, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - j10, j10, x7.a.f18048g, false);
            return bVar;
        }

        @Override // w7.b, w6.x0
        public x0.c o(int i10, x0.c cVar, long j10) {
            this.f16903b.o(0, cVar, 0L);
            long j11 = cVar.f16861q;
            long j12 = this.f6270c;
            cVar.f16861q = j11 + j12;
            cVar.n = this.f6271e;
            cVar.f16854i = this.f6272f;
            long j13 = cVar.f16858m;
            if (j13 != -9223372036854775807L) {
                long max = Math.max(j13, j12);
                cVar.f16858m = max;
                long j14 = this.d;
                if (j14 != -9223372036854775807L) {
                    max = Math.min(max, j14);
                }
                cVar.f16858m = max;
                cVar.f16858m = max - this.f6270c;
            }
            long c10 = w6.g.c(this.f6270c);
            long j15 = cVar.f16850e;
            if (j15 != -9223372036854775807L) {
                cVar.f16850e = j15 + c10;
            }
            long j16 = cVar.f16851f;
            if (j16 != -9223372036854775807L) {
                cVar.f16851f = j16 + c10;
            }
            return cVar;
        }
    }

    public ClippingMediaSource(i iVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
        k8.a.c(j10 >= 0);
        Objects.requireNonNull(iVar);
        this.f6259j = iVar;
        this.f6260k = j10;
        this.f6261l = j11;
        this.f6262m = z10;
        this.n = z11;
        this.f6263o = z12;
        this.f6264p = new ArrayList<>();
        this.f6265q = new x0.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public h a(i.a aVar, j8.i iVar, long j10) {
        b bVar = new b(this.f6259j.a(aVar, iVar, j10), this.f6262m, this.f6268t, this.f6269u);
        this.f6264p.add(bVar);
        return bVar;
    }

    @Override // com.google.android.exoplayer2.source.i
    public c0 f() {
        return this.f6259j.f();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.i
    public void i() {
        IllegalClippingException illegalClippingException = this.f6267s;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.i();
    }

    @Override // com.google.android.exoplayer2.source.i
    public void k(h hVar) {
        k8.a.f(this.f6264p.remove(hVar));
        this.f6259j.k(((b) hVar).f6287c);
        if (!this.f6264p.isEmpty() || this.n) {
            return;
        }
        a aVar = this.f6266r;
        Objects.requireNonNull(aVar);
        x(aVar.f16903b);
    }

    @Override // com.google.android.exoplayer2.source.a
    public void r(t tVar) {
        this.f6297i = tVar;
        this.f6296h = k8.c0.j();
        w(null, this.f6259j);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void t() {
        super.t();
        this.f6267s = null;
        this.f6266r = null;
    }

    @Override // com.google.android.exoplayer2.source.c
    public void v(Void r42, i iVar, x0 x0Var) {
        if (this.f6267s != null) {
            return;
        }
        x(x0Var);
    }

    public final void x(x0 x0Var) {
        long j10;
        long j11;
        long j12;
        x0Var.n(0, this.f6265q);
        long j13 = this.f6265q.f16861q;
        if (this.f6266r == null || this.f6264p.isEmpty() || this.n) {
            long j14 = this.f6260k;
            long j15 = this.f6261l;
            if (this.f6263o) {
                long j16 = this.f6265q.f16858m;
                j14 += j16;
                j10 = j16 + j15;
            } else {
                j10 = j15;
            }
            this.f6268t = j13 + j14;
            this.f6269u = j15 != Long.MIN_VALUE ? j13 + j10 : Long.MIN_VALUE;
            int size = this.f6264p.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = this.f6264p.get(i10);
                long j17 = this.f6268t;
                long j18 = this.f6269u;
                bVar.n = j17;
                bVar.f6291t = j18;
            }
            j11 = j14;
            j12 = j10;
        } else {
            long j19 = this.f6268t - j13;
            j12 = this.f6261l != Long.MIN_VALUE ? this.f6269u - j13 : Long.MIN_VALUE;
            j11 = j19;
        }
        try {
            a aVar = new a(x0Var, j11, j12);
            this.f6266r = aVar;
            s(aVar);
        } catch (IllegalClippingException e10) {
            this.f6267s = e10;
        }
    }
}
