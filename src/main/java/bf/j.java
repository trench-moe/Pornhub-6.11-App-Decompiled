package bf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class j implements y {

    /* renamed from: c  reason: collision with root package name */
    public final y f3672c;

    public j(y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3672c = delegate;
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3672c.close();
    }

    @Override // bf.y
    public z g() {
        return this.f3672c.g();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f3672c + ')';
    }
}
