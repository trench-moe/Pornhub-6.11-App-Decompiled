package bf;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class c extends z {

    /* renamed from: h  reason: collision with root package name */
    public static final long f3657h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f3658i;

    /* renamed from: j  reason: collision with root package name */
    public static c f3659j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f3660k = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public boolean f3661e;

    /* renamed from: f  reason: collision with root package name */
    public c f3662f;

    /* renamed from: g  reason: collision with root package name */
    public long f3663g;

    /* loaded from: classes2.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final c a() {
            c cVar = c.f3659j;
            Intrinsics.checkNotNull(cVar);
            c cVar2 = cVar.f3662f;
            if (cVar2 == null) {
                long nanoTime = System.nanoTime();
                c.class.wait(c.f3657h);
                c cVar3 = c.f3659j;
                Intrinsics.checkNotNull(cVar3);
                if (cVar3.f3662f != null || System.nanoTime() - nanoTime < c.f3658i) {
                    return null;
                }
                return c.f3659j;
            }
            long nanoTime2 = cVar2.f3663g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j10 = nanoTime2 / 1000000;
                c.class.wait(j10, (int) (nanoTime2 - (1000000 * j10)));
                return null;
            }
            c cVar4 = c.f3659j;
            Intrinsics.checkNotNull(cVar4);
            cVar4.f3662f = cVar2.f3662f;
            cVar2.f3662f = null;
            return cVar2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            c a10;
            while (true) {
                try {
                    synchronized (c.class) {
                        a10 = c.f3660k.a();
                        if (a10 == c.f3659j) {
                            c.f3659j = null;
                            return;
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    if (a10 != null) {
                        a10.k();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f3657h = millis;
        f3658i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j10 = this.f3714c;
        boolean z10 = this.f3712a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 != 0 || z10) {
            synchronized (c.class) {
                if (!(!this.f3661e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f3661e = true;
                if (f3659j == null) {
                    f3659j = new c();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (i10 != 0 && z10) {
                    this.f3663g = Math.min(j10, c() - nanoTime) + nanoTime;
                } else if (i10 != 0) {
                    this.f3663g = j10 + nanoTime;
                } else if (!z10) {
                    throw new AssertionError();
                } else {
                    this.f3663g = c();
                }
                long j11 = this.f3663g - nanoTime;
                c cVar = f3659j;
                Intrinsics.checkNotNull(cVar);
                while (true) {
                    c cVar2 = cVar.f3662f;
                    if (cVar2 == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(cVar2);
                    if (j11 < cVar2.f3663g - nanoTime) {
                        break;
                    }
                    cVar = cVar.f3662f;
                    Intrinsics.checkNotNull(cVar);
                }
                this.f3662f = cVar.f3662f;
                cVar.f3662f = this;
                if (cVar == f3659j) {
                    c.class.notify();
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
        r1.f3662f = r4.f3662f;
        r4.f3662f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            r4 = this;
            java.lang.Class<bf.c> r0 = bf.c.class
            monitor-enter(r0)
            boolean r1 = r4.f3661e     // Catch: java.lang.Throwable -> L22
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)
            goto L21
        La:
            r4.f3661e = r2     // Catch: java.lang.Throwable -> L22
            bf.c r1 = bf.c.f3659j     // Catch: java.lang.Throwable -> L22
        Le:
            if (r1 == 0) goto L1f
            bf.c r3 = r1.f3662f     // Catch: java.lang.Throwable -> L22
            if (r3 != r4) goto L1d
            bf.c r3 = r4.f3662f     // Catch: java.lang.Throwable -> L22
            r1.f3662f = r3     // Catch: java.lang.Throwable -> L22
            r1 = 0
            r4.f3662f = r1     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            goto L21
        L1d:
            r1 = r3
            goto Le
        L1f:
            r2 = 1
            monitor-exit(r0)
        L21:
            return r2
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.c.i():boolean");
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
