package com.google.android.gms.internal.measurement;

import kotlin.KotlinVersion;
import w9.a5;
import w9.v7;

/* loaded from: classes.dex */
public final class d extends e {
    public final byte[] S;
    public final int T;
    public int U;

    public d(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.S = bArr;
        this.U = 0;
        this.T = i11;
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void A0(int i10, long j10) {
        z0(i10 << 3);
        B0(j10);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void B0(long j10) {
        if (e.R && this.T - this.U >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.S;
                int i10 = this.U;
                this.U = i10 + 1;
                v7.f17349c.f(bArr, v7.f17351f + i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.S;
            int i11 = this.U;
            this.U = i11 + 1;
            v7.f17349c.f(bArr2, v7.f17351f + i11, (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.S;
                int i12 = this.U;
                this.U = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
            }
        }
        byte[] bArr4 = this.S;
        int i13 = this.U;
        this.U = i13 + 1;
        bArr4[i13] = (byte) j10;
    }

    public final int I0() {
        return this.T - this.U;
    }

    public final void J0(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.S, this.U, i11);
            this.U += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), Integer.valueOf(i11)), e10);
        }
    }

    public final void K0(byte[] bArr, int i10, int i11) {
        J0(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void n0(byte b10) {
        try {
            byte[] bArr = this.S;
            int i10 = this.U;
            this.U = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void o0(int i10, boolean z10) {
        z0(i10 << 3);
        n0(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void p0(int i10, zzix zzixVar) {
        z0((i10 << 3) | 2);
        z0(zzixVar.g());
        zzixVar.m(this);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void q0(int i10, int i11) {
        z0((i10 << 3) | 5);
        r0(i11);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void r0(int i10) {
        try {
            byte[] bArr = this.S;
            int i11 = this.U;
            int i12 = i11 + 1;
            this.U = i12;
            bArr[i11] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i12 + 1;
            this.U = i13;
            bArr[i12] = (byte) ((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i14 = i13 + 1;
            this.U = i14;
            bArr[i13] = (byte) ((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.U = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void s0(int i10, long j10) {
        z0((i10 << 3) | 1);
        t0(j10);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void t0(long j10) {
        try {
            byte[] bArr = this.S;
            int i10 = this.U;
            int i11 = i10 + 1;
            this.U = i11;
            bArr[i10] = (byte) (((int) j10) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i12 = i11 + 1;
            this.U = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i13 = i12 + 1;
            this.U = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i14 = i13 + 1;
            this.U = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i15 = i14 + 1;
            this.U = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i16 = i15 + 1;
            this.U = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i17 = i16 + 1;
            this.U = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.U = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void u0(int i10, int i11) {
        z0(i10 << 3);
        if (i11 >= 0) {
            z0(i11);
        } else {
            B0(i11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void v0(int i10) {
        if (i10 >= 0) {
            z0(i10);
        } else {
            B0(i10);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // com.google.android.gms.internal.measurement.e
    public final void w0(int r12, java.lang.String r13) {
        /*
            r11 = this;
            int r12 = r12 << 3
            r12 = r12 | 2
            r8 = 6
            r11.z0(r12)
            int r12 = r11.U
            r8 = 4
            int r0 = r13.length()     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            int r0 = r0 * 3
            int r7 = com.google.android.gms.internal.measurement.e.l0(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r0 = r7
            int r1 = r13.length()     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            int r7 = com.google.android.gms.internal.measurement.e.l0(r1)     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r1 = r7
            if (r1 != r0) goto L40
            int r0 = r12 + r1
            r9 = 3
            r11.U = r0     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            byte[] r2 = r11.S     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            int r3 = r11.T     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r9 = 7
            int r3 = r3 - r0
            r8 = 3
            int r7 = com.google.android.gms.internal.measurement.h.b(r13, r2, r0, r3)     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r0 = r7
            r11.U = r12     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r10 = 1
            int r2 = r0 - r12
            int r2 = r2 - r1
            r11.z0(r2)     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r9 = 4
            r11.U = r0     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r8 = 2
            goto L88
        L40:
            int r0 = com.google.android.gms.internal.measurement.h.c(r13)     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r11.z0(r0)     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            byte[] r0 = r11.S     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            int r1 = r11.U     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r9 = 6
            int r2 = r11.T     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            int r2 = r2 - r1
            int r0 = com.google.android.gms.internal.measurement.h.b(r13, r0, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            r11.U = r0     // Catch: java.lang.IndexOutOfBoundsException -> L56 com.google.android.gms.internal.measurement.zzmp -> L5f
            goto L88
        L56:
            r12 = move-exception
            com.google.android.gms.internal.measurement.zzjd r13 = new com.google.android.gms.internal.measurement.zzjd
            r13.<init>(r12)
            r10 = 2
            throw r13
            r10 = 4
        L5f:
            r0 = move-exception
            r6 = r0
            r11.U = r12
            r8 = 5
            java.util.logging.Logger r1 = com.google.android.gms.internal.measurement.e.Q
            r10 = 4
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r10 = 1
            java.lang.String r3 = "com.google.protobuf.CodedOutputStream"
            java.lang.String r7 = "inefficientWriteStringNoTag"
            r4 = r7
            java.lang.String r7 = "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!"
            r5 = r7
            r1.logp(r2, r3, r4, r5, r6)
            r9 = 3
            java.nio.charset.Charset r12 = w9.b6.f17081a
            r8 = 6
            byte[] r12 = r13.getBytes(r12)
            r9 = 1
            int r13 = r12.length     // Catch: com.google.android.gms.internal.measurement.zzjd -> L89 java.lang.IndexOutOfBoundsException -> L8c
            r11.z0(r13)     // Catch: com.google.android.gms.internal.measurement.zzjd -> L89 java.lang.IndexOutOfBoundsException -> L8c
            r9 = 4
            r7 = 0
            r0 = r7
            r11.K0(r12, r0, r13)     // Catch: com.google.android.gms.internal.measurement.zzjd -> L89 java.lang.IndexOutOfBoundsException -> L8c
        L88:
            return
        L89:
            r12 = move-exception
            throw r12
            r8 = 7
        L8c:
            r12 = move-exception
            com.google.android.gms.internal.measurement.zzjd r13 = new com.google.android.gms.internal.measurement.zzjd
            r9 = 1
            r13.<init>(r12)
            r8 = 5
            throw r13
            r8 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.d.w0(int, java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void x0(int i10, int i11) {
        z0((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void y0(int i10, int i11) {
        z0(i10 << 3);
        z0(i11);
    }

    @Override // com.google.android.gms.internal.measurement.e
    public final void z0(int i10) {
        if (e.R) {
            int i11 = a5.f17066a;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.S;
                int i12 = this.U;
                this.U = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzjd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
            }
        }
        byte[] bArr2 = this.S;
        int i13 = this.U;
        this.U = i13 + 1;
        bArr2[i13] = (byte) i10;
    }
}
