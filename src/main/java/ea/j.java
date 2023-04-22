package ea;

import a9.a0;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class j {
    public static <TResult> TResult a(g<TResult> gVar, long j10, TimeUnit timeUnit) {
        h9.o.g("Must not be called on the main application thread");
        h9.o.i(gVar, "Task must not be null");
        h9.o.i(timeUnit, "TimeUnit must not be null");
        if (gVar.l()) {
            return (TResult) f(gVar);
        }
        k2.c cVar = new k2.c(9);
        Executor executor = i.f9275b;
        gVar.e(executor, cVar);
        gVar.c(executor, cVar);
        gVar.a(executor, cVar);
        if (((CountDownLatch) cVar.f11775f).await(j10, timeUnit)) {
            return (TResult) f(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> g<TResult> b(Executor executor, Callable<TResult> callable) {
        h9.o.i(executor, "Executor must not be null");
        u uVar = new u();
        executor.execute(new a0(uVar, callable, 4));
        return uVar;
    }

    public static <TResult> g<TResult> c(Exception exc) {
        u uVar = new u();
        uVar.o(exc);
        return uVar;
    }

    public static <TResult> g<TResult> d(TResult tresult) {
        u uVar = new u();
        uVar.p(tresult);
        return uVar;
    }

    public static g<Void> e(Collection<? extends g<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (g<?> gVar : collection) {
                Objects.requireNonNull(gVar, "null tasks are not accepted");
            }
            u uVar = new u();
            k kVar = new k(collection.size(), uVar);
            for (g<?> gVar2 : collection) {
                Executor executor = i.f9275b;
                gVar2.e(executor, kVar);
                gVar2.c(executor, kVar);
                gVar2.a(executor, kVar);
            }
            return uVar;
        }
        return d(null);
    }

    public static <TResult> TResult f(g<TResult> gVar) {
        if (gVar.m()) {
            return gVar.j();
        }
        if (gVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.i());
    }
}
