package bf;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class z {
    @JvmField
    public static final z d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f3712a;

    /* renamed from: b  reason: collision with root package name */
    public long f3713b;

    /* renamed from: c  reason: collision with root package name */
    public long f3714c;

    /* loaded from: classes2.dex */
    public static final class a extends z {
        @Override // bf.z
        public z d(long j10) {
            return this;
        }

        @Override // bf.z
        public void f() {
        }

        @Override // bf.z
        public z g(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    public z a() {
        this.f3712a = false;
        return this;
    }

    public z b() {
        this.f3714c = 0L;
        return this;
    }

    public long c() {
        if (this.f3712a) {
            return this.f3713b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z d(long j10) {
        this.f3712a = true;
        this.f3713b = j10;
        return this;
    }

    public boolean e() {
        return this.f3712a;
    }

    public void f() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        if (currentThread.isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3712a && this.f3713b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 >= 0) {
            this.f3714c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("timeout < 0: ", j10).toString());
    }
}
