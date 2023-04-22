package pe;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public abstract class a0 implements Closeable {
    public final InputStream a() {
        return f().o0();
    }

    public final byte[] c() {
        long d = d();
        if (d > ((long) IntCompanionObject.MAX_VALUE)) {
            throw new IOException(android.support.v4.media.b.h("Cannot buffer entire body for content length: ", d));
        }
        bf.h f10 = f();
        try {
            byte[] A = f10.A();
            CloseableKt.closeFinally(f10, null);
            int length = A.length;
            if (d == -1 || d == length) {
                return A;
            }
            throw new IOException("Content-Length (" + d + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        qe.c.d(f());
    }

    public abstract long d();

    public abstract r e();

    public abstract bf.h f();
}
