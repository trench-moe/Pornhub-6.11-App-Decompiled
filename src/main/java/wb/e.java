package wb;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class e implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public static final Logger f17439u = Logger.getLogger(e.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public final RandomAccessFile f17440c;

    /* renamed from: f  reason: collision with root package name */
    public int f17441f;

    /* renamed from: j  reason: collision with root package name */
    public int f17442j;

    /* renamed from: m  reason: collision with root package name */
    public b f17443m;
    public b n;

    /* renamed from: t  reason: collision with root package name */
    public final byte[] f17444t = new byte[16];

    /* loaded from: classes2.dex */
    public class a {
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f17445c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f17446a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17447b;

        public b(int i10, int i11) {
            this.f17446a = i10;
            this.f17447b = i11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f17446a);
            sb2.append(", length = ");
            return android.support.v4.media.a.j(sb2, this.f17447b, "]");
        }
    }

    /* loaded from: classes2.dex */
    public final class c extends InputStream {

        /* renamed from: c  reason: collision with root package name */
        public int f17448c;

        /* renamed from: f  reason: collision with root package name */
        public int f17449f;

        public c(b bVar, a aVar) {
            int i10 = bVar.f17446a + 4;
            int i11 = e.this.f17441f;
            this.f17448c = i10 >= i11 ? (i10 + 16) - i11 : i10;
            this.f17449f = bVar.f17447b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f17449f == 0) {
                return -1;
            }
            e.this.f17440c.seek(this.f17448c);
            int read = e.this.f17440c.read();
            this.f17448c = e.a(e.this, this.f17448c + 1);
            this.f17449f--;
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            Objects.requireNonNull(bArr, "buffer");
            if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = this.f17449f;
            if (i12 > 0) {
                if (i11 > i12) {
                    i11 = i12;
                }
                e.this.m(this.f17448c, bArr, i10, i11);
                this.f17448c = e.a(e.this, this.f17448c + i11);
                this.f17449f -= i11;
                return i11;
            }
            return -1;
        }
    }

    public e(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {ConstantsKt.DEFAULT_BLOCK_SIZE, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    w(bArr, i10, iArr[i11]);
                    i10 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f17440c = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(this.f17444t);
        int i12 = i(this.f17444t, 0);
        this.f17441f = i12;
        if (i12 > randomAccessFile2.length()) {
            StringBuilder m10 = a1.a.m("File is truncated. Expected length: ");
            m10.append(this.f17441f);
            m10.append(", Actual length: ");
            m10.append(randomAccessFile2.length());
            throw new IOException(m10.toString());
        }
        this.f17442j = i(this.f17444t, 4);
        int i13 = i(this.f17444t, 8);
        int i14 = i(this.f17444t, 12);
        this.f17443m = h(i13);
        this.n = h(i14);
    }

    public static int a(e eVar, int i10) {
        int i11 = eVar.f17441f;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public static int i(byte[] bArr, int i10) {
        return ((bArr[i10] & UByte.MAX_VALUE) << 24) + ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8) + (bArr[i10 + 3] & UByte.MAX_VALUE);
    }

    public static void w(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public void c(byte[] bArr) {
        int t2;
        int length = bArr.length;
        synchronized (this) {
            if ((0 | length) >= 0) {
                try {
                    if (length <= bArr.length - 0) {
                        e(length);
                        boolean f10 = f();
                        if (f10) {
                            t2 = 16;
                        } else {
                            b bVar = this.n;
                            t2 = t(bVar.f17446a + 4 + bVar.f17447b);
                        }
                        b bVar2 = new b(t2, length);
                        w(this.f17444t, 0, length);
                        n(t2, this.f17444t, 0, 4);
                        n(t2 + 4, bArr, 0, length);
                        v(this.f17441f, this.f17442j + 1, f10 ? t2 : this.f17443m.f17446a, t2);
                        this.n = bVar2;
                        this.f17442j++;
                        if (f10) {
                            this.f17443m = bVar2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            this.f17440c.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d() {
        try {
            v(ConstantsKt.DEFAULT_BLOCK_SIZE, 0, 0, 0);
            this.f17442j = 0;
            b bVar = b.f17445c;
            this.f17443m = bVar;
            this.n = bVar;
            if (this.f17441f > 4096) {
                this.f17440c.setLength((long) ConstantsKt.DEFAULT_BLOCK_SIZE);
                this.f17440c.getChannel().force(true);
            }
            this.f17441f = ConstantsKt.DEFAULT_BLOCK_SIZE;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(int i10) {
        int i11 = i10 + 4;
        int s10 = this.f17441f - s();
        if (s10 >= i11) {
            return;
        }
        int i12 = this.f17441f;
        do {
            s10 += i12;
            i12 <<= 1;
        } while (s10 < i11);
        this.f17440c.setLength(i12);
        this.f17440c.getChannel().force(true);
        b bVar = this.n;
        int t2 = t(bVar.f17446a + 4 + bVar.f17447b);
        if (t2 < this.f17443m.f17446a) {
            FileChannel channel = this.f17440c.getChannel();
            channel.position(this.f17441f);
            long j10 = t2 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.n.f17446a;
        int i14 = this.f17443m.f17446a;
        if (i13 < i14) {
            int i15 = (this.f17441f + i13) - 16;
            v(i12, this.f17442j, i14, i15);
            this.n = new b(i15, this.n.f17447b);
        } else {
            v(i12, this.f17442j, i14, i13);
        }
        this.f17441f = i12;
    }

    public synchronized boolean f() {
        return this.f17442j == 0;
    }

    public final b h(int i10) {
        if (i10 == 0) {
            return b.f17445c;
        }
        this.f17440c.seek(i10);
        return new b(i10, this.f17440c.readInt());
    }

    public synchronized void k() {
        if (f()) {
            throw new NoSuchElementException();
        }
        if (this.f17442j == 1) {
            d();
        } else {
            b bVar = this.f17443m;
            int t2 = t(bVar.f17446a + 4 + bVar.f17447b);
            m(t2, this.f17444t, 0, 4);
            int i10 = i(this.f17444t, 0);
            v(this.f17441f, this.f17442j - 1, t2, this.n.f17446a);
            this.f17442j--;
            this.f17443m = new b(t2, i10);
        }
    }

    public final void m(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f17441f;
        if (i10 >= i13) {
            i10 = (i10 + 16) - i13;
        }
        if (i10 + i12 <= i13) {
            this.f17440c.seek(i10);
            this.f17440c.readFully(bArr, i11, i12);
            return;
        }
        int i14 = i13 - i10;
        this.f17440c.seek(i10);
        this.f17440c.readFully(bArr, i11, i14);
        this.f17440c.seek(16L);
        this.f17440c.readFully(bArr, i11 + i14, i12 - i14);
    }

    public final void n(int i10, byte[] bArr, int i11, int i12) {
        int i13 = this.f17441f;
        if (i10 >= i13) {
            i10 = (i10 + 16) - i13;
        }
        if (i10 + i12 <= i13) {
            this.f17440c.seek(i10);
            this.f17440c.write(bArr, i11, i12);
            return;
        }
        int i14 = i13 - i10;
        this.f17440c.seek(i10);
        this.f17440c.write(bArr, i11, i14);
        this.f17440c.seek(16L);
        this.f17440c.write(bArr, i11 + i14, i12 - i14);
    }

    public int s() {
        if (this.f17442j == 0) {
            return 16;
        }
        b bVar = this.n;
        int i10 = bVar.f17446a;
        int i11 = this.f17443m.f17446a;
        return i10 >= i11 ? (i10 - i11) + 4 + bVar.f17447b + 16 : (((i10 + 4) + bVar.f17447b) + this.f17441f) - i11;
    }

    public final int t(int i10) {
        int i11 = this.f17441f;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.class.getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f17441f);
        sb2.append(", size=");
        sb2.append(this.f17442j);
        sb2.append(", first=");
        sb2.append(this.f17443m);
        sb2.append(", last=");
        sb2.append(this.n);
        sb2.append(", element lengths=[");
        try {
            synchronized (this) {
                int i10 = this.f17443m.f17446a;
                boolean z10 = true;
                for (int i11 = 0; i11 < this.f17442j; i11++) {
                    b h10 = h(i10);
                    new c(h10, null);
                    int i12 = h10.f17447b;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i12);
                    i10 = t(h10.f17446a + 4 + h10.f17447b);
                }
            }
        } catch (IOException e10) {
            f17439u.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final void v(int i10, int i11, int i12, int i13) {
        byte[] bArr = this.f17444t;
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            w(bArr, i14, iArr[i15]);
            i14 += 4;
        }
        this.f17440c.seek(0L);
        this.f17440c.write(this.f17444t);
    }
}
