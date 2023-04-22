package cz.msebera.android.httpclient.util;

import a1.a;
import java.io.Serializable;
import l9.e;

/* loaded from: classes.dex */
public final class ByteArrayBuffer implements Serializable {
    private static final long serialVersionUID = 4359112959524048036L;
    private byte[] buffer;
    private int len;

    public ByteArrayBuffer(int i10) {
        e.j(i10, "Buffer capacity");
        this.buffer = new byte[i10];
    }

    public void a(int i10) {
        int i11 = this.len + 1;
        if (i11 > this.buffer.length) {
            h(i11);
        }
        this.buffer[this.len] = (byte) i10;
        this.len = i11;
    }

    public void b(CharArrayBuffer charArrayBuffer, int i10, int i11) {
        int i12;
        char[] e10 = charArrayBuffer.e();
        if (e10 == null) {
            return;
        }
        if (i10 < 0 || i10 > e10.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > e10.length) {
            StringBuilder o10 = a.o("off: ", i10, " len: ", i11, " b.length: ");
            o10.append(e10.length);
            throw new IndexOutOfBoundsException(o10.toString());
        } else if (i11 == 0) {
        } else {
            int i13 = this.len;
            int i14 = i11 + i13;
            if (i14 > this.buffer.length) {
                h(i14);
            }
            while (i13 < i14) {
                this.buffer[i13] = (byte) e10[i10];
                i10++;
                i13++;
            }
            this.len = i14;
        }
    }

    public void c(byte[] bArr, int i10, int i11) {
        int i12;
        if (bArr == null) {
            return;
        }
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) < 0 || i12 > bArr.length) {
            StringBuilder o10 = a.o("off: ", i10, " len: ", i11, " b.length: ");
            o10.append(bArr.length);
            throw new IndexOutOfBoundsException(o10.toString());
        } else if (i11 == 0) {
        } else {
            int i13 = this.len + i11;
            if (i13 > this.buffer.length) {
                h(i13);
            }
            System.arraycopy(bArr, i10, this.buffer, this.len, i11);
            this.len = i13;
        }
    }

    public byte[] d() {
        return this.buffer;
    }

    public int e(int i10) {
        return this.buffer[i10];
    }

    public int f() {
        return this.buffer.length;
    }

    public void g() {
        this.len = 0;
    }

    public final void h(int i10) {
        byte[] bArr = new byte[Math.max(this.buffer.length << 1, i10)];
        System.arraycopy(this.buffer, 0, bArr, 0, this.len);
        this.buffer = bArr;
    }

    public boolean i() {
        return this.len == 0;
    }

    public boolean j() {
        return this.len == this.buffer.length;
    }

    public int k() {
        return this.len;
    }

    public byte[] l() {
        int i10 = this.len;
        byte[] bArr = new byte[i10];
        if (i10 > 0) {
            System.arraycopy(this.buffer, 0, bArr, 0, i10);
        }
        return bArr;
    }
}
