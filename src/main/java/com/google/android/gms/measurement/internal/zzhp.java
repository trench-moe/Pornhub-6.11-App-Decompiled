package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhp implements Runnable {
    public final /* synthetic */ Boolean zza;
    public final /* synthetic */ zzhw zzb;

    public zzhp(zzhw zzhwVar, Boolean bool) {
        this.zzb = zzhwVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzac(this.zza, true);
    }
}
