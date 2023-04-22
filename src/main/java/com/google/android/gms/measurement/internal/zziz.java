package com.google.android.gms.measurement.internal;

import a0.a;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zziz implements Runnable {
    public final /* synthetic */ zzp zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzau zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzjk zze;

    public zziz(zzjk zzjkVar, boolean z10, zzp zzpVar, boolean z11, zzau zzauVar, String str) {
        this.zze = zzjkVar;
        this.zza = zzpVar;
        this.zzb = z11;
        this.zzc = zzauVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdx zzdxVar;
        zzjk zzjkVar = this.zze;
        zzdxVar = zzjkVar.zzb;
        if (zzdxVar == null) {
            a.t(zzjkVar.zzs, "Discarding data. Failed to send event to service");
            return;
        }
        Objects.requireNonNull(this.zza, "null reference");
        this.zze.zzD(zzdxVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
