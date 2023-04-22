package com.google.vrtoolkit.cardboard;

import android.opengl.Matrix;

@UsedByNative
/* loaded from: classes.dex */
public class HeadTransform {
    private static final float GIMBAL_LOCK_EPSILON = 0.01f;
    private final float[] headView;

    public HeadTransform() {
        float[] fArr = new float[16];
        this.headView = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void getEulerAngles(float[] fArr, int i10) {
        float f10;
        double atan2;
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        float asin = (float) Math.asin(this.headView[6]);
        float[] fArr2 = this.headView;
        if (Math.sqrt(1.0f - (fArr2[6] * fArr2[6])) >= 0.009999999776482582d) {
            float[] fArr3 = this.headView;
            f10 = (float) Math.atan2(-fArr3[2], fArr3[10]);
            float[] fArr4 = this.headView;
            atan2 = Math.atan2(-fArr4[4], fArr4[5]);
        } else {
            f10 = 0.0f;
            float[] fArr5 = this.headView;
            atan2 = Math.atan2(fArr5[1], fArr5[0]);
        }
        fArr[i10 + 0] = -asin;
        fArr[i10 + 1] = -f10;
        fArr[i10 + 2] = -((float) atan2);
    }

    public void getForwardVector(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = -this.headView[i11 + 8];
        }
    }

    public void getHeadView(float[] fArr, int i10) {
        if (i10 + 16 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        System.arraycopy(this.headView, 0, fArr, i10, 16);
    }

    @UsedByNative
    public float[] getHeadView() {
        return this.headView;
    }

    public void getQuaternion(float[] fArr, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        if (i10 + 4 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        float[] fArr2 = this.headView;
        float f17 = fArr2[0] + fArr2[5] + fArr2[10];
        if (f17 >= 0.0f) {
            float sqrt = (float) Math.sqrt(f17 + 1.0f);
            f16 = sqrt * 0.5f;
            float f18 = 0.5f / sqrt;
            f12 = (fArr2[9] - fArr2[6]) * f18;
            f13 = (fArr2[2] - fArr2[8]) * f18;
            f10 = (fArr2[4] - fArr2[1]) * f18;
        } else if (fArr2[0] <= fArr2[5] || fArr2[0] <= fArr2[10]) {
            if (fArr2[5] > fArr2[10]) {
                float sqrt2 = (float) Math.sqrt(((fArr2[5] + 1.0f) - fArr2[0]) - fArr2[10]);
                f13 = sqrt2 * 0.5f;
                f11 = 0.5f / sqrt2;
                f12 = (fArr2[4] + fArr2[1]) * f11;
                f10 = (fArr2[9] + fArr2[6]) * f11;
                f14 = fArr2[2];
                f15 = fArr2[8];
            } else {
                float sqrt3 = (float) Math.sqrt(((fArr2[10] + 1.0f) - fArr2[0]) - fArr2[5]);
                f10 = sqrt3 * 0.5f;
                f11 = 0.5f / sqrt3;
                f12 = (fArr2[2] + fArr2[8]) * f11;
                f13 = (fArr2[9] + fArr2[6]) * f11;
                f14 = fArr2[4];
                f15 = fArr2[1];
            }
            f16 = (f14 - f15) * f11;
        } else {
            float sqrt4 = (float) Math.sqrt(((fArr2[0] + 1.0f) - fArr2[5]) - fArr2[10]);
            float f19 = 0.5f / sqrt4;
            f13 = (fArr2[4] + fArr2[1]) * f19;
            f10 = (fArr2[2] + fArr2[8]) * f19;
            f12 = sqrt4 * 0.5f;
            f16 = (fArr2[9] - fArr2[6]) * f19;
        }
        fArr[i10 + 0] = f12;
        fArr[i10 + 1] = f13;
        fArr[i10 + 2] = f10;
        fArr[i10 + 3] = f16;
    }

    public void getRightVector(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = this.headView[i11];
        }
    }

    public void getTranslation(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = this.headView[i11 + 12];
        }
    }

    public void getUpVector(float[] fArr, int i10) {
        if (i10 + 3 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11 + i10] = this.headView[i11 + 4];
        }
    }
}
