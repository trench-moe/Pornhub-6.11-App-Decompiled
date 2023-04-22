package sd;

import java.io.InputStream;

/* loaded from: classes2.dex */
public class l extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public final td.b f14989c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14990f = false;

    public l(td.b bVar) {
        l9.e.l(bVar, "Session input buffer");
        this.f14989c = bVar;
    }

    @Override // java.io.InputStream
    public int available() {
        td.b bVar = this.f14989c;
        if (bVar instanceof td.a) {
            return ((td.a) bVar).length();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14990f = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f14990f) {
            return -1;
        }
        return this.f14989c.b();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f14990f) {
            return -1;
        }
        return this.f14989c.a(bArr, i10, i11);
    }
}
