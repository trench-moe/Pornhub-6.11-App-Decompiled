package com.appsflyer;

import a1.a;
import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.aa;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context AFKeystoreWrapper;
    public KeyStore values;
    public final Object AFInAppEventType = new Object();
    public String AFInAppEventParameterName = BuildConfig.FLAVOR;
    public int valueOf = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        AFLogger.AFKeystoreWrapper("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.values = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.AFInAppEventParameterName("Couldn't load keystore instance of type: AndroidKeyStore", e10);
        }
    }

    private static boolean AFInAppEventType(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFInAppEventParameterName() {
        String str;
        synchronized (this.AFInAppEventType) {
            str = this.AFInAppEventParameterName;
        }
        return str;
    }

    public final void AFInAppEventParameterName(String str) {
        AFLogger.AFKeystoreWrapper("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            KeyGenParameterSpec keyGenParameterSpec = null;
            synchronized (this.AFInAppEventType) {
                if (this.values.containsAlias(str)) {
                    AFLogger.AFKeystoreWrapper("Alias already exists: ".concat(String.valueOf(str)));
                } else {
                    if (Build.VERSION.SDK_INT >= 23) {
                        keyGenParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    } else if (!aa.AFInAppEventParameterName()) {
                        keyGenParameterSpec = new KeyPairGeneratorSpec.Builder(this.AFKeystoreWrapper).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                    }
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(keyGenParameterSpec);
                    keyPairGenerator.generateKeyPair();
                }
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th.getMessage());
            sb2.append(" occurred");
            AFLogger.AFInAppEventParameterName(sb2.toString(), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        r10 = r4.split(",");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r10.length != 3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        com.appsflyer.AFLogger.AFKeystoreWrapper("Found a matching AF key with alias:\n".concat(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        r10 = r10[1].trim().split("=");
        r1 = r10[2].trim().split("=");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        if (r10.length != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r1.length != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        r11.AFInAppEventParameterName = r10[1].trim();
        r11.valueOf = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
        r3 = new java.lang.StringBuilder("Couldn't list KeyStore Aliases: ");
        r3.append(r1.getClass().getName());
        com.appsflyer.AFLogger.AFInAppEventParameterName(r3.toString(), r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AFInAppEventType() {
        /*
            r11 = this;
            r7 = r11
            java.lang.Object r0 = r7.AFInAppEventType
            r9 = 1
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.values     // Catch: java.lang.Throwable -> L9d
            r2 = 1
            r9 = 4
            r9 = 0
            r3 = r9
            if (r1 == 0) goto L98
            java.util.Enumeration r1 = r1.aliases()     // Catch: java.lang.Throwable -> L78
        L11:
            boolean r4 = r1.hasMoreElements()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L98
            java.lang.Object r4 = r1.nextElement()     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L11
            r10 = 1
            boolean r9 = AFInAppEventType(r4)     // Catch: java.lang.Throwable -> L78
            r5 = r9
            if (r5 == 0) goto L11
            java.lang.String r1 = ","
            r9 = 1
            java.lang.String[] r10 = r4.split(r1)     // Catch: java.lang.Throwable -> L78
            r1 = r10
            int r5 = r1.length     // Catch: java.lang.Throwable -> L78
            r6 = 3
            if (r5 != r6) goto L98
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = r5.concat(r4)     // Catch: java.lang.Throwable -> L78
            com.appsflyer.AFLogger.AFKeystoreWrapper(r4)     // Catch: java.lang.Throwable -> L78
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "="
            r10 = 6
            java.lang.String[] r10 = r3.split(r4)     // Catch: java.lang.Throwable -> L76
            r3 = r10
            r9 = 2
            r4 = r9
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "="
            r9 = 1
            java.lang.String[] r1 = r1.split(r5)     // Catch: java.lang.Throwable -> L76
            int r5 = r3.length     // Catch: java.lang.Throwable -> L76
            if (r5 != r4) goto L9b
            r9 = 1
            int r5 = r1.length     // Catch: java.lang.Throwable -> L76
            if (r5 != r4) goto L9b
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L76
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L76
            r7.AFInAppEventParameterName = r3     // Catch: java.lang.Throwable -> L76
            r10 = 3
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L76
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L76
            r7.valueOf = r1     // Catch: java.lang.Throwable -> L76
            goto L9b
        L76:
            r1 = move-exception
            goto L7a
        L78:
            r1 = move-exception
            r2 = 0
        L7a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d
            r9 = 3
            java.lang.String r10 = "Couldn't list KeyStore Aliases: "
            r4 = r10
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r9 = r4.getName()     // Catch: java.lang.Throwable -> L9d
            r4 = r9
            r3.append(r4)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9d
            com.appsflyer.AFLogger.AFInAppEventParameterName(r3, r1)     // Catch: java.lang.Throwable -> L9d
            r10 = 4
            goto L9b
        L98:
            r10 = 1
            r2 = 0
            r9 = 4
        L9b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            return r2
        L9d:
            r1 = move-exception
            monitor-exit(r0)
            r9 = 3
            throw r1
            r9 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.AFInAppEventType():boolean");
    }

    public final int AFKeystoreWrapper() {
        int i10;
        synchronized (this.AFInAppEventType) {
            i10 = this.valueOf;
        }
        return i10;
    }

    public final String values() {
        StringBuilder m10 = a.m("com.appsflyer,");
        synchronized (this.AFInAppEventType) {
            m10.append("KSAppsFlyerId=");
            m10.append(this.AFInAppEventParameterName);
            m10.append(",");
            m10.append("KSAppsFlyerRICounter=");
            m10.append(this.valueOf);
        }
        return m10.toString();
    }
}
