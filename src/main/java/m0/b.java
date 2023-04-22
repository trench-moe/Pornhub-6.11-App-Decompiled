package m0;

import java.util.Objects;

/* loaded from: classes2.dex */
public class b<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f12856a;

    /* renamed from: b  reason: collision with root package name */
    public final S f12857b;

    public b(F f10, S s10) {
        this.f12856a = f10;
        this.f12857b = s10;
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (Objects.equals(bVar.f12856a, this.f12856a) && Objects.equals(bVar.f12857b, this.f12857b)) {
                z10 = true;
            }
            return z10;
        }
        return false;
    }

    public int hashCode() {
        F f10 = this.f12856a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f12857b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Pair{");
        m10.append(this.f12856a);
        m10.append(" ");
        m10.append(this.f12857b);
        m10.append("}");
        return m10.toString();
    }
}
