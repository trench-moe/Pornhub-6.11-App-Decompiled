package com.google.android.gms.internal.gtm;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
abstract class zzxx {
    public final Unsafe zza;

    public zzxx(Unsafe unsafe) {
        this.zza = unsafe;
    }

    public final int zzh(Class<?> cls) {
        return this.zza.arrayBaseOffset(cls);
    }

    public final int zzi(Class<?> cls) {
        return this.zza.arrayIndexScale(cls);
    }

    public final long zzl(Field field) {
        return this.zza.objectFieldOffset(field);
    }
}
