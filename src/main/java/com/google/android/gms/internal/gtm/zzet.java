package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
public final class zzet<V> {
    private final zzes<V> zza;
    private final V zzb;
    private final V zzc;
    private final Object zzd = new Object();

    private zzet(V v2, V v10, zzes<V> zzesVar) {
        this.zzb = v2;
        this.zzc = v10;
        this.zza = zzesVar;
    }

    public static <T> zzet<T> zza(T t2, T t8, zzes<T> zzesVar) {
        return new zzet<>(t2, t8, zzesVar);
    }

    public final V zzb() {
        synchronized (this.zzd) {
        }
        return this.zzb;
    }
}
