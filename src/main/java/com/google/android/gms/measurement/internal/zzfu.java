package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfu implements Runnable {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ zzgj zzb;

    public zzfu(zzgj zzgjVar, zzab zzabVar) {
        this.zzb = zzgjVar;
        this.zza = zzabVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkp zzkpVar3;
        zzkpVar = this.zzb.zza;
        zzkpVar.zzA();
        if (this.zza.zzc.zza() == null) {
            zzkpVar3 = this.zzb.zza;
            zzkpVar3.zzM(this.zza);
            return;
        }
        zzkpVar2 = this.zzb.zza;
        zzkpVar2.zzS(this.zza);
    }
}
