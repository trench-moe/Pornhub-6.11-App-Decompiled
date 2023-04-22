package l5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f12234a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f12235b = new b();

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Lock f12236a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f12237b;
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<a> f12238a = new ArrayDeque();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void a(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.util.Map<java.lang.String, l5.c$a> r0 = r6.f12234a     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r5 = r0.get(r7)     // Catch: java.lang.Throwable -> Lad
            r0 = r5
            java.lang.String r5 = "Argument must not be null"
            r1 = r5
            java.util.Objects.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> Lad
            l5.c$a r0 = (l5.c.a) r0     // Catch: java.lang.Throwable -> Lad
            int r1 = r0.f12237b     // Catch: java.lang.Throwable -> Lad
            r5 = 1
            r2 = r5
            if (r1 < r2) goto L88
            int r1 = r1 - r2
            r0.f12237b = r1     // Catch: java.lang.Throwable -> Lad
            r5 = 4
            if (r1 != 0) goto L7e
            r5 = 2
            java.util.Map<java.lang.String, l5.c$a> r1 = r6.f12234a     // Catch: java.lang.Throwable -> Lad
            r5 = 7
            java.lang.Object r5 = r1.remove(r7)     // Catch: java.lang.Throwable -> Lad
            r1 = r5
            l5.c$a r1 = (l5.c.a) r1     // Catch: java.lang.Throwable -> Lad
            r5 = 3
            boolean r5 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lad
            r2 = r5
            if (r2 == 0) goto L52
            r5 = 7
            l5.c$b r7 = r6.f12235b     // Catch: java.lang.Throwable -> Lad
            java.util.Queue<l5.c$a> r2 = r7.f12238a     // Catch: java.lang.Throwable -> Lad
            r5 = 3
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lad
            r5 = 7
            java.util.Queue<l5.c$a> r3 = r7.f12238a     // Catch: java.lang.Throwable -> L4e
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L4e
            r3 = r5
            r4 = 10
            r5 = 1
            if (r3 >= r4) goto L4b
            java.util.Queue<l5.c$a> r7 = r7.f12238a     // Catch: java.lang.Throwable -> L4e
            r5 = 3
            r7.offer(r1)     // Catch: java.lang.Throwable -> L4e
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            r5 = 4
            goto L7f
        L4e:
            r7 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            throw r7     // Catch: java.lang.Throwable -> Lad
            r5 = 7
        L52:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lad
            r5 = 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r3.<init>()     // Catch: java.lang.Throwable -> Lad
            java.lang.String r5 = "Removed the wrong lock, expected to remove: "
            r4 = r5
            r3.append(r4)     // Catch: java.lang.Throwable -> Lad
            r3.append(r0)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r5 = ", but actually removed: "
            r0 = r5
            r3.append(r0)     // Catch: java.lang.Throwable -> Lad
            r3.append(r1)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = ", safeKey: "
            r3.append(r0)     // Catch: java.lang.Throwable -> Lad
            r3.append(r7)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r7 = r3.toString()     // Catch: java.lang.Throwable -> Lad
            r2.<init>(r7)     // Catch: java.lang.Throwable -> Lad
            r5 = 1
            throw r2     // Catch: java.lang.Throwable -> Lad
            r5 = 2
        L7e:
            r5 = 3
        L7f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lad
            java.util.concurrent.locks.Lock r7 = r0.f12236a
            r5 = 4
            r7.unlock()
            r5 = 5
            return
        L88:
            r5 = 4
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lad
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lad
            r2.<init>()     // Catch: java.lang.Throwable -> Lad
            r5 = 7
            java.lang.String r3 = "Cannot release a lock that is not held, safeKey: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lad
            r2.append(r7)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r7 = ", interestedThreads: "
            r2.append(r7)     // Catch: java.lang.Throwable -> Lad
            int r7 = r0.f12237b     // Catch: java.lang.Throwable -> Lad
            r2.append(r7)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> Lad
            r7 = r5
            r1.<init>(r7)     // Catch: java.lang.Throwable -> Lad
            throw r1     // Catch: java.lang.Throwable -> Lad
            r5 = 2
        Lad:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lad
            throw r7
            r5 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.a(java.lang.String):void");
    }
}
