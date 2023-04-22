package j8;

import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class g extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public final f f11570c;

    /* renamed from: f  reason: collision with root package name */
    public final h f11571f;

    /* renamed from: t  reason: collision with root package name */
    public long f11574t;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11573m = false;
    public boolean n = false;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f11572j = new byte[1];

    public g(f fVar, h hVar) {
        this.f11570c = fVar;
        this.f11571f = hVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.n) {
            this.f11570c.close();
            this.n = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f11572j) == -1) {
            return -1;
        }
        return this.f11572j[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        k8.a.f(!this.n);
        if (!this.f11573m) {
            this.f11570c.j(this.f11571f);
            this.f11573m = true;
        }
        int a10 = this.f11570c.a(bArr, i10, i11);
        if (a10 == -1) {
            return -1;
        }
        this.f11574t += a10;
        return a10;
    }
}
