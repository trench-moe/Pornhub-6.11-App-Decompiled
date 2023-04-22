package com.google.android.exoplayer2.upstream;

import j8.h;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final h dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(h hVar, int i10, int i11) {
        super(a(i10, i11));
        this.dataSpec = hVar;
        this.type = i11;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, h hVar, int i10, int i11) {
        super(iOException, a(i10, i11));
        this.dataSpec = hVar;
        this.type = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, h hVar, int i10, int i11) {
        super(str, a(i10, i11));
        this.dataSpec = hVar;
        this.type = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, h hVar, int i10, int i11) {
        super(str, iOException, a(i10, i11));
        this.dataSpec = hVar;
        this.type = i11;
    }

    public static int a(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException b(final IOException iOException, final h hVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !t3.a.v(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, hVar) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, hVar, i11, i10);
    }
}
