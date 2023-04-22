package h5;

import h5.c;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class d implements b {

    /* renamed from: b  reason: collision with root package name */
    public final p.a<c<?>, Object> f10151b = new d6.b();

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        int i10 = 0;
        while (true) {
            p.a<c<?>, Object> aVar = this.f10151b;
            if (i10 >= aVar.f13768j) {
                return;
            }
            c<?> h10 = aVar.h(i10);
            Object l10 = this.f10151b.l(i10);
            c.b<?> bVar = h10.f10149b;
            if (h10.d == null) {
                h10.d = h10.f10150c.getBytes(b.f10146a);
            }
            bVar.a(h10.d, l10, messageDigest);
            i10++;
        }
    }

    public <T> T c(c<T> cVar) {
        return this.f10151b.e(cVar) >= 0 ? (T) this.f10151b.getOrDefault(cVar, null) : cVar.f10148a;
    }

    public void d(d dVar) {
        this.f10151b.i(dVar.f10151b);
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f10151b.equals(((d) obj).f10151b);
        }
        return false;
    }

    @Override // h5.b
    public int hashCode() {
        return this.f10151b.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Options{values=");
        m10.append(this.f10151b);
        m10.append('}');
        return m10.toString();
    }
}
