package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x implements SensorEventListener {
    public final float[][] AFInAppEventParameterName = new float[2];
    public final long[] AFInAppEventType = new long[2];
    public long AFKeystoreWrapper;
    private final int AFLogger$LogLevel;
    private final String AppsFlyer2dXConversionCallback;
    private final String getLevel;
    private final Executor init;
    private final int valueOf;
    public double values;

    public x(Sensor sensor, Executor executor) {
        this.init = executor;
        int type = sensor.getType();
        this.valueOf = type;
        String name = sensor.getName();
        String str = BuildConfig.FLAVOR;
        name = name == null ? BuildConfig.FLAVOR : name;
        this.getLevel = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.AppsFlyer2dXConversionCallback = str;
        this.AFLogger$LogLevel = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    private boolean AFInAppEventParameterName() {
        return this.AFInAppEventParameterName[0] != null;
    }

    private boolean AFInAppEventType(int i10, String str, String str2) {
        return this.valueOf == i10 && this.getLevel.equals(str) && this.AppsFlyer2dXConversionCallback.equals(str2);
    }

    private static List<Float> valueOf(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f10 : fArr) {
            arrayList.add(Float.valueOf(f10));
        }
        return arrayList;
    }

    private Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.valueOf));
        concurrentHashMap.put("sN", this.getLevel);
        concurrentHashMap.put("sV", this.AppsFlyer2dXConversionCallback);
        float[] fArr = this.AFInAppEventParameterName[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", valueOf(fArr));
        }
        float[] fArr2 = this.AFInAppEventParameterName[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", valueOf(fArr2));
        }
        return concurrentHashMap;
    }

    public static /* synthetic */ double values(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i10 = 0; i10 < min; i10++) {
            d += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return AFInAppEventType(xVar.valueOf, xVar.getLevel, xVar.AppsFlyer2dXConversionCallback);
        }
        return false;
    }

    public final int hashCode() {
        return this.AFLogger$LogLevel;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        final long j10 = sensorEvent.timestamp;
        final float[] fArr = sensorEvent.values;
        this.init.execute(new Runnable() { // from class: com.appsflyer.internal.x.5
            @Override // java.lang.Runnable
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                x xVar = x.this;
                float[][] fArr2 = xVar.AFInAppEventParameterName;
                float[] fArr3 = fArr2[0];
                if (fArr3 == null) {
                    float[] fArr4 = fArr;
                    fArr2[0] = Arrays.copyOf(fArr4, fArr4.length);
                    x.this.AFInAppEventType[0] = currentTimeMillis;
                    return;
                }
                float[] fArr5 = fArr2[1];
                if (fArr5 == null) {
                    float[] fArr6 = fArr;
                    float[] copyOf = Arrays.copyOf(fArr6, fArr6.length);
                    x xVar2 = x.this;
                    xVar2.AFInAppEventParameterName[1] = copyOf;
                    xVar2.AFInAppEventType[1] = currentTimeMillis;
                    xVar2.values = x.values(fArr3, copyOf);
                    return;
                }
                long j11 = j10;
                if (50000000 <= j11 - xVar.AFKeystoreWrapper) {
                    xVar.AFKeystoreWrapper = j11;
                    if (Arrays.equals(fArr5, fArr)) {
                        x.this.AFInAppEventType[1] = currentTimeMillis;
                        return;
                    }
                    double values = x.values(fArr3, fArr);
                    x xVar3 = x.this;
                    if (values > xVar3.values) {
                        float[][] fArr7 = xVar3.AFInAppEventParameterName;
                        float[] fArr8 = fArr;
                        fArr7[1] = Arrays.copyOf(fArr8, fArr8.length);
                        x xVar4 = x.this;
                        xVar4.AFInAppEventType[1] = currentTimeMillis;
                        xVar4.values = values;
                    }
                }
            }
        });
    }

    public final void valueOf(Map<x, Map<String, Object>> map, boolean z10) {
        if (AFInAppEventParameterName()) {
            map.put(this, valueOf());
            if (z10) {
                int length = this.AFInAppEventParameterName.length;
                for (int i10 = 0; i10 < length; i10++) {
                    this.AFInAppEventParameterName[i10] = null;
                }
                int length2 = this.AFInAppEventType.length;
                for (int i11 = 0; i11 < length2; i11++) {
                    this.AFInAppEventType[i11] = 0;
                }
                this.values = 0.0d;
                this.AFKeystoreWrapper = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, valueOf());
        }
    }
}
