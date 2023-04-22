package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class t extends a0.e.d.AbstractC0303d {

    /* renamed from: a  reason: collision with root package name */
    public final String f18324a;

    public t(String str, a aVar) {
        this.f18324a = str;
    }

    @Override // xb.a0.e.d.AbstractC0303d
    public String a() {
        return this.f18324a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.AbstractC0303d) {
            return this.f18324a.equals(((a0.e.d.AbstractC0303d) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f18324a.hashCode() ^ 1000003;
    }

    public String toString() {
        return android.support.v4.media.b.m(a1.a.m("Log{content="), this.f18324a, "}");
    }
}
