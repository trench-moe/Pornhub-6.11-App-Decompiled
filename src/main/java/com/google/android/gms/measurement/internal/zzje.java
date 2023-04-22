package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzje implements Runnable {
    public final /* synthetic */ zzdx zza;
    public final /* synthetic */ zzjj zzb;

    public zzje(zzjj zzjjVar, zzdx zzdxVar) {
        this.zzb = zzjjVar;
        this.zza = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzay().zzj().zza("Connected to service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
