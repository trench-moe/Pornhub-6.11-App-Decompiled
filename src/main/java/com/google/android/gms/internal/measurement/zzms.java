package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes.dex */
public enum zzms {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(BuildConfig.FLAVOR),
    BYTE_STRING(zzix.f7071c),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzk;

    zzms(Object obj) {
        this.zzk = obj;
    }
}
