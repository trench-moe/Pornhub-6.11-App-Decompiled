package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class q extends a0.e.d.a.b.AbstractC0300d {

    /* renamed from: a  reason: collision with root package name */
    public final String f18303a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18304b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0300d.AbstractC0301a> f18305c;

    public q(String str, int i10, b0 b0Var, a aVar) {
        this.f18303a = str;
        this.f18304b = i10;
        this.f18305c = b0Var;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d
    public b0<a0.e.d.a.b.AbstractC0300d.AbstractC0301a> a() {
        return this.f18305c;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d
    public int b() {
        return this.f18304b;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d
    public String c() {
        return this.f18303a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0300d) {
            a0.e.d.a.b.AbstractC0300d abstractC0300d = (a0.e.d.a.b.AbstractC0300d) obj;
            return this.f18303a.equals(abstractC0300d.c()) && this.f18304b == abstractC0300d.b() && this.f18305c.equals(abstractC0300d.a());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f18303a.hashCode() ^ 1000003) * 1000003) ^ this.f18304b) * 1000003) ^ this.f18305c.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Thread{name=");
        m10.append(this.f18303a);
        m10.append(", importance=");
        m10.append(this.f18304b);
        m10.append(", frames=");
        m10.append(this.f18305c);
        m10.append("}");
        return m10.toString();
    }
}
