package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static b f2358c = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, a> f2359a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2360b = new HashMap();

    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Lifecycle.Event, List<C0030b>> f2361a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<C0030b, Lifecycle.Event> f2362b;

        public a(Map<C0030b, Lifecycle.Event> map) {
            this.f2362b = map;
            for (Map.Entry<C0030b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<C0030b> list = this.f2361a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f2361a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public static void a(java.util.List<androidx.lifecycle.b.C0030b> r9, androidx.lifecycle.k r10, androidx.lifecycle.Lifecycle.Event r11, java.lang.Object r12) {
            /*
                r6 = r9
                if (r6 == 0) goto L66
                java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                int r0 = r6.size()
                r1 = 1
                r8 = 6
                int r0 = r0 - r1
                r8 = 3
            Ld:
                if (r0 < 0) goto L66
                java.lang.Object r8 = r6.get(r0)
                r2 = r8
                androidx.lifecycle.b$b r2 = (androidx.lifecycle.b.C0030b) r2
                r8 = 5
                java.util.Objects.requireNonNull(r2)
                int r3 = r2.f2363a     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                r4 = 0
                r8 = 1
                if (r3 == 0) goto L41
                r8 = 4
                if (r3 == r1) goto L35
                r8 = 2
                r5 = r8
                if (r3 == r5) goto L28
                goto L48
            L28:
                java.lang.reflect.Method r2 = r2.f2364b     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                r8 = 5
                r3[r4] = r10     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                r3[r1] = r11     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                r2.invoke(r12, r3)     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                goto L48
            L35:
                r8 = 6
                java.lang.reflect.Method r2 = r2.f2364b     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                r3[r4] = r10     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                r8 = 6
                r2.invoke(r12, r3)     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                goto L48
            L41:
                java.lang.reflect.Method r2 = r2.f2364b     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
                r2.invoke(r12, r3)     // Catch: java.lang.IllegalAccessException -> L4b java.lang.reflect.InvocationTargetException -> L54
            L48:
                int r0 = r0 + (-1)
                goto Ld
            L4b:
                r6 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r8 = 6
                r10.<init>(r6)
                throw r10
                r8 = 5
            L54:
                r6 = move-exception
                java.lang.RuntimeException r10 = new java.lang.RuntimeException
                r8 = 4
                java.lang.Throwable r8 = r6.getCause()
                r6 = r8
                java.lang.String r8 = "Failed to call observer method"
                r11 = r8
                r10.<init>(r11, r6)
                r8 = 1
                throw r10
                r8 = 4
            L66:
                r8 = 5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.b.a.a(java.util.List, androidx.lifecycle.k, androidx.lifecycle.Lifecycle$Event, java.lang.Object):void");
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0030b {

        /* renamed from: a  reason: collision with root package name */
        public final int f2363a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f2364b;

        public C0030b(int i10, Method method) {
            this.f2363a = i10;
            this.f2364b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0030b) {
                C0030b c0030b = (C0030b) obj;
                return this.f2363a == c0030b.f2363a && this.f2364b.getName().equals(c0030b.f2364b.getName());
            }
            return false;
        }

        public int hashCode() {
            return this.f2364b.getName().hashCode() + (this.f2363a * 31);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final androidx.lifecycle.b.a a(java.lang.Class<?> r14, java.lang.reflect.Method[] r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.b.a(java.lang.Class, java.lang.reflect.Method[]):androidx.lifecycle.b$a");
    }

    public a b(Class<?> cls) {
        a aVar = this.f2359a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public final void c(Map<C0030b, Lifecycle.Event> map, C0030b c0030b, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(c0030b);
        if (event2 != null && event != event2) {
            Method method = c0030b.f2364b;
            StringBuilder m10 = a1.a.m("Method ");
            m10.append(method.getName());
            m10.append(" in ");
            m10.append(cls.getName());
            m10.append(" already declared with different @OnLifecycleEvent value: previous value ");
            m10.append(event2);
            m10.append(", new value ");
            m10.append(event);
            throw new IllegalArgumentException(m10.toString());
        }
        if (event2 == null) {
            map.put(c0030b, event);
        }
    }
}
