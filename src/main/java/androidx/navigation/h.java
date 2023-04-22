package androidx.navigation;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final t f2663a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2664b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2665c;
    public final Object d;

    public h(t<?> tVar, boolean z10, Object obj, boolean z11) {
        if (!tVar.f2727a && z10) {
            throw new IllegalArgumentException(tVar.b() + " does not allow nullable values");
        } else if (!z10 && z11 && obj == null) {
            StringBuilder m10 = a1.a.m("Argument with type ");
            m10.append(tVar.b());
            m10.append(" has null value but is not nullable.");
            throw new IllegalArgumentException(m10.toString());
        } else {
            this.f2663a = tVar;
            this.f2664b = z10;
            this.d = obj;
            this.f2665c = z11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f2664b == hVar.f2664b && this.f2665c == hVar.f2665c && this.f2663a.equals(hVar.f2663a)) {
                Object obj2 = this.d;
                return obj2 != null ? obj2.equals(hVar.d) : hVar.d == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f2663a.hashCode() * 31) + (this.f2664b ? 1 : 0)) * 31) + (this.f2665c ? 1 : 0)) * 31;
        Object obj = this.d;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }
}
