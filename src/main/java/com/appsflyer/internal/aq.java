package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.bt;
import com.appsflyer.internal.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class aq extends bf {
    public static long onAttributionFailureNative = 0;
    private static String onConversionDataFail = "https://%sdlsdk.%s/v1.0/android/";
    private boolean AppsFlyerConversionListener;
    private int AppsFlyerInAppPurchaseValidatorListener;
    private int AppsFlyerLib;
    private final CountDownLatch onAppOpenAttribution;
    public int onAppOpenAttributionNative;
    private final au onAttributionFailure;
    private final List<bt> onDeepLinking;
    private final JSONObject onValidateInApp;

    /* renamed from: com.appsflyer.internal.aq$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[bt.e.values().length];
            valueOf = iArr;
            try {
                iArr[bt.e.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                valueOf[bt.e.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public aq(Context context, au auVar) {
        super(null, onConversionDataFail, Boolean.FALSE, Boolean.TRUE, null, context);
        this.onDeepLinking = new ArrayList();
        this.onAppOpenAttribution = new CountDownLatch(1);
        this.onValidateInApp = new JSONObject();
        this.onAttributionFailure = auVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
        return new com.appsflyer.deeplink.DeepLinkResult(null, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ com.appsflyer.deeplink.DeepLinkResult AFInAppEventParameterName(com.appsflyer.internal.aq r11, android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.aq.AFInAppEventParameterName(com.appsflyer.internal.aq, android.content.Context):com.appsflyer.deeplink.DeepLinkResult");
    }

    private Map<String, Object> AFInAppEventParameterName(final d.e.C0069d c0069d) {
        Boolean bool;
        boolean z10 = false;
        if (c0069d != null && c0069d.values != null && ((bool = c0069d.AFInAppEventParameterName) == null || !bool.booleanValue())) {
            z10 = true;
        }
        if (z10) {
            return new HashMap<String, Object>() { // from class: com.appsflyer.internal.aq.5
                {
                    put("type", "unhashed");
                    put(AppMeasurementSdk.ConditionalUserProperty.VALUE, d.e.C0069d.this.values);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFInAppEventParameterName(bt btVar) {
        if (!values(btVar)) {
            int i10 = this.AppsFlyerLib + 1;
            this.AppsFlyerLib = i10;
            if (i10 == this.AppsFlyerInAppPurchaseValidatorListener) {
                this.onAppOpenAttribution.countDown();
            }
            return;
        }
        this.onDeepLinking.add(btVar);
        this.onAppOpenAttribution.countDown();
        StringBuilder sb2 = new StringBuilder("[DDL] Added non-organic ");
        sb2.append(btVar.getClass().getSimpleName());
        AFLogger.values(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0156 A[LOOP:1: B:14:0x0113->B:23:0x0156, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void AFInAppEventType(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.aq.AFInAppEventType(android.content.Context):void");
    }

    public static /* synthetic */ void values(aq aqVar) {
        bt[] btVarArr;
        ArrayList arrayList = new ArrayList();
        for (bt btVar : ae.valueOf().onDeepLinkingNative) {
            if (btVar != null && btVar.valueOf != bt.e.NOT_STARTED) {
                arrayList.add(btVar);
            }
        }
        aqVar.AppsFlyerInAppPurchaseValidatorListener = arrayList.size();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final bt btVar2 = (bt) it.next();
            int i10 = AnonymousClass1.valueOf[btVar2.valueOf.ordinal()];
            if (i10 == 1) {
                StringBuilder sb2 = new StringBuilder("[DDL] ");
                sb2.append(btVar2.AFInAppEventType.get("source"));
                sb2.append(" referrer collected earlier");
                AFLogger.values(sb2.toString());
                aqVar.AFInAppEventParameterName(btVar2);
            } else if (i10 == 2) {
                btVar2.addObserver(new Observer() { // from class: com.appsflyer.internal.aq.2
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb3 = new StringBuilder("[DDL] ");
                        sb3.append(btVar2.AFInAppEventType.get("source"));
                        sb3.append(" referrer collected via observer");
                        AFLogger.values(sb3.toString());
                        aq.this.AFInAppEventParameterName((bt) observable);
                    }
                });
            }
        }
    }

    private boolean values() {
        List list = (List) this.valueOf.get("referrers");
        return (list != null ? list.size() : 0) < this.AppsFlyerInAppPurchaseValidatorListener && !this.valueOf.containsKey("referrers");
    }

    private static boolean values(bt btVar) {
        Long l10 = (Long) btVar.AFInAppEventType.get("click_ts");
        if (l10 != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
            return true;
        }
        return false;
    }

    public final void AFInAppEventParameterName(DeepLinkResult deepLinkResult) {
        try {
            this.onValidateInApp.put("status", deepLinkResult.getStatus().toString());
            this.onValidateInApp.put("timeout_value", onAttributionFailureNative);
        } catch (JSONException unused) {
        }
        au auVar = this.onAttributionFailure;
        auVar.AFKeystoreWrapper.edit().putString("ddl", this.onValidateInApp.toString()).apply();
        ap.valueOf(deepLinkResult);
    }
}
