package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.appsflyer.AFLogger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y {

    /* loaded from: classes.dex */
    public static final class a {
        public static final y AFKeystoreWrapper = new y();
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final String AFInAppEventType;
        public final String AFKeystoreWrapper;
        public final String valueOf;

        public d(String str, String str2, String str3) {
            this.valueOf = str;
            this.AFKeystoreWrapper = str2;
            this.AFInAppEventType = str3;
        }
    }

    private static boolean AFInAppEventParameterName(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public static d AFInAppEventType(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        String str3 = "unknown";
        String str4 = null;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(allNetworks[i10]);
                    if (!AFInAppEventParameterName(networkInfo)) {
                        i10++;
                    } else if (1 == networkInfo.getType()) {
                        str3 = "WIFI";
                    } else if (networkInfo.getType() == 0) {
                        str3 = "MOBILE";
                    }
                }
            }
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
            str2 = telephonyManager.getSimOperatorName();
            try {
                str4 = telephonyManager.getNetworkOperatorName();
            } catch (Throwable th) {
                th = th;
                str = str4;
                str4 = str2;
                AFLogger.AFInAppEventParameterName("Exception while collecting network info. ", th);
                String str5 = str;
                str2 = str4;
                str4 = str5;
                return new d(str3, str4, str2);
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
        }
        if (str4 != null) {
            if (str4.isEmpty()) {
            }
            return new d(str3, str4, str2);
        }
        if (2 == telephonyManager.getPhoneType()) {
            str4 = "CDMA";
            return new d(str3, str4, str2);
        }
        return new d(str3, str4, str2);
    }
}
