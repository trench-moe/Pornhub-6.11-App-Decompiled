package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.h;
import e6.a;
import e6.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class g<R> implements DecodeJob.a<R>, a.d {
    public static final c P = new c();
    public final AtomicInteger A;
    public h5.b B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public j5.i<?> G;
    public DataSource H;
    public boolean I;
    public GlideException J;
    public boolean K;
    public h<?> L;
    public DecodeJob<R> M;
    public volatile boolean N;
    public boolean O;

    /* renamed from: c  reason: collision with root package name */
    public final e f5795c;

    /* renamed from: f  reason: collision with root package name */
    public final e6.d f5796f;

    /* renamed from: j  reason: collision with root package name */
    public final h.a f5797j;

    /* renamed from: m  reason: collision with root package name */
    public final m0.c<g<?>> f5798m;
    public final c n;

    /* renamed from: t  reason: collision with root package name */
    public final j5.e f5799t;

    /* renamed from: u  reason: collision with root package name */
    public final m5.a f5800u;

    /* renamed from: w  reason: collision with root package name */
    public final m5.a f5801w;
    public final m5.a y;

    /* renamed from: z  reason: collision with root package name */
    public final m5.a f5802z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final z5.g f5803c;

        public a(z5.g gVar) {
            this.f5803c = gVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r9 = this;
                r6 = r9
                z5.g r0 = r6.f5803c
                java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                com.bumptech.glide.request.SingleRequest r0 = (com.bumptech.glide.request.SingleRequest) r0
                r8 = 5
                e6.d r1 = r0.f5890b
                r1.a()
                r8 = 1
                java.lang.Object r0 = r0.f5891c
                monitor-enter(r0)
                r8 = 1
                com.bumptech.glide.load.engine.g r1 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L5f
                r8 = 1
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L5f
                r8 = 2
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L59
                com.bumptech.glide.load.engine.g$e r2 = r2.f5795c     // Catch: java.lang.Throwable -> L59
                z5.g r3 = r6.f5803c     // Catch: java.lang.Throwable -> L59
                r8 = 2
                java.util.List<com.bumptech.glide.load.engine.g$d> r2 = r2.f5809c     // Catch: java.lang.Throwable -> L59
                r8 = 2
                com.bumptech.glide.load.engine.g$d r4 = new com.bumptech.glide.load.engine.g$d     // Catch: java.lang.Throwable -> L59
                r8 = 2
                java.util.concurrent.Executor r5 = d6.e.f8789b     // Catch: java.lang.Throwable -> L59
                r8 = 3
                r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L59
                r8 = 5
                boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L59
                if (r2 == 0) goto L4e
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L59
                r8 = 1
                z5.g r3 = r6.f5803c     // Catch: java.lang.Throwable -> L59
                r8 = 7
                java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L59
                r8 = 6
                com.bumptech.glide.load.engine.GlideException r2 = r2.J     // Catch: java.lang.Throwable -> L46
                r8 = 7
                com.bumptech.glide.request.SingleRequest r3 = (com.bumptech.glide.request.SingleRequest) r3     // Catch: java.lang.Throwable -> L46
                r4 = 5
                r8 = 1
                r3.n(r2, r4)     // Catch: java.lang.Throwable -> L46
                goto L4f
            L46:
                r2 = move-exception
                r8 = 4
                com.bumptech.glide.load.engine.CallbackException r3 = new com.bumptech.glide.load.engine.CallbackException     // Catch: java.lang.Throwable -> L59
                r3.<init>(r2)     // Catch: java.lang.Throwable -> L59
                throw r3     // Catch: java.lang.Throwable -> L59
            L4e:
                r8 = 3
            L4f:
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L59
                r2.c()     // Catch: java.lang.Throwable -> L59
                r8 = 1
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
                r8 = 5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
                return
            L59:
                r2 = move-exception
                r8 = 1
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
                r8 = 3
                throw r2     // Catch: java.lang.Throwable -> L5f
                r8 = 3
            L5f:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
                throw r1
                r8 = 4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.g.a.run():void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final z5.g f5805c;

        public b(z5.g gVar) {
            this.f5805c = gVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r10 = this;
                r6 = r10
                z5.g r0 = r6.f5805c
                java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                com.bumptech.glide.request.SingleRequest r0 = (com.bumptech.glide.request.SingleRequest) r0
                r8 = 6
                e6.d r1 = r0.f5890b
                r1.a()
                java.lang.Object r0 = r0.f5891c
                monitor-enter(r0)
                r9 = 6
                com.bumptech.glide.load.engine.g r1 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L6e
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L6e
                r9 = 3
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L69
                com.bumptech.glide.load.engine.g$e r2 = r2.f5795c     // Catch: java.lang.Throwable -> L69
                z5.g r3 = r6.f5805c     // Catch: java.lang.Throwable -> L69
                java.util.List<com.bumptech.glide.load.engine.g$d> r2 = r2.f5809c     // Catch: java.lang.Throwable -> L69
                com.bumptech.glide.load.engine.g$d r4 = new com.bumptech.glide.load.engine.g$d     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.Executor r5 = d6.e.f8789b     // Catch: java.lang.Throwable -> L69
                r8 = 6
                r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L69
                r8 = 6
                boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> L69
                if (r2 == 0) goto L60
                r8 = 7
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L69
                com.bumptech.glide.load.engine.h<?> r2 = r2.L     // Catch: java.lang.Throwable -> L69
                r9 = 6
                r2.a()     // Catch: java.lang.Throwable -> L69
                r8 = 6
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L69
                r8 = 6
                z5.g r3 = r6.f5805c     // Catch: java.lang.Throwable -> L69
                java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L69
                r9 = 6
                com.bumptech.glide.load.engine.h<?> r4 = r2.L     // Catch: java.lang.Throwable -> L57
                r9 = 1
                com.bumptech.glide.load.DataSource r5 = r2.H     // Catch: java.lang.Throwable -> L57
                boolean r2 = r2.O     // Catch: java.lang.Throwable -> L57
                com.bumptech.glide.request.SingleRequest r3 = (com.bumptech.glide.request.SingleRequest) r3     // Catch: java.lang.Throwable -> L57
                r3.o(r4, r5, r2)     // Catch: java.lang.Throwable -> L57
                r8 = 3
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L69
                r8 = 3
                z5.g r3 = r6.f5805c     // Catch: java.lang.Throwable -> L69
                r9 = 6
                r2.h(r3)     // Catch: java.lang.Throwable -> L69
                r8 = 1
                goto L60
            L57:
                r2 = move-exception
                com.bumptech.glide.load.engine.CallbackException r3 = new com.bumptech.glide.load.engine.CallbackException     // Catch: java.lang.Throwable -> L69
                r9 = 6
                r3.<init>(r2)     // Catch: java.lang.Throwable -> L69
                throw r3     // Catch: java.lang.Throwable -> L69
                r8 = 7
            L60:
                com.bumptech.glide.load.engine.g r2 = com.bumptech.glide.load.engine.g.this     // Catch: java.lang.Throwable -> L69
                r2.c()     // Catch: java.lang.Throwable -> L69
                r8 = 6
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
                return
            L69:
                r2 = move-exception
                r8 = 3
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L69
                r8 = 1
                throw r2     // Catch: java.lang.Throwable -> L6e
            L6e:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
                throw r1
                r8 = 2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.g.b.run():void");
        }
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final z5.g f5807a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f5808b;

        public d(z5.g gVar, Executor executor) {
            this.f5807a = gVar;
            this.f5808b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f5807a.equals(((d) obj).f5807a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5807a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Iterable<d> {

        /* renamed from: c  reason: collision with root package name */
        public final List<d> f5809c = new ArrayList(2);

        public boolean isEmpty() {
            return this.f5809c.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f5809c.iterator();
        }
    }

    public g(m5.a aVar, m5.a aVar2, m5.a aVar3, m5.a aVar4, j5.e eVar, h.a aVar5, m0.c<g<?>> cVar) {
        c cVar2 = P;
        this.f5795c = new e();
        this.f5796f = new d.b();
        this.A = new AtomicInteger();
        this.f5800u = aVar;
        this.f5801w = aVar2;
        this.y = aVar3;
        this.f5802z = aVar4;
        this.f5799t = eVar;
        this.f5797j = aVar5;
        this.f5798m = cVar;
        this.n = cVar2;
    }

    public synchronized void a(z5.g gVar, Executor executor) {
        this.f5796f.a();
        this.f5795c.f5809c.add(new d(gVar, executor));
        boolean z10 = true;
        if (this.I) {
            d(1);
            executor.execute(new b(gVar));
        } else if (this.K) {
            d(1);
            executor.execute(new a(gVar));
        } else {
            if (this.N) {
                z10 = false;
            }
            a0.b.i(z10, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    public void b() {
        if (f()) {
            return;
        }
        this.N = true;
        DecodeJob<R> decodeJob = this.M;
        decodeJob.U = true;
        com.bumptech.glide.load.engine.c cVar = decodeJob.S;
        if (cVar != null) {
            cVar.cancel();
        }
        j5.e eVar = this.f5799t;
        h5.b bVar = this.B;
        f fVar = (f) eVar;
        synchronized (fVar) {
            g2.h hVar = fVar.f5773a;
            Objects.requireNonNull(hVar);
            Map e10 = hVar.e(this.F);
            if (equals(e10.get(bVar))) {
                e10.remove(bVar);
            }
        }
    }

    public void c() {
        h<?> hVar;
        synchronized (this) {
            this.f5796f.a();
            a0.b.i(f(), "Not yet complete!");
            int decrementAndGet = this.A.decrementAndGet();
            a0.b.i(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                hVar = this.L;
                g();
            } else {
                hVar = null;
            }
        }
        if (hVar != null) {
            hVar.e();
        }
    }

    public synchronized void d(int i10) {
        h<?> hVar;
        try {
            a0.b.i(f(), "Not yet complete!");
            if (this.A.getAndAdd(i10) == 0 && (hVar = this.L) != null) {
                hVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // e6.a.d
    public e6.d e() {
        return this.f5796f;
    }

    public final boolean f() {
        if (!this.K && !this.I) {
            if (!this.N) {
                return false;
            }
        }
        return true;
    }

    public final synchronized void g() {
        boolean a10;
        try {
            if (this.B == null) {
                throw new IllegalArgumentException();
            }
            this.f5795c.f5809c.clear();
            this.B = null;
            this.L = null;
            this.G = null;
            this.K = false;
            this.N = false;
            this.I = false;
            this.O = false;
            DecodeJob<R> decodeJob = this.M;
            DecodeJob.e eVar = decodeJob.f5714u;
            synchronized (eVar) {
                eVar.f5732a = true;
                a10 = eVar.a(false);
            }
            if (a10) {
                decodeJob.n();
            }
            this.M = null;
            this.J = null;
            this.H = null;
            this.f5798m.a(this);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void h(z5.g gVar) {
        boolean z10;
        try {
            this.f5796f.a();
            this.f5795c.f5809c.remove(new d(gVar, d6.e.f8789b));
            if (this.f5795c.isEmpty()) {
                b();
                if (!this.I && !this.K) {
                    z10 = false;
                    if (z10 && this.A.get() == 0) {
                        g();
                    }
                }
                z10 = true;
                if (z10) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void i(DecodeJob<?> decodeJob) {
        (this.D ? this.y : this.E ? this.f5802z : this.f5801w).f12903c.execute(decodeJob);
    }
}
