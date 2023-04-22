package com.google.vrtoolkit.cardboard.sensors;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class MagnetSensor {
    private static final String HTC_ONE_M8_MODEL = "HTC_M8x";
    private static final String HTC_ONE_MODEL = "HTC One";
    private TriggerDetector detector;
    private Thread detectorThread;

    /* loaded from: classes.dex */
    public interface OnCardboardTriggerListener {
        void onCardboardTrigger();
    }

    /* loaded from: classes.dex */
    public static class ThresholdTriggerDetector extends TriggerDetector {
        private static final long NS_SEGMENT_SIZE = 200000000;
        private static final long NS_WAIT_TIME = 350000000;
        private static final long NS_WINDOW_SIZE = 400000000;

        /* renamed from: t1  reason: collision with root package name */
        private static int f8109t1 = 30;
        private static int t2 = 60;
        private long lastFiring;
        private ArrayList<float[]> sensorData;
        private ArrayList<Long> sensorTimes;

        public ThresholdTriggerDetector(Context context) {
            super(context);
            this.lastFiring = 0L;
            this.sensorData = new ArrayList<>();
            this.sensorTimes = new ArrayList<>();
        }

        public ThresholdTriggerDetector(Context context, int i10, int i11) {
            super(context);
            this.lastFiring = 0L;
            this.sensorData = new ArrayList<>();
            this.sensorTimes = new ArrayList<>();
            f8109t1 = i10;
            t2 = i11;
        }

        private void addData(float[] fArr, long j10) {
            this.sensorData.add(fArr);
            this.sensorTimes.add(Long.valueOf(j10));
            while (this.sensorTimes.get(0).longValue() < j10 - NS_WINDOW_SIZE) {
                this.sensorData.remove(0);
                this.sensorTimes.remove(0);
            }
            evaluateModel(j10);
        }

        private float computeMaximum(float[] fArr) {
            float f10 = Float.NEGATIVE_INFINITY;
            for (float f11 : fArr) {
                f10 = Math.max(f11, f10);
            }
            return f10;
        }

        private float computeMinimum(float[] fArr) {
            float f10 = Float.POSITIVE_INFINITY;
            for (float f11 : fArr) {
                f10 = Math.min(f11, f10);
            }
            return f10;
        }

        private void computeOffsets(float[] fArr, float[] fArr2) {
            for (int i10 = 0; i10 < this.sensorData.size(); i10++) {
                float[] fArr3 = this.sensorData.get(i10);
                float[] fArr4 = {fArr3[0] - fArr2[0], fArr3[1] - fArr2[1], fArr3[2] - fArr2[2]};
                fArr[i10] = (float) Math.sqrt((fArr4[2] * fArr4[2]) + (fArr4[1] * fArr4[1]) + (fArr4[0] * fArr4[0]));
            }
        }

        private void evaluateModel(long j10) {
            ArrayList<float[]> arrayList;
            if (j10 - this.lastFiring >= NS_WAIT_TIME && this.sensorData.size() >= 2) {
                float[] fArr = this.sensorData.get(arrayList.size() - 1);
                int i10 = 0;
                while (true) {
                    if (i10 >= this.sensorTimes.size()) {
                        i10 = 0;
                        break;
                    } else if (j10 - this.sensorTimes.get(i10).longValue() < NS_SEGMENT_SIZE) {
                        break;
                    } else {
                        i10++;
                    }
                }
                float[] fArr2 = new float[this.sensorData.size()];
                computeOffsets(fArr2, fArr);
                float computeMinimum = computeMinimum(Arrays.copyOfRange(fArr2, 0, i10));
                float computeMaximum = computeMaximum(Arrays.copyOfRange(fArr2, i10, this.sensorData.size()));
                if (computeMinimum >= f8109t1 || computeMaximum <= t2) {
                    return;
                }
                this.lastFiring = j10;
                handleButtonPressed();
            }
        }

        @Override // com.google.vrtoolkit.cardboard.sensors.MagnetSensor.TriggerDetector, android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // com.google.vrtoolkit.cardboard.sensors.MagnetSensor.TriggerDetector, android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.equals(this.magnetometer)) {
                float[] fArr = sensorEvent.values;
                if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
                    return;
                }
                addData((float[]) fArr.clone(), sensorEvent.timestamp);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class TriggerDetector implements Runnable, SensorEventListener {
        public static final String TAG = "TriggerDetector";
        public Handler handler;
        public OnCardboardTriggerListener listener;
        private Looper looper;
        public Sensor magnetometer;
        public SensorManager sensorManager;

        public TriggerDetector(Context context) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            this.sensorManager = sensorManager;
            this.magnetometer = sensorManager.getDefaultSensor(2);
        }

        public void handleButtonPressed() {
            synchronized (this) {
                if (this.listener != null) {
                    this.handler.post(new Runnable() { // from class: com.google.vrtoolkit.cardboard.sensors.MagnetSensor.TriggerDetector.1
                        @Override // java.lang.Runnable
                        public void run() {
                            OnCardboardTriggerListener onCardboardTriggerListener = TriggerDetector.this.listener;
                            if (onCardboardTriggerListener != null) {
                                onCardboardTriggerListener.onCardboardTrigger();
                            }
                        }
                    });
                }
            }
        }

        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.looper = Looper.myLooper();
            this.sensorManager.registerListener(this, this.magnetometer, 0);
            Looper.loop();
        }

        public synchronized void setOnCardboardTriggerListener(OnCardboardTriggerListener onCardboardTriggerListener, Handler handler) {
            try {
                this.listener = onCardboardTriggerListener;
                this.handler = handler;
            } catch (Throwable th) {
                throw th;
            }
        }

        public void stop() {
            this.sensorManager.unregisterListener(this);
            this.looper.quit();
        }
    }

    /* loaded from: classes.dex */
    public static class VectorTriggerDetector extends TriggerDetector {
        private static final long NS_REFRESH_TIME = 350000000;
        private static final long NS_THROWAWAY_SIZE = 500000000;
        private static final long NS_WAIT_SIZE = 100000000;
        private static int xThreshold;
        private static int yThreshold;
        private static int zThreshold;
        private long lastFiring;
        private ArrayList<float[]> sensorData;
        private ArrayList<Long> sensorTimes;

        public VectorTriggerDetector(Context context) {
            super(context);
            this.lastFiring = 0L;
            this.sensorData = new ArrayList<>();
            this.sensorTimes = new ArrayList<>();
            xThreshold = -3;
            yThreshold = 15;
            zThreshold = 6;
        }

        public VectorTriggerDetector(Context context, int i10, int i11, int i12) {
            super(context);
            this.lastFiring = 0L;
            this.sensorData = new ArrayList<>();
            this.sensorTimes = new ArrayList<>();
            xThreshold = i10;
            yThreshold = i11;
            zThreshold = i12;
        }

        private void addData(float[] fArr, long j10) {
            this.sensorData.add(fArr);
            this.sensorTimes.add(Long.valueOf(j10));
            while (this.sensorTimes.get(0).longValue() < j10 - NS_THROWAWAY_SIZE) {
                this.sensorData.remove(0);
                this.sensorTimes.remove(0);
            }
            evaluateModel(j10);
        }

        private void evaluateModel(long j10) {
            if (j10 - this.lastFiring >= NS_REFRESH_TIME) {
                if (this.sensorData.size() < 2) {
                    return;
                }
                int i10 = 1;
                while (true) {
                    if (i10 >= this.sensorTimes.size()) {
                        i10 = 0;
                        break;
                    } else if (j10 - this.sensorTimes.get(i10).longValue() < NS_WAIT_SIZE) {
                        break;
                    } else {
                        i10++;
                    }
                }
                float[] fArr = this.sensorData.get(i10);
                ArrayList<float[]> arrayList = this.sensorData;
                float[] fArr2 = arrayList.get(arrayList.size() - 1);
                if (fArr2[0] - fArr[0] < xThreshold && fArr2[1] - fArr[1] > yThreshold && fArr2[2] - fArr[2] > zThreshold) {
                    this.lastFiring = j10;
                    handleButtonPressed();
                }
            }
        }

        @Override // com.google.vrtoolkit.cardboard.sensors.MagnetSensor.TriggerDetector, android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }

        @Override // com.google.vrtoolkit.cardboard.sensors.MagnetSensor.TriggerDetector, android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.equals(this.magnetometer)) {
                float[] fArr = sensorEvent.values;
                if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
                    return;
                }
                addData((float[]) fArr.clone(), sensorEvent.timestamp);
            }
        }
    }

    public MagnetSensor(Context context) {
        String str = Build.MODEL;
        if (HTC_ONE_MODEL.equals(str) || HTC_ONE_M8_MODEL.equals(str)) {
            this.detector = new VectorTriggerDetector(context);
        } else {
            this.detector = new ThresholdTriggerDetector(context);
        }
    }

    public void setOnCardboardTriggerListener(OnCardboardTriggerListener onCardboardTriggerListener) {
        this.detector.setOnCardboardTriggerListener(onCardboardTriggerListener, new Handler());
    }

    public void start() {
        Thread thread = new Thread(this.detector);
        this.detectorThread = thread;
        thread.start();
    }

    public void stop() {
        Thread thread = this.detectorThread;
        if (thread != null) {
            thread.interrupt();
            this.detector.stop();
        }
    }
}
