package com.google.android.gms.internal.cast;

import java.util.logging.Level;
import kotlin.KotlinVersion;
import t9.o3;
import t9.t1;

/* loaded from: classes.dex */
public final class i1 extends j1 {
    public final byte[] S;
    public final int T;
    public int U;

    public i1(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.S = bArr;
        this.U = 0;
        this.T = i11;
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void A0(int i10, long j10) {
        z0(i10 << 3);
        B0(j10);
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void B0(long j10) {
        if (j1.R && this.T - this.U >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.S;
                int i10 = this.U;
                this.U = i10 + 1;
                o3.f15313c.i(bArr, o3.f15315f + i10, (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.S;
            int i11 = this.U;
            this.U = i11 + 1;
            o3.f15313c.i(bArr2, o3.f15315f + i11, (byte) j10);
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
                throw new zzok(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
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
            throw new zzok(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), Integer.valueOf(i11)), e10);
        }
    }

    public final void K0(byte[] bArr, int i10, int i11) {
        J0(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void n0(byte b10) {
        try {
            byte[] bArr = this.S;
            int i10 = this.U;
            this.U = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzok(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void o0(int i10, boolean z10) {
        z0(i10 << 3);
        n0(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void p0(int i10, zzoe zzoeVar) {
        z0((i10 << 3) | 2);
        z0(zzoeVar.g());
        zzoeVar.m(this);
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void q0(int i10, int i11) {
        z0((i10 << 3) | 5);
        r0(i11);
    }

    @Override // com.google.android.gms.internal.cast.j1
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
            throw new zzok(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void s0(int i10, long j10) {
        z0((i10 << 3) | 1);
        t0(j10);
    }

    @Override // com.google.android.gms.internal.cast.j1
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
            throw new zzok(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void u0(int i10, int i11) {
        z0(i10 << 3);
        if (i11 >= 0) {
            z0(i11);
        } else {
            B0(i11);
        }
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void v0(int i10) {
        if (i10 >= 0) {
            z0(i10);
        } else {
            B0(i10);
        }
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void w0(int i10, String str) {
        z0((i10 << 3) | 2);
        int i11 = this.U;
        try {
            int l02 = j1.l0(str.length() * 3);
            int l03 = j1.l0(str.length());
            if (l03 == l02) {
                int i12 = i11 + l03;
                this.U = i12;
                int b10 = o1.b(str, this.S, i12, this.T - i12);
                this.U = i11;
                z0((b10 - i11) - l03);
                this.U = b10;
            } else {
                z0(o1.c(str));
                byte[] bArr = this.S;
                int i13 = this.U;
                this.U = o1.b(str, bArr, i13, this.T - i13);
            }
        } catch (zzrq e10) {
            this.U = i11;
            j1.Q.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
            byte[] bytes = str.getBytes(t1.f15353a);
            try {
                int length = bytes.length;
                z0(length);
                K0(bytes, 0, length);
            } catch (zzok e11) {
                throw e11;
            } catch (IndexOutOfBoundsException e12) {
                throw new zzok(e12);
            }
        } catch (IndexOutOfBoundsException e13) {
            throw new zzok(e13);
        }
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void x0(int i10, int i11) {
        z0((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void y0(int i10, int i11) {
        z0(i10 << 3);
        z0(i11);
    }

    @Override // com.google.android.gms.internal.cast.j1
    public final void z0(int i10) {
        if (j1.R) {
            int i11 = t9.y0.f15369a;
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.S;
                int i12 = this.U;
                this.U = i12 + 1;
                bArr[i12] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzok(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.U), Integer.valueOf(this.T), 1), e10);
            }
        }
        byte[] bArr2 = this.S;
        int i13 = this.U;
        this.U = i13 + 1;
        bArr2[i13] = (byte) i10;
    }
}
