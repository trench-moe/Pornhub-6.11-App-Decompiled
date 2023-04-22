package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.WindowManager;
import c9.f;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.attribution.RequestError;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.ag;
import com.appsflyer.internal.ao;
import com.appsflyer.internal.bt;
import com.appsflyer.internal.d;
import com.appsflyer.internal.l;
import com.appsflyer.internal.v;
import com.appsflyer.internal.y;
import com.appsflyer.oaid.BuildConfig;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URL;
import java.security.KeyStoreException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ae extends AppsFlyerLib {
    public static final String AFInAppEventParameterName;
    public static AppsFlyerInAppPurchaseValidatorListener AFInAppEventType = null;
    public static final String AFKeystoreWrapper = "6.3";
    private static String onAppOpenAttribution = null;
    private static String onAppOpenAttributionNative = null;
    private static String onAttributionFailure = null;
    private static String onAttributionFailureNative = "https://%sstats.%s/stats";
    private static String onConversionDataFail = null;
    private static ae onDeepLinking = null;
    private static final String onInstallConversionDataLoadedNative;
    private static String onInstallConversionFailureNative = null;
    public static AppsFlyerConversionListener valueOf = null;
    public static final String values = "109";
    public long AFLogger$LogLevel;
    public String[] AFVersionDeclaration;
    public String AppsFlyer2dXConversionCallback;
    public String getLevel;
    private Map<Long, String> getSdkVersion;
    public au init;
    public bt[] onDeepLinkingNative;
    private long onPause;
    private long onValidateInAppFailure;
    private SharedPreferences setAdditionalData;
    private av setAppInviteOneLink;
    private Map<String, Object> setCustomerIdAndLogSession;
    private boolean setDebugLog;
    private Application setOaidData;
    private Map<String, Object> setPhoneNumber;
    private boolean stop;
    private String updateServerUninstallToken;
    private String waitForCustomerUserId;
    private long onConversionDataSuccess = -1;
    private long AppsFlyerConversionListener = -1;
    private long AppsFlyerInAppPurchaseValidatorListener = TimeUnit.SECONDS.toMillis(5);
    private boolean AppsFlyerLib = false;
    private ScheduledExecutorService onValidateInApp = null;
    private boolean getInstance = false;
    private final al setImeiData = new al();
    private boolean enableLocationCollection = false;
    private boolean setAndroidIdData = false;
    private boolean getOutOfStore = false;
    private boolean setCustomerUserId = false;
    private final JSONObject setOutOfStore = new JSONObject();
    private final Executor setUserEmails = Executors.newSingleThreadExecutor();

    /* renamed from: com.appsflyer.internal.ae$9  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass9 {
        public static final /* synthetic */ int[] AFInAppEventParameterName;
        public static final /* synthetic */ int[] AFKeystoreWrapper;

        static {
            int[] iArr = new int[bt.e.values().length];
            AFKeystoreWrapper = iArr;
            try {
                iArr[bt.e.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AFKeystoreWrapper[bt.e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            AFInAppEventParameterName = iArr2;
            try {
                iArr2[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AFInAppEventParameterName[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        private final g valueOf;

        private c(g gVar) {
            this.valueOf = gVar;
        }

        public /* synthetic */ c(ae aeVar, g gVar, byte b10) {
            this(gVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ae.AFInAppEventParameterName(ae.this, this.valueOf);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        private final g AFInAppEventParameterName;

        private d(g gVar) {
            this.AFInAppEventParameterName = gVar;
        }

        public /* synthetic */ d(ae aeVar, g gVar, byte b10) {
            this(gVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:106:0x023b  */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v13, types: [java.io.Writer] */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r3v36 */
        /* JADX WARN: Type inference failed for: r3v37 */
        /* JADX WARN: Type inference failed for: r3v38 */
        /* JADX WARN: Type inference failed for: r3v39 */
        /* JADX WARN: Type inference failed for: r3v40 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x021d -> B:109:0x0221). Please submit an issue!!! */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 596
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.d.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        private final Application valueOf;

        public e(Context context) {
            this.valueOf = (Application) context.getApplicationContext();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ae.this.AppsFlyerLib) {
                return;
            }
            ae.this.AFLogger$LogLevel = System.currentTimeMillis();
            ae.this.AppsFlyerLib = true;
            try {
                try {
                    String valueOf = ae.valueOf(AppsFlyerProperties.AF_KEY);
                    ai.valueOf();
                    for (h hVar : ai.AFKeystoreWrapper(this.valueOf)) {
                        StringBuilder sb2 = new StringBuilder("resending request: ");
                        sb2.append(hVar.AFKeystoreWrapper);
                        AFLogger.AFKeystoreWrapper(sb2.toString());
                        try {
                            long currentTimeMillis = System.currentTimeMillis();
                            long parseLong = Long.parseLong(hVar.AFInAppEventParameterName, 10);
                            ae aeVar = ae.this;
                            be beVar = new be();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(hVar.AFKeystoreWrapper);
                            sb3.append("&isCachedRequest=true&timeincache=");
                            sb3.append((currentTimeMillis - parseLong) / 1000);
                            g AFInAppEventType = beVar.AFInAppEventType(sb3.toString());
                            AFInAppEventType.getLevel = hVar.valueOf();
                            AFInAppEventType.init = valueOf;
                            Application application = this.valueOf;
                            if (application != null) {
                                AFInAppEventType.values = (Application) application.getApplicationContext();
                            }
                            AFInAppEventType.AFLogger$LogLevel = hVar.AFInAppEventParameterName;
                            AFInAppEventType.onInstallConversionFailureNative = false;
                            ae.AFKeystoreWrapper(aeVar, AFInAppEventType);
                        } catch (Exception e10) {
                            AFLogger.AFInAppEventParameterName("Failed to resend cached request", e10);
                        }
                    }
                } catch (Exception e11) {
                    AFLogger.AFInAppEventParameterName("failed to check cache. ", e11);
                }
                ae.this.AppsFlyerLib = false;
                ae.this.onValidateInApp.shutdown();
                ae.init(ae.this);
            } catch (Throwable th) {
                ae.this.AppsFlyerLib = false;
                throw th;
            }
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AFKeystoreWrapper);
        sb2.append("/androidevent?buildnumber=6.3.1&app_id=");
        AFInAppEventParameterName = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%sadrevenue.%s/api/v");
        sb3.append(AFKeystoreWrapper);
        sb3.append("/android?buildnumber=6.3.1&app_id=");
        onInstallConversionFailureNative = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(AFKeystoreWrapper);
        sb4.append("/androidevent?app_id=");
        String obj = sb4.toString();
        onInstallConversionDataLoadedNative = obj;
        StringBuilder sb5 = new StringBuilder("https://%sconversions.%s/api/v");
        sb5.append(obj);
        onAppOpenAttributionNative = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%slaunches.%s/api/v");
        sb6.append(obj);
        onAttributionFailure = sb6.toString();
        StringBuilder sb7 = new StringBuilder("https://%sinapps.%s/api/v");
        sb7.append(obj);
        onAppOpenAttribution = sb7.toString();
        StringBuilder sb8 = new StringBuilder("https://%sattr.%s/api/v");
        sb8.append(obj);
        onConversionDataFail = sb8.toString();
        AFInAppEventType = null;
        valueOf = null;
        onDeepLinking = new ae();
    }

    public ae() {
        AFVersionDeclaration.init();
    }

    private static String AFInAppEventParameterName(Activity activity) {
        Intent intent;
        String str = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null && (str = extras.getString("af")) != null) {
                    AFLogger.AFKeystoreWrapper("Push Notification received af payload = ".concat(str));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                }
            } catch (Throwable th) {
                AFLogger.AFInAppEventParameterName(th.getMessage(), th);
            }
        }
        return str;
    }

    private static String AFInAppEventParameterName(String str, PackageManager packageManager, String str2) {
        Object obj;
        try {
            Bundle bundle = ((PackageItemInfo) packageManager.getApplicationInfo(str2, 128)).metaData;
            if (bundle != null && (obj = bundle.get(str)) != null) {
                return obj.toString();
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Could not find ");
            sb2.append(str);
            sb2.append(" value in the manifest");
            AFLogger.AFInAppEventParameterName(sb2.toString(), th);
        }
        return null;
    }

    public static Map<String, Object> AFInAppEventParameterName(Map<String, Object> map) {
        if (map.containsKey("meta")) {
            return (Map) map.get("meta");
        }
        HashMap hashMap = new HashMap();
        map.put("meta", hashMap);
        return hashMap;
    }

    public static void AFInAppEventParameterName(Context context, String str, String str2) {
        SharedPreferences.Editor edit = AFKeystoreWrapper(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void AFInAppEventParameterName(com.appsflyer.internal.ae r13, com.appsflyer.internal.g r14) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.AFInAppEventParameterName(com.appsflyer.internal.ae, com.appsflyer.internal.g):void");
    }

    private boolean AFInAppEventParameterName() {
        Map<String, Object> map = this.setCustomerIdAndLogSession;
        return (map == null || map.isEmpty()) ? false : true;
    }

    private static String AFInAppEventType(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName(th.getMessage(), th);
            return null;
        }
    }

    private String AFInAppEventType(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        String string = AFKeystoreWrapper(context).getString("appsFlyerFirstInstall", null);
        if (string == null) {
            if (valueOf(context)) {
                AFLogger.values("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = BuildConfig.FLAVOR;
            }
            string = str;
            SharedPreferences.Editor edit = AFKeystoreWrapper(context).edit();
            edit.putString("appsFlyerFirstInstall", string);
            edit.apply();
        }
        AFLogger.AFKeystoreWrapper("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    /* JADX WARN: Finally extract failed */
    private static void AFInAppEventType(Context context) {
        int i10;
        if (aa.AFInAppEventParameterName()) {
            i10 = 23;
            AFLogger.valueOf("OPPO device found");
        } else {
            i10 = 18;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10 || AFKeystoreWrapper(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            StringBuilder sb2 = new StringBuilder("OS SDK is=");
            sb2.append(i11);
            sb2.append("; no KeyStore usage");
            AFLogger.valueOf(sb2.toString());
            return;
        }
        StringBuilder sb3 = new StringBuilder("OS SDK is=");
        sb3.append(i11);
        sb3.append("; use KeyStore");
        AFLogger.valueOf(sb3.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (aFKeystoreWrapper.AFInAppEventType()) {
            String values2 = aFKeystoreWrapper.values();
            synchronized (aFKeystoreWrapper.AFInAppEventType) {
                try {
                    aFKeystoreWrapper.valueOf++;
                    AFLogger.AFKeystoreWrapper("Deleting key with alias: ".concat(String.valueOf(values2)));
                    try {
                        synchronized (aFKeystoreWrapper.AFInAppEventType) {
                            try {
                                aFKeystoreWrapper.values.deleteEntry(values2);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (KeyStoreException e10) {
                        StringBuilder sb4 = new StringBuilder("Exception ");
                        sb4.append(e10.getMessage());
                        sb4.append(" occurred");
                        AFLogger.AFInAppEventParameterName(sb4.toString(), e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.values());
        } else {
            aFKeystoreWrapper.AFInAppEventParameterName = an.AFInAppEventType(new WeakReference(context));
            aFKeystoreWrapper.valueOf = 0;
            aFKeystoreWrapper.AFInAppEventParameterName(aFKeystoreWrapper.values());
        }
        AppsFlyerProperties.getInstance().set("KSAppsFlyerId", aFKeystoreWrapper.AFInAppEventParameterName());
        AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFKeystoreWrapper()));
    }

    private void AFInAppEventType(Context context, String str, Map<String, Object> map) {
        bj bjVar = new bj();
        if (context != null) {
            bjVar.values = (Application) context.getApplicationContext();
        }
        bjVar.AFVersionDeclaration = str;
        bjVar.AFInAppEventType = map;
        values(bjVar, context instanceof Activity ? (Activity) context : null);
    }

    public static int AFKeystoreWrapper(SharedPreferences sharedPreferences, String str, boolean z10) {
        int i10 = sharedPreferences.getInt(str, 0);
        if (z10) {
            i10++;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str, i10);
            edit.apply();
        }
        if (aj.valueOf().init()) {
            aj.valueOf().AFInAppEventParameterName(String.valueOf(i10));
        }
        return i10;
    }

    public static SharedPreferences AFKeystoreWrapper(Context context) {
        ae aeVar = onDeepLinking;
        if (aeVar.setAdditionalData == null) {
            aeVar.setAdditionalData = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        }
        return onDeepLinking.setAdditionalData;
    }

    private static File AFKeystoreWrapper(String str) {
        if (str != null) {
            try {
                if (str.trim().length() > 0) {
                    return new File(str.trim());
                }
            } catch (Throwable th) {
                AFLogger.AFInAppEventParameterName(th.getMessage(), th);
            }
        }
        return null;
    }

    private static String AFKeystoreWrapper(File file, String str) {
        FileReader fileReader;
        Properties properties;
        try {
            try {
                try {
                    properties = new Properties();
                    fileReader = new FileReader(file);
                } catch (FileNotFoundException unused) {
                    fileReader = null;
                } catch (Throwable th) {
                    th = th;
                    fileReader = null;
                }
                try {
                    properties.load(fileReader);
                    AFLogger.AFKeystoreWrapper("Found PreInstall property!");
                    String property = properties.getProperty(str);
                    try {
                        fileReader.close();
                    } catch (Throwable th2) {
                        AFLogger.AFInAppEventParameterName(th2.getMessage(), th2);
                    }
                    return property;
                } catch (FileNotFoundException unused2) {
                    StringBuilder sb2 = new StringBuilder("PreInstall file wasn't found: ");
                    sb2.append(file.getAbsolutePath());
                    AFLogger.values(sb2.toString());
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    return null;
                }
            } catch (Throwable th4) {
                AFLogger.AFInAppEventParameterName(th4.getMessage(), th4);
                return null;
            }
        } catch (Throwable th5) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Throwable th6) {
                    AFLogger.AFInAppEventParameterName(th6.getMessage(), th6);
                }
            }
            throw th5;
        }
    }

    public static String AFKeystoreWrapper(SimpleDateFormat simpleDateFormat, long j10) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j10));
    }

    public static void AFKeystoreWrapper(Context context, String str) {
        SharedPreferences.Editor edit = AFKeystoreWrapper(context).edit();
        edit.putBoolean(str, true);
        edit.apply();
    }

    public static void AFKeystoreWrapper(Context context, Map<String, ? super String> map) {
        y yVar = y.a.AFKeystoreWrapper;
        y.d AFInAppEventType2 = y.AFInAppEventType(context);
        map.put("network", AFInAppEventType2.valueOf);
        String str = AFInAppEventType2.AFInAppEventType;
        if (str != null) {
            map.put("operator", str);
        }
        String str2 = AFInAppEventType2.AFKeystoreWrapper;
        if (str2 != null) {
            map.put("carrier", str2);
        }
    }

    public static /* synthetic */ void AFKeystoreWrapper(ae aeVar, g gVar) {
        String jSONObject;
        StringBuilder sb2 = new StringBuilder("url: ");
        sb2.append(gVar.onDeepLinkingNative);
        AFLogger.AFKeystoreWrapper(sb2.toString());
        if (gVar.AFLogger$LogLevel != null) {
            jSONObject = Base64.encodeToString(gVar.AFKeystoreWrapper(), 2);
            AFLogger.AFKeystoreWrapper("cached data: ".concat(String.valueOf(jSONObject)));
        } else {
            jSONObject = new JSONObject(gVar.valueOf()).toString();
            String replaceAll = jSONObject.replaceAll("\\p{C}", "*Non-printing character*");
            if (!replaceAll.equals(jSONObject)) {
                AFLogger.AFVersionDeclaration("Payload contains non-printing characters");
                jSONObject = replaceAll;
            }
            am.AFKeystoreWrapper("data: ".concat(jSONObject));
        }
        aj.valueOf().valueOf("server_request", gVar.onDeepLinkingNative, jSONObject);
        try {
            aeVar.AFKeystoreWrapper(gVar);
        } catch (IOException e10) {
            AFLogger.AFInAppEventParameterName("Exception in sendRequestToServer. ", e10);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                aeVar.AFKeystoreWrapper(gVar.AFInAppEventType(gVar.onDeepLinkingNative.replace("https:", "http:")));
                return;
            }
            StringBuilder sb3 = new StringBuilder("failed to send request to server. ");
            sb3.append(e10.getLocalizedMessage());
            AFLogger.AFKeystoreWrapper(sb3.toString());
            throw e10;
        }
    }

    private void AFKeystoreWrapper(g gVar) {
        long currentTimeMillis;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        DataOutputStream dataOutputStream;
        URL url = new URL(gVar.onDeepLinkingNative);
        byte[] AFKeystoreWrapper2 = gVar.AFKeystoreWrapper();
        String str = gVar.init;
        String str2 = gVar.AFLogger$LogLevel;
        boolean AFInAppEventParameterName2 = gVar.AFInAppEventParameterName();
        Application application = gVar.values;
        AppsFlyerRequestListener appsFlyerRequestListener = gVar.AFKeystoreWrapper;
        boolean z10 = AFInAppEventParameterName2 && gVar.onInstallConversionDataLoadedNative == 1;
        if (z10) {
            try {
                this.setOutOfStore.put("from_fg", System.currentTimeMillis() - this.onValidateInAppFailure);
            } catch (JSONException unused) {
            }
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = 0;
        }
        try {
            httpURLConnection2 = (HttpURLConnection) url.openConnection();
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        try {
            httpURLConnection2.setRequestMethod("POST");
            httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(AFKeystoreWrapper2.length));
            httpURLConnection2.setRequestProperty("Content-Type", gVar.AFInAppEventType() ? "application/octet-stream" : "application/json");
            httpURLConnection2.setConnectTimeout(10000);
            httpURLConnection2.setDoOutput(true);
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
                httpURLConnection2.setUseCaches(false);
            }
            try {
                dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
            try {
                dataOutputStream.write(AFKeystoreWrapper2);
                dataOutputStream.close();
                int responseCode = httpURLConnection2.getResponseCode();
                if (z10) {
                    try {
                        this.setOutOfStore.put("net", System.currentTimeMillis() - currentTimeMillis);
                    } catch (JSONException unused2) {
                    }
                }
                if (this.init == null) {
                    this.init = new au(application);
                }
                this.init.AFKeystoreWrapper.edit().putString("first_launch", this.setOutOfStore.toString()).apply();
                String valueOf2 = valueOf(httpURLConnection2);
                aj.valueOf().valueOf("server_response", url.toString(), String.valueOf(responseCode), valueOf2);
                AFLogger.AFKeystoreWrapper("response code: ".concat(String.valueOf(responseCode)));
                SharedPreferences AFKeystoreWrapper3 = AFKeystoreWrapper(application);
                if (responseCode == 200) {
                    if (application != null && AFInAppEventParameterName2) {
                        this.AppsFlyerConversionListener = System.currentTimeMillis();
                    }
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onSuccess();
                    }
                    if (str2 != null) {
                        ai.valueOf();
                        ai.AFInAppEventParameterName(str2, application);
                    } else {
                        SharedPreferences.Editor edit = AFKeystoreWrapper(application).edit();
                        edit.putString("sentSuccessfully", "true");
                        edit.apply();
                        if (!this.AppsFlyerLib && System.currentTimeMillis() - this.AFLogger$LogLevel >= 15000 && this.onValidateInApp == null) {
                            if (k.AFKeystoreWrapper == null) {
                                k.AFKeystoreWrapper = new k();
                            }
                            this.onValidateInApp = k.AFKeystoreWrapper.values();
                            values(this.onValidateInApp, new e(application), 1L, TimeUnit.SECONDS);
                        }
                    }
                    bb bbVar = new bb(application);
                    l values2 = bbVar.values();
                    if (values2 != null && values2.valueOf()) {
                        String str3 = values2.AFKeystoreWrapper;
                        AFLogger.values("Resending Uninstall token to AF servers: ".concat(String.valueOf(str3)));
                        bbVar.valueOf(str3);
                    }
                    this.enableLocationCollection = ar.values(valueOf2).optBoolean("send_background", false);
                } else if (appsFlyerRequestListener != null) {
                    int i10 = RequestError.RESPONSE_CODE_FAILURE;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ax.AFInAppEventType);
                    sb2.append(" ");
                    sb2.append(responseCode);
                    appsFlyerRequestListener.onError(i10, sb2.toString());
                }
                ba.AFInAppEventType(this, gVar, str, application, AFKeystoreWrapper3, Integer.valueOf(responseCode), null);
                httpURLConnection2.disconnect();
            } catch (Throwable th3) {
                th = th3;
                if (dataOutputStream != null) {
                    dataOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            httpURLConnection = httpURLConnection2;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    private boolean AFKeystoreWrapper() {
        if (this.onConversionDataSuccess > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.onConversionDataSuccess;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", locale);
            long j10 = this.onConversionDataSuccess;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date(j10));
            long j11 = this.AppsFlyerConversionListener;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format2 = simpleDateFormat.format(new Date(j11));
            if (currentTimeMillis < this.AppsFlyerInAppPurchaseValidatorListener && !isStopped()) {
                AFLogger.AFKeystoreWrapper(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.AppsFlyerInAppPurchaseValidatorListener)));
                return true;
            } else if (!isStopped()) {
                AFLogger.AFKeystoreWrapper(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", format, format2, Long.valueOf(currentTimeMillis)));
                return false;
            }
        } else if (!isStopped()) {
            AFLogger.AFKeystoreWrapper("Sending first launch for this session!");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean AFKeystoreWrapper(g gVar, SharedPreferences sharedPreferences) {
        int AFKeystoreWrapper2 = AFKeystoreWrapper(sharedPreferences, "appsFlyerCount", false);
        return (!sharedPreferences.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false) && AFKeystoreWrapper2 == 1) || (AFKeystoreWrapper2 == 1 && !(gVar instanceof bh));
    }

    private static boolean AFKeystoreWrapper(String str, boolean z10) {
        return AppsFlyerProperties.getInstance().getBoolean(str, z10);
    }

    private static float AFLogger$LogLevel(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            return (intExtra / intExtra2) * 100.0f;
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName(th.getMessage(), th);
            return 1.0f;
        }
    }

    private boolean AFVersionDeclaration() {
        Map<String, Object> map = this.setPhoneNumber;
        return (map == null || map.isEmpty()) ? false : true;
    }

    private static boolean AFVersionDeclaration(Context context) {
        try {
            Object obj = c9.e.f3872c;
            if (c9.e.d.c(context, f.f3876a) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.AFInAppEventParameterName("WARNING:  Google Play Services is unavailable. ", e10);
            return false;
        }
    }

    private static boolean getLevel(Context context) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network network : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e10) {
                    AFLogger.AFInAppEventParameterName("Failed collecting ivc data", e10);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e11) {
                    AFLogger.AFInAppEventParameterName("Failed collecting ivc data", e11);
                }
            }
        }
        return false;
    }

    public static /* synthetic */ ScheduledExecutorService init(ae aeVar) {
        aeVar.onValidateInApp = null;
        return null;
    }

    private static boolean init(Context context) {
        boolean z10;
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) && !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            z10 = false;
            return (z10 && AFVersionDeclaration(context)) ? false : true;
        }
        z10 = true;
        if (z10) {
        }
    }

    public static ae valueOf() {
        return onDeepLinking;
    }

    public static String valueOf(String str) {
        return AppsFlyerProperties.getInstance().getString(str);
    }

    public static String valueOf(HttpURLConnection httpURLConnection) {
        String obj;
        InputStreamReader inputStreamReader;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                inputStreamReader = new InputStreamReader(errorStream);
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                    boolean z10 = false;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(z10 ? '\n' : BuildConfig.FLAVOR);
                            sb2.append(readLine);
                            z10 = true;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            try {
                                StringBuilder sb3 = new StringBuilder("Could not read connection response from: ");
                                sb3.append(httpURLConnection.getURL().toString());
                                AFLogger.AFInAppEventParameterName(sb3.toString(), th);
                                if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                }
                                obj = sb2.toString();
                                new JSONObject(obj);
                                return obj;
                            } catch (Throwable th2) {
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        AFLogger.AFInAppEventParameterName(th3);
                                        throw th2;
                                    }
                                }
                                if (inputStreamReader != null) {
                                    inputStreamReader.close();
                                    throw th2;
                                }
                                throw th2;
                            }
                        }
                    }
                    bufferedReader2.close();
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
            }
        } catch (Throwable th6) {
            AFLogger.AFInAppEventParameterName(th6);
        }
        obj = sb2.toString();
        try {
            new JSONObject(obj);
            return obj;
        } catch (JSONException unused) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("string_response", obj);
                return jSONObject.toString();
            } catch (JSONException unused2) {
                return new JSONObject().toString();
            }
        }
    }

    private static void valueOf(Context context, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? BuildConfig.FLAVOR : "lr" : "pr" : "l" : DvdsConfig.DEFAULT_ORDER_PARAM);
        }
    }

    private void valueOf(g gVar) {
        boolean z10 = gVar.AFVersionDeclaration == null;
        if (values()) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, reporting is disabled", true);
            return;
        }
        if (z10) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.AFKeystoreWrapper("Allowing multiple launches within a 5 second time window.");
            } else if (AFKeystoreWrapper()) {
                AppsFlyerRequestListener appsFlyerRequestListener = gVar.AFKeystoreWrapper;
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.EVENT_TIMEOUT, ax.valueOf);
                    return;
                }
                return;
            }
            this.onConversionDataSuccess = System.currentTimeMillis();
        }
        if (k.AFKeystoreWrapper == null) {
            k.AFKeystoreWrapper = new k();
        }
        values(k.AFKeystoreWrapper.values(), new c(this, gVar, (byte) 0), 0L, TimeUnit.MILLISECONDS);
    }

    private static void valueOf(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i10)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String next = keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i11 = 0;
                    while (i11 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i11) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i11) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i11) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i11++;
                            str = next;
                        }
                    }
                    continue;
                } catch (JSONException unused2) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    public static boolean valueOf(Context context) {
        return !AFKeystoreWrapper(context).contains("appsFlyerCount");
    }

    private static boolean valueOf(File file) {
        return file == null || !file.exists();
    }

    private static String values(String str) {
        String str2 = str;
        if (str2 == null) {
            return null;
        }
        if (str2.matches("fb\\d*?://authorize.*") && str2.contains("access_token")) {
            int indexOf = str2.indexOf(63);
            String substring = indexOf == -1 ? BuildConfig.FLAVOR : str2.substring(indexOf);
            if (substring.length() == 0) {
                return str2;
            }
            ArrayList arrayList = new ArrayList();
            if (substring.contains("&")) {
                arrayList = new ArrayList(Arrays.asList(substring.split("&")));
            } else {
                arrayList.add(substring);
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.contains("access_token")) {
                    it.remove();
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("&");
                    } else if (!str3.startsWith("?")) {
                        sb2.append("?");
                    }
                    sb2.append(str3);
                }
            }
            str2 = str2.replace(substring, sb2.toString());
        }
        return str2;
    }

    public static void values(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j10, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j10, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e10) {
                AFLogger.AFInAppEventParameterName("scheduleJob failed with RejectedExecutionException Exception", e10);
                return;
            } catch (Throwable th) {
                AFLogger.AFInAppEventParameterName("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.AFVersionDeclaration("scheduler is null, shut downed or terminated");
    }

    public static boolean values() {
        return AFKeystoreWrapper(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null;
    }

    private boolean values(Context context) {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            this.setPhoneNumber = new ConcurrentHashMap();
            final v.d dVar = new v.d() { // from class: com.appsflyer.internal.ae.1
                @Override // com.appsflyer.internal.v.d
                public final void AFInAppEventParameterName(String str, Exception exc) {
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "unknown";
                    }
                    ae.this.setPhoneNumber.put("error", message);
                    AFLogger.AFInAppEventType(str, exc);
                }

                @Override // com.appsflyer.internal.v.d
                public final void values(String str, String str2) {
                    ae.this.setPhoneNumber.put("signedData", str);
                    ae.this.setPhoneNumber.put("signature", str2);
                    ae.this.setPhoneNumber.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.AFKeystoreWrapper("Successfully retrieved Google LVL data.");
                }
            };
            try {
                try {
                    try {
                        Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                        Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                        cls.getMethod("checkLicense", Long.TYPE, Context.class, cls2).invoke(null, Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.v.2
                            @Override // java.lang.reflect.InvocationHandler
                            public final Object invoke(Object obj, Method method, Object[] objArr) {
                                if (method.getName().equals("onLvlResult")) {
                                    String str = objArr[0] != null ? (String) objArr[0] : null;
                                    String str2 = objArr[1] != null ? (String) objArr[1] : null;
                                    d dVar2 = d.this;
                                    if (dVar2 == null) {
                                        AFLogger.values("onLvlResult invocation succeeded, but listener is null");
                                    } else if (str != null && str2 != null) {
                                        dVar2.values(str, str2);
                                    } else if (str2 == null) {
                                        dVar2.AFInAppEventParameterName("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                                    } else {
                                        dVar2.AFInAppEventParameterName("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                                    }
                                } else if (method.getName().equals("onLvlFailure")) {
                                    d dVar3 = d.this;
                                    if (dVar3 == null) {
                                        AFLogger.values("onLvlFailure: listener is null");
                                    } else if (objArr[0] != null) {
                                        dVar3.AFInAppEventParameterName("onLvlFailure with exception", (Exception) objArr[0]);
                                    } else {
                                        dVar3.AFInAppEventParameterName("onLvlFailure", new Exception("unknown"));
                                    }
                                } else {
                                    d dVar4 = d.this;
                                    if (dVar4 != null) {
                                        dVar4.AFInAppEventParameterName("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                                    }
                                }
                                return null;
                            }
                        }));
                    } catch (ClassNotFoundException e10) {
                        dVar.AFInAppEventParameterName(e10.getClass().getSimpleName(), e10);
                    } catch (NoSuchMethodException e11) {
                        dVar.AFInAppEventParameterName(e11.getClass().getSimpleName(), e11);
                    }
                } catch (InvocationTargetException e12) {
                    dVar.AFInAppEventParameterName(e12.getClass().getSimpleName(), e12);
                }
            } catch (IllegalAccessException e13) {
                dVar.AFInAppEventParameterName(e13.getClass().getSimpleName(), e13);
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean values(SharedPreferences sharedPreferences) {
        return Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", null));
    }

    public final String AFInAppEventParameterName(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("channel");
        if (string == null) {
            string = context == null ? null : AFInAppEventParameterName("CHANNEL", context.getPackageManager(), context.getPackageName());
        }
        if (string == null || !string.equals(BuildConfig.FLAVOR)) {
            return string;
        }
        return null;
    }

    public final String AFInAppEventParameterName(Context context, String str) {
        SharedPreferences AFKeystoreWrapper2 = AFKeystoreWrapper(context);
        if (AFKeystoreWrapper2.contains("CACHED_CHANNEL")) {
            return AFKeystoreWrapper2.getString("CACHED_CHANNEL", null);
        }
        SharedPreferences.Editor edit = AFKeystoreWrapper(context).edit();
        edit.putString("CACHED_CHANNEL", str);
        edit.apply();
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFInAppEventParameterName(android.content.Context r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.AFInAppEventParameterName(android.content.Context, android.content.Intent):void");
    }

    public final Map<String, Object> AFInAppEventType() {
        HashMap hashMap = new HashMap();
        if (AFVersionDeclaration()) {
            hashMap.put("lvl", this.setPhoneNumber);
        } else if (this.setCustomerUserId) {
            HashMap hashMap2 = new HashMap();
            this.setPhoneNumber = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.setPhoneNumber);
        }
        return hashMap;
    }

    public final void AFKeystoreWrapper(Context context, String str, long j10) {
        SharedPreferences.Editor edit = AFKeystoreWrapper(context).edit();
        edit.putLong(str, j10);
        edit.apply();
    }

    public final void AFKeystoreWrapper(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return;
        }
        AFLogger.AFKeystoreWrapper("app went to background");
        SharedPreferences AFKeystoreWrapper2 = AFKeystoreWrapper(weakReference.get());
        AppsFlyerProperties.getInstance().saveProperties(AFKeystoreWrapper2);
        long j10 = this.onPause - this.onValidateInAppFailure;
        HashMap hashMap = new HashMap();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (string == null) {
            AFLogger.AFVersionDeclaration("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        d.e.C0069d valueOf2 = ab.valueOf(weakReference.get().getContentResolver());
        if (valueOf2 != null) {
            hashMap.put("amazon_aid", valueOf2.values);
            hashMap.put("amazon_aid_limit", String.valueOf(valueOf2.AFInAppEventParameterName));
        }
        String string3 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string3 != null) {
            hashMap.put("advertiserId", string3);
        }
        hashMap.put("app_id", weakReference.get().getPackageName());
        hashMap.put("devkey", string);
        hashMap.put("uid", an.AFInAppEventType(weakReference));
        hashMap.put("time_in_app", String.valueOf(j10 / 1000));
        hashMap.put("statType", "user_closed_app");
        hashMap.put("platform", "Android");
        hashMap.put("launch_counter", Integer.toString(AFKeystoreWrapper(AFKeystoreWrapper2, "appsFlyerCount", false)));
        hashMap.put("channel", AFInAppEventParameterName(weakReference.get()));
        if (string2 == null) {
            string2 = BuildConfig.FLAVOR;
        }
        hashMap.put("originalAppsflyerId", string2);
        if (!this.enableLocationCollection) {
            AFLogger.values("Stats call is disabled, ignore ...");
            return;
        }
        try {
            AFLogger.values("Running callStats task");
            bp bpVar = new bp();
            bpVar.onConversionDataSuccess = isStopped();
            new Thread(new m((bf) bpVar.AFKeystoreWrapper(hashMap).AFInAppEventType(String.format(onAttributionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), onDeepLinking.getHostName())))).start();
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("Could not send callStats request", th);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> asList = Arrays.asList(strArr);
        List<List<String>> list = j.valueOf().getLevel;
        if (!list.contains(asList)) {
            list.add(asList);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        aj.valueOf().valueOf("public_api_call", "anonymizeUser", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        j valueOf2 = j.valueOf();
        valueOf2.AFVersionDeclaration = str;
        valueOf2.AFLogger$LogLevel = map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        this.getOutOfStore = z10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib enableLocationCollection(boolean z10) {
        this.getInstance = z10;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(Context context) {
        aj.valueOf().valueOf("public_api_call", "getAppsFlyerUID", new String[0]);
        return an.AFInAppEventType(new WeakReference(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        try {
            return new ah(context).AFKeystoreWrapper();
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        return string != null ? string : "appsflyer.com";
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        return string != null ? string : BuildConfig.FLAVOR;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String AFInAppEventParameterName2 = context == null ? null : AFInAppEventParameterName("AF_STORE", context.getPackageManager(), context.getPackageName());
        if (AFInAppEventParameterName2 != null) {
            return AFInAppEventParameterName2;
        }
        AFLogger.AFKeystoreWrapper("No out-of-store value set");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        aj.valueOf().valueOf("public_api_call", "getSdkVersion", new String[0]);
        StringBuilder sb2 = new StringBuilder("version: 6.3.1 (build ");
        sb2.append(values);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (this.setDebugLog) {
            return this;
        }
        this.setDebugLog = true;
        if (context != null) {
            if (this.init == null) {
                this.init = new au(context);
            }
            au auVar = this.init;
            if (auVar.AFKeystoreWrapper()) {
                auVar.AFKeystoreWrapper.edit().putLong("init_ts", System.currentTimeMillis()).apply();
            }
            this.setOaidData = (Application) context.getApplicationContext();
            final bo boVar = new bo(new Runnable() { // from class: com.appsflyer.internal.ae.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (k.AFKeystoreWrapper == null) {
                        k.AFKeystoreWrapper = new k();
                    }
                    ae.values(k.AFKeystoreWrapper.values(), new Runnable() { // from class: com.appsflyer.internal.ae.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                bh bhVar = new bh();
                                Application application = ae.this.setOaidData;
                                if (application != null) {
                                    bhVar.values = (Application) application.getApplicationContext();
                                }
                                ae aeVar = ae.this;
                                if (aeVar.AFKeystoreWrapper(bhVar, ae.AFKeystoreWrapper(aeVar.setOaidData))) {
                                    ae.AFInAppEventParameterName(ae.this, bhVar);
                                }
                            } catch (Throwable th) {
                                AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                            }
                        }
                    }, 0L, TimeUnit.MILLISECONDS);
                }
            });
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.ae.5
                @Override // java.lang.Runnable
                public final void run() {
                    SharedPreferences AFKeystoreWrapper2 = ae.AFKeystoreWrapper(ae.this.setOaidData);
                    boolean z10 = false;
                    int AFKeystoreWrapper3 = ae.AFKeystoreWrapper(AFKeystoreWrapper2, "appsFlyerCount", false);
                    boolean z11 = AFKeystoreWrapper2.getBoolean(AppsFlyerProperties.NEW_REFERRER_SENT, false);
                    if (boVar.valueOf == bt.e.NOT_STARTED) {
                        z10 = true;
                    }
                    if (AFKeystoreWrapper3 == 1) {
                        if (!z10) {
                            if (z11) {
                            }
                        }
                        ae aeVar = ae.this;
                        bh bhVar = new bh();
                        Application application = ae.this.setOaidData;
                        if (application != null) {
                            bhVar.values = (Application) application.getApplicationContext();
                        }
                        ae.AFInAppEventParameterName(aeVar, bhVar);
                    }
                }
            };
            bt[] btVarArr = {boVar, new br(runnable), new bw(runnable)};
            this.onDeepLinkingNative = btVarArr;
            for (bt btVar : btVarArr) {
                btVar.AFInAppEventParameterName(this.setOaidData);
            }
            this.setCustomerUserId = values(context);
            at.valueOf = this.setOaidData;
        } else {
            AFLogger.AFVersionDeclaration("context is null, Google Install Referrer will be not initialized");
        }
        aj valueOf2 = aj.valueOf();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        valueOf2.valueOf("public_api_call", "init", strArr);
        AFLogger.AFInAppEventParameterName(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "6.3.1", values));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
        am.values(str);
        valueOf = appsFlyerConversionListener;
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            AFLogger.AFInAppEventParameterName("Could not check if app is pre installed", e10);
        }
        return false;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isStopped() {
        return this.setAndroidIdData;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        logEvent(context, str, map, null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        bj bjVar = new bj();
        if (context != null) {
            bjVar.values = (Application) context.getApplicationContext();
        }
        bjVar.AFVersionDeclaration = str;
        Activity activity = null;
        bjVar.AFInAppEventType = map == null ? null : new HashMap(map);
        bjVar.AFKeystoreWrapper = appsFlyerRequestListener;
        aj valueOf2 = aj.valueOf();
        String[] strArr = new String[2];
        strArr[0] = str;
        Map map2 = bjVar.AFInAppEventType;
        if (map2 == null) {
            map2 = new HashMap();
        }
        strArr[1] = new JSONObject(map2).toString();
        valueOf2.valueOf("public_api_call", "logEvent", strArr);
        if (str != null) {
            z.AFInAppEventParameterName(context).AFKeystoreWrapper();
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        values(bjVar, activity);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        aj.valueOf().valueOf("public_api_call", "logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d11));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        AFInAppEventType(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        aj.valueOf().valueOf("public_api_call", "logSession", new String[0]);
        aj.valueOf().values = false;
        AFInAppEventType(context, null, null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        ag.b bVar = ag.AFInAppEventParameterName;
        if (bVar != null) {
            bVar.AFInAppEventType(context);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        if (uri != null && !uri.toString().isEmpty()) {
            if (context != null) {
                j.valueOf().AFKeystoreWrapper(context, new HashMap(), Uri.parse(uri.toString()));
                return;
            }
            StringBuilder sb2 = new StringBuilder("Context is \"");
            sb2.append(context);
            sb2.append("\"");
            ap.AFInAppEventParameterName(sb2.toString(), DeepLinkResult.Error.NETWORK);
            return;
        }
        StringBuilder sb3 = new StringBuilder("Link is \"");
        sb3.append(uri);
        sb3.append("\"");
        ap.AFInAppEventParameterName(sb3.toString(), DeepLinkResult.Error.NETWORK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(final Intent intent, Context context) {
        if (intent == null) {
            ap.AFInAppEventParameterName("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else if (context == null) {
            ap.AFInAppEventParameterName("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            final Context applicationContext = context.getApplicationContext();
            this.setUserEmails.execute(new Runnable() { // from class: com.appsflyer.internal.ae.3
                @Override // java.lang.Runnable
                public final void run() {
                    j.valueOf();
                    Intent intent2 = intent;
                    Context context2 = applicationContext;
                    ae aeVar = ae.this;
                    if (aeVar.init == null) {
                        aeVar.init = new au(context2);
                    }
                    au auVar = aeVar.init;
                    Uri AFInAppEventType2 = j.AFInAppEventType(intent2);
                    boolean z10 = (AFInAppEventType2 == null || AFInAppEventType2.toString().isEmpty()) ? false : true;
                    if (!ae.AFKeystoreWrapper(context2).getBoolean("ddl_sent", false) || z10) {
                        j.valueOf().AFInAppEventType(new HashMap(), auVar, intent2, context2);
                    } else {
                        ap.AFInAppEventParameterName("No direct deep link", null);
                    }
                }
            });
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        aj.valueOf().valueOf("public_api_call", "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            valueOf = appsFlyerConversionListener;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        aj.valueOf().valueOf("public_api_call", "registerValidatorListener", new String[0]);
        AFLogger.values("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.values("registerValidatorListener null listener");
        } else {
            AFInAppEventType = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        bg bgVar = new bg();
        if (context != null) {
            bgVar.values = (Application) context.getApplicationContext();
        }
        bgVar.AFInAppEventType = map;
        Application application = bgVar.values;
        StringBuilder m10 = a1.a.m(String.format(onInstallConversionFailureNative, AppsFlyerLib.getInstance().getHostPrefix(), onDeepLinking.getHostName()));
        m10.append(application.getPackageName());
        String obj = m10.toString();
        SharedPreferences AFKeystoreWrapper2 = AFKeystoreWrapper(application);
        int AFKeystoreWrapper3 = AFKeystoreWrapper(AFKeystoreWrapper2, "appsFlyerCount", false);
        int AFKeystoreWrapper4 = AFKeystoreWrapper(AFKeystoreWrapper2, "appsFlyerAdRevenueCount", true);
        HashMap hashMap = new HashMap();
        hashMap.put("ad_network", bgVar.AFInAppEventType);
        hashMap.put("adrevenue_counter", Integer.valueOf(AFKeystoreWrapper4));
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        hashMap.put("af_key", string);
        hashMap.put("launch_counter", Integer.valueOf(AFKeystoreWrapper3));
        hashMap.put("af_timestamp", Long.toString(new Date().getTime()));
        hashMap.put("uid", an.AFInAppEventType(new WeakReference(application)));
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        hashMap.put("advertiserIdEnabled", AppsFlyerProperties.getInstance().getString("advertiserIdEnabled"));
        if (string2 != null) {
            hashMap.put("advertiserId", string2);
        }
        hashMap.put("device", Build.DEVICE);
        valueOf(application, hashMap);
        try {
            PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            long j10 = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("install_date", simpleDateFormat.format(new Date(j10)));
            String string3 = AFKeystoreWrapper2.getString("appsFlyerFirstInstall", null);
            if (string3 == null) {
                string3 = AFInAppEventType(simpleDateFormat, application);
            }
            hashMap.put("first_launch_date", string3);
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("AdRevenue - Exception while collecting app version data ", th);
        }
        g AFKeystoreWrapper5 = bgVar.AFInAppEventType(obj).AFKeystoreWrapper(hashMap);
        AFKeystoreWrapper5.onInstallConversionDataLoadedNative = AFKeystoreWrapper3;
        AFKeystoreWrapper5.init = string;
        d dVar = new d(this, AFKeystoreWrapper5, (byte) 0);
        if (k.AFKeystoreWrapper == null) {
            k.AFKeystoreWrapper = new k();
        }
        values(k.AFKeystoreWrapper.values(), dVar, 1L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0143  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void sendPushNotificationData(android.app.Activity r17) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        if (map != null) {
            aj.valueOf().valueOf("public_api_call", "setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        aj.valueOf().valueOf("public_api_call", "setAndroidIdData", str);
        this.getLevel = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        aj.valueOf().valueOf("public_api_call", "setAppId", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        aj.valueOf().valueOf("public_api_call", "setAppInviteOneLink", str);
        AFLogger.AFKeystoreWrapper("setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str != null) {
            if (!str.equals(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID))) {
            }
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
        }
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
        AppsFlyerProperties.getInstance().remove("onelinkVersion");
        AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.ONELINK_ID, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        aj.valueOf().valueOf("public_api_call", "setCollectAndroidID", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z10));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z10) {
        aj.valueOf().valueOf("public_api_call", "setCollectIMEI", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z10));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectOaid(boolean z10) {
        aj.valueOf().valueOf("public_api_call", "setCollectOaid", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z10));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        aj.valueOf().valueOf("public_api_call", "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, Context context) {
        if (context != null) {
            if (values()) {
                setCustomerUserId(str);
                StringBuilder sb2 = new StringBuilder("CustomerUserId set: ");
                sb2.append(str);
                sb2.append(" - Initializing AppsFlyer Tacking");
                AFLogger.AFInAppEventParameterName(sb2.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                if (referrer == null) {
                    referrer = BuildConfig.FLAVOR;
                }
                if (context instanceof Activity) {
                    ((Activity) context).getIntent();
                }
                bl blVar = new bl();
                blVar.values = (Application) context.getApplicationContext();
                blVar.AFVersionDeclaration = null;
                blVar.init = string;
                blVar.AFInAppEventType = null;
                blVar.AppsFlyer2dXConversionCallback = referrer;
                blVar.AFInAppEventParameterName = null;
                valueOf(blVar);
                return;
            }
            setCustomerUserId(str);
            AFLogger.AFInAppEventParameterName("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        aj.valueOf().valueOf("public_api_call", "setCustomerUserId", str);
        AFLogger.AFKeystoreWrapper("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        setLogLevel(z10 ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        aj.valueOf().valueOf("public_api_call", "setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.AFVersionDeclaration("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        aj.valueOf().valueOf("public_api_call", "setImeiData", str);
        this.AppsFlyer2dXConversionCallback = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        aj.valueOf().valueOf("public_api_call", "setIsUpdate", String.valueOf(z10));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        aj.valueOf().valueOf("public_api_call", "log", String.valueOf(logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        this.AppsFlyerInAppPurchaseValidatorListener = TimeUnit.SECONDS.toMillis(i10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        aj.valueOf().valueOf("public_api_call", "setOaidData", str);
        ab.values = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        AFLogger.values(String.format("setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        j.init = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str == null) {
            AFLogger.AFInAppEventType("Cannot set setOutOfStore with null");
            return;
        }
        String lowerCase = str.toLowerCase();
        AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
        AFLogger.AFInAppEventParameterName("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(String str, Map<String, Object> map) {
        if (this.setAppInviteOneLink == null) {
            this.setAppInviteOneLink = new av();
        }
        av avVar = this.setAppInviteOneLink;
        if (str == null || str.isEmpty()) {
            AFLogger.AFVersionDeclaration("Partner ID is missing or `null`");
            return;
        }
        if (map != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("Setting partner data for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(map);
            AFLogger.values(sb2.toString());
            int length = new JSONObject(map).toString().length();
            if (length <= 1000) {
                avVar.AFInAppEventType.put(str, map);
                avVar.AFInAppEventParameterName.remove(str);
                return;
            }
            AFLogger.AFVersionDeclaration("Partner data 1000 characters limit exceeded");
            HashMap hashMap = new HashMap();
            hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
            avVar.AFInAppEventParameterName.put(str, hashMap);
            return;
        }
        AFLogger.AFVersionDeclaration(avVar.AFInAppEventType.remove(str) == null ? "Partner data is missing or `null`" : "Cleared partner data for ".concat(str));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        this.waitForCustomerUserId = af.AFKeystoreWrapper(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPreinstallAttribution(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r2 = r6
            java.lang.String r5 = "setPreinstallAttribution API called"
            r0 = r5
            com.appsflyer.AFLogger.values(r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r5 = 5
            r0.<init>()
            java.lang.String r1 = "pid"
            r4 = 6
            if (r7 == 0) goto L16
            r5 = 3
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L21
        L16:
            r4 = 6
            if (r8 == 0) goto L23
            r5 = 6
            java.lang.String r7 = "c"
            r4 = 4
            r0.put(r7, r8)     // Catch: org.json.JSONException -> L21
            goto L23
        L21:
            r7 = move-exception
            goto L2d
        L23:
            if (r9 == 0) goto L36
            r5 = 6
            java.lang.String r4 = "af_siteid"
            r7 = r4
            r0.put(r7, r9)     // Catch: org.json.JSONException -> L21
            goto L37
        L2d:
            java.lang.String r4 = r7.getMessage()
            r8 = r4
            com.appsflyer.AFLogger.AFInAppEventParameterName(r8, r7)
            r4 = 2
        L36:
            r5 = 1
        L37:
            boolean r7 = r0.has(r1)
            if (r7 == 0) goto L4f
            r4 = 6
            java.lang.String r4 = r0.toString()
            r7 = r4
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "preInstallName"
            r9 = r5
            r8.set(r9, r7)
            r5 = 2
            return
        L4f:
            java.lang.String r7 = "Cannot set preinstall attribution data without a media source"
            r5 = 7
            com.appsflyer.AFLogger.AFVersionDeclaration(r7)
            r4 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.setPreinstallAttribution(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.values(String.format("setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        j.AFKeystoreWrapper = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilter(String... strArr) {
        if (strArr != null && !Arrays.equals(this.AFVersionDeclaration, new String[]{"all"})) {
            Pattern compile = Pattern.compile("[\\d\\w_]{1,45}");
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || !compile.matcher(str).matches()) {
                    AFLogger.AFVersionDeclaration("Invalid partner name :".concat(String.valueOf(str)));
                } else {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                this.AFVersionDeclaration = null;
            } else {
                this.AFVersionDeclaration = (String[]) arrayList.toArray(new String[0]);
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForAllPartners() {
        this.AFVersionDeclaration = new String[]{"all"};
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        aj.valueOf().valueOf("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            if (AnonymousClass9.AFInAppEventParameterName[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(af.AFKeystoreWrapper(str2));
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        aj.valueOf().valueOf("public_api_call", "setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context) {
        start(context, null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, String str) {
        start(context, str, null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(Context context, final String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (ag.AFInAppEventParameterName != null) {
            return;
        }
        if (!this.setDebugLog) {
            AFLogger.AFVersionDeclaration("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
            if (str == null) {
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ax.values);
                    return;
                }
                return;
            }
        }
        this.setOaidData = (Application) context.getApplicationContext();
        aj.valueOf().valueOf("public_api_call", "start", str);
        String str2 = values;
        AFLogger.AFKeystoreWrapper(String.format("Starting AppsFlyer: (v%s.%s)", "6.3.1", str2));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str2);
        AFLogger.AFKeystoreWrapper(sb2.toString());
        AppsFlyerProperties.getInstance().loadProperties(this.setOaidData.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
            am.values(str);
        } else if (TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY))) {
            AFLogger.AFVersionDeclaration("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ax.values);
                return;
            }
            return;
        }
        Context baseContext = this.setOaidData.getBaseContext();
        try {
            if ((baseContext.getPackageManager().getPackageInfo(baseContext.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                    AFLogger.AFInAppEventParameterName("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.AFInAppEventType("'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules");
                }
            }
        } catch (Exception e10) {
            StringBuilder sb3 = new StringBuilder("checkBackupRules Exception: ");
            sb3.append(e10.toString());
            AFLogger.valueOf(sb3.toString());
        }
        if (this.getOutOfStore) {
            Context applicationContext = this.setOaidData.getApplicationContext();
            this.setCustomerIdAndLogSession = new HashMap();
            final long currentTimeMillis = System.currentTimeMillis();
            final l.a aVar = new l.a() { // from class: com.appsflyer.internal.ae.4
                @Override // com.appsflyer.internal.l.a
                public final void AFInAppEventParameterName(String str3, String str4, String str5) {
                    if (str3 != null) {
                        AFLogger.AFKeystoreWrapper("Facebook Deferred AppLink data received: ".concat(str3));
                        ae.this.setCustomerIdAndLogSession.put("link", str3);
                        if (str4 != null) {
                            ae.this.setCustomerIdAndLogSession.put("target_url", str4);
                        }
                        if (str5 != null) {
                            HashMap hashMap = new HashMap();
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("promo_code", str5);
                            hashMap.put("deeplink_context", hashMap2);
                            ae.this.setCustomerIdAndLogSession.put("extras", hashMap);
                            ae.this.setCustomerIdAndLogSession.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                    } else {
                        ae.this.setCustomerIdAndLogSession.put("link", BuildConfig.FLAVOR);
                    }
                    ae.this.setCustomerIdAndLogSession.put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }

                @Override // com.appsflyer.internal.l.a
                public final void AFInAppEventType(String str3) {
                    ae.this.setCustomerIdAndLogSession.put("error", str3);
                }
            };
            try {
                Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", Context.class).invoke(null, applicationContext);
                final Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
                Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
                Method method = cls.getMethod("fetchDeferredAppLinkData", Context.class, String.class, cls2);
                Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: com.appsflyer.internal.l.5
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        String str3;
                        String str4;
                        String str5;
                        Bundle bundle;
                        if (!method2.getName().equals("onDeferredAppLinkDataFetched")) {
                            a aVar2 = aVar;
                            if (aVar2 != null) {
                                aVar2.AFInAppEventType("onDeferredAppLinkDataFetched invocation failed");
                            }
                            return null;
                        }
                        if (objArr[0] != null) {
                            Bundle bundle2 = (Bundle) Bundle.class.cast(cls.getMethod("getArgumentBundle", new Class[0]).invoke(cls.cast(objArr[0]), new Object[0]));
                            if (bundle2 != null) {
                                str4 = bundle2.getString("com.facebook.platform.APPLINK_NATIVE_URL");
                                str5 = bundle2.getString("target_url");
                                Bundle bundle3 = bundle2.getBundle("extras");
                                str3 = (bundle3 == null || (bundle = bundle3.getBundle("deeplink_context")) == null) ? null : bundle.getString("promo_code");
                            } else {
                                str3 = null;
                                str4 = null;
                                str5 = null;
                            }
                            a aVar3 = aVar;
                            if (aVar3 != null) {
                                aVar3.AFInAppEventParameterName(str4, str5, str3);
                            }
                        } else {
                            a aVar4 = aVar;
                            if (aVar4 != null) {
                                aVar4.AFInAppEventParameterName(null, null, null);
                            }
                        }
                        return null;
                    }
                });
                String string = applicationContext.getString(applicationContext.getResources().getIdentifier("facebook_app_id", "string", applicationContext.getPackageName()));
                if (TextUtils.isEmpty(string)) {
                    aVar.AFInAppEventType("Facebook app id not defined in resources");
                } else {
                    method.invoke(null, applicationContext, string, newProxyInstance);
                }
            } catch (ClassNotFoundException e11) {
                aVar.AFInAppEventType(e11.toString());
            } catch (IllegalAccessException e12) {
                aVar.AFInAppEventType(e12.toString());
            } catch (NoSuchMethodException e13) {
                aVar.AFInAppEventType(e13.toString());
            } catch (InvocationTargetException e14) {
                aVar.AFInAppEventType(e14.toString());
            }
        }
        ag.AFInAppEventParameterName(context, new ag.b() { // from class: com.appsflyer.internal.ae.8
            @Override // com.appsflyer.internal.ag.b
            public final void AFInAppEventType(Context context2) {
                AFLogger.AFKeystoreWrapper("onBecameBackground");
                ae.this.onPause = System.currentTimeMillis();
                long j10 = ae.this.onPause - ae.this.onValidateInAppFailure;
                if (j10 > 0 && j10 < 1000) {
                    j10 = 1000;
                }
                ae aeVar = ae.this;
                if (aeVar.init == null) {
                    aeVar.init = new au(context2);
                }
                aeVar.init.AFKeystoreWrapper.edit().putLong("prev_session_dur", TimeUnit.MILLISECONDS.toSeconds(j10)).apply();
                AFLogger.AFKeystoreWrapper("callStatsBackground background call");
                ae.this.AFKeystoreWrapper(new WeakReference<>(context2));
                aj valueOf2 = aj.valueOf();
                if (valueOf2.init()) {
                    valueOf2.AFInAppEventParameterName();
                    if (context2 != null) {
                        aj.AFInAppEventParameterName(context2.getPackageName(), context2.getPackageManager());
                    }
                    valueOf2.values();
                } else {
                    AFLogger.values("RD status is OFF");
                }
                if (k.AFKeystoreWrapper == null) {
                    k.AFKeystoreWrapper = new k();
                }
                k kVar = k.AFKeystoreWrapper;
                try {
                    k.AFInAppEventParameterName(kVar.AFInAppEventParameterName);
                    Executor executor = kVar.AFInAppEventType;
                    if (executor instanceof ThreadPoolExecutor) {
                        k.AFInAppEventParameterName((ThreadPoolExecutor) executor);
                    }
                } catch (Throwable th) {
                    AFLogger.AFInAppEventParameterName("failed to stop Executors", th);
                }
                z AFInAppEventParameterName2 = z.AFInAppEventParameterName(context2);
                AFInAppEventParameterName2.AFInAppEventParameterName.post(AFInAppEventParameterName2.AFVersionDeclaration);
            }

            @Override // com.appsflyer.internal.ag.b
            public final void AFKeystoreWrapper(Activity activity) {
                ae.this.onValidateInAppFailure = System.currentTimeMillis();
                ae aeVar = ae.this;
                if (aeVar.init == null) {
                    aeVar.init = new au(activity);
                }
                au auVar = aeVar.init;
                if (auVar.AFKeystoreWrapper()) {
                    auVar.AFKeystoreWrapper.edit().putLong("fg_ts", System.currentTimeMillis()).apply();
                }
                int AFKeystoreWrapper2 = ae.AFKeystoreWrapper(ae.AFKeystoreWrapper(activity), "appsFlyerCount", false);
                if (AFKeystoreWrapper2 == 0) {
                    try {
                        ae.this.setOutOfStore.put("init_to_fg", ae.this.onValidateInAppFailure - auVar.AFKeystoreWrapper.getLong("init_ts", 0L));
                    } catch (JSONException unused) {
                    }
                }
                AFLogger.AFKeystoreWrapper("onBecameForeground");
                if (AFKeystoreWrapper2 < 2) {
                    z AFInAppEventParameterName2 = z.AFInAppEventParameterName(activity);
                    AFInAppEventParameterName2.AFInAppEventParameterName.post(AFInAppEventParameterName2.AFVersionDeclaration);
                    AFInAppEventParameterName2.AFInAppEventParameterName.post(AFInAppEventParameterName2.AFInAppEventType);
                }
                bl blVar = new bl();
                j.valueOf().AFInAppEventType(blVar.valueOf(), auVar, activity.getIntent(), activity.getApplication());
                ae aeVar2 = ae.this;
                blVar.values = (Application) activity.getApplicationContext();
                blVar.init = str;
                blVar.AFKeystoreWrapper = appsFlyerRequestListener;
                aeVar2.values(blVar, activity);
            }
        }, this.setUserEmails);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void stop(boolean r9, android.content.Context r10) {
        /*
            r8 = this;
            r8.setAndroidIdData = r9
            r6 = 6
            com.appsflyer.internal.ai.valueOf()
            java.io.File r5 = com.appsflyer.internal.ai.values(r10)     // Catch: java.lang.Exception -> L49
            r9 = r5
            boolean r5 = r9.exists()     // Catch: java.lang.Exception -> L49
            r0 = r5
            if (r0 != 0) goto L16
            r9.mkdir()     // Catch: java.lang.Exception -> L49
            goto L51
        L16:
            java.io.File[] r5 = r9.listFiles()     // Catch: java.lang.Exception -> L49
            r9 = r5
            int r0 = r9.length     // Catch: java.lang.Exception -> L49
            r7 = 7
            r5 = 0
            r1 = r5
        L1f:
            if (r1 >= r0) goto L50
            r2 = r9[r1]     // Catch: java.lang.Exception -> L49
            r7 = 7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L49
            java.lang.String r4 = "Found cached request"
            r3.<init>(r4)     // Catch: java.lang.Exception -> L49
            r7 = 5
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Exception -> L49
            r4 = r5
            r3.append(r4)     // Catch: java.lang.Exception -> L49
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Exception -> L49
            r3 = r5
            com.appsflyer.AFLogger.AFKeystoreWrapper(r3)     // Catch: java.lang.Exception -> L49
            com.appsflyer.internal.h r5 = com.appsflyer.internal.ai.AFKeystoreWrapper(r2)     // Catch: java.lang.Exception -> L49
            r2 = r5
            java.lang.String r2 = r2.AFInAppEventParameterName     // Catch: java.lang.Exception -> L49
            com.appsflyer.internal.ai.AFInAppEventParameterName(r2, r10)     // Catch: java.lang.Exception -> L49
            int r1 = r1 + 1
            goto L1f
        L49:
            r9 = move-exception
            java.lang.String r0 = "Could not cache request"
            com.appsflyer.AFLogger.AFInAppEventParameterName(r0, r9)
            r6 = 2
        L50:
            r7 = 1
        L51:
            boolean r9 = r8.setAndroidIdData
            if (r9 == 0) goto L6b
            r7 = 5
            android.content.SharedPreferences r9 = AFKeystoreWrapper(r10)
            android.content.SharedPreferences$Editor r5 = r9.edit()
            r9 = r5
            java.lang.String r5 = "is_stop_tracking_used"
            r10 = r5
            r0 = 1
            r7 = 6
            r9.putBoolean(r10, r0)
            r9.apply()
            r6 = 2
        L6b:
            r6 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.stop(boolean, android.content.Context):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3L));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j10) {
        j.valueOf().valueOf = deepLinkListener;
        aq.onAttributionFailureNative = j10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        aj.valueOf().valueOf("public_api_call", "unregisterConversionListener", new String[0]);
        valueOf = null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        new bb(context).AFKeystoreWrapper(str);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        aj valueOf2 = aj.valueOf();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str3;
        strArr[3] = str4;
        strArr[4] = str5;
        strArr[5] = map == null ? BuildConfig.FLAVOR : map.toString();
        valueOf2.valueOf("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb2 = new StringBuilder("Validate in app called with parameters: ");
            sb2.append(str3);
            sb2.append(" ");
            sb2.append(str4);
            sb2.append(" ");
            sb2.append(str5);
            AFLogger.AFKeystoreWrapper(sb2.toString());
        }
        if (str == null || str4 == null || str2 == null || str5 == null || str3 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventType;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        Context applicationContext = context.getApplicationContext();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (context instanceof Activity) {
            ((Activity) context).getIntent();
        }
        new Thread(new ad(applicationContext, string, str, str2, str3, str4, str5, map)).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:304:0x066f, code lost:
        if (r7 != null) goto L419;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0363 A[Catch: all -> 0x0c75, TRY_LEAVE, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0376 A[Catch: Exception -> 0x037c, all -> 0x0c75, TRY_LEAVE, TryCatch #21 {Exception -> 0x037c, blocks: (B:141:0x0368, B:143:0x0376), top: B:525:0x0368, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038b A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a2 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03bd A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c4 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03f9 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0412 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04a3 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04cd A[Catch: all -> 0x0c75, TRY_LEAVE, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04da A[Catch: all -> 0x0c75, TRY_ENTER, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04f2 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0643 A[Catch: all -> 0x0c75, TRY_ENTER, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0659 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0677 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x068d A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x06a2 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06ed A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0703 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x070e A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07f4 A[Catch: all -> 0x0862, TryCatch #29 {all -> 0x0862, blocks: (B:375:0x07de, B:377:0x07f4, B:378:0x0804), top: B:541:0x07de }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x088c A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0895 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0916 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x093c A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0a47 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0bb3 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0c63 A[Catch: all -> 0x0c75, TryCatch #10 {all -> 0x0c75, blocks: (B:8:0x0068, B:10:0x006e, B:14:0x007b, B:16:0x008b, B:17:0x008e, B:19:0x0098, B:24:0x00a7, B:26:0x00c3, B:27:0x00c8, B:29:0x00d0, B:30:0x00d5, B:32:0x00dd, B:37:0x00ea, B:39:0x012a, B:40:0x0131, B:42:0x0139, B:44:0x013f, B:46:0x0145, B:47:0x0152, B:49:0x0159, B:52:0x016c, B:54:0x0173, B:55:0x017a, B:57:0x0180, B:50:0x0162, B:58:0x0187, B:60:0x01a6, B:62:0x01af, B:64:0x01cc, B:66:0x01d3, B:67:0x01d8, B:69:0x01e3, B:71:0x01f2, B:72:0x0209, B:74:0x020d, B:75:0x0212, B:78:0x021a, B:79:0x021d, B:81:0x0226, B:82:0x022b, B:84:0x0237, B:86:0x023d, B:87:0x0240, B:89:0x024c, B:90:0x0255, B:94:0x0268, B:96:0x0273, B:98:0x027b, B:99:0x0282, B:101:0x028a, B:132:0x032b, B:135:0x0343, B:137:0x034d, B:138:0x0357, B:140:0x0363, B:141:0x0368, B:143:0x0376, B:148:0x0383, B:150:0x038b, B:152:0x0391, B:153:0x0396, B:155:0x03a2, B:159:0x03ac, B:160:0x03b1, B:162:0x03bd, B:174:0x03f9, B:175:0x0402, B:177:0x0412, B:179:0x0418, B:205:0x049a, B:180:0x0421, B:182:0x0427, B:184:0x0437, B:185:0x0449, B:187:0x044f, B:188:0x0455, B:190:0x045b, B:191:0x0461, B:200:0x047b, B:194:0x0469, B:203:0x048a, B:207:0x04a3, B:208:0x04ac, B:216:0x04cd, B:219:0x04da, B:221:0x04e0, B:227:0x04fb, B:229:0x0507, B:230:0x050c, B:232:0x0514, B:237:0x0531, B:239:0x0538, B:240:0x053d, B:242:0x0549, B:243:0x0554, B:245:0x0560, B:247:0x0567, B:248:0x057d, B:249:0x0582, B:251:0x058e, B:252:0x0593, B:263:0x05ca, B:264:0x05cf, B:267:0x05dd, B:343:0x072f, B:346:0x073c, B:354:0x075b, B:358:0x076b, B:359:0x0770, B:363:0x0780, B:364:0x0785, B:368:0x0795, B:369:0x079a, B:370:0x07b1, B:396:0x086f, B:398:0x088c, B:400:0x0895, B:402:0x0899, B:404:0x08a1, B:405:0x08a7, B:406:0x08bc, B:409:0x08ca, B:411:0x08dd, B:413:0x08ef, B:412:0x08ea, B:418:0x090a, B:420:0x0916, B:422:0x0925, B:423:0x092b, B:424:0x0932, B:426:0x093c, B:427:0x094e, B:431:0x0974, B:438:0x098d, B:440:0x099d, B:442:0x09ac, B:456:0x0a01, B:460:0x0a0d, B:462:0x0a47, B:464:0x0a4b, B:466:0x0a5a, B:467:0x0a81, B:469:0x0a87, B:470:0x0a8c, B:472:0x0aa1, B:475:0x0aa9, B:477:0x0abc, B:481:0x0acd, B:478:0x0ac0, B:480:0x0aca, B:482:0x0ad0, B:484:0x0bb3, B:485:0x0bc4, B:487:0x0c63, B:443:0x09b0, B:445:0x09c1, B:446:0x09ca, B:448:0x09da, B:450:0x09e9, B:451:0x09ee, B:453:0x09fa, B:417:0x08f5, B:395:0x086a, B:374:0x07d9, B:353:0x0746, B:268:0x05e6, B:270:0x05fa, B:272:0x0602, B:274:0x0608, B:276:0x0618, B:281:0x062d, B:308:0x0677, B:310:0x0692, B:312:0x06a2, B:314:0x06aa, B:316:0x06b0, B:335:0x06ed, B:337:0x0708, B:339:0x070e, B:341:0x0725, B:342:0x072a, B:336:0x0703, B:320:0x06bf, B:326:0x06cf, B:328:0x06db, B:330:0x06e4, B:309:0x068d, B:293:0x0643, B:295:0x064d, B:299:0x0659, B:301:0x0662, B:303:0x066b, B:261:0x05c2, B:233:0x051a, B:235:0x0526, B:222:0x04e6, B:224:0x04f2, B:226:0x04f8, B:488:0x0c69, B:214:0x04bf, B:163:0x03c4, B:165:0x03ca, B:172:0x03e9, B:170:0x03db, B:147:0x037e, B:93:0x025e, B:103:0x02a6, B:105:0x02b2, B:108:0x02bc, B:110:0x02c3, B:112:0x02ce, B:124:0x0309, B:131:0x0326, B:36:0x00e5, B:23:0x00a2, B:15:0x0086, B:255:0x05ab), top: B:510:0x0068, inners: #1, #6, #8, #13, #14, #15, #16, #20, #21, #26 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x08ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x073c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> values(com.appsflyer.internal.g r29) {
        /*
            Method dump skipped, instructions count: 3199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ae.values(com.appsflyer.internal.g):java.util.Map");
    }

    public final void values(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        AFLogger.values("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = AFKeystoreWrapper(context).getString("extraReferrers", null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (jSONObject.length() >= 4) {
                valueOf(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject3 = jSONObject.toString();
            SharedPreferences.Editor edit = AFKeystoreWrapper(context).edit();
            edit.putString("extraReferrers", jSONObject3);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Couldn't save referrer - ");
            sb2.append(str);
            sb2.append(": ");
            AFLogger.AFInAppEventParameterName(sb2.toString(), th);
        }
    }

    public final void values(Context context, Map<String, Object> map, Uri uri) {
        if (!map.containsKey("af_deeplink")) {
            String values2 = values(uri.toString());
            j valueOf2 = j.valueOf();
            String str = valueOf2.AFVersionDeclaration;
            if (str != null && valueOf2.AFLogger$LogLevel != null && values2.contains(str)) {
                Uri.Builder buildUpon = Uri.parse(values2).buildUpon();
                Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                for (Map.Entry<String, String> entry : valueOf2.AFLogger$LogLevel.entrySet()) {
                    buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                    buildUpon2.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                values2 = buildUpon.build().toString();
                map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
            }
            map.put("af_deeplink", values2);
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        ao aoVar = new ao(uri, this, context);
        if (aoVar.AFInAppEventParameterName) {
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        aa.AFInAppEventParameterName(context, hashMap, uri);
        if (!aoVar.values()) {
            ap.valueOf(hashMap);
            return;
        }
        aoVar.valueOf = new ao.b() { // from class: com.appsflyer.internal.ae.6
            @Override // com.appsflyer.internal.ao.b
            public final void AFKeystoreWrapper(Map<String, String> map2) {
                for (String str2 : map2.keySet()) {
                    hashMap.put(str2, map2.get(str2));
                }
                ap.valueOf(hashMap);
            }

            @Override // com.appsflyer.internal.ao.b
            public final void values(String str2) {
                ap.AFInAppEventParameterName(str2, DeepLinkResult.Error.NETWORK);
            }
        };
        if (k.AFKeystoreWrapper == null) {
            k.AFKeystoreWrapper = new k();
        }
        k.AFKeystoreWrapper.valueOf().execute(aoVar);
    }

    public final void values(g gVar, Activity activity) {
        Uri AFInAppEventParameterName2;
        Application application = gVar.values;
        String str = BuildConfig.FLAVOR;
        String obj = (activity == null || (AFInAppEventParameterName2 = as.AFInAppEventParameterName(activity)) == null) ? BuildConfig.FLAVOR : AFInAppEventParameterName2.toString();
        if (AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY) == null) {
            AFLogger.AFVersionDeclaration("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
            AppsFlyerRequestListener appsFlyerRequestListener = gVar.AFKeystoreWrapper;
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(RequestError.NO_DEV_KEY, ax.values);
                return;
            }
            return;
        }
        String referrer = AppsFlyerProperties.getInstance().getReferrer(application);
        if (referrer != null) {
            str = referrer;
        }
        gVar.AppsFlyer2dXConversionCallback = str;
        gVar.AFInAppEventParameterName = obj;
        valueOf(gVar);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z10) {
        AFLogger.AFInAppEventParameterName("initAfterCustomerUserID: ".concat(String.valueOf(z10)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z10);
    }
}
