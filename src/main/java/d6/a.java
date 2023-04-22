package d6;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference<byte[]> f8777a = new AtomicReference<>();

    /* renamed from: d6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0120a extends InputStream {

        /* renamed from: c  reason: collision with root package name */
        public final ByteBuffer f8778c;

        /* renamed from: f  reason: collision with root package name */
        public int f8779f = -1;

        public C0120a(ByteBuffer byteBuffer) {
            this.f8778c = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f8778c.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i10) {
            this.f8779f = this.f8778c.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f8778c.hasRemaining()) {
                return this.f8778c.get() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (this.f8778c.hasRemaining()) {
                int min = Math.min(i11, available());
                this.f8778c.get(bArr, i10, min);
                return min;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            try {
                int i10 = this.f8779f;
                if (i10 == -1) {
                    throw new IOException("Cannot reset to unset mark position");
                }
                this.f8778c.position(i10);
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            if (this.f8778c.hasRemaining()) {
                long min = Math.min(j10, available());
                ByteBuffer byteBuffer = this.f8778c;
                byteBuffer.position((int) (byteBuffer.position() + min));
                return min;
            }
            return -1L;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8780a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8781b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f8782c;

        public b(byte[] bArr, int i10, int i11) {
            this.f8782c = bArr;
            this.f8780a = i10;
            this.f8781b = i11;
        }
    }

    public static ByteBuffer a(File file) {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                if (length != 0) {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        fileChannel = randomAccessFile.getChannel();
                        MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        try {
                            fileChannel.close();
                        } catch (IOException unused) {
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        return load;
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused4) {
                            }
                        }
                        throw th;
                    }
                }
                throw new IOException("File unsuitable for memory mapping");
            }
            throw new IOException("File too large to map into memory");
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static ByteBuffer b(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f8777a.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                f8777a.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return c(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }

    public static ByteBuffer c(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.nio.ByteBuffer r8, java.io.File r9) {
        /*
            r4 = r8
            r6 = 0
            r0 = r6
            java.nio.Buffer r6 = r4.position(r0)
            r1 = r6
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r7 = 0
            r1 = r7
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L2f
            r7 = 6
            java.lang.String r3 = "rw"
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L2f
            r6 = 6
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L2d
            r1.write(r4)     // Catch: java.lang.Throwable -> L2d
            r1.force(r0)     // Catch: java.lang.Throwable -> L2d
            r1.close()     // Catch: java.lang.Throwable -> L2d
            r2.close()     // Catch: java.lang.Throwable -> L2d
            r6 = 5
            r1.close()     // Catch: java.io.IOException -> L29
        L29:
            r2.close()     // Catch: java.io.IOException -> L2c
        L2c:
            return
        L2d:
            r4 = move-exception
            goto L31
        L2f:
            r4 = move-exception
            r2 = r1
        L31:
            if (r1 == 0) goto L39
            r1.close()     // Catch: java.io.IOException -> L37
            goto L3a
        L37:
            r6 = 1
        L39:
            r7 = 3
        L3a:
            if (r2 == 0) goto L41
            r6 = 5
            r7 = 3
            r2.close()     // Catch: java.io.IOException -> L41
        L41:
            r6 = 1
            throw r4
            r6 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.a.d(java.nio.ByteBuffer, java.io.File):void");
    }
}
