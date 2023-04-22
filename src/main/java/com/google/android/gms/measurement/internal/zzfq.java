package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfq implements Runnable {
    public final /* synthetic */ zzgu zza;
    public final /* synthetic */ zzfr zzb;

    public zzfq(zzfr zzfrVar, zzgu zzguVar) {
        this.zzb = zzfrVar;
        this.zza = zzguVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfr.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
