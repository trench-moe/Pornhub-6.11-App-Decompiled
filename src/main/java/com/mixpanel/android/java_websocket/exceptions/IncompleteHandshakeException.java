package com.mixpanel.android.java_websocket.exceptions;

/* loaded from: classes.dex */
public class IncompleteHandshakeException extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;
    private int newsize;

    public IncompleteHandshakeException() {
        this.newsize = 0;
    }

    public IncompleteHandshakeException(int i10) {
        this.newsize = i10;
    }

    public int a() {
        return this.newsize;
    }
}
