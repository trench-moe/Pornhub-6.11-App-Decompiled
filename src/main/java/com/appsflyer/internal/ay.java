package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AFLogger;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ay implements Runnable {
    private static String AFInAppEventParameterName = "https://%sgcdsdk.%s/install_data/v4.0/";
    private static final List<String> AFInAppEventType = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final Application AFKeystoreWrapper;
    private final int AFVersionDeclaration;
    private final ae AppsFlyer2dXConversionCallback;
    private final AtomicInteger getLevel;
    private final String valueOf;
    public final ScheduledExecutorService values;

    public ay(ae aeVar, Application application, String str) {
        if (k.AFKeystoreWrapper == null) {
            k.AFKeystoreWrapper = new k();
        }
        this.values = k.AFKeystoreWrapper.values();
        this.getLevel = new AtomicInteger(0);
        this.AppsFlyer2dXConversionCallback = aeVar;
        this.AFKeystoreWrapper = application;
        this.valueOf = str;
        this.AFVersionDeclaration = 0;
    }

    private ay(ay ayVar) {
        if (k.AFKeystoreWrapper == null) {
            k.AFKeystoreWrapper = new k();
        }
        this.values = k.AFKeystoreWrapper.values();
        this.getLevel = new AtomicInteger(0);
        this.AppsFlyer2dXConversionCallback = ayVar.AppsFlyer2dXConversionCallback;
        this.AFKeystoreWrapper = ayVar.AFKeystoreWrapper;
        this.valueOf = ayVar.valueOf;
        this.AFVersionDeclaration = ayVar.AFVersionDeclaration + 1;
    }

    public static void AFInAppEventType(String str) {
        if (ae.valueOf != null) {
            AFLogger.values("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            ae.valueOf.onConversionDataFail(str);
        }
    }

    public static void valueOf(Map<String, Object> map) {
        StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
        sb2.append(map.toString());
        AFLogger.values(sb2.toString());
        ae.valueOf.onConversionDataSuccess(map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:17|18|(2:20|(10:22|23|24|25|(5:29|(1:39)(1:33)|34|35|36)|40|(13:42|(1:44)|(1:48)|49|50|(2:52|(1:54)(1:55))|56|(1:58)|59|60|(1:62)(1:76)|63|(5:67|68|(1:70)|72|73))|34|35|36)(1:94))|95|23|24|25|(7:29|(1:31)|37|39|34|35|36)|40|(0)|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x028b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x028c, code lost:
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0291, code lost:
        if (r16.AFVersionDeclaration < 2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0293, code lost:
        r2 = new com.appsflyer.internal.ay(r16);
        com.appsflyer.internal.ae.values(r2.values, r2, 10, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02a2, code lost:
        AFInAppEventType(r0.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a9, code lost:
        com.appsflyer.AFLogger.AFInAppEventParameterName(r0.getMessage(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c6, code lost:
        r16.getLevel.decrementAndGet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02cb, code lost:
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02cd, code lost:
        r3.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d0, code lost:
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0195 A[Catch: all -> 0x028b, TryCatch #2 {all -> 0x028b, blocks: (B:26:0x00ee, B:37:0x0146, B:34:0x0132, B:36:0x0136, B:38:0x0155, B:40:0x0195, B:42:0x01a3, B:44:0x01bd, B:46:0x01c3, B:47:0x01d0, B:50:0x01da, B:52:0x01e0, B:53:0x01f4, B:54:0x0205, B:56:0x020b, B:57:0x021e, B:60:0x0230, B:62:0x023b, B:64:0x023f, B:66:0x0247, B:68:0x025b, B:72:0x0268, B:71:0x0263, B:61:0x0236), top: B:98:0x00ee, inners: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ay.run():void");
    }
}
