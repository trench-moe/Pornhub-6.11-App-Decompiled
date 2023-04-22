package i7;

import android.util.Pair;
import c7.u;
import c7.v;
import k8.c0;

/* loaded from: classes2.dex */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f10548a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f10549b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10550c;

    public c(long[] jArr, long[] jArr2, long j10) {
        this.f10548a = jArr;
        this.f10549b = jArr2;
        this.f10550c = j10 == -9223372036854775807L ? w6.g.b(jArr2[jArr2.length - 1]) : j10;
    }

    public static Pair<Long, Long> a(long j10, long[] jArr, long[] jArr2) {
        int e10 = c0.e(jArr, j10, true, true);
        long j11 = jArr[e10];
        long j12 = jArr2[e10];
        int i10 = e10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // i7.e
    public long b() {
        return -1L;
    }

    @Override // c7.u
    public boolean d() {
        return true;
    }

    @Override // i7.e
    public long e(long j10) {
        return w6.g.b(((Long) a(j10, this.f10548a, this.f10549b).second).longValue());
    }

    @Override // c7.u
    public u.a i(long j10) {
        Pair<Long, Long> a10 = a(w6.g.c(c0.i(j10, 0L, this.f10550c)), this.f10549b, this.f10548a);
        return new u.a(new v(w6.g.b(((Long) a10.first).longValue()), ((Long) a10.second).longValue()));
    }

    @Override // c7.u
    public long j() {
        return this.f10550c;
    }
}
