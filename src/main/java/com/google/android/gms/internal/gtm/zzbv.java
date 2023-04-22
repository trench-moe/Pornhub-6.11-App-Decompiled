package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import h9.o;
import java.util.List;
import java.util.Objects;
import l9.b;
import p8.c;
import p8.w;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class zzbv {
    private static volatile zzbv zza;
    private final Context zzb;
    private final Context zzc;
    private final b zzd;
    private final zzct zze;
    private final zzfb zzf;
    private final w zzg;
    private final zzbq zzh;
    private final zzcy zzi;
    private final zzft zzj;
    private final zzfh zzk;
    private final c zzl;
    private final zzcn zzm;
    private final zzbi zzn;
    private final zzcf zzo;
    private final zzcx zzp;

    public zzbv(zzbw zzbwVar) {
        Context zza2 = zzbwVar.zza();
        o.i(zza2, "Application context can't be null");
        Context zzb = zzbwVar.zzb();
        Objects.requireNonNull(zzb, "null reference");
        this.zzb = zza2;
        this.zzc = zzb;
        this.zzd = r3.c.f14634j;
        this.zze = new zzct(this);
        zzfb zzfbVar = new zzfb(this);
        zzfbVar.zzX();
        this.zzf = zzfbVar;
        zzfb zzm = zzm();
        String str = zzbt.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 134);
        sb2.append("Google Analytics ");
        sb2.append(str);
        sb2.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzm.zzM(sb2.toString());
        zzfh zzfhVar = new zzfh(this);
        zzfhVar.zzX();
        this.zzk = zzfhVar;
        zzft zzftVar = new zzft(this);
        zzftVar.zzX();
        this.zzj = zzftVar;
        zzbq zzbqVar = new zzbq(this, zzbwVar);
        zzcn zzcnVar = new zzcn(this);
        zzbi zzbiVar = new zzbi(this);
        zzcf zzcfVar = new zzcf(this);
        zzcx zzcxVar = new zzcx(this);
        if (w.f13870f == null) {
            synchronized (w.class) {
                if (w.f13870f == null) {
                    w.f13870f = new w(zza2);
                }
            }
        }
        w wVar = w.f13870f;
        wVar.f13874e = new zzbu(this);
        this.zzg = wVar;
        c cVar = new c(this);
        zzcnVar.zzX();
        this.zzm = zzcnVar;
        zzbiVar.zzX();
        this.zzn = zzbiVar;
        zzcfVar.zzX();
        this.zzo = zzcfVar;
        zzcxVar.zzX();
        this.zzp = zzcxVar;
        zzcy zzcyVar = new zzcy(this);
        zzcyVar.zzX();
        this.zzi = zzcyVar;
        zzbqVar.zzX();
        this.zzh = zzbqVar;
        zzft zzq = cVar.d.zzq();
        zzq.zzf();
        if (zzq.zze()) {
            cVar.f13834i = zzq.zzc();
        }
        zzq.zzf();
        cVar.f13831f = true;
        this.zzl = cVar;
        zzbqVar.zzm();
    }

    public static zzbv zzg(Context context) {
        Objects.requireNonNull(context, "null reference");
        if (zza == null) {
            synchronized (zzbv.class) {
                if (zza == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zzbv zzbvVar = new zzbv(new zzbw(context));
                    zza = zzbvVar;
                    List<Runnable> list = c.f13830j;
                    synchronized (c.class) {
                        List<Runnable> list2 = c.f13830j;
                        if (list2 != null) {
                            for (Runnable runnable : list2) {
                                runnable.run();
                            }
                            c.f13830j = null;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    long longValue = zzeu.zzQ.zzb().longValue();
                    if (elapsedRealtime2 > longValue) {
                        zzbvVar.zzm().zzT("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(longValue));
                    }
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbs zzbsVar) {
        o.i(zzbsVar, "Analytics service not created/initialized");
        o.b(zzbsVar.zzY(), "Analytics service not initialized");
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final c zzc() {
        Objects.requireNonNull(this.zzl, "null reference");
        o.b(this.zzl.f13831f, "Analytics instance not initialized");
        return this.zzl;
    }

    public final w zzd() {
        Objects.requireNonNull(this.zzg, "null reference");
        return this.zzg;
    }

    public final zzbi zze() {
        zzs(this.zzn);
        return this.zzn;
    }

    public final zzbq zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzcf zzh() {
        zzs(this.zzo);
        return this.zzo;
    }

    public final zzcn zzi() {
        zzs(this.zzm);
        return this.zzm;
    }

    public final zzct zzj() {
        return this.zze;
    }

    public final zzcx zzk() {
        return this.zzp;
    }

    public final zzcy zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfb zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfb zzn() {
        return this.zzf;
    }

    public final zzfh zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfh zzp() {
        zzfh zzfhVar = this.zzk;
        if (zzfhVar != null && zzfhVar.zzY()) {
            return this.zzk;
        }
        return null;
    }

    public final zzft zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final b zzr() {
        return this.zzd;
    }
}
