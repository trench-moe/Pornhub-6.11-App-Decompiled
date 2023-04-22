package com.google.android.gms.measurement.internal;

import w9.s0;

/* loaded from: classes.dex */
final class zzl implements Runnable {
    public final /* synthetic */ s0 zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, s0 s0Var, String str, String str2) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = s0Var;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzt().zzv(this.zza, this.zzb, this.zzc);
    }
}
