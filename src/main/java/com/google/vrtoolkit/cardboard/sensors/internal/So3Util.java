package com.google.vrtoolkit.cardboard.sensors.internal;

/* loaded from: classes.dex */
public class So3Util {
    private static final double M_SQRT1_2 = 0.7071067811865476d;
    private static final double ONE_20TH = 0.1666666716337204d;
    private static final double ONE_6TH = 0.1666666716337204d;
    private static Vector3d temp31 = new Vector3d();
    private static Vector3d sO3FromTwoVecN = new Vector3d();
    private static Vector3d sO3FromTwoVecA = new Vector3d();
    private static Vector3d sO3FromTwoVecB = new Vector3d();
    private static Vector3d sO3FromTwoVecRotationAxis = new Vector3d();
    private static Matrix3x3d sO3FromTwoVec33R1 = new Matrix3x3d();
    private static Matrix3x3d sO3FromTwoVec33R2 = new Matrix3x3d();
    private static Vector3d muFromSO3R2 = new Vector3d();
    private static Vector3d rotationPiAboutAxisTemp = new Vector3d();

    public static void generatorField(int i10, Matrix3x3d matrix3x3d, Matrix3x3d matrix3x3d2) {
        matrix3x3d2.set(i10, 0, 0.0d);
        int i11 = (i10 + 1) % 3;
        int i12 = (i10 + 2) % 3;
        matrix3x3d2.set(i11, 0, -matrix3x3d.get(i12, 0));
        matrix3x3d2.set(i12, 0, matrix3x3d.get(i11, 0));
    }

    public static void muFromSO3(Matrix3x3d matrix3x3d, Vector3d vector3d) {
        double d = ((matrix3x3d.get(2, 2) + (matrix3x3d.get(1, 1) + matrix3x3d.get(0, 0))) - 1.0d) * 0.5d;
        vector3d.set((matrix3x3d.get(2, 1) - matrix3x3d.get(1, 2)) / 2.0d, (matrix3x3d.get(0, 2) - matrix3x3d.get(2, 0)) / 2.0d, (matrix3x3d.get(1, 0) - matrix3x3d.get(0, 1)) / 2.0d);
        double length = vector3d.length();
        if (d > M_SQRT1_2) {
            if (length > 0.0d) {
                vector3d.scale(Math.asin(length) / length);
            }
        } else if (d > -0.7071067811865476d) {
            vector3d.scale(Math.acos(d) / length);
        } else {
            double asin = 3.141592653589793d - Math.asin(length);
            double d10 = matrix3x3d.get(0, 0) - d;
            double d11 = matrix3x3d.get(1, 1) - d;
            double d12 = matrix3x3d.get(2, 2) - d;
            Vector3d vector3d2 = muFromSO3R2;
            double d13 = d10 * d10;
            double d14 = d11 * d11;
            if (d13 > d14 && d13 > d12 * d12) {
                vector3d2.set(d10, (matrix3x3d.get(0, 1) + matrix3x3d.get(1, 0)) / 2.0d, (matrix3x3d.get(2, 0) + matrix3x3d.get(0, 2)) / 2.0d);
            } else if (d14 > d12 * d12) {
                vector3d2.set((matrix3x3d.get(0, 1) + matrix3x3d.get(1, 0)) / 2.0d, d11, (matrix3x3d.get(1, 2) + matrix3x3d.get(2, 1)) / 2.0d);
            } else {
                vector3d2.set((matrix3x3d.get(2, 0) + matrix3x3d.get(0, 2)) / 2.0d, (matrix3x3d.get(1, 2) + matrix3x3d.get(2, 1)) / 2.0d, d12);
            }
            if (Vector3d.dot(vector3d2, vector3d) < 0.0d) {
                vector3d2.scale(-1.0d);
            }
            vector3d2.normalize();
            vector3d2.scale(asin);
            vector3d.set(vector3d2);
        }
    }

    private static void rodriguesSo3Exp(Vector3d vector3d, double d, double d10, Matrix3x3d matrix3x3d) {
        double d11 = vector3d.f8111x;
        double d12 = d11 * d11;
        double d13 = vector3d.y;
        double d14 = d13 * d13;
        double d15 = vector3d.f8112z;
        double d16 = d15 * d15;
        matrix3x3d.set(0, 0, 1.0d - ((d14 + d16) * d10));
        matrix3x3d.set(1, 1, 1.0d - ((d16 + d12) * d10));
        matrix3x3d.set(2, 2, 1.0d - ((d12 + d14) * d10));
        double d17 = vector3d.f8112z * d;
        double d18 = vector3d.f8111x * vector3d.y * d10;
        matrix3x3d.set(0, 1, d18 - d17);
        matrix3x3d.set(1, 0, d18 + d17);
        double d19 = vector3d.y * d;
        double d20 = vector3d.f8111x * vector3d.f8112z * d10;
        matrix3x3d.set(0, 2, d20 + d19);
        matrix3x3d.set(2, 0, d20 - d19);
        double d21 = vector3d.f8111x * d;
        double d22 = vector3d.y * vector3d.f8112z * d10;
        matrix3x3d.set(1, 2, d22 - d21);
        matrix3x3d.set(2, 1, d22 + d21);
    }

    private static void rotationPiAboutAxis(Vector3d vector3d, Matrix3x3d matrix3x3d) {
        rotationPiAboutAxisTemp.set(vector3d);
        Vector3d vector3d2 = rotationPiAboutAxisTemp;
        vector3d2.scale(3.141592653589793d / vector3d2.length());
        rodriguesSo3Exp(rotationPiAboutAxisTemp, 0.0d, 0.20264236728467558d, matrix3x3d);
    }

    public static void sO3FromMu(Vector3d vector3d, Matrix3x3d matrix3x3d) {
        double cos;
        double d;
        double d10;
        double dot = Vector3d.dot(vector3d, vector3d);
        double sqrt = Math.sqrt(dot);
        double d11 = 0.5d;
        if (dot < 1.0E-8d) {
            d10 = 1.0d - (dot * 0.1666666716337204d);
        } else if (dot >= 1.0E-6d) {
            double d12 = 1.0d / sqrt;
            double sin = Math.sin(sqrt) * d12;
            cos = d12 * d12 * (1.0d - Math.cos(sqrt));
            d = sin;
            rodriguesSo3Exp(vector3d, d, cos, matrix3x3d);
        } else {
            d11 = 0.5d - (0.0416666679084301d * dot);
            double d13 = dot * 0.1666666716337204d;
            d10 = 1.0d - ((1.0d - d13) * d13);
        }
        d = d10;
        cos = d11;
        rodriguesSo3Exp(vector3d, d, cos, matrix3x3d);
    }

    public static void sO3FromTwoVec(Vector3d vector3d, Vector3d vector3d2, Matrix3x3d matrix3x3d) {
        Vector3d.cross(vector3d, vector3d2, sO3FromTwoVecN);
        if (sO3FromTwoVecN.length() == 0.0d) {
            if (Vector3d.dot(vector3d, vector3d2) >= 0.0d) {
                matrix3x3d.setIdentity();
                return;
            }
            Vector3d.ortho(vector3d, sO3FromTwoVecRotationAxis);
            rotationPiAboutAxis(sO3FromTwoVecRotationAxis, matrix3x3d);
            return;
        }
        sO3FromTwoVecA.set(vector3d);
        sO3FromTwoVecB.set(vector3d2);
        sO3FromTwoVecN.normalize();
        sO3FromTwoVecA.normalize();
        sO3FromTwoVecB.normalize();
        Matrix3x3d matrix3x3d2 = sO3FromTwoVec33R1;
        matrix3x3d2.setColumn(0, sO3FromTwoVecA);
        matrix3x3d2.setColumn(1, sO3FromTwoVecN);
        Vector3d.cross(sO3FromTwoVecN, sO3FromTwoVecA, temp31);
        matrix3x3d2.setColumn(2, temp31);
        Matrix3x3d matrix3x3d3 = sO3FromTwoVec33R2;
        matrix3x3d3.setColumn(0, sO3FromTwoVecB);
        matrix3x3d3.setColumn(1, sO3FromTwoVecN);
        Vector3d.cross(sO3FromTwoVecN, sO3FromTwoVecB, temp31);
        matrix3x3d3.setColumn(2, temp31);
        matrix3x3d2.transpose();
        Matrix3x3d.mult(matrix3x3d3, matrix3x3d2, matrix3x3d);
    }
}
