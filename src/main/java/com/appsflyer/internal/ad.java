package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.BuildConfig;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ad implements Runnable {
    private static String AFInAppEventParameterName = "https://%ssdk-services.%s/validate-android-signature";
    private static String AFInAppEventType;
    private String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private Map<String, String> AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private WeakReference<Context> valueOf;
    private String values;

    static {
        StringBuilder sb2 = new StringBuilder("https://%svalidate.%s/api/v");
        sb2.append(ae.AFKeystoreWrapper);
        sb2.append("/androidevent?buildnumber=6.3.1&app_id=");
        AFInAppEventType = sb2.toString();
    }

    public ad(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.valueOf = new WeakReference<>(context);
        this.values = str;
        this.AFKeystoreWrapper = str2;
        this.AppsFlyer2dXConversionCallback = str4;
        this.init = str5;
        this.getLevel = str6;
        this.AFVersionDeclaration = map;
        this.AFLogger$LogLevel = str3;
    }

    private static void AFInAppEventParameterName(boolean z10, String str, String str2, String str3, String str4) {
        if (ae.AFInAppEventType != null) {
            StringBuilder sb2 = new StringBuilder("Validate callback parameters: ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(str3);
            AFLogger.values(sb2.toString());
            if (z10) {
                AFLogger.values("Validate in app purchase success: ".concat(String.valueOf(str4)));
                ae.AFInAppEventType.onValidateInApp();
                return;
            }
            AFLogger.values("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = ae.AFInAppEventType;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    private static HttpURLConnection AFInAppEventType(bk bkVar) {
        StringBuilder sb2 = new StringBuilder("Calling ");
        sb2.append(bkVar.onDeepLinkingNative);
        AFLogger.values(sb2.toString());
        bkVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
        return new m(bkVar).AFInAppEventType();
    }

    public static /* synthetic */ void valueOf(ad adVar, Map map, Map map2, WeakReference weakReference) {
        if (weakReference.get() != null) {
            z.AFInAppEventParameterName((Context) weakReference.get()).AFKeystoreWrapper();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName()));
            sb2.append(((Context) weakReference.get()).getPackageName());
            String obj = sb2.toString();
            String string = ae.AFKeystoreWrapper((Context) weakReference.get()).getString("referrer", BuildConfig.FLAVOR);
            g bnVar = new bn((Context) weakReference.get());
            bnVar.init = adVar.values;
            bnVar.AppsFlyer2dXConversionCallback = string;
            ae valueOf = ae.valueOf();
            Map<String, Object> values = valueOf.values(bnVar);
            values.put("price", adVar.init);
            values.put("currency", adVar.getLevel);
            values.put("receipt_data", map);
            if (map2 != null) {
                values.put("extra_prms", map2);
            }
            values.putAll(valueOf.AFInAppEventType());
            aj.valueOf().valueOf("server_request", obj, new JSONObject(values).toString());
            HttpURLConnection httpURLConnection = null;
            try {
                httpURLConnection = AFInAppEventType((bk) bnVar.AFKeystoreWrapper(values).AFInAppEventType(obj));
                int i10 = -1;
                if (httpURLConnection != null) {
                    i10 = httpURLConnection.getResponseCode();
                }
                String valueOf2 = ae.valueOf(httpURLConnection);
                aj.valueOf().valueOf("server_response", obj, String.valueOf(i10), valueOf2);
                StringBuilder sb3 = new StringBuilder("Validate-WH response - ");
                sb3.append(i10);
                sb3.append(": ");
                sb3.append(new JSONObject(valueOf2).toString());
                AFLogger.AFKeystoreWrapper(sb3.toString());
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th) {
                try {
                    AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        String str = this.values;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                context = this.valueOf.get();
            } catch (Throwable th) {
                try {
                    if (ae.AFInAppEventType != null) {
                        AFLogger.AFInAppEventParameterName("Failed Validate request + ex", th);
                        AFInAppEventParameterName(false, this.AppsFlyer2dXConversionCallback, this.init, this.getLevel, th.getMessage());
                    }
                    AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    throw th2;
                }
            }
            if (context == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("public-key", this.AFKeystoreWrapper);
            hashMap.put("sig-data", this.AppsFlyer2dXConversionCallback);
            hashMap.put("signature", this.AFLogger$LogLevel);
            final HashMap hashMap2 = new HashMap(hashMap);
            new Thread(new Runnable() { // from class: com.appsflyer.internal.ad.4
                @Override // java.lang.Runnable
                public final void run() {
                    ad adVar = ad.this;
                    ad.valueOf(adVar, hashMap2, adVar.AFVersionDeclaration, ad.this.valueOf);
                }
            }).start();
            hashMap.put("dev_key", this.values);
            hashMap.put("app_id", context.getPackageName());
            hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
            hashMap.put("advertiserId", AppsFlyerProperties.getInstance().getString("advertiserId"));
            String jSONObject = new JSONObject(hashMap).toString();
            String format = String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName());
            aj.valueOf().valueOf("server_request", format, jSONObject);
            HttpURLConnection AFInAppEventType2 = AFInAppEventType((bk) new bm().AFKeystoreWrapper(hashMap).AFInAppEventType(format));
            int i10 = -1;
            if (AFInAppEventType2 != null) {
                i10 = AFInAppEventType2.getResponseCode();
            }
            ae.valueOf();
            String valueOf = ae.valueOf(AFInAppEventType2);
            aj.valueOf().valueOf("server_response", format, String.valueOf(i10), valueOf);
            JSONObject jSONObject2 = new JSONObject(valueOf);
            jSONObject2.put("code", i10);
            if (i10 == 200) {
                StringBuilder sb2 = new StringBuilder("Validate response 200 ok: ");
                sb2.append(jSONObject2.toString());
                AFLogger.AFKeystoreWrapper(sb2.toString());
                AFInAppEventParameterName(jSONObject2.optBoolean("result"), this.AppsFlyer2dXConversionCallback, this.init, this.getLevel, jSONObject2.toString());
            } else {
                AFLogger.AFKeystoreWrapper("Failed Validate request");
                AFInAppEventParameterName(false, this.AppsFlyer2dXConversionCallback, this.init, this.getLevel, jSONObject2.toString());
            }
            if (AFInAppEventType2 != null) {
                AFInAppEventType2.disconnect();
            }
        }
    }
}
