package com.google.android.gms.measurement.internal;

import a0.a;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzio implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzjk zzb;

    public zzio(zzjk zzjkVar, zzp zzpVar) {
        this.zzb = zzjkVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjk zzjkVar = this.zzb;
        zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            a.t(zzjkVar.zzs, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Objects.requireNonNull(this.zza, "null reference");
            zzdxVar.zzm(this.zza);
        } catch (RemoteException e10) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e10);
        }
        this.zzb.zzQ();
    }
}
