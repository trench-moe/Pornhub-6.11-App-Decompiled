package b2;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class t<T> {

    /* renamed from: e  reason: collision with root package name */
    public static Executor f3543e = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public final Set<n<T>> f3544a = new LinkedHashSet(1);

    /* renamed from: b  reason: collision with root package name */
    public final Set<n<Throwable>> f3545b = new LinkedHashSet(1);

    /* renamed from: c  reason: collision with root package name */
    public final Handler f3546c = new Handler(Looper.getMainLooper());
    public volatile r<T> d = null;

    /* loaded from: classes.dex */
    public class a extends FutureTask<r<T>> {
        public a(Callable<r<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                t.this.c(get());
            } catch (InterruptedException | ExecutionException e10) {
                t.this.c(new r<>(e10));
            }
        }
    }

    public t(Callable<r<T>> callable, boolean z10) {
        if (!z10) {
            f3543e.execute(new a(callable));
            return;
        }
        try {
            c(callable.call());
        } catch (Throwable th) {
            c(new r<>(th));
        }
    }

    public synchronized t<T> a(n<Throwable> nVar) {
        try {
            if (this.d != null && this.d.f3541b != null) {
                nVar.a(this.d.f3541b);
            }
            this.f3545b.add(nVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized t<T> b(n<T> nVar) {
        if (this.d != null && this.d.f3540a != null) {
            nVar.a(this.d.f3540a);
        }
        this.f3544a.add(nVar);
        return this;
    }

    public final void c(r<T> rVar) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = rVar;
        this.f3546c.post(new s(this));
    }
}
