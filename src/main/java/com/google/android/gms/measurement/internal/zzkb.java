package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import java.util.Objects;
import l9.b;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkb {
    private final b zza;
    private long zzb;

    public zzkb(b bVar) {
        Objects.requireNonNull(bVar, "null reference");
        this.zza = bVar;
    }

    public final void zza() {
        this.zzb = 0L;
    }

    public final void zzb() {
        Objects.requireNonNull((c) this.zza);
        this.zzb = SystemClock.elapsedRealtime();
    }

    public final boolean zzc(long j10) {
        if (this.zzb == 0) {
            return true;
        }
        Objects.requireNonNull((c) this.zza);
        return SystemClock.elapsedRealtime() - this.zzb >= 3600000;
    }
}
