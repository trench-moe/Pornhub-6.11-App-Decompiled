package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzfz implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzgj zzb;

    public zzfz(zzgj zzgjVar, zzp zzpVar) {
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
        zzkpVar2.zzP(this.zza);
    }
}
