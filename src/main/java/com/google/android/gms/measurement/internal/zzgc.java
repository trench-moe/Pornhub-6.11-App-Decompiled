package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzgc implements Runnable {
    public final /* synthetic */ zzau zza;
    public final /* synthetic */ zzp zzb;
    public final /* synthetic */ zzgj zzc;

    public zzgc(zzgj zzgjVar, zzau zzauVar, zzp zzpVar) {
        this.zzc = zzgjVar;
        this.zza = zzauVar;
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
