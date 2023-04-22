package bf;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class t implements h {
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final f f3698c;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public boolean f3699f;
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public final y f3700j;

    /* loaded from: classes2.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            t tVar = t.this;
            if (tVar.f3699f) {
                throw new IOException("closed");
            }
            return (int) Math.min(tVar.f3698c.f3669f, (long) IntCompanionObject.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            t.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            t tVar = t.this;
            if (tVar.f3699f) {
                throw new IOException("closed");
            }
            f fVar = tVar.f3698c;
            if (fVar.f3669f == 0 && tVar.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                return -1;
            }
            return t.this.f3698c.readByte() & UByte.MAX_VALUE;
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (t.this.f3699f) {
                throw new IOException("closed");
            }
            b.b(data.length, i10, i11);
            t tVar = t.this;
            f fVar = tVar.f3698c;
            if (fVar.f3669f == 0 && tVar.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                return -1;
            }
            return t.this.f3698c.s(data, i10, i11);
        }

        public String toString() {
            return t.this + ".inputStream()";
        }
    }

    public t(y source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f3700j = source;
        this.f3698c = new f();
    }

    @Override // bf.h
    public byte[] A() {
        this.f3698c.f0(this.f3700j);
        return this.f3698c.A();
    }

    @Override // bf.h
    public long B(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!this.f3699f)) {
            throw new IllegalStateException("closed".toString());
        }
        long j10 = 0;
        while (true) {
            long k10 = this.f3698c.k(bytes, j10);
            if (k10 != -1) {
                return k10;
            }
            f fVar = this.f3698c;
            long j11 = fVar.f3669f;
            if (this.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (j11 - bytes.f()) + 1);
        }
    }

    @Override // bf.h
    public boolean C() {
        if (!this.f3699f) {
            return this.f3698c.C() && this.f3700j.O(this.f3698c, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.h
    public long I(w sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f3700j.O(this.f3698c, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) != -1) {
            long c10 = this.f3698c.c();
            if (c10 > 0) {
                j10 += c10;
                ((f) sink).l0(this.f3698c, c10);
            }
        }
        f fVar = this.f3698c;
        long j11 = fVar.f3669f;
        if (j11 > 0) {
            long j12 = j10 + j11;
            ((f) sink).l0(fVar, j11);
            return j12;
        }
        return j10;
    }

    @Override // bf.h
    public long K(ByteString targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!this.f3699f)) {
            throw new IllegalStateException("closed".toString());
        }
        long j10 = 0;
        while (true) {
            long n = this.f3698c.n(targetBytes, j10);
            if (n != -1) {
                return n;
            }
            f fVar = this.f3698c;
            long j11 = fVar.f3669f;
            if (this.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, j11);
        }
    }

    @Override // bf.h
    public String L(long j10) {
        if (j10 >= 0) {
            long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
            byte b10 = (byte) 10;
            long a10 = a(b10, 0L, j11);
            if (a10 != -1) {
                return cf.a.b(this.f3698c, a10);
            }
            if (j11 < Long.MAX_VALUE && request(j11) && this.f3698c.f(j11 - 1) == ((byte) 13) && request(1 + j11) && this.f3698c.f(j11) == b10) {
                return cf.a.b(this.f3698c, j11);
            }
            f fVar = new f();
            f fVar2 = this.f3698c;
            fVar2.d(fVar, 0L, Math.min(32, fVar2.f3669f));
            StringBuilder m10 = a1.a.m("\\n not found: limit=");
            m10.append(Math.min(this.f3698c.f3669f, j10));
            m10.append(" content=");
            m10.append(fVar.t().g());
            m10.append("…");
            throw new EOFException(m10.toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("limit < 0: ", j10).toString());
    }

    @Override // bf.h
    public int M(p options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!this.f3699f) {
            while (true) {
                int c10 = cf.a.c(this.f3698c, options, true);
                if (c10 == -2) {
                    if (this.f3700j.O(this.f3698c, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                        break;
                    }
                } else if (c10 != -1) {
                    this.f3698c.l(options.f3686c[c10].f());
                    return c10;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.y
    public long O(f sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 >= 0) {
            if (!this.f3699f) {
                f fVar = this.f3698c;
                if (fVar.f3669f == 0 && this.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                return this.f3698c.O(sink, Math.min(j10, this.f3698c.f3669f));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
    }

    @Override // bf.h
    public boolean Q(long j10, ByteString bytes) {
        int i10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int f10 = bytes.f();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!this.f3699f) {
            if (j10 >= 0 && f10 >= 0 && bytes.f() - 0 >= f10) {
                while (i10 < f10) {
                    long j11 = i10 + j10;
                    i10 = (request(1 + j11) && this.f3698c.f(j11) == bytes.i(0 + i10)) ? i10 + 1 : 0;
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public long a(byte b10, long j10, long j11) {
        boolean z10 = true;
        if (!this.f3699f) {
            if (!((0 > j10 || j11 < j10) ? false : false)) {
                throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
            }
            while (j10 < j11) {
                long i10 = this.f3698c.i(b10, j10, j11);
                if (i10 != -1) {
                    return i10;
                }
                f fVar = this.f3698c;
                long j12 = fVar.f3669f;
                if (j12 >= j11 || this.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1L;
                }
                j10 = Math.max(j10, j12);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.h
    public String a0() {
        return L(Long.MAX_VALUE);
    }

    @Override // bf.h, bf.g
    public f b() {
        return this.f3698c;
    }

    @Override // bf.h
    public byte[] b0(long j10) {
        if (request(j10)) {
            return this.f3698c.b0(j10);
        }
        throw new EOFException();
    }

    public h c() {
        return cb.e.o(new r(this));
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3699f) {
            return;
        }
        this.f3699f = true;
        this.f3700j.close();
        f fVar = this.f3698c;
        fVar.l(fVar.f3669f);
    }

    public int d() {
        k0(4L);
        int readInt = this.f3698c.readInt();
        return ((readInt & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // bf.y
    public z g() {
        return this.f3700j.g();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f3699f;
    }

    @Override // bf.h
    public void k0(long j10) {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // bf.h
    public void l(long j10) {
        if (!(!this.f3699f)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            f fVar = this.f3698c;
            if (fVar.f3669f == 0 && this.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j10, this.f3698c.f3669f);
            this.f3698c.l(min);
            j10 -= min;
        }
    }

    @Override // bf.h
    public long n0() {
        byte f10;
        k0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            f10 = this.f3698c.f(i10);
            if ((f10 < ((byte) 48) || f10 > ((byte) 57)) && ((f10 < ((byte) 97) || f10 > ((byte) 102)) && (f10 < ((byte) 65) || f10 > ((byte) 70)))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder m10 = a1.a.m("Expected leading [0-9a-fA-F] character but was 0x");
            String num = Integer.toString(f10, CharsKt.checkRadix(CharsKt.checkRadix(16)));
            Intrinsics.checkNotNullExpressionValue(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            m10.append(num);
            throw new NumberFormatException(m10.toString());
        }
        return this.f3698c.n0();
    }

    @Override // bf.h
    public InputStream o0() {
        return new a();
    }

    @Override // bf.h
    public f q() {
        return this.f3698c;
    }

    @Override // bf.h
    public ByteString r(long j10) {
        if (request(j10)) {
            return this.f3698c.r(j10);
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        f fVar = this.f3698c;
        if (fVar.f3669f == 0 && this.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
            return -1;
        }
        return this.f3698c.read(sink);
    }

    @Override // bf.h
    public byte readByte() {
        k0(1L);
        return this.f3698c.readByte();
    }

    @Override // bf.h
    public int readInt() {
        k0(4L);
        return this.f3698c.readInt();
    }

    @Override // bf.h
    public short readShort() {
        k0(2L);
        return this.f3698c.readShort();
    }

    @Override // bf.h
    public boolean request(long j10) {
        f fVar;
        if (j10 >= 0) {
            if (!this.f3699f) {
                do {
                    fVar = this.f3698c;
                    if (fVar.f3669f >= j10) {
                        return true;
                    }
                } while (this.f3700j.O(fVar, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("buffer(");
        m10.append(this.f3700j);
        m10.append(')');
        return m10.toString();
    }
}
