package h9;

/* loaded from: classes2.dex */
public abstract class x0<TListener> {

    /* renamed from: a  reason: collision with root package name */
    public TListener f10388a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10389b = false;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f10390c;

    public x0(b bVar, TListener tlistener) {
        this.f10390c = bVar;
        this.f10388a = tlistener;
    }

    public abstract void a(TListener tlistener);

    public abstract void b();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void c() {
        /*
            r6 = this;
            r2 = r6
            monitor-enter(r2)
            r5 = 0
            r0 = r5
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r2.f10388a = r0     // Catch: java.lang.Throwable -> L22
            r4 = 4
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            h9.b r0 = r2.f10390c
            java.util.ArrayList r0 = h9.b.zzf(r0)
            monitor-enter(r0)
            r4 = 3
            h9.b r1 = r2.f10390c     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayList r1 = h9.b.zzf(r1)     // Catch: java.lang.Throwable -> L1e
            r1.remove(r2)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            r4 = 5
            return
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
            r5 = 2
        L22:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r0
            r5 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.x0.c():void");
    }
}
