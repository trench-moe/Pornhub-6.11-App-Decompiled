package com.google.android.exoplayer2.upstream;

import android.support.v4.media.b;
import j8.h;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    public HttpDataSource$InvalidResponseCodeException(int i10, String str, IOException iOException, Map<String, List<String>> map, h hVar, byte[] bArr) {
        super(b.e(26, "Response code: ", i10), iOException, hVar, 2004, 1);
        this.responseCode = i10;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
