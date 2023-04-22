package z6;

import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public int f21800c;

    public final void f(int i10) {
        this.f21800c = i10 | this.f21800c;
    }

    public final boolean g(int i10) {
        return (this.f21800c & i10) == i10;
    }

    public final boolean h() {
        return g(268435456);
    }

    public final boolean i() {
        return g(IntCompanionObject.MIN_VALUE);
    }

    public final boolean j() {
        return g(4);
    }

    public final boolean k() {
        return g(1);
    }
}
