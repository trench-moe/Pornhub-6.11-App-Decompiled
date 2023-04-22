package com.google.vrtoolkit.cardboard;

import android.support.v4.media.b;
import com.google.vrtoolkit.cardboard.sensors.NfcSensor;

/* loaded from: classes.dex */
final class VolumeKeyState {
    private final Handler handler;
    private int volumeKeysMode = 0;

    /* loaded from: classes.dex */
    public interface Handler {

        /* loaded from: classes.dex */
        public static abstract class VolumeKeys {
            public static final int DISABLED = 1;
            public static final int DISABLED_WHILE_IN_CARDBOARD = 2;
            public static final int NOT_DISABLED = 0;
        }

        boolean areVolumeKeysDisabled();
    }

    public VolumeKeyState(Handler handler) {
        this.handler = handler;
    }

    public boolean areVolumeKeysDisabled(NfcSensor nfcSensor) {
        int i10 = this.volumeKeysMode;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return nfcSensor.isDeviceInCardboard();
                }
                throw new IllegalStateException(b.e(36, "Invalid volume keys mode ", this.volumeKeysMode));
            }
            return true;
        }
        return false;
    }

    public int getVolumeKeysMode() {
        return this.volumeKeysMode;
    }

    public void onCreate() {
        this.volumeKeysMode = 2;
    }

    public boolean onKey(int i10) {
        return (i10 == 24 || i10 == 25) && this.handler.areVolumeKeysDisabled();
    }

    public void setVolumeKeysMode(int i10) {
        this.volumeKeysMode = i10;
    }
}
