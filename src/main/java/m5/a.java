package m5;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class a implements ExecutorService {

    /* renamed from: f  reason: collision with root package name */
    public static final long f12901f = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: j  reason: collision with root package name */
    public static volatile int f12902j;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f12903c;

    /* loaded from: classes2.dex */
    public static final class b implements ThreadFactory {

        /* renamed from: m5.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0208a extends Thread {
            public C0208a(b bVar, Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public b(C0207a c0207a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0208a(this, runnable);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public final ThreadFactory f12904c;

        /* renamed from: f  reason: collision with root package name */
        public final String f12905f;

        /* renamed from: j  reason: collision with root package name */
        public final d f12906j;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f12907m;
        public final AtomicInteger n = new AtomicInteger();

        /* renamed from: m5.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0209a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Runnable f12908c;

            public RunnableC0209a(Runnable runnable) {
                this.f12908c = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.f12907m) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f12908c.run();
                } catch (Throwable th) {
                    c.this.f12906j.a(th);
                }
            }
        }

        public c(ThreadFactory threadFactory, String str, d dVar, boolean z10) {
            this.f12904c = threadFactory;
            this.f12905f = str;
            this.f12906j = dVar;
            this.f12907m = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f12904c.newThread(new RunnableC0209a(runnable));
            StringBuilder m10 = a1.a.m("glide-");
            m10.append(this.f12905f);
            m10.append("-thread-");
            m10.append(this.n.getAndIncrement());
            newThread.setName(m10.toString());
            return newThread;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f12910a = new C0210a();

        /* renamed from: m5.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0210a implements d {
            @Override // m5.a.d
            public void a(Throwable th) {
                if (Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        }

        void a(Throwable th);
    }

    public a(ExecutorService executorService) {
        this.f12903c = executorService;
    }

    public static int a() {
        if (f12902j == 0) {
            f12902j = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        return f12902j;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f12903c.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12903c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f12903c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f12903c.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f12903c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f12903c.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f12903c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f12903c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f12903c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f12903c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f12903c.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t2) {
        return this.f12903c.submit(runnable, t2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f12903c.submit(callable);
    }

    public String toString() {
        return this.f12903c.toString();
    }
}
