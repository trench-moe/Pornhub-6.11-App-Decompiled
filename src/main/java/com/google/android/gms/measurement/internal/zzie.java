package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzie implements Runnable {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzid zzb;
    public final /* synthetic */ zzid zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzik zze;

    public zzie(zzik zzikVar, Bundle bundle, zzid zzidVar, zzid zzidVar2, long j10) {
        this.zze = zzikVar;
        this.zza = bundle;
        this.zzb = zzidVar;
        this.zzc = zzidVar2;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik.zzp(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
