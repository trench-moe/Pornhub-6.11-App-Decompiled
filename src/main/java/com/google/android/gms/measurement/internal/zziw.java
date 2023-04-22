package com.google.android.gms.measurement.internal;

import android.support.v4.media.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziw extends zzan {
    public final /* synthetic */ zzjk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziw(zzjk zzjkVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        a.m(this.zza.zzs, "Tasks have been queued for a long time");
    }
}
