package bf;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q implements w {

    /* renamed from: c  reason: collision with root package name */
    public final OutputStream f3688c;

    /* renamed from: f  reason: collision with root package name */
    public final z f3689f;

    public q(OutputStream out, z timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f3688c = out;
        this.f3689f = timeout;
    }

    @Override // bf.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3688c.close();
    }

    @Override // bf.w, java.io.Flushable
    public void flush() {
        this.f3688c.flush();
    }

    @Override // bf.w
    public z g() {
        return this.f3689f;
    }

    @Override // bf.w
    public void l0(f source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f3669f, 0L, j10);
        while (j10 > 0) {
            this.f3689f.f();
            u uVar = source.f3668c;
            Intrinsics.checkNotNull(uVar);
            int min = (int) Math.min(j10, uVar.f3704c - uVar.f3703b);
            this.f3688c.write(uVar.f3702a, uVar.f3703b, min);
            int i10 = uVar.f3703b + min;
            uVar.f3703b = i10;
            long j11 = min;
            j10 -= j11;
            source.f3669f -= j11;
            if (i10 == uVar.f3704c) {
                source.f3668c = uVar.a();
                v.b(uVar);
            }
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("sink(");
        m10.append(this.f3688c);
        m10.append(')');
        return m10.toString();
    }
}
