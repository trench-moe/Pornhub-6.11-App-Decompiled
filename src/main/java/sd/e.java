package sd;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class e extends OutputStream {

    /* renamed from: c  reason: collision with root package name */
    public final td.c f14977c;

    /* renamed from: f  reason: collision with root package name */
    public final long f14978f;

    /* renamed from: j  reason: collision with root package name */
    public long f14979j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14980m;

    public e(td.c cVar, long j10) {
        l9.e.l(cVar, "Session output buffer");
        this.f14977c = cVar;
        l9.e.k(j10, "Content length");
        this.f14978f = j10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14980m) {
            return;
        }
        this.f14980m = true;
        this.f14977c.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f14977c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (this.f14980m) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.f14979j < this.f14978f) {
            this.f14977c.c(i10);
            this.f14979j++;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (this.f14980m) {
            throw new IOException("Attempted write to closed stream.");
        }
        long j10 = this.f14979j;
        long j11 = this.f14978f;
        if (j10 < j11) {
            long j12 = j11 - j10;
            if (i11 > j12) {
                i11 = (int) j12;
            }
            this.f14977c.j(bArr, i10, i11);
            this.f14979j += i11;
        }
    }
}
