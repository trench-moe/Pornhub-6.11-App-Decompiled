package bf;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes2.dex */
public interface w extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    z g();

    void l0(f fVar, long j10);
}
