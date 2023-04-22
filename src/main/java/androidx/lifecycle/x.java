package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2411a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f2412b = false;

    public void a() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public <T> T b(java.lang.String r7, T r8) {
        /*
            r6 = this;
            r3 = r6
            java.util.Map<java.lang.String, java.lang.Object> r0 = r3.f2411a
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            monitor-enter(r0)
            r5 = 2
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f2411a     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r5 = r1.get(r7)     // Catch: java.lang.Throwable -> L3a
            r1 = r5
            if (r1 != 0) goto L15
            java.util.Map<java.lang.String, java.lang.Object> r2 = r3.f2411a     // Catch: java.lang.Throwable -> L3a
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L3a
        L15:
            r5 = 6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L1a
            goto L1c
        L1a:
            r5 = 6
            r8 = r1
        L1c:
            boolean r7 = r3.f2412b
            r5 = 1
            if (r7 == 0) goto L39
            r5 = 2
            boolean r7 = r8 instanceof java.io.Closeable
            r5 = 1
            if (r7 == 0) goto L39
            r5 = 4
            r7 = r8
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch: java.io.IOException -> L30
            r5 = 1
            r7.close()     // Catch: java.io.IOException -> L30
            goto L39
        L30:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r5 = 7
            r8.<init>(r7)
            throw r8
            r5 = 6
        L39:
            return r8
        L3a:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r7
            r5 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.x.b(java.lang.String, java.lang.Object):java.lang.Object");
    }
}
