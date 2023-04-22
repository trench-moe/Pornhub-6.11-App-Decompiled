package ea;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n implements p {

    /* renamed from: f  reason: collision with root package name */
    public final Executor f9292f;

    /* renamed from: m  reason: collision with root package name */
    public Object f9294m;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9291c = 0;

    /* renamed from: j  reason: collision with root package name */
    public final Object f9293j = new Object();

    public n(Executor executor, b bVar) {
        this.f9292f = executor;
        this.f9294m = bVar;
    }

    public n(Executor executor, e eVar) {
        this.f9292f = executor;
        this.f9294m = eVar;
    }

    @Override // ea.p
    public final void a() {
        switch (this.f9291c) {
            case 0:
                synchronized (this.f9293j) {
                    this.f9294m = null;
                }
                return;
            default:
                synchronized (this.f9293j) {
                    this.f9294m = null;
                }
                return;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // ea.p
    public final void b(ea.g r7) {
        /*
            r6 = this;
            int r0 = r6.f9291c
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L30
        L6:
            r3 = 5
            boolean r7 = r7.k()
            if (r7 == 0) goto L2e
            java.lang.Object r7 = r6.f9293j
            monitor-enter(r7)
            r5 = 2
            java.lang.Object r0 = r6.f9294m     // Catch: java.lang.Throwable -> L2a
            ea.b r0 = (ea.b) r0     // Catch: java.lang.Throwable -> L2a
            if (r0 != 0) goto L1a
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            r3 = 5
            goto L2f
        L1a:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            java.util.concurrent.Executor r7 = r6.f9292f
            r3 = 5
            a9.p r0 = new a9.p
            r5 = 4
            r1 = 4
            r0.<init>(r6, r1)
            r7.execute(r0)
            r5 = 4
            goto L2f
        L2a:
            r0 = move-exception
            r3 = 5
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            throw r0
        L2e:
            r5 = 6
        L2f:
            return
        L30:
            boolean r0 = r7.m()
            if (r0 == 0) goto L55
            r5 = 3
            java.lang.Object r0 = r6.f9293j
            r4 = 6
            monitor-enter(r0)
            java.lang.Object r1 = r6.f9294m     // Catch: java.lang.Throwable -> L51
            ea.e r1 = (ea.e) r1     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            r4 = 6
            goto L55
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            java.util.concurrent.Executor r0 = r6.f9292f
            ea.o r1 = new ea.o
            r1.<init>(r6, r7)
            r3 = 6
            r0.execute(r1)
            goto L55
        L51:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r7
            r5 = 3
        L55:
            return
            r5 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.n.b(ea.g):void");
    }
}
