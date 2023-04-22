package com.google.android.gms.measurement.internal;

import a0.a;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzix implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ zzjk zzb;

    public zzix(zzjk zzjkVar, zzp zzpVar) {
        this.zzb = zzjkVar;
        this.zza = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjk zzjkVar = this.zzb;
        zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            a.t(zzjkVar.zzs, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            Objects.requireNonNull(this.zza, "null reference");
            zzdxVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e10) {
            this.zzb.zzs.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e10);
        }
    }
}
