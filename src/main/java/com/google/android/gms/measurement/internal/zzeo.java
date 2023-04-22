package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class zzeo implements Runnable {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzep zzb;

    public zzeo(zzep zzepVar, boolean z10) {
        this.zzb = zzepVar;
        this.zza = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkpVar = this.zzb.zzb;
        zzkpVar.zzI(this.zza);
    }
}
