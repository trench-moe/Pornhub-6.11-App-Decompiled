package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class d extends a0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f18225a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18226b;

    public d(String str, String str2, a aVar) {
        this.f18225a = str;
        this.f18226b = str2;
    }

    @Override // xb.a0.c
    public String a() {
        return this.f18225a;
    }

    @Override // xb.a0.c
    public String b() {
        return this.f18226b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.c) {
            a0.c cVar = (a0.c) obj;
            return this.f18225a.equals(cVar.a()) && this.f18226b.equals(cVar.b());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18225a.hashCode() ^ 1000003) * 1000003) ^ this.f18226b.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CustomAttribute{key=");
        m10.append(this.f18225a);
        m10.append(", value=");
        return android.support.v4.media.b.m(m10, this.f18226b, "}");
    }
}
