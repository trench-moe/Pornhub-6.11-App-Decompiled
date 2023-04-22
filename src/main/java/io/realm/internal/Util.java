package io.realm.internal;

import io.realm.u;
import io.realm.v;

/* loaded from: classes2.dex */
public class Util {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f10939a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f10940b;

    public static Class<? extends u> a(Class<? extends u> cls) {
        if (cls.equals(u.class) || cls.equals(v.class)) {
            throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
        }
        Class superclass = cls.getSuperclass();
        return (superclass.equals(Object.class) || superclass.equals(v.class)) ? cls : superclass;
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }

    public static native String nativeGetTablePrefix();
}
