package io.realm.internal;

import java.util.Collection;

/* loaded from: classes2.dex */
public class OsSchemaInfo implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final long f10916f = nativeGetFinalizerPtr();

    /* renamed from: c  reason: collision with root package name */
    public long f10917c;

    public OsSchemaInfo(long j10, OsSharedRealm osSharedRealm) {
        this.f10917c = j10;
    }

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        int i10 = 0;
        for (OsObjectSchemaInfo osObjectSchemaInfo : collection) {
            jArr[i10] = osObjectSchemaInfo.f10877c;
            i10++;
        }
        this.f10917c = nativeCreateFromList(jArr);
        f.f10955b.a(this);
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j10, String str);

    public OsObjectSchemaInfo a(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.f10917c, str));
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10916f;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10917c;
    }
}
