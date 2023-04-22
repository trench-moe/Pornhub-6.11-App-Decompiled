package t9;

/* loaded from: classes2.dex */
public final class b1 extends v8.i {
    public final v8.c d;

    /* renamed from: e  reason: collision with root package name */
    public final f f15180e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b1(android.content.Context r7, v8.c r8, t9.f r9) {
        /*
            r6 = this;
            java.util.List r0 = r8.p0()
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "com.google.android.gms.cast.CATEGORY_CAST"
            r2 = 1
            r3 = 0
            java.lang.String r4 = "applicationId cannot be null"
            if (r0 == 0) goto L20
            java.lang.String r0 = r8.f16070c
            if (r0 == 0) goto L1a
            r4 = 0
            java.lang.String r0 = a0.b.k0(r1, r0, r4, r3, r2)
            goto L2e
        L1a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r4)
            throw r7
        L20:
            java.lang.String r0 = r8.f16070c
            java.util.List r5 = r8.p0()
            if (r0 == 0) goto L3e
            if (r5 == 0) goto L36
            java.lang.String r0 = a0.b.k0(r1, r0, r5, r3, r2)
        L2e:
            r6.<init>(r7, r0)
            r6.d = r8
            r6.f15180e = r9
            return
        L36:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "namespaces cannot be null"
            r7.<init>(r8)
            throw r7
        L3e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.b1.<init>(android.content.Context, v8.c, t9.f):void");
    }

    @Override // v8.i
    public final v8.f a(String str) {
        return new v8.d(this.f16098a, this.f16099b, str, this.d, new x8.k(this.f16098a, this.d, this.f15180e));
    }

    @Override // v8.i
    public final boolean b() {
        return this.d.n;
    }
}
