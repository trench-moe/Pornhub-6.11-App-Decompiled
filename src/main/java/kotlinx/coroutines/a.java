package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import k8.b0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class a extends e {

    /* renamed from: f  reason: collision with root package name */
    public static final a f12107f = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final int f12108j;
    private static volatile Executor pool;

    static {
        String str;
        int intValue;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            intValue = -1;
        } else {
            Integer intOrNull = StringsKt.toIntOrNull(str);
            if (intOrNull == null || intOrNull.intValue() < 1) {
                throw new IllegalStateException(Intrinsics.stringPlus("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            intValue = intOrNull.intValue();
        }
        f12108j = intValue;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // kotlinx.coroutines.b
    public void m(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                synchronized (this) {
                    executor = pool;
                    if (executor == null) {
                        executor = t();
                        pool = executor;
                    }
                }
            }
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            c.f12110u.P(runnable);
        }
    }

    public final ExecutorService s() {
        return Executors.newFixedThreadPool(v(), new b0(new AtomicInteger(), 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.concurrent.ExecutorService t() {
        /*
            r7 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = r7.s()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L1b
            java.util.concurrent.ExecutorService r0 = r7.s()
            return r0
        L1b:
            int r2 = kotlinx.coroutines.a.f12108j
            r3 = 1
            r4 = 0
            if (r2 >= 0) goto L6e
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r2 = r1.getMethod(r2, r5)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r2.invoke(r0, r5)     // Catch: java.lang.Throwable -> L36
            boolean r5 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L36
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r2 = r0
        L37:
            if (r2 != 0) goto L3a
            goto L6e
        L3a:
            kotlinx.coroutines.a r5 = kotlinx.coroutines.a.f12107f
            java.util.Objects.requireNonNull(r5)
            le.k r5 = new java.lang.Runnable() { // from class: le.k
                static {
                    /*
                        le.k r0 = new le.k
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:le.k) le.k.c le.k
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: le.k.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: le.k.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r1 = this;
                        kotlinx.coroutines.a r0 = kotlinx.coroutines.a.f12107f
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: le.k.run():void");
                }
            }
            r2.submit(r5)
            java.lang.String r5 = "getPoolSize"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L59
            java.lang.Object r5 = r5.invoke(r2, r6)     // Catch: java.lang.Throwable -> L59
            boolean r6 = r5 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L59
            if (r6 == 0) goto L59
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L59
            goto L5a
        L59:
            r5 = r0
        L5a:
            if (r5 != 0) goto L5d
            goto L65
        L5d:
            int r5 = r5.intValue()
            if (r5 < r3) goto L65
            r5 = 1
            goto L66
        L65:
            r5 = 0
        L66:
            if (r5 == 0) goto L69
            goto L6a
        L69:
            r2 = r0
        L6a:
            if (r2 != 0) goto L6d
            goto L6e
        L6d:
            return r2
        L6e:
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L92
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L92
            r2[r4] = r5     // Catch: java.lang.Throwable -> L92
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L92
            kotlinx.coroutines.a r3 = kotlinx.coroutines.a.f12107f     // Catch: java.lang.Throwable -> L92
            int r3 = r3.v()     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L92
            r2[r4] = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L92
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L93
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L92
            r0 = r1
            goto L93
        L92:
        L93:
            if (r0 != 0) goto L99
            java.util.concurrent.ExecutorService r0 = r7.s()
        L99:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.t():java.util.concurrent.ExecutorService");
    }

    @Override // kotlinx.coroutines.b
    public String toString() {
        return "CommonPool";
    }

    public final int v() {
        Integer valueOf = Integer.valueOf(f12108j);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        return valueOf == null ? RangesKt.coerceAtLeast(Runtime.getRuntime().availableProcessors() - 1, 1) : valueOf.intValue();
    }
}
