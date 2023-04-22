package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzig implements Runnable {
    public final /* synthetic */ zzik zza;

    public zzig(zzik zzikVar) {
        this.zza = zzikVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzid zzidVar;
        zzik zzikVar = this.zza;
        zzidVar = zzikVar.zzh;
        zzikVar.zza = zzidVar;
    }
}
