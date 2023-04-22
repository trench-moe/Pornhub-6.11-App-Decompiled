package w9;

/* loaded from: classes2.dex */
public final class h5 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17180a;

    /* renamed from: b  reason: collision with root package name */
    public final int f17181b;

    public h5(Object obj, int i10) {
        this.f17180a = obj;
        this.f17181b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h5) {
            h5 h5Var = (h5) obj;
            return this.f17180a == h5Var.f17180a && this.f17181b == h5Var.f17181b;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f17180a) * 65535) + this.f17181b;
    }
}
