package bf;

import com.appsflyer.oaid.BuildConfig;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Typography;
import l.InterfaceC0186;
import okio.ByteString;
import okio.SegmentedByteString;

/* loaded from: classes2.dex */
public final class f implements h, g, Cloneable, ByteChannel {
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public u f3668c;

    /* renamed from: f  reason: collision with root package name */
    public long f3669f;

    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(f.this.f3669f, (long) IntCompanionObject.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            f fVar = f.this;
            if (fVar.f3669f > 0) {
                return fVar.readByte() & UByte.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] sink, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return f.this.s(sink, i10, i11);
        }

        public String toString() {
            return f.this + ".inputStream()";
        }
    }

    @Override // bf.h
    public byte[] A() {
        return b0(this.f3669f);
    }

    @Override // bf.h
    public long B(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return k(bytes, 0L);
    }

    @Override // bf.h
    public boolean C() {
        return this.f3669f == 0;
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g D(int i10) {
        i0(i10);
        return this;
    }

    public String E() {
        return w(this.f3669f, Charsets.UTF_8);
    }

    public String F(long j10) {
        return w(j10, Charsets.UTF_8);
    }

    @Override // bf.h
    public long I(w sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = this.f3669f;
        if (j10 > 0) {
            ((f) sink).l0(this, j10);
        }
        return j10;
    }

    public int J() {
        int i10;
        int i11;
        int i12;
        if (this.f3669f != 0) {
            byte f10 = f(0L);
            if ((f10 & ByteCompanionObject.MIN_VALUE) == 0) {
                i10 = f10 & ByteCompanionObject.MAX_VALUE;
                i11 = 1;
                i12 = 0;
            } else if ((f10 & 224) == 192) {
                i10 = f10 & 31;
                i11 = 2;
                i12 = 128;
            } else if ((f10 & 240) == 224) {
                i10 = f10 & 15;
                i11 = 3;
                i12 = InterfaceC0186.f43;
            } else if ((f10 & 248) != 240) {
                l(1L);
                return 65533;
            } else {
                i10 = f10 & 7;
                i11 = 4;
                i12 = 65536;
            }
            long j10 = i11;
            if (this.f3669f < j10) {
                StringBuilder n = a1.a.n("size < ", i11, ": ");
                n.append(this.f3669f);
                n.append(" (to read code point prefixed 0x");
                n.append(b.c(f10));
                n.append(')');
                throw new EOFException(n.toString());
            }
            for (int i13 = 1; i13 < i11; i13++) {
                long j11 = i13;
                byte f11 = f(j11);
                if ((f11 & 192) != 128) {
                    l(j11);
                    return 65533;
                }
                i10 = (i10 << 6) | (f11 & 63);
            }
            l(j10);
            if (i10 > 1114111) {
                return 65533;
            }
            if ((55296 <= i10 && 57343 >= i10) || i10 < i12) {
                return 65533;
            }
            return i10;
        }
        throw new EOFException();
    }

    @Override // bf.h
    public long K(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return n(targetBytes, 0L);
    }

    @Override // bf.h
    public String L(long j10) {
        if (j10 >= 0) {
            long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
            byte b10 = (byte) 10;
            long i10 = i(b10, 0L, j11);
            if (i10 != -1) {
                return cf.a.b(this, i10);
            }
            if (j11 < this.f3669f && f(j11 - 1) == ((byte) 13) && f(j11) == b10) {
                return cf.a.b(this, j11);
            }
            f fVar = new f();
            d(fVar, 0L, Math.min(32, this.f3669f));
            StringBuilder m10 = a1.a.m("\\n not found: limit=");
            m10.append(Math.min(this.f3669f, j10));
            m10.append(" content=");
            m10.append(fVar.t().g());
            m10.append(Typography.ellipsis);
            throw new EOFException(m10.toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("limit < 0: ", j10).toString());
    }

    @Override // bf.h
    public int M(p options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int c10 = cf.a.c(this, options, false);
        if (c10 == -1) {
            return -1;
        }
        l(options.f3686c[c10].f());
        return c10;
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g N(String str) {
        s0(str);
        return this;
    }

    @Override // bf.y
    public long O(f sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 >= 0) {
            long j11 = this.f3669f;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            sink.l0(this, j10);
            return j10;
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
    }

    public final ByteString P(int i10) {
        if (i10 == 0) {
            return ByteString.f13727j;
        }
        b.b(this.f3669f, 0L, i10);
        u uVar = this.f3668c;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.checkNotNull(uVar);
            int i14 = uVar.f3704c;
            int i15 = uVar.f3703b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            uVar = uVar.f3706f;
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        u uVar2 = this.f3668c;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.checkNotNull(uVar2);
            bArr[i16] = uVar2.f3702a;
            i11 += uVar2.f3704c - uVar2.f3703b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = uVar2.f3703b;
            uVar2.d = true;
            i16++;
            uVar2 = uVar2.f3706f;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    @Override // bf.h
    public boolean Q(long j10, ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int f10 = bytes.f();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || f10 < 0 || this.f3669f - j10 < f10 || bytes.f() - 0 < f10) {
            return false;
        }
        for (int i10 = 0; i10 < f10; i10++) {
            if (f(i10 + j10) != bytes.i(0 + i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g T(String str, int i10, int i11) {
        t0(str, i10, i11);
        return this;
    }

    public final u X(int i10) {
        boolean z10 = true;
        if ((i10 < 1 || i10 > 8192) ? false : false) {
            u uVar = this.f3668c;
            if (uVar == null) {
                u c10 = v.c();
                this.f3668c = c10;
                c10.f3707g = c10;
                c10.f3706f = c10;
                return c10;
            }
            Intrinsics.checkNotNull(uVar);
            u uVar2 = uVar.f3707g;
            Intrinsics.checkNotNull(uVar2);
            if (uVar2.f3704c + i10 > 8192 || !uVar2.f3705e) {
                u c11 = v.c();
                uVar2.b(c11);
                return c11;
            }
            return uVar2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public f Y(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.n(this, 0, byteString.f());
        return this;
    }

    public f Z(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        c0(source, 0, source.length);
        return this;
    }

    /* renamed from: a */
    public f clone() {
        f fVar = new f();
        if (this.f3669f != 0) {
            u uVar = this.f3668c;
            Intrinsics.checkNotNull(uVar);
            u c10 = uVar.c();
            fVar.f3668c = c10;
            c10.f3707g = c10;
            c10.f3706f = c10;
            for (u uVar2 = uVar.f3706f; uVar2 != uVar; uVar2 = uVar2.f3706f) {
                u uVar3 = c10.f3707g;
                Intrinsics.checkNotNull(uVar3);
                Intrinsics.checkNotNull(uVar2);
                uVar3.b(uVar2.c());
            }
            fVar.f3669f = this.f3669f;
        }
        return fVar;
    }

    @Override // bf.h
    public String a0() {
        return L(Long.MAX_VALUE);
    }

    @Override // bf.h, bf.g
    public f b() {
        return this;
    }

    @Override // bf.h
    public byte[] b0(long j10) {
        int i10 = 0;
        if (j10 >= 0 && j10 <= ((long) IntCompanionObject.MAX_VALUE)) {
            if (this.f3669f >= j10) {
                int i11 = (int) j10;
                byte[] sink = new byte[i11];
                Intrinsics.checkNotNullParameter(sink, "sink");
                while (i10 < i11) {
                    int s10 = s(sink, i10, i11 - i10);
                    if (s10 == -1) {
                        throw new EOFException();
                    }
                    i10 += s10;
                }
                return sink;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount: ", j10).toString());
    }

    public final long c() {
        long j10 = this.f3669f;
        if (j10 == 0) {
            return 0L;
        }
        u uVar = this.f3668c;
        Intrinsics.checkNotNull(uVar);
        u uVar2 = uVar.f3707g;
        Intrinsics.checkNotNull(uVar2);
        int i10 = uVar2.f3704c;
        if (i10 < 8192 && uVar2.f3705e) {
            j10 -= i10 - uVar2.f3703b;
        }
        return j10;
    }

    public f c0(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        b.b(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            u X = X(1);
            int min = Math.min(i12 - i10, 8192 - X.f3704c);
            int i13 = i10 + min;
            ArraysKt.copyInto(source, X.f3702a, X.f3704c, i10, i13);
            X.f3704c += min;
            i10 = i13;
        }
        this.f3669f += j10;
        return this;
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final f d(f out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        b.b(this.f3669f, j10, j11);
        if (j11 != 0) {
            out.f3669f += j11;
            u uVar = this.f3668c;
            while (true) {
                Intrinsics.checkNotNull(uVar);
                int i10 = uVar.f3704c;
                int i11 = uVar.f3703b;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= i10 - i11;
                uVar = uVar.f3706f;
            }
            while (j11 > 0) {
                Intrinsics.checkNotNull(uVar);
                u c10 = uVar.c();
                int i12 = c10.f3703b + ((int) j10);
                c10.f3703b = i12;
                c10.f3704c = Math.min(i12 + ((int) j11), c10.f3704c);
                u uVar2 = out.f3668c;
                if (uVar2 == null) {
                    c10.f3707g = c10;
                    c10.f3706f = c10;
                    out.f3668c = c10;
                } else {
                    Intrinsics.checkNotNull(uVar2);
                    u uVar3 = uVar2.f3707g;
                    Intrinsics.checkNotNull(uVar3);
                    uVar3.b(c10);
                }
                j11 -= c10.f3704c - c10.f3703b;
                uVar = uVar.f3706f;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g d0(byte[] bArr) {
        Z(bArr);
        return this;
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g e0(ByteString byteString) {
        Y(byteString);
        return this;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            long j10 = this.f3669f;
            f fVar = (f) obj;
            if (j10 != fVar.f3669f) {
                return false;
            }
            if (j10 != 0) {
                u uVar = this.f3668c;
                Intrinsics.checkNotNull(uVar);
                u uVar2 = fVar.f3668c;
                Intrinsics.checkNotNull(uVar2);
                int i10 = uVar.f3703b;
                int i11 = uVar2.f3703b;
                long j11 = 0;
                while (j11 < this.f3669f) {
                    long min = Math.min(uVar.f3704c - i10, uVar2.f3704c - i11);
                    long j12 = 0;
                    while (j12 < min) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (uVar.f3702a[i10] != uVar2.f3702a[i11]) {
                            return false;
                        }
                        j12++;
                        i10 = i12;
                        i11 = i13;
                    }
                    if (i10 == uVar.f3704c) {
                        uVar = uVar.f3706f;
                        Intrinsics.checkNotNull(uVar);
                        i10 = uVar.f3703b;
                    }
                    if (i11 == uVar2.f3704c) {
                        uVar2 = uVar2.f3706f;
                        Intrinsics.checkNotNull(uVar2);
                        i11 = uVar2.f3703b;
                    }
                    j11 += min;
                }
            }
        }
        return true;
    }

    @JvmName(name = "getByte")
    public final byte f(long j10) {
        b.b(this.f3669f, j10, 1L);
        u uVar = this.f3668c;
        if (uVar == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        long j11 = this.f3669f;
        if (j11 - j10 < j10) {
            while (j11 > j10) {
                uVar = uVar.f3707g;
                Intrinsics.checkNotNull(uVar);
                j11 -= uVar.f3704c - uVar.f3703b;
            }
            Intrinsics.checkNotNull(uVar);
            return uVar.f3702a[(int) ((uVar.f3703b + j10) - j11)];
        }
        long j12 = 0;
        while (true) {
            long j13 = (uVar.f3704c - uVar.f3703b) + j12;
            if (j13 > j10) {
                Intrinsics.checkNotNull(uVar);
                return uVar.f3702a[(int) ((uVar.f3703b + j10) - j12)];
            }
            uVar = uVar.f3706f;
            Intrinsics.checkNotNull(uVar);
            j12 = j13;
        }
    }

    public long f0(y source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long O = source.O(this, (long) ConstantsKt.DEFAULT_BUFFER_SIZE);
            if (O == -1) {
                return j10;
            }
            j10 += O;
        }
    }

    @Override // bf.g, bf.w, java.io.Flushable
    public void flush() {
    }

    @Override // bf.y
    public z g() {
        return z.d;
    }

    public int hashCode() {
        u uVar = this.f3668c;
        if (uVar != null) {
            int i10 = 1;
            do {
                int i11 = uVar.f3704c;
                for (int i12 = uVar.f3703b; i12 < i11; i12++) {
                    i10 = (i10 * 31) + uVar.f3702a[i12];
                }
                uVar = uVar.f3706f;
                Intrinsics.checkNotNull(uVar);
            } while (uVar != this.f3668c);
            return i10;
        }
        return 0;
    }

    public long i(byte b10, long j10, long j11) {
        u uVar;
        long j12 = 0;
        if (!(0 <= j10 && j11 >= j10)) {
            StringBuilder m10 = a1.a.m("size=");
            m10.append(this.f3669f);
            m10.append(" fromIndex=");
            m10.append(j10);
            m10.append(" toIndex=");
            m10.append(j11);
            throw new IllegalArgumentException(m10.toString().toString());
        }
        long j13 = this.f3669f;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j10 != j11 && (uVar = this.f3668c) != null) {
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    uVar = uVar.f3707g;
                    Intrinsics.checkNotNull(uVar);
                    j13 -= uVar.f3704c - uVar.f3703b;
                }
                while (j13 < j11) {
                    byte[] bArr = uVar.f3702a;
                    int min = (int) Math.min(uVar.f3704c, (uVar.f3703b + j11) - j13);
                    for (int i10 = (int) ((uVar.f3703b + j10) - j13); i10 < min; i10++) {
                        if (bArr[i10] == b10) {
                            return (i10 - uVar.f3703b) + j13;
                        }
                    }
                    j13 += uVar.f3704c - uVar.f3703b;
                    uVar = uVar.f3706f;
                    Intrinsics.checkNotNull(uVar);
                    j10 = j13;
                }
            } else {
                while (true) {
                    long j14 = (uVar.f3704c - uVar.f3703b) + j12;
                    if (j14 > j10) {
                        break;
                    }
                    uVar = uVar.f3706f;
                    Intrinsics.checkNotNull(uVar);
                    j12 = j14;
                }
                while (j12 < j11) {
                    byte[] bArr2 = uVar.f3702a;
                    int min2 = (int) Math.min(uVar.f3704c, (uVar.f3703b + j11) - j12);
                    for (int i11 = (int) ((uVar.f3703b + j10) - j12); i11 < min2; i11++) {
                        if (bArr2[i11] == b10) {
                            return (i11 - uVar.f3703b) + j12;
                        }
                    }
                    j12 += uVar.f3704c - uVar.f3703b;
                    uVar = uVar.f3706f;
                    Intrinsics.checkNotNull(uVar);
                    j10 = j12;
                }
            }
        }
        return -1L;
    }

    public f i0(int i10) {
        u X = X(1);
        byte[] bArr = X.f3702a;
        int i11 = X.f3704c;
        X.f3704c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f3669f++;
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g j(byte[] bArr, int i10, int i11) {
        c0(bArr, i10, i11);
        return this;
    }

    @Override // bf.g
    /* renamed from: j0 */
    public f m0(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            i0(48);
        } else {
            boolean z10 = false;
            int i11 = 1;
            if (i10 < 0) {
                j10 = -j10;
                if (j10 < 0) {
                    s0("-9223372036854775808");
                } else {
                    z10 = true;
                }
            }
            if (j10 >= 100000000) {
                i11 = j10 < 1000000000000L ? j10 < 10000000000L ? j10 < 1000000000 ? 9 : 10 : j10 < 100000000000L ? 11 : 12 : j10 < 1000000000000000L ? j10 < 10000000000000L ? 13 : j10 < 100000000000000L ? 14 : 15 : j10 < 100000000000000000L ? j10 < 10000000000000000L ? 16 : 17 : j10 < 1000000000000000000L ? 18 : 19;
            } else if (j10 >= 10000) {
                i11 = j10 < 1000000 ? j10 < 100000 ? 5 : 6 : j10 < 10000000 ? 7 : 8;
            } else if (j10 >= 100) {
                i11 = j10 < 1000 ? 3 : 4;
            } else if (j10 >= 10) {
                i11 = 2;
            }
            if (z10) {
                i11++;
            }
            u X = X(i11);
            byte[] bArr = X.f3702a;
            int i12 = X.f3704c + i11;
            while (j10 != 0) {
                long j11 = 10;
                i12--;
                bArr[i12] = cf.a.f4100a[(int) (j10 % j11)];
                j10 /= j11;
            }
            if (z10) {
                bArr[i12 - 1] = (byte) 45;
            }
            X.f3704c += i11;
            this.f3669f += i11;
        }
        return this;
    }

    public long k(ByteString bytes, long j10) {
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.f() > 0) {
            long j12 = 0;
            if (j11 >= 0) {
                u uVar = this.f3668c;
                if (uVar != null) {
                    long j13 = this.f3669f;
                    if (j13 - j11 < j11) {
                        while (j13 > j11) {
                            uVar = uVar.f3707g;
                            Intrinsics.checkNotNull(uVar);
                            j13 -= uVar.f3704c - uVar.f3703b;
                        }
                        byte[] h10 = bytes.h();
                        byte b10 = h10[0];
                        int f10 = bytes.f();
                        long j14 = (this.f3669f - f10) + 1;
                        while (j13 < j14) {
                            byte[] bArr = uVar.f3702a;
                            long j15 = j14;
                            int min = (int) Math.min(uVar.f3704c, (uVar.f3703b + j14) - j13);
                            for (int i10 = (int) ((uVar.f3703b + j11) - j13); i10 < min; i10++) {
                                if (bArr[i10] == b10 && cf.a.a(uVar, i10 + 1, h10, 1, f10)) {
                                    return (i10 - uVar.f3703b) + j13;
                                }
                            }
                            j13 += uVar.f3704c - uVar.f3703b;
                            uVar = uVar.f3706f;
                            Intrinsics.checkNotNull(uVar);
                            j11 = j13;
                            j14 = j15;
                        }
                    } else {
                        while (true) {
                            long j16 = (uVar.f3704c - uVar.f3703b) + j12;
                            if (j16 > j11) {
                                break;
                            }
                            uVar = uVar.f3706f;
                            Intrinsics.checkNotNull(uVar);
                            j12 = j16;
                        }
                        byte[] h11 = bytes.h();
                        byte b11 = h11[0];
                        int f11 = bytes.f();
                        long j17 = (this.f3669f - f11) + 1;
                        while (j12 < j17) {
                            byte[] bArr2 = uVar.f3702a;
                            long j18 = j17;
                            int min2 = (int) Math.min(uVar.f3704c, (uVar.f3703b + j17) - j12);
                            for (int i11 = (int) ((uVar.f3703b + j11) - j12); i11 < min2; i11++) {
                                if (bArr2[i11] == b11 && cf.a.a(uVar, i11 + 1, h11, 1, f11)) {
                                    return (i11 - uVar.f3703b) + j12;
                                }
                            }
                            j12 += uVar.f3704c - uVar.f3703b;
                            uVar = uVar.f3706f;
                            Intrinsics.checkNotNull(uVar);
                            j11 = j12;
                            j17 = j18;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(android.support.v4.media.b.h("fromIndex < 0: ", j11).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    @Override // bf.h
    public void k0(long j10) {
        if (this.f3669f < j10) {
            throw new EOFException();
        }
    }

    @Override // bf.h
    public void l(long j10) {
        while (j10 > 0) {
            u uVar = this.f3668c;
            if (uVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j10, uVar.f3704c - uVar.f3703b);
            long j11 = min;
            this.f3669f -= j11;
            j10 -= j11;
            int i10 = uVar.f3703b + min;
            uVar.f3703b = i10;
            if (i10 == uVar.f3704c) {
                this.f3668c = uVar.a();
                v.b(uVar);
            }
        }
    }

    @Override // bf.w
    public void l0(f source, long j10) {
        u uVar;
        int i10;
        u uVar2;
        u c10;
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(source != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        b.b(source.f3669f, 0L, j10);
        long j11 = j10;
        while (j11 > 0) {
            u uVar3 = source.f3668c;
            Intrinsics.checkNotNull(uVar3);
            int i11 = uVar3.f3704c;
            Intrinsics.checkNotNull(source.f3668c);
            if (j11 < i11 - uVar.f3703b) {
                u uVar4 = this.f3668c;
                if (uVar4 != null) {
                    Intrinsics.checkNotNull(uVar4);
                    uVar2 = uVar4.f3707g;
                } else {
                    uVar2 = null;
                }
                if (uVar2 != null && uVar2.f3705e) {
                    if ((uVar2.f3704c + j11) - (uVar2.d ? 0 : uVar2.f3703b) <= ((long) ConstantsKt.DEFAULT_BUFFER_SIZE)) {
                        u uVar5 = source.f3668c;
                        Intrinsics.checkNotNull(uVar5);
                        uVar5.d(uVar2, (int) j11);
                        source.f3669f -= j11;
                        this.f3669f += j11;
                        return;
                    }
                }
                u uVar6 = source.f3668c;
                Intrinsics.checkNotNull(uVar6);
                int i12 = (int) j11;
                Objects.requireNonNull(uVar6);
                if (!(i12 > 0 && i12 <= uVar6.f3704c - uVar6.f3703b)) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i12 >= 1024) {
                    c10 = uVar6.c();
                } else {
                    c10 = v.c();
                    byte[] bArr = uVar6.f3702a;
                    byte[] bArr2 = c10.f3702a;
                    int i13 = uVar6.f3703b;
                    ArraysKt.copyInto$default(bArr, bArr2, 0, i13, i13 + i12, 2, (Object) null);
                }
                c10.f3704c = c10.f3703b + i12;
                uVar6.f3703b += i12;
                u uVar7 = uVar6.f3707g;
                Intrinsics.checkNotNull(uVar7);
                uVar7.b(c10);
                source.f3668c = c10;
            }
            u uVar8 = source.f3668c;
            Intrinsics.checkNotNull(uVar8);
            long j12 = uVar8.f3704c - uVar8.f3703b;
            source.f3668c = uVar8.a();
            u uVar9 = this.f3668c;
            if (uVar9 == null) {
                this.f3668c = uVar8;
                uVar8.f3707g = uVar8;
                uVar8.f3706f = uVar8;
            } else {
                Intrinsics.checkNotNull(uVar9);
                u uVar10 = uVar9.f3707g;
                Intrinsics.checkNotNull(uVar10);
                uVar10.b(uVar8);
                u uVar11 = uVar8.f3707g;
                if (!(uVar11 != uVar8)) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                Intrinsics.checkNotNull(uVar11);
                if (uVar11.f3705e) {
                    int i14 = uVar8.f3704c - uVar8.f3703b;
                    u uVar12 = uVar8.f3707g;
                    Intrinsics.checkNotNull(uVar12);
                    int i15 = ConstantsKt.DEFAULT_BUFFER_SIZE - uVar12.f3704c;
                    u uVar13 = uVar8.f3707g;
                    Intrinsics.checkNotNull(uVar13);
                    if (uVar13.d) {
                        i10 = 0;
                    } else {
                        u uVar14 = uVar8.f3707g;
                        Intrinsics.checkNotNull(uVar14);
                        i10 = uVar14.f3703b;
                    }
                    if (i14 <= i15 + i10) {
                        u uVar15 = uVar8.f3707g;
                        Intrinsics.checkNotNull(uVar15);
                        uVar8.d(uVar15, i14);
                        uVar8.a();
                        v.b(uVar8);
                    }
                }
            }
            source.f3669f -= j12;
            this.f3669f += j12;
            j11 -= j12;
        }
    }

    public long n(ByteString targetBytes, long j10) {
        int i10;
        int i11;
        int i12;
        int i13;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j12 = 0;
        if (j11 >= 0) {
            u uVar = this.f3668c;
            if (uVar != null) {
                long j13 = this.f3669f;
                if (j13 - j11 < j11) {
                    while (j13 > j11) {
                        uVar = uVar.f3707g;
                        Intrinsics.checkNotNull(uVar);
                        j13 -= uVar.f3704c - uVar.f3703b;
                    }
                    if (targetBytes.f() == 2) {
                        byte i14 = targetBytes.i(0);
                        byte i15 = targetBytes.i(1);
                        while (j13 < this.f3669f) {
                            byte[] bArr = uVar.f3702a;
                            i12 = (int) ((uVar.f3703b + j11) - j13);
                            int i16 = uVar.f3704c;
                            while (i12 < i16) {
                                byte b10 = bArr[i12];
                                if (b10 == i14 || b10 == i15) {
                                    i13 = uVar.f3703b;
                                } else {
                                    i12++;
                                }
                            }
                            j13 += uVar.f3704c - uVar.f3703b;
                            uVar = uVar.f3706f;
                            Intrinsics.checkNotNull(uVar);
                            j11 = j13;
                        }
                        return -1L;
                    }
                    byte[] h10 = targetBytes.h();
                    while (j13 < this.f3669f) {
                        byte[] bArr2 = uVar.f3702a;
                        i12 = (int) ((uVar.f3703b + j11) - j13);
                        int i17 = uVar.f3704c;
                        while (i12 < i17) {
                            byte b11 = bArr2[i12];
                            for (byte b12 : h10) {
                                if (b11 == b12) {
                                    i13 = uVar.f3703b;
                                }
                            }
                            i12++;
                        }
                        j13 += uVar.f3704c - uVar.f3703b;
                        uVar = uVar.f3706f;
                        Intrinsics.checkNotNull(uVar);
                        j11 = j13;
                    }
                    return -1L;
                    return (i12 - i13) + j13;
                }
                while (true) {
                    long j14 = (uVar.f3704c - uVar.f3703b) + j12;
                    if (j14 > j11) {
                        break;
                    }
                    uVar = uVar.f3706f;
                    Intrinsics.checkNotNull(uVar);
                    j12 = j14;
                }
                if (targetBytes.f() == 2) {
                    byte i18 = targetBytes.i(0);
                    byte i19 = targetBytes.i(1);
                    while (j12 < this.f3669f) {
                        byte[] bArr3 = uVar.f3702a;
                        i10 = (int) ((uVar.f3703b + j11) - j12);
                        int i20 = uVar.f3704c;
                        while (i10 < i20) {
                            byte b13 = bArr3[i10];
                            if (b13 == i18 || b13 == i19) {
                                i11 = uVar.f3703b;
                            } else {
                                i10++;
                            }
                        }
                        j12 += uVar.f3704c - uVar.f3703b;
                        uVar = uVar.f3706f;
                        Intrinsics.checkNotNull(uVar);
                        j11 = j12;
                    }
                    return -1L;
                }
                byte[] h11 = targetBytes.h();
                while (j12 < this.f3669f) {
                    byte[] bArr4 = uVar.f3702a;
                    i10 = (int) ((uVar.f3703b + j11) - j12);
                    int i21 = uVar.f3704c;
                    while (i10 < i21) {
                        byte b14 = bArr4[i10];
                        for (byte b15 : h11) {
                            if (b14 == b15) {
                                i11 = uVar.f3703b;
                            }
                        }
                        i10++;
                    }
                    j12 += uVar.f3704c - uVar.f3703b;
                    uVar = uVar.f3706f;
                    Intrinsics.checkNotNull(uVar);
                    j11 = j12;
                }
                return -1L;
                return (i10 - i11) + j12;
            }
            return -1L;
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("fromIndex < 0: ", j11).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1 A[EDGE_INSN: B:42:0x00a1->B:37:0x00a1 ?: BREAK  , SYNTHETIC] */
    @Override // bf.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long n0() {
        /*
            r15 = this;
            long r0 = r15.f3669f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La8
            r0 = 0
            r1 = 0
            r4 = r2
        Lb:
            bf.u r6 = r15.f3668c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            byte[] r7 = r6.f3702a
            int r8 = r6.f3703b
            int r9 = r6.f3704c
        L16:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L27
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L27
            int r11 = r10 - r11
            goto L40
        L27:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L32
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L32
            goto L3c
        L32:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L72
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L72
        L3c:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L40:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L50
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L50:
            bf.f r0 = new bf.f
            r0.<init>()
            r0.U(r4)
            r0.i0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = a1.a.m(r2)
            java.lang.String r0 = r0.E()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L8d
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = a1.a.m(r1)
            java.lang.String r2 = bf.b.c(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            bf.u r7 = r6.a()
            r15.f3668c = r7
            bf.v.b(r6)
            goto L9b
        L99:
            r6.f3703b = r8
        L9b:
            if (r1 != 0) goto La1
            bf.u r6 = r15.f3668c
            if (r6 != 0) goto Lb
        La1:
            long r1 = r15.f3669f
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f3669f = r1
            return r4
        La8:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.f.n0():long");
    }

    @Override // bf.h
    public InputStream o0() {
        return new a();
    }

    @Override // bf.g
    /* renamed from: p0 */
    public f U(long j10) {
        if (j10 == 0) {
            i0(48);
        } else {
            long j11 = (j10 >>> 1) | j10;
            long j12 = j11 | (j11 >>> 2);
            long j13 = j12 | (j12 >>> 4);
            long j14 = j13 | (j13 >>> 8);
            long j15 = j14 | (j14 >>> 16);
            long j16 = j15 | (j15 >>> 32);
            long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
            long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
            long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
            long j20 = j19 + (j19 >>> 8);
            long j21 = j20 + (j20 >>> 16);
            int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + 3) / 4);
            u X = X(i10);
            byte[] bArr = X.f3702a;
            int i11 = X.f3704c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                bArr[i12] = cf.a.f4100a[(int) (15 & j10)];
                j10 >>>= 4;
            }
            X.f3704c += i10;
            this.f3669f += i10;
        }
        return this;
    }

    @Override // bf.h
    public f q() {
        return this;
    }

    public f q0(int i10) {
        u X = X(4);
        byte[] bArr = X.f3702a;
        int i11 = X.f3704c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i14] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        X.f3704c = i14 + 1;
        this.f3669f += 4;
        return this;
    }

    @Override // bf.h
    public ByteString r(long j10) {
        if (j10 >= 0 && j10 <= ((long) IntCompanionObject.MAX_VALUE)) {
            if (this.f3669f >= j10) {
                if (j10 >= ((long) ConstantsKt.DEFAULT_BLOCK_SIZE)) {
                    ByteString P = P((int) j10);
                    l(j10);
                    return P;
                }
                return new ByteString(b0(j10));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount: ", j10).toString());
    }

    public f r0(int i10) {
        u X = X(2);
        byte[] bArr = X.f3702a;
        int i11 = X.f3704c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i12] = (byte) (i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        X.f3704c = i12 + 1;
        this.f3669f += 2;
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        u uVar = this.f3668c;
        if (uVar != null) {
            int min = Math.min(sink.remaining(), uVar.f3704c - uVar.f3703b);
            sink.put(uVar.f3702a, uVar.f3703b, min);
            int i10 = uVar.f3703b + min;
            uVar.f3703b = i10;
            this.f3669f -= min;
            if (i10 == uVar.f3704c) {
                this.f3668c = uVar.a();
                v.b(uVar);
            }
            return min;
        }
        return -1;
    }

    @Override // bf.h
    public byte readByte() {
        if (this.f3669f != 0) {
            u uVar = this.f3668c;
            Intrinsics.checkNotNull(uVar);
            int i10 = uVar.f3703b;
            int i11 = uVar.f3704c;
            int i12 = i10 + 1;
            byte b10 = uVar.f3702a[i10];
            this.f3669f--;
            if (i12 == i11) {
                this.f3668c = uVar.a();
                v.b(uVar);
            } else {
                uVar.f3703b = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // bf.h
    public int readInt() {
        if (this.f3669f >= 4) {
            u uVar = this.f3668c;
            Intrinsics.checkNotNull(uVar);
            int i10 = uVar.f3703b;
            int i11 = uVar.f3704c;
            if (i11 - i10 < 4) {
                return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
            }
            byte[] bArr = uVar.f3702a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i12] & UByte.MAX_VALUE) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & UByte.MAX_VALUE) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & UByte.MAX_VALUE);
            this.f3669f -= 4;
            if (i17 == i11) {
                this.f3668c = uVar.a();
                v.b(uVar);
            } else {
                uVar.f3703b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // bf.h
    public short readShort() {
        if (this.f3669f >= 2) {
            u uVar = this.f3668c;
            Intrinsics.checkNotNull(uVar);
            int i10 = uVar.f3703b;
            int i11 = uVar.f3704c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
            }
            byte[] bArr = uVar.f3702a;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & UByte.MAX_VALUE) << 8) | (bArr[i12] & UByte.MAX_VALUE);
            this.f3669f -= 2;
            if (i13 == i11) {
                this.f3668c = uVar.a();
                v.b(uVar);
            } else {
                uVar.f3703b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // bf.h
    public boolean request(long j10) {
        return this.f3669f >= j10;
    }

    public int s(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        b.b(sink.length, i10, i11);
        u uVar = this.f3668c;
        if (uVar != null) {
            int min = Math.min(i11, uVar.f3704c - uVar.f3703b);
            byte[] bArr = uVar.f3702a;
            int i12 = uVar.f3703b;
            ArraysKt.copyInto(bArr, sink, i10, i12, i12 + min);
            int i13 = uVar.f3703b + min;
            uVar.f3703b = i13;
            this.f3669f -= min;
            if (i13 == uVar.f3704c) {
                this.f3668c = uVar.a();
                v.b(uVar);
                return min;
            }
            return min;
        }
        return -1;
    }

    public f s0(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        t0(string, 0, string.length());
        return this;
    }

    public ByteString t() {
        return r(this.f3669f);
    }

    public f t0(String string, int i10, int i11) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 >= 0) {
            if (!(i11 >= i10)) {
                throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
            }
            if (!(i11 <= string.length())) {
                StringBuilder n = a1.a.n("endIndex > string.length: ", i11, " > ");
                n.append(string.length());
                throw new IllegalArgumentException(n.toString().toString());
            }
            while (i10 < i11) {
                char charAt2 = string.charAt(i10);
                if (charAt2 < 128) {
                    u X = X(1);
                    byte[] bArr = X.f3702a;
                    int i12 = X.f3704c - i10;
                    int min = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) charAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= min || (charAt = string.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) charAt;
                    }
                    int i14 = X.f3704c;
                    int i15 = (i12 + i10) - i14;
                    X.f3704c = i14 + i15;
                    this.f3669f += i15;
                } else {
                    if (charAt2 < 2048) {
                        u X2 = X(2);
                        byte[] bArr2 = X2.f3702a;
                        int i16 = X2.f3704c;
                        bArr2[i16] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                        X2.f3704c = i16 + 2;
                        this.f3669f += 2;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        u X3 = X(3);
                        byte[] bArr3 = X3.f3702a;
                        int i17 = X3.f3704c;
                        bArr3[i17] = (byte) ((charAt2 >> '\f') | 224);
                        bArr3[i17 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i17 + 2] = (byte) ((charAt2 & '?') | 128);
                        X3.f3704c = i17 + 3;
                        this.f3669f += 3;
                    } else {
                        int i18 = i10 + 1;
                        char charAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                        if (charAt2 > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                            i0(63);
                            i10 = i18;
                        } else {
                            int i19 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            u X4 = X(4);
                            byte[] bArr4 = X4.f3702a;
                            int i20 = X4.f3704c;
                            bArr4[i20] = (byte) ((i19 >> 18) | 240);
                            bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                            bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                            bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                            X4.f3704c = i20 + 4;
                            this.f3669f += 4;
                            i10 += 2;
                        }
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(a1.a.j("beginIndex < 0: ", i10).toString());
    }

    public String toString() {
        long j10 = this.f3669f;
        if (j10 <= ((long) IntCompanionObject.MAX_VALUE)) {
            return P((int) j10).toString();
        }
        StringBuilder m10 = a1.a.m("size > Int.MAX_VALUE: ");
        m10.append(this.f3669f);
        throw new IllegalStateException(m10.toString().toString());
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g u(int i10) {
        r0(i10);
        return this;
    }

    public f u0(int i10) {
        String str;
        if (i10 < 128) {
            i0(i10);
        } else if (i10 < 2048) {
            u X = X(2);
            byte[] bArr = X.f3702a;
            int i11 = X.f3704c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            X.f3704c = i11 + 2;
            this.f3669f += 2;
        } else if (55296 <= i10 && 57343 >= i10) {
            i0(63);
        } else if (i10 < 65536) {
            u X2 = X(3);
            byte[] bArr2 = X2.f3702a;
            int i12 = X2.f3704c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            X2.f3704c = i12 + 3;
            this.f3669f += 3;
        } else if (i10 > 1114111) {
            StringBuilder m10 = a1.a.m("Unexpected code point: 0x");
            if (i10 != 0) {
                char[] cArr = a0.b.f121m;
                int i13 = 0;
                char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
                while (i13 < 8 && cArr2[i13] == '0') {
                    i13++;
                }
                str = new String(cArr2, i13, 8 - i13);
            } else {
                str = "0";
            }
            m10.append(str);
            throw new IllegalArgumentException(m10.toString());
        } else {
            u X3 = X(4);
            byte[] bArr3 = X3.f3702a;
            int i14 = X3.f3704c;
            bArr3[i14] = (byte) ((i10 >> 18) | 240);
            bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i14 + 3] = (byte) ((i10 & 63) | 128);
            X3.f3704c = i14 + 4;
            this.f3669f += 4;
        }
        return this;
    }

    public short v() {
        int readShort = readShort() & UShort.MAX_VALUE;
        return (short) (((readShort & KotlinVersion.MAX_COMPONENT_VALUE) << 8) | ((65280 & readShort) >>> 8));
    }

    public String w(long j10, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0 && j10 <= ((long) IntCompanionObject.MAX_VALUE)) {
            if (this.f3669f >= j10) {
                if (i10 == 0) {
                    return BuildConfig.FLAVOR;
                }
                u uVar = this.f3668c;
                Intrinsics.checkNotNull(uVar);
                int i11 = uVar.f3703b;
                if (i11 + j10 > uVar.f3704c) {
                    return new String(b0(j10), charset);
                }
                int i12 = (int) j10;
                String str = new String(uVar.f3702a, i11, i12, charset);
                int i13 = uVar.f3703b + i12;
                uVar.f3703b = i13;
                this.f3669f -= j10;
                if (i13 == uVar.f3704c) {
                    this.f3668c = uVar.a();
                    v.b(uVar);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount: ", j10).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            u X = X(1);
            int min = Math.min(i10, 8192 - X.f3704c);
            source.get(X.f3702a, X.f3704c, min);
            i10 -= min;
            X.f3704c += min;
        }
        this.f3669f += remaining;
        return remaining;
    }

    @Override // bf.g
    public /* bridge */ /* synthetic */ g x(int i10) {
        q0(i10);
        return this;
    }
}
