package com.google.android.gms.internal.gtm;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public static zzfb zza() {
        return zza;
    }

    public static final String zzf(Object obj) {
        Object obj2 = obj;
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof Integer) {
            obj2 = Long.valueOf(((Integer) obj2).intValue());
        }
        String str = "-";
        if (!(obj2 instanceof Long)) {
            return obj2 instanceof Boolean ? String.valueOf(obj2) : obj2 instanceof Throwable ? obj2.getClass().getCanonicalName() : "-";
        }
        Long l10 = (Long) obj2;
        if (Math.abs(l10.longValue()) < 100) {
            return String.valueOf(obj2);
        }
        if (String.valueOf(obj2).charAt(0) != '-') {
            str = BuildConfig.FLAVOR;
        }
        String valueOf = String.valueOf(Math.abs(l10.longValue()));
        StringBuilder m10 = a.m(str);
        m10.append(Math.round(Math.pow(10.0d, valueOf.length() - 1)));
        m10.append("...");
        m10.append(str);
        m10.append(Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d));
        return m10.toString();
    }

    public final void zzb(zzex zzexVar, String str) {
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), zzexVar != null ? zzexVar.toString() : "no hit data");
    }

    public final void zzc(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), sb2.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i10, String str, Object obj, Object obj2, Object obj3) {
        char c10;
        try {
            Objects.requireNonNull(str, "null reference");
            if (zzw().zzb()) {
                zzw();
                c10 = 'C';
            } else {
                zzw();
                c10 = 'c';
            }
            char charAt = "01VDIWEA?".charAt(i10);
            String str2 = zzbt.zza;
            String zzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(zzD).length());
            sb2.append("3");
            sb2.append(charAt);
            sb2.append(c10);
            sb2.append(str2);
            sb2.append(":");
            sb2.append(zzD);
            String sb3 = sb2.toString();
            if (sb3.length() > 1024) {
                sb3 = sb3.substring(0, 1024);
            }
            zzfh zzp = zzt().zzp();
            if (zzp != null) {
                zzp.zze().zzc(sb3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
