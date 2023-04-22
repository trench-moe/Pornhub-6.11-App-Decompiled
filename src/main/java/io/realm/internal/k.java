package io.realm.internal;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f10963a;

    static {
        String str = File.separator;
        String str2 = File.pathSeparator;
        f10963a = false;
    }

    public static synchronized void a(Context context) {
        synchronized (k.class) {
            if (f10963a) {
                return;
            }
            new f6.e().c(context, "realm-jni", "10.4.0", null);
            f10963a = true;
        }
    }
}
