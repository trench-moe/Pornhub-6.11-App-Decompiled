package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ar {
    public static JSONObject values(String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
            if (!jSONObject.optBoolean("monitor", false) || z10) {
                aj.valueOf().AFInAppEventType();
                aj.valueOf().AFInAppEventParameterName();
            } else {
                aj.valueOf().AFKeystoreWrapper();
            }
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            AFLogger.AFInAppEventParameterName(th.getMessage(), th);
            aj.valueOf().AFInAppEventType();
            aj.valueOf().AFInAppEventParameterName();
            jSONObject = jSONObject2;
            return jSONObject;
        }
        if (jSONObject.has("ol_id")) {
            String optString = jSONObject.optString("ol_scheme", null);
            String optString2 = jSONObject.optString("ol_domain", null);
            String optString3 = jSONObject.optString("ol_ver", null);
            if (optString != null) {
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_SCHEME, optString);
            }
            if (optString2 != null) {
                AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_DOMAIN, optString2);
            }
            if (optString3 != null) {
                AppsFlyerProperties.getInstance().set("onelinkVersion", optString3);
                return jSONObject;
            }
        }
        return jSONObject;
    }
}
