package io.realm.internal.core;

import io.realm.internal.f;
import io.realm.internal.g;

/* loaded from: classes2.dex */
public class DescriptorOrdering implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final long f10950f = nativeGetFinalizerMethodPtr();

    /* renamed from: c  reason: collision with root package name */
    public final long f10951c = nativeCreate();

    public DescriptorOrdering() {
        f.f10955b.a(this);
    }

    private static native long nativeCreate();

    private static native long nativeGetFinalizerMethodPtr();

    private static native boolean nativeIsEmpty(long j10);

    public boolean a() {
        return nativeIsEmpty(this.f10951c);
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10950f;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10951c;
    }
}
