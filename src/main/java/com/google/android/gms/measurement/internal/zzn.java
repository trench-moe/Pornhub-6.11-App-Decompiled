package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import w9.v0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzn implements zzgr {
    public final v0 zza;
    public final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzn(AppMeasurementDynamiteService appMeasurementDynamiteService, v0 v0Var) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = v0Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final void interceptEvent(String str, String str2, Bundle bundle, long j10) {
        try {
            this.zza.w(str, str2, bundle, j10);
        } catch (RemoteException e10) {
            zzfr zzfrVar = this.zzb.zza;
            if (zzfrVar != null) {
                zzfrVar.zzay().zzk().zzb("Event interceptor threw exception", e10);
            }
        }
    }
}
