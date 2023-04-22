package com.google.android.gms.internal.gtm;

import p8.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzby extends zzcw {
    public final /* synthetic */ zzcc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(zzcc zzccVar, zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcw
    public final void zza() {
        zzcc zzccVar = this.zza;
        w.b();
        if (zzccVar.zzg()) {
            zzccVar.zzO("Inactivity, disconnecting from device AnalyticsService");
            zzccVar.zzc();
        }
    }
}
