package kotlinx.coroutines.scheduling;

import a0.b;
import b7.k;
import com.appsflyer.oaid.BuildConfig;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import oe.c;
import oe.e;
import oe.f;
import oe.g;
import oe.h;
import oe.i;
import oe.j;
import vb.y;

/* loaded from: classes3.dex */
public final class CoroutineScheduler implements Executor, Closeable {
    @JvmField
    public static final y A = new y("NOT_IN_STACK");

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f12124w = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater y = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12125z = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    private volatile /* synthetic */ int _isTerminated;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public final int f12126c;
    public volatile /* synthetic */ long controlState;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public final int f12127f;
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public final long f12128j;
    @JvmField

    /* renamed from: m  reason: collision with root package name */
    public final String f12129m;
    @JvmField
    public final c n;
    private volatile /* synthetic */ long parkedWorkersStack;
    @JvmField

    /* renamed from: t  reason: collision with root package name */
    public final c f12130t;
    @JvmField

    /* renamed from: u  reason: collision with root package name */
    public final AtomicReferenceArray<a> f12131u;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", BuildConfig.FLAVOR, "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static WorkerState[] valuesCustom() {
            WorkerState[] valuesCustom = values();
            return (WorkerState[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* loaded from: classes3.dex */
    public final class a extends Thread {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f12137w = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");
        @JvmField

        /* renamed from: c  reason: collision with root package name */
        public final j f12138c;
        @JvmField

        /* renamed from: f  reason: collision with root package name */
        public WorkerState f12139f;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public long f12140j;

        /* renamed from: m  reason: collision with root package name */
        public long f12141m;
        public int n;
        private volatile Object nextParkedWorker;
        @JvmField

        /* renamed from: t  reason: collision with root package name */
        public boolean f12142t;
        public volatile /* synthetic */ int workerCtl;

        public a(int i10) {
            CoroutineScheduler.this = CoroutineScheduler.this;
            setDaemon(true);
            this.f12138c = new j();
            this.f12139f = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.A;
            this.n = Random.Default.nextInt();
            f(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final oe.f a(boolean r11) {
            /*
                r10 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r10.f12139f
                r2 = 1
                r3 = 0
                if (r1 != r0) goto L9
                goto L30
            L9:
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            Lb:
                long r6 = r1.controlState
                r4 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r4 = r4 & r6
                r8 = 42
                long r4 = r4 >> r8
                int r5 = (int) r4
                if (r5 != 0) goto L1b
                r1 = 0
                goto L2c
            L1b:
                r4 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r8 = r6 - r4
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.y
                r5 = r1
                boolean r4 = r4.compareAndSet(r5, r6, r8)
                if (r4 == 0) goto Lb
                r1 = 1
            L2c:
                if (r1 == 0) goto L32
                r10.f12139f = r0
            L30:
                r0 = 1
                goto L33
            L32:
                r0 = 0
            L33:
                if (r0 == 0) goto L69
                if (r11 == 0) goto L5e
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                int r11 = r11.f12126c
                int r11 = r11 * 2
                int r11 = r10.d(r11)
                if (r11 != 0) goto L44
                goto L45
            L44:
                r2 = 0
            L45:
                if (r2 == 0) goto L4d
                oe.f r11 = r10.e()
                if (r11 != 0) goto L68
            L4d:
                oe.j r11 = r10.f12138c
                oe.f r11 = r11.e()
                if (r11 != 0) goto L68
                if (r2 != 0) goto L64
                oe.f r11 = r10.e()
                if (r11 != 0) goto L68
                goto L64
            L5e:
                oe.f r11 = r10.e()
                if (r11 != 0) goto L68
            L64:
                oe.f r11 = r10.i(r3)
            L68:
                return r11
            L69:
                if (r11 == 0) goto L7e
                oe.j r11 = r10.f12138c
                oe.f r11 = r11.e()
                if (r11 != 0) goto L88
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                oe.c r11 = r11.f12130t
                java.lang.Object r11 = r11.d()
                oe.f r11 = (oe.f) r11
                goto L88
            L7e:
                kotlinx.coroutines.scheduling.CoroutineScheduler r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                oe.c r11 = r11.f12130t
                java.lang.Object r11 = r11.d()
                oe.f r11 = (oe.f) r11
            L88:
                if (r11 != 0) goto L8e
                oe.f r11 = r10.i(r2)
            L8e:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.a.a(boolean):oe.f");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.n;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.n = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & IntCompanionObject.MAX_VALUE) % i10;
        }

        public final f e() {
            if (d(2) == 0) {
                f d = CoroutineScheduler.this.n.d();
                return d == null ? CoroutineScheduler.this.f12130t.d() : d;
            }
            f d10 = CoroutineScheduler.this.f12130t.d();
            return d10 == null ? CoroutineScheduler.this.n.d() : d10;
        }

        public final void f(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f12129m);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            WorkerState workerState2 = this.f12139f;
            boolean z10 = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z10) {
                CoroutineScheduler.y.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f12139f = workerState;
            }
            return z10;
        }

        public final f i(boolean z10) {
            long h10;
            int i10 = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int d = d(i10);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j10 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < i10; i11++) {
                d++;
                if (d > i10) {
                    d = 1;
                }
                a aVar = coroutineScheduler.f12131u.get(d);
                if (aVar != null && aVar != this) {
                    if (z10) {
                        h10 = this.f12138c.g(aVar.f12138c);
                    } else {
                        j jVar = this.f12138c;
                        j jVar2 = aVar.f12138c;
                        Objects.requireNonNull(jVar);
                        f f10 = jVar2.f();
                        if (f10 != null) {
                            jVar.a(f10, false);
                            h10 = -1;
                        } else {
                            h10 = jVar.h(jVar2, false);
                        }
                    }
                    if (h10 == -1) {
                        return this.f12138c.e();
                    }
                    if (h10 > 0) {
                        j10 = Math.min(j10, h10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f12141m = j10;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            WorkerState workerState = WorkerState.PARKING;
            WorkerState workerState2 = WorkerState.TERMINATED;
            loop0: while (true) {
                boolean z10 = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f12139f != workerState2) {
                    f a10 = a(this.f12142t);
                    if (a10 != null) {
                        this.f12141m = 0L;
                        WorkerState workerState3 = WorkerState.BLOCKING;
                        int f10 = a10.f13651f.f();
                        this.f12140j = 0L;
                        if (this.f12139f == workerState) {
                            this.f12139f = workerState3;
                        }
                        if (f10 != 0 && h(workerState3)) {
                            CoroutineScheduler.this.m();
                        }
                        CoroutineScheduler.this.k(a10);
                        if (f10 != 0) {
                            CoroutineScheduler.y.addAndGet(CoroutineScheduler.this, -2097152L);
                            if (this.f12139f != workerState2) {
                                this.f12139f = WorkerState.DORMANT;
                            }
                        }
                    } else {
                        this.f12142t = false;
                        if (this.f12141m == 0) {
                            if (this.nextParkedWorker != CoroutineScheduler.A) {
                                this.workerCtl = -1;
                                while (true) {
                                    if ((this.nextParkedWorker != CoroutineScheduler.A) && this.workerCtl == -1 && !CoroutineScheduler.this.isTerminated() && this.f12139f != workerState2) {
                                        h(workerState);
                                        Thread.interrupted();
                                        if (this.f12140j == 0) {
                                            this.f12140j = System.nanoTime() + CoroutineScheduler.this.f12128j;
                                        }
                                        LockSupport.parkNanos(CoroutineScheduler.this.f12128j);
                                        if (System.nanoTime() - this.f12140j >= 0) {
                                            this.f12140j = 0L;
                                            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                                            synchronized (coroutineScheduler.f12131u) {
                                                if (!coroutineScheduler.isTerminated()) {
                                                    if (((int) (coroutineScheduler.controlState & 2097151)) > coroutineScheduler.f12126c) {
                                                        if (f12137w.compareAndSet(this, -1, 1)) {
                                                            int i10 = this.indexInArray;
                                                            f(0);
                                                            coroutineScheduler.i(this, i10, 0);
                                                            int andDecrement = (int) (CoroutineScheduler.y.getAndDecrement(coroutineScheduler) & 2097151);
                                                            if (andDecrement != i10) {
                                                                a aVar = coroutineScheduler.f12131u.get(andDecrement);
                                                                Intrinsics.checkNotNull(aVar);
                                                                coroutineScheduler.f12131u.set(i10, aVar);
                                                                aVar.f(i10);
                                                                coroutineScheduler.i(aVar, andDecrement, i10);
                                                            }
                                                            coroutineScheduler.f12131u.set(andDecrement, null);
                                                            Unit unit = Unit.INSTANCE;
                                                            this.f12139f = workerState2;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                CoroutineScheduler.this.h(this);
                            }
                        } else if (z10) {
                            h(workerState);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f12141m);
                            this.f12141m = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
            }
            h(workerState2);
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        this.f12126c = i10;
        this.f12127f = i11;
        this.f12128j = j10;
        this.f12129m = str;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(a0.a.k("Core pool size ", i10, " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(a0.a.k("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.n = new c();
        this.f12130t = new c();
        this.parkedWorkersStack = 0L;
        this.f12131u = new AtomicReferenceArray<>(i11 + 1);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    public final int a() {
        synchronized (this.f12131u) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j10 = this.controlState;
            int i10 = (int) (j10 & 2097151);
            int coerceAtLeast = RangesKt.coerceAtLeast(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (coerceAtLeast >= this.f12126c) {
                return 0;
            }
            if (i10 >= this.f12127f) {
                return 0;
            }
            int i11 = ((int) (this.controlState & 2097151)) + 1;
            if (i11 > 0 && this.f12131u.get(i11) == null) {
                a aVar = new a(i11);
                this.f12131u.set(i11, aVar);
                if (i11 == ((int) (2097151 & y.incrementAndGet(this)))) {
                    aVar.start();
                    return coerceAtLeast + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final f c(Runnable runnable, g gVar) {
        Objects.requireNonNull((e) i.f13656e);
        long nanoTime = System.nanoTime();
        if (runnable instanceof f) {
            f fVar = (f) runnable;
            fVar.f13650c = nanoTime;
            fVar.f13651f = gVar;
            return fVar;
        }
        return new h(runnable, nanoTime, gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0064 A[LOOP:0: B:13:0x001f->B:30:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066 A[EDGE_INSN: B:51:0x0066->B:31:0x0066 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f12125z
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lc
            goto L9c
        Lc:
            kotlinx.coroutines.scheduling.CoroutineScheduler$a r0 = r10.d()
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.CoroutineScheduler$a> r3 = r10.f12131u
            monitor-enter(r3)
            long r4 = r10.controlState     // Catch: java.lang.Throwable -> La1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            r4 = 0
            if (r2 > r5) goto L66
            r3 = 1
        L1f:
            int r6 = r3 + 1
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.CoroutineScheduler$a> r7 = r10.f12131u
            java.lang.Object r7 = r7.get(r3)
            kotlinx.coroutines.scheduling.CoroutineScheduler$a r7 = (kotlinx.coroutines.scheduling.CoroutineScheduler.a) r7
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            if (r7 == r0) goto L61
        L2e:
            boolean r8 = r7.isAlive()
            if (r8 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r7)
            r8 = 10000(0x2710, double:4.9407E-320)
            r7.join(r8)
            goto L2e
        L3d:
            oe.j r7 = r7.f12138c
            oe.c r8 = r10.f12130t
            java.util.Objects.requireNonNull(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = oe.j.f13657b
            java.lang.Object r9 = r9.getAndSet(r7, r4)
            oe.f r9 = (oe.f) r9
            if (r9 != 0) goto L4f
            goto L52
        L4f:
            r8.a(r9)
        L52:
            oe.f r9 = r7.f()
            if (r9 != 0) goto L5a
            r9 = 0
            goto L5e
        L5a:
            r8.a(r9)
            r9 = 1
        L5e:
            if (r9 == 0) goto L61
            goto L52
        L61:
            if (r3 != r5) goto L64
            goto L66
        L64:
            r3 = r6
            goto L1f
        L66:
            oe.c r1 = r10.f12130t
            r1.b()
            oe.c r1 = r10.n
            r1.b()
        L70:
            if (r0 != 0) goto L74
            r1 = r4
            goto L78
        L74:
            oe.f r1 = r0.a(r2)
        L78:
            if (r1 != 0) goto L82
            oe.c r1 = r10.n
            java.lang.Object r1 = r1.d()
            oe.f r1 = (oe.f) r1
        L82:
            if (r1 != 0) goto L9d
            oe.c r1 = r10.f12130t
            java.lang.Object r1 = r1.d()
            oe.f r1 = (oe.f) r1
            if (r1 != 0) goto L9d
            if (r0 != 0) goto L91
            goto L96
        L91:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.h(r1)
        L96:
            r0 = 0
            r10.parkedWorkersStack = r0
            r10.controlState = r0
        L9c:
            return
        L9d:
            r10.k(r1)
            goto L70
        La1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.close():void");
    }

    public final a d() {
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
        if (aVar != null && Intrinsics.areEqual(CoroutineScheduler.this, this)) {
            return aVar;
        }
        return null;
    }

    public final void e(Runnable runnable, g gVar, boolean z10) {
        f a10;
        f c10 = c(runnable, gVar);
        a d = d();
        boolean z11 = true;
        if (d == null || d.f12139f == WorkerState.TERMINATED || (c10.f13651f.f() == 0 && d.f12139f == WorkerState.BLOCKING)) {
            a10 = c10;
        } else {
            d.f12142t = true;
            a10 = d.f12138c.a(c10, z10);
        }
        if (a10 != null) {
            if (!(a10.f13651f.f() == 1 ? this.f12130t.a(a10) : this.n.a(a10))) {
                throw new RejectedExecutionException(Intrinsics.stringPlus(this.f12129m, " was terminated"));
            }
        }
        z11 = (!z10 || d == null) ? false : false;
        if (c10.f13651f.f() == 0) {
            if (z11) {
                return;
            }
            m();
            return;
        }
        long addAndGet = y.addAndGet(this, 2097152L);
        if (z11 || s() || n(addAndGet)) {
            return;
        }
        s();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        e(runnable, k.Z, false);
    }

    public final int f(a aVar) {
        Object c10 = aVar.c();
        while (c10 != A) {
            if (c10 == null) {
                return 0;
            }
            a aVar2 = (a) c10;
            int b10 = aVar2.b();
            if (b10 != 0) {
                return b10;
            }
            c10 = aVar2.c();
        }
        return -1;
    }

    public final boolean h(a aVar) {
        long j10;
        int b10;
        if (aVar.c() != A) {
            return false;
        }
        do {
            j10 = this.parkedWorkersStack;
            b10 = aVar.b();
            aVar.g(this.f12131u.get((int) (2097151 & j10)));
        } while (!f12124w.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | b10));
        return true;
    }

    public final void i(a aVar, int i10, int i11) {
        while (true) {
            long j10 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? f(aVar) : i11;
            }
            if (i12 >= 0 && f12124w.compareAndSet(this, j10, j11 | i12)) {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void k(f fVar) {
        try {
            fVar.run();
        } finally {
        }
    }

    public final void m() {
        if (s() || n(this.controlState)) {
            return;
        }
        s();
    }

    public final boolean n(long j10) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f12126c) {
            int a10 = a();
            if (a10 == 1 && this.f12126c > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        while (true) {
            long j10 = this.parkedWorkersStack;
            a aVar = this.f12131u.get((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                int f10 = f(aVar);
                if (f10 >= 0 && f12124w.compareAndSet(this, j10, f10 | j11)) {
                    aVar.g(A);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f12137w.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public String toString() {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        int length = this.f12131u.length();
        int i14 = 0;
        if (1 < length) {
            i11 = 0;
            int i15 = 0;
            i12 = 0;
            i13 = 0;
            int i16 = 1;
            while (true) {
                int i17 = i16 + 1;
                a aVar = this.f12131u.get(i16);
                if (aVar != null) {
                    int d = aVar.f12138c.d();
                    int ordinal = aVar.f12139f.ordinal();
                    if (ordinal == 0) {
                        i15++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(d);
                        sb2.append('c');
                        arrayList.add(sb2.toString());
                    } else if (ordinal == 1) {
                        i11++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(d);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    } else if (ordinal == 2) {
                        i14++;
                    } else if (ordinal == 3) {
                        i12++;
                        if (d > 0) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(d);
                            sb4.append('d');
                            arrayList.add(sb4.toString());
                        }
                    } else if (ordinal == 4) {
                        i13++;
                    }
                }
                if (i17 >= length) {
                    break;
                }
                i16 = i17;
            }
            i10 = i14;
            i14 = i15;
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        long j10 = this.controlState;
        return this.f12129m + '@' + b.B(this) + "[Pool Size {core = " + this.f12126c + ", max = " + this.f12127f + "}, Worker States {CPU = " + i14 + ", blocking = " + i11 + ", parked = " + i10 + ", dormant = " + i12 + ", terminated = " + i13 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.n.c() + ", global blocking queue size = " + this.f12130t.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f12126c - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }
}
