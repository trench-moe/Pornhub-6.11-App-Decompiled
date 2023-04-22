package a1;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class b {
    public static final String[] F;
    public static final int[] G;
    public static final byte[] H;
    public static final d I;
    public static final d[][] J;
    public static final d[] K;
    public static final HashMap<Integer, d>[] L;
    public static final HashMap<String, d>[] M;
    public static final HashSet<String> N;
    public static final HashMap<Integer, Integer> O;
    public static final Charset P;
    public static final byte[] Q;
    public static final byte[] R;

    /* renamed from: a  reason: collision with root package name */
    public FileDescriptor f137a;

    /* renamed from: b  reason: collision with root package name */
    public AssetManager.AssetInputStream f138b;

    /* renamed from: c  reason: collision with root package name */
    public int f139c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, c>[] f140e;

    /* renamed from: f  reason: collision with root package name */
    public Set<Integer> f141f;

    /* renamed from: g  reason: collision with root package name */
    public ByteOrder f142g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f143h;

    /* renamed from: i  reason: collision with root package name */
    public int f144i;

    /* renamed from: j  reason: collision with root package name */
    public int f145j;

    /* renamed from: k  reason: collision with root package name */
    public int f146k;

    /* renamed from: l  reason: collision with root package name */
    public int f147l;

    /* renamed from: m  reason: collision with root package name */
    public int f148m;
    public static final boolean n = Log.isLoggable("ExifInterface", 3);

    /* renamed from: o  reason: collision with root package name */
    public static final List<Integer> f126o = Arrays.asList(1, 6, 3, 8);

    /* renamed from: p  reason: collision with root package name */
    public static final List<Integer> f127p = Arrays.asList(2, 7, 4, 5);

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f128q = {8, 8, 8};

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f129r = {8};

    /* renamed from: s  reason: collision with root package name */
    public static final byte[] f130s = {-1, -40, -1};

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f131t = {102, 116, 121, 112};

    /* renamed from: u  reason: collision with root package name */
    public static final byte[] f132u = {109, 105, 102, 49};

    /* renamed from: v  reason: collision with root package name */
    public static final byte[] f133v = {104, 101, 105, 99};

    /* renamed from: w  reason: collision with root package name */
    public static final byte[] f134w = {79, 76, 89, 77, 80, 0};

    /* renamed from: x  reason: collision with root package name */
    public static final byte[] f135x = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] y = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: z  reason: collision with root package name */
    public static final byte[] f136z = {101, 88, 73, 102};
    public static final byte[] A = {73, 72, 68, 82};
    public static final byte[] B = {73, 69, 78, 68};
    public static final byte[] C = {82, 73, 70, 70};
    public static final byte[] D = {87, 69, 66, 80};
    public static final byte[] E = {69, 88, 73, 70};

    /* loaded from: classes.dex */
    public class a extends MediaDataSource {

        /* renamed from: c  reason: collision with root package name */
        public long f149c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C0003b f150f;

        public a(b bVar, C0003b c0003b) {
            this.f150f = c0003b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f149c;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f150f.available()) {
                        return -1;
                    }
                    this.f150f.c(j10);
                    this.f149c = j10;
                }
                if (i11 > this.f150f.available()) {
                    i11 = this.f150f.available();
                }
                C0003b c0003b = this.f150f;
                int read = c0003b.f152c.read(bArr, i10, i11);
                c0003b.f155m += read;
                if (read >= 0) {
                    this.f149c += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f149c = -1L;
            return -1;
        }
    }

    /* renamed from: a1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0003b extends InputStream implements DataInput {
        public static final ByteOrder n = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: t  reason: collision with root package name */
        public static final ByteOrder f151t = ByteOrder.BIG_ENDIAN;

        /* renamed from: c  reason: collision with root package name */
        public DataInputStream f152c;

        /* renamed from: f  reason: collision with root package name */
        public ByteOrder f153f;

        /* renamed from: j  reason: collision with root package name */
        public final int f154j;

        /* renamed from: m  reason: collision with root package name */
        public int f155m;

        public C0003b(InputStream inputStream) {
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            this.f153f = byteOrder;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f152c = dataInputStream;
            int available = dataInputStream.available();
            this.f154j = available;
            this.f155m = 0;
            this.f152c.mark(available);
            this.f153f = byteOrder;
        }

        public C0003b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }

        public long a() {
            return readInt() & 4294967295L;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f152c.available();
        }

        public void c(long j10) {
            int i10 = this.f155m;
            if (i10 > j10) {
                this.f155m = 0;
                this.f152c.reset();
                this.f152c.mark(this.f154j);
            } else {
                j10 -= i10;
            }
            int i11 = (int) j10;
            if (skipBytes(i11) != i11) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public int read() {
            this.f155m++;
            return this.f152c.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f152c.read(bArr, i10, i11);
            this.f155m += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f155m++;
            return this.f152c.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            int i10 = this.f155m + 1;
            this.f155m = i10;
            if (i10 <= this.f154j) {
                int read = this.f152c.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f155m += 2;
            return this.f152c.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            int length = this.f155m + bArr.length;
            this.f155m = length;
            if (length > this.f154j) {
                throw new EOFException();
            }
            if (this.f152c.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            int i12 = this.f155m + i11;
            this.f155m = i12;
            if (i12 > this.f154j) {
                throw new EOFException();
            }
            if (this.f152c.read(bArr, i10, i11) != i11) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.io.DataInput
        public int readInt() {
            /*
                r10 = this;
                int r0 = r10.f155m
                r8 = 1
                int r0 = r0 + 4
                r10.f155m = r0
                r9 = 3
                int r1 = r10.f154j
                if (r0 > r1) goto L7a
                java.io.DataInputStream r0 = r10.f152c
                r9 = 1
                int r0 = r0.read()
                java.io.DataInputStream r1 = r10.f152c
                r7 = 5
                int r1 = r1.read()
                java.io.DataInputStream r2 = r10.f152c
                r9 = 7
                int r2 = r2.read()
                java.io.DataInputStream r3 = r10.f152c
                r7 = 1
                int r3 = r3.read()
                r4 = r0 | r1
                r4 = r4 | r2
                r9 = 3
                r4 = r4 | r3
                r9 = 7
                if (r4 < 0) goto L72
                java.nio.ByteOrder r4 = r10.f153f
                r8 = 1
                java.nio.ByteOrder r5 = a1.b.C0003b.n
                r8 = 2
                if (r4 != r5) goto L44
                int r3 = r3 << 24
                r7 = 6
                int r2 = r2 << 16
                r9 = 7
                int r3 = r3 + r2
                int r1 = r1 << 8
                int r3 = r3 + r1
                int r3 = r3 + r0
                return r3
            L44:
                java.nio.ByteOrder r5 = a1.b.C0003b.f151t
                if (r4 != r5) goto L57
                r7 = 2
                int r0 = r0 << 24
                r7 = 6
                int r1 = r1 << 16
                r8 = 7
                int r0 = r0 + r1
                int r1 = r2 << 8
                r8 = 4
                int r0 = r0 + r1
                r8 = 6
                int r0 = r0 + r3
                return r0
            L57:
                r9 = 6
                java.io.IOException r0 = new java.io.IOException
                r8 = 4
                java.lang.String r6 = "Invalid byte order: "
                r1 = r6
                java.lang.StringBuilder r6 = a1.a.m(r1)
                r1 = r6
                java.nio.ByteOrder r2 = r10.f153f
                r9 = 3
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                r7 = 2
                throw r0
            L72:
                r8 = 1
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
                r8 = 3
            L7a:
                r9 = 3
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
                r7 = 5
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.b.C0003b.readInt():int");
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            int i10 = this.f155m + 8;
            this.f155m = i10;
            if (i10 <= this.f154j) {
                int read = this.f152c.read();
                int read2 = this.f152c.read();
                int read3 = this.f152c.read();
                int read4 = this.f152c.read();
                int read5 = this.f152c.read();
                int read6 = this.f152c.read();
                int read7 = this.f152c.read();
                int read8 = this.f152c.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f153f;
                    if (byteOrder == n) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f151t) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    StringBuilder m10 = a1.a.m("Invalid byte order: ");
                    m10.append(this.f153f);
                    throw new IOException(m10.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.io.DataInput
        public short readShort() {
            /*
                r7 = this;
                r4 = r7
                int r0 = r4.f155m
                int r0 = r0 + 2
                r4.f155m = r0
                int r1 = r4.f154j
                r6 = 2
                if (r0 > r1) goto L5c
                java.io.DataInputStream r0 = r4.f152c
                r6 = 1
                int r0 = r0.read()
                java.io.DataInputStream r1 = r4.f152c
                r6 = 2
                int r1 = r1.read()
                r2 = r0 | r1
                r6 = 6
                if (r2 < 0) goto L55
                java.nio.ByteOrder r2 = r4.f153f
                java.nio.ByteOrder r3 = a1.b.C0003b.n
                r6 = 7
                if (r2 != r3) goto L2d
                int r1 = r1 << 8
                int r1 = r1 + r0
                r6 = 2
                short r0 = (short) r1
                r6 = 3
                return r0
            L2d:
                java.nio.ByteOrder r3 = a1.b.C0003b.f151t
                r6 = 4
                if (r2 != r3) goto L3a
                r6 = 6
                int r0 = r0 << 8
                r6 = 3
                int r0 = r0 + r1
                short r0 = (short) r0
                r6 = 1
                return r0
            L3a:
                r6 = 7
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                r6 = 1
                java.lang.StringBuilder r1 = a1.a.m(r1)
                java.nio.ByteOrder r2 = r4.f153f
                r6 = 1
                r1.append(r2)
                java.lang.String r6 = r1.toString()
                r1 = r6
                r0.<init>(r1)
                r6 = 2
                throw r0
                r6 = 6
            L55:
                r6 = 2
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
            L5c:
                r6 = 3
                java.io.EOFException r0 = new java.io.EOFException
                r6 = 1
                r0.<init>()
                throw r0
                r6 = 1
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.b.C0003b.readShort():short");
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f155m += 2;
            return this.f152c.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f155m++;
            return this.f152c.readUnsignedByte();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.io.DataInput
        public int readUnsignedShort() {
            /*
                r6 = this;
                int r0 = r6.f155m
                int r0 = r0 + 2
                r6.f155m = r0
                r5 = 1
                int r1 = r6.f154j
                r5 = 6
                if (r0 > r1) goto L56
                r5 = 1
                java.io.DataInputStream r0 = r6.f152c
                r5 = 2
                int r0 = r0.read()
                java.io.DataInputStream r1 = r6.f152c
                r5 = 3
                int r1 = r1.read()
                r2 = r0 | r1
                if (r2 < 0) goto L4e
                java.nio.ByteOrder r2 = r6.f153f
                java.nio.ByteOrder r3 = a1.b.C0003b.n
                r5 = 2
                if (r2 != r3) goto L2b
                r5 = 5
                int r1 = r1 << 8
                int r1 = r1 + r0
                return r1
            L2b:
                r5 = 5
                java.nio.ByteOrder r3 = a1.b.C0003b.f151t
                r5 = 3
                if (r2 != r3) goto L35
                int r0 = r0 << 8
                int r0 = r0 + r1
                return r0
            L35:
                r5 = 2
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Invalid byte order: "
                java.lang.StringBuilder r1 = a1.a.m(r1)
                java.nio.ByteOrder r2 = r6.f153f
                r1.append(r2)
                java.lang.String r4 = r1.toString()
                r1 = r4
                r0.<init>(r1)
                r5 = 5
                throw r0
                r5 = 2
            L4e:
                r5 = 5
                java.io.EOFException r0 = new java.io.EOFException
                r0.<init>()
                throw r0
                r5 = 4
            L56:
                java.io.EOFException r0 = new java.io.EOFException
                r5 = 6
                r0.<init>()
                throw r0
                r5 = 6
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.b.C0003b.readUnsignedShort():int");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            int min = Math.min(i10, this.f154j - this.f155m);
            int i11 = 0;
            while (i11 < min) {
                i11 += this.f152c.skipBytes(min - i11);
            }
            this.f155m += i11;
            return i11;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f156a;

        /* renamed from: b  reason: collision with root package name */
        public final int f157b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f158c;

        public c(int i10, int i11, long j10, byte[] bArr) {
            this.f156a = i10;
            this.f157b = i11;
            this.f158c = bArr;
        }

        public c(int i10, int i11, byte[] bArr) {
            this.f156a = i10;
            this.f157b = i11;
            this.f158c = bArr;
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(b.P);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            long[] jArr = {j10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[b.G[4] * 1]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                wrap.putInt((int) jArr[i10]);
            }
            return new c(4, 1, wrap.array());
        }

        public static c c(e eVar, ByteOrder byteOrder) {
            e[] eVarArr = {eVar};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[b.G[5] * 1]);
            wrap.order(byteOrder);
            for (int i10 = 0; i10 < 1; i10++) {
                e eVar2 = eVarArr[i10];
                wrap.putInt((int) eVar2.f162a);
                wrap.putInt((int) eVar2.f163b);
            }
            return new c(5, 1, wrap.array());
        }

        public static c d(int i10, ByteOrder byteOrder) {
            int[] iArr = {i10};
            ByteBuffer wrap = ByteBuffer.wrap(new byte[b.G[3] * 1]);
            wrap.order(byteOrder);
            for (int i11 = 0; i11 < 1; i11++) {
                wrap.putShort((short) iArr[i11]);
            }
            return new c(3, 1, wrap.array());
        }

        public double e(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Double.parseDouble((String) h10);
                }
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof double[]) {
                    double[] dArr = (double[]) h10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof e[]) {
                    e[] eVarArr = (e[]) h10;
                    if (eVarArr.length == 1) {
                        e eVar = eVarArr[0];
                        return eVar.f162a / eVar.f163b;
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        public int f(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 != null) {
                if (h10 instanceof String) {
                    return Integer.parseInt((String) h10);
                }
                if (h10 instanceof long[]) {
                    long[] jArr = (long[]) h10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (h10 instanceof int[]) {
                    int[] iArr = (int[]) h10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        public String g(ByteOrder byteOrder) {
            Object h10 = h(byteOrder);
            if (h10 == null) {
                return null;
            }
            if (h10 instanceof String) {
                return (String) h10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (h10 instanceof long[]) {
                long[] jArr = (long[]) h10;
                while (true) {
                    while (i10 < jArr.length) {
                        sb2.append(jArr[i10]);
                        i10++;
                        if (i10 != jArr.length) {
                            sb2.append(",");
                        }
                    }
                    return sb2.toString();
                }
            } else if (h10 instanceof int[]) {
                int[] iArr = (int[]) h10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof double[]) {
                double[] dArr = (double[]) h10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (h10 instanceof e[]) {
                e[] eVarArr = (e[]) h10;
                while (i10 < eVarArr.length) {
                    sb2.append(eVarArr[i10].f162a);
                    sb2.append('/');
                    sb2.append(eVarArr[i10].f163b);
                    i10++;
                    if (i10 != eVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x01ea: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:162:0x01ea */
        /* JADX WARN: Removed duplicated region for block: B:164:0x01ed  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object h(java.nio.ByteOrder r15) {
            /*
                Method dump skipped, instructions count: 534
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.b.c.h(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("(");
            m10.append(b.F[this.f156a]);
            m10.append(", data length:");
            return android.support.v4.media.a.j(m10, this.f158c.length, ")");
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f159a;

        /* renamed from: b  reason: collision with root package name */
        public final String f160b;

        /* renamed from: c  reason: collision with root package name */
        public final int f161c;
        public final int d;

        public d(String str, int i10, int i11) {
            this.f160b = str;
            this.f159a = i10;
            this.f161c = i11;
            this.d = -1;
        }

        public d(String str, int i10, int i11, int i12) {
            this.f160b = str;
            this.f159a = i10;
            this.f161c = i11;
            this.d = i12;
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final long f162a;

        /* renamed from: b  reason: collision with root package name */
        public final long f163b;

        public e(long j10, long j11) {
            if (j11 == 0) {
                this.f162a = 0L;
                this.f163b = 1L;
                return;
            }
            this.f162a = j10;
            this.f163b = j11;
        }

        public String toString() {
            return this.f162a + "/" + this.f163b;
        }
    }

    static {
        d[] dVarArr;
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        "XMP ".getBytes(Charset.defaultCharset());
        F = new String[]{BuildConfig.FLAVOR, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        G = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        H = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        d[] dVarArr2 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ImageWidth", 256, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        d[] dVarArr3 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        d[] dVarArr4 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        d[] dVarArr5 = {new d("InteroperabilityIndex", 1, 2)};
        d[] dVarArr6 = {new d("NewSubfileType", 254, 4), new d("SubfileType", KotlinVersion.MAX_COMPONENT_VALUE, 4), new d("ThumbnailImageWidth", 256, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        I = new d("StripOffsets", 273, 3);
        J = new d[][]{dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr6, dVarArr2, new d[]{new d("ThumbnailImage", 256, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)}, new d[]{new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)}, new d[]{new d("AspectFrame", 4371, 3)}, new d[]{new d("ColorSpace", 55, 3)}};
        K = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        L = new HashMap[10];
        M = new HashMap[10];
        N = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        O = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        P = forName;
        Q = "Exif\u0000\u0000".getBytes(forName);
        R = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss").setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr7 = J;
            if (i10 >= dVarArr7.length) {
                HashMap<Integer, Integer> hashMap = O;
                d[] dVarArr8 = K;
                hashMap.put(Integer.valueOf(dVarArr8[0].f159a), 5);
                hashMap.put(Integer.valueOf(dVarArr8[1].f159a), 1);
                hashMap.put(Integer.valueOf(dVarArr8[2].f159a), 2);
                hashMap.put(Integer.valueOf(dVarArr8[3].f159a), 3);
                hashMap.put(Integer.valueOf(dVarArr8[4].f159a), 7);
                hashMap.put(Integer.valueOf(dVarArr8[5].f159a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
                return;
            }
            L[i10] = new HashMap<>();
            M[i10] = new HashMap<>();
            for (d dVar : dVarArr7[i10]) {
                L[i10].put(Integer.valueOf(dVar.f159a), dVar);
                M[i10].put(dVar.f160b, dVar);
            }
            i10++;
        }
    }

    public b(InputStream inputStream) {
        boolean z10;
        d[][] dVarArr = J;
        this.f140e = new HashMap[dVarArr.length];
        this.f141f = new HashSet(dVarArr.length);
        this.f142g = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f138b = (AssetManager.AssetInputStream) inputStream;
            this.f137a = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    z10 = true;
                } catch (Exception unused) {
                    if (n) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                    z10 = false;
                }
                if (z10) {
                    this.f138b = null;
                    this.f137a = fileInputStream.getFD();
                }
            }
            this.f138b = null;
            this.f137a = null;
        }
        for (int i10 = 0; i10 < J.length; i10++) {
            try {
                try {
                    this.f140e[i10] = new HashMap<>();
                } catch (IOException e10) {
                    boolean z11 = n;
                    if (z11) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    a();
                    if (!z11) {
                        return;
                    }
                }
            } finally {
                a();
                if (n) {
                    s();
                }
            }
        }
        if (!this.d) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f139c = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        C0003b c0003b = new C0003b(inputStream);
        if (!this.d) {
            switch (this.f139c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 5:
                case 6:
                case 8:
                case 11:
                    l(c0003b);
                    break;
                case 4:
                    g(c0003b, 0, 0);
                    break;
                case 7:
                    i(c0003b);
                    break;
                case 9:
                    k(c0003b);
                    break;
                case 10:
                    m(c0003b);
                    break;
                case 12:
                    f(c0003b);
                    break;
                case 13:
                    j(c0003b);
                    break;
                case 14:
                    o(c0003b);
                    break;
            }
        } else {
            n(c0003b);
        }
        w(c0003b);
    }

    public static String b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i10])));
        }
        return sb2.toString();
    }

    public static long[] c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static boolean x(byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr.length >= bArr2.length) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final void A() {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        c cVar = this.f140e[1].get("PixelXDimension");
        c cVar2 = this.f140e[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f140e[0].put("ImageWidth", cVar);
            this.f140e[0].put("ImageLength", cVar2);
        }
        if (this.f140e[4].isEmpty() && q(this.f140e[5])) {
            HashMap<String, c>[] hashMapArr = this.f140e;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (q(this.f140e[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    public final void a() {
        String d10 = d("DateTimeOriginal");
        if (d10 != null && d("DateTime") == null) {
            this.f140e[0].put("DateTime", c.a(d10));
        }
        if (d("ImageWidth") == null) {
            this.f140e[0].put("ImageWidth", c.b(0L, this.f142g));
        }
        if (d("ImageLength") == null) {
            this.f140e[0].put("ImageLength", c.b(0L, this.f142g));
        }
        if (d("Orientation") == null) {
            this.f140e[0].put("Orientation", c.b(0L, this.f142g));
        }
        if (d("LightSource") == null) {
            this.f140e[1].put("LightSource", c.b(0L, this.f142g));
        }
    }

    public String d(String str) {
        c e10 = e(str);
        if (e10 != null) {
            if (!N.contains(str)) {
                return e10.g(this.f142g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = e10.f156a;
                if (i10 != 5 && i10 != 10) {
                    StringBuilder m10 = a1.a.m("GPS Timestamp format is not rational. format=");
                    m10.append(e10.f156a);
                    Log.w("ExifInterface", m10.toString());
                    return null;
                }
                e[] eVarArr = (e[]) e10.h(this.f142g);
                if (eVarArr == null || eVarArr.length != 3) {
                    StringBuilder m11 = a1.a.m("Invalid GPS Timestamp array. array=");
                    m11.append(Arrays.toString(eVarArr));
                    Log.w("ExifInterface", m11.toString());
                    return null;
                }
                return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) eVarArr[0].f162a) / ((float) eVarArr[0].f163b))), Integer.valueOf((int) (((float) eVarArr[1].f162a) / ((float) eVarArr[1].f163b))), Integer.valueOf((int) (((float) eVarArr[2].f162a) / ((float) eVarArr[2].f163b))));
            }
            try {
                return Double.toString(e10.e(this.f142g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final c e(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (n) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < J.length; i10++) {
            c cVar = this.f140e[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void f(a1.b.C0003b r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.f(a1.b$b):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
        r18.f153f = r17.f142g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018d, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(a1.b.C0003b r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.g(a1.b$b, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d6, code lost:
        if (r8 != null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.io.BufferedInputStream r18) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.h(java.io.BufferedInputStream):int");
    }

    public final void i(C0003b c0003b) {
        l(c0003b);
        c cVar = this.f140e[1].get("MakerNote");
        if (cVar != null) {
            C0003b c0003b2 = new C0003b(cVar.f158c);
            c0003b2.f153f = this.f142g;
            byte[] bArr = f134w;
            byte[] bArr2 = new byte[bArr.length];
            c0003b2.readFully(bArr2);
            c0003b2.c(0L);
            byte[] bArr3 = f135x;
            byte[] bArr4 = new byte[bArr3.length];
            c0003b2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0003b2.c(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0003b2.c(12L);
            }
            v(c0003b2, 6);
            c cVar2 = this.f140e[7].get("PreviewImageStart");
            c cVar3 = this.f140e[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f140e[5].put("JPEGInterchangeFormat", cVar2);
                this.f140e[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = this.f140e[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.h(this.f142g);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder m10 = a1.a.m("Invalid aspect frame values. frame=");
                    m10.append(Arrays.toString(iArr));
                    Log.w("ExifInterface", m10.toString());
                } else if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                } else {
                    int i10 = (iArr[2] - iArr[0]) + 1;
                    int i11 = (iArr[3] - iArr[1]) + 1;
                    if (i10 < i11) {
                        int i12 = i10 + i11;
                        i11 = i12 - i11;
                        i10 = i12 - i11;
                    }
                    c d10 = c.d(i10, this.f142g);
                    c d11 = c.d(i11, this.f142g);
                    this.f140e[0].put("ImageWidth", d10);
                    this.f140e[0].put("ImageLength", d11);
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void j(a1.b.C0003b r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.j(a1.b$b):void");
    }

    public final void k(C0003b c0003b) {
        c0003b.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c0003b.read(bArr);
        c0003b.skipBytes(4);
        c0003b.read(bArr2);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        g(c0003b, i10, 5);
        c0003b.c(i11);
        c0003b.f153f = ByteOrder.BIG_ENDIAN;
        int readInt = c0003b.readInt();
        if (n) {
            a1.a.u("numberOfDirectoryEntry: ", readInt, "ExifInterface");
        }
        for (int i12 = 0; i12 < readInt; i12++) {
            int readUnsignedShort = c0003b.readUnsignedShort();
            int readUnsignedShort2 = c0003b.readUnsignedShort();
            if (readUnsignedShort == I.f159a) {
                short readShort = c0003b.readShort();
                short readShort2 = c0003b.readShort();
                c d10 = c.d(readShort, this.f142g);
                c d11 = c.d(readShort2, this.f142g);
                this.f140e[0].put("ImageLength", d10);
                this.f140e[0].put("ImageWidth", d11);
                if (n) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            c0003b.skipBytes(readUnsignedShort2);
        }
    }

    public final void l(C0003b c0003b) {
        c cVar;
        r(c0003b, c0003b.available());
        v(c0003b, 0);
        z(c0003b, 0);
        z(c0003b, 5);
        z(c0003b, 4);
        A();
        if (this.f139c != 8 || (cVar = this.f140e[1].get("MakerNote")) == null) {
            return;
        }
        C0003b c0003b2 = new C0003b(cVar.f158c);
        c0003b2.f153f = this.f142g;
        c0003b2.c(6L);
        v(c0003b2, 9);
        c cVar2 = this.f140e[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f140e[1].put("ColorSpace", cVar2);
        }
    }

    public final void m(C0003b c0003b) {
        l(c0003b);
        if (this.f140e[0].get("JpgFromRaw") != null) {
            g(c0003b, this.f148m, 5);
        }
        c cVar = this.f140e[0].get("ISO");
        c cVar2 = this.f140e[1].get("PhotographicSensitivity");
        if (cVar == null || cVar2 != null) {
            return;
        }
        this.f140e[1].put("PhotographicSensitivity", cVar);
    }

    public final void n(C0003b c0003b) {
        byte[] bArr = Q;
        c0003b.skipBytes(bArr.length);
        byte[] bArr2 = new byte[c0003b.available()];
        c0003b.readFully(bArr2);
        this.f144i = bArr.length;
        u(bArr2, 0);
    }

    public final void o(C0003b c0003b) {
        if (n) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0003b);
        }
        c0003b.f153f = ByteOrder.LITTLE_ENDIAN;
        c0003b.skipBytes(C.length);
        int readInt = c0003b.readInt() + 8;
        int skipBytes = c0003b.skipBytes(D.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (c0003b.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = c0003b.readInt();
                int i10 = skipBytes + 4 + 4;
                if (Arrays.equals(E, bArr)) {
                    byte[] bArr2 = new byte[readInt2];
                    if (c0003b.read(bArr2) == readInt2) {
                        this.f144i = i10;
                        u(bArr2, 0);
                        this.f144i = i10;
                        return;
                    }
                    throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                int i11 = i10 + readInt2;
                if (i11 == readInt) {
                    return;
                }
                if (i11 > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int skipBytes2 = c0003b.skipBytes(readInt2);
                if (skipBytes2 != readInt2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                skipBytes = i10 + skipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void p(C0003b c0003b, HashMap hashMap) {
        c cVar = (c) hashMap.get("JPEGInterchangeFormat");
        c cVar2 = (c) hashMap.get("JPEGInterchangeFormatLength");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f142g);
            int f11 = cVar2.f(this.f142g);
            if (this.f139c == 7) {
                f10 += this.f145j;
            }
            int min = Math.min(f11, c0003b.f154j - f10);
            if (f10 > 0 && min > 0) {
                int i10 = this.f144i + f10;
                if (this.f138b == null && this.f137a == null) {
                    c0003b.c(i10);
                    c0003b.readFully(new byte[min]);
                }
            }
            if (n) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + f10 + ", length: " + min);
            }
        }
    }

    public final boolean q(HashMap hashMap) {
        c cVar = (c) hashMap.get("ImageLength");
        c cVar2 = (c) hashMap.get("ImageWidth");
        if (cVar != null && cVar2 != null) {
            int f10 = cVar.f(this.f142g);
            int f11 = cVar2.f(this.f142g);
            if (f10 <= 512 && f11 <= 512) {
                return true;
            }
        }
        return false;
    }

    public final void r(C0003b c0003b, int i10) {
        ByteOrder t2 = t(c0003b);
        this.f142g = t2;
        c0003b.f153f = t2;
        int readUnsignedShort = c0003b.readUnsignedShort();
        int i11 = this.f139c;
        if (i11 != 7 && i11 != 10 && readUnsignedShort != 42) {
            StringBuilder m10 = a1.a.m("Invalid start code: ");
            m10.append(Integer.toHexString(readUnsignedShort));
            throw new IOException(m10.toString());
        }
        int readInt = c0003b.readInt();
        if (readInt < 8 || readInt >= i10) {
            throw new IOException(a1.a.j("Invalid first Ifd offset: ", readInt));
        }
        int i12 = readInt - 8;
        if (i12 > 0 && c0003b.skipBytes(i12) != i12) {
            throw new IOException(a1.a.j("Couldn't jump to first Ifd: ", i12));
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f140e.length; i10++) {
            StringBuilder n10 = a1.a.n("The size of tag group[", i10, "]: ");
            n10.append(this.f140e[i10].size());
            Log.d("ExifInterface", n10.toString());
            for (Map.Entry<String, c> entry : this.f140e[i10].entrySet()) {
                c value = entry.getValue();
                StringBuilder m10 = a1.a.m("tagName: ");
                m10.append(entry.getKey());
                m10.append(", tagType: ");
                m10.append(value.toString());
                m10.append(", tagValue: '");
                m10.append(value.g(this.f142g));
                m10.append("'");
                Log.d("ExifInterface", m10.toString());
            }
        }
    }

    public final ByteOrder t(C0003b c0003b) {
        short readShort = c0003b.readShort();
        if (readShort == 18761) {
            if (n) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (n) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            StringBuilder m10 = a1.a.m("Invalid byte order: ");
            m10.append(Integer.toHexString(readShort));
            throw new IOException(m10.toString());
        }
    }

    public final void u(byte[] bArr, int i10) {
        C0003b c0003b = new C0003b(bArr);
        r(c0003b, bArr.length);
        v(c0003b, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(a1.b.C0003b r25, int r26) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.v(a1.b$b, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(a1.b.C0003b r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.b.w(a1.b$b):void");
    }

    public final void y(int i10, int i11) {
        if (!this.f140e[i10].isEmpty() && !this.f140e[i11].isEmpty()) {
            c cVar = this.f140e[i10].get("ImageLength");
            c cVar2 = this.f140e[i10].get("ImageWidth");
            c cVar3 = this.f140e[i11].get("ImageLength");
            c cVar4 = this.f140e[i11].get("ImageWidth");
            if (cVar != null && cVar2 != null) {
                if (cVar3 != null && cVar4 != null) {
                    int f10 = cVar.f(this.f142g);
                    int f11 = cVar2.f(this.f142g);
                    int f12 = cVar3.f(this.f142g);
                    int f13 = cVar4.f(this.f142g);
                    if (f10 < f12 && f11 < f13) {
                        HashMap<String, c>[] hashMapArr = this.f140e;
                        HashMap<String, c> hashMap = hashMapArr[i10];
                        hashMapArr[i10] = hashMapArr[i11];
                        hashMapArr[i11] = hashMap;
                        return;
                    }
                } else if (n) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
                return;
            }
            if (n) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
            return;
        }
        if (n) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    public final void z(C0003b c0003b, int i10) {
        c cVar;
        c d10;
        c d11;
        c cVar2 = this.f140e[i10].get("DefaultCropSize");
        c cVar3 = this.f140e[i10].get("SensorTopBorder");
        c cVar4 = this.f140e[i10].get("SensorLeftBorder");
        c cVar5 = this.f140e[i10].get("SensorBottomBorder");
        c cVar6 = this.f140e[i10].get("SensorRightBorder");
        if (cVar2 != null) {
            if (cVar2.f156a == 5) {
                e[] eVarArr = (e[]) cVar2.h(this.f142g);
                if (eVarArr != null && eVarArr.length == 2) {
                    d10 = c.c(eVarArr[0], this.f142g);
                    d11 = c.c(eVarArr[1], this.f142g);
                }
                StringBuilder m10 = a1.a.m("Invalid crop size values. cropSize=");
                m10.append(Arrays.toString(eVarArr));
                Log.w("ExifInterface", m10.toString());
                return;
            }
            int[] iArr = (int[]) cVar2.h(this.f142g);
            if (iArr == null || iArr.length != 2) {
                StringBuilder m11 = a1.a.m("Invalid crop size values. cropSize=");
                m11.append(Arrays.toString(iArr));
                Log.w("ExifInterface", m11.toString());
                return;
            }
            d10 = c.d(iArr[0], this.f142g);
            d11 = c.d(iArr[1], this.f142g);
            this.f140e[i10].put("ImageWidth", d10);
            this.f140e[i10].put("ImageLength", d11);
            return;
        }
        if (cVar3 == null || cVar4 == null || cVar5 == null || cVar6 == null) {
            c cVar7 = this.f140e[i10].get("ImageLength");
            c cVar8 = this.f140e[i10].get("ImageWidth");
            if ((cVar7 == null || cVar8 == null) && (cVar = this.f140e[i10].get("JPEGInterchangeFormat")) != null) {
                g(c0003b, cVar.f(this.f142g), i10);
            }
        } else {
            int f10 = cVar3.f(this.f142g);
            int f11 = cVar5.f(this.f142g);
            int f12 = cVar6.f(this.f142g);
            int f13 = cVar4.f(this.f142g);
            if (f11 > f10 && f12 > f13) {
                c d12 = c.d(f11 - f10, this.f142g);
                c d13 = c.d(f12 - f13, this.f142g);
                this.f140e[i10].put("ImageLength", d12);
                this.f140e[i10].put("ImageWidth", d13);
            }
        }
    }
}
