package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.b;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.r;
import java.util.Objects;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzjz {
    public final /* synthetic */ zzka zza;

    public zzjz(zzka zzkaVar) {
        this.zza = zzkaVar;
    }

    public final void zza() {
        this.zza.zzg();
        zzew zzm = this.zza.zzs.zzm();
        Objects.requireNonNull((c) this.zza.zzs.zzav());
        if (zzm.zzk(System.currentTimeMillis())) {
            this.zza.zzs.zzm().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                b.s(this.zza.zzs, "Detected application was in foreground");
                Objects.requireNonNull((c) this.zza.zzs.zzav());
                zzc(System.currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j10, boolean z10) {
        this.zza.zzg();
        this.zza.zzm();
        if (this.zza.zzs.zzm().zzk(j10)) {
            this.zza.zzs.zzm().zzg.zza(true);
        }
        this.zza.zzs.zzm().zzj.zzb(j10);
        if (this.zza.zzs.zzm().zzg.zzb()) {
            zzc(j10, z10);
        }
    }

    public final void zzc(long j10, boolean z10) {
        this.zza.zzg();
        if (this.zza.zzs.zzJ()) {
            this.zza.zzs.zzm().zzj.zzb(j10);
            Objects.requireNonNull((c) this.zza.zzs.zzav());
            this.zza.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(SystemClock.elapsedRealtime()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.zza.zzs.zzq().zzZ("auto", "_sid", valueOf, j10);
            this.zza.zzs.zzm().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.zza.zzs.zzf().zzs(null, zzdu.zzZ) && z10) {
                bundle.putLong("_aib", 1L);
            }
            this.zza.zzs.zzq().zzH("auto", "_s", j10, bundle);
            r.b();
            if (this.zza.zzs.zzf().zzs(null, zzdu.zzac)) {
                String zza = this.zza.zzs.zzm().zzo.zza();
                if (!TextUtils.isEmpty(zza)) {
                    this.zza.zzs.zzq().zzH("auto", "_ssr", j10, b.b("_ffr", zza));
                }
            }
        }
    }
}
