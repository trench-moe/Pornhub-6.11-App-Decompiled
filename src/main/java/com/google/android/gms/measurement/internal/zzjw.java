package com.google.android.gms.measurement.internal;

import android.os.Handler;
import java.util.Objects;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjw {
    public final /* synthetic */ zzka zza;
    private zzjv zzb;

    public zzjw(zzka zzkaVar) {
        this.zza = zzkaVar;
    }

    public final void zza(long j10) {
        Handler handler;
        Objects.requireNonNull((c) this.zza.zzs.zzav());
        this.zzb = new zzjv(this, System.currentTimeMillis(), j10);
        handler = this.zza.zzd;
        handler.postDelayed(this.zzb, 2000L);
    }

    public final void zzb() {
        Handler handler;
        this.zza.zzg();
        zzjv zzjvVar = this.zzb;
        if (zzjvVar != null) {
            handler = this.zza.zzd;
            handler.removeCallbacks(zzjvVar);
        }
        this.zza.zzs.zzm().zzl.zza(false);
    }
}
