package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.support.v4.media.b;
import android.util.Log;
import p8.h;

@Deprecated
/* loaded from: classes.dex */
public final class zzfa {
    private static volatile h zza = new zzcu();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String str2;
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str3 = (String) obj;
                str2 = b.n(new StringBuilder(str.length() + 1 + str3.length()), str, ":", str3);
            } else {
                str2 = str;
            }
            Log.e(zzeu.zzc.zzb(), str2);
        }
        h hVar = zza;
        if (hVar != null) {
            hVar.error(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zzd(String str) {
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzO(str);
        } else if (zzf(0)) {
            Log.v(zzeu.zzc.zzb(), str);
        }
        h hVar = zza;
        if (hVar != null) {
            hVar.verbose(str);
        }
    }

    @SuppressLint({"LogTagMismatch"})
    public static void zze(String str) {
        zzfb zza2 = zzfb.zza();
        if (zza2 != null) {
            zza2.zzR(str);
        } else if (zzf(2)) {
            Log.w(zzeu.zzc.zzb(), str);
        }
        h hVar = zza;
        if (hVar != null) {
            hVar.warn(str);
        }
    }

    public static boolean zzf(int i10) {
        return zza != null && zza.getLogLevel() <= i10;
    }
}
