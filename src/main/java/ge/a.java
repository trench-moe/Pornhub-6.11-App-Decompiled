package ge;

/* loaded from: classes2.dex */
public class a<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public F f9942a;

    /* renamed from: b  reason: collision with root package name */
    public S f9943b;

    public a(F f10, S s10) {
        this.f9942a = f10;
        this.f9943b = s10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            F f10 = aVar.f9942a;
            F f11 = this.f9942a;
            if (f10 == f11 || (f10 != null && f10.equals(f11))) {
                S s10 = aVar.f9943b;
                S s11 = this.f9943b;
                return s10 == s11 || (s10 != null && s10.equals(s11));
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        F f10 = this.f9942a;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f9943b;
        return hashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Pair{");
        m10.append(String.valueOf(this.f9942a));
        m10.append(" ");
        m10.append(String.valueOf(this.f9943b));
        m10.append("}");
        return m10.toString();
    }
}
