package com.google.android.gms.measurement.internal;

import h9.o;

/* loaded from: classes.dex */
final class zzgb implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzgj zzb;

    public zzgb(zzgj zzgjVar, zzp zzpVar) {
        this.zzb = zzgjVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzb.zza;
        zzkpVar.zzA();
        zzkpVar2 = this.zzb.zza;
        zzp zzpVar = this.zza;
        zzkpVar2.zzaz().zzg();
        zzkpVar2.zzB();
        o.e(zzpVar.zza);
        zzah zzb = zzah.zzb(zzpVar.zzv);
        zzah zzh = zzkpVar2.zzh(zzpVar.zza);
        zzkpVar2.zzay().zzj().zzc("Setting consent, package, consent", zzpVar.zza, zzb);
        zzkpVar2.zzU(zzpVar.zza, zzb);
        if (zzb.zzk(zzh)) {
            zzkpVar2.zzP(zzpVar);
        }
    }
}
