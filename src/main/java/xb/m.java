package xb;

import xb.a0;

/* loaded from: classes2.dex */
public final class m extends a0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0300d> f18289a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.e.d.a.b.AbstractC0299b f18290b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.a f18291c;
    public final a0.e.d.a.b.c d;

    /* renamed from: e  reason: collision with root package name */
    public final b0<a0.e.d.a.b.AbstractC0298a> f18292e;

    public m(b0 b0Var, a0.e.d.a.b.AbstractC0299b abstractC0299b, a0.a aVar, a0.e.d.a.b.c cVar, b0 b0Var2, a aVar2) {
        this.f18289a = b0Var;
        this.f18290b = abstractC0299b;
        this.f18291c = aVar;
        this.d = cVar;
        this.f18292e = b0Var2;
    }

    @Override // xb.a0.e.d.a.b
    public a0.a a() {
        return this.f18291c;
    }

    @Override // xb.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0298a> b() {
        return this.f18292e;
    }

    @Override // xb.a0.e.d.a.b
    public a0.e.d.a.b.AbstractC0299b c() {
        return this.f18290b;
    }

    @Override // xb.a0.e.d.a.b
    public a0.e.d.a.b.c d() {
        return this.d;
    }

    @Override // xb.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0300d> e() {
        return this.f18289a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != r8) goto L5
            r7 = 3
            return r0
        L5:
            boolean r1 = r9 instanceof xb.a0.e.d.a.b
            r5 = 4
            r4 = 0
            r2 = r4
            if (r1 == 0) goto L7a
            r6 = 6
            xb.a0$e$d$a$b r9 = (xb.a0.e.d.a.b) r9
            r6 = 1
            xb.b0<xb.a0$e$d$a$b$d> r1 = r8.f18289a
            r6 = 2
            if (r1 != 0) goto L1c
            xb.b0 r1 = r9.e()
            if (r1 != 0) goto L76
            goto L28
        L1c:
            xb.b0 r4 = r9.e()
            r3 = r4
            boolean r4 = r1.equals(r3)
            r1 = r4
            if (r1 == 0) goto L76
        L28:
            xb.a0$e$d$a$b$b r1 = r8.f18290b
            r5 = 6
            if (r1 != 0) goto L36
            r7 = 1
            xb.a0$e$d$a$b$b r1 = r9.c()
            if (r1 != 0) goto L76
            r7 = 6
            goto L44
        L36:
            r6 = 7
            xb.a0$e$d$a$b$b r4 = r9.c()
            r3 = r4
            boolean r4 = r1.equals(r3)
            r1 = r4
            if (r1 == 0) goto L76
            r7 = 6
        L44:
            xb.a0$a r1 = r8.f18291c
            if (r1 != 0) goto L50
            r5 = 7
            xb.a0$a r1 = r9.a()
            if (r1 != 0) goto L76
            goto L5a
        L50:
            xb.a0$a r3 = r9.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L76
        L5a:
            xb.a0$e$d$a$b$c r1 = r8.d
            r6 = 1
            xb.a0$e$d$a$b$c r3 = r9.d()
            boolean r4 = r1.equals(r3)
            r1 = r4
            if (r1 == 0) goto L76
            xb.b0<xb.a0$e$d$a$b$a> r1 = r8.f18292e
            xb.b0 r9 = r9.b()
            boolean r9 = r1.equals(r9)
            if (r9 == 0) goto L76
            r7 = 7
            goto L79
        L76:
            r7 = 1
            r4 = 0
            r0 = r4
        L79:
            return r0
        L7a:
            r6 = 7
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xb.m.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        b0<a0.e.d.a.b.AbstractC0300d> b0Var = this.f18289a;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.AbstractC0299b abstractC0299b = this.f18290b;
        int hashCode2 = (hashCode ^ (abstractC0299b == null ? 0 : abstractC0299b.hashCode())) * 1000003;
        a0.a aVar = this.f18291c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f18292e.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Execution{threads=");
        m10.append(this.f18289a);
        m10.append(", exception=");
        m10.append(this.f18290b);
        m10.append(", appExitInfo=");
        m10.append(this.f18291c);
        m10.append(", signal=");
        m10.append(this.d);
        m10.append(", binaries=");
        m10.append(this.f18292e);
        m10.append("}");
        return m10.toString();
    }
}
