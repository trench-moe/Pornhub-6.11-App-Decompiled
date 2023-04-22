package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjs implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzka zzb;

    public zzjs(zzka zzkaVar, long j10) {
        this.zzb = zzkaVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzka.zzl(this.zzb, this.zza);
    }
}
