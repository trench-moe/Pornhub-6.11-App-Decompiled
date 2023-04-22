package com.google.android.gms.internal.gtm;

import a1.a;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import h9.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class zzex {
    private final Map<String, String> zza;
    private final List<zzcp> zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzex(zzbr zzbrVar, Map<String, String> map, long j10, boolean z10) {
        this(zzbrVar, map, j10, z10, 0L, 0, null);
    }

    public zzex(zzbr zzbrVar, Map<String, String> map, long j10, boolean z10, long j11, int i10, List<zzcp> list) {
        String str;
        String zzj;
        String zzj2;
        Objects.requireNonNull(zzbrVar, "null reference");
        Objects.requireNonNull(map, "null reference");
        this.zzd = j10;
        this.zzf = z10;
        this.zzc = j11;
        this.zze = i10;
        this.zzb = list != null ? list : Collections.emptyList();
        if (list != null) {
            for (zzcp zzcpVar : list) {
                if ("appendVersion".equals(zzcpVar.zza())) {
                    str = zzcpVar.zzb();
                    break;
                }
            }
        }
        str = null;
        this.zzg = true != TextUtils.isEmpty(str) ? str : null;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (zzl(entry.getKey()) && (zzj2 = zzj(zzbrVar, entry.getKey())) != null) {
                hashMap.put(zzj2, zzk(zzbrVar, entry.getValue()));
            }
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            if (!zzl(entry2.getKey()) && (zzj = zzj(zzbrVar, entry2.getKey())) != null) {
                hashMap.put(zzj, zzk(zzbrVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzfs.zzg(hashMap, "_v", this.zzg);
            if (this.zzg.equals("ma4.0.0") || this.zzg.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(hashMap);
    }

    public static zzex zze(zzbr zzbrVar, zzex zzexVar, Map<String, String> map) {
        return new zzex(zzbrVar, map, zzexVar.zzd, zzexVar.zzf, zzexVar.zzc, zzexVar.zze, zzexVar.zzb);
    }

    private final String zzi(String str, String str2) {
        o.e(str);
        o.b(!str.startsWith("&"), "Short param name required");
        String str3 = this.zza.get(str);
        return str3 != null ? str3 : str2;
    }

    private static String zzj(zzbr zzbrVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            zzbrVar.zzT("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String zzk(zzbr zzbrVar, Object obj) {
        String obj2 = obj == null ? BuildConfig.FLAVOR : obj.toString();
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, ConstantsKt.DEFAULT_BUFFER_SIZE);
            zzbrVar.zzT("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    private static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String toString() {
        StringBuilder m10 = a.m("ht=");
        m10.append(this.zzd);
        if (this.zzc != 0) {
            m10.append(", dbId=");
            m10.append(this.zzc);
        }
        if (this.zze != 0) {
            m10.append(", appUID=");
            m10.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) arrayList.get(i10);
            m10.append(", ");
            m10.append(str);
            m10.append("=");
            m10.append(this.zza.get(str));
        }
        return m10.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzfs.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final String zzf() {
        return zzi("_m", BuildConfig.FLAVOR);
    }

    public final Map<String, String> zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }
}
