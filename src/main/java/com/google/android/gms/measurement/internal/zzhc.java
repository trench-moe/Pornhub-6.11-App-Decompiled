package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhc implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzhw zze;

    public zzhc(zzhw zzhwVar, String str, String str2, Object obj, long j10) {
        this.zze = zzhwVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzZ(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
