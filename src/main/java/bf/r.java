package bf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements y {

    /* renamed from: c  reason: collision with root package name */
    public final f f3690c;

    /* renamed from: f  reason: collision with root package name */
    public u f3691f;

    /* renamed from: j  reason: collision with root package name */
    public int f3692j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3693m;
    public long n;

    /* renamed from: t  reason: collision with root package name */
    public final h f3694t;

    public r(h upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f3694t = upstream;
        f b10 = upstream.b();
        this.f3690c = b10;
        u uVar = b10.f3668c;
        this.f3691f = uVar;
        this.f3692j = uVar != null ? uVar.f3703b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r4 == r5.f3703b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    @Override // bf.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long O(bf.f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 < 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            if (r4 == 0) goto L85
            boolean r4 = r8.f3693m
            r4 = r4 ^ 1
            if (r4 == 0) goto L79
            bf.u r4 = r8.f3691f
            if (r4 == 0) goto L2a
            bf.f r5 = r8.f3690c
            bf.u r5 = r5.f3668c
            if (r4 != r5) goto L2b
            int r4 = r8.f3692j
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.f3703b
            if (r4 != r5) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L6d
            if (r3 != 0) goto L30
            return r1
        L30:
            bf.h r0 = r8.f3694t
            long r1 = r8.n
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            bf.u r0 = r8.f3691f
            if (r0 != 0) goto L53
            bf.f r0 = r8.f3690c
            bf.u r0 = r0.f3668c
            if (r0 == 0) goto L53
            r8.f3691f = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.f3703b
            r8.f3692j = r0
        L53:
            bf.f r0 = r8.f3690c
            long r0 = r0.f3669f
            long r2 = r8.n
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            bf.f r2 = r8.f3690c
            long r4 = r8.n
            r3 = r9
            r6 = r10
            r2.d(r3, r4, r6)
            long r0 = r8.n
            long r0 = r0 + r10
            r8.n = r0
            return r10
        L6d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L79:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L85:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = android.support.v4.media.b.h(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.r.O(bf.f, long):long");
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3693m = true;
    }

    @Override // bf.y
    public z g() {
        return this.f3694t.g();
    }
}
