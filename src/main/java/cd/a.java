package cd;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.mixpanel.android.mpmetrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f4026a;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager != null && packageName != null) {
            if (packageManager.checkPermission("android.permission.INTERNET", packageName) != 0) {
                cb.e.j0("MixpanelAPI.ConfigurationChecker", "Package does not have permission android.permission.INTERNET");
                cb.e.O("MixpanelAPI.ConfigurationChecker", "You can fix this by adding the following to your AndroidManifest.xml file:\n<uses-permission android:name=\"android.permission.INTERNET\" />");
                return false;
            }
            try {
                ServiceInfo[] serviceInfoArr = packageManager.getPackageInfo(packageName, 4).services;
                if (serviceInfoArr != null && serviceInfoArr.length != 0) {
                    Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                    intent.setPackage(packageName);
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 128);
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (it.hasNext()) {
                        try {
                            if (!o.class.isAssignableFrom(Class.forName(it.next().serviceInfo.name))) {
                                it.remove();
                            }
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    if (queryIntentServices.size() == 0) {
                        return false;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            if (serviceInfo.name.equals(resolveInfo.serviceInfo.name) && serviceInfo.isEnabled()) {
                                arrayList.add(resolveInfo.serviceInfo);
                            }
                        }
                    }
                    if (arrayList.size() > 1) {
                        cb.e.j0("MixpanelAPI.ConfigurationChecker", "You can't have more than one service handling \"com.google.firebase.MESSAGING_EVENT\" intent filter. Android will only use the first one that is declared on your AndroidManifest.xml. If you have more than one push provider you need to crate your own FirebaseMessagingService class.");
                    }
                    try {
                        int i10 = c9.g.f3878e;
                    } catch (ClassNotFoundException unused2) {
                        cb.e.j0("MixpanelAPI.ConfigurationChecker", "Google Play Services aren't included in your build- push notifications won't work on Lollipop/API 21 or greater");
                        cb.e.O("MixpanelAPI.ConfigurationChecker", "You can fix this by adding com.google.android.gms:play-services as a dependency of your gradle or maven project");
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused3) {
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        if (f4026a == null) {
            Intent intent = new Intent(context, dd.d.class);
            intent.addFlags(268435456);
            intent.addFlags(131072);
            if (context.getPackageManager().queryIntentActivities(intent, 0).size() == 0) {
                cb.e.j0("MixpanelAPI.ConfigurationChecker", dd.d.class.getName() + " is not registered as an activity in your application, so takeover in-apps can't be shown.");
                cb.e.O("MixpanelAPI.ConfigurationChecker", "Please add the child tag <activity android:name=\"com.mixpanel.android.takeoverinapp.TakeoverInAppActivity\" /> to your <application> tag.");
                Boolean bool = Boolean.FALSE;
                f4026a = bool;
                return bool.booleanValue();
            }
            f4026a = Boolean.TRUE;
        }
        return f4026a.booleanValue();
    }
}
