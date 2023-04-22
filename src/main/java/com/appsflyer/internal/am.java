package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;

/* loaded from: classes.dex */
public final class am {
    private static String AFInAppEventParameterName;
    private static String AFInAppEventType;

    public static void AFKeystoreWrapper(String str) {
        if (AFInAppEventParameterName == null) {
            values(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        }
        String str2 = AFInAppEventParameterName;
        if (str2 != null) {
            AFLogger.AFKeystoreWrapper(str.replace(str2, AFInAppEventType));
        }
    }

    public static void values(String str) {
        AFInAppEventParameterName = str;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 == 0 || i10 == str.length() - 1) {
                sb2.append(str.charAt(i10));
            } else {
                sb2.append("*");
            }
        }
        AFInAppEventType = sb2.toString();
    }
}
