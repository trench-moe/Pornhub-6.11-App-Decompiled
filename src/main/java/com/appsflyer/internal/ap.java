package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class ap {
    public static void AFInAppEventParameterName(String str, DeepLinkResult.Error error) {
        if (j.valueOf().valueOf == null) {
            AFInAppEventType(str);
            return;
        }
        AFLogger.values("[DDL] Error occurred: ".concat(String.valueOf(str)));
        valueOf(new DeepLinkResult(null, error));
    }

    private static void AFInAppEventType(String str) {
        if (ae.valueOf != null) {
            try {
                AFLogger.values("Calling onAppOpenAttributionFailure with: ".concat(String.valueOf(str)));
                ae.valueOf.onAttributionFailure(str);
            } catch (Throwable th) {
                AFLogger.AFInAppEventParameterName(th.getLocalizedMessage(), th);
            }
        }
    }

    private static void AFKeystoreWrapper(Map<String, String> map) {
        if (ae.valueOf != null) {
            try {
                StringBuilder sb2 = new StringBuilder("Calling onAppOpenAttribution with:\n");
                sb2.append(map.toString());
                AFLogger.values(sb2.toString());
                ae.valueOf.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.AFInAppEventParameterName(th.getLocalizedMessage(), th);
            }
        }
    }

    public static void valueOf(DeepLinkResult deepLinkResult) {
        if (j.valueOf().valueOf == null) {
            AFLogger.values("[DDL] skipping, no callback registered");
            return;
        }
        StringBuilder sb2 = new StringBuilder("[DDL] Calling onDeepLinking with:\n");
        sb2.append(deepLinkResult.toString());
        AFLogger.values(sb2.toString());
        try {
            j.valueOf().valueOf.onDeepLinking(deepLinkResult);
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName(th.getLocalizedMessage(), th);
        }
    }

    public static void valueOf(Map<String, String> map) {
        DeepLinkResult deepLinkResult;
        if (j.valueOf().valueOf == null) {
            AFKeystoreWrapper(map);
            return;
        }
        try {
            try {
                DeepLink AFInAppEventParameterName = DeepLink.AFInAppEventParameterName(map);
                AFInAppEventParameterName.valueOf.put("is_deferred", false);
                deepLinkResult = new DeepLinkResult(AFInAppEventParameterName, null);
            } catch (JSONException e10) {
                AFLogger.AFInAppEventType("[DDL] Error occurred", e10);
                deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            }
            valueOf(deepLinkResult);
        } catch (Throwable th) {
            valueOf(new DeepLinkResult(null, null));
            throw th;
        }
    }
}
