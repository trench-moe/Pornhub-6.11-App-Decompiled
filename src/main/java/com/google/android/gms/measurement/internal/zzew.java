package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import o8.a;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import r3.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzew extends zzgl {
    public static final Pair zza = new Pair(BuildConfig.FLAVOR, 0L);
    public zzeu zzb;
    public final zzes zzc;
    public final zzes zzd;
    public final zzev zze;
    public final zzes zzf;
    public final zzeq zzg;
    public final zzev zzh;
    public final zzeq zzi;
    public final zzes zzj;
    public boolean zzk;
    public final zzeq zzl;
    public final zzeq zzm;
    public final zzes zzn;
    public final zzev zzo;
    public final zzev zzp;
    public final zzes zzq;
    public final zzer zzr;
    private SharedPreferences zzt;
    private String zzu;
    private boolean zzv;
    private long zzw;

    public zzew(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzf = new zzes(this, "session_timeout", 1800000L);
        this.zzg = new zzeq(this, "start_new_session", true);
        this.zzj = new zzes(this, "last_pause_time", 0L);
        this.zzh = new zzev(this, "non_personalized_ads", null);
        this.zzi = new zzeq(this, "allow_remote_dynamite", false);
        this.zzc = new zzes(this, "first_open_time", 0L);
        this.zzd = new zzes(this, "app_install_time", 0L);
        this.zze = new zzev(this, "app_instance_id", null);
        this.zzl = new zzeq(this, "app_backgrounded", false);
        this.zzm = new zzeq(this, "deep_link_retrieval_complete", false);
        this.zzn = new zzes(this, "deep_link_retrieval_attempts", 0L);
        this.zzo = new zzev(this, "firebase_feature_rollouts", null);
        this.zzp = new zzev(this, "deferred_attribution_cache", null);
        this.zzq = new zzes(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzr = new zzer(this, "default_event_parameters", null);
    }

    public final SharedPreferences zza() {
        zzg();
        zzu();
        Objects.requireNonNull(this.zzt, "null reference");
        return this.zzt;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    public final void zzaA() {
        SharedPreferences sharedPreferences = this.zzs.zzau().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzt = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzk = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.zzt.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzs.zzf();
        this.zzb = new zzeu(this, "health_monitor", Math.max(0L, ((Long) zzdu.zzb.zza(null)).longValue()), null);
    }

    public final Pair zzb(String str) {
        zzg();
        Objects.requireNonNull((c) this.zzs.zzav());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.zzu;
        if (str2 != null && elapsedRealtime < this.zzw) {
            return new Pair(str2, Boolean.valueOf(this.zzv));
        }
        this.zzw = this.zzs.zzf().zzi(str, zzdu.zza) + elapsedRealtime;
        try {
            a.C0239a a10 = a.a(this.zzs.zzau());
            this.zzu = BuildConfig.FLAVOR;
            String str3 = a10.f13613a;
            if (str3 != null) {
                this.zzu = str3;
            }
            this.zzv = a10.f13614b;
        } catch (Exception e10) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e10);
            this.zzu = BuildConfig.FLAVOR;
        }
        return new Pair(this.zzu, Boolean.valueOf(this.zzv));
    }

    public final zzah zzc() {
        zzg();
        return zzah.zzb(zza().getString("consent_settings", "G1"));
    }

    public final Boolean zzd() {
        zzg();
        if (zza().contains("measurement_enabled")) {
            return Boolean.valueOf(zza().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zzf() {
        return true;
    }

    public final void zzh(Boolean bool) {
        zzg();
        SharedPreferences.Editor edit = zza().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    public final void zzi(boolean z10) {
        zzg();
        this.zzs.zzay().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = zza().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    public final boolean zzj() {
        SharedPreferences sharedPreferences = this.zzt;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean zzk(long j10) {
        return j10 - this.zzf.zza() > this.zzj.zza();
    }

    public final boolean zzl(int i10) {
        return zzah.zzj(i10, zza().getInt("consent_source", 100));
    }
}
