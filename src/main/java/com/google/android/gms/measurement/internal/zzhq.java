package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhq implements Runnable {
    public final /* synthetic */ zzah zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzhw zzf;

    public zzhq(zzhw zzhwVar, zzah zzahVar, long j10, int i10, long j11, boolean z10) {
        this.zzf = zzhwVar;
        this.zza = zzahVar;
        this.zzb = j10;
        this.zzc = i10;
        this.zzd = j11;
        this.zze = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzf.zzW(this.zza);
        this.zzf.zzL(this.zzb, false);
        zzhw.zzv(this.zzf, this.zza, this.zzc, this.zzd, true, this.zze);
    }
}
