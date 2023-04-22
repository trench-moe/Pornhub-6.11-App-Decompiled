package ud;

import md.o;

/* loaded from: classes2.dex */
public class b implements md.e, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    public final String f15850c;

    /* renamed from: f  reason: collision with root package name */
    public final String f15851f;

    /* renamed from: j  reason: collision with root package name */
    public final o[] f15852j;

    public b(String str, String str2, o[] oVarArr) {
        l9.e.l(str, "Name");
        this.f15850c = str;
        this.f15851f = str2;
        if (oVarArr != null) {
            this.f15852j = oVarArr;
        } else {
            this.f15852j = new o[0];
        }
    }

    public Object clone() {
        return super.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r10 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r10) {
        /*
            r9 = this;
            r6 = r9
            r8 = 1
            r0 = r8
            if (r6 != r10) goto L8
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            return r0
        L8:
            r8 = 6
            boolean r1 = r10 instanceof md.e
            r8 = 0
            r2 = r8
            if (r1 == 0) goto L5e
            ud.b r10 = (ud.b) r10
            r8 = 4
            java.lang.String r1 = r6.f15850c
            java.lang.String r3 = r10.f15850c
            boolean r8 = r1.equals(r3)
            r1 = r8
            if (r1 == 0) goto L5a
            r8 = 4
            java.lang.String r1 = r6.f15851f
            java.lang.String r3 = r10.f15851f
            boolean r1 = m9.a.r(r1, r3)
            if (r1 == 0) goto L5a
            r8 = 2
            md.o[] r1 = r6.f15852j
            r8 = 1
            md.o[] r10 = r10.f15852j
            if (r1 != 0) goto L39
            if (r10 != 0) goto L36
        L32:
            r8 = 1
            r10 = 1
            r8 = 5
            goto L57
        L36:
            r8 = 0
            r10 = r8
            goto L57
        L39:
            if (r10 == 0) goto L36
            int r3 = r1.length
            int r4 = r10.length
            if (r3 != r4) goto L36
            r8 = 1
            r8 = 0
            r3 = r8
        L42:
            int r4 = r1.length
            r8 = 7
            if (r3 >= r4) goto L32
            r4 = r1[r3]
            r5 = r10[r3]
            r8 = 7
            boolean r4 = m9.a.r(r4, r5)
            if (r4 != 0) goto L53
            r8 = 4
            goto L36
        L53:
            int r3 = r3 + 1
            r8 = 3
            goto L42
        L57:
            if (r10 == 0) goto L5a
            goto L5d
        L5a:
            r8 = 3
            r0 = 0
            r8 = 7
        L5d:
            return r0
        L5e:
            r8 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.b.equals(java.lang.Object):boolean");
    }

    @Override // md.e
    public String getName() {
        return this.f15850c;
    }

    public int hashCode() {
        int v2 = m9.a.v(m9.a.v(17, this.f15850c), this.f15851f);
        for (o oVar : this.f15852j) {
            v2 = m9.a.v(v2, oVar);
        }
        return v2;
    }

    public String toString() {
        o[] oVarArr;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f15850c);
        if (this.f15851f != null) {
            sb2.append("=");
            sb2.append(this.f15851f);
        }
        for (o oVar : this.f15852j) {
            sb2.append("; ");
            sb2.append(oVar);
        }
        return sb2.toString();
    }
}
