package com.google.android.gms.measurement.internal;

import a0.a;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import com.google.vrtoolkit.cardboard.FullscreenMode;
import h9.o;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import l9.h;
import m9.c;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public final class zzaf extends zzgk {
    private Boolean zza;
    private zzae zzb;
    private Boolean zzc;

    public zzaf(zzfr zzfrVar) {
        super(zzfrVar);
        this.zzb = new zzae() { // from class: com.google.android.gms.measurement.internal.zzad
            @Override // com.google.android.gms.measurement.internal.zzae
            public final String zza(String str, String str2) {
                return null;
            }
        };
    }

    public static final long zzA() {
        return ((Long) zzdu.zzC.zza(null)).longValue();
    }

    private final String zzB(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, BuildConfig.FLAVOR);
            Objects.requireNonNull(str3, "null reference");
            return str3;
        } catch (ClassNotFoundException e10) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties class", e10);
            return BuildConfig.FLAVOR;
        } catch (IllegalAccessException e11) {
            this.zzs.zzay().zzd().zzb("Could not access SystemProperties.get()", e11);
            return BuildConfig.FLAVOR;
        } catch (NoSuchMethodException e12) {
            this.zzs.zzay().zzd().zzb("Could not find SystemProperties.get() method", e12);
            return BuildConfig.FLAVOR;
        } catch (InvocationTargetException e13) {
            this.zzs.zzay().zzd().zzb("SystemProperties.get() threw an exception", e13);
            return BuildConfig.FLAVOR;
        }
    }

    public static final long zzz() {
        return ((Long) zzdu.zzc.zza(null)).longValue();
    }

    public final double zza(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
        String zza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
        try {
            return ((Double) zzdtVar.zza(Double.valueOf(Double.parseDouble(zza)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) zzdtVar.zza(null)).doubleValue();
        }
    }

    public final int zzb(String str) {
        return zzf(str, zzdu.zzG, 500, FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS);
    }

    public final int zzc() {
        zzkw zzv = this.zzs.zzv();
        Boolean zzj = zzv.zzs.zzt().zzj();
        if (zzv.zzm() < 201500 && (zzj == null || zzj.booleanValue())) {
            return 25;
        }
        return 100;
    }

    public final int zzd(String str) {
        return zzf(str, zzdu.zzH, 25, 100);
    }

    public final int zze(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
        String zza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
        try {
            return ((Integer) zzdtVar.zza(Integer.valueOf(Integer.parseInt(zza)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) zzdtVar.zza(null)).intValue();
        }
    }

    public final int zzf(String str, zzdt zzdtVar, int i10, int i11) {
        return Math.max(Math.min(zze(str, zzdtVar), i11), i10);
    }

    public final long zzh() {
        this.zzs.zzaw();
        return 55005L;
    }

    public final long zzi(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
        String zza = this.zzb.zza(str, zzdtVar.zzb());
        if (TextUtils.isEmpty(zza)) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
        try {
            return ((Long) zzdtVar.zza(Long.valueOf(Long.parseLong(zza)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) zzdtVar.zza(null)).longValue();
        }
    }

    public final Bundle zzj() {
        try {
            if (this.zzs.zzau().getPackageManager() == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a10 = c.a(this.zzs.zzau()).a(this.zzs.zzau().getPackageName(), 128);
            if (a10 == null) {
                this.zzs.zzay().zzd().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a10.metaData;
        } catch (PackageManager.NameNotFoundException e10) {
            this.zzs.zzay().zzd().zzb("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final Boolean zzk(String str) {
        o.e(str);
        Bundle zzj = zzj();
        if (zzj == null) {
            a.t(this.zzs, "Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (zzj.containsKey(str)) {
            return Boolean.valueOf(zzj.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String zzl() {
        return zzB("debug.firebase.analytics.app", BuildConfig.FLAVOR);
    }

    public final String zzm() {
        return zzB("debug.deferred.deeplink", BuildConfig.FLAVOR);
    }

    public final String zzn() {
        this.zzs.zzaw();
        return "FA";
    }

    public final String zzo(String str, zzdt zzdtVar) {
        return str == null ? (String) zzdtVar.zza(null) : (String) zzdtVar.zza(this.zzb.zza(str, zzdtVar.zzb()));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzp(java.lang.String r7) {
        /*
            r6 = this;
            r3 = r6
            java.lang.String r7 = "analytics.safelisted_events"
            h9.o.e(r7)
            android.os.Bundle r5 = r3.zzj()
            r0 = r5
            r1 = 0
            r5 = 4
            if (r0 != 0) goto L19
            r5 = 6
            com.google.android.gms.measurement.internal.zzfr r7 = r3.zzs
            java.lang.String r5 = "Failed to load metadata: Metadata bundle is null"
            r0 = r5
            a0.a.t(r7, r0)
            goto L21
        L19:
            r5 = 6
            boolean r2 = r0.containsKey(r7)
            if (r2 != 0) goto L23
            r5 = 3
        L21:
            r7 = r1
            goto L2d
        L23:
            r5 = 3
            int r5 = r0.getInt(r7)
            r7 = r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
        L2d:
            if (r7 == 0) goto L61
            com.google.android.gms.measurement.internal.zzfr r0 = r3.zzs     // Catch: android.content.res.Resources.NotFoundException -> L4e
            r5 = 5
            android.content.Context r5 = r0.zzau()     // Catch: android.content.res.Resources.NotFoundException -> L4e
            r0 = r5
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L4e
            int r7 = r7.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L4e
            java.lang.String[] r7 = r0.getStringArray(r7)     // Catch: android.content.res.Resources.NotFoundException -> L4e
            if (r7 != 0) goto L47
            r5 = 7
            return r1
        L47:
            r5 = 2
            java.util.List r5 = java.util.Arrays.asList(r7)     // Catch: android.content.res.Resources.NotFoundException -> L4e
            r7 = r5
            return r7
        L4e:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzfr r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzeh r5 = r0.zzay()
            r0 = r5
            com.google.android.gms.measurement.internal.zzef r5 = r0.zzd()
            r0 = r5
            java.lang.String r5 = "Failed to load string array from metadata: resource not found"
            r2 = r5
            r0.zzb(r2, r7)
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzaf.zzp(java.lang.String):java.util.List");
    }

    public final void zzq(zzae zzaeVar) {
        this.zzb = zzaeVar;
    }

    public final boolean zzr() {
        Boolean zzk = zzk("google_analytics_adid_collection_enabled");
        if (zzk != null && !zzk.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzs(String str, zzdt zzdtVar) {
        if (str == null) {
            return ((Boolean) zzdtVar.zza(null)).booleanValue();
        }
        String zza = this.zzb.zza(str, zzdtVar.zzb());
        return TextUtils.isEmpty(zza) ? ((Boolean) zzdtVar.zza(null)).booleanValue() : ((Boolean) zzdtVar.zza(Boolean.valueOf("1".equals(zza)))).booleanValue();
    }

    public final boolean zzt(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzu() {
        Boolean zzk = zzk("google_analytics_automatic_screen_reporting_enabled");
        if (zzk != null && !zzk.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean zzv() {
        this.zzs.zzaw();
        Boolean zzk = zzk("firebase_analytics_collection_deactivated");
        return zzk != null && zzk.booleanValue();
    }

    public final boolean zzw(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    public final boolean zzx() {
        if (this.zza == null) {
            Boolean zzk = zzk("app_measurement_lite");
            this.zza = zzk;
            if (zzk == null) {
                this.zza = Boolean.FALSE;
            }
        }
        if (!this.zza.booleanValue() && this.zzs.zzN()) {
            return false;
        }
        return true;
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean zzy() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = this.zzs.zzau().getApplicationInfo();
                    String a10 = h.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z10 = false;
                        if (str != null && str.equals(a10)) {
                            z10 = true;
                        }
                        this.zzc = Boolean.valueOf(z10);
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        this.zzs.zzay().zzd().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }
}
