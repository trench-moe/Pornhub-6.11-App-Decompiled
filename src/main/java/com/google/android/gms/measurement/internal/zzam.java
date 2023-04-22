package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzam implements Runnable {
    public final /* synthetic */ zzgm zza;
    public final /* synthetic */ zzan zzb;

    public zzam(zzan zzanVar, zzgm zzgmVar) {
        this.zzb = zzanVar;
        this.zza = zzgmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzaw();
        if (zzaa.zza()) {
            this.zza.zzaz().zzp(this);
            return;
        }
        boolean zze = this.zzb.zze();
        this.zzb.zzd = 0L;
        if (zze) {
            this.zzb.zzc();
        }
    }
}
