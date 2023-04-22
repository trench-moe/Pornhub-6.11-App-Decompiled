package m8;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import k8.t;
import w6.y;

/* loaded from: classes2.dex */
public final class b extends w6.f {
    public final DecoderInputBuffer B;
    public final t C;
    public long D;
    public a E;
    public long F;

    public b() {
        super(6);
        this.B = new DecoderInputBuffer(1);
        this.C = new t();
    }

    @Override // w6.f
    public void C() {
        a aVar = this.E;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // w6.f
    public void E(long j10, boolean z10) {
        this.F = Long.MIN_VALUE;
        a aVar = this.E;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // w6.f
    public void I(y[] yVarArr, long j10, long j11) {
        this.D = j11;
    }

    @Override // w6.r0
    public int c(y yVar) {
        return "application/x-camera-motion".equals(yVar.B) ? 4 : 0;
    }

    @Override // w6.q0
    public boolean d() {
        return k();
    }

    @Override // w6.q0
    public boolean f() {
        return true;
    }

    @Override // w6.q0, w6.r0
    public String getName() {
        return "CameraMotionRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
        return;
     */
    @Override // w6.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(long r9, long r11) {
        /*
            r8 = this;
            r4 = r8
        L1:
            r6 = 4
        L2:
            boolean r7 = r4.k()
            r11 = r7
            if (r11 != 0) goto Lb2
            r6 = 6
            long r11 = r4.F
            r0 = 100000(0x186a0, double:4.94066E-319)
            r7 = 6
            long r0 = r0 + r9
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto Lb2
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r11 = r4.B
            r6 = 5
            r11.l()
            r6 = 6
            w6.z r11 = r4.B()
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r12 = r4.B
            r7 = 6
            r6 = 0
            r0 = r6
            int r7 = r4.J(r11, r12, r0)
            r11 = r7
            r12 = -4
            r6 = 1
            if (r11 != r12) goto Lb2
            r7 = 3
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r11 = r4.B
            boolean r6 = r11.j()
            r11 = r6
            if (r11 == 0) goto L3a
            r7 = 6
            goto Lb3
        L3a:
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r11 = r4.B
            long r1 = r11.n
            r4.F = r1
            r7 = 7
            m8.a r12 = r4.E
            if (r12 == 0) goto L1
            r6 = 4
            boolean r11 = r11.i()
            if (r11 == 0) goto L4d
            goto L2
        L4d:
            r7 = 4
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r11 = r4.B
            r7 = 5
            r11.o()
            r7 = 6
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r11 = r4.B
            java.nio.ByteBuffer r11 = r11.f6108j
            int r12 = k8.c0.f11939a
            r6 = 3
            int r12 = r11.remaining()
            r7 = 16
            r1 = r7
            if (r12 == r1) goto L67
            r11 = 0
            goto L9d
        L67:
            r7 = 3
            k8.t r12 = r4.C
            byte[] r1 = r11.array()
            int r2 = r11.limit()
            r12.B(r1, r2)
            k8.t r12 = r4.C
            r7 = 4
            int r7 = r11.arrayOffset()
            r11 = r7
            int r11 = r11 + 4
            r12.D(r11)
            r11 = 3
            r6 = 7
            float[] r12 = new float[r11]
            r7 = 3
        L87:
            if (r0 >= r11) goto L9c
            k8.t r1 = r4.C
            r6 = 3
            int r1 = r1.h()
            float r7 = java.lang.Float.intBitsToFloat(r1)
            r1 = r7
            r12[r0] = r1
            r6 = 4
            int r0 = r0 + 1
            r6 = 1
            goto L87
        L9c:
            r11 = r12
        L9d:
            if (r11 != 0) goto La2
            r7 = 6
            goto L2
        La2:
            m8.a r12 = r4.E
            r6 = 4
            long r0 = r4.F
            r6 = 7
            long r2 = r4.D
            r6 = 7
            long r0 = r0 - r2
            r7 = 4
            r12.b(r0, r11)
            goto L2
        Lb2:
            r7 = 4
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.b.q(long, long):void");
    }

    @Override // w6.f, w6.o0.b
    public void r(int i10, Object obj) {
        if (i10 == 7) {
            this.E = (a) obj;
        }
    }
}
