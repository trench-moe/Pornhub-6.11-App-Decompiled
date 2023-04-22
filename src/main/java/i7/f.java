package i7;

import c7.u;
import c7.v;
import k8.c0;

/* loaded from: classes2.dex */
public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f10570a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f10571b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10572c;
    public final long d;

    public f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f10570a = jArr;
        this.f10571b = jArr2;
        this.f10572c = j10;
        this.d = j11;
    }

    @Override // i7.e
    public long b() {
        return this.d;
    }

    @Override // c7.u
    public boolean d() {
        return true;
    }

    @Override // i7.e
    public long e(long j10) {
        return this.f10570a[c0.e(this.f10571b, j10, true, true)];
    }

    @Override // c7.u
    public u.a i(long j10) {
        int e10 = c0.e(this.f10570a, j10, true, true);
        long[] jArr = this.f10570a;
        long j11 = jArr[e10];
        long[] jArr2 = this.f10571b;
        v vVar = new v(j11, jArr2[e10]);
        if (j11 >= j10 || e10 == jArr.length - 1) {
            return new u.a(vVar);
        }
        int i10 = e10 + 1;
        return new u.a(vVar, new v(jArr[i10], jArr2[i10]));
    }

    @Override // c7.u
    public long j() {
        return this.f10572c;
    }
}
