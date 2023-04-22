package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzih implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzik zzb;

    public zzih(zzik zzikVar, long j10) {
        this.zzb = zzikVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
