package com.google.vrtoolkit.cardboard.sensors.internal;

/* loaded from: classes.dex */
public class Vector3d {

    /* renamed from: x  reason: collision with root package name */
    public double f8111x;
    public double y;

    /* renamed from: z  reason: collision with root package name */
    public double f8112z;

    public Vector3d() {
    }

    public Vector3d(double d, double d10, double d11) {
        set(d, d10, d11);
    }

    public static void add(Vector3d vector3d, Vector3d vector3d2, Vector3d vector3d3) {
        vector3d3.set(vector3d.f8111x + vector3d2.f8111x, vector3d.y + vector3d2.y, vector3d.f8112z + vector3d2.f8112z);
    }

    public static void cross(Vector3d vector3d, Vector3d vector3d2, Vector3d vector3d3) {
        double d = vector3d.y;
        double d10 = vector3d2.f8112z;
        double d11 = vector3d.f8112z;
        double d12 = vector3d2.y;
        double d13 = vector3d2.f8111x;
        double d14 = vector3d.f8111x;
        vector3d3.set((d * d10) - (d11 * d12), (d11 * d13) - (d10 * d14), (d14 * d12) - (d * d13));
    }

    public static double dot(Vector3d vector3d, Vector3d vector3d2) {
        return (vector3d.f8112z * vector3d2.f8112z) + (vector3d.y * vector3d2.y) + (vector3d.f8111x * vector3d2.f8111x);
    }

    public static int largestAbsComponent(Vector3d vector3d) {
        double abs = Math.abs(vector3d.f8111x);
        double abs2 = Math.abs(vector3d.y);
        double abs3 = Math.abs(vector3d.f8112z);
        int i10 = 2;
        if (abs <= abs2) {
            return abs2 > abs3 ? 1 : 2;
        }
        if (abs > abs3) {
            i10 = 0;
        }
        return i10;
    }

    public static void ortho(Vector3d vector3d, Vector3d vector3d2) {
        int largestAbsComponent = largestAbsComponent(vector3d) - 1;
        if (largestAbsComponent < 0) {
            largestAbsComponent = 2;
        }
        vector3d2.setZero();
        vector3d2.setComponent(largestAbsComponent, 1.0d);
        cross(vector3d, vector3d2, vector3d2);
        vector3d2.normalize();
    }

    public static void sub(Vector3d vector3d, Vector3d vector3d2, Vector3d vector3d3) {
        vector3d3.set(vector3d.f8111x - vector3d2.f8111x, vector3d.y - vector3d2.y, vector3d.f8112z - vector3d2.f8112z);
    }

    public double length() {
        double d = this.f8111x;
        double d10 = this.y;
        double d11 = (d10 * d10) + (d * d);
        double d12 = this.f8112z;
        return Math.sqrt((d12 * d12) + d11);
    }

    public double maxNorm() {
        return Math.max(Math.abs(this.f8111x), Math.max(Math.abs(this.y), Math.abs(this.f8112z)));
    }

    public void normalize() {
        double length = length();
        if (length != 0.0d) {
            scale(1.0d / length);
        }
    }

    public boolean sameValues(Vector3d vector3d) {
        return this.f8111x == vector3d.f8111x && this.y == vector3d.y && this.f8112z == vector3d.f8112z;
    }

    public void scale(double d) {
        this.f8111x *= d;
        this.y *= d;
        this.f8112z *= d;
    }

    public void set(double d, double d10, double d11) {
        this.f8111x = d;
        this.y = d10;
        this.f8112z = d11;
    }

    public void set(Vector3d vector3d) {
        this.f8111x = vector3d.f8111x;
        this.y = vector3d.y;
        this.f8112z = vector3d.f8112z;
    }

    public void setComponent(int i10, double d) {
        if (i10 == 0) {
            this.f8111x = d;
        } else if (i10 == 1) {
            this.y = d;
        } else {
            this.f8112z = d;
        }
    }

    public void setZero() {
        this.f8112z = 0.0d;
        this.y = 0.0d;
        this.f8111x = 0.0d;
    }

    public String toString() {
        return String.format("%+05f %+05f %+05f", Double.valueOf(this.f8111x), Double.valueOf(this.y), Double.valueOf(this.f8112z));
    }
}
