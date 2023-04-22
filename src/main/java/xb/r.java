package xb;

import com.appsflyer.oaid.BuildConfig;
import xb.a0;

/* loaded from: classes2.dex */
public final class r extends a0.e.d.a.b.AbstractC0300d.AbstractC0301a {

    /* renamed from: a  reason: collision with root package name */
    public final long f18306a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18307b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18308c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18309e;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0300d.AbstractC0301a.AbstractC0302a {

        /* renamed from: a  reason: collision with root package name */
        public Long f18310a;

        /* renamed from: b  reason: collision with root package name */
        public String f18311b;

        /* renamed from: c  reason: collision with root package name */
        public String f18312c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f18313e;

        public a0.e.d.a.b.AbstractC0300d.AbstractC0301a a() {
            String str = this.f18310a == null ? " pc" : BuildConfig.FLAVOR;
            if (this.f18311b == null) {
                str = a1.a.l(str, " symbol");
            }
            if (this.d == null) {
                str = a1.a.l(str, " offset");
            }
            if (this.f18313e == null) {
                str = a1.a.l(str, " importance");
            }
            if (str.isEmpty()) {
                return new r(this.f18310a.longValue(), this.f18311b, this.f18312c, this.d.longValue(), this.f18313e.intValue(), null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
    }

    public r(long j10, String str, String str2, long j11, int i10, a aVar) {
        this.f18306a = j10;
        this.f18307b = str;
        this.f18308c = str2;
        this.d = j11;
        this.f18309e = i10;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d.AbstractC0301a
    public String a() {
        return this.f18308c;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d.AbstractC0301a
    public int b() {
        return this.f18309e;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d.AbstractC0301a
    public long c() {
        return this.d;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d.AbstractC0301a
    public long d() {
        return this.f18306a;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0300d.AbstractC0301a
    public String e() {
        return this.f18307b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0300d.AbstractC0301a) {
            a0.e.d.a.b.AbstractC0300d.AbstractC0301a abstractC0301a = (a0.e.d.a.b.AbstractC0300d.AbstractC0301a) obj;
            return this.f18306a == abstractC0301a.d() && this.f18307b.equals(abstractC0301a.e()) && ((str = this.f18308c) != null ? str.equals(abstractC0301a.a()) : abstractC0301a.a() == null) && this.d == abstractC0301a.c() && this.f18309e == abstractC0301a.b();
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f18306a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f18307b.hashCode()) * 1000003;
        String str = this.f18308c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.d;
        return this.f18309e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Frame{pc=");
        m10.append(this.f18306a);
        m10.append(", symbol=");
        m10.append(this.f18307b);
        m10.append(", file=");
        m10.append(this.f18308c);
        m10.append(", offset=");
        m10.append(this.d);
        m10.append(", importance=");
        return android.support.v4.media.a.j(m10, this.f18309e, "}");
    }
}
