package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import com.appsflyer.oaid.BuildConfig;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public final class aa {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r2.equals(com.app.pornhub.domain.config.DvdsConfig.TYPE_CATEGORY) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, java.lang.String> AFInAppEventParameterName(android.content.Context r12, java.util.Map<java.lang.String, java.lang.String> r13, android.net.Uri r14) {
        /*
            java.lang.String r0 = "install_time"
            java.util.Set r1 = r14.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            r3 = 0
            java.lang.String r4 = "media_source"
            java.lang.String r5 = "agency"
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r14.getQueryParameter(r2)
            boolean r7 = r13.containsKey(r2)
            if (r7 != 0) goto L6a
            r7 = 7
            r7 = -1
            int r8 = r2.hashCode()
            r9 = -1420799080(0xffffffffab505398, float:-7.4012454E-13)
            r10 = 2
            r11 = 1
            if (r8 == r9) goto L51
            r9 = 21103(0x526f, float:2.9572E-41)
            r9 = 99
            if (r8 == r9) goto L48
            r3 = 110987(0x1b18b, float:1.55526E-40)
            if (r8 == r3) goto L3e
            goto L5c
        L3e:
            java.lang.String r3 = "pid"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L5c
            r3 = 1
            goto L5e
        L48:
            java.lang.String r8 = "c"
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L5c
            goto L5e
        L51:
            java.lang.String r3 = "af_prt"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L5c
            r3 = 5
            r3 = 2
            goto L5e
        L5c:
            r3 = 3
            r3 = -1
        L5e:
            if (r3 == 0) goto L67
            if (r3 == r11) goto L6b
            if (r3 == r10) goto L65
            goto L6a
        L65:
            r4 = r5
            goto L6b
        L67:
            java.lang.String r4 = "campaign"
            goto L6b
        L6a:
            r4 = r2
        L6b:
            r13.put(r4, r6)
            goto La
        L6f:
            boolean r1 = r13.containsKey(r0)     // Catch: java.lang.Exception -> La2
            if (r1 != 0) goto La8
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> La2
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Exception -> La2
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> La2
            android.content.pm.PackageManager r1 = r12.getPackageManager()     // Catch: java.lang.Exception -> La2
            java.lang.String r12 = r12.getPackageName()     // Catch: java.lang.Exception -> La2
            android.content.pm.PackageInfo r12 = r1.getPackageInfo(r12, r3)     // Catch: java.lang.Exception -> La2
            long r6 = r12.firstInstallTime     // Catch: java.lang.Exception -> La2
            java.lang.String r12 = "UTC"
            java.util.TimeZone r12 = java.util.TimeZone.getTimeZone(r12)     // Catch: java.lang.Exception -> La2
            r2.setTimeZone(r12)     // Catch: java.lang.Exception -> La2
            java.util.Date r12 = new java.util.Date     // Catch: java.lang.Exception -> La2
            r12.<init>(r6)     // Catch: java.lang.Exception -> La2
            java.lang.String r12 = r2.format(r12)     // Catch: java.lang.Exception -> La2
            r13.put(r0, r12)     // Catch: java.lang.Exception -> La2
            goto La8
        La2:
            r12 = move-exception
            java.lang.String r0 = "Could not fetch install time. "
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0, r12)
        La8:
            java.lang.String r12 = "af_deeplink"
            boolean r12 = r13.containsKey(r12)
            if (r12 == 0) goto Lbd
            java.lang.String r12 = "af_status"
            boolean r0 = r13.containsKey(r12)
            if (r0 != 0) goto Lbd
            java.lang.String r0 = "Non-organic"
            r13.put(r12, r0)
        Lbd:
            boolean r12 = r13.containsKey(r5)
            if (r12 == 0) goto Lc6
            r13.remove(r4)
        Lc6:
            java.lang.String r12 = r14.getPath()
            if (r12 == 0) goto Ld1
            java.lang.String r0 = "path"
            r13.put(r0, r12)
        Ld1:
            java.lang.String r12 = r14.getScheme()
            if (r12 == 0) goto Ldc
            java.lang.String r0 = "scheme"
            r13.put(r0, r12)
        Ldc:
            java.lang.String r12 = r14.getHost()
            if (r12 == 0) goto Le7
            java.lang.String r14 = "host"
            r13.put(r14, r12)
        Le7:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.aa.AFInAppEventParameterName(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    public static boolean AFInAppEventParameterName() {
        return Build.BRAND.equals("OPPO");
    }

    public static long AFKeystoreWrapper(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.AFInAppEventParameterName(e10.getMessage(), e10);
            return 0L;
        }
    }

    public static boolean valueOf(Context context, String str) {
        if (str != null) {
            int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
            StringBuilder sb2 = new StringBuilder("is Permission Available: ");
            sb2.append(str);
            sb2.append("; res: ");
            sb2.append(checkPermission);
            AFLogger.valueOf(sb2.toString());
            return checkPermission == 0;
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static String values(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.AFInAppEventParameterName(e10.getMessage(), e10);
            return BuildConfig.FLAVOR;
        }
    }

    public static String values(PackageManager packageManager, String str) {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    public static boolean values(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }
}
