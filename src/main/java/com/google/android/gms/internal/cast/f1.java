package com.google.android.gms.internal.cast;

import com.app.pornhub.domain.config.DvdsConfig;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class f1<V> extends jd.e implements lb.a<V> {

    /* renamed from: m  reason: collision with root package name */
    public static final boolean f6898m;
    public static final Logger n;

    /* renamed from: t  reason: collision with root package name */
    public static final w0 f6899t;

    /* renamed from: u  reason: collision with root package name */
    public static final Object f6900u;

    /* renamed from: c  reason: collision with root package name */
    public volatile Object f6901c;

    /* renamed from: f  reason: collision with root package name */
    public volatile y0 f6902f;

    /* renamed from: j  reason: collision with root package name */
    public volatile e1 f6903j;

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        w0 b1Var;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f6898m = z10;
        n = Logger.getLogger(f1.class.getName());
        try {
            b1Var = new d1();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th = null;
                th2 = th3;
                b1Var = new z0(AtomicReferenceFieldUpdater.newUpdater(e1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(e1.class, e1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(f1.class, e1.class, "j"), AtomicReferenceFieldUpdater.newUpdater(f1.class, y0.class, "f"), AtomicReferenceFieldUpdater.newUpdater(f1.class, Object.class, DvdsConfig.TYPE_CATEGORY));
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                b1Var = new b1();
            }
        }
        f6899t = b1Var;
        if (th != null) {
            Logger logger = n;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f6900u = new Object();
    }

    public static <V> V i(Future<V> future) {
        boolean z10;
        V v2;
        boolean z11 = false;
        while (true) {
            try {
                z10 = z11;
                v2 = (V) ((f1) future).get();
                break;
            } catch (InterruptedException unused) {
                z11 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v2;
    }

    public static void k(f1<?> f1Var) {
        e1 e1Var;
        y0 y0Var;
        do {
            e1Var = f1Var.f6903j;
        } while (!f6899t.e(f1Var, e1Var, e1.f6895c));
        while (e1Var != null) {
            Thread thread = e1Var.f6896a;
            if (thread != null) {
                e1Var.f6896a = null;
                LockSupport.unpark(thread);
            }
            e1Var = e1Var.f6897b;
        }
        do {
            y0Var = f1Var.f6902f;
        } while (!f6899t.c(f1Var, y0Var, y0.d));
        y0 y0Var2 = null;
        while (y0Var != null) {
            y0 y0Var3 = y0Var.f6913c;
            y0Var.f6913c = y0Var2;
            y0Var2 = y0Var;
            y0Var = y0Var3;
        }
        while (y0Var2 != null) {
            y0 y0Var4 = y0Var2.f6913c;
            Runnable runnable = y0Var2.f6911a;
            Objects.requireNonNull(runnable);
            if (runnable instanceof a1) {
                a1 a1Var = (a1) runnable;
                throw null;
            }
            Executor executor = y0Var2.f6912b;
            Objects.requireNonNull(executor);
            l(runnable, executor);
            y0Var2 = y0Var4;
        }
    }

    public static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = n;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", sb2.toString(), (Throwable) e10);
        }
    }

    public static final V n(Object obj) {
        if (obj instanceof x0) {
            Throwable th = ((x0) obj).f6910b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof zznn$zzc) {
            throw new ExecutionException(((zznn$zzc) obj).f6956a);
        } else {
            if (obj == f6900u) {
                obj = (V) null;
            }
            return (V) obj;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if ((r0 instanceof com.google.android.gms.internal.cast.a1) == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0032 -> B:16:0x0033). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean cancel(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f6901c
            r7 = 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r6 = 1
            r3 = r6
            goto Ld
        La:
            r7 = 7
            r6 = 0
            r3 = r6
        Ld:
            boolean r4 = r0 instanceof com.google.android.gms.internal.cast.a1
            r3 = r3 | r4
            if (r3 == 0) goto L57
            r7 = 2
            boolean r3 = com.google.android.gms.internal.cast.f1.f6898m
            if (r3 == 0) goto L27
            r7 = 5
            com.google.android.gms.internal.cast.x0 r3 = new com.google.android.gms.internal.cast.x0
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            r7 = 1
            java.lang.String r5 = "Future.cancel() was called."
            r7 = 7
            r4.<init>(r5)
            r3.<init>(r9, r4)
            goto L33
        L27:
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.cast.x0 r9 = com.google.android.gms.internal.cast.x0.f6908c
            goto L2e
        L2c:
            com.google.android.gms.internal.cast.x0 r9 = com.google.android.gms.internal.cast.x0.d
        L2e:
            r3 = r9
            java.util.Objects.requireNonNull(r3)
        L32:
            r7 = 1
        L33:
            com.google.android.gms.internal.cast.w0 r9 = com.google.android.gms.internal.cast.f1.f6899t
            boolean r6 = r9.d(r8, r0, r3)
            r9 = r6
            if (r9 == 0) goto L4f
            k(r8)
            r7 = 7
            boolean r9 = r0 instanceof com.google.android.gms.internal.cast.a1
            r7 = 1
            if (r9 != 0) goto L47
            r7 = 1
            goto L5a
        L47:
            com.google.android.gms.internal.cast.a1 r0 = (com.google.android.gms.internal.cast.a1) r0
            r7 = 5
            java.util.Objects.requireNonNull(r0)
            r9 = 0
            throw r9
        L4f:
            r7 = 2
            java.lang.Object r0 = r8.f6901c
            boolean r9 = r0 instanceof com.google.android.gms.internal.cast.a1
            r7 = 2
            if (r9 != 0) goto L32
        L57:
            r7 = 3
            r1 = 0
            r7 = 7
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.f1.cancel(boolean):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.util.concurrent.Future
    public final V get() {
        /*
            r9 = this;
            r6 = r9
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L74
            r8 = 1
            java.lang.Object r0 = r6.f6901c
            r1 = 0
            r8 = 5
            r2 = 1
            r8 = 6
            if (r0 == 0) goto L13
            r8 = 1
            r3 = r8
            goto L14
        L13:
            r3 = 0
        L14:
            boolean r4 = r0 instanceof com.google.android.gms.internal.cast.a1
            r4 = r4 ^ r2
            r8 = 6
            r3 = r3 & r4
            if (r3 == 0) goto L22
            r8 = 7
            java.lang.Object r8 = n(r0)
            r0 = r8
            return r0
        L22:
            com.google.android.gms.internal.cast.e1 r0 = r6.f6903j
            com.google.android.gms.internal.cast.e1 r3 = com.google.android.gms.internal.cast.e1.f6895c
            if (r0 == r3) goto L69
            com.google.android.gms.internal.cast.e1 r3 = new com.google.android.gms.internal.cast.e1
            r3.<init>()
        L2d:
            com.google.android.gms.internal.cast.w0 r4 = com.google.android.gms.internal.cast.f1.f6899t
            r8 = 5
            r4.a(r3, r0)
            boolean r0 = r4.e(r6, r0, r3)
            if (r0 == 0) goto L63
            r8 = 4
        L3a:
            java.util.concurrent.locks.LockSupport.park(r6)
            r8 = 6
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L58
            java.lang.Object r0 = r6.f6901c
            if (r0 == 0) goto L4b
            r4 = 1
            r8 = 6
            goto L4d
        L4b:
            r8 = 0
            r4 = r8
        L4d:
            boolean r5 = r0 instanceof com.google.android.gms.internal.cast.a1
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L3a
            java.lang.Object r0 = n(r0)
            return r0
        L58:
            r8 = 6
            r6.m(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
            r8 = 2
        L63:
            com.google.android.gms.internal.cast.e1 r0 = r6.f6903j
            com.google.android.gms.internal.cast.e1 r4 = com.google.android.gms.internal.cast.e1.f6895c
            if (r0 != r4) goto L2d
        L69:
            r8 = 7
            java.lang.Object r0 = r6.f6901c
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = n(r0)
            return r0
        L74:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
            r8 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.f1.get():java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final V get(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f6901c;
        if ((obj != null) && (!(obj instanceof a1))) {
            return (V) n(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            e1 e1Var = this.f6903j;
            if (e1Var == e1.f6895c) {
                Object obj2 = this.f6901c;
                Objects.requireNonNull(obj2);
                return (V) n(obj2);
            }
            e1 e1Var2 = new e1();
            do {
                w0 w0Var = f6899t;
                w0Var.a(e1Var2, e1Var);
                if (w0Var.e(this, e1Var, e1Var2)) {
                    do {
                        LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                        if (Thread.interrupted()) {
                            m(e1Var2);
                            throw new InterruptedException();
                        }
                        Object obj3 = this.f6901c;
                        if ((obj3 != null) && (!(obj3 instanceof a1))) {
                            return (V) n(obj3);
                        }
                        nanos = nanoTime - System.nanoTime();
                    } while (nanos >= 1000);
                    m(e1Var2);
                } else {
                    e1Var = this.f6903j;
                }
            } while (e1Var != e1.f6895c);
            Object obj22 = this.f6901c;
            Objects.requireNonNull(obj22);
            return (V) n(obj22);
        }
        while (nanos > 0) {
            Object obj4 = this.f6901c;
            if ((obj4 != null) && (!(obj4 instanceof a1))) {
                return (V) n(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String f1Var = toString();
        String timeUnit2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = timeUnit2.toLowerCase(locale);
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb2.append("Waited ");
        sb2.append(j10);
        sb2.append(" ");
        sb2.append(lowerCase2);
        String sb3 = sb2.toString();
        if (nanos + 1000 < 0) {
            String concat = sb3.concat(" (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            int i10 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
            boolean z10 = i10 == 0 || nanos2 > 1000;
            if (i10 > 0) {
                String valueOf = String.valueOf(concat);
                StringBuilder sb4 = new StringBuilder(valueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb4.append(valueOf);
                sb4.append(convert);
                sb4.append(" ");
                sb4.append(lowerCase);
                String sb5 = sb4.toString();
                if (z10) {
                    sb5 = sb5.concat(",");
                }
                concat = String.valueOf(sb5).concat(" ");
            }
            if (z10) {
                String valueOf2 = String.valueOf(concat);
                StringBuilder sb6 = new StringBuilder(valueOf2.length() + 33);
                sb6.append(valueOf2);
                sb6.append(nanos2);
                sb6.append(" nanoseconds ");
                concat = sb6.toString();
            }
            sb3 = String.valueOf(concat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(sb3).concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(android.support.v4.media.b.n(new StringBuilder(f1Var.length() + String.valueOf(sb3).length() + 5), sb3, " for ", f1Var));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6901c instanceof x0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f6901c;
        return (!(obj instanceof a1)) & (obj != null);
    }

    public final void j(StringBuilder sb2) {
        try {
            Object i10 = i(this);
            sb2.append("SUCCESS, result=[");
            if (i10 == null) {
                sb2.append("null");
            } else if (i10 == this) {
                sb2.append("this future");
            } else {
                sb2.append(i10.getClass().getName());
                sb2.append("@");
                sb2.append(Integer.toHexString(System.identityHashCode(i10)));
            }
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e10.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e11.getCause());
            sb2.append("]");
        }
    }

    public final void m(e1 e1Var) {
        e1Var.f6896a = null;
        while (true) {
            e1 e1Var2 = this.f6903j;
            if (e1Var2 != e1.f6895c) {
                e1 e1Var3 = null;
                while (e1Var2 != null) {
                    e1 e1Var4 = e1Var2.f6897b;
                    if (e1Var2.f6896a == null) {
                        if (e1Var3 == null) {
                            if (!f6899t.e(this, e1Var2, e1Var4)) {
                                break;
                            }
                        } else {
                            e1Var3.f6897b = e1Var4;
                            if (e1Var3.f6896a == null) {
                                break;
                            }
                        }
                    } else {
                        e1Var3 = e1Var2;
                    }
                    e1Var2 = e1Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.f1.toString():java.lang.String");
    }
}
