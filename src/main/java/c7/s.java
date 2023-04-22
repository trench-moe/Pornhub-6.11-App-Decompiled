package c7;

import c7.u;
import k8.c0;

/* loaded from: classes.dex */
public final class s implements u {

    /* renamed from: a  reason: collision with root package name */
    public final long[] f3825a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f3826b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3827c;
    public final boolean d;

    public s(long[] jArr, long[] jArr2, long j10) {
        k8.a.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f3825a = jArr;
            this.f3826b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f3825a = jArr3;
            long[] jArr4 = new long[i10];
            this.f3826b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f3827c = j10;
    }

    @Override // c7.u
    public boolean d() {
        return this.d;
    }

    @Override // c7.u
    public u.a i(long j10) {
        if (this.d) {
            int e10 = c0.e(this.f3826b, j10, true, true);
            long[] jArr = this.f3826b;
            long j11 = jArr[e10];
            long[] jArr2 = this.f3825a;
            v vVar = new v(j11, jArr2[e10]);
            if (j11 != j10 && e10 != jArr.length - 1) {
                int i10 = e10 + 1;
                return new u.a(vVar, new v(jArr[i10], jArr2[i10]));
            }
            return new u.a(vVar);
        }
        return new u.a(v.f3833c);
    }

    @Override // c7.u
    public long j() {
        return this.f3827c;
    }
}
