package com.google.android.gms.measurement.internal;

import android.os.Handler;
import java.util.Objects;
import r3.c;
import w9.k0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzan {
    private static volatile Handler zza;
    private final zzgm zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzan(zzgm zzgmVar) {
        Objects.requireNonNull(zzgmVar, "null reference");
        this.zzb = zzgmVar;
        this.zzc = new zzam(this, zzgmVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzan.class) {
            if (zza == null) {
                zza = new k0(this.zzb.zzau().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public final void zzb() {
        this.zzd = 0L;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j10) {
        zzb();
        if (j10 >= 0) {
            Objects.requireNonNull((c) this.zzb.zzav());
            this.zzd = System.currentTimeMillis();
            if (!zzf().postDelayed(this.zzc, j10)) {
                this.zzb.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j10));
            }
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
