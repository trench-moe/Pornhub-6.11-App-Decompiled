package ea;

import a9.a0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements p, e, d, b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9283c;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f9284f;

    /* renamed from: j  reason: collision with root package name */
    public final Object f9285j;

    /* renamed from: m  reason: collision with root package name */
    public Object f9286m;

    public l(Executor executor, c cVar) {
        this.f9283c = 1;
        this.f9285j = new Object();
        this.f9284f = executor;
        this.f9286m = cVar;
    }

    public /* synthetic */ l(Executor executor, Object obj, u uVar, int i10) {
        this.f9283c = i10;
        this.f9284f = executor;
        this.f9285j = obj;
        this.f9286m = uVar;
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
    public final void a() {
        /*
            r4 = this;
            int r0 = r4.f9283c
            java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            switch(r0) {
                case 0: goto L17;
                case 1: goto L8;
                default: goto L7;
            }
        L7:
            goto L20
        L8:
            r3 = 2
            java.lang.Object r0 = r4.f9285j
            monitor-enter(r0)
            r1 = 0
            r3 = 4
            r4.f9286m = r1     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r3 = 6
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
            r3 = 5
        L17:
            r3 = 6
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            r3 = 5
            throw r0
            r3 = 3
        L20:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            r3 = 3
            throw r0
            r3 = 6
            r3 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: ea.l.a():void");
    }

    @Override // ea.p
    public final void b(g gVar) {
        switch (this.f9283c) {
            case 0:
                this.f9284f.execute(new a0((Object) this, gVar, 1));
                return;
            case 1:
                synchronized (this.f9285j) {
                    try {
                        if (((c) this.f9286m) == null) {
                            return;
                        }
                        this.f9284f.execute(new a0((Object) this, gVar, 2));
                        return;
                    } finally {
                    }
                }
            default:
                this.f9284f.execute(new a0((Object) this, gVar, 3));
                return;
        }
    }

    @Override // ea.b
    public void l() {
        ((u) this.f9286m).q();
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        ((u) this.f9286m).p(obj);
    }

    @Override // ea.d
    public void q(Exception exc) {
        ((u) this.f9286m).o(exc);
    }
}
