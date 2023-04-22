package k6;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g extends k {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f11859a;

    public g(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f11859a = list;
    }

    @Override // k6.k
    public List<m> a() {
        return this.f11859a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return this.f11859a.equals(((k) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f11859a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("BatchedLogRequest{logRequests=");
        m10.append(this.f11859a);
        m10.append("}");
        return m10.toString();
    }
}
