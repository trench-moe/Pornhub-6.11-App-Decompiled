package i7;

import c7.u;
import c7.v;
import k8.c0;

/* loaded from: classes2.dex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long f10573a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10574b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10575c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10576e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f10577f;

    public g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f10573a = j10;
        this.f10574b = i10;
        this.f10575c = j11;
        this.f10577f = jArr;
        this.d = j12;
        this.f10576e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // i7.e
    public long b() {
        return this.f10576e;
    }

    @Override // c7.u
    public boolean d() {
        return this.f10577f != null;
    }

    @Override // i7.e
    public long e(long j10) {
        long j11 = j10 - this.f10573a;
        if (!d() || j11 <= this.f10574b) {
            return 0L;
        }
        long[] jArr = this.f10577f;
        k8.a.g(jArr);
        double d = (j11 * 256.0d) / this.d;
        int e10 = c0.e(jArr, (long) d, true, true);
        long j12 = this.f10575c;
        long j13 = (e10 * j12) / 100;
        long j14 = jArr[e10];
        int i10 = e10 + 1;
        long j15 = (j12 * i10) / 100;
        long j16 = e10 == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // c7.u
    public u.a i(long j10) {
        long[] jArr;
        if (d()) {
            long i10 = c0.i(j10, 0L, this.f10575c);
            double d = (i10 * 100.0d) / this.f10575c;
            double d10 = 0.0d;
            if (d > 0.0d) {
                if (d >= 100.0d) {
                    d10 = 256.0d;
                } else {
                    int i11 = (int) d;
                    long[] jArr2 = this.f10577f;
                    k8.a.g(jArr2);
                    double d11 = jArr2[i11];
                    d10 = d11 + (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d11) * (d - i11));
                }
            }
            return new u.a(new v(i10, this.f10573a + c0.i(Math.round((d10 / 256.0d) * this.d), this.f10574b, this.d - 1)));
        }
        return new u.a(new v(0L, this.f10573a + this.f10574b));
    }

    @Override // c7.u
    public long j() {
        return this.f10575c;
    }
}
