package w9;

/* loaded from: classes2.dex */
public final class q5 implements q6 {

    /* renamed from: a  reason: collision with root package name */
    public static final q5 f17290a = new q5();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // w9.q6
    public final w9.o6 a(java.lang.Class r9) {
        /*
            r8 = this;
            java.lang.Class<w9.u5> r0 = w9.u5.class
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            boolean r1 = r0.isAssignableFrom(r9)
            if (r1 != 0) goto L2c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r6 = 4
            java.lang.String r9 = r9.getName()
            java.lang.String r4 = "Unsupported message type: "
            r1 = r4
            int r4 = r9.length()
            r2 = r4
            if (r2 == 0) goto L20
            java.lang.String r9 = r1.concat(r9)
            goto L27
        L20:
            java.lang.String r9 = new java.lang.String
            r7 = 1
            r9.<init>(r1)
            r6 = 4
        L27:
            r0.<init>(r9)
            throw r0
            r5 = 7
        L2c:
            r7 = 7
            java.lang.Class r4 = r9.asSubclass(r0)     // Catch: java.lang.Exception -> L42
            r0 = r4
            w9.u5 r0 = w9.u5.o(r0)     // Catch: java.lang.Exception -> L42
            r4 = 3
            r1 = r4
            r4 = 0
            r2 = r4
            java.lang.Object r4 = r0.r(r1, r2, r2)     // Catch: java.lang.Exception -> L42
            r0 = r4
            w9.o6 r0 = (w9.o6) r0     // Catch: java.lang.Exception -> L42
            return r0
        L42:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r9 = r9.getName()
            java.lang.String r2 = "Unable to get message info for "
            r5 = 1
            int r4 = r9.length()
            r3 = r4
            if (r3 == 0) goto L5a
            r7 = 3
            java.lang.String r4 = r2.concat(r9)
            r9 = r4
            goto L62
        L5a:
            r5 = 4
            java.lang.String r9 = new java.lang.String
            r6 = 6
            r9.<init>(r2)
            r5 = 4
        L62:
            r1.<init>(r9, r0)
            throw r1
            r7 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.q5.a(java.lang.Class):w9.o6");
    }

    @Override // w9.q6
    public final boolean b(Class cls) {
        return u5.class.isAssignableFrom(cls);
    }
}
