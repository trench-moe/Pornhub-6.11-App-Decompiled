package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjv implements Runnable {
    public final long zza;
    public final long zzb;
    public final /* synthetic */ zzjw zzc;

    public zzjv(zzjw zzjwVar, long j10, long j11) {
        this.zzc = zzjwVar;
        this.zza = j10;
        this.zzb = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzju
            @Override // java.lang.Runnable
            public final void run() {
                zzjv zzjvVar = zzjv.this;
                zzjw zzjwVar = zzjvVar.zzc;
                long j10 = zzjvVar.zza;
                long j11 = zzjvVar.zzb;
                zzjwVar.zza.zzg();
                zzjwVar.zza.zzs.zzay().zzc().zza("Application going to the background");
                zzjwVar.zza.zzs.zzm().zzl.zza(true);
                Bundle bundle = new Bundle();
                if (!zzjwVar.zza.zzs.zzf().zzu()) {
                    zzjwVar.zza.zzb.zzb(j11);
                    zzjwVar.zza.zzb.zzd(false, false, j11);
                }
                zzjwVar.zza.zzs.zzq().zzH("auto", "_ab", j10, bundle);
            }
        });
    }
}
