package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.c0;

/* loaded from: classes.dex */
final class zzgi implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ long zzd;
    public final /* synthetic */ zzgj zze;

    public zzgi(zzgj zzgjVar, String str, String str2, String str3, long j10) {
        this.zze = zzgjVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp zzkpVar;
        zzkp zzkpVar2;
        zzkp zzkpVar3;
        zzkp zzkpVar4;
        zzkp zzkpVar5;
        c0.b();
        zzkpVar = this.zze.zza;
        if (zzkpVar.zzg().zzs(null, zzdu.zzat)) {
            String str = this.zza;
            if (str == null) {
                zzkpVar5 = this.zze.zza;
                zzkpVar5.zzQ(this.zzb, null);
                return;
            }
            zzid zzidVar = new zzid(this.zzc, str, this.zzd);
            zzkpVar4 = this.zze.zza;
            zzkpVar4.zzQ(this.zzb, zzidVar);
            return;
        }
        String str2 = this.zza;
        if (str2 == null) {
            zzkpVar3 = this.zze.zza;
            zzkpVar3.zzq().zzs().zzy(this.zzb, null);
            return;
        }
        zzid zzidVar2 = new zzid(this.zzc, str2, this.zzd);
        zzkpVar2 = this.zze.zza;
        zzkpVar2.zzq().zzs().zzy(this.zzb, zzidVar2);
    }
}
