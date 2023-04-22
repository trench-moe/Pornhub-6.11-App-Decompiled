package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzii implements Runnable {
    public final /* synthetic */ zzid zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ zzik zzc;

    public zzii(zzik zzikVar, zzid zzidVar, long j10) {
        this.zzc = zzikVar;
        this.zza = zzidVar;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzC(this.zza, false, this.zzb);
        zzik zzikVar = this.zzc;
        zzikVar.zza = null;
        zzikVar.zzs.zzt().zzG(null);
    }
}
