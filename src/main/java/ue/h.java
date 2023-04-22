package ue;

import kotlin.jvm.internal.Intrinsics;
import pe.a0;
import pe.r;

/* loaded from: classes3.dex */
public final class h extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public final String f15892c;

    /* renamed from: f  reason: collision with root package name */
    public final long f15893f;

    /* renamed from: j  reason: collision with root package name */
    public final bf.h f15894j;

    public h(String str, long j10, bf.h source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f15892c = str;
        this.f15893f = j10;
        this.f15894j = source;
    }

    @Override // pe.a0
    public long d() {
        return this.f15893f;
    }

    @Override // pe.a0
    public r e() {
        String toMediaTypeOrNull = this.f15892c;
        if (toMediaTypeOrNull != null) {
            r.a aVar = r.f14004f;
            Intrinsics.checkNotNullParameter(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return r.a.a(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // pe.a0
    public bf.h f() {
        return this.f15894j;
    }
}
