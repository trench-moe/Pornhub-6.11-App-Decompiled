package com.google.android.gms.measurement.internal;

import a1.a;
import android.os.Bundle;
import android.support.v4.media.b;
import h9.o;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzec {
    public static final AtomicReference zza = new AtomicReference();
    public static final AtomicReference zzb = new AtomicReference();
    public static final AtomicReference zzc = new AtomicReference();
    private final zzeb zzd;

    public zzec(zzeb zzebVar) {
        this.zzd = zzebVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Objects.requireNonNull(strArr, "null reference");
        Objects.requireNonNull(strArr2, "null reference");
        Objects.requireNonNull(atomicReference, "null reference");
        o.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (zzkw.zzak(str, strArr[i10])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i10];
                    if (str2 == null) {
                        str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                        strArr3[i10] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder m10 = a.m("[");
        for (Object obj : objArr) {
            String zzb2 = obj instanceof Bundle ? zzb((Bundle) obj) : String.valueOf(obj);
            if (zzb2 != null) {
                if (m10.length() != 1) {
                    m10.append(", ");
                }
                m10.append(zzb2);
            }
        }
        m10.append("]");
        return m10.toString();
    }

    public final String zzb(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (this.zzd.zza()) {
            StringBuilder m10 = a.m("Bundle[{");
            for (String str : bundle.keySet()) {
                if (m10.length() != 8) {
                    m10.append(", ");
                }
                m10.append(zze(str));
                m10.append("=");
                Object obj = bundle.get(str);
                m10.append(obj instanceof Bundle ? zza(new Object[]{obj}) : obj instanceof Object[] ? zza((Object[]) obj) : obj instanceof ArrayList ? zza(((ArrayList) obj).toArray()) : String.valueOf(obj));
            }
            m10.append("}]");
            return m10.toString();
        }
        return bundle.toString();
    }

    public final String zzc(zzau zzauVar) {
        if (this.zzd.zza()) {
            StringBuilder m10 = a.m("origin=");
            m10.append(zzauVar.zzc);
            m10.append(",name=");
            m10.append(zzd(zzauVar.zza));
            m10.append(",params=");
            zzas zzasVar = zzauVar.zzb;
            m10.append(zzasVar == null ? null : !this.zzd.zza() ? zzasVar.toString() : zzb(zzasVar.zzc()));
            return m10.toString();
        }
        return zzauVar.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgo.zzc, zzgo.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzgp.zzb, zzgp.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? b.j("experiment_id(", str, ")") : zzg(str, zzgq.zzb, zzgq.zza, zzc);
    }
}
