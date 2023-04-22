package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkk implements Callable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzkp zzb;

    public zzkk(zzkp zzkpVar, zzp zzpVar) {
        this.zzb = zzkpVar;
        this.zza = zzpVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzkp zzkpVar = this.zzb;
        String str = this.zza.zza;
        Objects.requireNonNull(str, "null reference");
        zzah zzh = zzkpVar.zzh(str);
        zzag zzagVar = zzag.ANALYTICS_STORAGE;
        if (zzh.zzi(zzagVar) && zzah.zzb(this.zza.zzv).zzi(zzagVar)) {
            return this.zzb.zzd(this.zza).zzu();
        }
        this.zzb.zzay().zzj().zza("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
