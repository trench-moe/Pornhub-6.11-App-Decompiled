package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ba {
    public static Map<String, Object> AFInAppEventType(Context context) {
        String string = ae.AFKeystoreWrapper(context).getString("attributionId", null);
        if (string == null || string.length() <= 0) {
            throw new az();
        }
        return values(string);
    }

    public static void AFInAppEventType(ae aeVar, g gVar, String str, Context context, SharedPreferences sharedPreferences, Integer num, Throwable th) {
        if (gVar.AFInAppEventParameterName()) {
            if (ae.valueOf == null) {
                AFLogger.values("[GCD-E01] AppsFlyerConversionListener is null - skip gcd");
                return;
            }
            StringBuilder sb2 = new StringBuilder("[GCD-A01] Loading conversion data. Counter: ");
            sb2.append(gVar.onInstallConversionDataLoadedNative);
            AFLogger.values(sb2.toString());
            long j10 = sharedPreferences.getLong("appsflyerConversionDataCacheExpiration", 0L);
            if (j10 != 0 && System.currentTimeMillis() - j10 > 5184000000L) {
                AFLogger.values("[GCD-E02] Cached conversion data expired");
                ae.AFKeystoreWrapper(context, "sixtyDayConversionData");
                ae.AFInAppEventParameterName(context, "attributionId", (String) null);
                aeVar.AFKeystoreWrapper(context, "appsflyerConversionDataCacheExpiration", 0L);
            }
            if (sharedPreferences.getString("attributionId", null) == null) {
                if (th != null) {
                    StringBuilder sb3 = new StringBuilder("Launch exception: ");
                    sb3.append(th.getMessage());
                    ay.AFInAppEventType(sb3.toString());
                } else if (num.intValue() != 200) {
                    ay.AFInAppEventType("Launch status code: ".concat(String.valueOf(num)));
                } else {
                    ay ayVar = new ay(aeVar, (Application) context.getApplicationContext(), str);
                    ae.values(ayVar.values, ayVar, 10L, TimeUnit.MILLISECONDS);
                }
            } else if (ae.AFKeystoreWrapper(sharedPreferences, "appsFlyerCount", false) <= 1) {
            } else {
                try {
                    Map<String, Object> AFInAppEventType = AFInAppEventType(context);
                    if (AFInAppEventType == null) {
                        return;
                    }
                    if (!AFInAppEventType.containsKey("is_first_launch")) {
                        AFInAppEventType.put("is_first_launch", Boolean.FALSE);
                    }
                    ay.valueOf(AFInAppEventType);
                } catch (az e10) {
                    AFLogger.AFInAppEventParameterName(e10.getMessage(), e10);
                }
            }
        }
    }

    public static Map<String, Object> values(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!next.equals("is_cache")) {
                    hashMap.put(next, jSONObject.isNull(next) ? null : jSONObject.get(next));
                }
            }
            return hashMap;
        } catch (JSONException e10) {
            AFLogger.AFInAppEventParameterName(e10.getMessage(), e10);
            return null;
        }
    }
}
