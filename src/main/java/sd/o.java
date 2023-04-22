package sd;

import cz.msebera.android.httpclient.util.ByteArrayBuffer;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

/* loaded from: classes2.dex */
public class o implements td.c, td.a {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f15002g = {13, 10};

    /* renamed from: a  reason: collision with root package name */
    public final k f15003a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteArrayBuffer f15004b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15005c;
    public final CharsetEncoder d;

    /* renamed from: e  reason: collision with root package name */
    public OutputStream f15006e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f15007f;

    public o(k kVar, int i10, int i11, CharsetEncoder charsetEncoder) {
        l9.e.m(i10, "Buffer size");
        this.f15003a = kVar;
        this.f15004b = new ByteArrayBuffer(i10);
        this.f15005c = i11 < 0 ? 0 : i11;
        this.d = charsetEncoder;
    }

    @Override // td.c
    public void a(String str) {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            if (this.d == null) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    c(str.charAt(i10));
                }
            } else {
                f(CharBuffer.wrap(str));
            }
        }
        byte[] bArr = f15002g;
        j(bArr, 0, bArr.length);
    }

    @Override // td.c
    public void b(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return;
        }
        if (this.d == null) {
            int length = charArrayBuffer.length();
            int i10 = 0;
            while (length > 0) {
                int min = Math.min(this.f15004b.f() - this.f15004b.k(), length);
                if (min > 0) {
                    this.f15004b.b(charArrayBuffer, i10, min);
                }
                if (this.f15004b.j()) {
                    d();
                }
                i10 += min;
                length -= min;
            }
        } else {
            f(CharBuffer.wrap(charArrayBuffer.e(), 0, charArrayBuffer.length()));
        }
        byte[] bArr = f15002g;
        j(bArr, 0, bArr.length);
    }

    @Override // td.c
    public void c(int i10) {
        if (this.f15005c <= 0) {
            d();
            this.f15006e.write(i10);
            return;
        }
        if (this.f15004b.j()) {
            d();
        }
        this.f15004b.a(i10);
    }

    public final void d() {
        int k10 = this.f15004b.k();
        if (k10 > 0) {
            byte[] d = this.f15004b.d();
            cb.e.W(this.f15006e, "Output stream");
            this.f15006e.write(d, 0, k10);
            this.f15004b.g();
            this.f15003a.a(k10);
        }
    }

    public final void e(CoderResult coderResult) {
        if (coderResult.isError()) {
            coderResult.throwException();
        }
        this.f15007f.flip();
        while (this.f15007f.hasRemaining()) {
            c(this.f15007f.get());
        }
        this.f15007f.compact();
    }

    public final void f(CharBuffer charBuffer) {
        if (charBuffer.hasRemaining()) {
            if (this.f15007f == null) {
                this.f15007f = ByteBuffer.allocate(1024);
            }
            this.d.reset();
            while (charBuffer.hasRemaining()) {
                e(this.d.encode(charBuffer, this.f15007f, true));
            }
            e(this.d.flush(this.f15007f));
            this.f15007f.clear();
        }
    }

    @Override // td.c
    public void flush() {
        d();
        OutputStream outputStream = this.f15006e;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    @Override // td.c
    public void j(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            return;
        }
        if (i11 <= this.f15005c && i11 <= this.f15004b.f()) {
            if (i11 > this.f15004b.f() - this.f15004b.k()) {
                d();
            }
            this.f15004b.c(bArr, i10, i11);
            return;
        }
        d();
        cb.e.W(this.f15006e, "Output stream");
        this.f15006e.write(bArr, i10, i11);
        this.f15003a.a(i11);
    }

    @Override // td.a
    public int length() {
        return this.f15004b.k();
    }
}
