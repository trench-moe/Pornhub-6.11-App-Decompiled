package com.google.android.gms.internal.gtm;

import android.os.Handler;
import java.util.Objects;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzcw {
    private static volatile Handler zza;
    private final zzbv zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzcw(zzbv zzbvVar) {
        Objects.requireNonNull(zzbvVar, "null reference");
        this.zzb = zzbvVar;
        this.zzc = new zzcv(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcw.class) {
            if (zza == null) {
                zza = new zzga(this.zzb.zza().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        Objects.requireNonNull((c) this.zzb.zzr());
        return Math.abs(System.currentTimeMillis() - this.zzd);
    }

    public final void zze(long j10) {
        if (zzh()) {
            long j11 = 0;
            if (j10 < 0) {
                zzf();
                return;
            }
            Objects.requireNonNull((c) this.zzb.zzr());
            long abs = j10 - Math.abs(System.currentTimeMillis() - this.zzd);
            if (abs >= 0) {
                j11 = abs;
            }
            zzi().removeCallbacks(this.zzc);
            if (!zzi().postDelayed(this.zzc, j11)) {
                this.zzb.zzm().zzK("Failed to adjust delayed post. time", Long.valueOf(j11));
            }
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j10) {
        zzf();
        if (j10 >= 0) {
            Objects.requireNonNull((c) this.zzb.zzr());
            this.zzd = System.currentTimeMillis();
            if (zzi().postDelayed(this.zzc, j10)) {
                return;
            }
            this.zzb.zzm().zzK("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}
