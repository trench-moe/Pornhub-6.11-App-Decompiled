package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhr implements Runnable {
    public final /* synthetic */ zzah zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ zzhw zze;

    public zzhr(zzhw zzhwVar, zzah zzahVar, int i10, long j10, boolean z10) {
        this.zze = zzhwVar;
        this.zza = zzahVar;
        this.zzb = i10;
        this.zzc = j10;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzW(this.zza);
        zzhw.zzv(this.zze, this.zza, this.zzb, this.zzc, false, this.zzd);
    }
}
