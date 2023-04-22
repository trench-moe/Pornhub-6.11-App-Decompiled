package io.realm;

import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import io.realm.a;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Table;

/* loaded from: classes2.dex */
public class b0 extends r3.d implements io.realm.internal.l {

    /* renamed from: u  reason: collision with root package name */
    public static final OsObjectSchemaInfo f10837u;

    /* renamed from: s  reason: collision with root package name */
    public a f10838s;

    /* renamed from: t  reason: collision with root package name */
    public n<r3.d> f10839t;

    /* loaded from: classes2.dex */
    public static final class a extends io.realm.internal.c {

        /* renamed from: e  reason: collision with root package name */
        public long f10840e;

        /* renamed from: f  reason: collision with root package name */
        public long f10841f;

        /* renamed from: g  reason: collision with root package name */
        public long f10842g;

        /* renamed from: h  reason: collision with root package name */
        public long f10843h;

        /* renamed from: i  reason: collision with root package name */
        public long f10844i;

        /* renamed from: j  reason: collision with root package name */
        public long f10845j;

        /* renamed from: k  reason: collision with root package name */
        public long f10846k;

        /* renamed from: l  reason: collision with root package name */
        public long f10847l;

        /* renamed from: m  reason: collision with root package name */
        public long f10848m;
        public long n;

        /* renamed from: o  reason: collision with root package name */
        public long f10849o;

        /* renamed from: p  reason: collision with root package name */
        public long f10850p;

        /* renamed from: q  reason: collision with root package name */
        public long f10851q;

        /* renamed from: r  reason: collision with root package name */
        public long f10852r;

        /* renamed from: s  reason: collision with root package name */
        public long f10853s;

        /* renamed from: t  reason: collision with root package name */
        public long f10854t;

        /* renamed from: u  reason: collision with root package name */
        public long f10855u;

        /* renamed from: v  reason: collision with root package name */
        public long f10856v;

        public a(OsSchemaInfo osSchemaInfo) {
            super(18, true);
            OsObjectSchemaInfo a10 = osSchemaInfo.a("RealmVideo");
            this.f10840e = a("id", "id", a10);
            this.f10841f = a("vkey", "vkey", a10);
            this.f10842g = a("title", "title", a10);
            this.f10843h = a("duration", "duration", a10);
            this.f10844i = a("rating", "rating", a10);
            this.f10845j = a("viewCount", "viewCount", a10);
            this.f10846k = a("commentsCount", "commentsCount", a10);
            this.f10847l = a("approvedOn", "approvedOn", a10);
            this.f10848m = a("urlThumbnail", "urlThumbnail", a10);
            this.n = a("urlVideo", "urlVideo", a10);
            this.f10849o = a(DvdsConfig.TYPE_QUALITY, DvdsConfig.TYPE_QUALITY, a10);
            this.f10850p = a("videoContentTypeCode", "videoContentTypeCode", a10);
            this.f10851q = a("vr", "vr", a10);
            this.f10852r = a("status", "status", a10);
            this.f10853s = a("progress", "progress", a10);
            this.f10854t = a("createdAt", "createdAt", a10);
            this.f10855u = a("uploaderName", "uploaderName", a10);
            this.f10856v = a("uploaderType", "uploaderType", a10);
        }

        @Override // io.realm.internal.c
        public final void b(io.realm.internal.c cVar, io.realm.internal.c cVar2) {
            a aVar = (a) cVar;
            a aVar2 = (a) cVar2;
            aVar2.f10840e = aVar.f10840e;
            aVar2.f10841f = aVar.f10841f;
            aVar2.f10842g = aVar.f10842g;
            aVar2.f10843h = aVar.f10843h;
            aVar2.f10844i = aVar.f10844i;
            aVar2.f10845j = aVar.f10845j;
            aVar2.f10846k = aVar.f10846k;
            aVar2.f10847l = aVar.f10847l;
            aVar2.f10848m = aVar.f10848m;
            aVar2.n = aVar.n;
            aVar2.f10849o = aVar.f10849o;
            aVar2.f10850p = aVar.f10850p;
            aVar2.f10851q = aVar.f10851q;
            aVar2.f10852r = aVar.f10852r;
            aVar2.f10853s = aVar.f10853s;
            aVar2.f10854t = aVar.f10854t;
            aVar2.f10855u = aVar.f10855u;
            aVar2.f10856v = aVar.f10856v;
        }
    }

    static {
        OsObjectSchemaInfo.b bVar = new OsObjectSchemaInfo.b(BuildConfig.FLAVOR, "RealmVideo", false, 18, 0);
        RealmFieldType realmFieldType = RealmFieldType.STRING;
        bVar.a(BuildConfig.FLAVOR, "id", realmFieldType, false, false, false);
        bVar.a(BuildConfig.FLAVOR, "vkey", realmFieldType, true, false, false);
        bVar.a(BuildConfig.FLAVOR, "title", realmFieldType, false, false, false);
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        bVar.a(BuildConfig.FLAVOR, "duration", realmFieldType2, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "rating", RealmFieldType.DOUBLE, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "viewCount", realmFieldType2, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "commentsCount", realmFieldType2, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "approvedOn", realmFieldType2, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "urlThumbnail", realmFieldType, false, false, false);
        bVar.a(BuildConfig.FLAVOR, "urlVideo", realmFieldType, false, false, false);
        RealmFieldType realmFieldType3 = RealmFieldType.BOOLEAN;
        bVar.a(BuildConfig.FLAVOR, DvdsConfig.TYPE_QUALITY, realmFieldType3, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "videoContentTypeCode", realmFieldType2, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "vr", realmFieldType3, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "status", realmFieldType, false, false, false);
        bVar.a(BuildConfig.FLAVOR, "progress", realmFieldType2, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "createdAt", realmFieldType2, false, false, true);
        bVar.a(BuildConfig.FLAVOR, "uploaderName", realmFieldType, false, false, false);
        bVar.a(BuildConfig.FLAVOR, "uploaderType", realmFieldType, false, false, false);
        if (bVar.f10879b == -1 || bVar.d == -1) {
            throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
        }
        OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(BuildConfig.FLAVOR, "RealmVideo", false, null);
        OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.f10877c, bVar.f10878a, bVar.f10880c);
        bVar.f10879b = -1;
        bVar.d = -1;
        f10837u = osObjectSchemaInfo;
    }

    public b0() {
        this.f10839t.f10982b = false;
    }

    @Override // r3.d
    public void A(long j10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.l(this.f10838s.f10854t, j10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().r(this.f10838s.f10854t, nVar2.y(), j10, true);
        }
    }

    @Override // r3.d
    public void B(int i10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.l(this.f10838s.f10843h, i10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().r(this.f10838s.f10843h, nVar2.y(), i10, true);
        }
    }

    @Override // r3.d
    public void C(boolean z10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.e(this.f10838s.f10849o, z10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            Table d = nVar2.d();
            long j10 = this.f10838s.f10849o;
            long y = nVar2.y();
            d.c();
            Table.nativeSetBoolean(d.f10927c, j10, y, z10, true);
        }
    }

    @Override // r3.d
    public void D(String str) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            if (str == null) {
                this.f10839t.f10983c.q(this.f10838s.f10840e);
            } else {
                this.f10839t.f10983c.c(this.f10838s.f10840e, str);
            }
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            if (str == null) {
                nVar2.d().s(this.f10838s.f10840e, nVar2.y(), true);
            } else {
                nVar2.d().t(this.f10838s.f10840e, nVar2.y(), str, true);
            }
        }
    }

    @Override // r3.d
    public void E(int i10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.l(this.f10838s.f10853s, i10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().r(this.f10838s.f10853s, nVar2.y(), i10, true);
        }
    }

    @Override // r3.d
    public void F(double d) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.x(this.f10838s.f10844i, d);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            Table d10 = nVar2.d();
            long j10 = this.f10838s.f10844i;
            long y = nVar2.y();
            d10.c();
            Table.nativeSetDouble(d10.f10927c, j10, y, d, true);
        }
    }

    @Override // r3.d
    public void G(String str) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.c(this.f10838s.f10852r, str);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().t(this.f10838s.f10852r, nVar2.y(), str, true);
        }
    }

    @Override // r3.d
    public void H(String str) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            if (str == null) {
                this.f10839t.f10983c.q(this.f10838s.f10842g);
            } else {
                this.f10839t.f10983c.c(this.f10838s.f10842g, str);
            }
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            if (str == null) {
                nVar2.d().s(this.f10838s.f10842g, nVar2.y(), true);
            } else {
                nVar2.d().t(this.f10838s.f10842g, nVar2.y(), str, true);
            }
        }
    }

    @Override // r3.d
    public void I(String str) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            if (str == null) {
                this.f10839t.f10983c.q(this.f10838s.f10855u);
            } else {
                this.f10839t.f10983c.c(this.f10838s.f10855u, str);
            }
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            if (str == null) {
                nVar2.d().s(this.f10838s.f10855u, nVar2.y(), true);
            } else {
                nVar2.d().t(this.f10838s.f10855u, nVar2.y(), str, true);
            }
        }
    }

    @Override // r3.d
    public void J(String str) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.c(this.f10838s.f10856v, str);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().t(this.f10838s.f10856v, nVar2.y(), str, true);
        }
    }

    @Override // r3.d
    public void K(String str) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            if (str == null) {
                this.f10839t.f10983c.q(this.f10838s.f10848m);
            } else {
                this.f10839t.f10983c.c(this.f10838s.f10848m, str);
            }
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            if (str == null) {
                nVar2.d().s(this.f10838s.f10848m, nVar2.y(), true);
            } else {
                nVar2.d().t(this.f10838s.f10848m, nVar2.y(), str, true);
            }
        }
    }

    @Override // r3.d
    public void L(String str) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            if (str == null) {
                this.f10839t.f10983c.q(this.f10838s.n);
            } else {
                this.f10839t.f10983c.c(this.f10838s.n, str);
            }
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            if (str == null) {
                nVar2.d().s(this.f10838s.n, nVar2.y(), true);
            } else {
                nVar2.d().t(this.f10838s.n, nVar2.y(), str, true);
            }
        }
    }

    @Override // r3.d
    public void M(short s10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.l(this.f10838s.f10850p, s10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().r(this.f10838s.f10850p, nVar2.y(), s10, true);
        }
    }

    @Override // r3.d
    public void N(int i10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.l(this.f10838s.f10845j, i10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().r(this.f10838s.f10845j, nVar2.y(), i10, true);
        }
    }

    @Override // r3.d
    public void O(String str) {
        n<r3.d> nVar = this.f10839t;
        if (nVar.f10982b) {
            return;
        }
        nVar.d.e();
        throw new RealmException("Primary key field 'vkey' cannot be changed after object was created.");
    }

    @Override // r3.d
    public void P(boolean z10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.e(this.f10838s.f10851q, z10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            Table d = nVar2.d();
            long j10 = this.f10838s.f10851q;
            long y = nVar2.y();
            d.c();
            Table.nativeSetBoolean(d.f10927c, j10, y, z10, true);
        }
    }

    @Override // r3.d, io.realm.c0
    public long a() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.j(this.f10838s.f10854t);
    }

    @Override // r3.d, io.realm.c0
    public String b() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.f10852r);
    }

    @Override // r3.d, io.realm.c0
    public int c() {
        this.f10839t.d.e();
        return (int) this.f10839t.f10983c.j(this.f10838s.f10843h);
    }

    @Override // r3.d, io.realm.c0
    public int d() {
        this.f10839t.d.e();
        return (int) this.f10839t.f10983c.j(this.f10838s.f10853s);
    }

    @Override // r3.d, io.realm.c0
    public boolean e() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.i(this.f10838s.f10849o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        io.realm.a aVar = this.f10839t.d;
        io.realm.a aVar2 = b0Var.f10839t.d;
        String str = aVar.f10823j.f11005c;
        String str2 = aVar2.f10823j.f11005c;
        if (str == null ? str2 == null : str.equals(str2)) {
            if (aVar.m() == aVar2.m() && aVar.n.getVersionID().equals(aVar2.n.getVersionID())) {
                String k10 = this.f10839t.f10983c.d().k();
                String k11 = b0Var.f10839t.f10983c.d().k();
                if (k10 == null ? k11 == null : k10.equals(k11)) {
                    return this.f10839t.f10983c.y() == b0Var.f10839t.f10983c.y();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // r3.d, io.realm.c0
    public long f() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.j(this.f10838s.f10847l);
    }

    @Override // r3.d, io.realm.c0
    public String g() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.f10855u);
    }

    @Override // r3.d, io.realm.c0
    public int h() {
        this.f10839t.d.e();
        return (int) this.f10839t.f10983c.j(this.f10838s.f10845j);
    }

    public int hashCode() {
        n<r3.d> nVar = this.f10839t;
        String str = nVar.d.f10823j.f11005c;
        String k10 = nVar.f10983c.d().k();
        long y = this.f10839t.f10983c.y();
        return ((((527 + (str != null ? str.hashCode() : 0)) * 31) + (k10 != null ? k10.hashCode() : 0)) * 31) + ((int) ((y >>> 32) ^ y));
    }

    @Override // r3.d, io.realm.c0
    public short i() {
        this.f10839t.d.e();
        return (short) this.f10839t.f10983c.j(this.f10838s.f10850p);
    }

    @Override // io.realm.internal.l
    public void j() {
        if (this.f10839t != null) {
            return;
        }
        a.b bVar = io.realm.a.f10820z.get();
        this.f10838s = (a) bVar.f10830c;
        n<r3.d> nVar = new n<>(this);
        this.f10839t = nVar;
        nVar.d = bVar.f10828a;
        nVar.f10983c = bVar.f10829b;
        nVar.f10984e = bVar.d;
        nVar.f10985f = bVar.f10831e;
    }

    @Override // r3.d, io.realm.c0
    public String k() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.f10856v);
    }

    @Override // r3.d, io.realm.c0
    public boolean l() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.i(this.f10838s.f10851q);
    }

    @Override // r3.d, io.realm.c0
    public String m() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.f10842g);
    }

    @Override // r3.d, io.realm.c0
    public String n() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.f10848m);
    }

    @Override // io.realm.internal.l
    public n<?> o() {
        return this.f10839t;
    }

    @Override // r3.d, io.realm.c0
    public String p() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.f10841f);
    }

    @Override // r3.d, io.realm.c0
    public int q() {
        this.f10839t.d.e();
        return (int) this.f10839t.f10983c.j(this.f10838s.f10846k);
    }

    @Override // r3.d, io.realm.c0
    public String r() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.f10840e);
    }

    @Override // r3.d, io.realm.c0
    public double s() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.s(this.f10838s.f10844i);
    }

    @Override // r3.d, io.realm.c0
    public String t() {
        this.f10839t.d.e();
        return this.f10839t.f10983c.u(this.f10838s.n);
    }

    public String toString() {
        if (v.w(this)) {
            StringBuilder sb2 = new StringBuilder("RealmVideo = proxy[");
            sb2.append("{id:");
            android.support.v4.media.a.o(sb2, r() != null ? r() : "null", "}", ",", "{vkey:");
            android.support.v4.media.a.o(sb2, p() != null ? p() : "null", "}", ",", "{title:");
            android.support.v4.media.a.o(sb2, m() != null ? m() : "null", "}", ",", "{duration:");
            sb2.append(c());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{rating:");
            sb2.append(s());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{viewCount:");
            sb2.append(h());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{commentsCount:");
            sb2.append(q());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{approvedOn:");
            sb2.append(f());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{urlThumbnail:");
            android.support.v4.media.a.o(sb2, n() != null ? n() : "null", "}", ",", "{urlVideo:");
            android.support.v4.media.a.o(sb2, t() != null ? t() : "null", "}", ",", "{hd:");
            sb2.append(e());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{videoContentTypeCode:");
            sb2.append((int) i());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{vr:");
            sb2.append(l());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{status:");
            android.support.v4.media.a.o(sb2, b() != null ? b() : "null", "}", ",", "{progress:");
            sb2.append(d());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{createdAt:");
            sb2.append(a());
            sb2.append("}");
            sb2.append(",");
            sb2.append("{uploaderName:");
            android.support.v4.media.a.o(sb2, g() != null ? g() : "null", "}", ",", "{uploaderType:");
            return android.support.v4.media.b.n(sb2, k() != null ? k() : "null", "}", "]");
        }
        return "Invalid object";
    }

    @Override // r3.d
    public void y(long j10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.l(this.f10838s.f10847l, j10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().r(this.f10838s.f10847l, nVar2.y(), j10, true);
        }
    }

    @Override // r3.d
    public void z(int i10) {
        n<r3.d> nVar = this.f10839t;
        if (!nVar.f10982b) {
            nVar.d.e();
            this.f10839t.f10983c.l(this.f10838s.f10846k, i10);
        } else if (nVar.f10984e) {
            io.realm.internal.n nVar2 = nVar.f10983c;
            nVar2.d().r(this.f10838s.f10846k, nVar2.y(), i10, true);
        }
    }
}
