package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import l9.d;

/* loaded from: classes.dex */
public final class zzfs {
    public static long zza(String str) {
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static zzaw zzb(zzfb zzfbVar, String str) {
        Objects.requireNonNull(zzfbVar, "null reference");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new HashMap();
        try {
            String valueOf = String.valueOf(str);
            Map<String, String> a10 = d.a(new URI(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")), "UTF-8");
            zzaw zzawVar = new zzaw();
            zzawVar.zzp(a10.get("utm_content"));
            zzawVar.zzu(a10.get("utm_medium"));
            zzawVar.zzv(a10.get("utm_campaign"));
            zzawVar.zzw(a10.get("utm_source"));
            zzawVar.zzt(a10.get("utm_term"));
            zzawVar.zzs(a10.get("utm_id"));
            zzawVar.zzo(a10.get("anid"));
            zzawVar.zzr(a10.get("gclid"));
            zzawVar.zzq(a10.get("dclid"));
            zzawVar.zzn(a10.get("aclid"));
            return zzawVar;
        } catch (URISyntaxException e10) {
            zzfbVar.zzS("No valid campaign data found", e10);
            return null;
        }
    }

    public static String zzc(boolean z10) {
        return true != z10 ? "0" : "1";
    }

    public static String zzd(Locale locale) {
        if (locale == null) {
            return null;
        }
        String language = locale.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(language.toLowerCase(locale));
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb2.append("-");
            sb2.append(locale.getCountry().toLowerCase(locale));
        }
        return sb2.toString();
    }

    public static MessageDigest zze(String str) {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void zzg(Map<String, String> map, String str, String str2) {
        if (str2 != null && !map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static void zzh(Map<String, String> map, String str, Map<String, String> map2) {
        zzg(map, str, map2.get(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r3.exported != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzi(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            r0 = 0
            r6 = 1
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r6 = 6
            r2.<init>(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r5 = 5
            android.content.pm.ActivityInfo r3 = r1.getReceiverInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            r7 = r3
            if (r7 == 0) goto L23
            boolean r8 = r7.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r8 == 0) goto L23
            r6 = 5
            if (r9 == 0) goto L20
            r4 = 7
            boolean r7 = r7.exported     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L23
            if (r7 == 0) goto L23
        L20:
            r3 = 1
            r7 = r3
            return r7
        L23:
            r5 = 3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfs.zzi(android.content.Context, java.lang.String, boolean):boolean");
    }

    public static boolean zzj(double d, String str) {
        int i10;
        if (d > 0.0d && d < 100.0d) {
            if (TextUtils.isEmpty(str)) {
                i10 = 1;
            } else {
                i10 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    i10 = ((i10 << 6) & 268435455) + charAt + (charAt << 14);
                    int i11 = i10 >> 21;
                    if ((266338304 & i10) != 0) {
                        i10 ^= i11 & 127;
                    }
                }
            }
            if (i10 % 10000 >= d * 100.0d) {
                return true;
            }
        }
        return false;
    }
}
