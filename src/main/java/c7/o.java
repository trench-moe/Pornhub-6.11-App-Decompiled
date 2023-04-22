package c7;

import c7.p;
import c7.u;
import k8.c0;

/* loaded from: classes.dex */
public final class o implements u {

    /* renamed from: a  reason: collision with root package name */
    public final p f3806a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3807b;

    public o(p pVar, long j10) {
        this.f3806a = pVar;
        this.f3807b = j10;
    }

    public final v a(long j10, long j11) {
        return new v((j10 * 1000000) / this.f3806a.f3811e, this.f3807b + j11);
    }

    @Override // c7.u
    public boolean d() {
        return true;
    }

    @Override // c7.u
    public u.a i(long j10) {
        k8.a.g(this.f3806a.f3817k);
        p pVar = this.f3806a;
        p.a aVar = pVar.f3817k;
        long[] jArr = aVar.f3819a;
        long[] jArr2 = aVar.f3820b;
        int e10 = c0.e(jArr, pVar.g(j10), true, false);
        long j11 = 0;
        long j12 = e10 == -1 ? 0L : jArr[e10];
        if (e10 != -1) {
            j11 = jArr2[e10];
        }
        v a10 = a(j12, j11);
        if (a10.f3834a != j10 && e10 != jArr.length - 1) {
            int i10 = e10 + 1;
            return new u.a(a10, a(jArr[i10], jArr2[i10]));
        }
        return new u.a(a10);
    }

    @Override // c7.u
    public long j() {
        return this.f3806a.d();
    }
}
