package com.mixpanel.android.viewcrawler;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* loaded from: classes.dex */
public class b implements SensorEventListener {

    /* renamed from: c  reason: collision with root package name */
    public int f8349c = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f8350f = 0;

    /* renamed from: j  reason: collision with root package name */
    public long f8351j = -1;

    /* renamed from: m  reason: collision with root package name */
    public final float[] f8352m = new float[3];
    public final a n;

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.n = aVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSensorChanged(android.hardware.SensorEvent r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.viewcrawler.b.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
