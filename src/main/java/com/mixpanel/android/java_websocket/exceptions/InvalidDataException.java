package com.mixpanel.android.java_websocket.exceptions;

/* loaded from: classes.dex */
public class InvalidDataException extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;
    private int closecode;

    public InvalidDataException(int i10) {
        this.closecode = i10;
    }

    public InvalidDataException(int i10, String str) {
        super(str);
        this.closecode = i10;
    }

    public InvalidDataException(int i10, Throwable th) {
        super(th);
        this.closecode = i10;
    }

    public int a() {
        return this.closecode;
    }
}
