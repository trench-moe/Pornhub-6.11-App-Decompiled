package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class o extends a0.e.d.a.b.AbstractC0299b {

    /* renamed from: a  reason: collision with root package name */
    public final String f18296a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18297b;

    /* renamed from: c  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0300d.AbstractC0301a> f18298c;
    public final a0.e.d.a.b.AbstractC0299b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f18299e;

    public o(String str, String str2, b0 b0Var, a0.e.d.a.b.AbstractC0299b abstractC0299b, int i10, a aVar) {
        this.f18296a = str;
        this.f18297b = str2;
        this.f18298c = b0Var;
        this.d = abstractC0299b;
        this.f18299e = i10;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0299b
    public a0.e.d.a.b.AbstractC0299b a() {
        return this.d;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0299b
    public b0<a0.e.d.a.b.AbstractC0300d.AbstractC0301a> b() {
        return this.f18298c;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0299b
    public int c() {
        return this.f18299e;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0299b
    public String d() {
        return this.f18297b;
    }

    @Override // xb.a0.e.d.a.b.AbstractC0299b
    public String e() {
        return this.f18296a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r1.equals(r9.d()) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
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
            r6 = 7
            boolean r1 = r9 instanceof xb.a0.e.d.a.b.AbstractC0299b
            r6 = 1
            r2 = 0
            r7 = 3
            if (r1 == 0) goto L70
            xb.a0$e$d$a$b$b r9 = (xb.a0.e.d.a.b.AbstractC0299b) r9
            java.lang.String r1 = r4.f18296a
            java.lang.String r7 = r9.e()
            r3 = r7
            boolean r7 = r1.equals(r3)
            r1 = r7
            if (r1 == 0) goto L6d
            r7 = 7
            java.lang.String r1 = r4.f18297b
            r6 = 5
            if (r1 != 0) goto L2d
            r7 = 4
            java.lang.String r1 = r9.d()
            if (r1 != 0) goto L6d
            r6 = 4
            goto L39
        L2d:
            java.lang.String r7 = r9.d()
            r3 = r7
            boolean r6 = r1.equals(r3)
            r1 = r6
            if (r1 == 0) goto L6d
        L39:
            xb.b0<xb.a0$e$d$a$b$d$a> r1 = r4.f18298c
            r7 = 2
            xb.b0 r6 = r9.b()
            r3 = r6
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L6d
            r7 = 1
            xb.a0$e$d$a$b$b r1 = r4.d
            if (r1 != 0) goto L56
            r6 = 5
            xb.a0$e$d$a$b$b r6 = r9.a()
            r1 = r6
            if (r1 != 0) goto L6d
            r7 = 4
            goto L63
        L56:
            xb.a0$e$d$a$b$b r6 = r9.a()
            r3 = r6
            boolean r6 = r1.equals(r3)
            r1 = r6
            if (r1 == 0) goto L6d
            r6 = 7
        L63:
            int r1 = r4.f18299e
            int r9 = r9.c()
            if (r1 != r9) goto L6d
            r6 = 5
            goto L6f
        L6d:
            r6 = 7
            r0 = 0
        L6f:
            return r0
        L70:
            r6 = 6
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.o.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.f18296a.hashCode() ^ 1000003) * 1000003;
        String str = this.f18297b;
        int i10 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f18298c.hashCode()) * 1000003;
        a0.e.d.a.b.AbstractC0299b abstractC0299b = this.d;
        if (abstractC0299b != null) {
            i10 = abstractC0299b.hashCode();
        }
        return ((hashCode2 ^ i10) * 1000003) ^ this.f18299e;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Exception{type=");
        m10.append(this.f18296a);
        m10.append(", reason=");
        m10.append(this.f18297b);
        m10.append(", frames=");
        m10.append(this.f18298c);
        m10.append(", causedBy=");
        m10.append(this.d);
        m10.append(", overflowCount=");
        return android.support.v4.media.a.j(m10, this.f18299e, "}");
    }
}
