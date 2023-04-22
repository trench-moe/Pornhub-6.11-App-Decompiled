package c7;

import c7.u;
import java.util.Arrays;
import k8.c0;

/* loaded from: classes.dex */
public final class c implements u {

    /* renamed from: a  reason: collision with root package name */
    public final int f3785a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f3786b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f3787c;
    public final long[] d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f3788e;

    /* renamed from: f  reason: collision with root package name */
    public final long f3789f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f3786b = iArr;
        this.f3787c = jArr;
        this.d = jArr2;
        this.f3788e = jArr3;
        int length = iArr.length;
        this.f3785a = length;
        if (length > 0) {
            this.f3789f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f3789f = 0L;
        }
    }

    @Override // c7.u
    public boolean d() {
        return true;
    }

    @Override // c7.u
    public u.a i(long j10) {
        int e10 = c0.e(this.f3788e, j10, true, true);
        long[] jArr = this.f3788e;
        long j11 = jArr[e10];
        long[] jArr2 = this.f3787c;
        v vVar = new v(j11, jArr2[e10]);
        if (j11 < j10 && e10 != this.f3785a - 1) {
            int i10 = e10 + 1;
            return new u.a(vVar, new v(jArr[i10], jArr2[i10]));
        }
        return new u.a(vVar);
    }

    @Override // c7.u
    public long j() {
        return this.f3789f;
    }

    public String toString() {
        int i10 = this.f3785a;
        String arrays = Arrays.toString(this.f3786b);
        String arrays2 = Arrays.toString(this.f3787c);
        String arrays3 = Arrays.toString(this.f3788e);
        String arrays4 = Arrays.toString(this.d);
        StringBuilder sb2 = new StringBuilder(a0.a.e(arrays4, a0.a.e(arrays3, a0.a.e(arrays2, a0.a.e(arrays, 71)))));
        sb2.append("ChunkIndex(length=");
        sb2.append(i10);
        sb2.append(", sizes=");
        sb2.append(arrays);
        android.support.v4.media.a.o(sb2, ", offsets=", arrays2, ", timeUs=", arrays3);
        return android.support.v4.media.b.n(sb2, ", durationsUs=", arrays4, ")");
    }
}
