package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Objects;
import w6.u0;
import w6.z;

/* loaded from: classes.dex */
public final class k implements h, h.a {

    /* renamed from: c  reason: collision with root package name */
    public final h[] f6339c;

    /* renamed from: f  reason: collision with root package name */
    public final IdentityHashMap<w7.j, Integer> f6340f;

    /* renamed from: j  reason: collision with root package name */
    public final a0.b f6341j;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<h> f6342m = new ArrayList<>();
    public h.a n;

    /* renamed from: t  reason: collision with root package name */
    public w7.o f6343t;

    /* renamed from: u  reason: collision with root package name */
    public h[] f6344u;

    /* renamed from: w  reason: collision with root package name */
    public q f6345w;

    /* loaded from: classes.dex */
    public static final class a implements h, h.a {

        /* renamed from: c  reason: collision with root package name */
        public final h f6346c;

        /* renamed from: f  reason: collision with root package name */
        public final long f6347f;

        /* renamed from: j  reason: collision with root package name */
        public h.a f6348j;

        public a(h hVar, long j10) {
            this.f6346c = hVar;
            this.f6347f = j10;
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public long a() {
            long a10 = this.f6346c.a();
            if (a10 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f6347f + a10;
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public boolean b(long j10) {
            return this.f6346c.b(j10 - this.f6347f);
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public boolean c() {
            return this.f6346c.c();
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public long d() {
            long d = this.f6346c.d();
            if (d == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f6347f + d;
        }

        @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
        public void e(long j10) {
            this.f6346c.e(j10 - this.f6347f);
        }

        @Override // com.google.android.exoplayer2.source.q.a
        public void f(h hVar) {
            h.a aVar = this.f6348j;
            Objects.requireNonNull(aVar);
            aVar.f(this);
        }

        @Override // com.google.android.exoplayer2.source.h.a
        public void g(h hVar) {
            h.a aVar = this.f6348j;
            Objects.requireNonNull(aVar);
            aVar.g(this);
        }

        @Override // com.google.android.exoplayer2.source.h
        public long h(long j10, u0 u0Var) {
            return this.f6346c.h(j10 - this.f6347f, u0Var) + this.f6347f;
        }

        @Override // com.google.android.exoplayer2.source.h
        public void j() {
            this.f6346c.j();
        }

        @Override // com.google.android.exoplayer2.source.h
        public long k(long j10) {
            return this.f6346c.k(j10 - this.f6347f) + this.f6347f;
        }

        @Override // com.google.android.exoplayer2.source.h
        public long m() {
            long m10 = this.f6346c.m();
            if (m10 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f6347f + m10;
        }

        @Override // com.google.android.exoplayer2.source.h
        public void n(h.a aVar, long j10) {
            this.f6348j = aVar;
            this.f6346c.n(this, j10 - this.f6347f);
        }

        @Override // com.google.android.exoplayer2.source.h
        public w7.o o() {
            return this.f6346c.o();
        }

        @Override // com.google.android.exoplayer2.source.h
        public long p(i8.f[] fVarArr, boolean[] zArr, w7.j[] jVarArr, boolean[] zArr2, long j10) {
            w7.j[] jVarArr2 = new w7.j[jVarArr.length];
            int i10 = 0;
            while (true) {
                w7.j jVar = null;
                if (i10 >= jVarArr.length) {
                    break;
                }
                b bVar = (b) jVarArr[i10];
                if (bVar != null) {
                    jVar = bVar.f6349c;
                }
                jVarArr2[i10] = jVar;
                i10++;
            }
            long p10 = this.f6346c.p(fVarArr, zArr, jVarArr2, zArr2, j10 - this.f6347f);
            for (int i11 = 0; i11 < jVarArr.length; i11++) {
                w7.j jVar2 = jVarArr2[i11];
                if (jVar2 == null) {
                    jVarArr[i11] = null;
                } else if (jVarArr[i11] == null || ((b) jVarArr[i11]).f6349c != jVar2) {
                    jVarArr[i11] = new b(jVar2, this.f6347f);
                }
            }
            return p10 + this.f6347f;
        }

        @Override // com.google.android.exoplayer2.source.h
        public void s(long j10, boolean z10) {
            this.f6346c.s(j10 - this.f6347f, z10);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements w7.j {

        /* renamed from: c  reason: collision with root package name */
        public final w7.j f6349c;

        /* renamed from: f  reason: collision with root package name */
        public final long f6350f;

        public b(w7.j jVar, long j10) {
            this.f6349c = jVar;
            this.f6350f = j10;
        }

        @Override // w7.j
        public int a(z zVar, DecoderInputBuffer decoderInputBuffer, int i10) {
            int a10 = this.f6349c.a(zVar, decoderInputBuffer, i10);
            if (a10 == -4) {
                decoderInputBuffer.n = Math.max(0L, decoderInputBuffer.n + this.f6350f);
            }
            return a10;
        }

        @Override // w7.j
        public void b() {
            this.f6349c.b();
        }

        @Override // w7.j
        public int c(long j10) {
            return this.f6349c.c(j10 - this.f6350f);
        }

        @Override // w7.j
        public boolean f() {
            return this.f6349c.f();
        }
    }

    public k(a0.b bVar, long[] jArr, h... hVarArr) {
        this.f6341j = bVar;
        this.f6339c = hVarArr;
        Objects.requireNonNull(bVar);
        this.f6345w = new k2.c(new q[0], 5);
        this.f6340f = new IdentityHashMap<>();
        this.f6344u = new h[0];
        for (int i10 = 0; i10 < hVarArr.length; i10++) {
            if (jArr[i10] != 0) {
                this.f6339c[i10] = new a(hVarArr[i10], jArr[i10]);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long a() {
        return this.f6345w.a();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean b(long j10) {
        if (this.f6342m.isEmpty()) {
            return this.f6345w.b(j10);
        }
        int size = this.f6342m.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6342m.get(i10).b(j10);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public boolean c() {
        return this.f6345w.c();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public long d() {
        return this.f6345w.d();
    }

    @Override // com.google.android.exoplayer2.source.h, com.google.android.exoplayer2.source.q
    public void e(long j10) {
        this.f6345w.e(j10);
    }

    @Override // com.google.android.exoplayer2.source.q.a
    public void f(h hVar) {
        h.a aVar = this.n;
        Objects.requireNonNull(aVar);
        aVar.f(this);
    }

    @Override // com.google.android.exoplayer2.source.h.a
    public void g(h hVar) {
        this.f6342m.remove(hVar);
        if (this.f6342m.isEmpty()) {
            int i10 = 0;
            for (h hVar2 : this.f6339c) {
                i10 += hVar2.o().f16944c;
            }
            w7.n[] nVarArr = new w7.n[i10];
            int i11 = 0;
            for (h hVar3 : this.f6339c) {
                w7.o o10 = hVar3.o();
                int i12 = o10.f16944c;
                int i13 = 0;
                while (i13 < i12) {
                    nVarArr[i11] = o10.f16945f[i13];
                    i13++;
                    i11++;
                }
            }
            this.f6343t = new w7.o(nVarArr);
            h.a aVar = this.n;
            Objects.requireNonNull(aVar);
            aVar.g(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long h(long j10, u0 u0Var) {
        h[] hVarArr = this.f6344u;
        return (hVarArr.length > 0 ? hVarArr[0] : this.f6339c[0]).h(j10, u0Var);
    }

    @Override // com.google.android.exoplayer2.source.h
    public void j() {
        for (h hVar : this.f6339c) {
            hVar.j();
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long k(long j10) {
        long k10 = this.f6344u[0].k(j10);
        int i10 = 1;
        while (true) {
            h[] hVarArr = this.f6344u;
            if (i10 >= hVarArr.length) {
                return k10;
            }
            if (hVarArr[i10].k(k10) != k10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i10++;
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public long m() {
        h[] hVarArr;
        h[] hVarArr2;
        long j10 = -9223372036854775807L;
        for (h hVar : this.f6344u) {
            long m10 = hVar.m();
            if (m10 != -9223372036854775807L) {
                if (j10 == -9223372036854775807L) {
                    for (h hVar2 : this.f6344u) {
                        if (hVar2 == hVar) {
                            break;
                        } else if (hVar2.k(m10) != m10) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j10 = m10;
                } else if (m10 != j10) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j10 != -9223372036854775807L && hVar.k(j10) != j10) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void n(h.a aVar, long j10) {
        this.n = aVar;
        Collections.addAll(this.f6342m, this.f6339c);
        for (h hVar : this.f6339c) {
            hVar.n(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.source.h
    public w7.o o() {
        w7.o oVar = this.f6343t;
        Objects.requireNonNull(oVar);
        return oVar;
    }

    @Override // com.google.android.exoplayer2.source.h
    public long p(i8.f[] fVarArr, boolean[] zArr, w7.j[] jVarArr, boolean[] zArr2, long j10) {
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (int i10 = 0; i10 < fVarArr.length; i10++) {
            Integer num = jVarArr[i10] == null ? null : this.f6340f.get(jVarArr[i10]);
            iArr[i10] = num == null ? -1 : num.intValue();
            iArr2[i10] = -1;
            if (fVarArr[i10] != null) {
                w7.n a10 = fVarArr[i10].a();
                int i11 = 0;
                while (true) {
                    h[] hVarArr = this.f6339c;
                    if (i11 >= hVarArr.length) {
                        break;
                    } else if (hVarArr[i11].o().a(a10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.f6340f.clear();
        int length = fVarArr.length;
        w7.j[] jVarArr2 = new w7.j[length];
        w7.j[] jVarArr3 = new w7.j[fVarArr.length];
        i8.f[] fVarArr2 = new i8.f[fVarArr.length];
        ArrayList arrayList = new ArrayList(this.f6339c.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.f6339c.length) {
            for (int i13 = 0; i13 < fVarArr.length; i13++) {
                jVarArr3[i13] = iArr[i13] == i12 ? jVarArr[i13] : null;
                fVarArr2[i13] = iArr2[i13] == i12 ? fVarArr[i13] : null;
            }
            int i14 = i12;
            ArrayList arrayList2 = arrayList;
            i8.f[] fVarArr3 = fVarArr2;
            long p10 = this.f6339c[i12].p(fVarArr2, zArr, jVarArr3, zArr2, j11);
            if (i14 == 0) {
                j11 = p10;
            } else if (p10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < fVarArr.length; i15++) {
                if (iArr2[i15] == i14) {
                    w7.j jVar = jVarArr3[i15];
                    Objects.requireNonNull(jVar);
                    jVarArr2[i15] = jVarArr3[i15];
                    this.f6340f.put(jVar, Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    k8.a.f(jVarArr3[i15] == null);
                }
            }
            if (z10) {
                arrayList2.add(this.f6339c[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            fVarArr2 = fVarArr3;
        }
        System.arraycopy(jVarArr2, 0, jVarArr, 0, length);
        h[] hVarArr2 = (h[]) arrayList.toArray(new h[0]);
        this.f6344u = hVarArr2;
        Objects.requireNonNull(this.f6341j);
        this.f6345w = new k2.c(hVarArr2, 5);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.h
    public void s(long j10, boolean z10) {
        for (h hVar : this.f6344u) {
            hVar.s(j10, z10);
        }
    }
}
