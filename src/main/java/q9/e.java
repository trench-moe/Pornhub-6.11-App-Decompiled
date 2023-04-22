package q9;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f14444a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f14444a == null) {
                f14444a = (SharedPreferences) v9.c.a(new w9.a(context, 2));
            }
            sharedPreferences = f14444a;
        }
        return sharedPreferences;
    }
}
