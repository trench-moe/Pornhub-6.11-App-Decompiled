package a9;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static final b f303f = new b("RequestTracker");

    /* renamed from: g  reason: collision with root package name */
    public static final Object f304g = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final long f305a;
    public o d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f308e;

    /* renamed from: c  reason: collision with root package name */
    public long f307c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f306b = new t9.x(Looper.getMainLooper());

    public q(long j10) {
        this.f305a = j10;
    }

    public final void a(long j10, o oVar) {
        o oVar2;
        long j11;
        Object obj = f304g;
        synchronized (obj) {
            oVar2 = this.d;
            j11 = this.f307c;
            this.f307c = j10;
            this.d = oVar;
        }
        if (oVar2 != null) {
            oVar2.a(j11);
        }
        synchronized (obj) {
            Runnable runnable = this.f308e;
            if (runnable != null) {
                this.f306b.removeCallbacks(runnable);
            }
            p pVar = new p(this, 0);
            this.f308e = pVar;
            this.f306b.postDelayed(pVar, this.f305a);
        }
    }

    public final boolean b(long j10, int i10, Object obj) {
        synchronized (f304g) {
            long j11 = this.f307c;
            if (j11 == -1 || j11 != j10) {
                return false;
            }
            e(i10, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j10)));
            return true;
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (f304g) {
            z10 = this.f307c != -1;
        }
        return z10;
    }

    public final boolean d(long j10) {
        boolean z10;
        synchronized (f304g) {
            long j11 = this.f307c;
            z10 = false;
            if (j11 != -1 && j11 == j10) {
                z10 = true;
            }
        }
        return z10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void e(int r8, java.lang.Object r9, java.lang.String r10) {
        /*
            r7 = this;
            a9.b r0 = a9.q.f303f
            r4 = 6
            r3 = 0
            r1 = r3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r10, r1)
            r6 = 4
            java.lang.Object r10 = a9.q.f304g
            r4 = 3
            monitor-enter(r10)
            r4 = 2
            a9.o r0 = r7.d     // Catch: java.lang.Throwable -> L42
            r6 = 3
            if (r0 == 0) goto L1b
            long r1 = r7.f307c     // Catch: java.lang.Throwable -> L42
            r6 = 3
            r0.b(r1, r8, r9)     // Catch: java.lang.Throwable -> L42
        L1b:
            r5 = 7
            r8 = -1
            r7.f307c = r8     // Catch: java.lang.Throwable -> L42
            r4 = 2
            r3 = 0
            r8 = r3
            r7.d = r8     // Catch: java.lang.Throwable -> L42
            r6 = 1
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L42
            r5 = 2
            java.lang.Runnable r9 = r7.f308e     // Catch: java.lang.Throwable -> L3e
            if (r9 != 0) goto L2f
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3e
            r4 = 2
            goto L3b
        L2f:
            r4 = 4
            android.os.Handler r0 = r7.f306b     // Catch: java.lang.Throwable -> L3e
            r4 = 3
            r0.removeCallbacks(r9)     // Catch: java.lang.Throwable -> L3e
            r5 = 1
            r7.f308e = r8     // Catch: java.lang.Throwable -> L3e
            r6 = 5
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3e
        L3b:
            r5 = 7
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L42
            return
        L3e:
            r8 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L3e
            throw r8     // Catch: java.lang.Throwable -> L42
            r4 = 4
        L42:
            r8 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L42
            throw r8
            r4 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.q.e(int, java.lang.Object, java.lang.String):void");
    }

    public final boolean f(int i10, Object obj) {
        synchronized (f304g) {
            long j10 = this.f307c;
            if (j10 != -1) {
                e(i10, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j10)));
                return true;
            }
            return false;
        }
    }
}
