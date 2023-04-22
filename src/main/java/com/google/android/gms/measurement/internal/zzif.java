package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzif implements Runnable {
    public final /* synthetic */ zzid zza;
    public final /* synthetic */ zzid zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzik zze;

    public zzif(zzik zzikVar, zzid zzidVar, zzid zzidVar2, long j10, boolean z10) {
        this.zze = zzikVar;
        this.zza = zzidVar;
        this.zzb = zzidVar2;
        this.zzc = j10;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzB(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
