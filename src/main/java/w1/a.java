package w1;

import android.os.Parcelable;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final p.a<String, Method> f16361a;

    /* renamed from: b  reason: collision with root package name */
    public final p.a<String, Method> f16362b;

    /* renamed from: c  reason: collision with root package name */
    public final p.a<String, Class> f16363c;

    public a(p.a<String, Method> aVar, p.a<String, Method> aVar2, p.a<String, Class> aVar3) {
        this.f16361a = aVar;
        this.f16362b = aVar2;
        this.f16363c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) {
        Class<?> orDefault = this.f16363c.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            orDefault = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f16363c.put(cls.getName(), orDefault);
        }
        return orDefault;
    }

    public final Method d(String str) {
        Method orDefault = this.f16361a.getOrDefault(str, null);
        if (orDefault == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            this.f16361a.put(str, declaredMethod);
            return declaredMethod;
        }
        return orDefault;
    }

    public final Method e(Class cls) {
        Method orDefault = this.f16362b.getOrDefault(cls.getName(), null);
        if (orDefault == null) {
            Class c10 = c(cls);
            System.currentTimeMillis();
            orDefault = c10.getDeclaredMethod("write", cls, a.class);
            this.f16362b.put(cls.getName(), orDefault);
        }
        return orDefault;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i10);

    public abstract int j();

    public int k(int i10, int i11) {
        return !i(i11) ? i10 : j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t2, int i10) {
        return !i(i10) ? t2 : (T) l();
    }

    public abstract String n();

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public <T extends w1.c> T o() {
        /*
            r8 = this;
            r5 = r8
            java.lang.String r0 = r5.n()
            r7 = 0
            r1 = r7
            if (r0 != 0) goto La
            return r1
        La:
            w1.a r2 = r5.b()
            java.lang.reflect.Method r0 = r5.d(r0)     // Catch: java.lang.ClassNotFoundException -> L23 java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L3a java.lang.IllegalAccessException -> L59
            r3 = 1
            r7 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ClassNotFoundException -> L23 java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L3a java.lang.IllegalAccessException -> L59
            r7 = 6
            r7 = 0
            r4 = r7
            r3[r4] = r2     // Catch: java.lang.ClassNotFoundException -> L23 java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L3a java.lang.IllegalAccessException -> L59
            java.lang.Object r7 = r0.invoke(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L23 java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L3a java.lang.IllegalAccessException -> L59
            r0 = r7
            w1.c r0 = (w1.c) r0     // Catch: java.lang.ClassNotFoundException -> L23 java.lang.NoSuchMethodException -> L2f java.lang.reflect.InvocationTargetException -> L3a java.lang.IllegalAccessException -> L59
            return r0
        L23:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r7 = "VersionedParcel encountered ClassNotFoundException"
            r2 = r7
            r1.<init>(r2, r0)
            r7 = 2
            throw r1
            r7 = 6
        L2f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r7 = 5
            java.lang.String r7 = "VersionedParcel encountered NoSuchMethodException"
            r2 = r7
            r1.<init>(r2, r0)
            throw r1
        L3a:
            r0 = move-exception
            java.lang.Throwable r7 = r0.getCause()
            r1 = r7
            boolean r1 = r1 instanceof java.lang.RuntimeException
            r7 = 1
            if (r1 == 0) goto L4f
            r7 = 6
            java.lang.Throwable r0 = r0.getCause()
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            r7 = 2
            throw r0
            r7 = 4
        L4f:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r7 = "VersionedParcel encountered InvocationTargetException"
            r2 = r7
            r1.<init>(r2, r0)
            r7 = 6
            throw r1
        L59:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "VersionedParcel encountered IllegalAccessException"
            r7 = 7
            r1.<init>(r2, r0)
            r7 = 7
            throw r1
            r7 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.o():w1.c");
    }

    public abstract void p(int i10);

    public abstract void q(boolean z10);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i10);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void w(w1.c r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L9
            r6 = 4
            r8.v(r0)
            r6 = 3
            return
        L9:
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.ClassNotFoundException -> L7b
            java.lang.Class r5 = r8.c(r1)     // Catch: java.lang.ClassNotFoundException -> L7b
            r1 = r5
            java.lang.String r5 = r1.getName()
            r1 = r5
            r8.v(r1)
            r6 = 7
            w1.a r1 = r8.b()
            java.lang.Class r5 = r9.getClass()     // Catch: java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L4a java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L71
            r2 = r5
            java.lang.reflect.Method r5 = r8.e(r2)     // Catch: java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L4a java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L71
            r2 = r5
            r5 = 2
            r3 = r5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L4a java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L71
            r6 = 1
            r4 = 0
            r6 = 7
            r3[r4] = r9     // Catch: java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L4a java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L71
            r7 = 7
            r5 = 1
            r9 = r5
            r3[r9] = r1     // Catch: java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L4a java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L71
            r6 = 2
            r2.invoke(r0, r3)     // Catch: java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L4a java.lang.reflect.InvocationTargetException -> L55 java.lang.IllegalAccessException -> L71
            r1.a()
            return
        L3f:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered ClassNotFoundException"
            r7 = 2
            r0.<init>(r1, r9)
            r7 = 5
            throw r0
        L4a:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "VersionedParcel encountered NoSuchMethodException"
            r0.<init>(r1, r9)
            r7 = 3
            throw r0
            r7 = 7
        L55:
            r9 = move-exception
            java.lang.Throwable r0 = r9.getCause()
            boolean r0 = r0 instanceof java.lang.RuntimeException
            if (r0 == 0) goto L67
            java.lang.Throwable r5 = r9.getCause()
            r9 = r5
            java.lang.RuntimeException r9 = (java.lang.RuntimeException) r9
            r6 = 6
            throw r9
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r6 = 5
            java.lang.String r5 = "VersionedParcel encountered InvocationTargetException"
            r1 = r5
            r0.<init>(r1, r9)
            throw r0
        L71:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r7 = 7
            java.lang.String r1 = "VersionedParcel encountered IllegalAccessException"
            r0.<init>(r1, r9)
            throw r0
        L7b:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r6 = 3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r7 = 4
            r2.<init>()
            r6 = 5
            java.lang.Class r5 = r9.getClass()
            r9 = r5
            java.lang.String r5 = r9.getSimpleName()
            r9 = r5
            r2.append(r9)
            java.lang.String r5 = " does not have a Parcelizer"
            r9 = r5
            r2.append(r9)
            java.lang.String r5 = r2.toString()
            r9 = r5
            r1.<init>(r9, r0)
            throw r1
            r6 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.a.w(w1.c):void");
    }
}
