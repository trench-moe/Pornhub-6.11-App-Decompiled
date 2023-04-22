package com.google.vrtoolkit.cardboard.sensors.internal;

/* loaded from: classes.dex */
public class Matrix3x3d {

    /* renamed from: m  reason: collision with root package name */
    public double[] f8110m;

    public Matrix3x3d() {
        this.f8110m = new double[9];
    }

    public Matrix3x3d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f8110m = r0;
        double[] dArr = {d, d10, d11, d12, d13, d14, d15, d16, d17};
    }

    public Matrix3x3d(Matrix3x3d matrix3x3d) {
        this.f8110m = r0;
        double[] dArr = matrix3x3d.f8110m;
        double[] dArr2 = {dArr[0], dArr[1], dArr[2], dArr[3], dArr[4], dArr[5], dArr[6], dArr[7], dArr[8]};
    }

    public static void add(Matrix3x3d matrix3x3d, Matrix3x3d matrix3x3d2, Matrix3x3d matrix3x3d3) {
        double[] dArr = matrix3x3d3.f8110m;
        double[] dArr2 = matrix3x3d.f8110m;
        double d = dArr2[0];
        double[] dArr3 = matrix3x3d2.f8110m;
        dArr[0] = d + dArr3[0];
        dArr[1] = dArr2[1] + dArr3[1];
        dArr[2] = dArr2[2] + dArr3[2];
        dArr[3] = dArr2[3] + dArr3[3];
        dArr[4] = dArr2[4] + dArr3[4];
        dArr[5] = dArr2[5] + dArr3[5];
        dArr[6] = dArr2[6] + dArr3[6];
        dArr[7] = dArr2[7] + dArr3[7];
        dArr[8] = dArr2[8] + dArr3[8];
    }

    public static void mult(Matrix3x3d matrix3x3d, Matrix3x3d matrix3x3d2, Matrix3x3d matrix3x3d3) {
        double[] dArr = matrix3x3d.f8110m;
        double d = dArr[0];
        double[] dArr2 = matrix3x3d2.f8110m;
        double d10 = (dArr[2] * dArr2[6]) + (dArr[1] * dArr2[3]) + (d * dArr2[0]);
        double d11 = (dArr[2] * dArr2[7]) + (dArr[1] * dArr2[4]) + (dArr[0] * dArr2[1]);
        double d12 = (dArr[2] * dArr2[8]) + (dArr[1] * dArr2[5]) + (dArr[0] * dArr2[2]);
        double d13 = (dArr[5] * dArr2[6]) + (dArr[4] * dArr2[3]) + (dArr[3] * dArr2[0]);
        double d14 = (dArr[5] * dArr2[7]) + (dArr[4] * dArr2[4]) + (dArr[3] * dArr2[1]);
        double d15 = (dArr[5] * dArr2[8]) + (dArr[4] * dArr2[5]) + (dArr[3] * dArr2[2]);
        double d16 = (dArr[8] * dArr2[6]) + (dArr[7] * dArr2[3]) + (dArr[6] * dArr2[0]);
        double d17 = (dArr[8] * dArr2[7]) + (dArr[7] * dArr2[4]) + (dArr[6] * dArr2[1]);
        double d18 = dArr[6] * dArr2[2];
        matrix3x3d3.set(d10, d11, d12, d13, d14, d15, d16, d17, (dArr[8] * dArr2[8]) + (dArr[7] * dArr2[5]) + d18);
    }

    public static void mult(Matrix3x3d matrix3x3d, Vector3d vector3d, Vector3d vector3d2) {
        double[] dArr = matrix3x3d.f8110m;
        double d = dArr[0];
        double d10 = vector3d.f8111x;
        double d11 = dArr[1];
        double d12 = vector3d.y;
        double d13 = (d11 * d12) + (d * d10);
        double d14 = dArr[2];
        double d15 = vector3d.f8112z;
        double d16 = (d14 * d15) + d13;
        double d17 = (dArr[5] * d15) + (dArr[4] * d12) + (dArr[3] * d10);
        double d18 = dArr[6] * d10;
        double d19 = dArr[8] * d15;
        vector3d2.f8111x = d16;
        vector3d2.y = d17;
        vector3d2.f8112z = d19 + (dArr[7] * d12) + d18;
    }

    public double determinant() {
        return (((get(2, 1) * get(1, 0)) - (get(2, 0) * get(1, 1))) * get(0, 2)) + ((((get(2, 2) * get(1, 1)) - (get(1, 2) * get(2, 1))) * get(0, 0)) - (((get(2, 2) * get(1, 0)) - (get(2, 0) * get(1, 2))) * get(0, 1)));
    }

    public double get(int i10, int i11) {
        return this.f8110m[(i10 * 3) + i11];
    }

    public void getColumn(int i10, Vector3d vector3d) {
        double[] dArr = this.f8110m;
        vector3d.f8111x = dArr[i10];
        vector3d.y = dArr[i10 + 3];
        vector3d.f8112z = dArr[i10 + 6];
    }

    public boolean invert(Matrix3x3d matrix3x3d) {
        double determinant = determinant();
        if (determinant == 0.0d) {
            return false;
        }
        double d = 1.0d / determinant;
        double[] dArr = this.f8110m;
        matrix3x3d.set(((dArr[4] * dArr[8]) - (dArr[7] * dArr[5])) * d, (-((dArr[1] * dArr[8]) - (dArr[2] * dArr[7]))) * d, ((dArr[1] * dArr[5]) - (dArr[2] * dArr[4])) * d, (-((dArr[3] * dArr[8]) - (dArr[5] * dArr[6]))) * d, ((dArr[0] * dArr[8]) - (dArr[2] * dArr[6])) * d, (-((dArr[0] * dArr[5]) - (dArr[3] * dArr[2]))) * d, ((dArr[3] * dArr[7]) - (dArr[6] * dArr[4])) * d, (-((dArr[0] * dArr[7]) - (dArr[6] * dArr[1]))) * d, ((dArr[0] * dArr[4]) - (dArr[3] * dArr[1])) * d);
        return true;
    }

    public double maxNorm() {
        double abs = Math.abs(this.f8110m[0]);
        int i10 = 1;
        while (true) {
            double[] dArr = this.f8110m;
            if (i10 >= dArr.length) {
                return abs;
            }
            abs = Math.max(abs, Math.abs(dArr[i10]));
            i10++;
        }
    }

    public void minusEquals(Matrix3x3d matrix3x3d) {
        double[] dArr = this.f8110m;
        double d = dArr[0];
        double[] dArr2 = matrix3x3d.f8110m;
        dArr[0] = d - dArr2[0];
        dArr[1] = dArr[1] - dArr2[1];
        dArr[2] = dArr[2] - dArr2[2];
        dArr[3] = dArr[3] - dArr2[3];
        dArr[4] = dArr[4] - dArr2[4];
        dArr[5] = dArr[5] - dArr2[5];
        dArr[6] = dArr[6] - dArr2[6];
        dArr[7] = dArr[7] - dArr2[7];
        dArr[8] = dArr[8] - dArr2[8];
    }

    public void plusEquals(Matrix3x3d matrix3x3d) {
        double[] dArr = this.f8110m;
        double d = dArr[0];
        double[] dArr2 = matrix3x3d.f8110m;
        dArr[0] = d + dArr2[0];
        dArr[1] = dArr[1] + dArr2[1];
        dArr[2] = dArr[2] + dArr2[2];
        dArr[3] = dArr[3] + dArr2[3];
        dArr[4] = dArr[4] + dArr2[4];
        dArr[5] = dArr[5] + dArr2[5];
        dArr[6] = dArr[6] + dArr2[6];
        dArr[7] = dArr[7] + dArr2[7];
        dArr[8] = dArr[8] + dArr2[8];
    }

    public void scale(double d) {
        double[] dArr = this.f8110m;
        dArr[0] = dArr[0] * d;
        dArr[1] = dArr[1] * d;
        dArr[2] = dArr[2] * d;
        dArr[3] = dArr[3] * d;
        dArr[4] = dArr[4] * d;
        dArr[5] = dArr[5] * d;
        dArr[6] = dArr[6] * d;
        dArr[7] = dArr[7] * d;
        dArr[8] = dArr[8] * d;
    }

    public void set(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double[] dArr = this.f8110m;
        dArr[0] = d;
        dArr[1] = d10;
        dArr[2] = d11;
        dArr[3] = d12;
        dArr[4] = d13;
        dArr[5] = d14;
        dArr[6] = d15;
        dArr[7] = d16;
        dArr[8] = d17;
    }

    public void set(int i10, int i11, double d) {
        this.f8110m[(i10 * 3) + i11] = d;
    }

    public void set(Matrix3x3d matrix3x3d) {
        double[] dArr = this.f8110m;
        double[] dArr2 = matrix3x3d.f8110m;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
        dArr[2] = dArr2[2];
        dArr[3] = dArr2[3];
        dArr[4] = dArr2[4];
        dArr[5] = dArr2[5];
        dArr[6] = dArr2[6];
        dArr[7] = dArr2[7];
        dArr[8] = dArr2[8];
    }

    public void setColumn(int i10, Vector3d vector3d) {
        double[] dArr = this.f8110m;
        dArr[i10] = vector3d.f8111x;
        dArr[i10 + 3] = vector3d.y;
        dArr[i10 + 6] = vector3d.f8112z;
    }

    public void setIdentity() {
        double[] dArr = this.f8110m;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[8] = 1.0d;
        dArr[4] = 1.0d;
        dArr[0] = 1.0d;
    }

    public void setSameDiagonal(double d) {
        double[] dArr = this.f8110m;
        dArr[8] = d;
        dArr[4] = d;
        dArr[0] = d;
    }

    public void setZero() {
        double[] dArr = this.f8110m;
        dArr[8] = 0.0d;
        dArr[7] = 0.0d;
        dArr[6] = 0.0d;
        dArr[5] = 0.0d;
        dArr[4] = 0.0d;
        dArr[3] = 0.0d;
        dArr[2] = 0.0d;
        dArr[1] = 0.0d;
        dArr[0] = 0.0d;
    }

    public void transpose() {
        double[] dArr = this.f8110m;
        double d = dArr[1];
        dArr[1] = dArr[3];
        dArr[3] = d;
        double d10 = dArr[2];
        dArr[2] = dArr[6];
        dArr[6] = d10;
        double d11 = dArr[5];
        dArr[5] = dArr[7];
        dArr[7] = d11;
    }

    public void transpose(Matrix3x3d matrix3x3d) {
        double[] dArr = this.f8110m;
        double d = dArr[1];
        double d10 = dArr[2];
        double d11 = dArr[5];
        double[] dArr2 = matrix3x3d.f8110m;
        dArr2[0] = dArr[0];
        dArr2[1] = dArr[3];
        dArr2[2] = dArr[6];
        dArr2[3] = d;
        dArr2[4] = dArr[4];
        dArr2[5] = dArr[7];
        dArr2[6] = d10;
        dArr2[7] = d11;
        dArr2[8] = dArr[8];
    }
}
