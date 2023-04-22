package com.google.android.gms.measurement.internal;

import a0.a;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzis implements Runnable {
    public final /* synthetic */ zzid zza;
    public final /* synthetic */ zzjk zzb;

    public zzis(zzjk zzjkVar, zzid zzidVar) {
        this.zzb = zzjkVar;
        this.zza = zzidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjk zzjkVar = this.zzb;
        zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            a.t(zzjkVar.zzs, "Failed to send current screen to service");
            return;
        }
        try {
            zzid zzidVar = this.zza;
            if (zzidVar == null) {
                zzdxVar.zzq(0L, null, null, zzjkVar.zzs.zzau().getPackageName());
            } else {
                zzdxVar.zzq(zzidVar.zzc, zzidVar.zza, zzidVar.zzb, zzjkVar.zzs.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send current screen to the service", e10);
        }
    }
}
