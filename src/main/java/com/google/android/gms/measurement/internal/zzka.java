package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import r3.c;
import w9.k0;

/* loaded from: classes.dex */
public final class zzka extends zzf {
    public final zzjz zza;
    public final zzjy zzb;
    public final zzjw zzc;
    private Handler zzd;

    public zzka(zzfr zzfrVar) {
        super(zzfrVar);
        this.zza = new zzjz(this);
        this.zzb = new zzjy(this);
        this.zzc = new zzjw(this);
    }

    public static /* bridge */ /* synthetic */ void zzj(zzka zzkaVar, long j10) {
        zzkaVar.zzg();
        zzkaVar.zzm();
        zzkaVar.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j10));
        zzkaVar.zzc.zza(j10);
        if (zzkaVar.zzs.zzf().zzu()) {
            zzkaVar.zzb.zzb(j10);
        }
    }

    public static void zzl(zzka zzkaVar, long j10) {
        zzkaVar.zzg();
        zzkaVar.zzm();
        zzkaVar.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j10));
        if (zzkaVar.zzs.zzf().zzu() || zzkaVar.zzs.zzm().zzl.zzb()) {
            zzkaVar.zzb.zzc(j10);
        }
        zzkaVar.zzc.zzb();
        zzjz zzjzVar = zzkaVar.zza;
        zzjzVar.zza.zzg();
        if (zzjzVar.zza.zzs.zzJ()) {
            Objects.requireNonNull((c) zzjzVar.zza.zzs.zzav());
            zzjzVar.zzb(System.currentTimeMillis(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new k0(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }
}
