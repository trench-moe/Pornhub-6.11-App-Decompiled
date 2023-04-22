package q2;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14310a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<com.squareup.moshi.k> f14311b;

    public x(a0.b bVar, ie.a<com.squareup.moshi.k> aVar) {
        this.f14310a = bVar;
        this.f14311b = aVar;
    }

    @Override // ie.a
    public Object get() {
        a0.b bVar = this.f14310a;
        com.squareup.moshi.k moshi = this.f14311b.get();
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Objects.requireNonNull(moshi, "moshi == null");
        p000if.a aVar = new p000if.a(moshi, false, false, false);
        Intrinsics.checkNotNullExpressionValue(aVar, "create(moshi)");
        return aVar;
    }
}
