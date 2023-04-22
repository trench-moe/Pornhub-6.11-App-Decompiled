package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import java.util.Objects;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjy {
    public long zza;
    public long zzb;
    public final /* synthetic */ zzka zzc;
    private final zzan zzd;

    public zzjy(zzka zzkaVar) {
        this.zzc = zzkaVar;
        this.zzd = new zzjx(this, zzkaVar.zzs);
        Objects.requireNonNull((c) zzkaVar.zzs.zzav());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    public final void zza() {
        this.zzd.zzb();
        this.zza = 0L;
        this.zzb = 0L;
    }

    public final void zzb(long j10) {
        this.zzd.zzb();
    }

    public final void zzc(long j10) {
        this.zzc.zzg();
        this.zzd.zzb();
        this.zza = j10;
        this.zzb = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00af, code lost:
        r0 = r9 - r6.zzb;
        r6.zzb = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(boolean r7, boolean r8, long r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjy.zzd(boolean, boolean, long):boolean");
    }
}
