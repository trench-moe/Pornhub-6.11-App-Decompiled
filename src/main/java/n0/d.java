package n0;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13111a;

    public d(Object obj) {
        this.f13111a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return Objects.equals(this.f13111a, ((d) obj).f13111a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f13111a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("DisplayCutoutCompat{");
        m10.append(this.f13111a);
        m10.append("}");
        return m10.toString();
    }
}
