package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;
import r3.c;

/* loaded from: classes.dex */
final class zzkl implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb = "_err";
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ zzkm zzd;

    public zzkl(zzkm zzkmVar, String str, String str2, Bundle bundle) {
        this.zzd = zzkmVar;
        this.zza = str;
        this.zzc = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkw zzv = this.zzd.zza.zzv();
        String str = this.zza;
        String str2 = this.zzb;
        Bundle bundle = this.zzc;
        Objects.requireNonNull((c) this.zzd.zza.zzav());
        zzau zzz = zzv.zzz(str, str2, bundle, "auto", System.currentTimeMillis(), false, true);
        zzkp zzkpVar = this.zzd.zza;
        Objects.requireNonNull(zzz, "null reference");
        zzkpVar.zzE(zzz, this.zza);
    }
}
