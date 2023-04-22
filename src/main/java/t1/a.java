package t1;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f15099a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f15100b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @android.annotation.SuppressLint({"NewApi"})
    public static boolean a() {
        /*
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.reflect.Method r0 = t1.a.f15100b     // Catch: java.lang.Throwable -> Ld
            r7 = 6
            if (r0 != 0) goto Ld
            boolean r7 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> Ld
            r0 = r7
            return r0
        Ld:
            r7 = 5
            r7 = 0
            r0 = r7
            java.lang.reflect.Method r1 = t1.a.f15100b     // Catch: java.lang.Exception -> L5a
            r7 = 1
            r2 = r7
            r7 = 0
            r3 = r7
            if (r1 != 0) goto L3d
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r7 = 7
            java.lang.String r4 = "TRACE_TAG_APP"
            java.lang.reflect.Field r7 = r1.getField(r4)     // Catch: java.lang.Exception -> L5a
            r1 = r7
            long r4 = r1.getLong(r3)     // Catch: java.lang.Exception -> L5a
            t1.a.f15099a = r4     // Catch: java.lang.Exception -> L5a
            r7 = 4
            java.lang.Class<android.os.Trace> r1 = android.os.Trace.class
            r7 = 3
            java.lang.String r4 = "isTagEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L5a
            r7 = 7
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch: java.lang.Exception -> L5a
            r5[r0] = r6     // Catch: java.lang.Exception -> L5a
            java.lang.reflect.Method r7 = r1.getMethod(r4, r5)     // Catch: java.lang.Exception -> L5a
            r1 = r7
            t1.a.f15100b = r1     // Catch: java.lang.Exception -> L5a
            r7 = 3
        L3d:
            r7 = 4
            java.lang.reflect.Method r1 = t1.a.f15100b     // Catch: java.lang.Exception -> L5a
            r7 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L5a
            r7 = 6
            long r4 = t1.a.f15099a     // Catch: java.lang.Exception -> L5a
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L5a
            r2[r0] = r4     // Catch: java.lang.Exception -> L5a
            r7 = 3
            java.lang.Object r7 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L5a
            r1 = r7
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L5a
            boolean r7 = r1.booleanValue()     // Catch: java.lang.Exception -> L5a
            r0 = r7
            goto L82
        L5a:
            r1 = move-exception
            boolean r2 = r1 instanceof java.lang.reflect.InvocationTargetException
            r7 = 3
            if (r2 == 0) goto L79
            r7 = 7
            java.lang.Throwable r0 = r1.getCause()
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L6f
            r7 = 3
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            r7 = 3
            throw r0
            r7 = 5
        L6f:
            r7 = 2
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r7 = 4
            r1.<init>(r0)
            r7 = 6
            throw r1
            r7 = 1
        L79:
            r7 = 2
            java.lang.String r2 = "Trace"
            java.lang.String r3 = "Unable to call isTagEnabled via reflection"
            r7 = 6
            android.util.Log.v(r2, r3, r1)
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.a.a():boolean");
    }
}
