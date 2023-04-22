package we;

import bf.y;
import bf.z;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import we.b;

/* loaded from: classes3.dex */
public final class l implements Closeable {
    public static final Logger n;

    /* renamed from: t  reason: collision with root package name */
    public static final l f17554t = null;

    /* renamed from: c  reason: collision with root package name */
    public final a f17555c;

    /* renamed from: f  reason: collision with root package name */
    public final b.a f17556f;

    /* renamed from: j  reason: collision with root package name */
    public final bf.h f17557j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f17558m;

    /* loaded from: classes3.dex */
    public static final class a implements y {

        /* renamed from: c  reason: collision with root package name */
        public int f17559c;

        /* renamed from: f  reason: collision with root package name */
        public int f17560f;

        /* renamed from: j  reason: collision with root package name */
        public int f17561j;

        /* renamed from: m  reason: collision with root package name */
        public int f17562m;
        public int n;

        /* renamed from: t  reason: collision with root package name */
        public final bf.h f17563t;

        public a(bf.h source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f17563t = source;
        }

        @Override // bf.y
        public long O(bf.f sink, long j10) {
            int i10;
            int readInt;
            Intrinsics.checkNotNullParameter(sink, "sink");
            do {
                int i11 = this.f17562m;
                if (i11 != 0) {
                    long O = this.f17563t.O(sink, Math.min(j10, i11));
                    if (O == -1) {
                        return -1L;
                    }
                    this.f17562m -= (int) O;
                    return O;
                }
                this.f17563t.l(this.n);
                this.n = 0;
                if ((this.f17560f & 4) != 0) {
                    return -1L;
                }
                i10 = this.f17561j;
                int r10 = qe.c.r(this.f17563t);
                this.f17562m = r10;
                this.f17559c = r10;
                int readByte = this.f17563t.readByte() & UByte.MAX_VALUE;
                this.f17560f = this.f17563t.readByte() & UByte.MAX_VALUE;
                l lVar = l.f17554t;
                Logger logger = l.n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.f17492e.b(true, this.f17561j, this.f17559c, readByte, this.f17560f));
                }
                readInt = this.f17563t.readInt() & IntCompanionObject.MAX_VALUE;
                this.f17561j = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } while (readInt == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // bf.y
        public z g() {
            return this.f17563t.g();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void b(boolean z10, int i10, int i11, List<we.a> list);

        void c(int i10, long j10);

        void d(boolean z10, q qVar);

        void e(boolean z10, int i10, bf.h hVar, int i11);

        void f(boolean z10, int i10, int i11);

        void g(int i10, int i11, int i12, boolean z10);

        void h(int i10, ErrorCode errorCode);

        void i(int i10, int i11, List<we.a> list);

        void j(int i10, ErrorCode errorCode, ByteString byteString);
    }

    static {
        Logger logger = Logger.getLogger(c.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(Http2::class.java.name)");
        n = logger;
    }

    public l(bf.h source, boolean z10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f17557j = source;
        this.f17558m = z10;
        a aVar = new a(source);
        this.f17555c = aVar;
        this.f17556f = new b.a(aVar, ConstantsKt.DEFAULT_BLOCK_SIZE, 0, 4);
    }

    public static final int a(int i10, int i11, int i12) {
        if ((i11 & 8) != 0) {
            i10--;
        }
        if (i12 <= i10) {
            return i10 - i12;
        }
        throw new IOException("PROTOCOL_ERROR padding " + i12 + " > remaining length " + i10);
    }

    public final boolean c(boolean z10, b handler) {
        int readInt;
        Intrinsics.checkNotNullParameter(handler, "handler");
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        try {
            this.f17557j.k0(9L);
            int r10 = qe.c.r(this.f17557j);
            if (r10 <= 16384) {
                int readByte = this.f17557j.readByte() & UByte.MAX_VALUE;
                int readByte2 = this.f17557j.readByte() & UByte.MAX_VALUE;
                int readInt2 = this.f17557j.readInt() & IntCompanionObject.MAX_VALUE;
                Logger logger = n;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(c.f17492e.b(true, readInt2, r10, readByte, readByte2));
                }
                if (z10 && readByte != 4) {
                    StringBuilder m10 = a1.a.m("Expected a SETTINGS frame but was ");
                    m10.append(c.f17492e.a(readByte));
                    throw new IOException(m10.toString());
                }
                ErrorCode errorCode = null;
                switch (readByte) {
                    case 0:
                        if (readInt2 != 0) {
                            boolean z11 = (readByte2 & 1) != 0;
                            if (!((readByte2 & 32) != 0)) {
                                if ((readByte2 & 8) != 0) {
                                    byte readByte3 = this.f17557j.readByte();
                                    byte[] bArr = qe.c.f14512a;
                                    i10 = readByte3 & UByte.MAX_VALUE;
                                }
                                handler.e(z11, readInt2, this.f17557j, a(r10, readByte2, i10));
                                this.f17557j.l(i10);
                                break;
                            } else {
                                throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            }
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        }
                    case 1:
                        if (readInt2 != 0) {
                            boolean z12 = (readByte2 & 1) != 0;
                            if ((readByte2 & 8) != 0) {
                                byte readByte4 = this.f17557j.readByte();
                                byte[] bArr2 = qe.c.f14512a;
                                i12 = readByte4 & UByte.MAX_VALUE;
                            }
                            if ((readByte2 & 32) != 0) {
                                f(handler, readInt2);
                                r10 -= 5;
                            }
                            handler.b(z12, readInt2, -1, e(a(r10, readByte2, i12), i12, readByte2, readInt2));
                            break;
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        }
                    case 2:
                        if (r10 == 5) {
                            if (readInt2 != 0) {
                                f(handler, readInt2);
                                break;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        } else {
                            throw new IOException(a0.a.k("TYPE_PRIORITY length: ", r10, " != 5"));
                        }
                    case 3:
                        if (r10 == 4) {
                            if (readInt2 != 0) {
                                int readInt3 = this.f17557j.readInt();
                                ErrorCode[] values = ErrorCode.values();
                                int length = values.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 < length) {
                                        ErrorCode errorCode2 = values[i13];
                                        if (errorCode2.b() == readInt3) {
                                            errorCode = errorCode2;
                                        } else {
                                            i13++;
                                        }
                                    }
                                }
                                if (errorCode != null) {
                                    handler.h(readInt2, errorCode);
                                    break;
                                } else {
                                    throw new IOException(a1.a.j("TYPE_RST_STREAM unexpected error code: ", readInt3));
                                }
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        } else {
                            throw new IOException(a0.a.k("TYPE_RST_STREAM length: ", r10, " != 4"));
                        }
                    case 4:
                        if (readInt2 == 0) {
                            if ((readByte2 & 1) != 0) {
                                if (r10 == 0) {
                                    handler.a();
                                    break;
                                } else {
                                    throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                }
                            } else if (r10 % 6 == 0) {
                                q qVar = new q();
                                IntProgression step = RangesKt.step(RangesKt.until(0, r10), 6);
                                int first = step.getFirst();
                                int last = step.getLast();
                                int step2 = step.getStep();
                                if (step2 < 0 ? first >= last : first <= last) {
                                    while (true) {
                                        short readShort = this.f17557j.readShort();
                                        byte[] bArr3 = qe.c.f14512a;
                                        int i14 = readShort & UShort.MAX_VALUE;
                                        readInt = this.f17557j.readInt();
                                        if (i14 != 2) {
                                            if (i14 == 3) {
                                                i14 = 4;
                                            } else if (i14 == 4) {
                                                i14 = 7;
                                                if (readInt < 0) {
                                                    throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                }
                                            } else if (i14 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                            }
                                        } else if (readInt != 0 && readInt != 1) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        qVar.c(i14, readInt);
                                        if (first != last) {
                                            first += step2;
                                        }
                                    }
                                    throw new IOException(a1.a.j("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                                }
                                handler.d(false, qVar);
                                break;
                            } else {
                                throw new IOException(a1.a.j("TYPE_SETTINGS length % 6 != 0: ", r10));
                            }
                        } else {
                            throw new IOException("TYPE_SETTINGS streamId != 0");
                        }
                    case 5:
                        if (readInt2 != 0) {
                            if ((readByte2 & 8) != 0) {
                                byte readByte5 = this.f17557j.readByte();
                                byte[] bArr4 = qe.c.f14512a;
                                i11 = readByte5 & UByte.MAX_VALUE;
                            }
                            handler.i(readInt2, this.f17557j.readInt() & IntCompanionObject.MAX_VALUE, e(a(r10 - 4, readByte2, i11), i11, readByte2, readInt2));
                            break;
                        } else {
                            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        }
                    case 6:
                        if (r10 == 8) {
                            if (readInt2 == 0) {
                                handler.f((readByte2 & 1) != 0, this.f17557j.readInt(), this.f17557j.readInt());
                                break;
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        } else {
                            throw new IOException(a1.a.j("TYPE_PING length != 8: ", r10));
                        }
                    case 7:
                        if (r10 >= 8) {
                            if (readInt2 == 0) {
                                int readInt4 = this.f17557j.readInt();
                                int readInt5 = this.f17557j.readInt();
                                int i15 = r10 - 8;
                                ErrorCode[] values2 = ErrorCode.values();
                                int length2 = values2.length;
                                int i16 = 0;
                                while (true) {
                                    if (i16 < length2) {
                                        ErrorCode errorCode3 = values2[i16];
                                        if (errorCode3.b() == readInt5) {
                                            errorCode = errorCode3;
                                        } else {
                                            i16++;
                                        }
                                    }
                                }
                                if (errorCode != null) {
                                    ByteString byteString = ByteString.f13727j;
                                    if (i15 > 0) {
                                        byteString = this.f17557j.r(i15);
                                    }
                                    handler.j(readInt4, errorCode, byteString);
                                    break;
                                } else {
                                    throw new IOException(a1.a.j("TYPE_GOAWAY unexpected error code: ", readInt5));
                                }
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        } else {
                            throw new IOException(a1.a.j("TYPE_GOAWAY length < 8: ", r10));
                        }
                    case 8:
                        if (r10 == 4) {
                            int readInt6 = this.f17557j.readInt();
                            byte[] bArr5 = qe.c.f14512a;
                            long j10 = readInt6 & 2147483647L;
                            if (j10 != 0) {
                                handler.c(readInt2, j10);
                                break;
                            } else {
                                throw new IOException("windowSizeIncrement was 0");
                            }
                        } else {
                            throw new IOException(a1.a.j("TYPE_WINDOW_UPDATE length !=4: ", r10));
                        }
                    default:
                        this.f17557j.l(r10);
                        break;
                }
                return true;
            }
            throw new IOException(a1.a.j("FRAME_SIZE_ERROR: ", r10));
        } catch (EOFException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17557j.close();
    }

    public final void d(b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.f17558m) {
            if (!c(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        bf.h hVar = this.f17557j;
        ByteString byteString = c.f17489a;
        ByteString r10 = hVar.r(byteString.f());
        Logger logger = n;
        if (logger.isLoggable(Level.FINE)) {
            StringBuilder m10 = a1.a.m("<< CONNECTION ");
            m10.append(r10.g());
            logger.fine(qe.c.i(m10.toString(), new Object[0]));
        }
        if (!Intrinsics.areEqual(byteString, r10)) {
            StringBuilder m11 = a1.a.m("Expected a connection header but was ");
            m11.append(r10.m());
            throw new IOException(m11.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0040 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<we.a> e(int r2, int r3, int r4, int r5) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: we.l.e(int, int, int, int):java.util.List");
    }

    public final void f(b bVar, int i10) {
        int readInt = this.f17557j.readInt();
        boolean z10 = (readInt & ((int) 2147483648L)) != 0;
        int i11 = readInt & IntCompanionObject.MAX_VALUE;
        byte readByte = this.f17557j.readByte();
        byte[] bArr = qe.c.f14512a;
        bVar.g(i10, i11, (readByte & UByte.MAX_VALUE) + 1, z10);
    }
}
