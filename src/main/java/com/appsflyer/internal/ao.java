package com.appsflyer.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ao extends ak {
    public boolean AFInAppEventParameterName;
    private String AFVersionDeclaration;
    private String getLevel;
    public b valueOf;

    /* loaded from: classes.dex */
    public interface b {
        void AFKeystoreWrapper(Map<String, String> map);

        void values(String str);
    }

    public ao(Uri uri, ae aeVar, Context context) {
        super(aeVar, context, "GET");
        String[] strArr;
        this.AFInAppEventParameterName = false;
        if (TextUtils.isEmpty(uri.getHost()) || TextUtils.isEmpty(uri.getPath())) {
            return;
        }
        String[] strArr2 = {"onelink.me", "onelnk.com", "app.aflink.com"};
        boolean z10 = false;
        for (int i10 = 0; i10 < 3; i10++) {
            if (uri.getHost().contains(strArr2[i10])) {
                z10 = true;
            }
        }
        if (j.init != null) {
            StringBuilder sb2 = new StringBuilder("Validate if link ");
            sb2.append(uri);
            sb2.append(" belongs to custom domains: ");
            sb2.append(Arrays.asList(j.init));
            AFLogger.valueOf(sb2.toString());
            for (String str : j.init) {
                if (uri.getHost().contains(str) && !TextUtils.isEmpty(str)) {
                    AFLogger.values("Link matches custom domain: ".concat(String.valueOf(str)));
                    this.AFInAppEventParameterName = true;
                    z10 = true;
                }
            }
        }
        String[] split = uri.getPath().split("/");
        if (z10 && split.length == 3) {
            this.AFKeystoreWrapper = split[1];
            this.getLevel = split[2];
            this.AFVersionDeclaration = uri.toString();
        }
    }

    @Override // com.appsflyer.internal.ak
    public final void AFInAppEventParameterName() {
        String str = this.AFVersionDeclaration;
        if (str == null) {
            str = "Can't get OneLink data";
        }
        this.valueOf.values(str);
    }

    @Override // com.appsflyer.internal.ak
    public final void AFInAppEventParameterName(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
            this.valueOf.AFKeystoreWrapper(hashMap);
        } catch (JSONException e10) {
            this.valueOf.values("Can't parse OneLink data");
            AFLogger.AFInAppEventParameterName("Error while parsing to json ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.appsflyer.internal.ak
    public final String valueOf() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(ak.values, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName()));
        sb2.append("/");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append("?id=");
        sb2.append(this.getLevel);
        return sb2.toString();
    }

    @Override // com.appsflyer.internal.ak
    public final void values(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestProperty("Af-UUID", this.AFLogger$LogLevel);
        String valueOf = String.valueOf(this.AppsFlyer2dXConversionCallback.get("build_number"));
        httpsURLConnection.setRequestProperty("Af-Meta-Sdk-Ver", valueOf);
        httpsURLConnection.setRequestProperty("Af-Meta-Counter", String.valueOf(this.AppsFlyer2dXConversionCallback.get("counter")));
        httpsURLConnection.setRequestProperty("Af-Meta-Model", String.valueOf(this.AppsFlyer2dXConversionCallback.get("model")));
        httpsURLConnection.setRequestProperty("Af-Meta-Platform", String.valueOf(this.AppsFlyer2dXConversionCallback.get("platformextension")));
        httpsURLConnection.setRequestProperty("Af-Meta-System-Version", String.valueOf(this.AppsFlyer2dXConversionCallback.get("sdk")));
        AFKeystoreWrapper(httpsURLConnection, this.AFInAppEventType, this.AFLogger$LogLevel, this.AFKeystoreWrapper, this.getLevel, valueOf);
    }

    public final boolean values() {
        return (TextUtils.isEmpty(this.AFKeystoreWrapper) || TextUtils.isEmpty(this.getLevel) || this.AFKeystoreWrapper.equals("app")) ? false : true;
    }
}
