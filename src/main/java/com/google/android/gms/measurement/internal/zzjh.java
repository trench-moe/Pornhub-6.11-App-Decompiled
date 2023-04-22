package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
final class zzjh implements Runnable {
    public final /* synthetic */ zzjj zza;

    public zzjh(zzjj zzjjVar) {
        this.zza = zzjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjk zzjkVar = this.zza.zza;
        Context zzau = zzjkVar.zzs.zzau();
        this.zza.zza.zzs.zzaw();
        zzjk.zzo(zzjkVar, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
