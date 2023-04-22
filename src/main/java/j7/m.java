package j7;

import k8.c0;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final j f11550a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11551b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f11552c;
    public final int[] d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11553e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f11554f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f11555g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11556h;

    public m(j jVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        k8.a.c(iArr.length == jArr2.length);
        k8.a.c(jArr.length == jArr2.length);
        k8.a.c(iArr2.length == jArr2.length);
        this.f11550a = jVar;
        this.f11552c = jArr;
        this.d = iArr;
        this.f11553e = i10;
        this.f11554f = jArr2;
        this.f11555g = iArr2;
        this.f11556h = j10;
        this.f11551b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int e10 = c0.e(this.f11554f, j10, true, false); e10 >= 0; e10--) {
            if ((this.f11555g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int b10 = c0.b(this.f11554f, j10, true, false); b10 < this.f11554f.length; b10++) {
            if ((this.f11555g[b10] & 1) != 0) {
                return b10;
            }
        }
        return -1;
    }
}
