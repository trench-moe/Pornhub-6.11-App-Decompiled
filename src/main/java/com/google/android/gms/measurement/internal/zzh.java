package com.google.android.gms.measurement.internal;

import w9.s0;

/* loaded from: classes.dex */
final class zzh implements Runnable {
    public final /* synthetic */ s0 zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzh(AppMeasurementDynamiteService appMeasurementDynamiteService, s0 s0Var) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzt().zzt(this.zza);
    }
}
