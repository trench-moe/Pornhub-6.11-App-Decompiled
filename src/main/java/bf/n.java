package bf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n implements y {

    /* renamed from: c  reason: collision with root package name */
    public final InputStream f3682c;

    /* renamed from: f  reason: collision with root package name */
    public final z f3683f;

    public n(InputStream input, z timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f3682c = input;
        this.f3683f = timeout;
    }

    @Override // bf.y
    public long O(f sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0L;
        }
        if (i10 >= 0) {
            try {
                this.f3683f.f();
                u X = sink.X(1);
                int read = this.f3682c.read(X.f3702a, X.f3704c, (int) Math.min(j10, 8192 - X.f3704c));
                if (read != -1) {
                    X.f3704c += read;
                    long j11 = read;
                    sink.f3669f += j11;
                    return j11;
                } else if (X.f3703b == X.f3704c) {
                    sink.f3668c = X.a();
                    v.b(X);
                    return -1L;
                } else {
                    return -1L;
                }
            } catch (AssertionError e10) {
                if (cb.e.R(e10)) {
                    throw new IOException(e10);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3682c.close();
    }

    @Override // bf.y
    public z g() {
        return this.f3683f;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("source(");
        m10.append(this.f3682c);
        m10.append(')');
        return m10.toString();
    }
}
