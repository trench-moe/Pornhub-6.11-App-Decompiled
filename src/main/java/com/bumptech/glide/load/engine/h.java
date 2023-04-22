package com.bumptech.glide.load.engine;

import java.util.Objects;

/* loaded from: classes.dex */
public class h<Z> implements j5.i<Z> {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5810c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5811f;

    /* renamed from: j  reason: collision with root package name */
    public final j5.i<Z> f5812j;

    /* renamed from: m  reason: collision with root package name */
    public final a f5813m;
    public final h5.b n;

    /* renamed from: t  reason: collision with root package name */
    public int f5814t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5815u;

    /* loaded from: classes.dex */
    public interface a {
        void a(h5.b bVar, h<?> hVar);
    }

    public h(j5.i<Z> iVar, boolean z10, boolean z11, h5.b bVar, a aVar) {
        Objects.requireNonNull(iVar, "Argument must not be null");
        this.f5812j = iVar;
        this.f5810c = z10;
        this.f5811f = z11;
        this.n = bVar;
        Objects.requireNonNull(aVar, "Argument must not be null");
        this.f5813m = aVar;
    }

    public synchronized void a() {
        if (this.f5815u) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f5814t++;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // j5.i
    public synchronized void b() {
        /*
            r6 = this;
            monitor-enter(r6)
            r4 = 2
            int r0 = r6.f5814t     // Catch: java.lang.Throwable -> L35
            if (r0 > 0) goto L2a
            r5 = 1
            boolean r0 = r6.f5815u     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L1e
            r4 = 6
            r0 = 1
            r5 = 3
            r6.f5815u = r0     // Catch: java.lang.Throwable -> L35
            boolean r0 = r6.f5811f     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L1b
            r5 = 6
            j5.i<Z> r0 = r6.f5812j     // Catch: java.lang.Throwable -> L35
            r4 = 1
            r0.b()     // Catch: java.lang.Throwable -> L35
        L1b:
            r3 = 3
            monitor-exit(r6)
            return
        L1e:
            r4 = 4
            r4 = 6
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Cannot recycle a resource that has already been recycled"
            r1 = r2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
            r3 = 3
        L2a:
            r3 = 3
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            r3 = 2
            java.lang.String r1 = "Cannot recycle a resource while it is still acquired"
            r3 = 1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L35
            throw r0     // Catch: java.lang.Throwable -> L35
        L35:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
            r4 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.h.b():void");
    }

    @Override // j5.i
    public int c() {
        return this.f5812j.c();
    }

    @Override // j5.i
    public Class<Z> d() {
        return this.f5812j.d();
    }

    public void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f5814t;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f5814t = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f5813m.a(this.n, this);
        }
    }

    @Override // j5.i
    public Z get() {
        return this.f5812j.get();
    }

    public synchronized String toString() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return "EngineResource{isMemoryCacheable=" + this.f5810c + ", listener=" + this.f5813m + ", key=" + this.n + ", acquired=" + this.f5814t + ", isRecycled=" + this.f5815u + ", resource=" + this.f5812j + '}';
    }
}
