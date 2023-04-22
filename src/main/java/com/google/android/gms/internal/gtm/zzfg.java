package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import h9.o;
import java.util.Objects;
import java.util.UUID;
import r3.c;

/* loaded from: classes.dex */
public final class zzfg {
    public final /* synthetic */ zzfh zza;
    private final String zzb;
    private final long zzc;

    public /* synthetic */ zzfg(zzfh zzfhVar, String str, long j10, zzff zzffVar) {
        this.zza = zzfhVar;
        o.e("monitoring");
        o.a(j10 > 0);
        this.zzb = "monitoring";
        this.zzc = j10;
    }

    private final long zzd() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.zza.zza;
        return sharedPreferences.getLong(zzf(), 0L);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        SharedPreferences sharedPreferences;
        Objects.requireNonNull((c) this.zza.zzC());
        long currentTimeMillis = System.currentTimeMillis();
        sharedPreferences = this.zza.zza;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.remove(zze());
        edit.remove(zzb());
        edit.putLong(zzf(), currentTimeMillis);
        edit.commit();
    }

    public final Pair<String, Long> zza() {
        long abs;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        long zzd = zzd();
        if (zzd == 0) {
            abs = 0;
        } else {
            Objects.requireNonNull((c) this.zza.zzC());
            abs = Math.abs(zzd - System.currentTimeMillis());
        }
        long j10 = this.zzc;
        if (abs < j10) {
            return null;
        }
        if (abs > j10 + j10) {
            zzg();
            return null;
        }
        sharedPreferences = this.zza.zza;
        String string = sharedPreferences.getString(zzb(), null);
        sharedPreferences2 = this.zza.zza;
        long j11 = sharedPreferences2.getLong(zze(), 0L);
        zzg();
        if (string != null && j11 > 0) {
            return new Pair<>(string, Long.valueOf(j11));
        }
        return null;
    }

    public final String zzb() {
        return this.zzb.concat(":value");
    }

    public final void zzc(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        if (zzd() == 0) {
            zzg();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        synchronized (this) {
            sharedPreferences = this.zza.zza;
            long j10 = sharedPreferences.getLong(zze(), 0L);
            if (j10 <= 0) {
                sharedPreferences3 = this.zza.zza;
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putString(zzb(), str);
                edit.putLong(zze(), 1L);
                edit.apply();
                return;
            }
            long j11 = j10 + 1;
            sharedPreferences2 = this.zza.zza;
            SharedPreferences.Editor edit2 = sharedPreferences2.edit();
            if ((UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) < Long.MAX_VALUE / j11) {
                edit2.putString(zzb(), str);
            }
            edit2.putLong(zze(), j11);
            edit2.apply();
        }
    }
}
