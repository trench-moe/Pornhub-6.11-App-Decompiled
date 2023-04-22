package com.google.vrtoolkit.cardboard;

import android.support.v4.media.a;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class Distortion {
    private static final float[] DEFAULT_COEFFICIENTS = {0.441f, 0.156f};
    private float[] coefficients;

    public Distortion() {
        this.coefficients = (float[]) DEFAULT_COEFFICIENTS.clone();
    }

    public Distortion(Distortion distortion) {
        setCoefficients(distortion.coefficients);
    }

    public static Distortion parseFromProtobuf(float[] fArr) {
        Distortion distortion = new Distortion();
        distortion.setCoefficients(fArr);
        return distortion;
    }

    private static double[] solveLeastSquares(double[][] dArr, double[] dArr2) {
        int length = dArr.length;
        int length2 = dArr[0].length;
        double[][] dArr3 = (double[][]) Array.newInstance(double.class, length2, length2);
        for (int i10 = 0; i10 < length2; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                double d = 0.0d;
                for (int i12 = 0; i12 < length; i12++) {
                    d = (dArr[i12][i11] * dArr[i12][i10]) + d;
                }
                dArr3[i11][i10] = d;
            }
        }
        double[][] dArr4 = (double[][]) Array.newInstance(double.class, length2, length2);
        if (length2 != 2) {
            StringBuilder sb2 = new StringBuilder(78);
            sb2.append("solveLeastSquares: only 2 coefficients currently supported, ");
            sb2.append(length2);
            sb2.append(" given.");
            throw new RuntimeException(sb2.toString());
        }
        double d10 = (dArr3[0][0] * dArr3[1][1]) - (dArr3[0][1] * dArr3[1][0]);
        dArr4[0][0] = dArr3[1][1] / d10;
        dArr4[1][1] = dArr3[0][0] / d10;
        dArr4[0][1] = (-dArr3[1][0]) / d10;
        dArr4[1][0] = (-dArr3[0][1]) / d10;
        double[] dArr5 = new double[length2];
        for (int i13 = 0; i13 < length2; i13++) {
            double d11 = 0.0d;
            for (int i14 = 0; i14 < length; i14++) {
                d11 += dArr[i14][i13] * dArr2[i14];
            }
            dArr5[i13] = d11;
        }
        double[] dArr6 = new double[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            double d12 = 0.0d;
            for (int i16 = 0; i16 < length2; i16++) {
                d12 += dArr4[i16][i15] * dArr5[i16];
            }
            dArr6[i15] = d12;
        }
        return dArr6;
    }

    public float distort(float f10) {
        return distortionFactor(f10) * f10;
    }

    public float distortInverse(float f10) {
        float f11 = f10 / 0.9f;
        float f12 = 0.9f * f10;
        float distort = f10 - distort(f11);
        while (true) {
            float f13 = f11;
            f11 = f12;
            float f14 = f11 - f13;
            if (Math.abs(f14) <= 1.0E-4d) {
                return f11;
            }
            float distort2 = f10 - distort(f11);
            f12 = f11 - ((f14 / (distort2 - distort)) * distort2);
            distort = distort2;
        }
    }

    public float distortionFactor(float f10) {
        float f11 = f10 * f10;
        float f12 = 1.0f;
        float f13 = 1.0f;
        for (float f14 : this.coefficients) {
            f13 *= f11;
            f12 += f14 * f13;
        }
        return f12;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Distortion) {
            return Arrays.equals(this.coefficients, ((Distortion) obj).coefficients);
        }
        return false;
    }

    public Distortion getApproximateInverseDistortion(float f10) {
        double[][] dArr = (double[][]) Array.newInstance(double.class, 10, 2);
        double[] dArr2 = new double[10];
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            float f11 = (i11 * f10) / 10.0f;
            double distort = distort(f11);
            double d = distort;
            for (int i12 = 0; i12 < 2; i12++) {
                d *= distort * distort;
                dArr[i10][i12] = d;
            }
            dArr2[i10] = f11 - distort;
            i10 = i11;
        }
        double[] solveLeastSquares = solveLeastSquares(dArr, dArr2);
        float[] fArr = new float[solveLeastSquares.length];
        for (int i13 = 0; i13 < solveLeastSquares.length; i13++) {
            fArr[i13] = (float) solveLeastSquares[i13];
        }
        Distortion distortion = new Distortion();
        distortion.setCoefficients(fArr);
        return distortion;
    }

    public float[] getCoefficients() {
        return this.coefficients;
    }

    public void setCoefficients(float[] fArr) {
        this.coefficients = fArr != null ? (float[]) fArr.clone() : new float[0];
    }

    public float[] toProtobuf() {
        return (float[]) this.coefficients.clone();
    }

    public String toString() {
        StringBuilder l10 = a.l("{\n", "  coefficients: [");
        int i10 = 0;
        while (true) {
            float[] fArr = this.coefficients;
            if (i10 >= fArr.length) {
                l10.append("],\n}");
                return l10.toString();
            }
            l10.append(Float.toString(fArr[i10]));
            if (i10 < this.coefficients.length - 1) {
                l10.append(", ");
            }
            i10++;
        }
    }
}
