package i6;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10544a;

    public b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f10544a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f10544a.equals(((b) obj).f10544a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10544a.hashCode() ^ 1000003;
    }

    public String toString() {
        return android.support.v4.media.b.m(a1.a.m("Encoding{name=\""), this.f10544a, "\"}");
    }
}
