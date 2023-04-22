package com.google.android.exoplayer2.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import m8.c;

/* loaded from: classes.dex */
public final class a implements SensorEventListener {

    /* renamed from: c  reason: collision with root package name */
    public final float[] f6759c = new float[16];

    /* renamed from: f  reason: collision with root package name */
    public final float[] f6760f = new float[16];

    /* renamed from: j  reason: collision with root package name */
    public final float[] f6761j = new float[16];

    /* renamed from: m  reason: collision with root package name */
    public final float[] f6762m = new float[3];
    public final Display n;

    /* renamed from: t  reason: collision with root package name */
    public final InterfaceC0086a[] f6763t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6764u;

    /* renamed from: com.google.android.exoplayer2.video.spherical.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0086a {
        void a(float[] fArr, float f10);
    }

    public a(Display display, InterfaceC0086a... interfaceC0086aArr) {
        this.n = display;
        this.f6763t = interfaceC0086aArr;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f6759c, sensorEvent.values);
        float[] fArr = this.f6759c;
        int rotation = this.n.getRotation();
        if (rotation != 0) {
            int i10 = 129;
            int i11 = 130;
            if (rotation == 1) {
                i10 = 2;
                i11 = 129;
            } else if (rotation != 2) {
                if (rotation != 3) {
                    throw new IllegalStateException();
                }
                i10 = 130;
                i11 = 1;
            }
            float[] fArr2 = this.f6760f;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f6760f, i10, i11, fArr);
        }
        SensorManager.remapCoordinateSystem(this.f6759c, 1, 131, this.f6760f);
        SensorManager.getOrientation(this.f6760f, this.f6762m);
        float f10 = this.f6762m[2];
        Matrix.rotateM(this.f6759c, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.f6759c;
        if (!this.f6764u) {
            c.a(this.f6761j, fArr3);
            this.f6764u = true;
        }
        float[] fArr4 = this.f6760f;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.f6760f, 0, this.f6761j, 0);
        float[] fArr5 = this.f6759c;
        for (InterfaceC0086a interfaceC0086a : this.f6763t) {
            interfaceC0086a.a(fArr5, f10);
        }
    }
}
