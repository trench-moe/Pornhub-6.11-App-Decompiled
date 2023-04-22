package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import le.i0;
import le.p0;
import le.s;
import le.u;
import le.x;
import ne.i;
import ne.o;
import ne.p;
import vb.y;

/* loaded from: classes3.dex */
public abstract class d extends x {
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_queue");

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12112t = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes3.dex */
    public static abstract class a implements Runnable, Comparable<a>, u, p {
        @JvmField

        /* renamed from: c  reason: collision with root package name */
        public long f12113c;

        /* renamed from: f  reason: collision with root package name */
        public Object f12114f;

        /* renamed from: j  reason: collision with root package name */
        public int f12115j;

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            int i10 = ((this.f12113c - aVar.f12113c) > 0L ? 1 : ((this.f12113c - aVar.f12113c) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        @Override // le.u
        public final synchronized void dispose() {
            Object obj = this.f12114f;
            y yVar = i0.f12814g;
            if (obj == yVar) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                synchronized (bVar) {
                    if (h() != null) {
                        bVar.d(getIndex());
                    }
                }
            }
            this.f12114f = yVar;
        }

        @Override // ne.p
        public void g(int i10) {
            this.f12115j = i10;
        }

        @Override // ne.p
        public int getIndex() {
            return this.f12115j;
        }

        @Override // ne.p
        public o<?> h() {
            Object obj = this.f12114f;
            if (obj instanceof o) {
                return (o) obj;
            }
            return null;
        }

        @Override // ne.p
        public void i(o<?> oVar) {
            if (!(this.f12114f != i0.f12814g)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f12114f = oVar;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Delayed[nanos=");
            m10.append(this.f12113c);
            m10.append(']');
            return m10.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends o<a> {
        @JvmField

        /* renamed from: b  reason: collision with root package name */
        public long f12116b;

        public b(long j10) {
            this.f12116b = j10;
        }
    }

    public final void P(Runnable runnable) {
        if (!S(runnable)) {
            c.f12110u.P(runnable);
            return;
        }
        Thread J = J();
        if (Thread.currentThread() != J) {
            LockSupport.unpark(J);
        }
    }

    public final boolean S(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof i) {
                i iVar = (i) obj;
                int a10 = iVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                    i e10 = iVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e10) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == i0.f12815h) {
                return false;
            } else {
                i iVar2 = new i(8, true);
                iVar2.a((Runnable) obj);
                iVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = n;
                while (true) {
                    if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, iVar2)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
    }

    public boolean V() {
        ne.a<s<?>> aVar = this.f12841m;
        if (aVar == null || aVar.f13435b == aVar.f13436c) {
            b bVar = (b) this._delayed;
            if (bVar == null || bVar.c()) {
                Object obj = this._queue;
                if (obj == null) {
                    return true;
                }
                return obj instanceof i ? ((i) obj).d() : obj == i0.f12815h;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0050 A[EDGE_INSN: B:107:0x0050->B:35:0x0050 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long X() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.d.X():long");
    }

    public final void Y() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(long r13, kotlinx.coroutines.d.a r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 2
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L9
            goto L41
        L9:
            java.lang.Object r0 = r12._delayed
            kotlinx.coroutines.d$b r0 = (kotlinx.coroutines.d.b) r0
            if (r0 != 0) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.d.f12112t
            kotlinx.coroutines.d$b r6 = new kotlinx.coroutines.d$b
            r6.<init>(r13)
        L16:
            boolean r0 = r5.compareAndSet(r12, r4, r6)
            if (r0 == 0) goto L1d
            goto L23
        L1d:
            java.lang.Object r0 = r5.get(r12)
            if (r0 == 0) goto L16
        L23:
            java.lang.Object r0 = r12._delayed
            kotlinx.coroutines.d$b r0 = (kotlinx.coroutines.d.b) r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        L2a:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f12114f     // Catch: java.lang.Throwable -> Lb0
            vb.y r6 = le.i0.f12814g     // Catch: java.lang.Throwable -> Lb0
            if (r5 != r6) goto L34
            monitor-exit(r15)
            r0 = 2
            goto L6e
        L34:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lb0
            ne.p r5 = r0.b()     // Catch: java.lang.Throwable -> Lad
            kotlinx.coroutines.d$a r5 = (kotlinx.coroutines.d.a) r5     // Catch: java.lang.Throwable -> Lad
            int r6 = r12._isCompleted     // Catch: java.lang.Throwable -> Lad
            if (r6 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r15)
        L41:
            r0 = 1
            goto L6e
        L43:
            r6 = 0
            if (r5 != 0) goto L4a
            r0.f12116b = r13     // Catch: java.lang.Throwable -> Lad
            goto L5d
        L4a:
            long r8 = r5.f12113c     // Catch: java.lang.Throwable -> Lad
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L53
            r8 = r13
        L53:
            long r10 = r0.f12116b     // Catch: java.lang.Throwable -> Lad
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L5d
            r0.f12116b = r8     // Catch: java.lang.Throwable -> Lad
        L5d:
            long r8 = r15.f12113c     // Catch: java.lang.Throwable -> Lad
            long r10 = r0.f12116b     // Catch: java.lang.Throwable -> Lad
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L68
            r15.f12113c = r10     // Catch: java.lang.Throwable -> Lad
        L68:
            r0.a(r15)     // Catch: java.lang.Throwable -> Lad
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r15)
            r0 = 0
        L6e:
            if (r0 == 0) goto L87
            if (r0 == r3) goto L81
            if (r0 != r1) goto L75
            goto La9
        L75:
            java.lang.String r13 = "unexpected result"
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L81:
            kotlinx.coroutines.c r0 = kotlinx.coroutines.c.f12110u
            r0.Z(r13, r15)
            goto La9
        L87:
            java.lang.Object r13 = r12._delayed
            kotlinx.coroutines.d$b r13 = (kotlinx.coroutines.d.b) r13
            if (r13 != 0) goto L8e
            goto L97
        L8e:
            monitor-enter(r13)
            ne.p r14 = r13.b()     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r13)
            r4 = r14
            kotlinx.coroutines.d$a r4 = (kotlinx.coroutines.d.a) r4
        L97:
            if (r4 != r15) goto L9a
            r2 = 1
        L9a:
            if (r2 == 0) goto La9
            java.lang.Thread r13 = r12.J()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto La9
            java.util.concurrent.locks.LockSupport.unpark(r13)
        La9:
            return
        Laa:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        Lad:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb0
            throw r13     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.d.Z(long, kotlinx.coroutines.d$a):void");
    }

    @Override // kotlinx.coroutines.b
    public final void m(CoroutineContext coroutineContext, Runnable runnable) {
        P(runnable);
    }

    @Override // le.w
    public void shutdown() {
        p0 p0Var = p0.f12827a;
        p0.f12828b.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
                y yVar = i0.f12815h;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, yVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else if (obj instanceof i) {
                ((i) obj).b();
                break;
            } else if (obj == i0.f12815h) {
                break;
            } else {
                i iVar = new i(8, true);
                iVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, iVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (X() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a e10 = bVar == null ? null : bVar.e();
            if (e10 == null) {
                return;
            }
            c.f12110u.Z(nanoTime, e10);
        }
    }
}
