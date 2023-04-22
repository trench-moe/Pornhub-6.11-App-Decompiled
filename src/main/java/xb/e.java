package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class e extends a0.d {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.d.a> f18227a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18228b;

    public e(b0 b0Var, String str, a aVar) {
        this.f18227a = b0Var;
        this.f18228b = str;
    }

    @Override // xb.a0.d
    public b0<a0.d.a> a() {
        return this.f18227a;
    }

    @Override // xb.a0.d
    public String b() {
        return this.f18228b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d) {
            a0.d dVar = (a0.d) obj;
            if (this.f18227a.equals(dVar.a())) {
                String str = this.f18228b;
                if (str == null) {
                    if (dVar.b() == null) {
                        return true;
                    }
                } else if (str.equals(dVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f18227a.hashCode() ^ 1000003) * 1000003;
        String str = this.f18228b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("FilesPayload{files=");
        m10.append(this.f18227a);
        m10.append(", orgId=");
        return android.support.v4.media.b.m(m10, this.f18228b, "}");
    }
}
