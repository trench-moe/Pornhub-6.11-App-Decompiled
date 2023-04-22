package l9;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f12746a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f12747b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f12748c;
    public static Boolean d;

    @TargetApi(20)
    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f12746a == null) {
            f12746a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f12746a.booleanValue();
    }

    @TargetApi(26)
    public static boolean b(Context context) {
        boolean z10 = false;
        if (a(context)) {
            if (Build.VERSION.SDK_INT >= 24) {
                if (f12747b == null) {
                    f12747b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
                }
                if (f12747b.booleanValue()) {
                    if (g.a()) {
                        return z10;
                    }
                    return true;
                }
            } else {
                z10 = true;
            }
        }
        return z10;
    }
}
