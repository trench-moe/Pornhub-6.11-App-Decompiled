package com.appsflyer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.ae;
import java.net.URI;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class AppsFlyerLib {
    public static AppsFlyerLib getInstance() {
        return ae.valueOf();
    }

    public abstract void addPushNotificationDeepLinkPath(String... strArr);

    public abstract void anonymizeUser(boolean z10);

    public abstract void appendParametersToDeepLinkingURL(String str, Map<String, String> map);

    public abstract void enableFacebookDeferredApplinks(boolean z10);

    public abstract AppsFlyerLib enableLocationCollection(boolean z10);

    public abstract String getAppsFlyerUID(Context context);

    public abstract String getAttributionId(Context context);

    public abstract String getHostName();

    public abstract String getHostPrefix();

    public abstract String getOutOfStore(Context context);

    public abstract String getSdkVersion();

    public abstract AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context);

    public abstract boolean isPreInstalledApp(Context context);

    public abstract boolean isStopped();

    public abstract void logEvent(Context context, String str, Map<String, Object> map);

    public abstract void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener);

    public abstract void logLocation(Context context, double d, double d10);

    public abstract void logSession(Context context);

    public abstract void onPause(Context context);

    @Deprecated
    public abstract void performOnAppAttribution(Context context, URI uri);

    public abstract void performOnDeepLinking(Intent intent, Context context);

    public abstract void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener);

    public abstract void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener);

    public abstract void sendAdRevenue(Context context, Map<String, Object> map);

    public abstract void sendPushNotificationData(Activity activity);

    public abstract void setAdditionalData(Map<String, Object> map);

    public abstract void setAndroidIdData(String str);

    public abstract void setAppId(String str);

    public abstract void setAppInviteOneLink(String str);

    public abstract void setCollectAndroidID(boolean z10);

    public abstract void setCollectIMEI(boolean z10);

    public abstract void setCollectOaid(boolean z10);

    public abstract void setCurrencyCode(String str);

    public abstract void setCustomerIdAndLogSession(String str, Context context);

    public abstract void setCustomerUserId(String str);

    public abstract void setDebugLog(boolean z10);

    public abstract void setExtension(String str);

    public abstract void setHost(String str, String str2);

    public abstract void setImeiData(String str);

    public abstract void setIsUpdate(boolean z10);

    public abstract void setLogLevel(AFLogger.LogLevel logLevel);

    public abstract void setMinTimeBetweenSessions(int i10);

    public abstract void setOaidData(String str);

    public abstract void setOneLinkCustomDomain(String... strArr);

    public abstract void setOutOfStore(String str);

    public abstract void setPartnerData(String str, Map<String, Object> map);

    public abstract void setPhoneNumber(String str);

    public abstract void setPreinstallAttribution(String str, String str2, String str3);

    public abstract void setResolveDeepLinkURLs(String... strArr);

    public abstract void setSharingFilter(String... strArr);

    public abstract void setSharingFilterForAllPartners();

    public abstract void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr);

    public abstract void setUserEmails(String... strArr);

    public abstract void start(Context context);

    public abstract void start(Context context, String str);

    public abstract void start(Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener);

    public abstract void stop(boolean z10, Context context);

    public abstract void subscribeForDeepLink(DeepLinkListener deepLinkListener);

    public abstract void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j10);

    public abstract void unregisterConversionListener();

    public abstract void updateServerUninstallToken(Context context, String str);

    public abstract void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    public abstract void waitForCustomerUserId(boolean z10);
}
