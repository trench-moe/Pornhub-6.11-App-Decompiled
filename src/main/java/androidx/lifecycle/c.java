package androidx.lifecycle;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2365a;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f2367c = new AtomicBoolean(true);
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f2368e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f2369f = new RunnableC0031c();

    /* renamed from: b  reason: collision with root package name */
    public final LiveData<T> f2366b = new a();

    /* loaded from: classes.dex */
    public class a extends LiveData<T> {
        public a() {
        }

        @Override // androidx.lifecycle.LiveData
        public void h() {
            c cVar = c.this;
            cVar.f2365a.execute(cVar.f2368e);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            do {
                boolean z10 = false;
                if (c.this.d.compareAndSet(false, true)) {
                    Object obj = null;
                    boolean z11 = false;
                    while (c.this.f2367c.compareAndSet(true, false)) {
                        try {
                            obj = c.this.a();
                            z11 = true;
                        } catch (Throwable th) {
                            c.this.d.set(false);
                            throw th;
                        }
                    }
                    if (z11) {
                        c.this.f2366b.j(obj);
                    }
                    c.this.d.set(false);
                    z10 = z11;
                }
                if (!z10) {
                    return;
                }
            } while (c.this.f2367c.get());
        }
    }

    /* renamed from: androidx.lifecycle.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0031c implements Runnable {
        public RunnableC0031c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean e10 = c.this.f2366b.e();
            if (c.this.f2367c.compareAndSet(false, true) && e10) {
                c cVar = c.this;
                cVar.f2365a.execute(cVar.f2368e);
            }
        }
    }

    public c(Executor executor) {
        this.f2365a = executor;
    }

    public abstract T a();
}
