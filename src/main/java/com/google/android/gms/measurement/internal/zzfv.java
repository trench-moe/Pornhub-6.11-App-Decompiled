package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzfv implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzgj zzd;

    public zzfv(zzgj zzgjVar, String str, String str2, String str3) {
        this.zzd = zzgjVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzd.zza;
        zzkpVar.zzA();
        zzkpVar2 = this.zzd.zza;
        return zzkpVar2.zzi().zzv(this.zza, this.zzb, this.zzc);
    }
}
