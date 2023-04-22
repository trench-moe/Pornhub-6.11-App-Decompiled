package com.appsflyer.share;

import android.content.Context;
import android.support.v4.media.a;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.internal.ae;
import com.appsflyer.internal.bv;
import com.appsflyer.internal.k;
import com.appsflyer.oaid.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public class LinkGenerator {
    public String AFInAppEventParameterName;
    private String AFInAppEventType;
    public String AFKeystoreWrapper;
    private String AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private String AppsFlyer2dXConversionCallback;
    private String getLevel;
    private String init;
    private String onAttributionFailureNative;
    private String onInstallConversionDataLoadedNative;
    private String valueOf;
    private String values;
    private Map<String, String> onInstallConversionFailureNative = new HashMap();
    private Map<String, String> onAppOpenAttributionNative = new HashMap();

    public LinkGenerator(String str) {
        this.AFInAppEventType = str;
    }

    private static String AFInAppEventType(String str, String str2) {
        try {
            return URLEncoder.encode(str, "utf8");
        } catch (UnsupportedEncodingException e10) {
            StringBuilder sb2 = new StringBuilder("Illegal ");
            sb2.append(str2);
            sb2.append(": ");
            sb2.append(str);
            AFLogger.AFInAppEventParameterName(sb2.toString(), e10);
            return BuildConfig.FLAVOR;
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName(th);
            return BuildConfig.FLAVOR;
        }
    }

    private StringBuilder AFInAppEventType() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.AFInAppEventParameterName;
        if (str == null || !str.startsWith("http")) {
            sb2.append(String.format(bv.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName()));
        } else {
            sb2.append(this.AFInAppEventParameterName);
        }
        if (this.AFKeystoreWrapper != null) {
            sb2.append('/');
            sb2.append(this.AFKeystoreWrapper);
        }
        this.onAppOpenAttributionNative.put("pid", this.AFInAppEventType);
        sb2.append('?');
        sb2.append("pid=");
        sb2.append(AFInAppEventType(this.AFInAppEventType, "media source"));
        String str2 = this.AFVersionDeclaration;
        if (str2 != null) {
            this.onAppOpenAttributionNative.put("af_referrer_uid", str2);
            sb2.append(Typography.amp);
            sb2.append("af_referrer_uid=");
            sb2.append(AFInAppEventType(this.AFVersionDeclaration, "referrerUID"));
        }
        String str3 = this.valueOf;
        if (str3 != null) {
            this.onAppOpenAttributionNative.put(AFInAppEventParameterName.AF_CHANNEL, str3);
            sb2.append(Typography.amp);
            sb2.append("af_channel=");
            sb2.append(AFInAppEventType(this.valueOf, "channel"));
        }
        String str4 = this.init;
        if (str4 != null) {
            this.onAppOpenAttributionNative.put("af_referrer_customer_id", str4);
            sb2.append(Typography.amp);
            sb2.append("af_referrer_customer_id=");
            sb2.append(AFInAppEventType(this.init, "referrerCustomerId"));
        }
        String str5 = this.values;
        if (str5 != null) {
            this.onAppOpenAttributionNative.put(DvdsConfig.TYPE_CATEGORY, str5);
            sb2.append(Typography.amp);
            sb2.append("c=");
            sb2.append(AFInAppEventType(this.values, "campaign"));
        }
        String str6 = this.AFLogger$LogLevel;
        if (str6 != null) {
            this.onAppOpenAttributionNative.put("af_referrer_name", str6);
            sb2.append(Typography.amp);
            sb2.append("af_referrer_name=");
            sb2.append(AFInAppEventType(this.AFLogger$LogLevel, "referrerName"));
        }
        String str7 = this.AppsFlyer2dXConversionCallback;
        if (str7 != null) {
            this.onAppOpenAttributionNative.put("af_referrer_image_url", str7);
            sb2.append(Typography.amp);
            sb2.append("af_referrer_image_url=");
            sb2.append(AFInAppEventType(this.AppsFlyer2dXConversionCallback, "referrerImageURL"));
        }
        if (this.onAttributionFailureNative != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.onAttributionFailureNative);
            boolean endsWith = this.onAttributionFailureNative.endsWith("/");
            String str8 = BuildConfig.FLAVOR;
            sb3.append(endsWith ? str8 : "/");
            String str9 = this.getLevel;
            if (str9 != null) {
                sb3.append(str9);
            }
            this.onAppOpenAttributionNative.put("af_dp", sb3.toString());
            sb2.append(Typography.amp);
            sb2.append("af_dp=");
            sb2.append(AFInAppEventType(this.onAttributionFailureNative, "baseDeeplink"));
            if (this.getLevel != null) {
                if (!this.onAttributionFailureNative.endsWith("/")) {
                    str8 = "%2F";
                }
                sb2.append(str8);
                sb2.append(AFInAppEventType(this.getLevel, "deeplinkPath"));
            }
        }
        while (true) {
            for (String str10 : this.onInstallConversionFailureNative.keySet()) {
                String obj = sb2.toString();
                StringBuilder l10 = a.l(str10, "=");
                l10.append(AFInAppEventType(this.onInstallConversionFailureNative.get(str10), str10));
                if (!obj.contains(l10.toString())) {
                    sb2.append(Typography.amp);
                    sb2.append(str10);
                    sb2.append('=');
                    sb2.append(AFInAppEventType(this.onInstallConversionFailureNative.get(str10), str10));
                }
            }
            return sb2;
        }
    }

    public LinkGenerator addParameter(String str, String str2) {
        this.onInstallConversionFailureNative.put(str, str2);
        return this;
    }

    public LinkGenerator addParameters(Map<String, String> map) {
        if (map != null) {
            this.onInstallConversionFailureNative.putAll(map);
        }
        return this;
    }

    public String generateLink() {
        return AFInAppEventType().toString();
    }

    public void generateLink(Context context, CreateOneLinkHttpTask.ResponseListener responseListener) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        if (!this.onInstallConversionFailureNative.isEmpty()) {
            for (Map.Entry<String, String> entry : this.onInstallConversionFailureNative.entrySet()) {
                this.onAppOpenAttributionNative.put(entry.getKey(), entry.getValue());
            }
        }
        AFInAppEventType();
        String str = this.onInstallConversionDataLoadedNative;
        Map<String, String> map = this.onAppOpenAttributionNative;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, generate User Invite Link is disabled", true);
            return;
        }
        CreateOneLinkHttpTask createOneLinkHttpTask = new CreateOneLinkHttpTask(string, map, ae.valueOf(), context);
        createOneLinkHttpTask.AFInAppEventParameterName = responseListener;
        createOneLinkHttpTask.valueOf = str;
        if (k.AFKeystoreWrapper == null) {
            k.AFKeystoreWrapper = new k();
        }
        k.AFKeystoreWrapper.valueOf().execute(createOneLinkHttpTask);
    }

    public String getBrandDomain() {
        return this.onInstallConversionDataLoadedNative;
    }

    public String getCampaign() {
        return this.values;
    }

    public String getChannel() {
        return this.valueOf;
    }

    public String getMediaSource() {
        return this.AFInAppEventType;
    }

    public Map<String, String> getParameters() {
        return this.onInstallConversionFailureNative;
    }

    public LinkGenerator setBaseDeeplink(String str) {
        this.onAttributionFailureNative = str;
        return this;
    }

    public LinkGenerator setBaseURL(String str, String str2, String str3) {
        if (str == null || str.length() <= 0) {
            this.AFInAppEventParameterName = String.format("https://%s/%s", String.format("%sapp.%s", AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName()), str3);
        } else {
            if (str2 != null) {
                if (str2.length() < 5) {
                }
                this.AFInAppEventParameterName = String.format("https://%s/%s", str2, str);
            }
            str2 = "go.onelink.me";
            this.AFInAppEventParameterName = String.format("https://%s/%s", str2, str);
        }
        return this;
    }

    public LinkGenerator setBrandDomain(String str) {
        this.onInstallConversionDataLoadedNative = str;
        return this;
    }

    public LinkGenerator setCampaign(String str) {
        this.values = str;
        return this;
    }

    public LinkGenerator setChannel(String str) {
        this.valueOf = str;
        return this;
    }

    public LinkGenerator setDeeplinkPath(String str) {
        this.getLevel = str;
        return this;
    }

    public LinkGenerator setReferrerCustomerId(String str) {
        this.init = str;
        return this;
    }

    public LinkGenerator setReferrerImageURL(String str) {
        this.AppsFlyer2dXConversionCallback = str;
        return this;
    }

    public LinkGenerator setReferrerName(String str) {
        this.AFLogger$LogLevel = str;
        return this;
    }

    public LinkGenerator setReferrerUID(String str) {
        this.AFVersionDeclaration = str;
        return this;
    }
}
