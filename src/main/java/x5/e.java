package x5;

@Deprecated
/* loaded from: classes2.dex */
public final class e {
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static x5.c a(java.lang.String r6) {
        /*
            java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.Class r3 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L57
            r6 = r3
            r3 = 0
            r0 = r3
            r1 = 0
            r4 = 7
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.NoSuchMethodException -> L46 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L51
            r5 = 5
            java.lang.reflect.Constructor r3 = r6.getDeclaredConstructor(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.NoSuchMethodException -> L46 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L51
            r2 = r3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.NoSuchMethodException -> L46 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L51
            r5 = 4
            java.lang.Object r3 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L40 java.lang.NoSuchMethodException -> L46 java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L51
            r6 = r3
            boolean r0 = r6 instanceof x5.c
            r5 = 4
            if (r0 == 0) goto L24
            x5.c r6 = (x5.c) r6
            r4 = 2
            return r6
        L24:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r4 = 7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r5 = 4
            r1.<init>()
            java.lang.String r3 = "Expected instanceof GlideModule, but found: "
            r2 = r3
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            r4 = 5
            throw r0
            r4 = 2
        L40:
            r0 = move-exception
            b(r6, r0)
            throw r1
            r4 = 2
        L46:
            r0 = move-exception
            b(r6, r0)
            r4 = 7
            throw r1
        L4c:
            r0 = move-exception
            b(r6, r0)
            throw r1
        L51:
            r0 = move-exception
            b(r6, r0)
            r5 = 7
            throw r1
        L57:
            r6 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find GlideModule implementation"
            r5 = 2
            r0.<init>(r1, r6)
            r5 = 2
            throw r0
            r4 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.e.a(java.lang.String):x5.c");
    }

    public static void b(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }
}
