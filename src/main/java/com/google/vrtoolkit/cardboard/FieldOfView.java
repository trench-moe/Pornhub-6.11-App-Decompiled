package com.google.vrtoolkit.cardboard;

import a1.a;
import android.opengl.Matrix;

/* loaded from: classes.dex */
public class FieldOfView {
    private static final float DEFAULT_MAX_FOV_BOTTOM = 40.0f;
    private static final float DEFAULT_MAX_FOV_LEFT_RIGHT = 40.0f;
    private static final float DEFAULT_MAX_FOV_TOP = 40.0f;
    private float bottom;
    private float left;
    private float right;
    private float top;

    public FieldOfView() {
        this.left = 40.0f;
        this.right = 40.0f;
        this.bottom = 40.0f;
        this.top = 40.0f;
    }

    public FieldOfView(float f10, float f11, float f12, float f13) {
        setAngles(f10, f11, f12, f13);
    }

    public FieldOfView(FieldOfView fieldOfView) {
        copy(fieldOfView);
    }

    public static FieldOfView parseFromProtobuf(float[] fArr) {
        if (fArr.length != 4) {
            return null;
        }
        return new FieldOfView(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public void copy(FieldOfView fieldOfView) {
        this.left = fieldOfView.left;
        this.right = fieldOfView.right;
        this.bottom = fieldOfView.bottom;
        this.top = fieldOfView.top;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof FieldOfView) {
            FieldOfView fieldOfView = (FieldOfView) obj;
            if (this.left == fieldOfView.left && this.right == fieldOfView.right && this.bottom == fieldOfView.bottom && this.top == fieldOfView.top) {
                z10 = true;
            }
            return z10;
        }
        return false;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public void setAngles(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.right = f11;
        this.bottom = f12;
        this.top = f13;
    }

    public void setBottom(float f10) {
        this.bottom = f10;
    }

    public void setLeft(float f10) {
        this.left = f10;
    }

    public void setRight(float f10) {
        this.right = f10;
    }

    public void setTop(float f10) {
        this.top = f10;
    }

    public void toPerspectiveMatrix(float f10, float f11, float[] fArr, int i10) {
        if (i10 + 16 > fArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        Matrix.frustumM(fArr, i10, ((float) (-Math.tan(Math.toRadians(this.left)))) * f10, ((float) Math.tan(Math.toRadians(this.right))) * f10, ((float) (-Math.tan(Math.toRadians(this.bottom)))) * f10, ((float) Math.tan(Math.toRadians(this.top))) * f10, f10, f11);
    }

    public float[] toProtobuf() {
        return new float[]{this.left, this.right, this.bottom, this.top};
    }

    public String toString() {
        StringBuilder m10 = a.m("{\n");
        float f10 = this.left;
        StringBuilder sb2 = new StringBuilder(25);
        sb2.append("  left: ");
        sb2.append(f10);
        sb2.append(",\n");
        m10.append(sb2.toString());
        float f11 = this.right;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("  right: ");
        sb3.append(f11);
        sb3.append(",\n");
        m10.append(sb3.toString());
        float f12 = this.bottom;
        StringBuilder sb4 = new StringBuilder(27);
        sb4.append("  bottom: ");
        sb4.append(f12);
        sb4.append(",\n");
        m10.append(sb4.toString());
        float f13 = this.top;
        StringBuilder sb5 = new StringBuilder(24);
        sb5.append("  top: ");
        sb5.append(f13);
        sb5.append(",\n");
        m10.append(sb5.toString());
        m10.append("}");
        return m10.toString();
    }
}
