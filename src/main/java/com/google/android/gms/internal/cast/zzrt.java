package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes.dex */
public enum zzrt {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(zzoe.f6957c),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzk;

    zzrt(Object obj) {
        this.zzk = obj;
    }
}
