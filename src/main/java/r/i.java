package r;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public b f14572a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f14573b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    public float[] f14574c = new float[10];
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public String f14575e;

    public float a(float f10) {
        return (float) this.f14572a.b(f10, 0);
    }

    public void b(int i10, float f10) {
        int[] iArr = this.f14573b;
        if (iArr.length < this.d + 1) {
            this.f14573b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f14574c;
            this.f14574c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f14573b;
        int i11 = this.d;
        iArr2[i11] = i10;
        this.f14574c[i11] = f10;
        this.d = i11 + 1;
    }

    public void c(int i10) {
        int i11;
        int i12 = this.d;
        if (i12 == 0) {
            return;
        }
        int[] iArr = this.f14573b;
        float[] fArr = this.f14574c;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i12 - 1;
        iArr2[1] = 0;
        int i13 = 2;
        while (i13 > 0) {
            int i14 = i13 - 1;
            int i15 = iArr2[i14];
            i13 = i14 - 1;
            int i16 = iArr2[i13];
            if (i15 < i16) {
                int i17 = iArr[i16];
                int i18 = i15;
                int i19 = i18;
                while (i18 < i16) {
                    if (iArr[i18] <= i17) {
                        int i20 = iArr[i19];
                        iArr[i19] = iArr[i18];
                        iArr[i18] = i20;
                        float f10 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = f10;
                        i19++;
                    }
                    i18++;
                }
                int i21 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i21;
                float f11 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = f11;
                int i22 = i13 + 1;
                iArr2[i13] = i19 - 1;
                int i23 = i22 + 1;
                iArr2[i22] = i15;
                int i24 = i23 + 1;
                iArr2[i23] = i16;
                i13 = i24 + 1;
                iArr2[i24] = i19 + 1;
            }
        }
        int i25 = 1;
        for (int i26 = 1; i26 < this.d; i26++) {
            int[] iArr3 = this.f14573b;
            if (iArr3[i26 - 1] != iArr3[i26]) {
                i25++;
            }
        }
        double[] dArr = new double[i25];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i25, 1);
        int i27 = 0;
        while (i11 < this.d) {
            if (i11 > 0) {
                int[] iArr4 = this.f14573b;
                i11 = iArr4[i11] == iArr4[i11 + (-1)] ? i11 + 1 : 0;
            }
            dArr[i27] = this.f14573b[i11] * 0.01d;
            dArr2[i27][0] = this.f14574c[i11];
            i27++;
        }
        this.f14572a = b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f14575e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.d; i10++) {
            StringBuilder l10 = android.support.v4.media.a.l(str, "[");
            l10.append(this.f14573b[i10]);
            l10.append(" , ");
            l10.append(decimalFormat.format(this.f14574c[i10]));
            l10.append("] ");
            str = l10.toString();
        }
        return str;
    }
}
