package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class p extends a0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f18300a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18301b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18302c;

    public p(String str, String str2, long j10, a aVar) {
        this.f18300a = str;
        this.f18301b = str2;
        this.f18302c = j10;
    }

    @Override // xb.a0.e.d.a.b.c
    public long a() {
        return this.f18302c;
    }

    @Override // xb.a0.e.d.a.b.c
    public String b() {
        return this.f18301b;
    }

    @Override // xb.a0.e.d.a.b.c
    public String c() {
        return this.f18300a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.c) {
            a0.e.d.a.b.c cVar = (a0.e.d.a.b.c) obj;
            return this.f18300a.equals(cVar.c()) && this.f18301b.equals(cVar.b()) && this.f18302c == cVar.a();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f18302c;
        return ((((this.f18300a.hashCode() ^ 1000003) * 1000003) ^ this.f18301b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Signal{name=");
        m10.append(this.f18300a);
        m10.append(", code=");
        m10.append(this.f18301b);
        m10.append(", address=");
        m10.append(this.f18302c);
        m10.append("}");
        return m10.toString();
    }
}
