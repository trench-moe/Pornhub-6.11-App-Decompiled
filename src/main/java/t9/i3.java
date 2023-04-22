package t9;

import java.util.ListIterator;
import w9.r7;

/* loaded from: classes2.dex */
public final class i3 implements ListIterator {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15249c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final ListIterator f15250f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f15251j;

    public i3(k3 k3Var, int i10) {
        this.f15251j = k3Var;
        this.f15250f = k3Var.f15283c.listIterator(i10);
    }

    public i3(r7 r7Var, int i10) {
        this.f15251j = r7Var;
        this.f15250f = r7Var.f17297c.listIterator(i10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f15249c
            java.lang.String r2 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L12
        L8:
            r3 = 3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r5.<init>()
            throw r5
            r2 = 3
        L12:
            java.lang.String r5 = (java.lang.String) r5
            r3 = 6
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            r3 = 2
            r5.<init>()
            throw r5
            r3 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.i3.add(java.lang.Object):void");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f15249c) {
            case 0:
                return this.f15250f.hasNext();
            default:
                return this.f15250f.hasNext();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f15249c) {
            case 0:
                return this.f15250f.hasPrevious();
            default:
                return this.f15250f.hasPrevious();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        switch (this.f15249c) {
            case 0:
                return (String) this.f15250f.next();
            default:
                return (String) this.f15250f.next();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f15249c) {
            case 0:
                return this.f15250f.nextIndex();
            default:
                return this.f15250f.nextIndex();
        }
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        switch (this.f15249c) {
            case 0:
                return (String) this.f15250f.previous();
            default:
                return (String) this.f15250f.previous();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f15249c) {
            case 0:
                return this.f15250f.previousIndex();
            default:
                return this.f15250f.previousIndex();
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
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        /*
            r5 = this;
            r1 = r5
            int r0 = r1.f15249c
            r3 = 3
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L10
        L8:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r4 = 6
            r0.<init>()
            throw r0
            r4 = 3
        L10:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r3 = 2
            r0.<init>()
            throw r0
            r4 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.i3.remove():void");
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        switch (this.f15249c) {
            case 0:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }
}
