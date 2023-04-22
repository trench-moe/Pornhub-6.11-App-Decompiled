package com.google.android.gms.internal.gtm;

/* loaded from: classes.dex */
final class zzev implements zzcr<zzew> {
    private final zzbv zza;
    private final zzew zzb = new zzew();

    public zzev(zzbv zzbvVar) {
        this.zza = zzbvVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final /* bridge */ /* synthetic */ zzew zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zzb(String str, String str2) {
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zzc(String str, boolean z10) {
        if (!"ga_dryRun".equals(str)) {
            this.zza.zzm().zzS("Bool xml configuration name not recognized", str);
            return;
        }
        this.zzb.zze = z10 ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zzd(String str, int i10) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.zzb.zzd = i10;
        } else {
            this.zza.zzm().zzS("Int xml configuration name not recognized", str);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzcr
    public final void zze(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.zzb.zza = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.zzb.zzb = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.zzb.zzc = str2;
        } else {
            this.zza.zzm().zzS("String xml configuration name not recognized", str);
        }
    }
}
