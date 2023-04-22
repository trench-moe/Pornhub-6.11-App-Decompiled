package com.google.android.gms.measurement.internal;

import android.support.v4.media.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkc extends zzan {
    public final /* synthetic */ zzkd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkc(zzkd zzkdVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzkdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        this.zza.zza();
        b.s(this.zza.zzs, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzW();
    }
}
