package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzji implements Runnable {
    public final /* synthetic */ zzjj zza;

    public zzji(zzjj zzjjVar) {
        this.zza = zzjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zza.zzb = null;
        this.zza.zza.zzP();
    }
}
