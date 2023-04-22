package com.google.android.gms.measurement.internal;

import w9.s0;

/* loaded from: classes.dex */
final class zzj implements Runnable {
    public final /* synthetic */ s0 zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ AppMeasurementDynamiteService zze;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, s0 s0Var, String str, String str2, boolean z10) {
        this.zze = appMeasurementDynamiteService;
        this.zza = s0Var;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza.zzt().zzy(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
