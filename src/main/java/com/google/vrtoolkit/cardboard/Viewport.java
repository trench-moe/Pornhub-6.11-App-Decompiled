package com.google.vrtoolkit.cardboard;

import a1.a;
import android.opengl.GLES20;

@UsedByNative
/* loaded from: classes.dex */
public class Viewport {
    public int height;
    public int width;

    /* renamed from: x  reason: collision with root package name */
    public int f8108x;
    public int y;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Viewport) {
            Viewport viewport = (Viewport) obj;
            return this.f8108x == viewport.f8108x && this.y == viewport.y && this.width == viewport.width && this.height == viewport.height;
        }
        return false;
    }

    public void getAsArray(int[] iArr, int i10) {
        if (i10 + 4 > iArr.length) {
            throw new IllegalArgumentException("Not enough space to write the result");
        }
        iArr[i10] = this.f8108x;
        iArr[i10 + 1] = this.y;
        iArr[i10 + 2] = this.width;
        iArr[i10 + 3] = this.height;
    }

    public int hashCode() {
        return ((Integer.valueOf(this.f8108x).hashCode() ^ Integer.valueOf(this.y).hashCode()) ^ Integer.valueOf(this.width).hashCode()) ^ Integer.valueOf(this.height).hashCode();
    }

    public void setGLScissor() {
        GLES20.glScissor(this.f8108x, this.y, this.width, this.height);
    }

    public void setGLViewport() {
        GLES20.glViewport(this.f8108x, this.y, this.width, this.height);
    }

    @UsedByNative
    public void setViewport(int i10, int i11, int i12, int i13) {
        this.f8108x = i10;
        this.y = i11;
        this.width = i12;
        this.height = i13;
    }

    public String toString() {
        StringBuilder m10 = a.m("{\n");
        int i10 = this.f8108x;
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append("  x: ");
        sb2.append(i10);
        sb2.append(",\n");
        m10.append(sb2.toString());
        int i11 = this.y;
        StringBuilder sb3 = new StringBuilder(18);
        sb3.append("  y: ");
        sb3.append(i11);
        sb3.append(",\n");
        m10.append(sb3.toString());
        int i12 = this.width;
        StringBuilder sb4 = new StringBuilder(22);
        sb4.append("  width: ");
        sb4.append(i12);
        sb4.append(",\n");
        m10.append(sb4.toString());
        int i13 = this.height;
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append("  height: ");
        sb5.append(i13);
        sb5.append(",\n");
        m10.append(sb5.toString());
        m10.append("}");
        return m10.toString();
    }
}
