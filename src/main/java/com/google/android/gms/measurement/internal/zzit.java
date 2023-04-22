package com.google.android.gms.measurement.internal;

import a0.a;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzit implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ Bundle zzb;
    public final /* synthetic */ zzjk zzc;

    public zzit(zzjk zzjkVar, zzp zzpVar, Bundle bundle) {
        this.zzc = zzjkVar;
        this.zza = zzpVar;
        this.zzb = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjk zzjkVar = this.zzc;
        zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            a.t(zzjkVar.zzs, "Failed to send default event parameters to service");
            return;
        }
        try {
            Objects.requireNonNull(this.zza, "null reference");
            zzdxVar.zzr(this.zzb, this.zza);
        } catch (RemoteException e10) {
            this.zzc.zzs.zzay().zzd().zzb("Failed to send default event parameters to service", e10);
        }
    }
}
