package l7;

import java.util.List;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<w6.y> f12413a;

    /* renamed from: b  reason: collision with root package name */
    public final c7.w[] f12414b;

    public e0(List<w6.y> list) {
        this.f12413a = list;
        this.f12414b = new c7.w[list.size()];
    }

    public void a(long j10, k8.t tVar) {
        if (tVar.a() < 9) {
            return;
        }
        int f10 = tVar.f();
        int f11 = tVar.f();
        int s10 = tVar.s();
        if (f10 == 434 && f11 == 1195456820 && s10 == 3) {
            c7.b.b(j10, tVar, this.f12414b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(c7.j r12, l7.d0.d r13) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            r10 = 1
        L3:
            c7.w[] r2 = r11.f12414b
            r10 = 1
            int r2 = r2.length
            r10 = 4
            if (r1 >= r2) goto L92
            r10 = 3
            r13.a()
            r10 = 6
            int r2 = r13.c()
            r3 = 3
            r10 = 1
            c7.w r2 = r12.r(r2, r3)
            java.util.List<w6.y> r3 = r11.f12413a
            java.lang.Object r3 = r3.get(r1)
            w6.y r3 = (w6.y) r3
            r10 = 3
            java.lang.String r4 = r3.B
            r10 = 5
            java.lang.String r9 = "application/cea-608"
            r5 = r9
            boolean r9 = r5.equals(r4)
            r5 = r9
            if (r5 != 0) goto L3c
            java.lang.String r9 = "application/cea-708"
            r5 = r9
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L3a
            r10 = 6
            goto L3c
        L3a:
            r5 = 0
            goto L3d
        L3c:
            r5 = 1
        L3d:
            java.lang.String r9 = "Invalid closed caption mime type provided: "
            r6 = r9
            java.lang.String r9 = java.lang.String.valueOf(r4)
            r7 = r9
            int r9 = r7.length()
            r8 = r9
            if (r8 == 0) goto L52
            java.lang.String r9 = r6.concat(r7)
            r6 = r9
            goto L59
        L52:
            r10 = 3
            java.lang.String r7 = new java.lang.String
            r7.<init>(r6)
            r6 = r7
        L59:
            k8.a.d(r5, r6)
            r10 = 3
            w6.y$b r5 = new w6.y$b
            r5.<init>()
            java.lang.String r6 = r13.b()
            r5.f16870a = r6
            r10 = 1
            r5.f16879k = r4
            int r4 = r3.f16865m
            r5.d = r4
            java.lang.String r4 = r3.f16864j
            r10 = 1
            r5.f16872c = r4
            r10 = 6
            int r4 = r3.T
            r5.C = r4
            r10 = 5
            java.util.List<byte[]> r3 = r3.D
            r5.f16881m = r3
            r10 = 1
            w6.y r3 = r5.a()
            r2.d(r3)
            r10 = 2
            c7.w[] r3 = r11.f12414b
            r10 = 2
            r3[r1] = r2
            r10 = 4
            int r1 = r1 + 1
            r10 = 3
            goto L3
        L92:
            r10 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.e0.b(c7.j, l7.d0$d):void");
    }
}
