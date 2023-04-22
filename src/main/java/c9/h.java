package c9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.app.pornhub.domain.config.UsersConfig;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3880b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3881c;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f3879a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f3881c) {
            try {
                try {
                    PackageInfo packageInfo = m9.c.a(context).f13032a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    i.a(context);
                    if (packageInfo == null || i.d(packageInfo, false) || !i.d(packageInfo, true)) {
                        f3880b = false;
                    } else {
                        f3880b = true;
                    }
                    f3881c = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    f3881c = true;
                }
            } catch (Throwable th) {
                f3881c = true;
                throw th;
            }
        }
        return f3880b || !UsersConfig.USER_PREF_KEY.equals(Build.TYPE);
    }

    @TargetApi(21)
    public static boolean b(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(sessionInfo.getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, ConstantsKt.DEFAULT_BUFFER_SIZE);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled) {
            Object systemService = context.getSystemService(UsersConfig.USER_PREF_KEY);
            Objects.requireNonNull(systemService, "null reference");
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (!(applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile")))) {
                return true;
            }
        }
        return false;
    }
}
