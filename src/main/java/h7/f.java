package h7;

import c7.i;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class f {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f10223a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public int f10224b;

    /* renamed from: c  reason: collision with root package name */
    public int f10225c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j10 = bArr[0] & 255;
        if (z10) {
            j10 &= ~d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (bArr[i11] & 255);
        }
        return j10;
    }

    public static int b(int i10) {
        int i11 = 0;
        while (true) {
            long[] jArr = d;
            if (i11 >= jArr.length) {
                return -1;
            }
            if ((jArr[i11] & i10) != 0) {
                return i11 + 1;
            }
            i11++;
        }
    }

    public long c(i iVar, boolean z10, boolean z11, int i10) {
        if (this.f10224b == 0) {
            if (!iVar.d(this.f10223a, 0, 1, z10)) {
                return -1L;
            }
            int b10 = b(this.f10223a[0] & UByte.MAX_VALUE);
            this.f10225c = b10;
            if (b10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f10224b = 1;
        }
        int i11 = this.f10225c;
        if (i11 > i10) {
            this.f10224b = 0;
            return -2L;
        }
        if (i11 != 1) {
            iVar.readFully(this.f10223a, 1, i11 - 1);
        }
        this.f10224b = 0;
        return a(this.f10223a, this.f10225c, z11);
    }
}
