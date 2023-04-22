package ea;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u<TResult> extends g<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9302a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final q<TResult> f9303b = new q<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f9304c;
    public volatile boolean d;

    /* renamed from: e  reason: collision with root package name */
    public TResult f9305e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f9306f;

    @Override // ea.g
    public final g<TResult> a(Executor executor, b bVar) {
        this.f9303b.a(new n(executor, bVar));
        s();
        return this;
    }

    @Override // ea.g
    public final g<TResult> b(c<TResult> cVar) {
        this.f9303b.a(new l(i.f9274a, cVar));
        s();
        return this;
    }

    @Override // ea.g
    public final g<TResult> c(Executor executor, d dVar) {
        this.f9303b.a(new m(executor, dVar));
        s();
        return this;
    }

    @Override // ea.g
    public final g<TResult> d(Activity activity, e<? super TResult> eVar) {
        n nVar = new n(i.f9274a, eVar);
        this.f9303b.a(nVar);
        e9.f b10 = LifecycleCallback.b(activity);
        t tVar = (t) b10.f("TaskOnStopCallback", t.class);
        if (tVar == null) {
            tVar = new t(b10);
        }
        synchronized (tVar.f9301f) {
            tVar.f9301f.add(new WeakReference<>(nVar));
        }
        s();
        return this;
    }

    @Override // ea.g
    public final g<TResult> e(Executor executor, e<? super TResult> eVar) {
        this.f9303b.a(new n(executor, eVar));
        s();
        return this;
    }

    @Override // ea.g
    public final <TContinuationResult> g<TContinuationResult> f(a<TResult, TContinuationResult> aVar) {
        return g(i.f9274a, aVar);
    }

    @Override // ea.g
    public final <TContinuationResult> g<TContinuationResult> g(Executor executor, a<TResult, TContinuationResult> aVar) {
        u uVar = new u();
        this.f9303b.a(new l(executor, aVar, uVar, 0));
        s();
        return uVar;
    }

    @Override // ea.g
    public final <TContinuationResult> g<TContinuationResult> h(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        u uVar = new u();
        this.f9303b.a(new m(executor, aVar, uVar));
        s();
        return uVar;
    }

    @Override // ea.g
    public final Exception i() {
        Exception exc;
        synchronized (this.f9302a) {
            exc = this.f9306f;
        }
        return exc;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // ea.g
    public final TResult j() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f9302a
            monitor-enter(r0)
            boolean r1 = r5.f9304c     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "Task is not yet complete"
            h9.o.k(r1, r2)     // Catch: java.lang.Throwable -> L2c
            r4 = 4
            boolean r1 = r5.d     // Catch: java.lang.Throwable -> L2c
            r4 = 6
            if (r1 != 0) goto L21
            java.lang.Exception r1 = r5.f9306f     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L19
            TResult r1 = r5.f9305e     // Catch: java.lang.Throwable -> L2c
            r4 = 2
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return r1
        L19:
            r4 = 3
            com.google.android.gms.tasks.RuntimeExecutionException r2 = new com.google.android.gms.tasks.RuntimeExecutionException     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            throw r2     // Catch: java.lang.Throwable -> L2c
            r4 = 2
        L21:
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = "Task is already canceled."
            r2 = r3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            r4 = 1
            throw r1     // Catch: java.lang.Throwable -> L2c
            r4 = 7
        L2c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.u.j():java.lang.Object");
    }

    @Override // ea.g
    public final boolean k() {
        return this.d;
    }

    @Override // ea.g
    public final boolean l() {
        boolean z10;
        synchronized (this.f9302a) {
            z10 = this.f9304c;
        }
        return z10;
    }

    @Override // ea.g
    public final boolean m() {
        boolean z10;
        synchronized (this.f9302a) {
            z10 = false;
            if (this.f9304c && !this.d && this.f9306f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // ea.g
    public final <TContinuationResult> g<TContinuationResult> n(Executor executor, f<TResult, TContinuationResult> fVar) {
        u uVar = new u();
        this.f9303b.a(new l(executor, fVar, uVar, 2));
        s();
        return uVar;
    }

    public final void o(Exception exc) {
        h9.o.i(exc, "Exception must not be null");
        synchronized (this.f9302a) {
            try {
                r();
                this.f9304c = true;
                this.f9306f = exc;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f9303b.b(this);
    }

    public final void p(TResult tresult) {
        synchronized (this.f9302a) {
            r();
            this.f9304c = true;
            this.f9305e = tresult;
        }
        this.f9303b.b(this);
    }

    public final boolean q() {
        synchronized (this.f9302a) {
            if (this.f9304c) {
                return false;
            }
            this.f9304c = true;
            this.d = true;
            this.f9303b.b(this);
            return true;
        }
    }

    public final void r() {
        if (this.f9304c) {
            int i10 = DuplicateTaskCompletionException.f7096c;
            if (!l()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception i11 = i();
            String concat = i11 != null ? "failure" : m() ? "result ".concat(String.valueOf(j())) : k() ? "cancellation" : "unknown issue";
        }
    }

    public final void s() {
        synchronized (this.f9302a) {
            try {
                if (this.f9304c) {
                    this.f9303b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
