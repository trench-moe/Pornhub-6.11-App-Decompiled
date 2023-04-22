package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class u extends a0.e.AbstractC0304e {

    /* renamed from: a  reason: collision with root package name */
    public final int f18325a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18326b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18327c;
    public final boolean d;

    public u(int i10, String str, String str2, boolean z10, a aVar) {
        this.f18325a = i10;
        this.f18326b = str;
        this.f18327c = str2;
        this.d = z10;
    }

    @Override // xb.a0.e.AbstractC0304e
    public String a() {
        return this.f18327c;
    }

    @Override // xb.a0.e.AbstractC0304e
    public int b() {
        return this.f18325a;
    }

    @Override // xb.a0.e.AbstractC0304e
    public String c() {
        return this.f18326b;
    }

    @Override // xb.a0.e.AbstractC0304e
    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.AbstractC0304e) {
            a0.e.AbstractC0304e abstractC0304e = (a0.e.AbstractC0304e) obj;
            return this.f18325a == abstractC0304e.b() && this.f18326b.equals(abstractC0304e.c()) && this.f18327c.equals(abstractC0304e.a()) && this.d == abstractC0304e.d();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f18325a ^ 1000003) * 1000003) ^ this.f18326b.hashCode()) * 1000003) ^ this.f18327c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("OperatingSystem{platform=");
        m10.append(this.f18325a);
        m10.append(", version=");
        m10.append(this.f18326b);
        m10.append(", buildVersion=");
        m10.append(this.f18327c);
        m10.append(", jailbroken=");
        m10.append(this.d);
        m10.append("}");
        return m10.toString();
    }
}
