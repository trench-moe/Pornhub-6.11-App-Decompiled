package sd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class m extends OutputStream {

    /* renamed from: c  reason: collision with root package name */
    public final td.c f14991c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14992f = false;

    public m(td.c cVar) {
        l9.e.l(cVar, "Session output buffer");
        this.f14991c = cVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14992f) {
            return;
        }
        this.f14992f = true;
        this.f14991c.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f14991c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (this.f14992f) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f14991c.c(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (this.f14992f) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.f14991c.j(bArr, i10, i11);
    }
}
