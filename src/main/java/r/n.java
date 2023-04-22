package r;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public b f14596a;

    /* renamed from: e  reason: collision with root package name */
    public int f14599e;

    /* renamed from: f  reason: collision with root package name */
    public String f14600f;

    /* renamed from: i  reason: collision with root package name */
    public long f14603i;

    /* renamed from: b  reason: collision with root package name */
    public int f14597b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int[] f14598c = new int[10];
    public float[][] d = (float[][]) Array.newInstance(float.class, 10, 3);

    /* renamed from: g  reason: collision with root package name */
    public float[] f14601g = new float[3];

    /* renamed from: h  reason: collision with root package name */
    public boolean f14602h = false;

    /* renamed from: j  reason: collision with root package name */
    public float f14604j = Float.NaN;

    public float a(float f10) {
        float abs;
        switch (this.f14597b) {
            case 1:
                return Math.signum(f10 * 6.2831855f);
            case 2:
                abs = Math.abs(f10);
                break;
            case 3:
                return (((f10 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f10 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f10 * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f10 * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f10 * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public void b(int i10, float f10, float f11, int i11, float f12) {
        int[] iArr = this.f14598c;
        int i12 = this.f14599e;
        iArr[i12] = i10;
        float[][] fArr = this.d;
        fArr[i12][0] = f10;
        fArr[i12][1] = f11;
        fArr[i12][2] = f12;
        this.f14597b = Math.max(this.f14597b, i11);
        this.f14599e++;
    }

    public void c(int i10) {
        int i11;
        int i12 = this.f14599e;
        if (i12 == 0) {
            PrintStream printStream = System.err;
            StringBuilder m10 = a1.a.m("Error no points added to ");
            m10.append(this.f14600f);
            printStream.println(m10.toString());
            return;
        }
        int[] iArr = this.f14598c;
        float[][] fArr = this.d;
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
                        float[] fArr2 = fArr[i19];
                        fArr[i19] = fArr[i18];
                        fArr[i18] = fArr2;
                        i19++;
                    }
                    i18++;
                }
                int i21 = iArr[i19];
                iArr[i19] = iArr[i16];
                iArr[i16] = i21;
                float[] fArr3 = fArr[i19];
                fArr[i19] = fArr[i16];
                fArr[i16] = fArr3;
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
        int i26 = 0;
        while (true) {
            int[] iArr3 = this.f14598c;
            if (i25 >= iArr3.length) {
                break;
            }
            if (iArr3[i25] != iArr3[i25 - 1]) {
                i26++;
            }
            i25++;
        }
        if (i26 == 0) {
            i26 = 1;
        }
        double[] dArr = new double[i26];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, i26, 3);
        int i27 = 0;
        while (i11 < this.f14599e) {
            if (i11 > 0) {
                int[] iArr4 = this.f14598c;
                i11 = iArr4[i11] == iArr4[i11 + (-1)] ? i11 + 1 : 0;
            }
            dArr[i27] = this.f14598c[i11] * 0.01d;
            double[] dArr3 = dArr2[i27];
            float[][] fArr4 = this.d;
            dArr3[0] = fArr4[i11][0];
            dArr2[i27][1] = fArr4[i11][1];
            dArr2[i27][2] = fArr4[i11][2];
            i27++;
        }
        this.f14596a = b.a(i10, dArr, dArr2);
    }

    public String toString() {
        String str = this.f14600f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f14599e; i10++) {
            StringBuilder l10 = android.support.v4.media.a.l(str, "[");
            l10.append(this.f14598c[i10]);
            l10.append(" , ");
            l10.append(decimalFormat.format(this.d[i10]));
            l10.append("] ");
            str = l10.toString();
        }
        return str;
    }
}
