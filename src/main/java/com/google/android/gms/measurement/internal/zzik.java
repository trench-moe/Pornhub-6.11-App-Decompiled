package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import r3.c;

/* loaded from: classes.dex */
public final class zzik extends zzf {
    public zzid zza;
    private volatile zzid zzb;
    private volatile zzid zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzid zzg;
    private zzid zzh;
    private boolean zzi;
    private final Object zzj;
    private zzid zzk;
    private String zzl;

    public zzik(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(Activity activity, zzid zzidVar, boolean z10) {
        zzid zzidVar2;
        zzid zzidVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzidVar.zzb == null) {
            zzidVar2 = new zzid(zzidVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzidVar.zzc, zzidVar.zze, zzidVar.zzf);
        } else {
            zzidVar2 = zzidVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzidVar2;
        Objects.requireNonNull((c) this.zzs.zzav());
        this.zzs.zzaz().zzp(new zzif(this, zzidVar2, zzidVar3, SystemClock.elapsedRealtime(), z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zzid zzidVar, zzid zzidVar2, long j10, boolean z10, Bundle bundle) {
        long j11;
        long j12;
        zzg();
        boolean z11 = false;
        boolean z12 = (zzidVar2 != null && zzidVar2.zzc == zzidVar.zzc && zzkw.zzak(zzidVar2.zzb, zzidVar.zzb) && zzkw.zzak(zzidVar2.zza, zzidVar.zza)) ? false : true;
        if (z10 && this.zza != null) {
            z11 = true;
        }
        if (z12) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzkw.zzJ(zzidVar, bundle2, true);
            if (zzidVar2 != null) {
                String str = zzidVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzidVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzidVar2.zzc);
            }
            if (z11) {
                zzjy zzjyVar = this.zzs.zzu().zzb;
                long j13 = j10 - zzjyVar.zzb;
                zzjyVar.zzb = j10;
                if (j13 > 0) {
                    this.zzs.zzv().zzH(bundle2, j13);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzidVar.zze ? "auto" : "app";
            Objects.requireNonNull((c) this.zzs.zzav());
            long currentTimeMillis = System.currentTimeMillis();
            if (zzidVar.zze) {
                j11 = currentTimeMillis;
                long j14 = zzidVar.zzf;
                if (j14 != 0) {
                    j12 = j14;
                    this.zzs.zzq().zzH(str3, "_vs", j12, bundle2);
                }
            } else {
                j11 = currentTimeMillis;
            }
            j12 = j11;
            this.zzs.zzq().zzH(str3, "_vs", j12, bundle2);
        }
        if (z11) {
            zzC(this.zza, true, j10);
        }
        this.zza = zzidVar;
        if (zzidVar.zze) {
            this.zzh = zzidVar;
        }
        this.zzs.zzt().zzG(zzidVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzC(zzid zzidVar, boolean z10, long j10) {
        zzd zzd = this.zzs.zzd();
        Objects.requireNonNull((c) this.zzs.zzav());
        zzd.zzf(SystemClock.elapsedRealtime());
        if (!this.zzs.zzu().zzb.zzd(zzidVar != null && zzidVar.zzd, z10, j10) || zzidVar == null) {
            return;
        }
        zzidVar.zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzik zzikVar, Bundle bundle, zzid zzidVar, zzid zzidVar2, long j10) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzikVar.zzB(zzidVar, zzidVar2, j10, true, zzikVar.zzs.zzv().zzy(null, "screen_view", bundle, null, false));
    }

    private final zzid zzz(Activity activity) {
        Objects.requireNonNull(activity, "null reference");
        zzid zzidVar = (zzid) this.zzd.get(activity);
        if (zzidVar == null) {
            zzid zzidVar2 = new zzid(null, zzl(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.zzd.put(activity, zzidVar2);
            zzidVar = zzidVar2;
        }
        return this.zzg != null ? this.zzg : zzidVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zzid zzi() {
        return this.zzb;
    }

    public final zzid zzj(boolean z10) {
        zza();
        zzg();
        if (z10) {
            zzid zzidVar = this.zza;
            return zzidVar != null ? zzidVar : this.zzh;
        }
        return this.zza;
    }

    public final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : BuildConfig.FLAVOR;
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 > 100) {
            this.zzs.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzid(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            try {
                this.zzi = false;
                this.zzf = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        Objects.requireNonNull((c) this.zzs.zzav());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzih(this, elapsedRealtime));
            return;
        }
        zzid zzz = zzz(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzs.zzaz().zzp(new zzii(this, zzz, elapsedRealtime));
    }

    /* JADX WARN: Finally extract failed */
    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            try {
                this.zzi = true;
                if (activity != this.zze) {
                    synchronized (this.zzj) {
                        this.zze = activity;
                        this.zzf = false;
                    }
                    if (this.zzs.zzf().zzu()) {
                        this.zzg = null;
                        this.zzs.zzaz().zzp(new zzij(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzs.zzaz().zzp(new zzig(this));
            return;
        }
        zzA(activity, zzz(activity), false);
        zzd zzd = this.zzs.zzd();
        Objects.requireNonNull((c) zzd.zzs.zzav());
        zzd.zzs.zzaz().zzp(new zzc(zzd, SystemClock.elapsedRealtime()));
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zzid zzidVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zzidVar = (zzid) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzidVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzidVar.zza);
        bundle2.putString("referrer_name", zzidVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r7.length() <= 100) goto L29;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzw(android.app.Activity r6, java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzik.zzx(android.os.Bundle, long):void");
    }

    public final void zzy(String str, zzid zzidVar) {
        zzg();
        synchronized (this) {
            String str2 = this.zzl;
            if (str2 == null || str2.equals(str) || zzidVar != null) {
                this.zzl = str;
                this.zzk = zzidVar;
            }
        }
    }
}
