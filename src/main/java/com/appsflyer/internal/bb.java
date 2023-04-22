package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.FirebaseMessagingServiceListener;
import com.appsflyer.internal.d;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class bb extends bf {
    private static String onAppOpenAttributionNative;
    private final SharedPreferences onAttributionFailureNative;

    static {
        StringBuilder sb2 = new StringBuilder("https://%sregister.%s/api/v");
        sb2.append(ae.AFInAppEventParameterName);
        onAppOpenAttributionNative = sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bb(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.appsflyer.internal.bb.onAppOpenAttributionNative
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.appsflyer.AppsFlyerLib r3 = com.appsflyer.AppsFlyerLib.getInstance()
            java.lang.String r3 = r3.getHostPrefix()
            r4 = 0
            r2[r4] = r3
            com.appsflyer.internal.ae r3 = com.appsflyer.internal.ae.valueOf()
            java.lang.String r3 = r3.getHostName()
            r4 = 1
            r2[r4] = r3
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            java.lang.String r1 = r10.getPackageName()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            android.content.SharedPreferences r10 = com.appsflyer.internal.ae.AFKeystoreWrapper(r10)
            r9.onAttributionFailureNative = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.bb.<init>(android.content.Context):void");
    }

    public static /* synthetic */ void AFInAppEventType(bb bbVar) {
        bbVar.onAttributionFailureNative.edit().putBoolean("sentRegisterRequestToAF", true).apply();
        AFLogger.values("Successfully registered for Uninstall Tracking");
    }

    public static boolean AFInAppEventType(Context context) {
        if (AppsFlyerLib.getInstance().isStopped()) {
            return false;
        }
        try {
            Class.forName("com.google.firebase.messaging.FirebaseMessagingService");
            if (aa.values(context, new Intent("com.google.firebase.MESSAGING_EVENT", null, context, FirebaseMessagingServiceListener.class))) {
                return true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("An error occurred while trying to verify manifest declarations: ", th);
        }
        return false;
    }

    public static boolean AFKeystoreWrapper(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("sentRegisterRequestToAF", false);
    }

    private void valueOf(l lVar) {
        this.onAttributionFailureNative.edit().putString("afUninstallToken", lVar.AFKeystoreWrapper).putLong("afUninstallToken_received_time", lVar.values).putBoolean("afUninstallToken_queued", lVar.valueOf()).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFKeystoreWrapper(java.lang.String r10) {
        /*
            r9 = this;
            if (r10 == 0) goto L5a
            r8 = 4
            java.lang.String r0 = "Firebase Refreshed Token = "
            java.lang.String r0 = r0.concat(r10)
            com.appsflyer.AFLogger.AFKeystoreWrapper(r0)
            r8 = 7
            com.appsflyer.internal.l r7 = r9.values()
            r0 = r7
            if (r0 == 0) goto L1f
            r8 = 3
            java.lang.String r1 = r0.AFKeystoreWrapper
            r8 = 3
            boolean r7 = r10.equals(r1)
            r1 = r7
            if (r1 != 0) goto L5a
        L1f:
            r8 = 2
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r3 = r9.onAttributionFailureNative
            r8 = 4
            boolean r7 = com.appsflyer.internal.ae.values(r3)
            r3 = r7
            if (r3 == 0) goto L47
            if (r0 == 0) goto L44
            long r3 = r0.values
            r8 = 5
            long r3 = r1 - r3
            r8 = 7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r5 = 2
            r8 = 4
            long r5 = r0.toMillis(r5)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L47
            r8 = 5
        L44:
            r0 = 1
            r8 = 2
            goto L49
        L47:
            r0 = 0
            r8 = 3
        L49:
            com.appsflyer.internal.l r3 = new com.appsflyer.internal.l
            r4 = r0 ^ 1
            r8 = 4
            r3.<init>(r10, r1, r4)
            r9.valueOf(r3)
            if (r0 == 0) goto L5a
            r8 = 7
            r9.valueOf(r10)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.bb.AFKeystoreWrapper(java.lang.String):void");
    }

    public void valueOf(String str) {
        Application application = this.values;
        final ae valueOf = ae.valueOf();
        if (ae.values()) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        String valueOf2 = ae.valueOf(AppsFlyerProperties.AF_KEY);
        if (valueOf2 == null) {
            AFLogger.AFVersionDeclaration("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            this.valueOf.put("app_version_code", Integer.toString(packageInfo.versionCode));
            this.valueOf.put("app_version_name", packageInfo.versionName);
            this.valueOf.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j10 = packageInfo.firstInstallTime;
            this.valueOf.put("installDate", ae.AFKeystoreWrapper(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), j10));
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("Exception while collecting application version info.", th);
        }
        ae.AFKeystoreWrapper(application, this.valueOf);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            this.valueOf.put("appUserId", string);
        }
        try {
            this.valueOf.put("model", Build.MODEL);
            this.valueOf.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.AFInAppEventParameterName("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            this.valueOf.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
        }
        d.e.C0069d valueOf3 = ab.valueOf(application.getContentResolver());
        if (valueOf3 != null) {
            this.valueOf.put("amazon_aid", valueOf3.values);
            this.valueOf.put("amazon_aid_limit", String.valueOf(valueOf3.AFInAppEventParameterName));
        }
        String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string2 != null) {
            this.valueOf.put("advertiserId", string2);
        }
        this.valueOf.put("devkey", valueOf2);
        this.valueOf.put("uid", an.AFInAppEventType(new WeakReference(application)));
        this.valueOf.put("af_gcm_token", str);
        this.valueOf.put("launch_counter", Integer.toString(ae.AFKeystoreWrapper(this.onAttributionFailureNative, "appsFlyerCount", false)));
        this.valueOf.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String AFInAppEventParameterName = valueOf.AFInAppEventParameterName(application);
        if (AFInAppEventParameterName != null) {
            this.valueOf.put("channel", AFInAppEventParameterName);
        }
        new Thread(new Runnable() { // from class: com.appsflyer.internal.bb.4
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    bb bbVar = bb.this;
                    bbVar.onConversionDataSuccess = valueOf.isStopped();
                    HttpURLConnection AFInAppEventType = new m(bbVar).AFInAppEventType();
                    if (AFInAppEventType != null) {
                        if (AFInAppEventType.getResponseCode() == 200) {
                            bb.AFInAppEventType(bb.this);
                        }
                        AFInAppEventType.disconnect();
                    }
                } catch (Throwable th3) {
                    AFLogger.AFInAppEventParameterName(th3.getMessage(), th3);
                }
            }
        }).start();
    }

    public l values() {
        String string;
        String string2;
        String string3 = this.onAttributionFailureNative.getString("afUninstallToken", null);
        long j10 = this.onAttributionFailureNative.getLong("afUninstallToken_received_time", 0L);
        boolean z10 = this.onAttributionFailureNative.getBoolean("afUninstallToken_queued", false);
        this.onAttributionFailureNative.edit().putBoolean("afUninstallToken_queued", false).apply();
        if (string3 == null && (string2 = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split = string2.split(",");
            string3 = split[split.length - 1];
        }
        if (j10 == 0 && (string = AppsFlyerProperties.getInstance().getString("afUninstallToken")) != null) {
            String[] split2 = string.split(",");
            if (split2.length >= 2) {
                try {
                    j10 = Long.parseLong(split2[split2.length - 2]);
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (string3 != null) {
            return new l(string3, j10, z10);
        }
        return null;
    }
}
