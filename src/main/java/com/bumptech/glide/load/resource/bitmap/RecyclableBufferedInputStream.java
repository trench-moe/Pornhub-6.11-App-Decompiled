package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public volatile byte[] f5847c;

    /* renamed from: f  reason: collision with root package name */
    public int f5848f;

    /* renamed from: j  reason: collision with root package name */
    public int f5849j;

    /* renamed from: m  reason: collision with root package name */
    public int f5850m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public final k5.b f5851t;

    /* loaded from: classes.dex */
    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, k5.b bVar) {
        super(inputStream);
        this.f5850m = -1;
        this.f5851t = bVar;
        this.f5847c = (byte[]) bVar.e(65536, byte[].class);
    }

    public static IOException d() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f5850m;
        if (i10 != -1) {
            int i11 = this.n - i10;
            int i12 = this.f5849j;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f5848f == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f5851t.e(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f5847c = bArr2;
                    this.f5851t.d(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.n - this.f5850m;
                this.n = i13;
                this.f5850m = 0;
                this.f5848f = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.n;
                if (read > 0) {
                    i14 += read;
                }
                this.f5848f = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f5850m = -1;
            this.n = 0;
            this.f5848f = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        try {
            inputStream = ((FilterInputStream) this).in;
            if (this.f5847c != null) {
                if (inputStream != null) {
                }
            }
            d();
            throw null;
        } finally {
        }
        return (this.f5848f - this.n) + inputStream.available();
    }

    public synchronized void c() {
        if (this.f5847c != null) {
            this.f5851t.d(this.f5847c);
            this.f5847c = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f5847c != null) {
            this.f5851t.d(this.f5847c);
            this.f5847c = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f5849j = Math.max(this.f5849j, i10);
        this.f5850m = this.n;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f5847c;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            d();
            throw null;
        } else if (this.n < this.f5848f || a(inputStream, bArr) != -1) {
            if (bArr != this.f5847c && (bArr = this.f5847c) == null) {
                d();
                throw null;
            }
            int i10 = this.f5848f;
            int i11 = this.n;
            if (i10 - i11 > 0) {
                this.n = i11 + 1;
                return bArr[i11] & UByte.MAX_VALUE;
            }
            return -1;
        } else {
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f5847c;
        if (bArr2 == null) {
            d();
            throw null;
        } else if (i11 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream == null) {
                d();
                throw null;
            }
            int i14 = this.n;
            int i15 = this.f5848f;
            if (i14 < i15) {
                int i16 = i15 - i14 >= i11 ? i11 : i15 - i14;
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.n += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                int i17 = -1;
                if (this.f5850m == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        if (i12 != i11) {
                            i17 = i11 - i12;
                        }
                        return i17;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    if (i12 != i11) {
                        i17 = i11 - i12;
                    }
                    return i17;
                } else {
                    if (bArr2 != this.f5847c && (bArr2 = this.f5847c) == null) {
                        d();
                        throw null;
                    }
                    int i18 = this.f5848f;
                    int i19 = this.n;
                    i13 = i18 - i19 >= i12 ? i12 : i18 - i19;
                    System.arraycopy(bArr2, i19, bArr, i10, i13);
                    this.n += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f5847c == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f5850m;
        if (-1 == i10) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.n + " markLimit: " + this.f5849j);
        }
        this.n = i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long r13) {
        /*
            Method dump skipped, instructions count: 161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream.skip(long):long");
    }
}
