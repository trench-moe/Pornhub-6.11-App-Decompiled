package io.realm.internal;

import io.realm.s;

/* loaded from: classes2.dex */
public class OsObjectStore {
    public static boolean a(s sVar, Runnable runnable) {
        return nativeCallWithLock(sVar.f11005c, runnable);
    }

    public static String b(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.nativeGetTablePrefix() + str);
    }

    public static long c(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    public static void d(OsSharedRealm osSharedRealm, String str, String str2) {
        nativeSetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.nativeGetTablePrefix() + str, str2);
    }

    public static void e(OsSharedRealm osSharedRealm, long j10) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j10);
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native String nativeGetPrimaryKeyForObject(long j10, String str);

    private static native long nativeGetSchemaVersion(long j10);

    private static native void nativeSetPrimaryKeyForObject(long j10, String str, String str2);

    private static native void nativeSetSchemaVersion(long j10, long j11);
}
