package f5;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public class b implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final InputStream f9447c;

    /* renamed from: f  reason: collision with root package name */
    public final Charset f9448f;

    /* renamed from: j  reason: collision with root package name */
    public byte[] f9449j;

    /* renamed from: m  reason: collision with root package name */
    public int f9450m;
    public int n;

    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f9448f.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(c.f9452a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f9447c = inputStream;
        this.f9448f = charset;
        this.f9449j = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
    }

    public final void a() {
        InputStream inputStream = this.f9447c;
        byte[] bArr = this.f9449j;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f9450m = 0;
        this.n = read;
    }

    public String c() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.f9447c) {
            if (this.f9449j != null) {
                if (this.f9450m >= this.n) {
                    a();
                }
                for (int i12 = this.f9450m; i12 != this.n; i12++) {
                    byte[] bArr2 = this.f9449j;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f9450m;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.f9448f.name());
                                this.f9450m = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.f9448f.name());
                        this.f9450m = i12 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.n - this.f9450m) + 80);
                loop1: while (true) {
                    byte[] bArr3 = this.f9449j;
                    int i14 = this.f9450m;
                    aVar.write(bArr3, i14, this.n - i14);
                    this.n = -1;
                    a();
                    i10 = this.f9450m;
                    while (i10 != this.n) {
                        bArr = this.f9449j;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.f9450m;
                if (i10 != i15) {
                    aVar.write(bArr, i15, i10 - i15);
                }
                this.f9450m = i10 + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f9447c) {
            if (this.f9449j != null) {
                this.f9449j = null;
                this.f9447c.close();
            }
        }
    }
}
