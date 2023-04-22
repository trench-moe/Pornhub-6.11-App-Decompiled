package com.mixpanel.android.java_websocket;

/* loaded from: classes.dex */
public interface WebSocket {

    /* loaded from: classes.dex */
    public enum READYSTATE {
        NOT_YET_CONNECTED,
        /* JADX INFO: Fake field, exist only in values array */
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* loaded from: classes.dex */
    public enum Role {
        CLIENT,
        SERVER
    }
}
