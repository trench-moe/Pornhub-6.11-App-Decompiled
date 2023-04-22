package se;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public c f15008a;

    /* renamed from: b  reason: collision with root package name */
    public long f15009b;

    /* renamed from: c  reason: collision with root package name */
    public final String f15010c;
    public final boolean d;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15010c = name;
        this.d = z10;
        this.f15009b = -1L;
    }

    public abstract long a();

    public String toString() {
        return this.f15010c;
    }
}
