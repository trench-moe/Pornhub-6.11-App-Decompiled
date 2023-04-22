package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.e;
import com.bumptech.glide.load.engine.f;
import e6.a;
import e6.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DecodeJob<R> implements c.a, Runnable, Comparable<DecodeJob<?>>, a.d {
    public j5.f A;
    public int B;
    public int C;
    public j5.d D;
    public h5.d E;
    public a<R> F;
    public int G;
    public Stage H;
    public RunReason I;
    public long J;
    public boolean K;
    public Object L;
    public Thread M;
    public h5.b N;
    public h5.b O;
    public Object P;
    public DataSource Q;
    public com.bumptech.glide.load.data.d<?> R;
    public volatile com.bumptech.glide.load.engine.c S;
    public volatile boolean T;
    public volatile boolean U;
    public boolean V;

    /* renamed from: m  reason: collision with root package name */
    public final d f5712m;
    public final m0.c<DecodeJob<?>> n;

    /* renamed from: w  reason: collision with root package name */
    public com.bumptech.glide.d f5715w;
    public h5.b y;

    /* renamed from: z  reason: collision with root package name */
    public Priority f5716z;

    /* renamed from: c  reason: collision with root package name */
    public final com.bumptech.glide.load.engine.d<R> f5709c = new com.bumptech.glide.load.engine.d<>();

    /* renamed from: f  reason: collision with root package name */
    public final List<Throwable> f5710f = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final e6.d f5711j = new d.b();

    /* renamed from: t  reason: collision with root package name */
    public final c<?> f5713t = new c<>();

    /* renamed from: u  reason: collision with root package name */
    public final e f5714u = new e();

    /* loaded from: classes.dex */
    public enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* loaded from: classes.dex */
    public enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* loaded from: classes.dex */
    public interface a<R> {
    }

    /* loaded from: classes.dex */
    public final class b<Z> implements e.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        public final DataSource f5727a;

        public b(DataSource dataSource) {
            this.f5727a = dataSource;
        }
    }

    /* loaded from: classes.dex */
    public static class c<Z> {

        /* renamed from: a  reason: collision with root package name */
        public h5.b f5729a;

        /* renamed from: b  reason: collision with root package name */
        public h5.f<Z> f5730b;

        /* renamed from: c  reason: collision with root package name */
        public j5.h<Z> f5731c;
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5732a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5733b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5734c;

        public final boolean a(boolean z10) {
            if (!this.f5734c) {
                if (!z10) {
                    if (this.f5733b) {
                    }
                    return false;
                }
            }
            if (this.f5732a) {
                return true;
            }
            return false;
        }
    }

    public DecodeJob(d dVar, m0.c<DecodeJob<?>> cVar) {
        this.f5712m = dVar;
        this.n = cVar;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public void b() {
        this.I = RunReason.SWITCH_TO_SOURCE_SERVICE;
        ((g) this.F).i(this);
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public void c(h5.b bVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource, h5.b bVar2) {
        this.N = bVar;
        this.P = obj;
        this.R = dVar;
        this.Q = dataSource;
        this.O = bVar2;
        boolean z10 = false;
        if (bVar != this.f5709c.a().get(0)) {
            z10 = true;
        }
        this.V = z10;
        if (Thread.currentThread() == this.M) {
            h();
            return;
        }
        this.I = RunReason.DECODE_DATA;
        ((g) this.F).i(this);
    }

    @Override // java.lang.Comparable
    public int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int ordinal = this.f5716z.ordinal() - decodeJob2.f5716z.ordinal();
        if (ordinal == 0) {
            ordinal = this.G - decodeJob2.G;
        }
        return ordinal;
    }

    @Override // com.bumptech.glide.load.engine.c.a
    public void d(h5.b bVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, DataSource dataSource) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.h(bVar, dataSource, dVar.a());
        this.f5710f.add(glideException);
        if (Thread.currentThread() == this.M) {
            o();
            return;
        }
        this.I = RunReason.SWITCH_TO_SOURCE_SERVICE;
        ((g) this.F).i(this);
    }

    @Override // e6.a.d
    public e6.d e() {
        return this.f5711j;
    }

    /* JADX WARN: Finally extract failed */
    public final <Data> j5.i<R> f(com.bumptech.glide.load.data.d<?> dVar, Data data, DataSource dataSource) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            int i10 = d6.h.f8793b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            j5.i<R> g10 = g(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                k("Decoded result " + g10, elapsedRealtimeNanos, null);
            }
            dVar.b();
            return g10;
        } catch (Throwable th) {
            dVar.b();
            throw th;
        }
    }

    public final <Data> j5.i<R> g(Data data, DataSource dataSource) {
        boolean z10;
        Boolean bool;
        i<Data, ?, R> d10 = this.f5709c.d(data.getClass());
        h5.d dVar = this.E;
        if (Build.VERSION.SDK_INT >= 26) {
            if (dataSource != DataSource.RESOURCE_DISK_CACHE && !this.f5709c.f5767r) {
                z10 = false;
                h5.c<Boolean> cVar = com.bumptech.glide.load.resource.bitmap.a.f5862i;
                bool = (Boolean) dVar.c(cVar);
                if (bool != null || (bool.booleanValue() && !z10)) {
                    dVar = new h5.d();
                    dVar.d(this.E);
                    dVar.f10151b.put(cVar, Boolean.valueOf(z10));
                }
            }
            z10 = true;
            h5.c<Boolean> cVar2 = com.bumptech.glide.load.resource.bitmap.a.f5862i;
            bool = (Boolean) dVar.c(cVar2);
            if (bool != null) {
            }
            dVar = new h5.d();
            dVar.d(this.E);
            dVar.f10151b.put(cVar2, Boolean.valueOf(z10));
        }
        h5.d dVar2 = dVar;
        com.bumptech.glide.load.data.e<Data> g10 = this.f5715w.f5642b.g(data);
        try {
            j5.i<R> a10 = d10.a(g10, dVar2, this.B, this.C, new b(dataSource));
            g10.b();
            return a10;
        } catch (Throwable th) {
            g10.b();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void h() {
        j5.h hVar;
        boolean a10;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.J;
            StringBuilder m10 = a1.a.m("data: ");
            m10.append(this.P);
            m10.append(", cache key: ");
            m10.append(this.N);
            m10.append(", fetcher: ");
            m10.append(this.R);
            k("Retrieved data", j10, m10.toString());
        }
        j5.h hVar2 = null;
        try {
            hVar = f(this.R, this.P, this.Q);
        } catch (GlideException e10) {
            e10.g(this.O, this.Q);
            this.f5710f.add(e10);
            hVar = null;
        }
        if (hVar == null) {
            o();
            return;
        }
        DataSource dataSource = this.Q;
        boolean z10 = this.V;
        if (hVar instanceof j5.g) {
            ((j5.g) hVar).a();
        }
        if (this.f5713t.f5731c != null) {
            hVar2 = j5.h.a(hVar);
            hVar = hVar2;
        }
        l(hVar, dataSource, z10);
        this.H = Stage.ENCODE;
        c<?> cVar = this.f5713t;
        if (cVar.f5731c != null) {
            try {
                ((f.c) this.f5712m).a().a(cVar.f5729a, new j5.c(cVar.f5730b, cVar.f5731c, this.E));
                cVar.f5731c.f();
            } catch (Throwable th) {
                cVar.f5731c.f();
                throw th;
            }
        }
        if (hVar2 != null) {
            hVar2.f();
        }
        e eVar = this.f5714u;
        synchronized (eVar) {
            eVar.f5733b = true;
            a10 = eVar.a(false);
        }
        if (a10) {
            n();
        }
    }

    public final com.bumptech.glide.load.engine.c i() {
        int ordinal = this.H.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 5) {
                        return null;
                    }
                    StringBuilder m10 = a1.a.m("Unrecognized stage: ");
                    m10.append(this.H);
                    throw new IllegalStateException(m10.toString());
                }
                return new k(this.f5709c, this);
            }
            return new com.bumptech.glide.load.engine.b(this.f5709c, this);
        }
        return new j(this.f5709c, this);
    }

    public final Stage j(Stage stage) {
        Stage stage2 = Stage.RESOURCE_CACHE;
        Stage stage3 = Stage.DATA_CACHE;
        Stage stage4 = Stage.FINISHED;
        int ordinal = stage.ordinal();
        if (ordinal == 0) {
            return this.D.b() ? stage2 : j(stage2);
        } else if (ordinal == 1) {
            return this.D.a() ? stage3 : j(stage3);
        } else if (ordinal == 2) {
            return this.K ? stage4 : Stage.SOURCE;
        } else if (ordinal == 3 || ordinal == 5) {
            return stage4;
        } else {
            throw new IllegalArgumentException("Unrecognized stage: " + stage);
        }
    }

    public final void k(String str, long j10, String str2) {
        StringBuilder l10 = android.support.v4.media.a.l(str, " in ");
        l10.append(d6.h.a(j10));
        l10.append(", load key: ");
        l10.append(this.A);
        l10.append(str2 != null ? a1.a.l(", ", str2) : BuildConfig.FLAVOR);
        l10.append(", thread: ");
        l10.append(Thread.currentThread().getName());
        Log.v("DecodeJob", l10.toString());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void l(j5.i<R> r12, com.bumptech.glide.load.DataSource r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.l(j5.i, com.bumptech.glide.load.DataSource, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void m() {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.m():void");
    }

    public final void n() {
        e eVar = this.f5714u;
        synchronized (eVar) {
            eVar.f5733b = false;
            eVar.f5732a = false;
            eVar.f5734c = false;
        }
        c<?> cVar = this.f5713t;
        cVar.f5729a = null;
        cVar.f5730b = null;
        cVar.f5731c = null;
        com.bumptech.glide.load.engine.d<R> dVar = this.f5709c;
        dVar.f5754c = null;
        dVar.d = null;
        dVar.n = null;
        dVar.f5757g = null;
        dVar.f5761k = null;
        dVar.f5759i = null;
        dVar.f5764o = null;
        dVar.f5760j = null;
        dVar.f5765p = null;
        dVar.f5752a.clear();
        dVar.f5762l = false;
        dVar.f5753b.clear();
        dVar.f5763m = false;
        this.T = false;
        this.f5715w = null;
        this.y = null;
        this.E = null;
        this.f5716z = null;
        this.A = null;
        this.F = null;
        this.H = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.J = 0L;
        this.U = false;
        this.L = null;
        this.f5710f.clear();
        this.n.a(this);
    }

    public final void o() {
        this.M = Thread.currentThread();
        int i10 = d6.h.f8793b;
        this.J = SystemClock.elapsedRealtimeNanos();
        boolean z10 = false;
        while (!this.U && this.S != null && !(z10 = this.S.a())) {
            this.H = j(this.H);
            this.S = i();
            if (this.H == Stage.SOURCE) {
                this.I = RunReason.SWITCH_TO_SOURCE_SERVICE;
                ((g) this.F).i(this);
                return;
            }
        }
        if (this.H != Stage.FINISHED) {
            if (this.U) {
            }
        }
        if (!z10) {
            m();
        }
    }

    public final void p() {
        int ordinal = this.I.ordinal();
        if (ordinal == 0) {
            this.H = j(Stage.INITIALIZE);
            this.S = i();
            o();
        } else if (ordinal == 1) {
            o();
        } else if (ordinal == 2) {
            h();
        } else {
            StringBuilder m10 = a1.a.m("Unrecognized run reason: ");
            m10.append(this.I);
            throw new IllegalStateException(m10.toString());
        }
    }

    public final void q() {
        Throwable th;
        this.f5711j.a();
        if (!this.T) {
            this.T = true;
            return;
        }
        if (this.f5710f.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f5710f;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r8 = this;
            r5 = r8
            java.lang.String r0 = "DecodeJob"
            r7 = 5
            com.bumptech.glide.load.data.d<?> r1 = r5.R
            r7 = 1
            boolean r2 = r5.U     // Catch: java.lang.Throwable -> L23 com.bumptech.glide.load.engine.CallbackException -> L6e
            r7 = 2
            if (r2 == 0) goto L17
            r7 = 2
            r5.m()     // Catch: java.lang.Throwable -> L23 com.bumptech.glide.load.engine.CallbackException -> L6e
            if (r1 == 0) goto L16
            r7 = 5
            r1.b()
        L16:
            return
        L17:
            r5.p()     // Catch: java.lang.Throwable -> L23 com.bumptech.glide.load.engine.CallbackException -> L6e
            if (r1 == 0) goto L21
            r7 = 3
            r1.b()
            r7 = 1
        L21:
            r7 = 6
            return
        L23:
            r2 = move-exception
            r3 = 3
            r7 = 6
            r7 = 4
            boolean r7 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L70
            r3 = r7
            if (r3 == 0) goto L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L70
            r7 = 6
            r3.<init>()     // Catch: java.lang.Throwable -> L70
            r7 = 6
            java.lang.String r7 = "DecodeJob threw unexpectedly, isCancelled: "
            r4 = r7
            r3.append(r4)     // Catch: java.lang.Throwable -> L70
            boolean r4 = r5.U     // Catch: java.lang.Throwable -> L70
            r3.append(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = ", stage: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L70
            com.bumptech.glide.load.engine.DecodeJob$Stage r4 = r5.H     // Catch: java.lang.Throwable -> L70
            r7 = 6
            r3.append(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L70
            android.util.Log.d(r0, r3, r2)     // Catch: java.lang.Throwable -> L70
        L52:
            com.bumptech.glide.load.engine.DecodeJob$Stage r0 = r5.H     // Catch: java.lang.Throwable -> L70
            r7 = 1
            com.bumptech.glide.load.engine.DecodeJob$Stage r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE     // Catch: java.lang.Throwable -> L70
            r7 = 3
            if (r0 == r3) goto L64
            java.util.List<java.lang.Throwable> r0 = r5.f5710f     // Catch: java.lang.Throwable -> L70
            r7 = 1
            r0.add(r2)     // Catch: java.lang.Throwable -> L70
            r5.m()     // Catch: java.lang.Throwable -> L70
            r7 = 2
        L64:
            boolean r0 = r5.U     // Catch: java.lang.Throwable -> L70
            r7 = 7
            if (r0 != 0) goto L6c
            r7 = 5
            throw r2     // Catch: java.lang.Throwable -> L70
            r7 = 6
        L6c:
            r7 = 7
            throw r2     // Catch: java.lang.Throwable -> L70
        L6e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            if (r1 == 0) goto L77
            r1.b()
            r7 = 7
        L77:
            r7 = 3
            throw r0
            r7 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.run():void");
    }
}
