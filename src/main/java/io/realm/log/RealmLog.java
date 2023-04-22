package io.realm.log;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class RealmLog {
    public static void a(int i10, Throwable th, String str, Object... objArr) {
        if (i10 < nativeGetLogLevel()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null && objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (th != null) {
            sb2.append(Log.getStackTraceString(th));
        }
        if (str != null) {
            if (th != null) {
                sb2.append("\n");
            }
            sb2.append(str);
        }
        nativeLog(i10, "REALM_JAVA", th, sb2.toString());
    }

    public static void b(String str, Object... objArr) {
        a(5, null, str, objArr);
    }

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i10, String str, Throwable th, String str2);
}
