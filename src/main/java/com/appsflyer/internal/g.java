package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class g {
    public String AFInAppEventParameterName;
    public Map<String, Object> AFInAppEventType;
    public AppsFlyerRequestListener AFKeystoreWrapper;
    public String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public byte[] getLevel;
    public String init;
    private final boolean onAppOpenAttributionNative;
    public String onDeepLinkingNative;
    public int onInstallConversionDataLoadedNative;
    public boolean onInstallConversionFailureNative;
    public final Map<String, Object> valueOf;
    public Application values;

    public g() {
        this(null, null, null, null);
    }

    public g(String str, String str2, Boolean bool, Context context) {
        this.valueOf = new HashMap();
        this.AFVersionDeclaration = str;
        this.onDeepLinkingNative = str2;
        this.onAppOpenAttributionNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.values = (Application) context.getApplicationContext();
        }
    }

    public final boolean AFInAppEventParameterName() {
        return this.onInstallConversionFailureNative;
    }

    public g AFInAppEventType(String str) {
        this.onDeepLinkingNative = str;
        return this;
    }

    public final boolean AFInAppEventType() {
        return this.onAppOpenAttributionNative;
    }

    public final g AFKeystoreWrapper(Map<String, ?> map) {
        this.valueOf.putAll(map);
        return this;
    }

    public final byte[] AFKeystoreWrapper() {
        return this.getLevel;
    }

    public final Map<String, Object> valueOf() {
        return this.valueOf;
    }

    public final String values(String str) {
        String AFInAppEventParameterName = ae.valueOf().AFInAppEventParameterName(this.values);
        return AFInAppEventParameterName != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", AFInAppEventParameterName).build().toString() : str;
    }
}
