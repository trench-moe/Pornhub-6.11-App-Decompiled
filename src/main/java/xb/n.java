package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class n extends a0.e.d.a.b.AbstractC0298a {

    /* renamed from: a  reason: collision with root package name */
    public final long f18293a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18294b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18295c;
    public final String d;

    public n(long j10, long j11, String str, String str2, a aVar) {
        this.f18293a = j10;
        this.f18294b = j11;
        this.f18295c = str;
        this.d = str2;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0298a
    public long a() {
        return this.f18293a;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0298a
    public String b() {
        return this.f18295c;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0298a
    public long c() {
        return this.f18294b;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0298a
    public String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0298a) {
            a0.e.d.a.b.AbstractC0298a abstractC0298a = (a0.e.d.a.b.AbstractC0298a) obj;
            if (this.f18293a == abstractC0298a.a() && this.f18294b == abstractC0298a.c() && this.f18295c.equals(abstractC0298a.b())) {
                String str = this.d;
                if (str == null) {
                    if (abstractC0298a.d() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC0298a.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f18293a;
        long j11 = this.f18294b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f18295c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("BinaryImage{baseAddress=");
        m10.append(this.f18293a);
        m10.append(", size=");
        m10.append(this.f18294b);
        m10.append(", name=");
        m10.append(this.f18295c);
        m10.append(", uuid=");
        return android.support.v4.media.b.m(m10, this.d, "}");
    }
}
