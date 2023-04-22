package oe;

import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class d extends kotlinx.coroutines.e implements g, Executor {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13644u = AtomicIntegerFieldUpdater.newUpdater(d.class, "inFlightTasks");

    /* renamed from: f  reason: collision with root package name */
    public final b f13645f;

    /* renamed from: j  reason: collision with root package name */
    public final int f13646j;

    /* renamed from: m  reason: collision with root package name */
    public final String f13647m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Runnable> f13648t = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public d(b bVar, int i10, String str, int i11) {
        this.f13645f = bVar;
        this.f13646j = i10;
        this.f13647m = str;
        this.n = i11;
    }

    @Override // oe.g
    public void a() {
        Runnable poll = this.f13648t.poll();
        if (poll != null) {
            b bVar = this.f13645f;
            Objects.requireNonNull(bVar);
            try {
                bVar.f13643t.e(poll, this, true);
                return;
            } catch (RejectedExecutionException unused) {
                kotlinx.coroutines.c.f12110u.P(bVar.f13643t.c(poll, this));
                return;
            }
        }
        f13644u.decrementAndGet(this);
        Runnable poll2 = this.f13648t.poll();
        if (poll2 == null) {
            return;
        }
        s(poll2, true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        s(runnable, false);
    }

    @Override // oe.g
    public int f() {
        return this.n;
    }

    @Override // kotlinx.coroutines.b
    public void m(CoroutineContext coroutineContext, Runnable runnable) {
        s(runnable, false);
    }

    public final void s(Runnable runnable, boolean z10) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13644u;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f13646j) {
                b bVar = this.f13645f;
                Objects.requireNonNull(bVar);
                try {
                    bVar.f13643t.e(runnable, this, z10);
                    return;
                } catch (RejectedExecutionException unused) {
                    kotlinx.coroutines.c.f12110u.P(bVar.f13643t.c(runnable, this));
                    return;
                }
            }
            this.f13648t.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f13646j) {
                return;
            }
            runnable = this.f13648t.poll();
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.b
    public String toString() {
        String str = this.f13647m;
        if (str == null) {
            return super.toString() + "[dispatcher = " + this.f13645f + ']';
        }
        return str;
    }
}
