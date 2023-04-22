package se;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import t9.k0;

/* loaded from: classes3.dex */
public final class d {
    @JvmField

    /* renamed from: h  reason: collision with root package name */
    public static final d f15017h;

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f15018i;

    /* renamed from: j  reason: collision with root package name */
    public static final b f15019j = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public int f15020a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15021b;

    /* renamed from: c  reason: collision with root package name */
    public long f15022c;
    public final List<se.c> d;

    /* renamed from: e  reason: collision with root package name */
    public final List<se.c> f15023e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f15024f;

    /* renamed from: g  reason: collision with root package name */
    public final a f15025g;

    /* loaded from: classes3.dex */
    public interface a {
        void a(d dVar, long j10);

        void b(d dVar);

        void execute(Runnable runnable);

        long nanoTime();
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final ThreadPoolExecutor f15026a;

        public c(ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f15026a = new ThreadPoolExecutor(0, (int) IntCompanionObject.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // se.d.a
        public void a(d taskRunner, long j10) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // se.d.a
        public void b(d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // se.d.a
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f15026a.execute(runnable);
        }

        @Override // se.d.a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* renamed from: se.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0263d implements Runnable {
        public RunnableC0263d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            se.a c10;
            while (true) {
                synchronized (d.this) {
                    c10 = d.this.c();
                }
                if (c10 == null) {
                    return;
                }
                se.c cVar = c10.f15008a;
                Intrinsics.checkNotNull(cVar);
                long j10 = -1;
                b bVar = d.f15019j;
                boolean isLoggable = d.f15018i.isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = cVar.f15015e.f15025g.nanoTime();
                    k0.a(c10, cVar, "starting");
                }
                try {
                    d.a(d.this, c10);
                    Unit unit = Unit.INSTANCE;
                    if (isLoggable) {
                        long nanoTime = cVar.f15015e.f15025g.nanoTime() - j10;
                        StringBuilder m10 = a1.a.m("finished run in ");
                        m10.append(k0.e(nanoTime));
                        k0.a(c10, cVar, m10.toString());
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long nanoTime2 = cVar.f15015e.f15025g.nanoTime() - j10;
                        StringBuilder m11 = a1.a.m("failed a run in ");
                        m11.append(k0.e(nanoTime2));
                        k0.a(c10, cVar, m11.toString());
                    }
                    throw th;
                }
            }
        }
    }

    static {
        String name = qe.c.f14516f + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f15017h = new d(new c(new qe.b(name, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f15018i = logger;
    }

    public d(a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f15025g = backend;
        this.f15020a = 10000;
        this.d = new ArrayList();
        this.f15023e = new ArrayList();
        this.f15024f = new RunnableC0263d();
    }

    public static final void a(d dVar, se.a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = qe.c.f14512a;
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.f15010c);
        try {
            long a10 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a10);
                Unit unit = Unit.INSTANCE;
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(se.a aVar, long j10) {
        byte[] bArr = qe.c.f14512a;
        se.c cVar = aVar.f15008a;
        Intrinsics.checkNotNull(cVar);
        if (!(cVar.f15013b == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z10 = cVar.d;
        cVar.d = false;
        cVar.f15013b = null;
        this.d.remove(cVar);
        if (j10 != -1 && !z10 && !cVar.f15012a) {
            cVar.d(aVar, j10, true);
        }
        if (!cVar.f15014c.isEmpty()) {
            this.f15023e.add(cVar);
        }
    }

    public final se.a c() {
        boolean z10;
        byte[] bArr = qe.c.f14512a;
        while (!this.f15023e.isEmpty()) {
            long nanoTime = this.f15025g.nanoTime();
            long j10 = Long.MAX_VALUE;
            Iterator<se.c> it = this.f15023e.iterator();
            se.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                se.a aVar2 = it.next().f15014c.get(0);
                long max = Math.max(0L, aVar2.f15009b - nanoTime);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else if (aVar != null) {
                    z10 = true;
                    break;
                } else {
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = qe.c.f14512a;
                aVar.f15009b = -1L;
                se.c cVar = aVar.f15008a;
                Intrinsics.checkNotNull(cVar);
                cVar.f15014c.remove(aVar);
                this.f15023e.remove(cVar);
                cVar.f15013b = aVar;
                this.d.add(cVar);
                if (z10 || (!this.f15021b && (!this.f15023e.isEmpty()))) {
                    this.f15025g.execute(this.f15024f);
                }
                return aVar;
            } else if (this.f15021b) {
                if (j10 < this.f15022c - nanoTime) {
                    this.f15025g.b(this);
                }
                return null;
            } else {
                this.f15021b = true;
                this.f15022c = nanoTime + j10;
                try {
                    try {
                        this.f15025g.a(this, j10);
                    } catch (InterruptedException unused) {
                        d();
                    }
                } finally {
                    this.f15021b = false;
                }
            }
        }
        return null;
    }

    public final void d() {
        for (int size = this.d.size() - 1; size >= 0; size--) {
            this.d.get(size).b();
        }
        for (int size2 = this.f15023e.size() - 1; size2 >= 0; size2--) {
            se.c cVar = this.f15023e.get(size2);
            cVar.b();
            if (cVar.f15014c.isEmpty()) {
                this.f15023e.remove(size2);
            }
        }
    }

    public final void e(se.c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = qe.c.f14512a;
        if (taskQueue.f15013b == null) {
            if (!taskQueue.f15014c.isEmpty()) {
                List<se.c> addIfAbsent = this.f15023e;
                Intrinsics.checkNotNullParameter(addIfAbsent, "$this$addIfAbsent");
                if (!addIfAbsent.contains(taskQueue)) {
                    addIfAbsent.add(taskQueue);
                }
            } else {
                this.f15023e.remove(taskQueue);
            }
        }
        if (this.f15021b) {
            this.f15025g.b(this);
        } else {
            this.f15025g.execute(this.f15024f);
        }
    }

    public final se.c f() {
        int i10;
        synchronized (this) {
            i10 = this.f15020a;
            this.f15020a = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new se.c(this, sb2.toString());
    }
}
