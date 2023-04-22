package d0;

import android.graphics.Color;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f8587a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8588b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8589c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f8590e;

    /* renamed from: f  reason: collision with root package name */
    public final float f8591f;

    public a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f8587a = f10;
        this.f8588b = f11;
        this.f8589c = f12;
        this.d = f16;
        this.f8590e = f17;
        this.f8591f = f18;
    }

    public static a a(int i10) {
        float pow;
        i iVar = i.f8621k;
        float P = a0.b.P(Color.red(i10));
        float P2 = a0.b.P(Color.green(i10));
        float P3 = a0.b.P(Color.blue(i10));
        float[][] fArr = a0.b.f124w;
        float[] fArr2 = {(fArr[0][2] * P3) + (fArr[0][1] * P2) + (fArr[0][0] * P), (fArr[1][2] * P3) + (fArr[1][1] * P2) + (fArr[1][0] * P), (P3 * fArr[2][2]) + (P2 * fArr[2][1]) + (P * fArr[2][0])};
        float[][] fArr3 = a0.b.n;
        float f10 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f11 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f12 = fArr2[0] * fArr3[2][0];
        float f13 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = iVar.f8627g;
        float f14 = fArr4[0] * f10;
        float f15 = fArr4[1] * f11;
        float f16 = fArr4[2] * (f13 + (fArr2[1] * fArr3[2][1]) + f12);
        float pow2 = (float) Math.pow((Math.abs(f14) * iVar.f8628h) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f15) * iVar.f8628h) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f16) * iVar.f8628h) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f17 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float pow5 = ((float) Math.pow((f21 * iVar.f8623b) / iVar.f8622a, iVar.d * iVar.f8630j)) * 100.0f;
        float sqrt = (iVar.f8622a + 4.0f) * (4.0f / iVar.d) * ((float) Math.sqrt(pow5 / 100.0f)) * iVar.f8629i;
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, iVar.f8626f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f22) < 20.14d ? 360.0f + f22 : f22) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * iVar.f8625e) * iVar.f8624c) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float f24 = pow6 * iVar.f8629i;
        float sqrt2 = ((float) Math.sqrt((pow * iVar.d) / (iVar.f8622a + 4.0f))) * 50.0f;
        float f25 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * f24) + 1.0f)) * 43.85965f;
        double d10 = f23;
        return new a(f22, pow6, pow5, sqrt, f24, sqrt2, f25, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static a b(float f10, float f11, float f12) {
        double d;
        i iVar = i.f8621k;
        float sqrt = (iVar.f8622a + 4.0f) * (4.0f / iVar.d) * ((float) Math.sqrt(f10 / 100.0d));
        float f13 = iVar.f8629i;
        float f14 = sqrt * f13;
        float f15 = f11 * f13;
        float sqrt2 = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(d))) * iVar.d) / (iVar.f8622a + 4.0f))) * 50.0f;
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, f14, f15, sqrt2, f16, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public int c(i iVar) {
        float f10;
        float f11 = this.f8588b;
        if (f11 != 0.0d) {
            double d = this.f8589c;
            if (d != 0.0d) {
                f10 = f11 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, iVar.f8626f), 0.73d), 1.1111111111111112d);
                double d10 = (this.f8587a * 3.1415927f) / 180.0f;
                float pow2 = iVar.f8622a * ((float) Math.pow(this.f8589c / 100.0d, (1.0d / iVar.d) / iVar.f8630j));
                float cos = ((float) (Math.cos(2.0d + d10) + 3.8d)) * 0.25f * 3846.1538f * iVar.f8625e * iVar.f8624c;
                float f12 = pow2 / iVar.f8623b;
                float sin = (float) Math.sin(d10);
                float cos2 = (float) Math.cos(d10);
                float f13 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f12 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / iVar.f8628h) * Math.signum(f17) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float signum2 = (100.0f / iVar.f8628h) * Math.signum(f18) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum3 = Math.signum(f19);
                float[] fArr = iVar.f8627g;
                float f20 = signum / fArr[0];
                float f21 = signum2 / fArr[1];
                float pow3 = (((100.0f / iVar.f8628h) * signum3) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = a0.b.f122t;
                float f22 = (fArr2[0][2] * pow3) + (fArr2[0][1] * f21) + (fArr2[0][0] * f20);
                float f23 = (fArr2[1][2] * pow3) + (fArr2[1][1] * f21) + (fArr2[1][0] * f20);
                float f24 = f20 * fArr2[2][0];
                return e0.a.b(f22, f23, (pow3 * fArr2[2][2]) + (f21 * fArr2[2][1]) + f24);
            }
        }
        f10 = 0.0f;
        float pow4 = (float) Math.pow(f10 / Math.pow(1.64d - Math.pow(0.29d, iVar.f8626f), 0.73d), 1.1111111111111112d);
        double d102 = (this.f8587a * 3.1415927f) / 180.0f;
        float pow22 = iVar.f8622a * ((float) Math.pow(this.f8589c / 100.0d, (1.0d / iVar.d) / iVar.f8630j));
        float cos3 = ((float) (Math.cos(2.0d + d102) + 3.8d)) * 0.25f * 3846.1538f * iVar.f8625e * iVar.f8624c;
        float f122 = pow22 / iVar.f8623b;
        float sin2 = (float) Math.sin(d102);
        float cos22 = (float) Math.cos(d102);
        float f132 = (((0.305f + f122) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f122 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / iVar.f8628h) * Math.signum(f172) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float signum22 = (100.0f / iVar.f8628h) * Math.signum(f182) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum32 = Math.signum(f192);
        float[] fArr3 = iVar.f8627g;
        float f202 = signum4 / fArr3[0];
        float f212 = signum22 / fArr3[1];
        float pow32 = (((100.0f / iVar.f8628h) * signum32) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = a0.b.f122t;
        float f222 = (fArr22[0][2] * pow32) + (fArr22[0][1] * f212) + (fArr22[0][0] * f202);
        float f232 = (fArr22[1][2] * pow32) + (fArr22[1][1] * f212) + (fArr22[1][0] * f202);
        float f242 = f202 * fArr22[2][0];
        return e0.a.b(f222, f232, (pow32 * fArr22[2][2]) + (f212 * fArr22[2][1]) + f242);
    }
}
