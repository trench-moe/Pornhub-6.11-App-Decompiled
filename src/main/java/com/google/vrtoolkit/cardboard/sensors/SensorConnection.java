package com.google.vrtoolkit.cardboard.sensors;

import android.app.Activity;
import com.google.vrtoolkit.cardboard.CardboardDeviceParams;
import com.google.vrtoolkit.cardboard.sensors.MagnetSensor;
import com.google.vrtoolkit.cardboard.sensors.NfcSensor;

/* loaded from: classes.dex */
public class SensorConnection implements MagnetSensor.OnCardboardTriggerListener, NfcSensor.OnCardboardNfcListener {
    private final SensorListener listener;
    private MagnetSensor magnetSensor;
    private volatile boolean magnetSensorEnabled = true;
    private NfcSensor nfcSensor;

    /* loaded from: classes.dex */
    public interface SensorListener {
        void onCardboardTrigger();

        void onInsertedIntoCardboard(CardboardDeviceParams cardboardDeviceParams);

        void onRemovedFromCardboard();
    }

    public SensorConnection(SensorListener sensorListener) {
        this.listener = sensorListener;
    }

    public void disableMagnetSensor() {
        this.magnetSensorEnabled = false;
        MagnetSensor magnetSensor = this.magnetSensor;
        if (magnetSensor != null) {
            magnetSensor.stop();
        }
    }

    public NfcSensor getNfcSensor() {
        return this.nfcSensor;
    }

    @Override // com.google.vrtoolkit.cardboard.sensors.MagnetSensor.OnCardboardTriggerListener
    public void onCardboardTrigger() {
        this.listener.onCardboardTrigger();
    }

    public void onCreate(Activity activity) {
        MagnetSensor magnetSensor = new MagnetSensor(activity);
        this.magnetSensor = magnetSensor;
        magnetSensor.setOnCardboardTriggerListener(this);
        NfcSensor nfcSensor = NfcSensor.getInstance(activity);
        this.nfcSensor = nfcSensor;
        nfcSensor.addOnCardboardNfcListener(this);
        this.nfcSensor.onNfcIntent(activity.getIntent());
    }

    public void onDestroy(Activity activity) {
        this.nfcSensor.removeOnCardboardNfcListener(this);
    }

    @Override // com.google.vrtoolkit.cardboard.sensors.NfcSensor.OnCardboardNfcListener
    public void onInsertedIntoCardboard(CardboardDeviceParams cardboardDeviceParams) {
        this.listener.onInsertedIntoCardboard(cardboardDeviceParams);
    }

    public void onPause(Activity activity) {
        this.magnetSensor.stop();
        this.nfcSensor.onPause(activity);
    }

    @Override // com.google.vrtoolkit.cardboard.sensors.NfcSensor.OnCardboardNfcListener
    public void onRemovedFromCardboard() {
        this.listener.onRemovedFromCardboard();
    }

    public void onResume(Activity activity) {
        if (this.magnetSensorEnabled) {
            this.magnetSensor.start();
        }
        this.nfcSensor.onResume(activity);
    }
}
