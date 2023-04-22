package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class z {
    private static final Handler AppsFlyer2dXConversionCallback;
    private static volatile z getLevel;
    private static final BitSet init;
    public final Handler AFInAppEventParameterName;
    public final Runnable AFInAppEventType;
    public final Runnable AFKeystoreWrapper;
    public final Executor AFLogger$LogLevel;
    public final Runnable AFVersionDeclaration;
    private int onAppOpenAttributionNative;
    private final SensorManager onAttributionFailureNative;
    private final Runnable onConversionDataFail;
    private long onConversionDataSuccess;
    private final Map<x, x> onDeepLinkingNative;
    private final Map<x, Map<String, Object>> onInstallConversionDataLoadedNative;
    private boolean onInstallConversionFailureNative;
    public final Object valueOf = new Object();
    public boolean values;

    /* renamed from: com.appsflyer.internal.z$10  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!z.this.onDeepLinkingNative.isEmpty()) {
                    for (x xVar : z.this.onDeepLinkingNative.values()) {
                        z.this.onAttributionFailureNative.unregisterListener(xVar);
                        xVar.valueOf(z.this.onInstallConversionDataLoadedNative, true);
                    }
                }
            } catch (Throwable unused) {
            }
            z.this.onAppOpenAttributionNative = 0;
            z.this.onInstallConversionFailureNative = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        init = bitSet;
        AppsFlyer2dXConversionCallback = new Handler(Looper.getMainLooper());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private z(SensorManager sensorManager, Handler handler) {
        BitSet bitSet = init;
        this.onDeepLinkingNative = new HashMap(bitSet.size());
        this.onInstallConversionDataLoadedNative = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.z.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (z.this.valueOf) {
                    try {
                        final z zVar = z.this;
                        zVar.AFLogger$LogLevel.execute(new Runnable() { // from class: com.appsflyer.internal.z.3
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    for (Sensor sensor : z.this.onAttributionFailureNative.getSensorList(-1)) {
                                        if (z.values(sensor.getType())) {
                                            x xVar = new x(sensor, z.this.AFLogger$LogLevel);
                                            if (!z.this.onDeepLinkingNative.containsKey(xVar)) {
                                                z.this.onDeepLinkingNative.put(xVar, xVar);
                                            }
                                            z.this.onAttributionFailureNative.registerListener((SensorEventListener) z.this.onDeepLinkingNative.get(xVar), sensor, 0);
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                z.this.onInstallConversionFailureNative = true;
                            }
                        });
                        z zVar2 = z.this;
                        zVar2.AFInAppEventParameterName.postDelayed(zVar2.onConversionDataFail, 100L);
                        z.this.values = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.AFKeystoreWrapper = new Runnable() { // from class: com.appsflyer.internal.z.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (z.this.valueOf) {
                    z zVar = z.this;
                    zVar.AFLogger$LogLevel.execute(new AnonymousClass10());
                }
            }
        };
        this.AFVersionDeclaration = new Runnable() { // from class: com.appsflyer.internal.z.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (z.this.valueOf) {
                    try {
                        z zVar = z.this;
                        if (zVar.values) {
                            zVar.AFInAppEventParameterName.removeCallbacks(zVar.AFInAppEventType);
                            z zVar2 = z.this;
                            zVar2.AFInAppEventParameterName.removeCallbacks(zVar2.AFKeystoreWrapper);
                            z zVar3 = z.this;
                            zVar3.AFLogger$LogLevel.execute(new AnonymousClass10());
                            z.this.values = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.onAppOpenAttributionNative = 1;
        this.onConversionDataSuccess = 0L;
        this.onConversionDataFail = new Runnable() { // from class: com.appsflyer.internal.z.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (z.this.valueOf) {
                    try {
                        if (z.this.onAppOpenAttributionNative == 0) {
                            z.this.onAppOpenAttributionNative = 1;
                        }
                        z zVar = z.this;
                        zVar.AFInAppEventParameterName.postDelayed(zVar.AFKeystoreWrapper, zVar.onAppOpenAttributionNative * 500);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.AFLogger$LogLevel = Executors.newSingleThreadExecutor();
        this.onAttributionFailureNative = sensorManager;
        this.AFInAppEventParameterName = handler;
    }

    public static z AFInAppEventParameterName(Context context) {
        return getLevel != null ? getLevel : valueOf((SensorManager) context.getApplicationContext().getSystemService("sensor"), AppsFlyer2dXConversionCallback);
    }

    private static z valueOf(SensorManager sensorManager, Handler handler) {
        if (getLevel == null) {
            synchronized (z.class) {
                if (getLevel == null) {
                    getLevel = new z(sensorManager, handler);
                }
            }
        }
        return getLevel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(int i10) {
        return i10 >= 0 && init.get(i10);
    }

    public final List<Map<String, Object>> AFInAppEventType() {
        for (x xVar : this.onDeepLinkingNative.values()) {
            xVar.valueOf(this.onInstallConversionDataLoadedNative, true);
        }
        Map<x, Map<String, Object>> map = this.onInstallConversionDataLoadedNative;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
        }
        return new CopyOnWriteArrayList(Collections.emptyList());
    }

    public final void AFKeystoreWrapper() {
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = this.onConversionDataSuccess;
        if (j10 != 0) {
            this.onAppOpenAttributionNative++;
            if (j10 - currentTimeMillis < 500) {
                this.AFInAppEventParameterName.removeCallbacks(this.AFKeystoreWrapper);
                this.AFInAppEventParameterName.post(this.AFInAppEventType);
                this.onConversionDataSuccess = currentTimeMillis;
            }
        } else {
            this.AFInAppEventParameterName.post(this.AFVersionDeclaration);
            this.AFInAppEventParameterName.post(this.AFInAppEventType);
        }
        this.onConversionDataSuccess = currentTimeMillis;
    }

    public final List<Map<String, Object>> values() {
        synchronized (this.valueOf) {
            try {
                if (!this.onDeepLinkingNative.isEmpty() && this.onInstallConversionFailureNative) {
                    for (x xVar : this.onDeepLinkingNative.values()) {
                        xVar.valueOf(this.onInstallConversionDataLoadedNative, false);
                    }
                }
                if (this.onInstallConversionDataLoadedNative.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.emptyList());
                }
                return new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
