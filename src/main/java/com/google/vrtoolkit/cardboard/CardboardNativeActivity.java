package com.google.vrtoolkit.cardboard;

import android.app.NativeActivity;
import android.nfc.NdefMessage;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.vrtoolkit.cardboard.VolumeKeyState;
import com.google.vrtoolkit.cardboard.sensors.NfcSensor;
import com.google.vrtoolkit.cardboard.sensors.SensorConnection;

/* loaded from: classes.dex */
public class CardboardNativeActivity extends NativeActivity implements SensorConnection.SensorListener, VolumeKeyState.Handler {
    private CardboardView cardboardView;
    private final SensorConnection sensorConnection = new SensorConnection(this);
    private final VolumeKeyState volumeKeyState = new VolumeKeyState(this);
    private final FullscreenMode fullscreenMode = new FullscreenMode(this);

    @Override // com.google.vrtoolkit.cardboard.VolumeKeyState.Handler
    public boolean areVolumeKeysDisabled() {
        return this.volumeKeyState.areVolumeKeysDisabled(this.sensorConnection.getNfcSensor());
    }

    public CardboardView getCardboardView() {
        return this.cardboardView;
    }

    public NfcSensor getNfcSensor() {
        return this.sensorConnection.getNfcSensor();
    }

    public int getVolumeKeysMode() {
        return this.volumeKeyState.getVolumeKeysMode();
    }

    @Override // com.google.vrtoolkit.cardboard.sensors.SensorConnection.SensorListener
    public void onCardboardTrigger() {
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.fullscreenMode.startFullscreenMode();
        this.sensorConnection.onCreate(this);
        this.volumeKeyState.onCreate();
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onDestroy() {
        this.sensorConnection.onDestroy(this);
        super.onDestroy();
    }

    @Override // com.google.vrtoolkit.cardboard.sensors.SensorConnection.SensorListener
    public void onInsertedIntoCardboard(CardboardDeviceParams cardboardDeviceParams) {
        updateCardboardDeviceParams(cardboardDeviceParams);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!this.volumeKeyState.onKey(i10) && !super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.volumeKeyState.onKey(i10) && !super.onKeyUp(i10, keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        CardboardView cardboardView = this.cardboardView;
        if (cardboardView != null) {
            cardboardView.onPause();
        }
        this.sensorConnection.onPause(this);
    }

    @Override // com.google.vrtoolkit.cardboard.sensors.SensorConnection.SensorListener
    public void onRemovedFromCardboard() {
    }

    @Override // android.app.NativeActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CardboardView cardboardView = this.cardboardView;
        if (cardboardView != null) {
            cardboardView.onResume();
        }
        this.sensorConnection.onResume(this);
        this.fullscreenMode.setFullscreenMode();
    }

    @Override // android.app.NativeActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.fullscreenMode.onWindowFocusChanged(z10);
    }

    public void setCardboardView(CardboardView cardboardView) {
        NdefMessage tagContents;
        this.cardboardView = cardboardView;
        if (cardboardView == null || (tagContents = this.sensorConnection.getNfcSensor().getTagContents()) == null) {
            return;
        }
        updateCardboardDeviceParams(CardboardDeviceParams.createFromNfcContents(tagContents));
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        if (view instanceof CardboardView) {
            setCardboardView((CardboardView) view);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof CardboardView) {
            setCardboardView((CardboardView) view);
        }
        super.setContentView(view, layoutParams);
    }

    public void setVolumeKeysMode(int i10) {
        this.volumeKeyState.setVolumeKeysMode(i10);
    }

    public void updateCardboardDeviceParams(CardboardDeviceParams cardboardDeviceParams) {
        CardboardView cardboardView = this.cardboardView;
        if (cardboardView != null) {
            cardboardView.updateCardboardDeviceParams(cardboardDeviceParams);
        }
    }
}
