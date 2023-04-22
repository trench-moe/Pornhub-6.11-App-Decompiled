package com.google.android.gms.dynamic;

import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class RemoteCreator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f6870a;

    /* renamed from: b  reason: collision with root package name */
    public T f6871b;

    /* loaded from: classes.dex */
    public static class RemoteCreatorException extends Exception {
        public RemoteCreatorException(String str) {
            super(str);
        }

        public RemoteCreatorException(String str, Throwable th) {
            super(str, th);
        }
    }

    public RemoteCreator(String str) {
        this.f6870a = str;
    }

    public abstract T a(IBinder iBinder);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final T b(android.content.Context r5) {
        /*
            r4 = this;
            T r0 = r4.f6871b
            java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            if (r0 != 0) goto L64
            r3 = 2
            java.lang.String r0 = "null reference"
            r3 = 4
            java.util.Objects.requireNonNull(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = c9.h.f3879a
            r3 = 1
            java.lang.String r2 = "com.google.android.gms"
            r0 = r2
            r2 = 3
            r1 = r2
            android.content.Context r2 = r5.createPackageContext(r0, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            r5 = r2
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r5 == 0) goto L58
            java.lang.ClassLoader r5 = r5.getClassLoader()
            r3 = 2
            java.lang.String r0 = r4.f6870a     // Catch: java.lang.IllegalAccessException -> L37 java.lang.InstantiationException -> L43 java.lang.ClassNotFoundException -> L4f
            java.lang.Class r5 = r5.loadClass(r0)     // Catch: java.lang.IllegalAccessException -> L37 java.lang.InstantiationException -> L43 java.lang.ClassNotFoundException -> L4f
            java.lang.Object r2 = r5.newInstance()     // Catch: java.lang.IllegalAccessException -> L37 java.lang.InstantiationException -> L43 java.lang.ClassNotFoundException -> L4f
            r5 = r2
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.IllegalAccessException -> L37 java.lang.InstantiationException -> L43 java.lang.ClassNotFoundException -> L4f
            java.lang.Object r5 = r4.a(r5)     // Catch: java.lang.IllegalAccessException -> L37 java.lang.InstantiationException -> L43 java.lang.ClassNotFoundException -> L4f
            r4.f6871b = r5     // Catch: java.lang.IllegalAccessException -> L37 java.lang.InstantiationException -> L43 java.lang.ClassNotFoundException -> L4f
            goto L64
        L37:
            r5 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            r3 = 6
            java.lang.String r2 = "Could not access creator."
            r1 = r2
            r0.<init>(r1, r5)
            throw r0
            r3 = 7
        L43:
            r5 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            r3 = 5
            java.lang.String r2 = "Could not instantiate creator."
            r1 = r2
            r0.<init>(r1, r5)
            r3 = 3
            throw r0
        L4f:
            r5 = move-exception
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r0 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r1 = "Could not load creator class."
            r0.<init>(r1, r5)
            throw r0
        L58:
            r3 = 1
            com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException r5 = new com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException
            java.lang.String r2 = "Could not get remote context."
            r0 = r2
            r5.<init>(r0)
            r3 = 6
            throw r5
            r3 = 2
        L64:
            T r5 = r4.f6871b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.RemoteCreator.b(android.content.Context):java.lang.Object");
    }
}
