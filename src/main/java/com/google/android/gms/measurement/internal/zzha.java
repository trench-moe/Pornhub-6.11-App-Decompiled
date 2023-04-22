package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzha implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzhw zzb;

    public zzha(zzhw zzhwVar, long j10) {
        this.zzb = zzhwVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
