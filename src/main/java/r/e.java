package r;

/* loaded from: classes2.dex */
public class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public double[] f14561a;

    /* renamed from: b  reason: collision with root package name */
    public double[][] f14562b;

    /* renamed from: c  reason: collision with root package name */
    public double[] f14563c;

    public e(double[] dArr, double[][] dArr2) {
        int length = dArr2[0].length;
        this.f14563c = new double[length];
        this.f14561a = dArr;
        this.f14562b = dArr2;
        if (length > 2) {
            double d = 0.0d;
            double d10 = 0.0d;
            int i10 = 0;
            while (i10 < dArr.length) {
                double d11 = dArr2[i10][0];
                double d12 = dArr2[i10][0];
                if (i10 > 0) {
                    Math.hypot(d11 - d, d12 - d10);
                }
                i10++;
                d = d11;
                d10 = d12;
            }
        }
    }

    @Override // r.b
    public double b(double d, int i10) {
        double[] dArr = this.f14561a;
        int length = dArr.length;
        int i11 = 0;
        if (d <= dArr[0]) {
            return (e(dArr[0], i10) * (d - dArr[0])) + this.f14562b[0][i10];
        }
        int i12 = length - 1;
        if (d >= dArr[i12]) {
            return (e(dArr[i12], i10) * (d - dArr[i12])) + this.f14562b[i12][i10];
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f14561a;
            if (d == dArr2[i11]) {
                return this.f14562b[i11][i10];
            }
            int i13 = i11 + 1;
            if (d < dArr2[i13]) {
                double d10 = (d - dArr2[i11]) / (dArr2[i13] - dArr2[i11]);
                double[][] dArr3 = this.f14562b;
                return (dArr3[i13][i10] * d10) + ((1.0d - d10) * dArr3[i11][i10]);
            }
            i11 = i13;
        }
        return 0.0d;
    }

    @Override // r.b
    public void c(double d, double[] dArr) {
        double[] dArr2 = this.f14561a;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f14562b[0].length;
        if (d <= dArr2[0]) {
            f(dArr2[0], this.f14563c);
            for (int i11 = 0; i11 < length2; i11++) {
                dArr[i11] = ((d - this.f14561a[0]) * this.f14563c[i11]) + this.f14562b[0][i11];
            }
            return;
        }
        int i12 = length - 1;
        if (d >= dArr2[i12]) {
            f(dArr2[i12], this.f14563c);
            while (i10 < length2) {
                dArr[i10] = ((d - this.f14561a[i12]) * this.f14563c[i10]) + this.f14562b[i12][i10];
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d == this.f14561a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    dArr[i14] = this.f14562b[i13][i14];
                }
            }
            double[] dArr3 = this.f14561a;
            int i15 = i13 + 1;
            if (d < dArr3[i15]) {
                double d10 = (d - dArr3[i13]) / (dArr3[i15] - dArr3[i13]);
                while (i10 < length2) {
                    double[][] dArr4 = this.f14562b;
                    dArr[i10] = (dArr4[i15][i10] * d10) + ((1.0d - d10) * dArr4[i13][i10]);
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // r.b
    public void d(double d, float[] fArr) {
        double[] dArr = this.f14561a;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f14562b[0].length;
        if (d <= dArr[0]) {
            f(dArr[0], this.f14563c);
            for (int i11 = 0; i11 < length2; i11++) {
                fArr[i11] = (float) (((d - this.f14561a[0]) * this.f14563c[i11]) + this.f14562b[0][i11]);
            }
            return;
        }
        int i12 = length - 1;
        if (d >= dArr[i12]) {
            f(dArr[i12], this.f14563c);
            while (i10 < length2) {
                fArr[i10] = (float) (((d - this.f14561a[i12]) * this.f14563c[i10]) + this.f14562b[i12][i10]);
                i10++;
            }
            return;
        }
        int i13 = 0;
        while (i13 < length - 1) {
            if (d == this.f14561a[i13]) {
                for (int i14 = 0; i14 < length2; i14++) {
                    fArr[i14] = (float) this.f14562b[i13][i14];
                }
            }
            double[] dArr2 = this.f14561a;
            int i15 = i13 + 1;
            if (d < dArr2[i15]) {
                double d10 = (d - dArr2[i13]) / (dArr2[i15] - dArr2[i13]);
                while (i10 < length2) {
                    double[][] dArr3 = this.f14562b;
                    fArr[i10] = (float) ((dArr3[i15][i10] * d10) + ((1.0d - d10) * dArr3[i13][i10]));
                    i10++;
                }
                return;
            }
            i13 = i15;
        }
    }

    @Override // r.b
    public double e(double d, int i10) {
        double[] dArr = this.f14561a;
        int length = dArr.length;
        int i11 = 0;
        if (d < dArr[0]) {
            d = dArr[0];
        } else {
            int i12 = length - 1;
            if (d >= dArr[i12]) {
                d = dArr[i12];
            }
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f14561a;
            int i13 = i11 + 1;
            if (d <= dArr2[i13]) {
                double d10 = dArr2[i13] - dArr2[i11];
                double d11 = dArr2[i11];
                double[][] dArr3 = this.f14562b;
                return (dArr3[i13][i10] - dArr3[i11][i10]) / d10;
            }
            i11 = i13;
        }
        return 0.0d;
    }

    @Override // r.b
    public void f(double d, double[] dArr) {
        double[] dArr2 = this.f14561a;
        int length = dArr2.length;
        int length2 = this.f14562b[0].length;
        if (d <= dArr2[0]) {
            d = dArr2[0];
        } else {
            int i10 = length - 1;
            if (d >= dArr2[i10]) {
                d = dArr2[i10];
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            double[] dArr3 = this.f14561a;
            int i12 = i11 + 1;
            if (d <= dArr3[i12]) {
                double d10 = dArr3[i12] - dArr3[i11];
                double d11 = dArr3[i11];
                for (int i13 = 0; i13 < length2; i13++) {
                    double[][] dArr4 = this.f14562b;
                    dArr[i13] = (dArr4[i12][i13] - dArr4[i11][i13]) / d10;
                }
                return;
            }
            i11 = i12;
        }
    }

    @Override // r.b
    public double[] g() {
        return this.f14561a;
    }
}
