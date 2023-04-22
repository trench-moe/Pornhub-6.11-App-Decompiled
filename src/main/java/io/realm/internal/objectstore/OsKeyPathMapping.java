package io.realm.internal.objectstore;

import io.realm.internal.f;
import io.realm.internal.g;

/* loaded from: classes2.dex */
public class OsKeyPathMapping implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final long f10965f = nativeGetFinalizerMethodPtr();

    /* renamed from: c  reason: collision with root package name */
    public long f10966c;

    public OsKeyPathMapping(long j10) {
        this.f10966c = -1L;
        this.f10966c = nativeCreateMapping(j10);
        f.f10955b.a(this);
    }

    private static native long nativeCreateMapping(long j10);

    private static native long nativeGetFinalizerMethodPtr();

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10965f;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10966c;
    }
}
