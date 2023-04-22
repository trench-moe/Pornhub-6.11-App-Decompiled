package j5;

import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class b implements h5.b {

    /* renamed from: b  reason: collision with root package name */
    public final h5.b f11385b;

    /* renamed from: c  reason: collision with root package name */
    public final h5.b f11386c;

    public b(h5.b bVar, h5.b bVar2) {
        this.f11385b = bVar;
        this.f11386c = bVar2;
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        this.f11385b.b(messageDigest);
        this.f11386c.b(messageDigest);
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f11385b.equals(bVar.f11385b) && this.f11386c.equals(bVar.f11386c)) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // h5.b
    public int hashCode() {
        return this.f11386c.hashCode() + (this.f11385b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("DataCacheKey{sourceKey=");
        m10.append(this.f11385b);
        m10.append(", signature=");
        m10.append(this.f11386c);
        m10.append('}');
        return m10.toString();
    }
}
