package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.ae;

/* loaded from: classes.dex */
public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (Throwable th) {
            AFLogger.AFInAppEventParameterName("error in BroadcastReceiver ", th);
            str = null;
        }
        if (str != null && ae.AFKeystoreWrapper(context).getString("referrer", null) != null) {
            ae.valueOf().values(context, str);
            return;
        }
        AFLogger.AFKeystoreWrapper("MultipleInstallBroadcastReceiver called");
        ae.valueOf().AFInAppEventParameterName(context, intent);
        while (true) {
            for (ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
                String action = intent.getAction();
                if (((PackageItemInfo) resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !getClass().getName().equals(((PackageItemInfo) resolveInfo.activityInfo).name)) {
                    StringBuilder sb2 = new StringBuilder("trigger onReceive: class: ");
                    sb2.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                    AFLogger.AFKeystoreWrapper(sb2.toString());
                    try {
                        ((BroadcastReceiver) Class.forName(((PackageItemInfo) resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                    } catch (Throwable th2) {
                        StringBuilder sb3 = new StringBuilder("error in BroadcastReceiver ");
                        sb3.append(((PackageItemInfo) resolveInfo.activityInfo).name);
                        AFLogger.AFInAppEventParameterName(sb3.toString(), th2);
                    }
                }
            }
            return;
        }
    }
}
