package w6;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final HashSet<String> f16836a;

    /* renamed from: b  reason: collision with root package name */
    public static String f16837b;

    static {
        new StringBuilder(a0.a.e(Build.VERSION.RELEASE, 57));
        f16836a = new HashSet<>();
        f16837b = "goog.exo.core";
    }

    public static synchronized void a(String str) {
        synchronized (x.class) {
            try {
                if (f16836a.add(str)) {
                    String str2 = f16837b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
                    sb2.append(str2);
                    sb2.append(", ");
                    sb2.append(str);
                    f16837b = sb2.toString();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
