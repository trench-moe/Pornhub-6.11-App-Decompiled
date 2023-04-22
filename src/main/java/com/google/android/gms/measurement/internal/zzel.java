package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzel implements Runnable {
    private final zzej zza;
    private final int zzb;
    private final Throwable zzc;
    private final byte[] zzd;
    private final String zze;
    private final Map zzf;

    public zzel(String str, zzej zzejVar, int i10, Throwable th, byte[] bArr, Map map, zzek zzekVar) {
        Objects.requireNonNull(zzejVar, "null reference");
        this.zza = zzejVar;
        this.zzb = i10;
        this.zzc = th;
        this.zzd = bArr;
        this.zze = str;
        this.zzf = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza(this.zze, this.zzb, this.zzc, this.zzd, this.zzf);
    }
}
