package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.h;
import java.util.Objects;
import k8.c0;
import w6.u0;

/* loaded from: classes.dex */
public final class b implements h, h.a {

    /* renamed from: c  reason: collision with root package name */
    public final h f6287c;

    /* renamed from: f  reason: collision with root package name */
    public h.a f6288f;

    /* renamed from: j  reason: collision with root package name */
    public a[] f6289j = new a[0];

    /* renamed from: m  reason: collision with root package name */
    public long f6290m;
    public long n;

    /* renamed from: t  reason: collision with root package name */
    public long f6291t;

    /* loaded from: classes.dex */
    public final class a implements w7.j {

        /* renamed from: c  reason: collision with root package name */
        public final w7.j f6292c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f6293f;

        public a(w7.j jVar) {
            this.f6292c = jVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
            if (r14.f6109m == false) goto L32;
         */
        @Override // w7.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(w6.z r13, com.google.android.exoplayer2.decoder.DecoderInputBuffer r14, int r15) {
            /*
                r12 = this;
                com.google.android.exoplayer2.source.b r0 = com.google.android.exoplayer2.source.b.this
                java.lang.String r11 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                boolean r10 = r0.i()
                r0 = r10
                r1 = -3
                if (r0 == 0) goto Ld
                return r1
            Ld:
                r11 = 3
                boolean r0 = r12.f6293f
                r2 = 4
                r3 = -4
                r11 = 4
                if (r0 == 0) goto L1a
                r11 = 1
                r14.f21800c = r2
                r11 = 1
                return r3
            L1a:
                w7.j r0 = r12.f6292c
                int r15 = r0.a(r13, r14, r15)
                r0 = -5
                r11 = 1
                r4 = -9223372036854775808
                if (r15 != r0) goto L65
                java.lang.Object r14 = r13.f16897f
                w6.y r14 = (w6.y) r14
                r11 = 3
                java.util.Objects.requireNonNull(r14)
                int r15 = r14.R
                r11 = 3
                if (r15 != 0) goto L39
                r11 = 1
                int r1 = r14.S
                if (r1 == 0) goto L63
                r11 = 3
            L39:
                com.google.android.exoplayer2.source.b r1 = com.google.android.exoplayer2.source.b.this
                long r2 = r1.n
                r11 = 3
                r6 = 0
                r10 = 0
                r8 = r10
                int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                r11 = 2
                if (r9 == 0) goto L49
                r15 = 0
                r11 = 3
            L49:
                r11 = 6
                long r1 = r1.f6291t
                int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r3 == 0) goto L51
                goto L54
            L51:
                int r8 = r14.S
                r11 = 1
            L54:
                w6.y$b r14 = r14.a()
                r14.A = r15
                r14.B = r8
                w6.y r14 = r14.a()
                r13.f16897f = r14
                r11 = 2
            L63:
                r11 = 7
                return r0
            L65:
                com.google.android.exoplayer2.source.b r13 = com.google.android.exoplayer2.source.b.this
                r11 = 3
                long r6 = r13.f6291t
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                r11 = 1
                if (r0 == 0) goto L97
                r11 = 6
                if (r15 != r3) goto L7b
                r11 = 5
                long r8 = r14.n
                r11 = 4
                int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r0 >= 0) goto L8b
                r11 = 5
            L7b:
                r11 = 3
                if (r15 != r1) goto L97
                r11 = 4
                long r0 = r13.d()
                int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r13 != 0) goto L97
                boolean r13 = r14.f6109m
                if (r13 != 0) goto L97
            L8b:
                r11 = 1
                r14.l()
                r14.f21800c = r2
                r11 = 3
                r10 = 1
                r13 = r10
                r12.f6293f = r13
                return r3
            L97:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.a.a(w6.z, com.google.android.exoplayer2.decoder.DecoderInputBuffer, int):int");
        }

        @Override // w7.j
        public void b() {
            this.f6292c.b();
        }

        @Override // w7.j
        public int c(long j10) {
            if (b.this.i()) {
                return -3;
            }
            return this.f6292c.c(j10);
        }

        @Override // w7.j
        public boolean f() {
            return !b.this.i() && this.f6292c.f();
        }
    }

    public b(h hVar, boolean z10, long j10, long j11) {
        this.f6287c = hVar;
        this.f6290m = z10 ? j10 : -9223372036854775807L;
        this.n = j10;
        this.f6291t = j11;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long a() {
        long a10 = this.f6287c.a();
        if (a10 != Long.MIN_VALUE) {
            long j10 = this.f6291t;
            if (j10 == Long.MIN_VALUE || a10 < j10) {
                return a10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean b(long j10) {
        return this.f6287c.b(j10);
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean c() {
        return this.f6287c.c();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long d() {
        long d = this.f6287c.d();
        if (d != Long.MIN_VALUE) {
            long j10 = this.f6291t;
            if (j10 == Long.MIN_VALUE || d < j10) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void e(long j10) {
        this.f6287c.e(j10);
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public void f(h hVar) {
        h.a aVar = this.f6288f;
        Objects.requireNonNull(aVar);
        aVar.f(this);
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void g(h hVar) {
        h.a aVar = this.f6288f;
        Objects.requireNonNull(aVar);
        aVar.g(this);
    }

    @Override // com.google.android.exoplayer2.source.h
    public long h(long j10, u0 u0Var) {
        long j11 = this.n;
        if (j10 == j11) {
            return j11;
        }
        long i10 = c0.i(u0Var.f16747a, 0L, j10 - j11);
        long j12 = u0Var.f16748b;
        long j13 = this.f6291t;
        long i11 = c0.i(j12, 0L, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        if (i10 != u0Var.f16747a || i11 != u0Var.f16748b) {
            u0Var = new u0(i10, i11);
        }
        return this.f6287c.h(j10, u0Var);
    }

    public boolean i() {
        return this.f6290m != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void j() {
        this.f6287c.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0 > r11) goto L18;
     */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long k(long r11) {
        /*
            r10 = this;
            r6 = r10
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f6290m = r0
            r9 = 5
            com.google.android.exoplayer2.source.b$a[] r0 = r6.f6289j
            int r1 = r0.length
            r9 = 0
            r2 = r9
            r9 = 0
            r3 = r9
        L10:
            if (r3 >= r1) goto L1e
            r4 = r0[r3]
            r8 = 3
            if (r4 == 0) goto L1b
            r9 = 6
            r4.f6293f = r2
            r8 = 3
        L1b:
            int r3 = r3 + 1
            goto L10
        L1e:
            r8 = 7
            com.google.android.exoplayer2.source.h r0 = r6.f6287c
            long r0 = r0.k(r11)
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 == 0) goto L3f
            r8 = 3
            long r11 = r6.n
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            r9 = 4
            if (r3 < 0) goto L41
            r9 = 2
            long r11 = r6.f6291t
            r3 = -9223372036854775808
            r8 = 4
            int r5 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r5 == 0) goto L3f
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 > 0) goto L41
        L3f:
            r8 = 1
            r2 = r8
        L41:
            k8.a.f(r2)
            r9 = 6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.k(long):long");
    }

    @Override // com.google.android.exoplayer2.source.h
    public long m() {
        if (i()) {
            long j10 = this.f6290m;
            this.f6290m = -9223372036854775807L;
            long m10 = m();
            return m10 != -9223372036854775807L ? m10 : j10;
        }
        long m11 = this.f6287c.m();
        if (m11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        k8.a.f(m11 >= this.n);
        long j11 = this.f6291t;
        if (j11 != Long.MIN_VALUE) {
            if (m11 <= j11) {
                k8.a.f(z10);
                return m11;
            }
            z10 = false;
        }
        k8.a.f(z10);
        return m11;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void n(h.a aVar, long j10) {
        this.f6288f = aVar;
        this.f6287c.n(this, j10);
    }

    @Override // com.google.android.exoplayer2.source.h
    public w7.o o() {
        return this.f6287c.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
        if (r1 > r5) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    @Override // com.google.android.exoplayer2.source.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long p(i8.f[] r16, boolean[] r17, w7.j[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.b.p(i8.f[], boolean[], w7.j[], boolean[], long):long");
    }

    @Override // com.google.android.exoplayer2.source.h
    public void s(long j10, boolean z10) {
        this.f6287c.s(j10, z10);
    }
}
