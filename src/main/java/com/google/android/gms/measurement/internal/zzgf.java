package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgf implements Runnable {
    public final /* synthetic */ zzks zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ zzgj zzc;

    public zzgf(zzgj zzgjVar, zzks zzksVar, zzp zzpVar) {
        this.zzc = zzgjVar;
        this.zza = zzksVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkp zzkpVar3;
        zzkpVar = this.zzc.zza;
        zzkpVar.zzA();
        if (this.zza.zza() == null) {
            zzkpVar3 = this.zzc.zza;
            zzkpVar3.zzO(this.zza, this.zzb);
            return;
        }
        zzkpVar2 = this.zzc.zza;
        zzkpVar2.zzV(this.zza, this.zzb);
    }
}
