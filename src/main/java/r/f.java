package r;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public double[] f14564a;

    /* renamed from: b  reason: collision with root package name */
    public double[][] f14565b;

    /* renamed from: c  reason: collision with root package name */
    public double[][] f14566c;
    public double[] d;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.d = new double[length2];
        int i10 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, i10, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(double.class, length, length2);
        for (int i11 = 0; i11 < length2; i11++) {
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i12 + 1;
                dArr3[i12][i11] = (dArr2[i13][i11] - dArr2[i12][i11]) / (dArr[i13] - dArr[i12]);
                if (i12 == 0) {
                    dArr4[i12][i11] = dArr3[i12][i11];
                } else {
                    dArr4[i12][i11] = (dArr3[i12 - 1][i11] + dArr3[i12][i11]) * 0.5d;
                }
                i12 = i13;
            }
            dArr4[i10][i11] = dArr3[length - 2][i11];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < length2; i15++) {
                if (dArr3[i14][i15] == 0.0d) {
                    dArr4[i14][i15] = 0.0d;
                    dArr4[i14 + 1][i15] = 0.0d;
                } else {
                    double d = dArr4[i14][i15] / dArr3[i14][i15];
                    int i16 = i14 + 1;
                    double d10 = dArr4[i16][i15] / dArr3[i14][i15];
                    double hypot = Math.hypot(d, d10);
                    if (hypot > 9.0d) {
                        double d11 = 3.0d / hypot;
                        dArr4[i14][i15] = d * d11 * dArr3[i14][i15];
                        dArr4[i16][i15] = d11 * d10 * dArr3[i14][i15];
                    }
                }
            }
        }
        this.f14564a = dArr;
        this.f14565b = dArr2;
        this.f14566c = dArr4;
    }

    public static double h(double d, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d10 * 6.0d;
        double d17 = 6.0d * d15 * d11;
        double d18 = 3.0d * d;
        double d19 = d18 * d13 * d15;
        return (d * d13) + (((d19 + (((d18 * d14) * d15) + ((d17 + ((d16 * d12) + (((-6.0d) * d15) * d12))) - (d16 * d11)))) - (((2.0d * d) * d14) * d10)) - (((4.0d * d) * d13) * d10));
    }

    public static double i(double d, double d10, double d11, double d12, double d13, double d14) {
        double d15 = d10 * d10;
        double d16 = d15 * d10;
        double d17 = 3.0d * d15;
        double d18 = d17 * d12;
        double d19 = d * d14;
        double d20 = d19 * d16;
        double d21 = d * d13;
        return (d21 * d10) + ((((d16 * d21) + (d20 + (((((d16 * 2.0d) * d11) + (d18 + (((-2.0d) * d16) * d12))) - (d17 * d11)) + d11))) - (d19 * d15)) - (((2.0d * d) * d13) * d15));
    }

    @Override // r.b
    public double b(double d, int i10) {
        double[] dArr = this.f14564a;
        int length = dArr.length;
        int i11 = 0;
        if (d <= dArr[0]) {
            return (e(dArr[0], i10) * (d - dArr[0])) + this.f14565b[0][i10];
        }
        int i12 = length - 1;
        if (d >= dArr[i12]) {
            return (e(dArr[i12], i10) * (d - dArr[i12])) + this.f14565b[i12][i10];
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f14564a;
            if (d == dArr2[i11]) {
                return this.f14565b[i11][i10];
            }
            int i13 = i11 + 1;
            if (d < dArr2[i13]) {
                double d10 = dArr2[i13] - dArr2[i11];
                double d11 = (d - dArr2[i11]) / d10;
                double[][] dArr3 = this.f14565b;
                double d12 = dArr3[i11][i10];
                double d13 = dArr3[i13][i10];
                double[][] dArr4 = this.f14566c;
                return i(d10, d11, d12, d13, dArr4[i11][i10], dArr4[i13][i10]);
            }
            i11 = i13;
        }
        return 0.0d;
    }

    @Override // r.b
    public void c(double d, double[] dArr) {
        double[] dArr2 = this.f14564a;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f14565b[0].length;
        if (d <= dArr2[0]) {
            f(dArr2[0], this.d);
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = ((d - this.f14564a[0]) * this.d[i11]) + this.f14565b[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        if (d >= dArr2[i12]) {
            f(dArr2[i12], this.d);
            while (i10 < length2) {
                dArr[i10] = ((d - this.f14564a[i12]) * this.d[i10]) + this.f14565b[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d == this.f14564a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f14565b[i13][i14];
                }
            }
            double[] dArr3 = this.f14564a;
            int i15 = i13 + 1;
            if (d < dArr3[i15]) {
                double d10 = dArr3[i15] - dArr3[i13];
                double d11 = (d - dArr3[i13]) / d10;
                while (i10 < length2) {
                    double[][] dArr4 = this.f14565b;
                    double d12 = dArr4[i13][i10];
                    double d13 = dArr4[i15][i10];
                    double[][] dArr5 = this.f14566c;
                    dArr[i10] = i(d10, d11, d12, d13, dArr5[i13][i10], dArr5[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // r.b
    public void d(double d, float[] fArr) {
        double[] dArr = this.f14564a;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f14565b[0].length;
        if (d <= dArr[0]) {
            f(dArr[0], this.d);
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) (((d - this.f14564a[0]) * this.d[i11]) + this.f14565b[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        if (d >= dArr[i12]) {
            f(dArr[i12], this.d);
            while (i10 < length2) {
                fArr[i10] = (float) (((d - this.f14564a[i12]) * this.d[i10]) + this.f14565b[i12][i10]);
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d == this.f14564a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f14565b[i13][i14];
                }
            }
            double[] dArr2 = this.f14564a;
            int i15 = i13 + 1;
            if (d < dArr2[i15]) {
                double d10 = dArr2[i15] - dArr2[i13];
                double d11 = (d - dArr2[i13]) / d10;
                while (i10 < length2) {
                    double[][] dArr3 = this.f14565b;
                    double d12 = dArr3[i13][i10];
                    double d13 = dArr3[i15][i10];
                    double[][] dArr4 = this.f14566c;
                    fArr[i10] = (float) i(d10, d11, d12, d13, dArr4[i13][i10], dArr4[i15][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // r.b
    public double e(double d, int i10) {
        double d10;
        double[] dArr = this.f14564a;
        int length = dArr.length;
        int i11 = 0;
        if (d < dArr[0]) {
            d10 = dArr[0];
        } else {
            int i12 = length - 1;
            d10 = d >= dArr[i12] ? dArr[i12] : d;
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f14564a;
            int i13 = i11 + 1;
            if (d10 <= dArr2[i13]) {
                double d11 = dArr2[i13] - dArr2[i11];
                double[][] dArr3 = this.f14565b;
                double d12 = dArr3[i11][i10];
                double d13 = dArr3[i13][i10];
                double[][] dArr4 = this.f14566c;
                return h(d11, (d10 - dArr2[i11]) / d11, d12, d13, dArr4[i11][i10], dArr4[i13][i10]) / d11;
            }
            i11 = i13;
        }
        return 0.0d;
    }

    @Override // r.b
    public void f(double d, double[] dArr) {
        double d10;
        double[] dArr2 = this.f14564a;
        int length = dArr2.length;
        int length2 = this.f14565b[0].length;
        if (d <= dArr2[0]) {
            d10 = dArr2[0];
        } else {
            int i10 = length - 1;
            d10 = d >= dArr2[i10] ? dArr2[i10] : d;
        }
        int i11 = 0;
        while (i11 < length - 1) {
            double[] dArr3 = this.f14564a;
            int i12 = i11 + 1;
            if (d10 <= dArr3[i12]) {
                double d11 = dArr3[i12] - dArr3[i11];
                double d12 = (d10 - dArr3[i11]) / d11;
                for (int i13 = 0; i13 < length2; i13++) {
                    double[][] dArr4 = this.f14565b;
                    double d13 = dArr4[i11][i13];
                    double d14 = dArr4[i12][i13];
                    double[][] dArr5 = this.f14566c;
                    dArr[i13] = h(d11, d12, d13, d14, dArr5[i11][i13], dArr5[i12][i13]) / d11;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // r.b
    public double[] g() {
        return this.f14564a;
    }
}
