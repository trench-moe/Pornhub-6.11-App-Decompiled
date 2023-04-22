package j5;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class j implements h5.b {

    /* renamed from: j  reason: collision with root package name */
    public static final d6.i<Class<?>, byte[]> f11405j = new d6.i<>(50);

    /* renamed from: b  reason: collision with root package name */
    public final k5.b f11406b;

    /* renamed from: c  reason: collision with root package name */
    public final h5.b f11407c;
    public final h5.b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11408e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11409f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f11410g;

    /* renamed from: h  reason: collision with root package name */
    public final h5.d f11411h;

    /* renamed from: i  reason: collision with root package name */
    public final h5.g<?> f11412i;

    public j(k5.b bVar, h5.b bVar2, h5.b bVar3, int i10, int i11, h5.g<?> gVar, Class<?> cls, h5.d dVar) {
        this.f11406b = bVar;
        this.f11407c = bVar2;
        this.d = bVar3;
        this.f11408e = i10;
        this.f11409f = i11;
        this.f11412i = gVar;
        this.f11410g = cls;
        this.f11411h = dVar;
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f11406b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f11408e).putInt(this.f11409f).array();
        this.d.b(messageDigest);
        this.f11407c.b(messageDigest);
        messageDigest.update(bArr);
        h5.g<?> gVar = this.f11412i;
        if (gVar != null) {
            gVar.b(messageDigest);
        }
        this.f11411h.b(messageDigest);
        d6.i<Class<?>, byte[]> iVar = f11405j;
        byte[] a10 = iVar.a(this.f11410g);
        if (a10 == null) {
            a10 = this.f11410g.getName().getBytes(h5.b.f10146a);
            iVar.d(this.f11410g, a10);
        }
        messageDigest.update(a10);
        this.f11406b.d(bArr);
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f11409f == jVar.f11409f && this.f11408e == jVar.f11408e && d6.l.b(this.f11412i, jVar.f11412i) && this.f11410g.equals(jVar.f11410g) && this.f11407c.equals(jVar.f11407c) && this.d.equals(jVar.d) && this.f11411h.equals(jVar.f11411h);
        }
        return false;
    }

    @Override // h5.b
    public int hashCode() {
        int hashCode = ((((this.d.hashCode() + (this.f11407c.hashCode() * 31)) * 31) + this.f11408e) * 31) + this.f11409f;
        h5.g<?> gVar = this.f11412i;
        if (gVar != null) {
            hashCode = (hashCode * 31) + gVar.hashCode();
        }
        int hashCode2 = this.f11410g.hashCode();
        return this.f11411h.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ResourceCacheKey{sourceKey=");
        m10.append(this.f11407c);
        m10.append(", signature=");
        m10.append(this.d);
        m10.append(", width=");
        m10.append(this.f11408e);
        m10.append(", height=");
        m10.append(this.f11409f);
        m10.append(", decodedResourceClass=");
        m10.append(this.f11410g);
        m10.append(", transformation='");
        m10.append(this.f11412i);
        m10.append('\'');
        m10.append(", options=");
        m10.append(this.f11411h);
        m10.append('}');
        return m10.toString();
    }
}
