package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.ae;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppsFlyerProperties {
    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    private static AppsFlyerProperties AFKeystoreWrapper = new AppsFlyerProperties();
    public static final String AF_KEY = "AppsFlyerKey";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_FINGER_PRINT = "collectFingerPrint";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_MAC = "collectMAC";
    public static final String COLLECT_OAID = "collectOAID";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String DPM = "disableProxy";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String HTTP_CACHE = "http_cache";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String NEW_REFERRER_SENT = "newGPReferrerSent";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    public boolean AFInAppEventType;
    public String valueOf;
    private Map<String, Object> values = new HashMap();
    private boolean AFInAppEventParameterName = false;

    /* loaded from: classes.dex */
    public enum EmailsCryptType {
        NONE(0),
        SHA256(3);
        
        private final int AFKeystoreWrapper;

        EmailsCryptType(int i10) {
            this.AFKeystoreWrapper = i10;
        }

        public final int getValue() {
            return this.AFKeystoreWrapper;
        }
    }

    private AppsFlyerProperties() {
    }

    private boolean AFKeystoreWrapper() {
        return this.AFInAppEventParameterName;
    }

    public static AppsFlyerProperties getInstance() {
        return AFKeystoreWrapper;
    }

    public final boolean AFInAppEventParameterName() {
        return this.AFInAppEventType;
    }

    public boolean getBoolean(String str, boolean z10) {
        String string = getString(str);
        return string == null ? z10 : Boolean.valueOf(string).booleanValue();
    }

    public int getInt(String str, int i10) {
        String string = getString(str);
        return string == null ? i10 : Integer.valueOf(string).intValue();
    }

    public long getLong(String str, long j10) {
        String string = getString(str);
        return string == null ? j10 : Long.valueOf(string).longValue();
    }

    public synchronized Object getObject(String str) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.values.get(str);
    }

    public String getReferrer(Context context) {
        String str = this.valueOf;
        if (str != null) {
            return str;
        }
        if (getString("AF_REFERRER") != null) {
            return getString("AF_REFERRER");
        }
        if (context == null) {
            return null;
        }
        return ae.AFKeystoreWrapper(context).getString("referrer", null);
    }

    public synchronized String getString(String str) {
        return (String) this.values.get(str);
    }

    public boolean isEnableLog() {
        AFLogger.LogLevel logLevel = AFLogger.LogLevel.NONE;
        return getInt("logLevel", logLevel.getLevel()) > logLevel.getLevel();
    }

    public boolean isLogsDisabledCompletely() {
        return getBoolean(DISABLE_LOGS_COMPLETELY, false);
    }

    public boolean isOtherSdkStringDisabled() {
        return getBoolean(DISABLE_OTHER_SDK, false);
    }

    public synchronized void loadProperties(Context context) {
        if (AFKeystoreWrapper()) {
            return;
        }
        String string = ae.AFKeystoreWrapper(context).getString("savedProperties", null);
        if (string != null) {
            AFLogger.values("Loading properties..");
            try {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (true) {
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (this.values.get(next) == null) {
                            this.values.put(next, jSONObject.getString(next));
                        }
                    }
                }
                this.AFInAppEventParameterName = true;
            } catch (JSONException e10) {
                AFLogger.AFInAppEventParameterName("Failed loading properties", e10);
            }
            StringBuilder sb2 = new StringBuilder("Done loading properties: ");
            sb2.append(this.AFInAppEventParameterName);
            AFLogger.values(sb2.toString());
        }
    }

    public synchronized void remove(String str) {
        this.values.remove(str);
    }

    public synchronized void saveProperties(SharedPreferences sharedPreferences) {
        try {
            sharedPreferences.edit().putString("savedProperties", new JSONObject(this.values).toString()).apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void set(String str, int i10) {
        this.values.put(str, Integer.toString(i10));
    }

    public synchronized void set(String str, long j10) {
        this.values.put(str, Long.toString(j10));
    }

    public synchronized void set(String str, String str2) {
        try {
            this.values.put(str, str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void set(String str, boolean z10) {
        try {
            this.values.put(str, Boolean.toString(z10));
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void set(String str, String[] strArr) {
        this.values.put(str, strArr);
    }

    public synchronized void setCustomData(String str) {
        this.values.put(ADDITIONAL_CUSTOM_DATA, str);
    }

    public synchronized void setUserEmails(String str) {
        this.values.put(USER_EMAILS, str);
    }
}
