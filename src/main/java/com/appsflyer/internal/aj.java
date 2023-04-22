package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aj {
    private static String AFInAppEventType = "https://%smonitorsdk.%s/remote-debug?app_id=";
    private static aj valueOf;
    private JSONObject AFInAppEventParameterName;
    private boolean AppsFlyer2dXConversionCallback;
    private boolean getLevel;
    private int init;
    public boolean values;
    private boolean AFKeystoreWrapper = true;
    private final List<String> AFVersionDeclaration = new ArrayList();
    private String AFLogger$LogLevel = "-1";

    private aj() {
        this.init = 0;
        boolean z10 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
        this.getLevel = z10;
        this.values = true ^ z10;
        this.init = 0;
        this.AppsFlyer2dXConversionCallback = false;
    }

    public static void AFInAppEventParameterName(String str, PackageManager packageManager) {
        try {
            if (valueOf == null) {
                valueOf = new aj();
            }
            valueOf.AFKeystoreWrapper(str, packageManager);
            if (valueOf == null) {
                valueOf = new aj();
            }
            String level = valueOf.getLevel();
            bi biVar = new bi();
            biVar.onAppOpenAttributionNative = level;
            biVar.onConversionDataSuccess = AppsFlyerLib.getInstance().isStopped();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(String.format(AFInAppEventType, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName()));
            sb2.append(str);
            new Thread(new m((bf) biVar.AFInAppEventType(sb2.toString()))).start();
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName(th);
        }
    }

    private synchronized void AFKeystoreWrapper(String str, PackageManager packageManager) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        ae valueOf2 = ae.valueOf();
        String string = appsFlyerProperties.getString("remote_debug_static_data");
        if (string != null) {
            try {
                this.AFInAppEventParameterName = new JSONObject(string);
            } catch (Throwable unused) {
            }
        } else {
            this.AFInAppEventParameterName = new JSONObject();
            AFKeystoreWrapper(Build.BRAND, Build.MODEL, Build.VERSION.RELEASE, appsFlyerProperties.getString("advertiserId"), valueOf2.AppsFlyer2dXConversionCallback, valueOf2.getLevel);
            StringBuilder sb2 = new StringBuilder("6.3.1.");
            sb2.append(ae.values);
            valueOf(sb2.toString(), appsFlyerProperties.getString(AppsFlyerProperties.AF_KEY), appsFlyerProperties.getString("KSAppsFlyerId"), appsFlyerProperties.getString("uid"));
            try {
                int i10 = packageManager.getPackageInfo(str, 0).versionCode;
                values(str, String.valueOf(i10), appsFlyerProperties.getString("channel"), appsFlyerProperties.getString("preInstallName"));
            } catch (Throwable unused2) {
            }
            appsFlyerProperties.set("remote_debug_static_data", this.AFInAppEventParameterName.toString());
        }
        try {
            this.AFInAppEventParameterName.put("launch_counter", this.AFLogger$LogLevel);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private synchronized void AFKeystoreWrapper(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.AFInAppEventParameterName.put("brand", str);
            this.AFInAppEventParameterName.put("model", str2);
            this.AFInAppEventParameterName.put("platform", "Android");
            this.AFInAppEventParameterName.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.AFInAppEventParameterName.put("advertiserId", str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.AFInAppEventParameterName.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.AFInAppEventParameterName.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    private boolean AFVersionDeclaration() {
        return this.values && (this.AFKeystoreWrapper || this.AppsFlyer2dXConversionCallback);
    }

    private synchronized void AppsFlyer2dXConversionCallback() {
        try {
            this.AFVersionDeclaration.clear();
            this.init = 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String getLevel() {
        String str;
        try {
            this.AFInAppEventParameterName.put("data", new JSONArray((Collection) this.AFVersionDeclaration));
            str = this.AFInAppEventParameterName.toString();
            try {
                AppsFlyer2dXConversionCallback();
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            str = null;
        }
        return str;
    }

    public static aj valueOf() {
        if (valueOf == null) {
            valueOf = new aj();
        }
        return valueOf;
    }

    private synchronized void valueOf(String str, String str2, String str3, String str4) {
        try {
            this.AFInAppEventParameterName.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.AFInAppEventParameterName.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFInAppEventParameterName.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.AFInAppEventParameterName.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    public static String[] valueOf(String str, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new String[]{str};
        }
        String[] strArr = new String[stackTraceElementArr.length + 1];
        strArr[0] = str;
        for (int i10 = 1; i10 < stackTraceElementArr.length; i10++) {
            strArr[i10] = stackTraceElementArr[i10].toString();
        }
        return strArr;
    }

    private synchronized void values(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.AFInAppEventParameterName.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.AFInAppEventParameterName.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.AFInAppEventParameterName.put("channel", str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.AFInAppEventParameterName.put("preInstall", str4);
        }
    }

    public final synchronized void AFInAppEventParameterName() {
        try {
            valueOf("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            this.AppsFlyer2dXConversionCallback = false;
            this.AFKeystoreWrapper = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void AFInAppEventParameterName(String str) {
        try {
            this.AFLogger$LogLevel = str;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void AFInAppEventType() {
        this.AFKeystoreWrapper = false;
        AppsFlyer2dXConversionCallback();
    }

    public final synchronized void AFKeystoreWrapper() {
        try {
            this.AppsFlyer2dXConversionCallback = true;
            valueOf("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean init() {
        return this.AppsFlyer2dXConversionCallback;
    }

    public final synchronized void valueOf(String str, String str2, String... strArr) {
        String obj;
        if (AFVersionDeclaration()) {
            if (this.init < 98304) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    String join = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(currentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" _/AppsFlyer_6.3.1 [");
                        sb2.append(str);
                        sb2.append("] ");
                        sb2.append(str2);
                        sb2.append(" ");
                        sb2.append(join);
                        obj = sb2.toString();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(currentTimeMillis);
                        sb3.append(" ");
                        sb3.append(Thread.currentThread().getId());
                        sb3.append(" ");
                        sb3.append(str2);
                        sb3.append("/AppsFlyer_6.3.1 ");
                        sb3.append(join);
                        obj = sb3.toString();
                    }
                    this.AFVersionDeclaration.add(obj);
                    this.init += obj.length() << 1;
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final synchronized void values() {
        this.AFInAppEventParameterName = null;
        valueOf = null;
    }
}
