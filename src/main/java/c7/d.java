package c7;

import c7.u;
import k8.c0;

/* loaded from: classes.dex */
public class d implements u {

    /* renamed from: a  reason: collision with root package name */
    public final long f3790a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3791b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3792c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3793e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3794f;

    public d(long j10, long j11, int i10, int i11) {
        this.f3790a = j10;
        this.f3791b = j11;
        this.f3792c = i11 == -1 ? 1 : i11;
        this.f3793e = i10;
        if (j10 == -1) {
            this.d = -1L;
            this.f3794f = -9223372036854775807L;
            return;
        }
        this.d = j10 - j11;
        this.f3794f = c(j10, j11, i10);
    }

    public static long c(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    public long a(long j10) {
        return c(j10, this.f3791b, this.f3793e);
    }

    @Override // c7.u
    public boolean d() {
        return this.d != -1;
    }

    @Override // c7.u
    public u.a i(long j10) {
        long j11 = this.d;
        if (j11 == -1) {
            return new u.a(new v(0L, this.f3791b));
        }
        long j12 = this.f3792c;
        long i10 = this.f3791b + c0.i((((this.f3793e * j10) / 8000000) / j12) * j12, 0L, j11 - j12);
        long a10 = a(i10);
        v vVar = new v(a10, i10);
        if (a10 < j10) {
            int i11 = this.f3792c;
            if (i11 + i10 < this.f3790a) {
                long j13 = i10 + i11;
                return new u.a(vVar, new v(a(j13), j13));
            }
        }
        return new u.a(vVar);
    }

    @Override // c7.u
    public long j() {
        return this.f3794f;
    }
}
