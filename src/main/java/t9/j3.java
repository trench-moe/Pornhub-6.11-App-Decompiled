package t9;

import java.util.Iterator;
import w9.r7;

/* loaded from: classes2.dex */
public final class j3 implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15274c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final Iterator f15275f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f15276j;

    public j3(k3 k3Var) {
        this.f15276j = k3Var;
        this.f15275f = k3Var.f15283c.iterator();
    }

    public j3(r7 r7Var) {
        this.f15276j = r7Var;
        this.f15275f = r7Var.f17297c.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15274c) {
            case 0:
                return this.f15275f.hasNext();
            default:
                return this.f15275f.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f15274c) {
            case 0:
                return (String) this.f15275f.next();
            default:
                return (String) this.f15275f.next();
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
    @Override // java.util.Iterator
    public final void remove() {
        /*
            r5 = this;
            r1 = r5
            int r0 = r1.f15274c
            r4 = 3
            switch(r0) {
                case 0: goto L9;
                default: goto L7;
            }
        L7:
            r4 = 3
            goto L13
        L9:
            r4 = 4
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r4 = 4
            r0.<init>()
            r3 = 1
            throw r0
            r4 = 4
        L13:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
            r4 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.j3.remove():void");
    }
}
