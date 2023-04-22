package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import java.util.Objects;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjx extends zzan {
    public final /* synthetic */ zzjy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjx(zzjy zzjyVar, zzgm zzgmVar) {
        super(zzgmVar);
        this.zza = zzjyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        zzjy zzjyVar = this.zza;
        zzjyVar.zzc.zzg();
        Objects.requireNonNull((c) zzjyVar.zzc.zzs.zzav());
        zzjyVar.zzd(false, false, SystemClock.elapsedRealtime());
        zzd zzd = zzjyVar.zzc.zzs.zzd();
        Objects.requireNonNull((c) zzjyVar.zzc.zzs.zzav());
        zzd.zzf(SystemClock.elapsedRealtime());
    }
}
