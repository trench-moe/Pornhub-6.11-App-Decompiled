package k8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public int f11976a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f11977b = new long[32];

    public void a(long j10) {
        int i10 = this.f11976a;
        long[] jArr = this.f11977b;
        if (i10 == jArr.length) {
            this.f11977b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f11977b;
        int i11 = this.f11976a;
        this.f11976a = i11 + 1;
        jArr2[i11] = j10;
    }

    public long b(int i10) {
        if (i10 < 0 || i10 >= this.f11976a) {
            throw new IndexOutOfBoundsException(a1.a.h(46, "Invalid index ", i10, ", size is ", this.f11976a));
        }
        return this.f11977b[i10];
    }
}
