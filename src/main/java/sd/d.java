package sd;

import cz.msebera.android.httpclient.ConnectionClosedException;
import java.io.IOException;
import java.io.InputStream;
import l.InterfaceC0186;

/* loaded from: classes2.dex */
public class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public final long f14973c;

    /* renamed from: f  reason: collision with root package name */
    public long f14974f = 0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14975j = false;

    /* renamed from: m  reason: collision with root package name */
    public td.b f14976m;

    public d(td.b bVar, long j10) {
        this.f14976m = null;
        l9.e.l(bVar, "Session input buffer");
        this.f14976m = bVar;
        l9.e.k(j10, "Content length");
        this.f14973c = j10;
    }

    @Override // java.io.InputStream
    public int available() {
        td.b bVar = this.f14976m;
        if (bVar instanceof td.a) {
            return Math.min(((td.a) bVar).length(), (int) (this.f14973c - this.f14974f));
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f14975j) {
            return;
        }
        try {
            if (this.f14974f < this.f14973c) {
                while (read(new byte[InterfaceC0186.f43]) >= 0) {
                }
            }
        } finally {
            this.f14975j = true;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f14975j) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.f14974f >= this.f14973c) {
            return -1;
        }
        int b10 = this.f14976m.b();
        if (b10 != -1) {
            this.f14974f++;
        } else if (this.f14974f < this.f14973c) {
            throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f14973c), Long.valueOf(this.f14974f));
        }
        return b10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (this.f14975j) {
            throw new IOException("Attempted read from closed stream.");
        }
        long j10 = this.f14974f;
        long j11 = this.f14973c;
        if (j10 >= j11) {
            return -1;
        }
        if (i11 + j10 > j11) {
            i11 = (int) (j11 - j10);
        }
        int a10 = this.f14976m.a(bArr, i10, i11);
        if (a10 != -1 || this.f14974f >= this.f14973c) {
            if (a10 > 0) {
                this.f14974f += a10;
            }
            return a10;
        }
        throw new ConnectionClosedException("Premature end of Content-Length delimited message body (expected: %,d; received: %,d)", Long.valueOf(this.f14973c), Long.valueOf(this.f14974f));
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        int read;
        if (j10 <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[InterfaceC0186.f43];
        long min = Math.min(j10, this.f14973c - this.f14974f);
        long j11 = 0;
        while (min > 0 && (read = read(bArr, 0, (int) Math.min(2048L, min))) != -1) {
            long j12 = read;
            j11 += j12;
            min -= j12;
        }
        return j11;
    }
}
