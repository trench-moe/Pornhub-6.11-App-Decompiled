package com.appsflyer;

import android.util.Log;
import com.appsflyer.internal.aj;

/* loaded from: classes.dex */
public final class AFLogger {
    private static final long AFInAppEventParameterName = System.currentTimeMillis();

    /* loaded from: classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        
        private int AFInAppEventType;

        LogLevel(int i10) {
            this.AFInAppEventType = i10;
        }

        public final int getLevel() {
            return this.AFInAppEventType;
        }
    }

    public static void AFInAppEventParameterName(String str) {
        if (!AFKeystoreWrapper()) {
            Log.d("AppsFlyer_6.3.1", AFKeystoreWrapper(str, false));
        }
        aj.valueOf().valueOf(null, "F", str);
    }

    public static void AFInAppEventParameterName(String str, Throwable th) {
        values(str, th, true, false);
    }

    public static void AFInAppEventParameterName(String str, boolean z10) {
        if (AFInAppEventParameterName(LogLevel.INFO)) {
            Log.i("AppsFlyer_6.3.1", AFKeystoreWrapper(str, false));
        }
        if (z10) {
            aj.valueOf().valueOf(null, "I", AFKeystoreWrapper(str, true));
        }
    }

    public static void AFInAppEventParameterName(Throwable th) {
        values(null, th, false, false);
    }

    private static boolean AFInAppEventParameterName(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    public static void AFInAppEventType(String str) {
        if (AFInAppEventParameterName(LogLevel.WARNING)) {
            Log.w("AppsFlyer_6.3.1", AFKeystoreWrapper(str, false));
        }
        aj.valueOf().valueOf(null, "W", AFKeystoreWrapper(str, true));
    }

    public static void AFInAppEventType(String str, Throwable th) {
        values(str, th, true, true);
    }

    private static String AFKeystoreWrapper(String str, boolean z10) {
        String str2 = str;
        if (str2 == null) {
            str2 = "null";
        }
        if (!z10 && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(System.currentTimeMillis() - AFInAppEventParameterName);
        sb2.append(") [");
        sb2.append(Thread.currentThread().getName());
        sb2.append("] ");
        sb2.append(str2);
        return sb2.toString();
    }

    public static void AFKeystoreWrapper(String str) {
        AFInAppEventParameterName(str, true);
    }

    private static boolean AFKeystoreWrapper() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void AFVersionDeclaration(String str) {
        AFInAppEventType(str);
    }

    public static void valueOf(String str) {
        if (AFInAppEventParameterName(LogLevel.VERBOSE)) {
            Log.v("AppsFlyer_6.3.1", AFKeystoreWrapper(str, false));
        }
        aj.valueOf().valueOf(null, "V", AFKeystoreWrapper(str, true));
    }

    public static void values(String str) {
        if (AFInAppEventParameterName(LogLevel.DEBUG)) {
            Log.d("AppsFlyer_6.3.1", AFKeystoreWrapper(str, false));
        }
        aj.valueOf().valueOf(null, "D", AFKeystoreWrapper(str, true));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r8, java.lang.Throwable r9, boolean r10, boolean r11) {
        /*
            r4 = r8
            com.appsflyer.AFLogger$LogLevel r0 = com.appsflyer.AFLogger.LogLevel.ERROR
            boolean r6 = AFInAppEventParameterName(r0)
            r0 = r6
            if (r0 == 0) goto L4a
            r0 = 0
            if (r4 != 0) goto L35
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r7 = 6
            r4.<init>()
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r4.append(r1)
            java.lang.String r1 = " at "
            r4.append(r1)
            java.lang.StackTraceElement[] r1 = r9.getStackTrace()
            r1 = r1[r0]
            r7 = 1
            java.lang.String r1 = r1.toString()
            r4.append(r1)
            java.lang.String r4 = r4.toString()
        L35:
            r6 = 3
            java.lang.String r4 = AFKeystoreWrapper(r4, r0)
            java.lang.String r6 = "AppsFlyer_6.3.1"
            r0 = r6
            if (r11 == 0) goto L43
            android.util.Log.e(r0, r4, r9)
            goto L4b
        L43:
            r6 = 1
            if (r10 == 0) goto L4a
            r7 = 5
            android.util.Log.d(r0, r4)
        L4a:
            r6 = 1
        L4b:
            com.appsflyer.internal.aj r6 = com.appsflyer.internal.aj.valueOf()
            r4 = r6
            java.lang.Throwable r10 = r9.getCause()
            java.lang.Class r6 = r9.getClass()
            r11 = r6
            java.lang.String r11 = r11.getSimpleName()
            if (r10 != 0) goto L65
            java.lang.String r6 = r9.getMessage()
            r0 = r6
            goto L69
        L65:
            java.lang.String r0 = r10.getMessage()
        L69:
            if (r10 != 0) goto L71
            r7 = 4
            java.lang.StackTraceElement[] r9 = r9.getStackTrace()
            goto L76
        L71:
            java.lang.StackTraceElement[] r6 = r10.getStackTrace()
            r9 = r6
        L76:
            java.lang.String[] r7 = com.appsflyer.internal.aj.valueOf(r0, r9)
            r9 = r7
            java.lang.String r7 = "exception"
            r10 = r7
            r4.valueOf(r10, r11, r9)
            android.app.Application r4 = com.appsflyer.internal.at.valueOf
            if (r4 == 0) goto Lb2
            android.content.SharedPreferences r6 = com.appsflyer.internal.ae.AFKeystoreWrapper(r4)
            r4 = r6
            android.content.SharedPreferences$Editor r7 = r4.edit()
            r4 = r7
            android.app.Application r9 = com.appsflyer.internal.at.valueOf
            java.lang.String r10 = "exception_number"
            r6 = 2
            if (r9 != 0) goto L9a
            r0 = -1
            r7 = 1
            goto La6
        L9a:
            r6 = 7
            android.content.SharedPreferences r9 = com.appsflyer.internal.ae.AFKeystoreWrapper(r9)
            r0 = 0
            r7 = 1
            long r0 = r9.getLong(r10, r0)
        La6:
            r2 = 1
            r6 = 7
            long r0 = r0 + r2
            r7 = 3
            android.content.SharedPreferences$Editor r4 = r4.putLong(r10, r0)
            r4.apply()
        Lb2:
            r6 = 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFLogger.values(java.lang.String, java.lang.Throwable, boolean, boolean):void");
    }
}
