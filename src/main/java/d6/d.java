package d6;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: j  reason: collision with root package name */
    public static final Queue<d> f8785j;

    /* renamed from: c  reason: collision with root package name */
    public InputStream f8786c;

    /* renamed from: f  reason: collision with root package name */
    public IOException f8787f;

    static {
        char[] cArr = l.f8803a;
        f8785j = new ArrayDeque(0);
    }

    public void a() {
        this.f8787f = null;
        this.f8786c = null;
        Queue<d> queue = f8785j;
        synchronized (queue) {
            ((ArrayDeque) queue).offer(this);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f8786c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f8786c.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.f8786c.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f8786c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f8786c.read();
        } catch (IOException e10) {
            this.f8787f = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f8786c.read(bArr);
        } catch (IOException e10) {
            this.f8787f = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f8786c.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f8787f = e10;
            throw e10;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        try {
            this.f8786c.reset();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        try {
            return this.f8786c.skip(j10);
        } catch (IOException e10) {
            this.f8787f = e10;
            throw e10;
        }
    }
}
