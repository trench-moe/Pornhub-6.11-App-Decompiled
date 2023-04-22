package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.ranges.RangesKt;
import le.p0;

/* loaded from: classes3.dex */
public final class c extends d implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: u  reason: collision with root package name */
    public static final c f12110u;

    /* renamed from: w  reason: collision with root package name */
    public static final long f12111w;

    static {
        Long l10;
        c cVar = new c();
        f12110u = cVar;
        cVar.w(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f12111w = timeUnit.toNanos(l10.longValue());
    }

    @Override // le.x
    public Thread J() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public final synchronized void c0() {
        if (f0()) {
            debugStatus = 3;
            Y();
            notifyAll();
        }
    }

    public final boolean f0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        boolean V;
        p0 p0Var = p0.f12827a;
        p0.f12828b.set(this);
        try {
            synchronized (this) {
                if (f0()) {
                    z10 = false;
                } else {
                    z10 = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z10) {
                if (V) {
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long X = X();
                if (X == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f12111w + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        c0();
                        if (V()) {
                            return;
                        }
                        J();
                        return;
                    }
                    X = RangesKt.coerceAtMost(X, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (X > 0) {
                    if (f0()) {
                        _thread = null;
                        c0();
                        if (V()) {
                            return;
                        }
                        J();
                        return;
                    }
                    LockSupport.parkNanos(this, X);
                }
            }
        } finally {
            _thread = null;
            c0();
            if (!V()) {
                J();
            }
        }
    }
}
