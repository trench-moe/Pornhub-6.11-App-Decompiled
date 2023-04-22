package i0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10447a;

    /* renamed from: b  reason: collision with root package name */
    public a f10448b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10449c;

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void a() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r2 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            boolean r0 = r3.f10447a     // Catch: java.lang.Throwable -> L41
            r2 = 6
            if (r0 == 0) goto Lc
            r2 = 7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
            r2 = 3
            return
        Lc:
            r2 = 7
            r2 = 1
            r0 = r2
            r3.f10447a = r0     // Catch: java.lang.Throwable -> L41
            r3.f10449c = r0     // Catch: java.lang.Throwable -> L41
            i0.b$a r0 = r3.f10448b     // Catch: java.lang.Throwable -> L41
            r2 = 7
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L31
            r2 = 7
            r2 = 1
            r0.a()     // Catch: java.lang.Throwable -> L21
            goto L32
        L21:
            r0 = move-exception
            monitor-enter(r3)
            r3.f10449c = r1     // Catch: java.lang.Throwable -> L2d
            r2 = 2
            r3.notifyAll()     // Catch: java.lang.Throwable -> L2d
            r2 = 6
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r0
            r2 = 1
        L2d:
            r0 = move-exception
            r2 = 4
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r0
        L31:
            r2 = 7
        L32:
            monitor-enter(r3)
            r3.f10449c = r1     // Catch: java.lang.Throwable -> L3d
            r2 = 7
            r3.notifyAll()     // Catch: java.lang.Throwable -> L3d
            r2 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            r2 = 3
            return
        L3d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3d
            throw r0
            r2 = 6
        L41:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L41
            throw r0
            r2 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a():void");
    }

    public void b(a aVar) {
        synchronized (this) {
            while (this.f10449c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f10448b == aVar) {
                return;
            }
            this.f10448b = aVar;
            if (this.f10447a) {
                aVar.a();
            }
        }
    }
}
