package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public abstract class ak implements Runnable {
    private static int AFVersionDeclaration = 0;
    private static int getLevel = 0;
    private static int onAppOpenAttributionNative = 1;
    private static int onAttributionFailureNative;
    private static byte[] onDeepLinkingNative;
    private static int onInstallConversionDataLoadedNative;
    private static short[] onInstallConversionFailureNative;
    private static String valueOf;
    public static String values;
    private final ae AFInAppEventParameterName;
    public final String AFInAppEventType;
    public String AFKeystoreWrapper;
    public final String AFLogger$LogLevel = UUID.randomUUID().toString();
    public final Map<String, Object> AppsFlyer2dXConversionCallback = values();
    private final Context init;

    static {
        AFKeystoreWrapper();
        valueOf = "v2";
        StringBuilder sb2 = new StringBuilder("https://%sonelink.%s/shortlink-sdk/");
        sb2.append(valueOf);
        values = sb2.toString();
        int i10 = onAppOpenAttributionNative + 89;
        onAttributionFailureNative = i10 % 128;
        int i11 = i10 % 2;
    }

    public ak(ae aeVar, Context context, String str) {
        this.AFInAppEventParameterName = aeVar;
        this.init = context;
        this.AFInAppEventType = str;
    }

    private static String AFInAppEventType(byte b10, int i10, short s10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        StringBuilder sb2 = new StringBuilder();
        int i16 = getLevel;
        int i17 = i12 + i16;
        boolean z10 = i17 == -1;
        if (z10) {
            int i18 = onAttributionFailureNative + 27;
            onAppOpenAttributionNative = i18 % 128;
            if (i18 % 2 == 0) {
                Objects.requireNonNull(null);
                throw null;
            }
            byte[] bArr = onDeepLinkingNative;
            i17 = (bArr != null ? '%' : 'O') != 'O' ? (byte) (bArr[AFVersionDeclaration + i11] + i16) : (short) (onInstallConversionFailureNative[AFVersionDeclaration + i11] + i16);
        }
        if ((i17 > 0 ? '!' : '?') == '!') {
            int i19 = ((i11 + i17) - 2) + AFVersionDeclaration;
            if (z10) {
                int i20 = onAppOpenAttributionNative + 55;
                onAttributionFailureNative = i20 % 128;
                int i21 = i20 % 2;
                i13 = 1;
            } else {
                i13 = 0;
            }
            int i22 = i19 + i13;
            char c10 = (char) (i10 + onInstallConversionDataLoadedNative);
            sb2.append(c10);
            for (int i23 = 1; i23 < i17; i23++) {
                byte[] bArr2 = onDeepLinkingNative;
                if (bArr2 != null) {
                    i14 = i22 - 1;
                    i15 = (byte) (bArr2[i22] + s10);
                } else {
                    i14 = i22 - 1;
                    i15 = (short) (onInstallConversionFailureNative[i22] + s10);
                }
                c10 = (char) (c10 + (i15 ^ b10));
                i22 = i14;
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    public static void AFKeystoreWrapper() {
        getLevel = 91;
        AFVersionDeclaration = -784549513;
        onInstallConversionDataLoadedNative = -1400650653;
        onDeepLinkingNative = new byte[]{-79, -13, -3, 1, 19, -13, 7, -2, 22, 38, -57, 37};
    }

    private Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.3.1");
        hashMap.put("counter", Integer.valueOf(ae.AFKeystoreWrapper(ae.AFKeystoreWrapper(this.init), "appsFlyerCount", false)));
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        try {
            hashMap.put("app_version_name", this.init.getPackageManager().getPackageInfo(this.init.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("app_id", this.init.getPackageName());
        hashMap.put("platformextension", new al().values());
        int i10 = onAttributionFailureNative + 3;
        onAppOpenAttributionNative = i10 % 128;
        if (!(i10 % 2 == 0 ? true : true)) {
            int i11 = 28 / 0;
            return hashMap;
        }
        return hashMap;
    }

    public abstract void AFInAppEventParameterName();

    public abstract void AFInAppEventParameterName(String str);

    public final void AFKeystoreWrapper(HttpsURLConnection httpsURLConnection, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, valueOf);
        String join = TextUtils.join("\u2063", arrayList.toArray());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
        sb2.append(this.AFLogger$LogLevel);
        sb2.append(valueOf);
        httpsURLConnection.setRequestProperty(AFInAppEventType((byte) (ViewConfiguration.getPressedStateDuration() >> 16), 1400650718 - (ViewConfiguration.getWindowTouchSlop() >> 8), (short) View.getDefaultSize(0, 0), Color.rgb(0, 0, 0) + 801326729, (-88) - AndroidCharacter.getEastAsianWidth('0')).intern(), af.AFKeystoreWrapper(join, sb2.toString()));
        int i10 = onAppOpenAttributionNative + 67;
        onAttributionFailureNative = i10 % 128;
        if (i10 % 2 == 0) {
            return;
        }
        int i11 = 28 / 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ak.run():void");
    }

    public abstract String valueOf();

    public abstract void values(HttpsURLConnection httpsURLConnection);
}
