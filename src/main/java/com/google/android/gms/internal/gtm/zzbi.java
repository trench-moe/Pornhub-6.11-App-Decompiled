package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import o8.a;

/* loaded from: classes.dex */
public final class zzbi extends zzbs {
    public static boolean zza;
    private a.C0239a zzb;
    private final zzfo zzc;
    private String zzd;
    private boolean zze;
    private final Object zzf;

    public zzbi(zzbv zzbvVar) {
        super(zzbvVar);
        this.zze = false;
        this.zzf = new Object();
        this.zzc = new zzfo(zzbvVar.zzr());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[Catch: all -> 0x01c2, TryCatch #7 {all -> 0x01c2, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0016, B:16:0x0039, B:20:0x0044, B:85:0x01a3, B:94:0x01bd, B:23:0x004e, B:24:0x005c, B:86:0x01a6, B:19:0x0040, B:10:0x0023, B:12:0x0028, B:13:0x0032, B:25:0x005d, B:28:0x0063, B:30:0x0080, B:33:0x009a, B:34:0x00a4, B:35:0x00ab, B:41:0x00b4, B:44:0x00cc, B:50:0x00df, B:52:0x00ef, B:54:0x00ff, B:55:0x0103, B:53:0x00f6, B:57:0x0106, B:59:0x0113, B:61:0x0120, B:60:0x011a, B:48:0x00da, B:62:0x0127, B:64:0x0138, B:66:0x0147, B:68:0x0151, B:70:0x0153, B:72:0x015c, B:74:0x015e, B:76:0x0166, B:77:0x017e, B:79:0x018d, B:81:0x019b, B:82:0x019f, B:80:0x0194, B:65:0x013f, B:43:0x00c6), top: B:108:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e A[Catch: all -> 0x01c2, TryCatch #7 {all -> 0x01c2, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0016, B:16:0x0039, B:20:0x0044, B:85:0x01a3, B:94:0x01bd, B:23:0x004e, B:24:0x005c, B:86:0x01a6, B:19:0x0040, B:10:0x0023, B:12:0x0028, B:13:0x0032, B:25:0x005d, B:28:0x0063, B:30:0x0080, B:33:0x009a, B:34:0x00a4, B:35:0x00ab, B:41:0x00b4, B:44:0x00cc, B:50:0x00df, B:52:0x00ef, B:54:0x00ff, B:55:0x0103, B:53:0x00f6, B:57:0x0106, B:59:0x0113, B:61:0x0120, B:60:0x011a, B:48:0x00da, B:62:0x0127, B:64:0x0138, B:66:0x0147, B:68:0x0151, B:70:0x0153, B:72:0x015c, B:74:0x015e, B:76:0x0166, B:77:0x017e, B:79:0x018d, B:81:0x019b, B:82:0x019f, B:80:0x0194, B:65:0x013f, B:43:0x00c6), top: B:108:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized o8.a.C0239a zzc() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbi.zzc():o8.a$a");
    }

    private static String zze(String str) {
        MessageDigest zze = zzfs.zze("MD5");
        if (zze == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zze.digest(str.getBytes())));
    }

    private final boolean zzf(String str) {
        try {
            String zze = zze(str);
            zzO("Storing hashed adid.");
            FileOutputStream openFileOutput = zzo().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(zze.getBytes());
            openFileOutput.close();
            this.zzd = zze;
            return true;
        } catch (IOException e10) {
            zzK("Error creating hash file", e10);
            return false;
        }
    }

    public final String zza() {
        zzW();
        a.C0239a zzc = zzc();
        String str = zzc != null ? zzc.f13613a : null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str;
    }

    public final boolean zzb() {
        zzW();
        a.C0239a zzc = zzc();
        return (zzc == null || zzc.f13614b) ? false : true;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }
}
