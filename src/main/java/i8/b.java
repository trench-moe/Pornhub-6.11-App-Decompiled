package i8;

import java.util.Arrays;
import java.util.Objects;
import w6.y;
import w7.n;

/* loaded from: classes2.dex */
public abstract class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final n f10583a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10584b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f10585c;
    public final y[] d;

    /* renamed from: e  reason: collision with root package name */
    public int f10586e;

    public b(n nVar, int[] iArr, int i10) {
        k8.a.f(iArr.length > 0);
        Objects.requireNonNull(nVar);
        this.f10583a = nVar;
        int length = iArr.length;
        this.f10584b = length;
        this.d = new y[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.d[i11] = nVar.f16941f[iArr[i11]];
        }
        Arrays.sort(this.d, u7.d.f15621f);
        this.f10585c = new int[this.f10584b];
        int i12 = 0;
        while (true) {
            int i13 = this.f10584b;
            if (i12 >= i13) {
                long[] jArr = new long[i13];
                return;
            }
            int[] iArr2 = this.f10585c;
            y yVar = this.d[i12];
            int i14 = 0;
            while (true) {
                y[] yVarArr = nVar.f16941f;
                if (i14 >= yVarArr.length) {
                    i14 = -1;
                    break;
                } else if (yVar == yVarArr[i14]) {
                    break;
                } else {
                    i14++;
                }
            }
            iArr2[i12] = i14;
            i12++;
        }
    }

    @Override // i8.i
    public final n a() {
        return this.f10583a;
    }

    @Override // i8.i
    public final y b(int i10) {
        return this.d[i10];
    }

    @Override // i8.i
    public final int c(int i10) {
        return this.f10585c[i10];
    }

    @Override // i8.i
    public final int d(y yVar) {
        for (int i10 = 0; i10 < this.f10584b; i10++) {
            if (this.d[i10] == yVar) {
                return i10;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            return this.f10583a == bVar.f10583a && Arrays.equals(this.f10585c, bVar.f10585c);
        }
        return false;
    }

    @Override // i8.f
    public void h() {
    }

    public int hashCode() {
        if (this.f10586e == 0) {
            this.f10586e = Arrays.hashCode(this.f10585c) + (System.identityHashCode(this.f10583a) * 31);
        }
        return this.f10586e;
    }

    @Override // i8.f
    public /* synthetic */ void j(boolean z10) {
    }

    @Override // i8.f
    public void k() {
    }

    @Override // i8.f
    public final y l() {
        return this.d[i()];
    }

    @Override // i8.i
    public final int length() {
        return this.f10585c.length;
    }

    @Override // i8.f
    public void m(float f10) {
    }

    @Override // i8.f
    public /* synthetic */ void n() {
    }

    @Override // i8.f
    public /* synthetic */ void o() {
    }
}
