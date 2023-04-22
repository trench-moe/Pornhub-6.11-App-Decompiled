package xb;

import com.appsflyer.oaid.BuildConfig;
import xb.a0;

/* loaded from: classes2.dex */
public final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    public final String f18196b;

    /* renamed from: c  reason: collision with root package name */
    public final String f18197c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18198e;

    /* renamed from: f  reason: collision with root package name */
    public final String f18199f;

    /* renamed from: g  reason: collision with root package name */
    public final String f18200g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.e f18201h;

    /* renamed from: i  reason: collision with root package name */
    public final a0.d f18202i;

    /* renamed from: xb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0305b extends a0.b {

        /* renamed from: a  reason: collision with root package name */
        public String f18203a;

        /* renamed from: b  reason: collision with root package name */
        public String f18204b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f18205c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public String f18206e;

        /* renamed from: f  reason: collision with root package name */
        public String f18207f;

        /* renamed from: g  reason: collision with root package name */
        public a0.e f18208g;

        /* renamed from: h  reason: collision with root package name */
        public a0.d f18209h;

        public C0305b() {
        }

        public C0305b(a0 a0Var, a aVar) {
            b bVar = (b) a0Var;
            this.f18203a = bVar.f18196b;
            this.f18204b = bVar.f18197c;
            this.f18205c = Integer.valueOf(bVar.d);
            this.d = bVar.f18198e;
            this.f18206e = bVar.f18199f;
            this.f18207f = bVar.f18200g;
            this.f18208g = bVar.f18201h;
            this.f18209h = bVar.f18202i;
        }

        @Override // xb.a0.b
        public a0 a() {
            String str = this.f18203a == null ? " sdkVersion" : BuildConfig.FLAVOR;
            if (this.f18204b == null) {
                str = a1.a.l(str, " gmpAppId");
            }
            if (this.f18205c == null) {
                str = a1.a.l(str, " platform");
            }
            if (this.d == null) {
                str = a1.a.l(str, " installationUuid");
            }
            if (this.f18206e == null) {
                str = a1.a.l(str, " buildVersion");
            }
            if (this.f18207f == null) {
                str = a1.a.l(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.f18203a, this.f18204b, this.f18205c.intValue(), this.d, this.f18206e, this.f18207f, this.f18208g, this.f18209h, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
    }

    public b(String str, String str2, int i10, String str3, String str4, String str5, a0.e eVar, a0.d dVar, a aVar) {
        this.f18196b = str;
        this.f18197c = str2;
        this.d = i10;
        this.f18198e = str3;
        this.f18199f = str4;
        this.f18200g = str5;
        this.f18201h = eVar;
        this.f18202i = dVar;
    }

    @Override // xb.a0
    public String a() {
        return this.f18199f;
    }

    @Override // xb.a0
    public String b() {
        return this.f18200g;
    }

    @Override // xb.a0
    public String c() {
        return this.f18197c;
    }

    @Override // xb.a0
    public String d() {
        return this.f18198e;
    }

    @Override // xb.a0
    public a0.d e() {
        return this.f18202i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r9.h() == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r4 = r8
            r7 = 1
            r0 = r7
            if (r9 != r4) goto L6
            return r0
        L6:
            boolean r1 = r9 instanceof xb.a0
            r2 = 0
            if (r1 == 0) goto L99
            r7 = 4
            xb.a0 r9 = (xb.a0) r9
            java.lang.String r1 = r4.f18196b
            r6 = 7
            java.lang.String r7 = r9.g()
            r3 = r7
            boolean r6 = r1.equals(r3)
            r1 = r6
            if (r1 == 0) goto L96
            r7 = 7
            java.lang.String r1 = r4.f18197c
            r7 = 6
            java.lang.String r3 = r9.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L96
            r7 = 4
            int r1 = r4.d
            int r7 = r9.f()
            r3 = r7
            if (r1 != r3) goto L96
            r7 = 7
            java.lang.String r1 = r4.f18198e
            r7 = 2
            java.lang.String r3 = r9.d()
            boolean r7 = r1.equals(r3)
            r1 = r7
            if (r1 == 0) goto L96
            r7 = 4
            java.lang.String r1 = r4.f18199f
            java.lang.String r7 = r9.a()
            r3 = r7
            boolean r7 = r1.equals(r3)
            r1 = r7
            if (r1 == 0) goto L96
            r7 = 4
            java.lang.String r1 = r4.f18200g
            r6 = 3
            java.lang.String r7 = r9.b()
            r3 = r7
            boolean r6 = r1.equals(r3)
            r1 = r6
            if (r1 == 0) goto L96
            r7 = 7
            xb.a0$e r1 = r4.f18201h
            if (r1 != 0) goto L71
            r6 = 2
            xb.a0$e r6 = r9.h()
            r1 = r6
            if (r1 != 0) goto L96
            goto L7d
        L71:
            xb.a0$e r3 = r9.h()
            boolean r7 = r1.equals(r3)
            r1 = r7
            if (r1 == 0) goto L96
            r6 = 2
        L7d:
            xb.a0$d r1 = r4.f18202i
            if (r1 != 0) goto L89
            r6 = 3
            xb.a0$d r9 = r9.e()
            if (r9 != 0) goto L96
            goto L98
        L89:
            xb.a0$d r7 = r9.e()
            r9 = r7
            boolean r7 = r1.equals(r9)
            r9 = r7
            if (r9 == 0) goto L96
            goto L98
        L96:
            r7 = 3
            r0 = 0
        L98:
            return r0
        L99:
            r7 = 5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.b.equals(java.lang.Object):boolean");
    }

    @Override // xb.a0
    public int f() {
        return this.d;
    }

    @Override // xb.a0
    public String g() {
        return this.f18196b;
    }

    @Override // xb.a0
    public a0.e h() {
        return this.f18201h;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f18196b.hashCode() ^ 1000003) * 1000003) ^ this.f18197c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.f18198e.hashCode()) * 1000003) ^ this.f18199f.hashCode()) * 1000003) ^ this.f18200g.hashCode()) * 1000003;
        a0.e eVar = this.f18201h;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f18202i;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return hashCode2 ^ i10;
    }

    @Override // xb.a0
    public a0.b i() {
        return new C0305b(this, null);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("CrashlyticsReport{sdkVersion=");
        m10.append(this.f18196b);
        m10.append(", gmpAppId=");
        m10.append(this.f18197c);
        m10.append(", platform=");
        m10.append(this.d);
        m10.append(", installationUuid=");
        m10.append(this.f18198e);
        m10.append(", buildVersion=");
        m10.append(this.f18199f);
        m10.append(", displayVersion=");
        m10.append(this.f18200g);
        m10.append(", session=");
        m10.append(this.f18201h);
        m10.append(", ndkPayload=");
        m10.append(this.f18202i);
        m10.append("}");
        return m10.toString();
    }
}
