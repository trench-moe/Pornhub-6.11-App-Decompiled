package q2;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14309a;

    public w(a0.b bVar) {
        this.f14309a = bVar;
    }

    @Override // ie.a
    public Object get() {
        Objects.requireNonNull(this.f14309a);
        hf.f fVar = new hf.f(null, false);
        Intrinsics.checkNotNullExpressionValue(fVar, "create()");
        return fVar;
    }
}
