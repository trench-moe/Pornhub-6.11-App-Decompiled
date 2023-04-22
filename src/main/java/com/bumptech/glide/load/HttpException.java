package com.bumptech.glide.load;

import java.io.IOException;

/* loaded from: classes.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(String str, int i10, Throwable th) {
        super(str + ", status code: " + i10, th);
        this.statusCode = i10;
    }
}
