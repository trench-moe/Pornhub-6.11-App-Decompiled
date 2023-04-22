package k8;

import com.appsflyer.oaid.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f12009a;

    /* renamed from: b  reason: collision with root package name */
    public int f12010b;

    /* renamed from: c  reason: collision with root package name */
    public int f12011c;

    public t() {
        this.f12009a = c0.f11943f;
    }

    public t(int i10) {
        this.f12009a = new byte[i10];
        this.f12011c = i10;
    }

    public t(byte[] bArr) {
        this.f12009a = bArr;
        this.f12011c = bArr.length;
    }

    public t(byte[] bArr, int i10) {
        this.f12009a = bArr;
        this.f12011c = i10;
    }

    public void A(byte[] bArr) {
        int length = bArr.length;
        this.f12009a = bArr;
        this.f12011c = length;
        this.f12010b = 0;
    }

    public void B(byte[] bArr, int i10) {
        this.f12009a = bArr;
        this.f12011c = i10;
        this.f12010b = 0;
    }

    public void C(int i10) {
        a.c(i10 >= 0 && i10 <= this.f12009a.length);
        this.f12011c = i10;
    }

    public void D(int i10) {
        a.c(i10 >= 0 && i10 <= this.f12011c);
        this.f12010b = i10;
    }

    public void E(int i10) {
        D(this.f12010b + i10);
    }

    public int a() {
        return this.f12011c - this.f12010b;
    }

    public void b(int i10) {
        byte[] bArr = this.f12009a;
        if (i10 > bArr.length) {
            this.f12009a = Arrays.copyOf(bArr, i10);
        }
    }

    public int c() {
        return this.f12009a[this.f12010b] & UByte.MAX_VALUE;
    }

    public void d(s sVar, int i10) {
        e(sVar.f12006a, 0, i10);
        sVar.k(0);
    }

    public void e(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f12009a, this.f12010b, bArr, i10, i11);
        this.f12010b += i11;
    }

    public int f() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = i11 + 1;
        this.f12010b = i12;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i11] & UByte.MAX_VALUE) << 16);
        int i14 = i12 + 1;
        this.f12010b = i14;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 8);
        this.f12010b = i14 + 1;
        return (bArr[i14] & UByte.MAX_VALUE) | i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002d A[LOOP:0: B:7:0x000d->B:18:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0031 A[EDGE_INSN: B:43:0x0031->B:19:0x0031 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String g() {
        /*
            r13 = this;
            r9 = r13
            int r11 = r9.a()
            r0 = r11
            if (r0 != 0) goto Lb
            r12 = 7
            r0 = 0
            return r0
        Lb:
            int r0 = r9.f12010b
        Ld:
            int r1 = r9.f12011c
            r12 = 2
            r2 = 13
            r12 = 10
            r3 = r12
            r4 = 1
            r12 = 6
            if (r0 >= r1) goto L31
            byte[] r1 = r9.f12009a
            r1 = r1[r0]
            int r5 = k8.c0.f11939a
            r12 = 5
            if (r1 == r3) goto L29
            r12 = 4
            if (r1 != r2) goto L26
            goto L2a
        L26:
            r12 = 7
            r1 = 0
            goto L2b
        L29:
            r11 = 3
        L2a:
            r1 = 1
        L2b:
            if (r1 != 0) goto L31
            r11 = 7
            int r0 = r0 + 1
            goto Ld
        L31:
            int r1 = r9.f12010b
            int r5 = r0 - r1
            r11 = 3
            r6 = r11
            if (r5 < r6) goto L5b
            byte[] r5 = r9.f12009a
            r7 = r5[r1]
            r8 = -17
            r12 = 7
            if (r7 != r8) goto L5b
            int r7 = r1 + 1
            r7 = r5[r7]
            r12 = -69
            r8 = r12
            if (r7 != r8) goto L5b
            int r7 = r1 + 2
            r12 = 7
            r5 = r5[r7]
            r12 = 5
            r11 = -65
            r7 = r11
            if (r5 != r7) goto L5b
            r12 = 4
            int r1 = r1 + r6
            r9.f12010b = r1
            r12 = 6
        L5b:
            byte[] r1 = r9.f12009a
            r12 = 7
            int r5 = r9.f12010b
            r12 = 5
            int r6 = r0 - r5
            java.lang.String r12 = k8.c0.m(r1, r5, r6)
            r1 = r12
            r9.f12010b = r0
            int r5 = r9.f12011c
            if (r0 != r5) goto L70
            r12 = 1
            return r1
        L70:
            r11 = 1
            byte[] r6 = r9.f12009a
            r7 = r6[r0]
            if (r7 != r2) goto L7e
            int r0 = r0 + r4
            r9.f12010b = r0
            r12 = 7
            if (r0 != r5) goto L7e
            return r1
        L7e:
            r12 = 7
            int r0 = r9.f12010b
            r11 = 6
            r2 = r6[r0]
            if (r2 != r3) goto L8b
            r11 = 1
            int r0 = r0 + r4
            r11 = 5
            r9.f12010b = r0
        L8b:
            r11 = 4
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.g():java.lang.String");
    }

    public int h() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        int i13 = i11 + 1;
        this.f12010b = i13;
        int i14 = i12 | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        int i15 = i13 + 1;
        this.f12010b = i15;
        int i16 = i14 | ((bArr[i13] & UByte.MAX_VALUE) << 16);
        this.f12010b = i15 + 1;
        return ((bArr[i15] & UByte.MAX_VALUE) << 24) | i16;
    }

    public short i() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f12010b = i11 + 1;
        return (short) (((bArr[i11] & UByte.MAX_VALUE) << 8) | i12);
    }

    public long j() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = i11 + 1;
        this.f12010b = i12;
        int i13 = i12 + 1;
        this.f12010b = i13;
        this.f12010b = i13 + 1;
        return (bArr[i10] & 255) | ((bArr[i11] & 255) << 8) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 24);
    }

    public int k() {
        int h10 = h();
        if (h10 >= 0) {
            return h10;
        }
        throw new IllegalStateException(android.support.v4.media.b.e(29, "Top bit not zero: ", h10));
    }

    public int l() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f12010b = i11 + 1;
        return ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
    }

    public long m() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = i11 + 1;
        this.f12010b = i12;
        int i13 = i12 + 1;
        this.f12010b = i13;
        int i14 = i13 + 1;
        this.f12010b = i14;
        int i15 = i14 + 1;
        this.f12010b = i15;
        int i16 = i15 + 1;
        this.f12010b = i16;
        int i17 = i16 + 1;
        this.f12010b = i17;
        this.f12010b = i17 + 1;
        return ((bArr[i10] & 255) << 56) | ((bArr[i11] & 255) << 48) | ((bArr[i12] & 255) << 40) | ((bArr[i13] & 255) << 32) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 16) | ((bArr[i16] & 255) << 8) | (bArr[i17] & 255);
    }

    public String n() {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f12010b;
        while (i10 < this.f12011c && this.f12009a[i10] != 0) {
            i10++;
        }
        byte[] bArr = this.f12009a;
        int i11 = this.f12010b;
        String m10 = c0.m(bArr, i11, i10 - i11);
        this.f12010b = i10;
        if (i10 < this.f12011c) {
            this.f12010b = i10 + 1;
        }
        return m10;
    }

    public String o(int i10) {
        if (i10 == 0) {
            return BuildConfig.FLAVOR;
        }
        int i11 = this.f12010b;
        int i12 = (i11 + i10) - 1;
        String m10 = c0.m(this.f12009a, i11, (i12 >= this.f12011c || this.f12009a[i12] != 0) ? i10 : i10 - 1);
        this.f12010b += i10;
        return m10;
    }

    public String p(int i10) {
        return q(i10, jb.b.f11660c);
    }

    public String q(int i10, Charset charset) {
        String str = new String(this.f12009a, this.f12010b, i10, charset);
        this.f12010b += i10;
        return str;
    }

    public int r() {
        return (s() << 21) | (s() << 14) | (s() << 7) | s();
    }

    public int s() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        this.f12010b = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    public long t() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = i11 + 1;
        this.f12010b = i12;
        int i13 = i12 + 1;
        this.f12010b = i13;
        this.f12010b = i13 + 1;
        return ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8) | (bArr[i13] & 255);
    }

    public int u() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        int i12 = i11 + 1;
        this.f12010b = i12;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 16) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        this.f12010b = i12 + 1;
        return (bArr[i12] & UByte.MAX_VALUE) | i13;
    }

    public int v() {
        int f10 = f();
        if (f10 >= 0) {
            return f10;
        }
        throw new IllegalStateException(android.support.v4.media.b.e(29, "Top bit not zero: ", f10));
    }

    public long w() {
        long m10 = m();
        if (m10 >= 0) {
            return m10;
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Top bit not zero: ");
        sb2.append(m10);
        throw new IllegalStateException(sb2.toString());
    }

    public int x() {
        byte[] bArr = this.f12009a;
        int i10 = this.f12010b;
        int i11 = i10 + 1;
        this.f12010b = i11;
        this.f12010b = i11 + 1;
        return (bArr[i11] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 8);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public long y() {
        /*
            Method dump skipped, instructions count: 157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.t.y():long");
    }

    public void z(int i10) {
        byte[] bArr = this.f12009a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        B(bArr, i10);
    }
}
