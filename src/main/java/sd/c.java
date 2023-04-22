package sd;

import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class c extends OutputStream {

    /* renamed from: c  reason: collision with root package name */
    public final td.c f14969c;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f14970f;

    /* renamed from: j  reason: collision with root package name */
    public int f14971j = 0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14972m = false;
    public boolean n = false;

    public c(int i10, td.c cVar) {
        this.f14970f = new byte[i10];
        this.f14969c = cVar;
    }

    public void a() {
        int i10 = this.f14971j;
        if (i10 > 0) {
            this.f14969c.a(Integer.toHexString(i10));
            this.f14969c.j(this.f14970f, 0, this.f14971j);
            this.f14969c.a(BuildConfig.FLAVOR);
            this.f14971j = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.n) {
            return;
        }
        this.n = true;
        if (!this.f14972m) {
            a();
            this.f14969c.a("0");
            this.f14969c.a(BuildConfig.FLAVOR);
            this.f14972m = true;
        }
        this.f14969c.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f14969c.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        if (this.n) {
            throw new IOException("Attempted write to closed stream.");
        }
        byte[] bArr = this.f14970f;
        int i11 = this.f14971j;
        bArr[i11] = (byte) i10;
        int i12 = i11 + 1;
        this.f14971j = i12;
        if (i12 == bArr.length) {
            a();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        if (this.n) {
            throw new IOException("Attempted write to closed stream.");
        }
        byte[] bArr2 = this.f14970f;
        int length = bArr2.length;
        int i12 = this.f14971j;
        if (i11 < length - i12) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f14971j += i11;
            return;
        }
        this.f14969c.a(Integer.toHexString(i12 + i11));
        this.f14969c.j(this.f14970f, 0, this.f14971j);
        this.f14969c.j(bArr, i10, i11);
        this.f14969c.a(BuildConfig.FLAVOR);
        this.f14971j = 0;
    }
}
