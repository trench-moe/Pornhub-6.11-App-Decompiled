package sd;

import cz.msebera.android.httpclient.MessageConstraintException;
import cz.msebera.android.httpclient.util.ByteArrayBuffer;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class n implements td.b, td.a {

    /* renamed from: a  reason: collision with root package name */
    public final k f14993a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f14994b;

    /* renamed from: c  reason: collision with root package name */
    public final ByteArrayBuffer f14995c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final od.a f14996e;

    /* renamed from: f  reason: collision with root package name */
    public final CharsetDecoder f14997f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f14998g;

    /* renamed from: h  reason: collision with root package name */
    public int f14999h;

    /* renamed from: i  reason: collision with root package name */
    public int f15000i;

    /* renamed from: j  reason: collision with root package name */
    public CharBuffer f15001j;

    public n(k kVar, int i10, int i11, od.a aVar, CharsetDecoder charsetDecoder) {
        l9.e.m(i10, "Buffer size");
        this.f14993a = kVar;
        this.f14994b = new byte[i10];
        this.f14999h = 0;
        this.f15000i = 0;
        this.d = i11 < 0 ? ConstantsKt.MINIMUM_BLOCK_SIZE : i11;
        this.f14996e = aVar;
        this.f14995c = new ByteArrayBuffer(i10);
        this.f14997f = charsetDecoder;
    }

    @Override // td.b
    public int a(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return 0;
        }
        if (g()) {
            int min = Math.min(i11, this.f15000i - this.f14999h);
            System.arraycopy(this.f14994b, this.f14999h, bArr, i10, min);
            this.f14999h += min;
            return min;
        } else if (i11 > this.d) {
            cb.e.W(this.f14998g, "Input stream");
            int read = this.f14998g.read(bArr, i10, i11);
            if (read > 0) {
                this.f14993a.a(read);
            }
            return read;
        } else {
            while (!g()) {
                if (e() == -1) {
                    return -1;
                }
            }
            int min2 = Math.min(i11, this.f15000i - this.f14999h);
            System.arraycopy(this.f14994b, this.f14999h, bArr, i10, min2);
            this.f14999h += min2;
            return min2;
        }
    }

    @Override // td.b
    public int b() {
        while (!g()) {
            if (e() == -1) {
                return -1;
            }
        }
        byte[] bArr = this.f14994b;
        int i10 = this.f14999h;
        this.f14999h = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    @Override // td.b
    public int c(CharArrayBuffer charArrayBuffer) {
        l9.e.l(charArrayBuffer, "Char array buffer");
        int i10 = this.f14996e.f13636c;
        boolean z10 = true;
        int i11 = 0;
        while (true) {
            while (z10) {
                int i12 = this.f14999h;
                while (true) {
                    if (i12 >= this.f15000i) {
                        i12 = -1;
                        break;
                    } else if (this.f14994b[i12] == 10) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i10 > 0) {
                    if ((this.f14995c.k() + (i12 >= 0 ? i12 : this.f15000i)) - this.f14999h >= i10) {
                        throw new MessageConstraintException("Maximum line length limit exceeded");
                    }
                }
                if (i12 == -1) {
                    if (g()) {
                        int i13 = this.f15000i;
                        int i14 = this.f14999h;
                        this.f14995c.c(this.f14994b, i14, i13 - i14);
                        this.f14999h = this.f15000i;
                    }
                    i11 = e();
                    if (i11 == -1) {
                    }
                } else if (this.f14995c.i()) {
                    int i15 = this.f14999h;
                    this.f14999h = i12 + 1;
                    if (i12 > i15) {
                        int i16 = i12 - 1;
                        if (this.f14994b[i16] == 13) {
                            i12 = i16;
                        }
                    }
                    int i17 = i12 - i15;
                    if (this.f14997f == null) {
                        charArrayBuffer.d(this.f14994b, i15, i17);
                        return i17;
                    }
                    return d(charArrayBuffer, ByteBuffer.wrap(this.f14994b, i15, i17));
                } else {
                    int i18 = i12 + 1;
                    int i19 = this.f14999h;
                    this.f14995c.c(this.f14994b, i19, i18 - i19);
                    this.f14999h = i18;
                }
                z10 = false;
            }
            if (i11 == -1 && this.f14995c.i()) {
                return -1;
            }
            int k10 = this.f14995c.k();
            if (k10 > 0) {
                int i20 = k10 - 1;
                if (this.f14995c.e(i20) == 10) {
                    k10 = i20;
                }
                if (k10 > 0) {
                    int i21 = k10 - 1;
                    if (this.f14995c.e(i21) == 13) {
                        k10 = i21;
                    }
                }
            }
            if (this.f14997f == null) {
                ByteArrayBuffer byteArrayBuffer = this.f14995c;
                if (byteArrayBuffer != null) {
                    charArrayBuffer.d(byteArrayBuffer.d(), 0, k10);
                }
            } else {
                k10 = d(charArrayBuffer, ByteBuffer.wrap(this.f14995c.d(), 0, k10));
            }
            this.f14995c.g();
            return k10;
        }
    }

    public final int d(CharArrayBuffer charArrayBuffer, ByteBuffer byteBuffer) {
        int i10 = 0;
        if (byteBuffer.hasRemaining()) {
            if (this.f15001j == null) {
                this.f15001j = CharBuffer.allocate(1024);
            }
            this.f14997f.reset();
            while (byteBuffer.hasRemaining()) {
                i10 += f(this.f14997f.decode(byteBuffer, this.f15001j, true), charArrayBuffer);
            }
            int f10 = f(this.f14997f.flush(this.f15001j), charArrayBuffer) + i10;
            this.f15001j.clear();
            return f10;
        }
        return 0;
    }

    public int e() {
        int i10 = this.f14999h;
        if (i10 > 0) {
            int i11 = this.f15000i - i10;
            if (i11 > 0) {
                byte[] bArr = this.f14994b;
                System.arraycopy(bArr, i10, bArr, 0, i11);
            }
            this.f14999h = 0;
            this.f15000i = i11;
        }
        int i12 = this.f15000i;
        byte[] bArr2 = this.f14994b;
        cb.e.W(this.f14998g, "Input stream");
        int read = this.f14998g.read(bArr2, i12, bArr2.length - i12);
        if (read == -1) {
            return -1;
        }
        this.f15000i = i12 + read;
        this.f14993a.a(read);
        return read;
    }

    public final int f(CoderResult coderResult, CharArrayBuffer charArrayBuffer) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f15001j.flip();
        int remaining = this.f15001j.remaining();
        while (this.f15001j.hasRemaining()) {
            charArrayBuffer.a(this.f15001j.get());
        }
        this.f15001j.compact();
        return remaining;
    }

    public boolean g() {
        return this.f14999h < this.f15000i;
    }

    @Override // td.a
    public int length() {
        return this.f15000i - this.f14999h;
    }
}
