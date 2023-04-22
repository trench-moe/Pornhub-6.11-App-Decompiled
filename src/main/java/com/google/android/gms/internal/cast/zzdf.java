package com.google.android.gms.internal.cast;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class zzdf<T> implements Serializable {
    public static <T> zzdf<T> b(T t2) {
        return t2 == null ? zzdc.f6918c : new zzdk(t2);
    }

    public abstract T a();
}
