package w9;

import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkh;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p7 {

    /* renamed from: f  reason: collision with root package name */
    public static final p7 f17276f = new p7(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f17277a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f17278b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f17279c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17280e;

    public p7() {
        this(0, new int[8], new Object[8], true);
    }

    public p7(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.d = -1;
        this.f17277a = i10;
        this.f17278b = iArr;
        this.f17279c = objArr;
        this.f17280e = z10;
    }

    public static p7 b() {
        return new p7(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int l02;
        int m02;
        int l03;
        int i10 = this.d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f17277a; i12++) {
                int i13 = this.f17278b[i12];
                int i14 = i13 >>> 3;
                int i15 = i13 & 7;
                if (i15 != 0) {
                    if (i15 == 1) {
                        ((Long) this.f17279c[i12]).longValue();
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3) + 8;
                    } else if (i15 == 2) {
                        int l04 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                        int g10 = ((zzix) this.f17279c[i12]).g();
                        i11 = com.google.android.gms.internal.measurement.e.l0(g10) + g10 + l04 + i11;
                    } else if (i15 == 3) {
                        int H0 = com.google.android.gms.internal.measurement.e.H0(i14);
                        l02 = H0 + H0;
                        m02 = ((p7) this.f17279c[i12]).a();
                    } else if (i15 != 5) {
                        int i16 = zzkh.f7076c;
                        throw new IllegalStateException(new zzkg());
                    } else {
                        ((Integer) this.f17279c[i12]).intValue();
                        l03 = com.google.android.gms.internal.measurement.e.l0(i14 << 3) + 4;
                    }
                    i11 = l03 + i11;
                } else {
                    long longValue = ((Long) this.f17279c[i12]).longValue();
                    l02 = com.google.android.gms.internal.measurement.e.l0(i14 << 3);
                    m02 = com.google.android.gms.internal.measurement.e.m0(longValue);
                }
                i11 = m02 + l02 + i11;
            }
            this.d = i11;
            return i11;
        }
        return i10;
    }

    public final void c(int i10, Object obj) {
        if (!this.f17280e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f17277a;
        int[] iArr = this.f17278b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f17278b = Arrays.copyOf(iArr, i12);
            this.f17279c = Arrays.copyOf(this.f17279c, i12);
        }
        int[] iArr2 = this.f17278b;
        int i13 = this.f17277a;
        iArr2[i13] = i10;
        this.f17279c[i13] = obj;
        this.f17277a = i13 + 1;
    }

    public final void d(f5 f5Var) {
        if (this.f17277a != 0) {
            for (int i10 = 0; i10 < this.f17277a; i10++) {
                int i11 = this.f17278b[i10];
                Object obj = this.f17279c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    f5Var.f17135a.A0(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    f5Var.f17135a.s0(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    f5Var.f17135a.p0(i12, (zzix) obj);
                } else if (i13 == 3) {
                    f5Var.f17135a.x0(i12, 3);
                    ((p7) obj).d(f5Var);
                    f5Var.f17135a.x0(i12, 4);
                } else if (i13 != 5) {
                    int i14 = zzkh.f7076c;
                    throw new RuntimeException(new zzkg());
                } else {
                    f5Var.f17135a.q0(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p7)) {
            p7 p7Var = (p7) obj;
            int i10 = this.f17277a;
            if (i10 == p7Var.f17277a) {
                int[] iArr = this.f17278b;
                int[] iArr2 = p7Var.f17278b;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        Object[] objArr = this.f17279c;
                        Object[] objArr2 = p7Var.f17279c;
                        int i12 = this.f17277a;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (objArr[i13].equals(objArr2[i13])) {
                            }
                        }
                        return true;
                    } else if (iArr[i11] != iArr2[i11]) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f17277a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f17278b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f17279c;
        int i16 = this.f17277a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
