package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class v extends a0.e.f {

    /* renamed from: a  reason: collision with root package name */
    public final String f18328a;

    public v(String str, a aVar) {
        this.f18328a = str;
    }

    @Override // xb.a0.e.f
    public String a() {
        return this.f18328a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.f18328a.equals(((a0.e.f) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f18328a.hashCode() ^ 1000003;
    }

    public String toString() {
        return android.support.v4.media.b.m(a1.a.m("User{identifier="), this.f18328a, "}");
    }
}
