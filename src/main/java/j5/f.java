package j5;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f implements h5.b {

    /* renamed from: b  reason: collision with root package name */
    public final Object f11393b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11394c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f11395e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f11396f;

    /* renamed from: g  reason: collision with root package name */
    public final h5.b f11397g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, h5.g<?>> f11398h;

    /* renamed from: i  reason: collision with root package name */
    public final h5.d f11399i;

    /* renamed from: j  reason: collision with root package name */
    public int f11400j;

    public f(Object obj, h5.b bVar, int i10, int i11, Map<Class<?>, h5.g<?>> map, Class<?> cls, Class<?> cls2, h5.d dVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f11393b = obj;
        Objects.requireNonNull(bVar, "Signature must not be null");
        this.f11397g = bVar;
        this.f11394c = i10;
        this.d = i11;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f11398h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f11395e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f11396f = cls2;
        Objects.requireNonNull(dVar, "Argument must not be null");
        this.f11399i = dVar;
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f11393b.equals(fVar.f11393b) && this.f11397g.equals(fVar.f11397g) && this.d == fVar.d && this.f11394c == fVar.f11394c && this.f11398h.equals(fVar.f11398h) && this.f11395e.equals(fVar.f11395e) && this.f11396f.equals(fVar.f11396f) && this.f11399i.equals(fVar.f11399i)) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // h5.b
    public int hashCode() {
        if (this.f11400j == 0) {
            int hashCode = this.f11393b.hashCode();
            this.f11400j = hashCode;
            int hashCode2 = this.f11397g.hashCode() + (hashCode * 31);
            this.f11400j = hashCode2;
            int i10 = (hashCode2 * 31) + this.f11394c;
            this.f11400j = i10;
            int i11 = (i10 * 31) + this.d;
            this.f11400j = i11;
            int hashCode3 = this.f11398h.hashCode() + (i11 * 31);
            this.f11400j = hashCode3;
            int hashCode4 = this.f11395e.hashCode() + (hashCode3 * 31);
            this.f11400j = hashCode4;
            int hashCode5 = this.f11396f.hashCode() + (hashCode4 * 31);
            this.f11400j = hashCode5;
            this.f11400j = this.f11399i.hashCode() + (hashCode5 * 31);
        }
        return this.f11400j;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("EngineKey{model=");
        m10.append(this.f11393b);
        m10.append(", width=");
        m10.append(this.f11394c);
        m10.append(", height=");
        m10.append(this.d);
        m10.append(", resourceClass=");
        m10.append(this.f11395e);
        m10.append(", transcodeClass=");
        m10.append(this.f11396f);
        m10.append(", signature=");
        m10.append(this.f11397g);
        m10.append(", hashCode=");
        m10.append(this.f11400j);
        m10.append(", transformations=");
        m10.append(this.f11398h);
        m10.append(", options=");
        m10.append(this.f11399i);
        m10.append('}');
        return m10.toString();
    }
}
