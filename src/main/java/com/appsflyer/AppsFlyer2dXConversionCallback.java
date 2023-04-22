package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import java.util.Map;

/* loaded from: classes.dex */
public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r10 == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        onAttributionFailureNative(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AFKeystoreWrapper(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L50
            r5 = 1
            r0.<init>()     // Catch: org.json.JSONException -> L50
            r5 = 4
            java.lang.String r1 = "status"
            java.lang.String r4 = "failure"
            r2 = r4
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L50
            java.lang.String r4 = "data"
            r1 = r4
            r0.put(r1, r10)     // Catch: org.json.JSONException -> L50
            r4 = -1
            r10 = r4
            int r1 = r9.hashCode()     // Catch: org.json.JSONException -> L50
            r2 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r6 = 3
            r3 = 1
            if (r1 == r2) goto L37
            r2 = 1050716216(0x3ea0a838, float:0.3137834)
            r7 = 6
            if (r1 == r2) goto L2b
            goto L43
        L2b:
            java.lang.String r4 = "onInstallConversionFailure"
            r1 = r4
            boolean r9 = r9.equals(r1)     // Catch: org.json.JSONException -> L50
            if (r9 == 0) goto L43
            r4 = 0
            r10 = r4
            goto L43
        L37:
            r6 = 3
            java.lang.String r1 = "onAttributionFailure"
            boolean r9 = r9.equals(r1)     // Catch: org.json.JSONException -> L50
            if (r9 == 0) goto L43
            r6 = 4
            r4 = 1
            r10 = r4
        L43:
            if (r10 == 0) goto L4c
            if (r10 == r3) goto L48
            goto L4b
        L48:
            r8.onAttributionFailureNative(r0)     // Catch: org.json.JSONException -> L50
        L4b:
            return
        L4c:
            r8.onInstallConversionFailureNative(r0)     // Catch: org.json.JSONException -> L50
            return
        L50:
            r9 = move-exception
            r9.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.AFKeystoreWrapper(java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public native void onAppOpenAttributionNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onAttributionFailure(String str) {
        AFKeystoreWrapper("onInstallConversionFailure", str);
    }

    public native void onAttributionFailureNative(Object obj);

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataFail(String str) {
        AFKeystoreWrapper("onAttributionFailure", str);
    }

    @Override // com.appsflyer.AppsFlyerConversionListener
    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    @Override // com.appsflyer.deeplink.DeepLinkListener
    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);
}
