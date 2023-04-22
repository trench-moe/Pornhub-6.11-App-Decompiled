package xb;

import com.appsflyer.oaid.BuildConfig;
import xb.a0;

/* loaded from: classes2.dex */
public final class c extends a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f18211a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18212b;

    /* renamed from: c  reason: collision with root package name */
    public final int f18213c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final long f18214e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18215f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18216g;

    /* renamed from: h  reason: collision with root package name */
    public final String f18217h;

    /* loaded from: classes2.dex */
    public static final class b extends a0.a.AbstractC0295a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f18218a;

        /* renamed from: b  reason: collision with root package name */
        public String f18219b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f18220c;
        public Integer d;

        /* renamed from: e  reason: collision with root package name */
        public Long f18221e;

        /* renamed from: f  reason: collision with root package name */
        public Long f18222f;

        /* renamed from: g  reason: collision with root package name */
        public Long f18223g;

        /* renamed from: h  reason: collision with root package name */
        public String f18224h;

        public a0.a a() {
            String str = this.f18218a == null ? " pid" : BuildConfig.FLAVOR;
            if (this.f18219b == null) {
                str = a1.a.l(str, " processName");
            }
            if (this.f18220c == null) {
                str = a1.a.l(str, " reasonCode");
            }
            if (this.d == null) {
                str = a1.a.l(str, " importance");
            }
            if (this.f18221e == null) {
                str = a1.a.l(str, " pss");
            }
            if (this.f18222f == null) {
                str = a1.a.l(str, " rss");
            }
            if (this.f18223g == null) {
                str = a1.a.l(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.f18218a.intValue(), this.f18219b, this.f18220c.intValue(), this.d.intValue(), this.f18221e.longValue(), this.f18222f.longValue(), this.f18223g.longValue(), this.f18224h, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
    }

    public c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, a aVar) {
        this.f18211a = i10;
        this.f18212b = str;
        this.f18213c = i11;
        this.d = i12;
        this.f18214e = j10;
        this.f18215f = j11;
        this.f18216g = j12;
        this.f18217h = str2;
    }

    @Override // xb.a0.a
    public int a() {
        return this.d;
    }

    @Override // xb.a0.a
    public int b() {
        return this.f18211a;
    }

    @Override // xb.a0.a
    public String c() {
        return this.f18212b;
    }

    @Override // xb.a0.a
    public long d() {
        return this.f18214e;
    }

    @Override // xb.a0.a
    public int e() {
        return this.f18213c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.a) {
            a0.a aVar = (a0.a) obj;
            if (this.f18211a == aVar.b() && this.f18212b.equals(aVar.c()) && this.f18213c == aVar.e() && this.d == aVar.a() && this.f18214e == aVar.d() && this.f18215f == aVar.f() && this.f18216g == aVar.g()) {
                String str = this.f18217h;
                if (str == null) {
                    if (aVar.h() == null) {
                        return true;
                    }
                } else if (str.equals(aVar.h())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // xb.a0.a
    public long f() {
        return this.f18215f;
    }

    @Override // xb.a0.a
    public long g() {
        return this.f18216g;
    }

    @Override // xb.a0.a
    public String h() {
        return this.f18217h;
    }

    public int hashCode() {
        long j10 = this.f18214e;
        long j11 = this.f18215f;
        long j12 = this.f18216g;
        int hashCode = (((((((((((((this.f18211a ^ 1000003) * 1000003) ^ this.f18212b.hashCode()) * 1000003) ^ this.f18213c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f18217h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ApplicationExitInfo{pid=");
        m10.append(this.f18211a);
        m10.append(", processName=");
        m10.append(this.f18212b);
        m10.append(", reasonCode=");
        m10.append(this.f18213c);
        m10.append(", importance=");
        m10.append(this.d);
        m10.append(", pss=");
        m10.append(this.f18214e);
        m10.append(", rss=");
        m10.append(this.f18215f);
        m10.append(", timestamp=");
        m10.append(this.f18216g);
        m10.append(", traceFile=");
        return android.support.v4.media.b.m(m10, this.f18217h, "}");
    }
}
