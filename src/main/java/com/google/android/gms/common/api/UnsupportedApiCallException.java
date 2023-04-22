package com.google.android.gms.common.api;

import c9.d;

/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final d zza;

    public UnsupportedApiCallException(d dVar) {
        this.zza = dVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.zza));
    }
}
