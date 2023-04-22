package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.internal.measurement.i;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import o8.a;
import r3.c;

/* loaded from: classes.dex */
public final class zzjm extends zzkf {
    public final zzes zza;
    public final zzes zzb;
    public final zzes zzc;
    public final zzes zzd;
    public final zzes zze;
    private final Map zzg;
    private String zzh;
    private boolean zzi;
    private long zzj;

    public zzjm(zzkp zzkpVar) {
        super(zzkpVar);
        this.zzg = new HashMap();
        zzew zzm = this.zzs.zzm();
        Objects.requireNonNull(zzm);
        this.zza = new zzes(zzm, "last_delete_stale", 0L);
        zzew zzm2 = this.zzs.zzm();
        Objects.requireNonNull(zzm2);
        this.zzb = new zzes(zzm2, "backoff", 0L);
        zzew zzm3 = this.zzs.zzm();
        Objects.requireNonNull(zzm3);
        this.zzc = new zzes(zzm3, "last_upload", 0L);
        zzew zzm4 = this.zzs.zzm();
        Objects.requireNonNull(zzm4);
        this.zzd = new zzes(zzm4, "last_upload_attempt", 0L);
        zzew zzm5 = this.zzs.zzm();
        Objects.requireNonNull(zzm5);
        this.zze = new zzes(zzm5, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair zza(String str) {
        zzjl zzjlVar;
        zzg();
        Objects.requireNonNull((c) this.zzs.zzav());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        i.b();
        if (this.zzs.zzf().zzs(null, zzdu.zzar)) {
            zzjl zzjlVar2 = (zzjl) this.zzg.get(str);
            if (zzjlVar2 != null && elapsedRealtime < zzjlVar2.zzc) {
                return new Pair(zzjlVar2.zza, Boolean.valueOf(zzjlVar2.zzb));
            }
            long zzi = this.zzs.zzf().zzi(str, zzdu.zza) + elapsedRealtime;
            try {
                a.C0239a a10 = a.a(this.zzs.zzau());
                String str2 = a10.f13613a;
                zzjlVar = str2 != null ? new zzjl(str2, a10.f13614b, zzi) : new zzjl(BuildConfig.FLAVOR, a10.f13614b, zzi);
            } catch (Exception e10) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e10);
                zzjlVar = new zzjl(BuildConfig.FLAVOR, false, zzi);
            }
            this.zzg.put(str, zzjlVar);
            return new Pair(zzjlVar.zza, Boolean.valueOf(zzjlVar.zzb));
        }
        String str3 = this.zzh;
        if (str3 == null || elapsedRealtime >= this.zzj) {
            this.zzj = this.zzs.zzf().zzi(str, zzdu.zza) + elapsedRealtime;
            try {
                a.C0239a a11 = a.a(this.zzs.zzau());
                this.zzh = BuildConfig.FLAVOR;
                String str4 = a11.f13613a;
                if (str4 != null) {
                    this.zzh = str4;
                }
                this.zzi = a11.f13614b;
            } catch (Exception e11) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e11);
                this.zzh = BuildConfig.FLAVOR;
            }
            return new Pair(this.zzh, Boolean.valueOf(this.zzi));
        }
        return new Pair(str3, Boolean.valueOf(this.zzi));
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzb() {
        return false;
    }

    public final Pair zzd(String str, zzah zzahVar) {
        return zzahVar.zzi(zzag.AD_STORAGE) ? zza(str) : new Pair(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    @Deprecated
    public final String zzf(String str) {
        zzg();
        String str2 = (String) zza(str).first;
        MessageDigest zzE = zzkw.zzE();
        if (zzE == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzE.digest(str2.getBytes())));
    }
}
