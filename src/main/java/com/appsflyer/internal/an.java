package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class an {
    private static String values;

    public static synchronized String AFInAppEventType(WeakReference<Context> weakReference) {
        synchronized (an.class) {
            try {
                if (weakReference.get() == null) {
                    return values;
                }
                if (values == null) {
                    String str = null;
                    if (weakReference.get() != null) {
                        str = ae.AFKeystoreWrapper(weakReference.get()).getString("AF_INSTALLATION", null);
                    }
                    if (str != null) {
                        values = str;
                    } else {
                        try {
                            File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                            if (file.exists()) {
                                values = values(file);
                                file.delete();
                            } else {
                                long currentTimeMillis = System.currentTimeMillis();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(currentTimeMillis);
                                sb2.append("-");
                                sb2.append(Math.abs(new SecureRandom().nextLong()));
                                values = sb2.toString();
                            }
                            String str2 = values;
                            SharedPreferences.Editor edit = ae.AFKeystoreWrapper(weakReference.get()).edit();
                            edit.putString("AF_INSTALLATION", str2);
                            edit.apply();
                        } catch (Exception e10) {
                            AFLogger.AFInAppEventParameterName("Error getting AF unique ID", e10);
                        }
                    }
                    if (values != null) {
                        AppsFlyerProperties.getInstance().set("uid", values);
                    }
                }
                return values;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String values(java.io.File r9) {
        /*
            java.lang.String r0 = "Exception while trying to close the InstallationFile"
            r1 = 0
            r7 = 4
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            java.lang.String r6 = "r"
            r3 = r6
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            int r9 = (int) r3     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            r7 = 3
            byte[] r1 = new byte[r9]     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            r7 = 6
            r2.readFully(r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            r2.close()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L28
            r7 = 2
            r2.close()     // Catch: java.io.IOException -> L20
            goto L43
        L20:
            r9 = move-exception
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0, r9)
            goto L43
        L25:
            r9 = move-exception
            r1 = r2
            goto L54
        L28:
            r9 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L31
        L2d:
            r9 = move-exception
            goto L54
        L2f:
            r9 = move-exception
            r2 = r1
        L31:
            java.lang.String r3 = "Exception while reading InstallationFile: "
            r8 = 3
            com.appsflyer.AFLogger.AFInAppEventParameterName(r3, r9)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.io.IOException -> L3d
            goto L42
        L3d:
            r9 = move-exception
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0, r9)
        L41:
            r7 = 7
        L42:
            r1 = r2
        L43:
            java.lang.String r9 = new java.lang.String
            r7 = 6
            if (r1 == 0) goto L4a
            r8 = 7
            goto L4f
        L4a:
            r6 = 0
            r0 = r6
            byte[] r1 = new byte[r0]
            r8 = 7
        L4f:
            r9.<init>(r1)
            r8 = 4
            return r9
        L54:
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L5f
        L5a:
            r1 = move-exception
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0, r1)
        L5e:
            r8 = 5
        L5f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.an.values(java.io.File):java.lang.String");
    }
}
