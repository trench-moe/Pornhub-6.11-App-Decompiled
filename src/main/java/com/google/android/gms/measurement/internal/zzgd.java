package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgd implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgj zzc;

    public zzgd(zzgj zzgjVar, zzau zzauVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzc.zza;
        zzkpVar.zzA();
        zzkpVar2 = this.zzc.zza;
        zzkpVar2.zzE(this.zza, this.zzb);
    }
}
