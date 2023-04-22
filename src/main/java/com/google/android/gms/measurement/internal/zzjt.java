package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjt implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzka zzb;

    public zzjt(zzka zzkaVar, long j10) {
        this.zzb = zzkaVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzka.zzj(this.zzb, this.zza);
    }
}
