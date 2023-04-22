package xb;

import com.appsflyer.oaid.BuildConfig;
import xb.a0;

/* loaded from: classes2.dex */
public final class l extends a0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.e.d.a.b f18281a;

    /* renamed from: b  reason: collision with root package name */
    public final b0<a0.c> f18282b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.c> f18283c;
    public final Boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18284e;

    /* loaded from: classes2.dex */
    public static final class b extends a0.e.d.a.AbstractC0297a {

        /* renamed from: a  reason: collision with root package name */
        public a0.e.d.a.b f18285a;

        /* renamed from: b  reason: collision with root package name */
        public b0<a0.c> f18286b;

        /* renamed from: c  reason: collision with root package name */
        public b0<a0.c> f18287c;
        public Boolean d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f18288e;

        public b(a0.e.d.a aVar, a aVar2) {
            l lVar = (l) aVar;
            this.f18285a = lVar.f18281a;
            this.f18286b = lVar.f18282b;
            this.f18287c = lVar.f18283c;
            this.d = lVar.d;
            this.f18288e = Integer.valueOf(lVar.f18284e);
        }

        public a0.e.d.a a() {
            String str = this.f18285a == null ? " execution" : BuildConfig.FLAVOR;
            if (this.f18288e == null) {
                str = a1.a.l(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new l(this.f18285a, this.f18286b, this.f18287c, this.d, this.f18288e.intValue(), null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
    }

    public l(a0.e.d.a.b bVar, b0 b0Var, b0 b0Var2, Boolean bool, int i10, a aVar) {
        this.f18281a = bVar;
        this.f18282b = b0Var;
        this.f18283c = b0Var2;
        this.d = bool;
        this.f18284e = i10;
    }

    @Override // xb.a0.e.d.a
    public Boolean a() {
        return this.d;
    }

    @Override // xb.a0.e.d.a
    public b0<a0.c> b() {
        return this.f18282b;
    }

    @Override // xb.a0.e.d.a
    public a0.e.d.a.b c() {
        return this.f18281a;
    }

    @Override // xb.a0.e.d.a
    public b0<a0.c> d() {
        return this.f18283c;
    }

    @Override // xb.a0.e.d.a
    public int e() {
        return this.f18284e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r9.b() == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r9.d() == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r1.equals(r9.a()) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            r5 = 6
            if (r9 != r8) goto L5
            return r0
        L5:
            boolean r1 = r9 instanceof xb.a0.e.d.a
            r7 = 7
            r4 = 0
            r2 = r4
            if (r1 == 0) goto L75
            xb.a0$e$d$a r9 = (xb.a0.e.d.a) r9
            r7 = 7
            xb.a0$e$d$a$b r1 = r8.f18281a
            r5 = 3
            xb.a0$e$d$a$b r3 = r9.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L72
            xb.b0<xb.a0$c> r1 = r8.f18282b
            if (r1 != 0) goto L28
            xb.b0 r4 = r9.b()
            r1 = r4
            if (r1 != 0) goto L72
            goto L36
        L28:
            r5 = 7
            xb.b0 r4 = r9.b()
            r3 = r4
            boolean r4 = r1.equals(r3)
            r1 = r4
            if (r1 == 0) goto L72
            r5 = 6
        L36:
            xb.b0<xb.a0$c> r1 = r8.f18283c
            if (r1 != 0) goto L41
            xb.b0 r1 = r9.d()
            if (r1 != 0) goto L72
            goto L4e
        L41:
            r7 = 4
            xb.b0 r3 = r9.d()
            boolean r4 = r1.equals(r3)
            r1 = r4
            if (r1 == 0) goto L72
            r5 = 3
        L4e:
            java.lang.Boolean r1 = r8.d
            if (r1 != 0) goto L5b
            java.lang.Boolean r4 = r9.a()
            r1 = r4
            if (r1 != 0) goto L72
            r5 = 1
            goto L68
        L5b:
            r7 = 6
            java.lang.Boolean r4 = r9.a()
            r3 = r4
            boolean r4 = r1.equals(r3)
            r1 = r4
            if (r1 == 0) goto L72
        L68:
            int r1 = r8.f18284e
            r5 = 6
            int r9 = r9.e()
            if (r1 != r9) goto L72
            goto L74
        L72:
            r7 = 6
            r0 = 0
        L74:
            return r0
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.l.equals(java.lang.Object):boolean");
    }

    @Override // xb.a0.e.d.a
    public a0.e.d.a.AbstractC0297a f() {
        return new b(this, null);
    }

    public int hashCode() {
        int hashCode = (this.f18281a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f18282b;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f18283c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.d;
        if (bool != null) {
            i10 = bool.hashCode();
        }
        return ((hashCode3 ^ i10) * 1000003) ^ this.f18284e;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Application{execution=");
        m10.append(this.f18281a);
        m10.append(", customAttributes=");
        m10.append(this.f18282b);
        m10.append(", internalKeys=");
        m10.append(this.f18283c);
        m10.append(", background=");
        m10.append(this.d);
        m10.append(", uiOrientation=");
        return android.support.v4.media.a.j(m10, this.f18284e, "}");
    }
}
