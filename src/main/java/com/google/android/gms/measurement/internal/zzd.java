package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.support.v4.media.b;
import h9.o;
import java.util.Map;
import p.a;

/* loaded from: classes.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzb = new a();
        this.zza = new a();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        o.e(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j10;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            android.support.v4.media.a.m(zzdVar.zzs, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j10));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j10) {
        zzdVar.zzg();
        o.e(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzs.zzay().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzid zzj = zzdVar.zzs.zzs().zzj(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l10 = (Long) zzdVar.zza.get(str);
        if (l10 == null) {
            a0.a.t(zzdVar.zzs, "First ad unit exposure time was never set");
        } else {
            long longValue = l10.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, j10 - longValue, zzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j11 = zzdVar.zzc;
            if (j11 == 0) {
                a0.a.t(zzdVar.zzs, "First ad exposure time was never set");
            } else {
                zzdVar.zzh(j10 - j11, zzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    private final void zzh(long j10, zzid zzidVar) {
        if (zzidVar == null) {
            b.s(this.zzs, "Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            zzkw.zzJ(zzidVar, bundle, true);
            this.zzs.zzq().zzG("am", "_xa", bundle);
        }
    }

    private final void zzi(String str, long j10, zzid zzidVar) {
        if (zzidVar == null) {
            b.s(this.zzs, "Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            this.zzs.zzay().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            zzkw.zzJ(zzidVar, bundle, true);
            this.zzs.zzq().zzG("am", "_xu", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(long j10) {
        for (String str : this.zza.keySet()) {
            this.zza.put(str, Long.valueOf(j10));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j10;
    }

    public final void zzd(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaz().zzp(new zza(this, str, j10));
            return;
        }
        a0.a.t(this.zzs, "Ad unit id must be a non-empty string");
    }

    public final void zze(String str, long j10) {
        if (str != null && str.length() != 0) {
            this.zzs.zzaz().zzp(new zzb(this, str, j10));
            return;
        }
        a0.a.t(this.zzs, "Ad unit id must be a non-empty string");
    }

    public final void zzf(long j10) {
        zzid zzj = this.zzs.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j10 - ((Long) this.zza.get(str)).longValue(), zzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j10 - this.zzc, zzj);
        }
        zzj(j10);
    }
}
