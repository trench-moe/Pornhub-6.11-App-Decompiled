package we;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import we.b;

/* loaded from: classes3.dex */
public final class n implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public static final Logger f17586u = Logger.getLogger(c.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public final bf.f f17587c;

    /* renamed from: f  reason: collision with root package name */
    public int f17588f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17589j;

    /* renamed from: m  reason: collision with root package name */
    public final b.C0287b f17590m;
    public final bf.g n;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f17591t;

    public n(bf.g sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.n = sink;
        this.f17591t = z10;
        bf.f fVar = new bf.f();
        this.f17587c = fVar;
        this.f17588f = 16384;
        this.f17590m = new b.C0287b(0, false, fVar, 3);
    }

    public final synchronized void a(q peerSettings) {
        Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
        if (this.f17589j) {
            throw new IOException("closed");
        }
        int i10 = this.f17588f;
        int i11 = peerSettings.f17599a;
        if ((i11 & 32) != 0) {
            i10 = peerSettings.f17600b[5];
        }
        this.f17588f = i10;
        int i12 = i11 & 2;
        if ((i12 != 0 ? peerSettings.f17600b[1] : -1) != -1) {
            b.C0287b c0287b = this.f17590m;
            int i13 = i12 != 0 ? peerSettings.f17600b[1] : -1;
            Objects.requireNonNull(c0287b);
            int min = Math.min(i13, 16384);
            int i14 = c0287b.f17483c;
            if (i14 != min) {
                if (min < i14) {
                    c0287b.f17481a = Math.min(c0287b.f17481a, min);
                }
                c0287b.f17482b = true;
                c0287b.f17483c = min;
                int i15 = c0287b.f17486g;
                if (min < i15) {
                    if (min == 0) {
                        c0287b.a();
                    } else {
                        c0287b.b(i15 - min);
                    }
                }
            }
        }
        d(0, 0, 4, 1);
        this.n.flush();
    }

    public final synchronized void c(boolean z10, int i10, bf.f fVar, int i11) {
        if (this.f17589j) {
            throw new IOException("closed");
        }
        d(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            bf.g gVar = this.n;
            Intrinsics.checkNotNull(fVar);
            gVar.l0(fVar, i11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f17589j = true;
        this.n.close();
    }

    public final void d(int i10, int i11, int i12, int i13) {
        Logger logger = f17586u;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(c.f17492e.b(false, i10, i11, i12, i13));
        }
        if (!(i11 <= this.f17588f)) {
            StringBuilder m10 = a1.a.m("FRAME_SIZE_ERROR length > ");
            m10.append(this.f17588f);
            m10.append(": ");
            m10.append(i11);
            throw new IllegalArgumentException(m10.toString().toString());
        }
        if (!((((int) 2147483648L) & i10) == 0)) {
            throw new IllegalArgumentException(a1.a.j("reserved bit set: ", i10).toString());
        }
        bf.g writeMedium = this.n;
        byte[] bArr = qe.c.f14512a;
        Intrinsics.checkNotNullParameter(writeMedium, "$this$writeMedium");
        writeMedium.D((i11 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeMedium.D((i11 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeMedium.D(i11 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.n.D(i12 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.n.D(i13 & KotlinVersion.MAX_COMPONENT_VALUE);
        this.n.x(i10 & IntCompanionObject.MAX_VALUE);
    }

    public final synchronized void e(int i10, ErrorCode errorCode, byte[] debugData) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        Intrinsics.checkNotNullParameter(debugData, "debugData");
        if (this.f17589j) {
            throw new IOException("closed");
        }
        if (!(errorCode.b() != -1)) {
            throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
        }
        d(0, debugData.length + 8, 7, 0);
        this.n.x(i10);
        this.n.x(errorCode.b());
        if (!(debugData.length == 0)) {
            this.n.d0(debugData);
        }
        this.n.flush();
    }

    public final synchronized void f(boolean z10, int i10, List<a> headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f17589j) {
            throw new IOException("closed");
        }
        this.f17590m.e(headerBlock);
        long j10 = this.f17587c.f3669f;
        long min = Math.min(this.f17588f, j10);
        int i11 = (j10 > min ? 1 : (j10 == min ? 0 : -1));
        int i12 = i11 == 0 ? 4 : 0;
        if (z10) {
            i12 |= 1;
        }
        d(i10, (int) min, 1, i12);
        this.n.l0(this.f17587c, min);
        if (i11 > 0) {
            m(i10, j10 - min);
        }
    }

    public final synchronized void flush() {
        if (this.f17589j) {
            throw new IOException("closed");
        }
        this.n.flush();
    }

    public final synchronized void h(boolean z10, int i10, int i11) {
        if (this.f17589j) {
            throw new IOException("closed");
        }
        d(0, 8, 6, z10 ? 1 : 0);
        this.n.x(i10);
        this.n.x(i11);
        this.n.flush();
    }

    public final synchronized void i(int i10, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f17589j) {
            throw new IOException("closed");
        }
        if (!(errorCode.b() != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        d(i10, 4, 3, 0);
        this.n.x(errorCode.b());
        this.n.flush();
    }

    public final synchronized void k(int i10, long j10) {
        if (this.f17589j) {
            throw new IOException("closed");
        }
        if (!(j10 != 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        d(i10, 4, 8, 0);
        this.n.x((int) j10);
        this.n.flush();
    }

    public final void m(int i10, long j10) {
        while (j10 > 0) {
            long min = Math.min(this.f17588f, j10);
            j10 -= min;
            d(i10, (int) min, 9, j10 == 0 ? 4 : 0);
            this.n.l0(this.f17587c, min);
        }
    }
}
