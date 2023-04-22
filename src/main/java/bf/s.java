package bf;

import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class s implements g {
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final f f3695c;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public boolean f3696f;
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public final w f3697j;

    public s(w sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f3697j = sink;
        this.f3695c = new f();
    }

    @Override // bf.g
    public g D(int i10) {
        if (!this.f3696f) {
            this.f3695c.i0(i10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.g
    public g N(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f3696f) {
            this.f3695c.s0(string);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.g
    public g T(String string, int i10, int i11) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f3696f) {
            this.f3695c.t0(string, i10, i11);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.g
    public g U(long j10) {
        if (!this.f3696f) {
            this.f3695c.U(j10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }

    public g a() {
        if (!this.f3696f) {
            long c10 = this.f3695c.c();
            if (c10 > 0) {
                this.f3697j.l0(this.f3695c, c10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.g
    public f b() {
        return this.f3695c;
    }

    @Override // bf.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3696f) {
            return;
        }
        Throwable th = null;
        try {
            f fVar = this.f3695c;
            long j10 = fVar.f3669f;
            if (j10 > 0) {
                this.f3697j.l0(fVar, j10);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f3697j.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f3696f = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // bf.g
    public g d0(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f3696f) {
            this.f3695c.Z(source);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.g
    public g e0(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f3696f) {
            this.f3695c.Y(byteString);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.g, bf.w, java.io.Flushable
    public void flush() {
        if (!(!this.f3696f)) {
            throw new IllegalStateException("closed".toString());
        }
        f fVar = this.f3695c;
        long j10 = fVar.f3669f;
        if (j10 > 0) {
            this.f3697j.l0(fVar, j10);
        }
        this.f3697j.flush();
    }

    @Override // bf.w
    public z g() {
        return this.f3697j.g();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f3696f;
    }

    @Override // bf.g
    public g j(byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f3696f) {
            this.f3695c.c0(source, i10, i11);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.w
    public void l0(f source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!(!this.f3696f)) {
            throw new IllegalStateException("closed".toString());
        }
        this.f3695c.l0(source, j10);
        a();
    }

    @Override // bf.g
    public g m0(long j10) {
        if (!this.f3696f) {
            this.f3695c.m0(j10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("buffer(");
        m10.append(this.f3697j);
        m10.append(')');
        return m10.toString();
    }

    @Override // bf.g
    public g u(int i10) {
        if (!this.f3696f) {
            this.f3695c.r0(i10);
            a();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f3696f) {
            int write = this.f3695c.write(source);
            a();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // bf.g
    public g x(int i10) {
        if (!this.f3696f) {
            this.f3695c.q0(i10);
            return a();
        }
        throw new IllegalStateException("closed".toString());
    }
}
