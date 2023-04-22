package d6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public final long f8783c;

    /* renamed from: f  reason: collision with root package name */
    public int f8784f;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f8783c = j10;
    }

    public final int a(int i10) {
        if (i10 >= 0) {
            this.f8784f += i10;
        } else if (this.f8783c - this.f8784f > 0) {
            StringBuilder m10 = a1.a.m("Failed to read all expected data, expected: ");
            m10.append(this.f8783c);
            m10.append(", but read: ");
            m10.append(this.f8784f);
            throw new IOException(m10.toString());
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f8783c - this.f8784f, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        try {
            read = super.read();
            a(read >= 0 ? 1 : -1);
        } catch (Throwable th) {
            throw th;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        a(read);
        return read;
    }
}
