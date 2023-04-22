package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzgg implements Callable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ zzgj zzb;

    public zzgg(zzgj zzgjVar, String str) {
        this.zzb = zzgjVar;
        this.zza = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkpVar = this.zzb.zza;
        zzkpVar.zzA();
        zzkpVar2 = this.zzb.zza;
        return zzkpVar2.zzi().zzu(this.zza);
    }
}
