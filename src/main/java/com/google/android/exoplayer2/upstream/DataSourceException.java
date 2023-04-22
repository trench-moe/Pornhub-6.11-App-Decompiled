package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {
    public final int reason;

    public DataSourceException(int i10) {
        this.reason = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.reason = i10;
    }

    public DataSourceException(String str, Throwable th, int i10) {
        super(str, th);
        this.reason = i10;
    }

    public DataSourceException(Throwable th, int i10) {
        super(th);
        this.reason = i10;
    }
}
