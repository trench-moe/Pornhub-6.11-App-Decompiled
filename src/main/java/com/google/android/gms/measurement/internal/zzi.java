package com.google.android.gms.measurement.internal;

import w9.s0;

/* loaded from: classes.dex */
final class zzi implements Runnable {
    public final /* synthetic */ s0 zza;
    public final /* synthetic */ zzau zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ AppMeasurementDynamiteService zzd;

    public zzi(AppMeasurementDynamiteService appMeasurementDynamiteService, s0 s0Var, zzau zzauVar, String str) {
        this.zzd = appMeasurementDynamiteService;
        this.zza = s0Var;
        this.zzb = zzauVar;
        this.zzc = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzt().zzB(this.zza, this.zzb, this.zzc);
    }
}
