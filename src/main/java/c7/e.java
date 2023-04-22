package c7;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import k8.c0;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: b  reason: collision with root package name */
    public final j8.d f3796b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3797c;
    public long d;

    /* renamed from: f  reason: collision with root package name */
    public int f3799f;

    /* renamed from: g  reason: collision with root package name */
    public int f3800g;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f3798e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3795a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    public e(j8.d dVar, long j10, long j11) {
        this.f3796b = dVar;
        this.d = j10;
        this.f3797c = j11;
    }

    @Override // c7.i, j8.d
    public int a(byte[] bArr, int i10, int i11) {
        int i12 = this.f3800g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f3798e, 0, bArr, i10, min);
            t(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = s(bArr, i10, i11, 0, true);
        }
        q(i13);
        return i13;
    }

    @Override // c7.i
    public long b() {
        return this.f3797c;
    }

    @Override // c7.i
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.f3800g;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f3798e, 0, bArr, i10, min);
            t(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = s(bArr, i10, i11, i13, z10);
        }
        q(i13);
        return i13 != -1;
    }

    @Override // c7.i
    public boolean e(byte[] bArr, int i10, int i11, boolean z10) {
        if (p(i11, z10)) {
            System.arraycopy(this.f3798e, this.f3799f - i11, bArr, i10, i11);
            return true;
        }
        return false;
    }

    @Override // c7.i
    public long f() {
        return this.d + this.f3799f;
    }

    @Override // c7.i
    public void g(int i10) {
        p(i10, false);
    }

    @Override // c7.i
    public long getPosition() {
        return this.d;
    }

    @Override // c7.i
    public int h(int i10) {
        int min = Math.min(this.f3800g, i10);
        t(min);
        if (min == 0) {
            byte[] bArr = this.f3795a;
            min = s(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        q(min);
        return min;
    }

    @Override // c7.i
    public int i(byte[] bArr, int i10, int i11) {
        int min;
        r(i11);
        int i12 = this.f3800g;
        int i13 = this.f3799f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = s(this.f3798e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f3800g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f3798e, this.f3799f, bArr, i10, min);
        this.f3799f += min;
        return min;
    }

    @Override // c7.i
    public void l() {
        this.f3799f = 0;
    }

    @Override // c7.i
    public void m(int i10) {
        int min = Math.min(this.f3800g, i10);
        t(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = s(this.f3795a, -i11, Math.min(i10, this.f3795a.length + i11), i11, false);
        }
        q(i11);
    }

    @Override // c7.i
    public void o(byte[] bArr, int i10, int i11) {
        e(bArr, i10, i11, false);
    }

    public boolean p(int i10, boolean z10) {
        r(i10);
        int i11 = this.f3800g - this.f3799f;
        while (i11 < i10) {
            i11 = s(this.f3798e, this.f3799f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f3800g = this.f3799f + i11;
        }
        this.f3799f += i10;
        return true;
    }

    public final void q(int i10) {
        if (i10 != -1) {
            this.d += i10;
        }
    }

    public final void r(int i10) {
        int i11 = this.f3799f + i10;
        byte[] bArr = this.f3798e;
        if (i11 > bArr.length) {
            this.f3798e = Arrays.copyOf(this.f3798e, c0.h(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    @Override // c7.i
    public void readFully(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, false);
    }

    public final int s(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int a10 = this.f3796b.a(bArr, i10 + i12, i11 - i12);
        if (a10 == -1) {
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        return i12 + a10;
    }

    public final void t(int i10) {
        int i11 = this.f3800g - i10;
        this.f3800g = i11;
        this.f3799f = 0;
        byte[] bArr = this.f3798e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f3798e = bArr2;
    }
}
