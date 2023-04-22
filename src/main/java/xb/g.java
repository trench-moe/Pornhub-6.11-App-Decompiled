package xb;

import com.appsflyer.oaid.BuildConfig;
import xb.a0;

/* loaded from: classes2.dex */
public final class g extends a0.e {

    /* renamed from: a  reason: collision with root package name */
    public final String f18231a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18232b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18233c;
    public final Long d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f18234e;

    /* renamed from: f  reason: collision with root package name */
    public final a0.e.a f18235f;

    /* renamed from: g  reason: collision with root package name */
    public final a0.e.f f18236g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e.AbstractC0304e f18237h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.e.c f18238i;

    /* renamed from: j  reason: collision with root package name */
    public final b0<a0.e.d> f18239j;

    /* renamed from: k  reason: collision with root package name */
    public final int f18240k;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.b {

        /* renamed from: a  reason: collision with root package name */
        public String f18241a;

        /* renamed from: b  reason: collision with root package name */
        public String f18242b;

        /* renamed from: c  reason: collision with root package name */
        public Long f18243c;
        public Long d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f18244e;

        /* renamed from: f  reason: collision with root package name */
        public a0.e.a f18245f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e.f f18246g;

        /* renamed from: h  reason: collision with root package name */
        public a0.e.AbstractC0304e f18247h;

        /* renamed from: i  reason: collision with root package name */
        public a0.e.c f18248i;

        /* renamed from: j  reason: collision with root package name */
        public b0<a0.e.d> f18249j;

        /* renamed from: k  reason: collision with root package name */
        public Integer f18250k;

        public b() {
        }

        public b(a0.e eVar, a aVar) {
            g gVar = (g) eVar;
            this.f18241a = gVar.f18231a;
            this.f18242b = gVar.f18232b;
            this.f18243c = Long.valueOf(gVar.f18233c);
            this.d = gVar.d;
            this.f18244e = Boolean.valueOf(gVar.f18234e);
            this.f18245f = gVar.f18235f;
            this.f18246g = gVar.f18236g;
            this.f18247h = gVar.f18237h;
            this.f18248i = gVar.f18238i;
            this.f18249j = gVar.f18239j;
            this.f18250k = Integer.valueOf(gVar.f18240k);
        }

        @Override // xb.a0.e.b
        public a0.e a() {
            String str = this.f18241a == null ? " generator" : BuildConfig.FLAVOR;
            if (this.f18242b == null) {
                str = a1.a.l(str, " identifier");
            }
            if (this.f18243c == null) {
                str = a1.a.l(str, " startedAt");
            }
            if (this.f18244e == null) {
                str = a1.a.l(str, " crashed");
            }
            if (this.f18245f == null) {
                str = a1.a.l(str, " app");
            }
            if (this.f18250k == null) {
                str = a1.a.l(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new g(this.f18241a, this.f18242b, this.f18243c.longValue(), this.d, this.f18244e.booleanValue(), this.f18245f, this.f18246g, this.f18247h, this.f18248i, this.f18249j, this.f18250k.intValue(), null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }

        public a0.e.b b(boolean z10) {
            this.f18244e = Boolean.valueOf(z10);
            return this;
        }
    }

    public g(String str, String str2, long j10, Long l10, boolean z10, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0304e abstractC0304e, a0.e.c cVar, b0 b0Var, int i10, a aVar2) {
        this.f18231a = str;
        this.f18232b = str2;
        this.f18233c = j10;
        this.d = l10;
        this.f18234e = z10;
        this.f18235f = aVar;
        this.f18236g = fVar;
        this.f18237h = abstractC0304e;
        this.f18238i = cVar;
        this.f18239j = b0Var;
        this.f18240k = i10;
    }

    @Override // xb.a0.e
    public a0.e.a a() {
        return this.f18235f;
    }

    @Override // xb.a0.e
    public a0.e.c b() {
        return this.f18238i;
    }

    @Override // xb.a0.e
    public Long c() {
        return this.d;
    }

    @Override // xb.a0.e
    public b0<a0.e.d> d() {
        return this.f18239j;
    }

    @Override // xb.a0.e
    public String e() {
        return this.f18231a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r1.equals(r10.h()) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
        if (r1.equals(r10.b()) != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.g.equals(java.lang.Object):boolean");
    }

    @Override // xb.a0.e
    public int f() {
        return this.f18240k;
    }

    @Override // xb.a0.e
    public String g() {
        return this.f18232b;
    }

    @Override // xb.a0.e
    public a0.e.AbstractC0304e h() {
        return this.f18237h;
    }

    public int hashCode() {
        long j10 = this.f18233c;
        int hashCode = (((((this.f18231a.hashCode() ^ 1000003) * 1000003) ^ this.f18232b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.d;
        int hashCode2 = (((((hashCode ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f18234e ? 1231 : 1237)) * 1000003) ^ this.f18235f.hashCode()) * 1000003;
        a0.e.f fVar = this.f18236g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0304e abstractC0304e = this.f18237h;
        int hashCode4 = (hashCode3 ^ (abstractC0304e == null ? 0 : abstractC0304e.hashCode())) * 1000003;
        a0.e.c cVar = this.f18238i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f18239j;
        return ((hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0)) * 1000003) ^ this.f18240k;
    }

    @Override // xb.a0.e
    public long i() {
        return this.f18233c;
    }

    @Override // xb.a0.e
    public a0.e.f j() {
        return this.f18236g;
    }

    @Override // xb.a0.e
    public boolean k() {
        return this.f18234e;
    }

    @Override // xb.a0.e
    public a0.e.b l() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Session{generator=");
        m10.append(this.f18231a);
        m10.append(", identifier=");
        m10.append(this.f18232b);
        m10.append(", startedAt=");
        m10.append(this.f18233c);
        m10.append(", endedAt=");
        m10.append(this.d);
        m10.append(", crashed=");
        m10.append(this.f18234e);
        m10.append(", app=");
        m10.append(this.f18235f);
        m10.append(", user=");
        m10.append(this.f18236g);
        m10.append(", os=");
        m10.append(this.f18237h);
        m10.append(", device=");
        m10.append(this.f18238i);
        m10.append(", events=");
        m10.append(this.f18239j);
        m10.append(", generatorType=");
        return android.support.v4.media.a.j(m10, this.f18240k, "}");
    }
}
