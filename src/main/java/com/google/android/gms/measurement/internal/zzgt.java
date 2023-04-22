package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgt implements zzeb {
    public final /* synthetic */ zzfr zza;

    public zzgt(zzgu zzguVar, zzfr zzfrVar) {
        this.zza = zzfrVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzeb
    public final boolean zza() {
        return this.zza.zzL() && Log.isLoggable(this.zza.zzay().zzq(), 3);
    }
}
