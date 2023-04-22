package f5;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f9452a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void a(java.io.File r7) {
        /*
            r4 = r7
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L49
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            int r4 = r0.length
            r1 = 0
        Lb:
            if (r1 >= r4) goto L47
            r6 = 2
            r2 = r0[r1]
            r6 = 7
            boolean r6 = r2.isDirectory()
            r3 = r6
            if (r3 == 0) goto L1d
            r6 = 4
            a(r2)
            r6 = 6
        L1d:
            r6 = 6
            boolean r6 = r2.delete()
            r3 = r6
            if (r3 == 0) goto L2b
            java.lang.String r6 = "Ⓢⓜⓞⓑ⓸⓺"
            int r1 = r1 + 1
            r6 = 6
            goto Lb
        L2b:
            java.io.IOException r4 = new java.io.IOException
            r6 = 3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = 5
            r0.<init>()
            java.lang.String r6 = "failed to delete file: "
            r1 = r6
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            r6 = 5
            throw r4
            r6 = 4
        L47:
            r6 = 1
            return
        L49:
            r6 = 1
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r6 = 3
            r1.<init>()
            java.lang.String r2 = "not a readable directory: "
            r6 = 5
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
            r6 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.c.a(java.io.File):void");
    }
}
