package com.google.vrtoolkit.cardboard.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import android.view.WindowManager;
import com.google.vrtoolkit.cardboard.sensors.internal.GyroscopeBiasEstimator;
import com.google.vrtoolkit.cardboard.sensors.internal.Matrix3x3d;
import com.google.vrtoolkit.cardboard.sensors.internal.OrientationEKF;
import com.google.vrtoolkit.cardboard.sensors.internal.Vector3d;

/* loaded from: classes.dex */
public class HeadTracker implements SensorEventListener {
    private static final float DEFAULT_NECK_HORIZONTAL_OFFSET = 0.08f;
    private static final float DEFAULT_NECK_MODEL_FACTOR = 1.0f;
    private static final float DEFAULT_NECK_VERTICAL_OFFSET = 0.075f;
    private static final float PREDICTION_TIME_IN_SECONDS = 0.058f;
    private Clock clock;
    private final Display display;
    private GyroscopeBiasEstimator gyroBiasEstimator;
    private long latestGyroEventClockTimeNs;
    private final float[] neckModelTranslation;
    private SensorEventProvider sensorEventProvider;
    private volatile boolean tracking;
    private final float[] ekfToHeadTracker = new float[16];
    private final float[] sensorToDisplay = new float[16];
    private float displayRotation = Float.NaN;
    private final float[] tmpHeadView = new float[16];
    private final float[] tmpHeadView2 = new float[16];
    private float neckModelFactor = DEFAULT_NECK_MODEL_FACTOR;
    private final Object neckModelFactorMutex = new Object();
    private final Object gyroBiasEstimatorMutex = new Object();
    private volatile boolean firstGyroValue = true;
    private float[] initialSystemGyroBias = new float[3];
    private final Vector3d gyroBias = new Vector3d();
    private final Vector3d latestGyro = new Vector3d();
    private final Vector3d latestAcc = new Vector3d();
    private final OrientationEKF tracker = new OrientationEKF();

    public HeadTracker(SensorEventProvider sensorEventProvider, Clock clock, Display display) {
        float[] fArr = new float[16];
        this.neckModelTranslation = fArr;
        this.clock = clock;
        this.sensorEventProvider = sensorEventProvider;
        this.display = display;
        setGyroBiasEstimationEnabled(true);
        Matrix.setIdentityM(fArr, 0);
    }

    public static HeadTracker createFromContext(Context context) {
        return new HeadTracker(new DeviceSensorLooper((SensorManager) context.getSystemService("sensor")), new SystemClock(), ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    public Matrix3x3d getCurrentPoseForTest() {
        return new Matrix3x3d(this.tracker.getRotationMatrix());
    }

    public boolean getGyroBiasEstimationEnabled() {
        boolean z10;
        synchronized (this.gyroBiasEstimatorMutex) {
            z10 = this.gyroBiasEstimator != null;
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getLastHeadView(float[] r17, int r18) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.sensors.HeadTracker.getLastHeadView(float[], int):void");
    }

    public float getNeckModelFactor() {
        float f10;
        synchronized (this.neckModelFactorMutex) {
            f10 = this.neckModelFactor;
        }
        return f10;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            Vector3d vector3d = this.latestAcc;
            float[] fArr = sensorEvent.values;
            vector3d.set(fArr[0], fArr[1], fArr[2]);
            this.tracker.processAcc(this.latestAcc, sensorEvent.timestamp);
            synchronized (this.gyroBiasEstimatorMutex) {
                GyroscopeBiasEstimator gyroscopeBiasEstimator = this.gyroBiasEstimator;
                if (gyroscopeBiasEstimator != null) {
                    gyroscopeBiasEstimator.processAccelerometer(this.latestAcc, sensorEvent.timestamp);
                }
            }
        } else if (sensorEvent.sensor.getType() == 4 || sensorEvent.sensor.getType() == 16) {
            this.latestGyroEventClockTimeNs = this.clock.nanoTime();
            if (sensorEvent.sensor.getType() == 16) {
                if (this.firstGyroValue) {
                    float[] fArr2 = sensorEvent.values;
                    if (fArr2.length == 6) {
                        float[] fArr3 = this.initialSystemGyroBias;
                        fArr3[0] = fArr2[3];
                        fArr3[1] = fArr2[4];
                        fArr3[2] = fArr2[5];
                    }
                }
                Vector3d vector3d2 = this.latestGyro;
                float[] fArr4 = sensorEvent.values;
                float f10 = fArr4[0];
                float[] fArr5 = this.initialSystemGyroBias;
                vector3d2.set(f10 - fArr5[0], fArr4[1] - fArr5[1], fArr4[2] - fArr5[2]);
            } else {
                Vector3d vector3d3 = this.latestGyro;
                float[] fArr6 = sensorEvent.values;
                vector3d3.set(fArr6[0], fArr6[1], fArr6[2]);
            }
            this.firstGyroValue = false;
            synchronized (this.gyroBiasEstimatorMutex) {
                GyroscopeBiasEstimator gyroscopeBiasEstimator2 = this.gyroBiasEstimator;
                if (gyroscopeBiasEstimator2 != null) {
                    gyroscopeBiasEstimator2.processGyroscope(this.latestGyro, sensorEvent.timestamp);
                    this.gyroBiasEstimator.getGyroBias(this.gyroBias);
                    Vector3d vector3d4 = this.latestGyro;
                    Vector3d.sub(vector3d4, this.gyroBias, vector3d4);
                }
            }
            this.tracker.processGyro(this.latestGyro, sensorEvent.timestamp);
        }
    }

    public void resetTracker() {
        this.tracker.reset();
    }

    public void setGyroBiasEstimationEnabled(boolean z10) {
        synchronized (this.gyroBiasEstimatorMutex) {
            if (!z10) {
                this.gyroBiasEstimator = null;
            } else if (this.gyroBiasEstimator == null) {
                this.gyroBiasEstimator = new GyroscopeBiasEstimator();
            }
        }
    }

    public void setGyroBiasEstimator(GyroscopeBiasEstimator gyroscopeBiasEstimator) {
        synchronized (this.gyroBiasEstimatorMutex) {
            this.gyroBiasEstimator = gyroscopeBiasEstimator;
        }
    }

    public void setNeckModelEnabled(boolean z10) {
        if (z10) {
            setNeckModelFactor(DEFAULT_NECK_MODEL_FACTOR);
        } else {
            setNeckModelFactor(0.0f);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void setNeckModelFactor(float r6) {
        /*
            r5 = this;
            r2 = r5
            java.lang.Object r0 = r2.neckModelFactorMutex
            r4 = 2
            monitor-enter(r0)
            r4 = 0
            r1 = r4
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 < 0) goto L1a
            r4 = 4
            r4 = 1065353216(0x3f800000, float:1.0)
            r1 = r4
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 > 0) goto L1a
            r4 = 4
            r4 = 4
            r2.neckModelFactor = r6     // Catch: java.lang.Throwable -> L24
            r4 = 2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            return
        L1a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "factor should be within [0.0, 1.0]"
            r4 = 7
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
            r4 = 4
        L24:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r6
            r4 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.sensors.HeadTracker.setNeckModelFactor(float):void");
    }

    /* JADX WARN: Finally extract failed */
    public void startTracking() {
        if (this.tracking) {
            return;
        }
        this.tracker.reset();
        synchronized (this.gyroBiasEstimatorMutex) {
            try {
                GyroscopeBiasEstimator gyroscopeBiasEstimator = this.gyroBiasEstimator;
                if (gyroscopeBiasEstimator != null) {
                    gyroscopeBiasEstimator.reset();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.firstGyroValue = true;
        this.sensorEventProvider.registerListener(this);
        this.sensorEventProvider.start();
        this.tracking = true;
    }

    public void stopTracking() {
        if (this.tracking) {
            this.sensorEventProvider.unregisterListener(this);
            this.sensorEventProvider.stop();
            this.tracking = false;
        }
    }
}
