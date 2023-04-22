package bf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class i implements w {

    /* renamed from: c  reason: collision with root package name */
    public final w f3671c;

    public i(w delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3671c = delegate;
    }

    @Override // bf.w
    public z g() {
        return this.f3671c.g();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f3671c + ')';
    }
}
