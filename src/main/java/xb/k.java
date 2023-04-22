package xb;

import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import xb.a0;

/* loaded from: classes2.dex */
public final class k extends a0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f18273a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18274b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.e.d.a f18275c;
    public final a0.e.d.c d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.e.d.AbstractC0303d f18276e;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f18277a;

        /* renamed from: b  reason: collision with root package name */
        public String f18278b;

        /* renamed from: c  reason: collision with root package name */
        public a0.e.d.a f18279c;
        public a0.e.d.c d;

        /* renamed from: e  reason: collision with root package name */
        public a0.e.d.AbstractC0303d f18280e;

        public b() {
        }

        public b(a0.e.d dVar, a aVar) {
            k kVar = (k) dVar;
            this.f18277a = Long.valueOf(kVar.f18273a);
            this.f18278b = kVar.f18274b;
            this.f18279c = kVar.f18275c;
            this.d = kVar.d;
            this.f18280e = kVar.f18276e;
        }

        @Override // xb.a0.e.d.b
        public a0.e.d a() {
            String str = this.f18277a == null ? " timestamp" : BuildConfig.FLAVOR;
            if (this.f18278b == null) {
                str = a1.a.l(str, " type");
            }
            if (this.f18279c == null) {
                str = a1.a.l(str, " app");
            }
            if (this.d == null) {
                str = a1.a.l(str, " device");
            }
            if (str.isEmpty()) {
                return new k(this.f18277a.longValue(), this.f18278b, this.f18279c, this.d, this.f18280e, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }

        public a0.e.d.b b(a0.e.d.a aVar) {
            this.f18279c = aVar;
            return this;
        }

        public a0.e.d.b c(a0.e.d.c cVar) {
            this.d = cVar;
            return this;
        }

        public a0.e.d.b d(long j10) {
            this.f18277a = Long.valueOf(j10);
            return this;
        }

        public a0.e.d.b e(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f18278b = str;
            return this;
        }
    }

    public k(long j10, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0303d abstractC0303d, a aVar2) {
        this.f18273a = j10;
        this.f18274b = str;
        this.f18275c = aVar;
        this.d = cVar;
        this.f18276e = abstractC0303d;
    }

    @Override // xb.a0.e.d
    public a0.e.d.a a() {
        return this.f18275c;
    }

    @Override // xb.a0.e.d
    public a0.e.d.c b() {
        return this.d;
    }

    @Override // xb.a0.e.d
    public a0.e.d.AbstractC0303d c() {
        return this.f18276e;
    }

    @Override // xb.a0.e.d
    public long d() {
        return this.f18273a;
    }

    @Override // xb.a0.e.d
    public String e() {
        return this.f18274b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d) {
            a0.e.d dVar = (a0.e.d) obj;
            if (this.f18273a == dVar.d() && this.f18274b.equals(dVar.e()) && this.f18275c.equals(dVar.a()) && this.d.equals(dVar.b())) {
                a0.e.d.AbstractC0303d abstractC0303d = this.f18276e;
                if (abstractC0303d == null) {
                    if (dVar.c() == null) {
                        return true;
                    }
                } else if (abstractC0303d.equals(dVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // xb.a0.e.d
    public a0.e.d.b f() {
        return new b(this, null);
    }

    public int hashCode() {
        long j10 = this.f18273a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f18274b.hashCode()) * 1000003) ^ this.f18275c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        a0.e.d.AbstractC0303d abstractC0303d = this.f18276e;
        return (abstractC0303d == null ? 0 : abstractC0303d.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Event{timestamp=");
        m10.append(this.f18273a);
        m10.append(", type=");
        m10.append(this.f18274b);
        m10.append(", app=");
        m10.append(this.f18275c);
        m10.append(", device=");
        m10.append(this.d);
        m10.append(", log=");
        m10.append(this.f18276e);
        m10.append("}");
        return m10.toString();
    }
}
