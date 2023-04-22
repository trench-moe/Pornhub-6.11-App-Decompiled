package vb;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f16121a = v.a("awaitEvenIfOnMainThread task continuation executor");

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static <T> T a(ea.g<T> r5) {
        /*
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r4 = 1
            r1 = r4
            r0.<init>(r1)
            r4 = 3
            java.util.concurrent.ExecutorService r1 = vb.b0.f16121a
            g4.n r2 = new g4.n
            r4 = 7
            r2.<init>(r0)
            r5.g(r1, r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r4 = android.os.Looper.myLooper()
            r2 = r4
            if (r1 != r2) goto L2b
            r4 = 3
            r1 = 4
            r4 = 1
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 6
            r0.await(r1, r3)
            goto L2f
        L2b:
            r0.await()
            r4 = 4
        L2f:
            boolean r4 = r5.m()
            r0 = r4
            if (r0 == 0) goto L3c
            java.lang.Object r4 = r5.j()
            r5 = r4
            return r5
        L3c:
            r4 = 6
            boolean r4 = r5.k()
            r0 = r4
            if (r0 != 0) goto L5e
            boolean r0 = r5.l()
            if (r0 == 0) goto L55
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Exception r4 = r5.i()
            r5 = r4
            r0.<init>(r5)
            throw r0
        L55:
            r4 = 2
            java.util.concurrent.TimeoutException r5 = new java.util.concurrent.TimeoutException
            r5.<init>()
            r4 = 6
            throw r5
            r4 = 1
        L5e:
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Task is already canceled"
            r5.<init>(r0)
            throw r5
            r4 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.b0.a(ea.g):java.lang.Object");
    }
}
