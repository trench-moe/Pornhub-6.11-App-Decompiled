package bf;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l implements y {

    /* renamed from: c  reason: collision with root package name */
    public byte f3674c;

    /* renamed from: f  reason: collision with root package name */
    public final t f3675f;

    /* renamed from: j  reason: collision with root package name */
    public final Inflater f3676j;

    /* renamed from: m  reason: collision with root package name */
    public final m f3677m;
    public final CRC32 n;

    public l(y source) {
        Intrinsics.checkNotNullParameter(source, "source");
        t tVar = new t(source);
        this.f3675f = tVar;
        Inflater inflater = new Inflater(true);
        this.f3676j = inflater;
        this.f3677m = new m(tVar, inflater);
        this.n = new CRC32();
    }

    @Override // bf.y
    public long O(f sink, long j10) {
        long j11;
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return 0L;
            }
            if (this.f3674c == 0) {
                this.f3675f.k0(10L);
                byte f10 = this.f3675f.f3698c.f(3L);
                boolean z10 = ((f10 >> 1) & 1) == 1;
                if (z10) {
                    c(this.f3675f.f3698c, 0L, 10L);
                }
                t tVar = this.f3675f;
                tVar.k0(2L);
                a("ID1ID2", 8075, tVar.f3698c.readShort());
                this.f3675f.l(8L);
                if (((f10 >> 2) & 1) == 1) {
                    this.f3675f.k0(2L);
                    if (z10) {
                        c(this.f3675f.f3698c, 0L, 2L);
                    }
                    long v2 = this.f3675f.f3698c.v();
                    this.f3675f.k0(v2);
                    if (z10) {
                        j11 = v2;
                        c(this.f3675f.f3698c, 0L, v2);
                    } else {
                        j11 = v2;
                    }
                    this.f3675f.l(j11);
                }
                if (((f10 >> 3) & 1) == 1) {
                    long a10 = this.f3675f.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a10 == -1) {
                        throw new EOFException();
                    }
                    if (z10) {
                        c(this.f3675f.f3698c, 0L, a10 + 1);
                    }
                    this.f3675f.l(a10 + 1);
                }
                if (((f10 >> 4) & 1) == 1) {
                    long a11 = this.f3675f.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a11 == -1) {
                        throw new EOFException();
                    }
                    if (z10) {
                        c(this.f3675f.f3698c, 0L, a11 + 1);
                    }
                    this.f3675f.l(a11 + 1);
                }
                if (z10) {
                    t tVar2 = this.f3675f;
                    tVar2.k0(2L);
                    a("FHCRC", tVar2.f3698c.v(), (short) this.n.getValue());
                    this.n.reset();
                }
                this.f3674c = (byte) 1;
            }
            if (this.f3674c == 1) {
                long j12 = sink.f3669f;
                long O = this.f3677m.O(sink, j10);
                if (O != -1) {
                    c(sink, j12, O);
                    return O;
                }
                this.f3674c = (byte) 2;
            }
            if (this.f3674c == 2) {
                a("CRC", this.f3675f.d(), (int) this.n.getValue());
                a("ISIZE", this.f3675f.d(), (int) this.f3676j.getBytesWritten());
                this.f3674c = (byte) 3;
                if (!this.f3675f.C()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
    }

    public final void a(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    public final void c(f fVar, long j10, long j11) {
        int i10;
        u uVar = fVar.f3668c;
        Intrinsics.checkNotNull(uVar);
        while (true) {
            int i11 = uVar.f3704c;
            int i12 = uVar.f3703b;
            if (j10 < i11 - i12) {
                break;
            }
            j10 -= i11 - i12;
            uVar = uVar.f3706f;
            Intrinsics.checkNotNull(uVar);
        }
        while (j11 > 0) {
            int min = (int) Math.min(uVar.f3704c - i10, j11);
            this.n.update(uVar.f3702a, (int) (uVar.f3703b + j10), min);
            j11 -= min;
            uVar = uVar.f3706f;
            Intrinsics.checkNotNull(uVar);
            j10 = 0;
        }
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3677m.close();
    }

    @Override // bf.y
    public z g() {
        return this.f3675f.g();
    }
}
