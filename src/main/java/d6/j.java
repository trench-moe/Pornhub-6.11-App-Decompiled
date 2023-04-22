package d6;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class j extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public int f8799c;

    public j(InputStream inputStream) {
        super(inputStream);
        this.f8799c = IntCompanionObject.MIN_VALUE;
    }

    public final long a(long j10) {
        int i10 = this.f8799c;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f8799c;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final void c(long j10) {
        int i10 = this.f8799c;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f8799c = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f8799c = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        c(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int a10 = (int) a(i11);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, a10);
        c(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f8799c = IntCompanionObject.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0L;
        }
        long skip = super.skip(a10);
        c(skip);
        return skip;
    }
}
