package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.d;
import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes.dex */
public final class ab {
    public static String values;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (r8.length() == 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.appsflyer.internal.d.e.C0069d AFInAppEventParameterName(android.content.Context r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ab.AFInAppEventParameterName(android.content.Context, java.util.Map):com.appsflyer.internal.d$e$d");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.appsflyer.internal.d.e.C0069d AFInAppEventType(android.content.Context r9) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = com.appsflyer.internal.ab.values
            r7 = 5
            r2 = 1
            r8 = 4
            if (r1 == 0) goto Le
            r3 = 1
            r6 = 3
            goto L11
        Le:
            r6 = 3
            r5 = 0
            r3 = r5
        L11:
            r5 = 0
            r4 = r5
            if (r3 == 0) goto L18
            r7 = 3
        L16:
            r9 = r4
            goto L4f
        L18:
            java.lang.String r5 = "collectOAID"
            r1 = r5
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L4c
            com.appsflyer.oaid.OaidClient r1 = new com.appsflyer.oaid.OaidClient     // Catch: java.lang.Throwable -> L45
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L45
            boolean r9 = r0.isEnableLog()     // Catch: java.lang.Throwable -> L45
            r1.setLogging(r9)     // Catch: java.lang.Throwable -> L45
            r8 = 6
            com.appsflyer.oaid.OaidClient$Info r5 = r1.fetch()     // Catch: java.lang.Throwable -> L45
            r9 = r5
            if (r9 == 0) goto L4c
            r6 = 7
            java.lang.String r5 = r9.getId()     // Catch: java.lang.Throwable -> L45
            r0 = r5
            r7 = 6
            java.lang.Boolean r5 = r9.getLat()     // Catch: java.lang.Throwable -> L43
            r9 = r5
            r1 = r0
            goto L4f
        L43:
            r1 = r0
            goto L46
        L45:
            r1 = r4
        L46:
            java.lang.String r9 = "No OAID library"
            com.appsflyer.AFLogger.values(r9)
            goto L16
        L4c:
            r7 = 6
            r9 = r4
            r1 = r9
        L4f:
            if (r1 == 0) goto L63
            r6 = 6
            com.appsflyer.internal.d$e$d r0 = new com.appsflyer.internal.d$e$d
            java.lang.String r7 = "Ⓢⓜⓞⓑ⓸⓺"
            r0.<init>(r1, r9)
            r6 = 2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            r9 = r5
            r0.valueOf = r9
            r6 = 7
            return r0
        L63:
            r8 = 7
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ab.AFInAppEventType(android.content.Context):com.appsflyer.internal.d$e$d");
    }

    public static d.e.C0069d valueOf(ContentResolver contentResolver) {
        String str;
        d.e.C0069d c0069d = null;
        if (contentResolver == null) {
            return null;
        }
        if (AppsFlyerProperties.getInstance().getString("amazon_aid") == null && "Amazon".equals(Build.MANUFACTURER)) {
            int i10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
            if (i10 == 0) {
                return new d.e.C0069d(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
            }
            if (i10 == 2) {
                return null;
            }
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                AFLogger.AFInAppEventParameterName("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = BuildConfig.FLAVOR;
            }
            c0069d = new d.e.C0069d(str, Boolean.TRUE);
        }
        return c0069d;
    }
}
