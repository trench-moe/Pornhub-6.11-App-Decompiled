package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzjp implements Runnable {
    public final /* synthetic */ zzkp zza;
    public final /* synthetic */ Runnable zzb;

    public zzjp(zzjr zzjrVar, zzkp zzkpVar, Runnable runnable) {
        this.zza = zzkpVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzW();
    }
}
