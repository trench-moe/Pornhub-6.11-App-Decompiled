package com.appsflyer.share;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.ae;
import com.appsflyer.internal.bs;
import com.appsflyer.internal.bv;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CrossPromotionHelper {
    private static String AFInAppEventParameterName = "https://%simpression.%s";

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        private final boolean AFInAppEventType;
        private final WeakReference<Context> AFKeystoreWrapper;
        private final bs valueOf;
        private final String values;

        public a(String str, bs bsVar, Context context, boolean z10) {
            this.values = str;
            this.valueOf = bsVar;
            this.AFKeystoreWrapper = new WeakReference<>(context);
            this.AFInAppEventType = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            HttpURLConnection httpURLConnection;
            Throwable th;
            if (this.AFInAppEventType) {
                return;
            }
            try {
                httpURLConnection = (HttpURLConnection) new URL(this.values).openConnection();
            } catch (Throwable th2) {
                httpURLConnection = null;
                th = th2;
            }
            try {
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(false);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    if (responseCode == 301 || responseCode == 302) {
                        StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                        sb2.append(this.values);
                        AFLogger.AFInAppEventParameterName(sb2.toString(), false);
                        if (this.valueOf != null && this.AFKeystoreWrapper.get() != null) {
                            this.valueOf.AFInAppEventParameterName = httpURLConnection.getHeaderField("Location");
                            bs bsVar = this.valueOf;
                            Context context = this.AFKeystoreWrapper.get();
                            if (bsVar.AFInAppEventParameterName != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(bsVar.AFInAppEventParameterName)).setFlags(268435456));
                            }
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("call to ");
                        sb3.append(this.values);
                        sb3.append(" failed: ");
                        sb3.append(responseCode);
                        AFLogger.AFKeystoreWrapper(sb3.toString());
                    }
                    httpURLConnection.disconnect();
                }
                StringBuilder sb4 = new StringBuilder("Cross promotion impressions success: ");
                sb4.append(this.values);
                AFLogger.AFInAppEventParameterName(sb4.toString(), false);
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                th = th3;
                try {
                    AFLogger.AFInAppEventType(th.getMessage(), th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th4) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th4;
                }
            }
        }
    }

    public static void logAndOpenStore(Context context, String str, String str2) {
        logAndOpenStore(context, str, str2, null);
    }

    public static void logAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator values = values(context, str, str2, map, String.format(bv.AFKeystoreWrapper, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName()));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("af_campaign", str2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", map);
        new Thread(new a(values.generateLink(), new bs(), context, AppsFlyerLib.getInstance().isStopped())).start();
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2) {
        logCrossPromoteImpression(context, str, str2, null);
    }

    public static void logCrossPromoteImpression(Context context, String str, String str2, Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.AFInAppEventParameterName("CustomerUserId not set, Promote Impression is disabled", true);
        } else {
            new Thread(new a(values(context, str, str2, map, String.format(AFInAppEventParameterName, AppsFlyerLib.getInstance().getHostPrefix(), ae.valueOf().getHostName())).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped())).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r2 == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        com.appsflyer.share.CrossPromotionHelper.AFInAppEventParameterName = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void setUrl(java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r6 = r9
            java.util.Set r8 = r6.entrySet()
            r6 = r8
            java.util.Iterator r6 = r6.iterator()
        La:
            boolean r8 = r6.hasNext()
            r0 = r8
            if (r0 == 0) goto L62
            r8 = 1
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r8 = 2
            java.lang.Object r8 = r0.getValue()
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            r8 = 7
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r8 = 4
            r2 = -1
            int r8 = r0.hashCode()
            r3 = r8
            r4 = 96801(0x17a21, float:1.35647E-40)
            r8 = 1
            r5 = r8
            if (r3 == r4) goto L48
            r4 = 120623625(0x7309209, float:1.3283684E-34)
            if (r3 == r4) goto L3c
            r8 = 3
            goto L53
        L3c:
            java.lang.String r3 = "impression"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L53
            r8 = 2
            r8 = 1
            r2 = r8
            goto L53
        L48:
            java.lang.String r8 = "app"
            r3 = r8
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L53
            r8 = 4
            r2 = 0
        L53:
            if (r2 == 0) goto L5d
            r8 = 6
            if (r2 == r5) goto L59
            goto La
        L59:
            com.appsflyer.share.CrossPromotionHelper.AFInAppEventParameterName = r1
            r8 = 1
            goto La
        L5d:
            r8 = 3
            com.appsflyer.internal.bv.AFKeystoreWrapper = r1
            r8 = 7
            goto La
        L62:
            r8 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.setUrl(java.util.Map):void");
    }

    private static LinkGenerator values(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = str3;
        linkGenerator.AFKeystoreWrapper = str;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }
}
