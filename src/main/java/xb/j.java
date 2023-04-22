package xb;

import com.appsflyer.oaid.BuildConfig;
import xb.a0;

/* loaded from: classes2.dex */
public final class j extends a0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f18257a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18258b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18259c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18260e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f18261f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18262g;

    /* renamed from: h  reason: collision with root package name */
    public final String f18263h;

    /* renamed from: i  reason: collision with root package name */
    public final String f18264i;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f18265a;

        /* renamed from: b  reason: collision with root package name */
        public String f18266b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f18267c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Long f18268e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f18269f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f18270g;

        /* renamed from: h  reason: collision with root package name */
        public String f18271h;

        /* renamed from: i  reason: collision with root package name */
        public String f18272i;

        public a0.e.c a() {
            String str = this.f18265a == null ? " arch" : BuildConfig.FLAVOR;
            if (this.f18266b == null) {
                str = a1.a.l(str, " model");
            }
            if (this.f18267c == null) {
                str = a1.a.l(str, " cores");
            }
            if (this.d == null) {
                str = a1.a.l(str, " ram");
            }
            if (this.f18268e == null) {
                str = a1.a.l(str, " diskSpace");
            }
            if (this.f18269f == null) {
                str = a1.a.l(str, " simulator");
            }
            if (this.f18270g == null) {
                str = a1.a.l(str, " state");
            }
            if (this.f18271h == null) {
                str = a1.a.l(str, " manufacturer");
            }
            if (this.f18272i == null) {
                str = a1.a.l(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new j(this.f18265a.intValue(), this.f18266b, this.f18267c.intValue(), this.d.longValue(), this.f18268e.longValue(), this.f18269f.booleanValue(), this.f18270g.intValue(), this.f18271h, this.f18272i, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
    }

    public j(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3, a aVar) {
        this.f18257a = i10;
        this.f18258b = str;
        this.f18259c = i11;
        this.d = j10;
        this.f18260e = j11;
        this.f18261f = z10;
        this.f18262g = i12;
        this.f18263h = str2;
        this.f18264i = str3;
    }

    @Override // xb.a0.e.c
    public int a() {
        return this.f18257a;
    }

    @Override // xb.a0.e.c
    public int b() {
        return this.f18259c;
    }

    @Override // xb.a0.e.c
    public long c() {
        return this.f18260e;
    }

    @Override // xb.a0.e.c
    public String d() {
        return this.f18263h;
    }

    @Override // xb.a0.e.c
    public String e() {
        return this.f18258b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.c) {
            a0.e.c cVar = (a0.e.c) obj;
            return this.f18257a == cVar.a() && this.f18258b.equals(cVar.e()) && this.f18259c == cVar.b() && this.d == cVar.g() && this.f18260e == cVar.c() && this.f18261f == cVar.i() && this.f18262g == cVar.h() && this.f18263h.equals(cVar.d()) && this.f18264i.equals(cVar.f());
        }
        return false;
    }

    @Override // xb.a0.e.c
    public String f() {
        return this.f18264i;
    }

    @Override // xb.a0.e.c
    public long g() {
        return this.d;
    }

    @Override // xb.a0.e.c
    public int h() {
        return this.f18262g;
    }

    public int hashCode() {
        long j10 = this.d;
        long j11 = this.f18260e;
        return ((((((((((((((((this.f18257a ^ 1000003) * 1000003) ^ this.f18258b.hashCode()) * 1000003) ^ this.f18259c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f18261f ? 1231 : 1237)) * 1000003) ^ this.f18262g) * 1000003) ^ this.f18263h.hashCode()) * 1000003) ^ this.f18264i.hashCode();
    }

    @Override // xb.a0.e.c
    public boolean i() {
        return this.f18261f;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Device{arch=");
        m10.append(this.f18257a);
        m10.append(", model=");
        m10.append(this.f18258b);
        m10.append(", cores=");
        m10.append(this.f18259c);
        m10.append(", ram=");
        m10.append(this.d);
        m10.append(", diskSpace=");
        m10.append(this.f18260e);
        m10.append(", simulator=");
        m10.append(this.f18261f);
        m10.append(", state=");
        m10.append(this.f18262g);
        m10.append(", manufacturer=");
        m10.append(this.f18263h);
        m10.append(", modelClass=");
        return android.support.v4.media.b.m(m10, this.f18264i, "}");
    }
}
