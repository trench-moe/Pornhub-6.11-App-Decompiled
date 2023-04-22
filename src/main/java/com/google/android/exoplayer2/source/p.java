package com.google.android.exoplayer2.source;

import android.os.Looper;
import android.util.Log;
import c7.w;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.source.o;
import java.io.EOFException;
import java.util.Objects;
import k8.c0;
import k8.t;
import w6.y;
import w6.z;

/* loaded from: classes.dex */
public class p implements w {
    public y A;
    public boolean B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final o f6408a;
    public final com.google.android.exoplayer2.drm.d d;

    /* renamed from: e  reason: collision with root package name */
    public final c.a f6411e;

    /* renamed from: f  reason: collision with root package name */
    public final Looper f6412f;

    /* renamed from: g  reason: collision with root package name */
    public d f6413g;

    /* renamed from: h  reason: collision with root package name */
    public y f6414h;

    /* renamed from: i  reason: collision with root package name */
    public DrmSession f6415i;

    /* renamed from: q  reason: collision with root package name */
    public int f6422q;

    /* renamed from: r  reason: collision with root package name */
    public int f6423r;

    /* renamed from: s  reason: collision with root package name */
    public int f6424s;

    /* renamed from: t  reason: collision with root package name */
    public int f6425t;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6429x;

    /* renamed from: b  reason: collision with root package name */
    public final b f6409b = new b();

    /* renamed from: j  reason: collision with root package name */
    public int f6416j = 1000;

    /* renamed from: k  reason: collision with root package name */
    public int[] f6417k = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    public long[] f6418l = new long[1000];

    /* renamed from: o  reason: collision with root package name */
    public long[] f6420o = new long[1000];
    public int[] n = new int[1000];

    /* renamed from: m  reason: collision with root package name */
    public int[] f6419m = new int[1000];

    /* renamed from: p  reason: collision with root package name */
    public w.a[] f6421p = new w.a[1000];

    /* renamed from: c  reason: collision with root package name */
    public final w7.m<c> f6410c = new w7.m<>(r3.a.n);

    /* renamed from: u  reason: collision with root package name */
    public long f6426u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    public long f6427v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    public long f6428w = Long.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6430z = true;
    public boolean y = true;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f6431a;

        /* renamed from: b  reason: collision with root package name */
        public long f6432b;

        /* renamed from: c  reason: collision with root package name */
        public w.a f6433c;
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final y f6434a;

        /* renamed from: b  reason: collision with root package name */
        public final d.b f6435b;

        public c(y yVar, d.b bVar, a aVar) {
            this.f6434a = yVar;
            this.f6435b = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public p(j8.i iVar, Looper looper, com.google.android.exoplayer2.drm.d dVar, c.a aVar) {
        this.f6412f = looper;
        this.d = dVar;
        this.f6411e = aVar;
        this.f6408a = new o(iVar);
    }

    @Override // c7.w
    public void a(t tVar, int i10) {
        c(tVar, i10, 0);
    }

    @Override // c7.w
    public void b(long j10, int i10, int i11, int i12, w.a aVar) {
        d.b bVar;
        int i13 = i10 & 1;
        boolean z10 = i13 != 0;
        if (this.y) {
            if (!z10) {
                return;
            }
            this.y = false;
        }
        long j11 = j10 + 0;
        if (this.B) {
            if (j11 < this.f6426u) {
                return;
            }
            if (i13 == 0) {
                if (!this.C) {
                    String valueOf = String.valueOf(this.A);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 50);
                    sb2.append("Overriding unexpected non-sync sample for format: ");
                    sb2.append(valueOf);
                    Log.w("SampleQueue", sb2.toString());
                    this.C = true;
                }
                i10 |= 1;
            }
        }
        long j12 = (this.f6408a.f6403g - i11) - i12;
        synchronized (this) {
            int i14 = this.f6422q;
            if (i14 > 0) {
                int k10 = k(i14 - 1);
                k8.a.c(this.f6418l[k10] + ((long) this.f6419m[k10]) <= j12);
            }
            this.f6429x = (536870912 & i10) != 0;
            this.f6428w = Math.max(this.f6428w, j11);
            int k11 = k(this.f6422q);
            this.f6420o[k11] = j11;
            this.f6418l[k11] = j12;
            this.f6419m[k11] = i11;
            this.n[k11] = i10;
            this.f6421p[k11] = aVar;
            this.f6417k[k11] = 0;
            if ((this.f6410c.f16938b.size() == 0) || !this.f6410c.c().f6434a.equals(this.A)) {
                com.google.android.exoplayer2.drm.d dVar = this.d;
                if (dVar != null) {
                    Looper looper = this.f6412f;
                    Objects.requireNonNull(looper);
                    bVar = dVar.b(looper, this.f6411e, this.A);
                } else {
                    bVar = d.b.f6187b;
                }
                w7.m<c> mVar = this.f6410c;
                int m10 = m();
                y yVar = this.A;
                Objects.requireNonNull(yVar);
                mVar.a(m10, new c(yVar, bVar, null));
            }
            int i15 = this.f6422q + 1;
            this.f6422q = i15;
            int i16 = this.f6416j;
            if (i15 == i16) {
                int i17 = i16 + 1000;
                int[] iArr = new int[i17];
                long[] jArr = new long[i17];
                long[] jArr2 = new long[i17];
                int[] iArr2 = new int[i17];
                int[] iArr3 = new int[i17];
                w.a[] aVarArr = new w.a[i17];
                int i18 = this.f6424s;
                int i19 = i16 - i18;
                System.arraycopy(this.f6418l, i18, jArr, 0, i19);
                System.arraycopy(this.f6420o, this.f6424s, jArr2, 0, i19);
                System.arraycopy(this.n, this.f6424s, iArr2, 0, i19);
                System.arraycopy(this.f6419m, this.f6424s, iArr3, 0, i19);
                System.arraycopy(this.f6421p, this.f6424s, aVarArr, 0, i19);
                System.arraycopy(this.f6417k, this.f6424s, iArr, 0, i19);
                int i20 = this.f6424s;
                System.arraycopy(this.f6418l, 0, jArr, i19, i20);
                System.arraycopy(this.f6420o, 0, jArr2, i19, i20);
                System.arraycopy(this.n, 0, iArr2, i19, i20);
                System.arraycopy(this.f6419m, 0, iArr3, i19, i20);
                System.arraycopy(this.f6421p, 0, aVarArr, i19, i20);
                System.arraycopy(this.f6417k, 0, iArr, i19, i20);
                this.f6418l = jArr;
                this.f6420o = jArr2;
                this.n = iArr2;
                this.f6419m = iArr3;
                this.f6421p = aVarArr;
                this.f6417k = iArr;
                this.f6424s = 0;
                this.f6416j = i17;
            }
        }
    }

    @Override // c7.w
    public final void c(t tVar, int i10, int i11) {
        o oVar = this.f6408a;
        Objects.requireNonNull(oVar);
        while (i10 > 0) {
            int c10 = oVar.c(i10);
            o.a aVar = oVar.f6402f;
            tVar.e(aVar.d.f11557a, aVar.a(oVar.f6403g), c10);
            i10 -= c10;
            oVar.b(c10);
        }
    }

    @Override // c7.w
    public final void d(y yVar) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            try {
                this.f6430z = false;
                if (!c0.a(yVar, this.A)) {
                    if ((this.f6410c.f16938b.size() == 0) || !this.f6410c.c().f6434a.equals(yVar)) {
                        this.A = yVar;
                    } else {
                        this.A = this.f6410c.c().f6434a;
                    }
                    y yVar2 = this.A;
                    this.B = k8.p.a(yVar2.B, yVar2.y);
                    this.C = false;
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d dVar = this.f6413g;
        if (dVar != null && z10) {
            m mVar = (m) dVar;
            mVar.F.post(mVar.D);
        }
    }

    @Override // c7.w
    public int e(j8.d dVar, int i10, boolean z10) {
        return s(dVar, i10, z10, 0);
    }

    public final long f(int i10) {
        int i11;
        this.f6427v = Math.max(this.f6427v, i(i10));
        this.f6422q -= i10;
        int i12 = this.f6423r + i10;
        this.f6423r = i12;
        int i13 = this.f6424s + i10;
        this.f6424s = i13;
        int i14 = this.f6416j;
        if (i13 >= i14) {
            this.f6424s = i13 - i14;
        }
        int i15 = this.f6425t - i10;
        this.f6425t = i15;
        int i16 = 0;
        if (i15 < 0) {
            this.f6425t = 0;
        }
        w7.m<c> mVar = this.f6410c;
        while (i16 < mVar.f16938b.size() - 1) {
            int i17 = i16 + 1;
            if (i12 < mVar.f16938b.keyAt(i17)) {
                break;
            }
            mVar.f16939c.accept(mVar.f16938b.valueAt(i16));
            mVar.f16938b.removeAt(i16);
            int i18 = mVar.f16937a;
            if (i18 > 0) {
                mVar.f16937a = i18 - 1;
            }
            i16 = i17;
        }
        if (this.f6422q == 0) {
            int i19 = this.f6424s;
            if (i19 == 0) {
                i19 = this.f6416j;
            }
            return this.f6418l[i19 - 1] + this.f6419m[i11];
        }
        return this.f6418l[this.f6424s];
    }

    public final void g() {
        long f10;
        o oVar = this.f6408a;
        synchronized (this) {
            int i10 = this.f6422q;
            f10 = i10 == 0 ? -1L : f(i10);
        }
        oVar.a(f10);
    }

    public final int h(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long[] jArr = this.f6420o;
            if (jArr[i10] > j10) {
                break;
            }
            if (!z10 || (this.n[i10] & 1) != 0) {
                if (jArr[i10] == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f6416j) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final long i(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int k10 = k(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f6420o[k10]);
            if ((this.n[k10] & 1) != 0) {
                break;
            }
            k10--;
            if (k10 == -1) {
                k10 = this.f6416j - 1;
            }
        }
        return j10;
    }

    public final int j() {
        return this.f6423r + this.f6425t;
    }

    public final int k(int i10) {
        int i11 = this.f6424s + i10;
        int i12 = this.f6416j;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final synchronized y l() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f6430z ? null : this.A;
    }

    public final int m() {
        return this.f6423r + this.f6422q;
    }

    public final boolean n() {
        return this.f6425t != this.f6422q;
    }

    public synchronized boolean o(boolean z10) {
        y yVar;
        try {
            boolean z11 = true;
            if (n()) {
                if (this.f6410c.b(j()).f6434a != this.f6414h) {
                    return true;
                }
                return p(k(this.f6425t));
            }
            if (!z10 && !this.f6429x && ((yVar = this.A) == null || yVar == this.f6414h)) {
                z11 = false;
            }
            return z11;
        } finally {
        }
    }

    public final boolean p(int i10) {
        DrmSession drmSession = this.f6415i;
        if (drmSession != null && drmSession.getState() != 4) {
            if ((this.n[i10] & 1073741824) != 0 || !this.f6415i.d()) {
                return false;
            }
        }
        return true;
    }

    public final void q(y yVar, z zVar) {
        y yVar2;
        y yVar3 = this.f6414h;
        boolean z10 = yVar3 == null;
        com.google.android.exoplayer2.drm.b bVar = z10 ? null : yVar3.E;
        this.f6414h = yVar;
        com.google.android.exoplayer2.drm.b bVar2 = yVar.E;
        com.google.android.exoplayer2.drm.d dVar = this.d;
        if (dVar != null) {
            Class<? extends b7.h> d10 = dVar.d(yVar);
            y.b a10 = yVar.a();
            a10.D = d10;
            yVar2 = a10.a();
        } else {
            yVar2 = yVar;
        }
        zVar.f16897f = yVar2;
        zVar.f16896c = this.f6415i;
        if (this.d == null) {
            return;
        }
        if (z10 || !c0.a(bVar, bVar2)) {
            DrmSession drmSession = this.f6415i;
            com.google.android.exoplayer2.drm.d dVar2 = this.d;
            Looper looper = this.f6412f;
            Objects.requireNonNull(looper);
            DrmSession c10 = dVar2.c(looper, this.f6411e, yVar);
            this.f6415i = c10;
            zVar.f16896c = c10;
            if (drmSession != null) {
                drmSession.b(this.f6411e);
            }
        }
    }

    public void r(boolean z10) {
        o oVar = this.f6408a;
        o.a aVar = oVar.d;
        if (aVar.f6406c) {
            o.a aVar2 = oVar.f6402f;
            int i10 = (((int) (aVar2.f6404a - aVar.f6404a)) / oVar.f6399b) + (aVar2.f6406c ? 1 : 0);
            j8.a[] aVarArr = new j8.a[i10];
            int i11 = 0;
            while (i11 < i10) {
                aVarArr[i11] = aVar.d;
                aVar.d = null;
                o.a aVar3 = aVar.f6407e;
                aVar.f6407e = null;
                i11++;
                aVar = aVar3;
            }
            oVar.f6398a.a(aVarArr);
        }
        o.a aVar4 = new o.a(0L, oVar.f6399b);
        oVar.d = aVar4;
        oVar.f6401e = aVar4;
        oVar.f6402f = aVar4;
        oVar.f6403g = 0L;
        oVar.f6398a.c();
        this.f6422q = 0;
        this.f6423r = 0;
        this.f6424s = 0;
        this.f6425t = 0;
        this.y = true;
        this.f6426u = Long.MIN_VALUE;
        this.f6427v = Long.MIN_VALUE;
        this.f6428w = Long.MIN_VALUE;
        this.f6429x = false;
        w7.m<c> mVar = this.f6410c;
        for (int i12 = 0; i12 < mVar.f16938b.size(); i12++) {
            mVar.f16939c.accept(mVar.f16938b.valueAt(i12));
        }
        mVar.f16937a = -1;
        mVar.f16938b.clear();
        if (z10) {
            this.A = null;
            this.f6430z = true;
        }
    }

    public final int s(j8.d dVar, int i10, boolean z10, int i11) {
        o oVar = this.f6408a;
        int c10 = oVar.c(i10);
        o.a aVar = oVar.f6402f;
        int a10 = dVar.a(aVar.d.f11557a, aVar.a(oVar.f6403g), c10);
        if (a10 != -1) {
            oVar.b(a10);
            return a10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final synchronized boolean t(long j10, boolean z10) {
        synchronized (this) {
            this.f6425t = 0;
            o oVar = this.f6408a;
            oVar.f6401e = oVar.d;
        }
        int k10 = k(0);
        if (n() && j10 >= this.f6420o[k10] && (j10 <= this.f6428w || z10)) {
            int h10 = h(k10, this.f6422q - this.f6425t, j10, true);
            if (h10 == -1) {
                return false;
            }
            this.f6426u = j10;
            this.f6425t += h10;
            return true;
        }
        return false;
    }
}
