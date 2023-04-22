package com.google.vrtoolkit.cardboard;

/* loaded from: classes.dex */
public class HeadMountedDisplay {
    private CardboardDeviceParams cardboardDevice;
    private ScreenParams screen;

    public HeadMountedDisplay(HeadMountedDisplay headMountedDisplay) {
        this.screen = new ScreenParams(headMountedDisplay.screen);
        this.cardboardDevice = new CardboardDeviceParams(headMountedDisplay.cardboardDevice);
    }

    public HeadMountedDisplay(ScreenParams screenParams, CardboardDeviceParams cardboardDeviceParams) {
        this.screen = screenParams;
        this.cardboardDevice = cardboardDeviceParams;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof HeadMountedDisplay) {
            HeadMountedDisplay headMountedDisplay = (HeadMountedDisplay) obj;
            return this.screen.equals(headMountedDisplay.screen) && this.cardboardDevice.equals(headMountedDisplay.cardboardDevice);
        }
        return false;
    }

    public CardboardDeviceParams getCardboardDeviceParams() {
        return this.cardboardDevice;
    }

    public ScreenParams getScreenParams() {
        return this.screen;
    }

    public void setCardboardDeviceParams(CardboardDeviceParams cardboardDeviceParams) {
        this.cardboardDevice = new CardboardDeviceParams(cardboardDeviceParams);
    }

    public void setScreenParams(ScreenParams screenParams) {
        this.screen = new ScreenParams(screenParams);
    }
}
