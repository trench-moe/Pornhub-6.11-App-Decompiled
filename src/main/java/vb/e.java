package vb;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16124a;

    /* renamed from: b  reason: collision with root package name */
    public ea.g<Void> f16125b = ea.j.d(null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f16126c = new Object();
    public final ThreadLocal<Boolean> d = new ThreadLocal<>();

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d.set(Boolean.TRUE);
        }
    }

    public e(Executor executor) {
        this.f16124a = executor;
        executor.execute(new a());
    }

    public void a() {
        if (!Boolean.TRUE.equals(this.d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public <T> ea.g<T> b(Callable<T> callable) {
        ea.g<T> gVar;
        synchronized (this.f16126c) {
            gVar = (ea.g<T>) this.f16125b.g(this.f16124a, new f(this, callable));
            this.f16125b = gVar.g(this.f16124a, new m9.a(this));
        }
        return gVar;
    }

    public <T> ea.g<T> c(Callable<ea.g<T>> callable) {
        ea.g<T> gVar;
        synchronized (this.f16126c) {
            gVar = (ea.g<T>) this.f16125b.h(this.f16124a, new f(this, callable));
            this.f16125b = gVar.g(this.f16124a, new m9.a(this));
        }
        return gVar;
    }
}
