package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.l1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import t9.g3;
import t9.j1;
import t9.j2;
import t9.o3;
import t9.q2;
import t9.t2;

/* loaded from: classes.dex */
public abstract class l1<MessageType extends l1<MessageType, BuilderType>, BuilderType extends t9.j1<MessageType, BuilderType>> extends h1<MessageType, BuilderType> {
    private static final Map<Object, l1<?, ?>> zzb = new ConcurrentHashMap();
    public g3 zzc = g3.d;
    public int zzd = -1;

    public static <T extends l1> void c(Class<T> cls, T t2) {
        zzb.put(cls, t2);
    }

    public static <T extends l1> T j(Class<T> cls) {
        Map<Object, l1<?, ?>> map = zzb;
        l1<?, ?> l1Var = map.get(cls);
        if (l1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                l1Var = map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (l1Var == null) {
            l1Var = (l1) ((l1) o3.i(cls)).e(6, null, null);
            if (l1Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, l1Var);
        }
        return l1Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.Object l(java.lang.reflect.Method r3, java.lang.Object r4, java.lang.Object... r5) {
        /*
            r1 = 4
            java.lang.Object r0 = r3.invoke(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L7 java.lang.IllegalAccessException -> L2b
            r3 = r0
            return r3
        L7:
            r3 = move-exception
            java.lang.Throwable r0 = r3.getCause()
            r3 = r0
            boolean r4 = r3 instanceof java.lang.RuntimeException
            r2 = 7
            if (r4 != 0) goto L27
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L1b
            r2 = 7
            java.lang.Error r3 = (java.lang.Error) r3
            r1 = 1
            throw r3
        L1b:
            r1 = 2
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r2 = 1
            java.lang.String r0 = "Unexpected exception thrown by generated accessor method."
            r5 = r0
            r4.<init>(r5, r3)
            throw r4
            r1 = 3
        L27:
            java.lang.RuntimeException r3 = (java.lang.RuntimeException) r3
            throw r3
            r1 = 4
        L2b:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "Couldn't use Java reflection to implement protocol message reflection."
            r4.<init>(r5, r3)
            r1 = 1
            throw r4
            r2 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.l1.l(java.lang.reflect.Method, java.lang.Object, java.lang.Object[]):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.cast.h1
    public final int a() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.cast.h1
    public final void b(int i10) {
        this.zzd = i10;
    }

    public final void d(j1 j1Var) {
        t2 a10 = q2.f15328c.a(getClass());
        k1 k1Var = j1Var.P;
        if (k1Var == null) {
            k1Var = new k1(j1Var);
        }
        a10.g(this, k1Var);
    }

    public abstract Object e(int i10, Object obj, Object obj2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return q2.f15328c.a(getClass()).e(this, (l1) obj);
        }
        return false;
    }

    @Override // t9.j2
    public final int f() {
        int i10 = this.zzd;
        if (i10 == -1) {
            i10 = q2.f15328c.a(getClass()).c(this);
            this.zzd = i10;
        }
        return i10;
    }

    public final <MessageType extends l1<MessageType, BuilderType>, BuilderType extends t9.j1<MessageType, BuilderType>> BuilderType h() {
        return (BuilderType) e(5, null, null);
    }

    public final int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int b10 = q2.f15328c.a(getClass()).b(this);
        this.zza = b10;
        return b10;
    }

    @Override // t9.j2
    public final /* synthetic */ t9.w0 i() {
        t9.j1 j1Var = (t9.j1) e(5, null, null);
        j1Var.b(this);
        return j1Var;
    }

    @Override // t9.k2
    public final /* synthetic */ j2 k() {
        return (l1) e(6, null, null);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        n1.c(this, sb2, 0);
        return sb2.toString();
    }
}
