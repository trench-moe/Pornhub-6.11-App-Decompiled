package bd;

import android.annotation.SuppressLint;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPOutputStream;

@SuppressLint({"Assert"})
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3641a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3642b = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f3643c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] d = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f3644e = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f3645f = {-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* renamed from: bd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0045a extends FilterOutputStream {

        /* renamed from: c  reason: collision with root package name */
        public boolean f3646c;

        /* renamed from: f  reason: collision with root package name */
        public int f3647f;

        /* renamed from: j  reason: collision with root package name */
        public byte[] f3648j;

        /* renamed from: m  reason: collision with root package name */
        public int f3649m;
        public int n;

        /* renamed from: t  reason: collision with root package name */
        public boolean f3650t;

        /* renamed from: u  reason: collision with root package name */
        public byte[] f3651u;

        /* renamed from: w  reason: collision with root package name */
        public int f3652w;
        public byte[] y;

        public C0045a(OutputStream outputStream, int i10) {
            super(outputStream);
            this.f3650t = (i10 & 8) != 0;
            boolean z10 = (i10 & 1) != 0;
            this.f3646c = z10;
            int i11 = z10 ? 3 : 4;
            this.f3649m = i11;
            this.f3648j = new byte[i11];
            this.f3647f = 0;
            this.n = 0;
            this.f3651u = new byte[4];
            this.f3652w = i10;
            this.y = a.c(i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i10 = this.f3647f;
            if (i10 > 0) {
                if (!this.f3646c) {
                    throw new IOException("Base64 input not properly padded.");
                }
                OutputStream outputStream = ((FilterOutputStream) this).out;
                byte[] bArr = this.f3651u;
                a.a(this.f3648j, 0, i10, bArr, 0, this.f3652w);
                outputStream.write(bArr);
                this.f3647f = 0;
            }
            super.close();
            this.f3648j = null;
            ((FilterOutputStream) this).out = null;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int r14) {
            /*
                Method dump skipped, instructions count: 384
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.a.C0045a.write(int):void");
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    public static byte[] a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] bArr3 = (i13 & 16) == 16 ? f3643c : (i13 & 32) == 32 ? f3644e : f3641a;
        int i14 = (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0) | (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 2 ? (bArr[i10 + 2] << 24) >>> 24 : 0);
        if (i11 == 1) {
            bArr2[i12] = bArr3[i14 >>> 18];
            bArr2[i12 + 1] = bArr3[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = 61;
            bArr2[i12 + 3] = 61;
            return bArr2;
        } else if (i11 == 2) {
            bArr2[i12] = bArr3[i14 >>> 18];
            bArr2[i12 + 1] = bArr3[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = 61;
            return bArr2;
        } else if (i11 != 3) {
            return bArr2;
        } else {
            bArr2[i12] = bArr3[i14 >>> 18];
            bArr2[i12 + 1] = bArr3[(i14 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i14 >>> 6) & 63];
            bArr2[i12 + 3] = bArr3[i14 & 63];
            return bArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    public static String b(byte[] bArr, int i10, int i11, int i12) {
        byte[] bArr2;
        C0045a c0045a;
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i13 = i10 + i11;
                ?? length = bArr.length;
                if (i13 <= length) {
                    if ((i12 & 2) != 0) {
                        GZIPOutputStream gZIPOutputStream = null;
                        try {
                            try {
                                length = new ByteArrayOutputStream();
                                try {
                                    c0045a = new C0045a(length, i12 | 1);
                                    try {
                                        GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(c0045a);
                                        try {
                                            gZIPOutputStream2.write(bArr, i10, i11);
                                            gZIPOutputStream2.close();
                                            try {
                                                gZIPOutputStream2.close();
                                            } catch (Exception unused) {
                                            }
                                            try {
                                                c0045a.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                length.close();
                                            } catch (Exception unused3) {
                                            }
                                            bArr2 = length.toByteArray();
                                        } catch (IOException e10) {
                                            throw e10;
                                        } catch (Throwable th) {
                                            th = th;
                                            gZIPOutputStream = gZIPOutputStream2;
                                            try {
                                                gZIPOutputStream.close();
                                            } catch (Exception unused4) {
                                            }
                                            try {
                                                c0045a.close();
                                            } catch (Exception unused5) {
                                            }
                                            try {
                                                length.close();
                                            } catch (Exception unused6) {
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e11) {
                                        throw e11;
                                    }
                                } catch (IOException e12) {
                                    throw e12;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c0045a = null;
                                }
                            } catch (IOException e13) {
                                throw e13;
                            } catch (Throwable th3) {
                                th = th3;
                                length = 0;
                                c0045a = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        boolean z10 = (i12 & 8) != 0;
                        int i14 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
                        if (z10) {
                            i14 += i14 / 76;
                        }
                        int i15 = i14;
                        byte[] bArr3 = new byte[i15];
                        int i16 = i11 - 2;
                        int i17 = 0;
                        int i18 = 0;
                        int i19 = 0;
                        while (i17 < i16) {
                            a(bArr, i17 + i10, 3, bArr3, i18, i12);
                            int i20 = i19 + 4;
                            if (!z10 || i20 < 76) {
                                i19 = i20;
                            } else {
                                bArr3[i18 + 4] = 10;
                                i18++;
                                i19 = 0;
                            }
                            i17 += 3;
                            i18 += 4;
                        }
                        if (i17 < i11) {
                            a(bArr, i17 + i10, i11 - i17, bArr3, i18, i12);
                            i18 += 4;
                        }
                        if (i18 <= i15 - 1) {
                            bArr2 = new byte[i18];
                            System.arraycopy(bArr3, 0, bArr2, 0, i18);
                        } else {
                            bArr2 = bArr3;
                        }
                    }
                    try {
                        return new String(bArr2, "US-ASCII");
                    } catch (UnsupportedEncodingException unused7) {
                        return new String(bArr2);
                    }
                }
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
            }
            throw new IllegalArgumentException(a1.a.j("Cannot have length offset: ", i11));
        }
        throw new IllegalArgumentException(a1.a.j("Cannot have negative offset: ", i10));
    }

    public static final byte[] c(int i10) {
        return (i10 & 16) == 16 ? d : (i10 & 32) == 32 ? f3645f : f3642b;
    }
}
