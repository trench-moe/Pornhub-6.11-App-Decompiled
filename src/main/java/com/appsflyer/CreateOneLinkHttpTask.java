package com.appsflyer;

import android.content.Context;
import com.appsflyer.internal.ae;
import com.appsflyer.internal.ak;
import com.appsflyer.internal.m;
import com.appsflyer.oaid.BuildConfig;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CreateOneLinkHttpTask extends ak {
    public ResponseListener AFInAppEventParameterName;
    private final Map<String, String> AFVersionDeclaration;
    private final String getLevel;
    private String init;
    public String valueOf;

    /* loaded from: classes.dex */
    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, ae aeVar, Context context) {
        super(aeVar, context, "POST");
        this.init = BuildConfig.FLAVOR;
        if (context != null) {
            this.init = context.getPackageName();
        } else {
            AFLogger.AFVersionDeclaration("CreateOneLinkHttpTask: context can't be null");
        }
        this.AFKeystoreWrapper = str;
        this.getLevel = "-1";
        this.AFVersionDeclaration = map;
    }

    @Override // com.appsflyer.internal.ak
    public final void AFInAppEventParameterName() {
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.AFKeystoreWrapper, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.init).addParameter("af_siteid", this.init).addParameters(this.AFVersionDeclaration);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.AFInAppEventParameterName.onResponse(addParameters.generateLink());
    }

    @Override // com.appsflyer.internal.ak
    public final void AFInAppEventParameterName(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.AFInAppEventParameterName.onResponse(jSONObject.optString(keys.next()));
            }
        } catch (JSONException e10) {
            this.AFInAppEventParameterName.onResponseError("Can't parse one link data");
            AFLogger.AFInAppEventParameterName("Error while parsing to json ".concat(String.valueOf(str)), e10);
        }
    }

    @Override // com.appsflyer.internal.ak
    public final String valueOf() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(ak.values, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName()));
        sb2.append("/");
        sb2.append(this.AFKeystoreWrapper);
        return sb2.toString();
    }

    @Override // com.appsflyer.internal.ak
    public final void values(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", this.getLevel);
        hashMap.put("uuid", this.AFLogger$LogLevel);
        hashMap.put("data", this.AFVersionDeclaration);
        hashMap.put("meta", this.AppsFlyer2dXConversionCallback);
        String str = this.valueOf;
        if (str != null) {
            hashMap.put("brand_domain", str);
        }
        String jSONObject = m.AFInAppEventParameterName(hashMap).toString();
        AFKeystoreWrapper(httpsURLConnection, this.AFInAppEventType, jSONObject);
        httpsURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(jSONObject);
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}
