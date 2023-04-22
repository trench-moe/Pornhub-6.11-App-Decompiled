package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Objects;
import p8.w;
import r3.c;

/* loaded from: classes.dex */
public final class zzfh extends zzbs {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzfg zzd;

    public zzfh(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzfg(this, "monitoring", zzeu.zzP.zzb().longValue(), null);
    }

    public final long zza() {
        w.b();
        zzW();
        long j10 = this.zzb;
        if (j10 == 0) {
            long j11 = this.zza.getLong("first_run", 0L);
            if (j11 != 0) {
                this.zzb = j11;
                return j11;
            }
            Objects.requireNonNull((c) zzC());
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = this.zza.edit();
            edit.putLong("first_run", currentTimeMillis);
            if (!edit.commit()) {
                zzR("Failed to commit first run time");
            }
            this.zzb = currentTimeMillis;
            return currentTimeMillis;
        }
        return j10;
    }

    public final long zzb() {
        w.b();
        zzW();
        long j10 = this.zzc;
        if (j10 == -1) {
            long j11 = this.zza.getLong("last_dispatch", 0L);
            this.zzc = j11;
            return j11;
        }
        return j10;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfg zze() {
        return this.zzd;
    }

    public final zzfo zzf() {
        return new zzfo(zzC(), zza());
    }

    public final String zzg() {
        w.b();
        zzW();
        String string = this.zza.getString("installation_campaign", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public final void zzi() {
        w.b();
        zzW();
        Objects.requireNonNull((c) zzC());
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.zza.edit();
        edit.putLong("last_dispatch", currentTimeMillis);
        edit.apply();
        this.zzc = currentTimeMillis;
    }
}
