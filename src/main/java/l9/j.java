package l9;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j {
    public static boolean a(Context context, int i10) {
        if (b(context, i10, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                c9.i a10 = c9.i.a(context);
                Objects.requireNonNull(a10);
                if (packageInfo == null) {
                    return false;
                }
                if (!c9.i.d(packageInfo, false)) {
                    if (c9.i.d(packageInfo, true)) {
                        if (!c9.h.a(a10.f3883a)) {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    }
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
                return false;
            }
        }
        return false;
    }

    @TargetApi(19)
    public static boolean b(Context context, int i10, String str) {
        m9.b a10 = m9.c.a(context);
        Objects.requireNonNull(a10);
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a10.f13032a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i10, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
