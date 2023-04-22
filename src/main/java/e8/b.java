package e8;

import java.util.Collections;
import java.util.List;
import k8.c0;
import y7.d;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c  reason: collision with root package name */
    public final y7.a[] f9144c;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f9145f;

    public b(y7.a[] aVarArr, long[] jArr) {
        this.f9144c = aVarArr;
        this.f9145f = jArr;
    }

    @Override // y7.d
    public int b(long j10) {
        int b10 = c0.b(this.f9145f, j10, false, false);
        if (b10 < this.f9145f.length) {
            return b10;
        }
        return -1;
    }

    @Override // y7.d
    public long c(int i10) {
        boolean z10 = true;
        k8.a.c(i10 >= 0);
        if (i10 >= this.f9145f.length) {
            z10 = false;
        }
        k8.a.c(z10);
        return this.f9145f[i10];
    }

    @Override // y7.d
    public List<y7.a> d(long j10) {
        int e10 = c0.e(this.f9145f, j10, true, false);
        if (e10 != -1) {
            y7.a[] aVarArr = this.f9144c;
            if (aVarArr[e10] != y7.a.f18511r) {
                return Collections.singletonList(aVarArr[e10]);
            }
        }
        return Collections.emptyList();
    }

    @Override // y7.d
    public int e() {
        return this.f9145f.length;
    }
}
