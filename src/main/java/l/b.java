package l;

import af.c;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12147a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f12148b = Executors.newFixedThreadPool(4, new a(this));

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f12149c;

    /* loaded from: classes2.dex */
    public class a implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f12150c = new AtomicInteger(0);

        public a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f12150c.getAndIncrement())));
            return thread;
        }
    }

    public static Handler s(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // af.c
    public void f(Runnable runnable) {
        this.f12148b.execute(runnable);
    }

    @Override // af.c
    public boolean k() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // af.c
    public void q(Runnable runnable) {
        if (this.f12149c == null) {
            synchronized (this.f12147a) {
                if (this.f12149c == null) {
                    this.f12149c = s(Looper.getMainLooper());
                }
            }
        }
        this.f12149c.post(runnable);
    }
}
