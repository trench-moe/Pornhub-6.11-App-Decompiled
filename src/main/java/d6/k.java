package d6;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f8800a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f8801b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f8802c;

    public k() {
    }

    public k(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f8800a = cls;
        this.f8801b = cls2;
        this.f8802c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            return this.f8800a.equals(kVar.f8800a) && this.f8801b.equals(kVar.f8801b) && l.b(this.f8802c, kVar.f8802c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f8801b.hashCode() + (this.f8800a.hashCode() * 31)) * 31;
        Class<?> cls = this.f8802c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("MultiClassKey{first=");
        m10.append(this.f8800a);
        m10.append(", second=");
        m10.append(this.f8801b);
        m10.append('}');
        return m10.toString();
    }
}
