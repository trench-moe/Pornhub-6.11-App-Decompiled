package cz.msebera.android.httpclient;

import java.io.IOException;

/* loaded from: classes.dex */
public class ConnectionClosedException extends IOException {
    private static final long serialVersionUID = 617550366255636674L;

    public ConnectionClosedException() {
        super("Connection is closed");
    }

    public ConnectionClosedException(String str) {
        super(HttpException.a(str));
    }

    public ConnectionClosedException(String str, Object... objArr) {
        super(HttpException.a(String.format(str, objArr)));
    }
}
