package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjg implements Runnable {
    public final /* synthetic */ zzdx zza;
    public final /* synthetic */ zzjj zzb;

    public zzjg(zzjj zzjjVar, zzdx zzdxVar) {
        this.zzb = zzjjVar;
        this.zza = zzdxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzL()) {
                this.zzb.zza.zzs.zzay().zzc().zza("Connected to remote service");
                this.zzb.zza.zzJ(this.zza);
            }
        }
    }
}
