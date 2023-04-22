package com.google.android.gms.measurement.internal;

import a0.a;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzim implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzks zzc;
    public final /* synthetic */ zzjk zzd;

    public zzim(zzjk zzjkVar, zzp zzpVar, boolean z10, zzks zzksVar) {
        this.zzd = zzjkVar;
        this.zza = zzpVar;
        this.zzb = z10;
        this.zzc = zzksVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjk zzjkVar = this.zzd;
        zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            a.t(zzjkVar.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Objects.requireNonNull(this.zza, "null reference");
        this.zzd.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzQ();
    }
}
