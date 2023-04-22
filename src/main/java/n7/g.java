package n7;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* loaded from: classes2.dex */
public final class g extends DecoderInputBuffer {
    public int A;
    public long y;

    /* renamed from: z  reason: collision with root package name */
    public int f13408z;

    public g() {
        super(2);
        this.A = 32;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer
    public void l() {
        super.l();
        this.f13408z = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean q(com.google.android.exoplayer2.decoder.DecoderInputBuffer r8) {
        /*
            r7 = this;
            r4 = r7
            boolean r6 = r8.p()
            r0 = r6
            r6 = 1
            r1 = r6
            r0 = r0 ^ r1
            k8.a.c(r0)
            r6 = 5
            boolean r0 = r8.h()
            r0 = r0 ^ r1
            r6 = 4
            k8.a.c(r0)
            r6 = 5
            boolean r0 = r8.j()
            r0 = r0 ^ r1
            k8.a.c(r0)
            r6 = 2
            boolean r0 = r4.r()
            r6 = 0
            r2 = r6
            if (r0 != 0) goto L2c
            r6 = 2
        L29:
            r6 = 1
            r0 = r6
            goto L61
        L2c:
            r6 = 1
            int r0 = r4.f13408z
            int r3 = r4.A
            if (r0 < r3) goto L36
        L33:
            r0 = 0
            r6 = 3
            goto L61
        L36:
            r6 = 6
            boolean r0 = r8.i()
            boolean r6 = r4.i()
            r3 = r6
            if (r0 == r3) goto L43
            goto L33
        L43:
            r6 = 1
            java.nio.ByteBuffer r0 = r8.f6108j
            r6 = 6
            if (r0 == 0) goto L29
            java.nio.ByteBuffer r3 = r4.f6108j
            r6 = 3
            if (r3 == 0) goto L29
            r6 = 2
            int r6 = r3.position()
            r3 = r6
            int r6 = r0.remaining()
            r0 = r6
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            r6 = 1
            if (r0 <= r3) goto L29
            goto L33
        L61:
            if (r0 != 0) goto L65
            r6 = 3
            return r2
        L65:
            int r0 = r4.f13408z
            int r2 = r0 + 1
            r4.f13408z = r2
            if (r0 != 0) goto L7c
            long r2 = r8.n
            r6 = 3
            r4.n = r2
            r6 = 6
            boolean r0 = r8.k()
            if (r0 == 0) goto L7c
            r6 = 2
            r4.f21800c = r1
        L7c:
            boolean r0 = r8.i()
            if (r0 == 0) goto L87
            r6 = 4
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f21800c = r0
        L87:
            java.nio.ByteBuffer r0 = r8.f6108j
            r6 = 7
            if (r0 == 0) goto L9b
            r6 = 3
            int r2 = r0.remaining()
            r4.n(r2)
            r6 = 4
            java.nio.ByteBuffer r2 = r4.f6108j
            r6 = 2
            r2.put(r0)
        L9b:
            r6 = 3
            long r2 = r8.n
            r4.y = r2
            r6 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.g.q(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }

    public boolean r() {
        return this.f13408z > 0;
    }
}
