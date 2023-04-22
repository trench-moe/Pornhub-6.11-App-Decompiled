package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.oaid.BuildConfig;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {
    public static volatile boolean AFInAppEventParameterName;
    public static Intent AFInAppEventType;
    public static String[] AFKeystoreWrapper;
    private static j AppsFlyer2dXConversionCallback;
    public static String[] init;
    public static final int values = (int) TimeUnit.SECONDS.toMillis(2);
    public Map<String, String> AFLogger$LogLevel;
    public String AFVersionDeclaration;
    public List<List<String>> getLevel = new ArrayList();
    public DeepLinkListener valueOf;

    public static Uri AFInAppEventType(Intent intent) {
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            return null;
        }
        return intent.getData();
    }

    private Uri AFKeystoreWrapper(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AFKeystoreWrapper(String str) {
        if (AFKeystoreWrapper == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("Validate if link ");
        sb2.append(str);
        sb2.append(" belongs to ESP domains: ");
        sb2.append(Arrays.asList(AFKeystoreWrapper));
        AFLogger.valueOf(sb2.toString());
        try {
            return Arrays.asList(AFKeystoreWrapper).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    public static j valueOf() {
        if (AppsFlyer2dXConversionCallback == null) {
            AppsFlyer2dXConversionCallback = new j();
        }
        return AppsFlyer2dXConversionCallback;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean values(android.content.Intent r12, android.content.Context r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.j.values(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFInAppEventType(java.util.Map<java.lang.String, java.lang.Object> r9, com.appsflyer.internal.au r10, android.content.Intent r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.j.AFInAppEventType(java.util.Map, com.appsflyer.internal.au, android.content.Intent, android.content.Context):void");
    }

    public final void AFKeystoreWrapper(final Context context, final Map<String, Object> map, final Uri uri) {
        if (AFKeystoreWrapper(uri.toString())) {
            AFInAppEventParameterName = true;
            if (k.AFKeystoreWrapper == null) {
                k.AFKeystoreWrapper = new k();
            }
            k kVar = k.AFKeystoreWrapper;
            if (kVar.values == null) {
                kVar.values = Executors.newSingleThreadScheduledExecutor(kVar.valueOf);
            }
            kVar.values.execute(new Runnable() { // from class: com.appsflyer.internal.j.1
                private static Map<String, Object> AFInAppEventParameterName(Uri uri2) {
                    HashMap hashMap = new HashMap();
                    try {
                        StringBuilder sb2 = new StringBuilder("ESP deeplink resolving is started: ");
                        sb2.append(uri2.toString());
                        AFLogger.values(sb2.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri2.toString()).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        int i10 = j.values;
                        httpURLConnection.setReadTimeout(i10);
                        httpURLConnection.setConnectTimeout(i10);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.3.1");
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put("status", Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField("Location"));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.values("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        AFLogger.AFInAppEventParameterName(th.getMessage(), th);
                    }
                    return hashMap;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num = null;
                    String str = null;
                    int i10 = 0;
                    while (i10 < 5) {
                        Map<String, Object> AFInAppEventParameterName2 = AFInAppEventParameterName(Uri.parse(obj));
                        String str2 = (String) AFInAppEventParameterName2.get("res");
                        Integer num2 = (Integer) AFInAppEventParameterName2.get("status");
                        String str3 = (String) AFInAppEventParameterName2.get("error");
                        if (str2 == null || !j.AFKeystoreWrapper(str2)) {
                            str = str3;
                            obj = str2;
                            num = num2;
                            break;
                        }
                        if (i10 < 4) {
                            arrayList.add(str2);
                        }
                        i10++;
                        str = str3;
                        obj = str2;
                        num = num2;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("res", obj != null ? obj : BuildConfig.FLAVOR);
                    hashMap.put("status", Integer.valueOf(num != null ? num.intValue() : -1));
                    if (str != null) {
                        hashMap.put("error", str);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put("redirects", arrayList);
                    }
                    hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        try {
                            map.put("af_deeplink_r", hashMap);
                            map.put("af_deeplink", uri.toString());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    ae.valueOf().values(context, map, obj != null ? Uri.parse(obj) : uri);
                    j.AFInAppEventParameterName = false;
                }
            });
        } else {
            ae.valueOf().values(context, map, uri);
        }
        AFInAppEventType = null;
    }
}
