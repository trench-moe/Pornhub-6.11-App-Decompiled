package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzft implements Runnable {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ zzgj zzc;

    public zzft(zzgj zzgjVar, zzab zzabVar, zzp zzpVar) {
        this.zzc = zzgjVar;
        this.zza = zzabVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkp zzkpVar3;
        zzkpVar = this.zzc.zza;
        zzkpVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzkpVar3 = this.zzc.zza;
            zzkpVar3.zzN(this.zza, this.zzb);
            return;
        }
        zzkpVar2 = this.zzc.zza;
        zzkpVar2.zzT(this.zza, this.zzb);
    }
}
