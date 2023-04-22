package qc;

import java.util.concurrent.TimeUnit;
import nc.f;

/* loaded from: classes2.dex */
public class a {
    public static final long d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    public static final long f14492e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    public final f f14493a = f.c();

    /* renamed from: b  reason: collision with root package name */
    public long f14494b;

    /* renamed from: c  reason: collision with root package name */
    public int f14495c;

    public synchronized boolean a() {
        boolean z10;
        if (this.f14495c != 0) {
            if (this.f14493a.a() <= this.f14494b) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e A[Catch: all -> 0x008a, TryCatch #2 {, blocks: (B:18:0x0025, B:20:0x0028, B:26:0x002e, B:27:0x0033, B:38:0x004a, B:48:0x007c, B:46:0x007a, B:19:0x0026, B:36:0x0047, B:43:0x0051), top: B:57:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void b(int r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            r6 = 200(0xc8, float:2.8E-43)
            r0 = r6
            r1 = 0
            r6 = 1
            r2 = r6
            if (r10 < r0) goto L10
            r8 = 6
            r6 = 300(0x12c, float:4.2E-43)
            r0 = r6
            if (r10 < r0) goto L1f
            r8 = 7
        L10:
            r6 = 401(0x191, float:5.62E-43)
            r0 = r6
            if (r10 == r0) goto L1f
            r8 = 6
            r0 = 404(0x194, float:5.66E-43)
            if (r10 != r0) goto L1c
            r7 = 4
            goto L20
        L1c:
            r0 = 0
            r8 = 3
            goto L22
        L1f:
            r8 = 3
        L20:
            r6 = 1
            r0 = r6
        L22:
            if (r0 == 0) goto L2e
            r8 = 4
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L8a
            r9.f14495c = r1     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r9)
            return
        L2b:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8a
            throw r10     // Catch: java.lang.Throwable -> L8a
        L2e:
            int r0 = r9.f14495c     // Catch: java.lang.Throwable -> L8a
            int r0 = r0 + r2
            r9.f14495c = r0     // Catch: java.lang.Throwable -> L8a
            monitor-enter(r9)     // Catch: java.lang.Throwable -> L8a
            r0 = 429(0x1ad, float:6.01E-43)
            r7 = 2
            if (r10 == r0) goto L42
            r6 = 500(0x1f4, float:7.0E-43)
            r0 = r6
            if (r10 < r0) goto L45
            r0 = 600(0x258, float:8.41E-43)
            if (r10 >= r0) goto L45
        L42:
            r7 = 3
            r6 = 1
            r1 = r6
        L45:
            if (r1 != 0) goto L4e
            long r0 = qc.a.d     // Catch: java.lang.Throwable -> L4c
            r7 = 5
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8a
            goto L7c
        L4c:
            r10 = move-exception
            goto L88
        L4e:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = 2
            r7 = 5
            int r10 = r9.f14495c     // Catch: java.lang.Throwable -> L4c
            double r2 = (double) r10     // Catch: java.lang.Throwable -> L4c
            r7 = 1
            double r0 = java.lang.Math.pow(r0, r2)     // Catch: java.lang.Throwable -> L4c
            nc.f r10 = r9.f14493a     // Catch: java.lang.Throwable -> L4c
            java.util.Objects.requireNonNull(r10)     // Catch: java.lang.Throwable -> L4c
            double r2 = java.lang.Math.random()     // Catch: java.lang.Throwable -> L4c
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            r8 = 3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L4c
            r7 = 2
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L4c
            double r0 = r0 + r2
            r8 = 3
            long r2 = qc.a.f14492e     // Catch: java.lang.Throwable -> L4c
            double r2 = (double) r2     // Catch: java.lang.Throwable -> L4c
            double r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L4c
            long r0 = (long) r0
            r8 = 4
            r7 = 6
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8a
            r7 = 4
        L7c:
            nc.f r10 = r9.f14493a     // Catch: java.lang.Throwable -> L8a
            long r2 = r10.a()     // Catch: java.lang.Throwable -> L8a
            long r2 = r2 + r0
            r7 = 3
            r9.f14494b = r2     // Catch: java.lang.Throwable -> L8a
            monitor-exit(r9)
            return
        L88:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8a
            throw r10     // Catch: java.lang.Throwable -> L8a
        L8a:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
            r8 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.a.b(int):void");
    }
}
