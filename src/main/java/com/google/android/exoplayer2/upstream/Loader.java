package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c7.h;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.source.m;
import com.google.android.exoplayer2.source.p;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k8.b0;
import k8.c0;
import l6.r;

/* loaded from: classes.dex */
public final class Loader {
    public static final c d = new c(2, -9223372036854775807L, null);

    /* renamed from: e  reason: collision with root package name */
    public static final c f6697e = new c(3, -9223372036854775807L, null);

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f6698a;

    /* renamed from: b  reason: collision with root package name */
    public d<? extends e> f6699b;

    /* renamed from: c  reason: collision with root package name */
    public IOException f6700c;

    /* loaded from: classes.dex */
    public static final class UnexpectedLoaderException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public UnexpectedLoaderException(java.lang.Throwable r5) {
            /*
                r4 = this;
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r1 = r5.getMessage()
                int r2 = r0.length()
                int r2 = r2 + 13
                int r2 = a0.a.e(r1, r2)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Unexpected "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ": "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                r4.<init>(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.UnexpectedLoaderException.<init>(java.lang.Throwable):void");
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends e> {
        void f(T t2, long j10, long j11, boolean z10);

        void i(T t2, long j10, long j11);

        c q(T t2, long j10, long j11, IOException iOException, int i10);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f6701a;

        /* renamed from: b  reason: collision with root package name */
        public final long f6702b;

        public c(int i10, long j10, a aVar) {
            this.f6701a = i10;
            this.f6702b = j10;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final int f6703c;

        /* renamed from: f  reason: collision with root package name */
        public final T f6704f;

        /* renamed from: j  reason: collision with root package name */
        public final long f6705j;

        /* renamed from: m  reason: collision with root package name */
        public b<T> f6706m;
        public IOException n;

        /* renamed from: t  reason: collision with root package name */
        public int f6707t;

        /* renamed from: u  reason: collision with root package name */
        public Thread f6708u;

        /* renamed from: w  reason: collision with root package name */
        public boolean f6709w;
        public volatile boolean y;

        public d(Looper looper, T t2, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f6704f = t2;
            this.f6706m = bVar;
            this.f6703c = i10;
            this.f6705j = j10;
        }

        /* JADX WARN: Finally extract failed */
        public void a(boolean z10) {
            this.y = z10;
            this.n = null;
            if (hasMessages(0)) {
                this.f6709w = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f6709w = true;
                        this.f6704f.b();
                        Thread thread = this.f6708u;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z10) {
                Loader.this.f6699b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b<T> bVar = this.f6706m;
                Objects.requireNonNull(bVar);
                bVar.f(this.f6704f, elapsedRealtime, elapsedRealtime - this.f6705j, true);
                this.f6706m = null;
            }
        }

        public void b(long j10) {
            k8.a.f(Loader.this.f6699b == null);
            Loader loader = Loader.this;
            loader.f6699b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
                return;
            }
            this.n = null;
            loader.f6698a.execute(this);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.y) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.n = null;
                Loader loader = Loader.this;
                ExecutorService executorService = loader.f6698a;
                d<? extends e> dVar = loader.f6699b;
                Objects.requireNonNull(dVar);
                executorService.execute(dVar);
            } else if (i10 == 3) {
                throw ((Error) message.obj);
            } else {
                Loader.this.f6699b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f6705j;
                b<T> bVar = this.f6706m;
                Objects.requireNonNull(bVar);
                if (this.f6709w) {
                    bVar.f(this.f6704f, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 == 1) {
                    try {
                        bVar.i(this.f6704f, elapsedRealtime, j10);
                    } catch (RuntimeException e10) {
                        k8.a.i("LoadTask", "Unexpected exception handling load completed", e10);
                        Loader.this.f6700c = new UnexpectedLoaderException(e10);
                    }
                } else if (i11 != 2) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.n = iOException;
                    int i12 = this.f6707t + 1;
                    this.f6707t = i12;
                    c q10 = bVar.q(this.f6704f, elapsedRealtime, j10, iOException, i12);
                    int i13 = q10.f6701a;
                    if (i13 == 3) {
                        Loader.this.f6700c = this.n;
                    } else if (i13 != 2) {
                        if (i13 == 1) {
                            this.f6707t = 1;
                        }
                        long j11 = q10.f6702b;
                        if (j11 == -9223372036854775807L) {
                            j11 = Math.min((this.f6707t - 1) * 1000, 5000);
                        }
                        b(j11);
                    }
                }
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
        @Override // java.lang.Runnable
        public void run() {
            /*
                Method dump skipped, instructions count: 220
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.d.run():void");
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final f f6711c;

        public g(f fVar) {
            this.f6711c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            p[] pVarArr;
            m mVar = (m) this.f6711c;
            for (p pVar : mVar.I) {
                pVar.r(true);
                DrmSession drmSession = pVar.f6415i;
                if (drmSession != null) {
                    drmSession.b(pVar.f6411e);
                    pVar.f6415i = null;
                    pVar.f6414h = null;
                }
            }
            r rVar = (r) mVar.B;
            h hVar = (h) rVar.f12310f;
            if (hVar != null) {
                hVar.a();
                rVar.f12310f = null;
            }
            rVar.f12311j = null;
        }
    }

    public Loader(String str) {
        String concat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
        int i10 = c0.f11939a;
        this.f6698a = Executors.newSingleThreadExecutor(new b0(concat, 0));
    }

    public static c a(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10, null);
    }

    public boolean b() {
        return this.f6699b != null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void c(int r4) {
        /*
            r3 = this;
            java.io.IOException r0 = r3.f6700c
            if (r0 != 0) goto L1f
            r2 = 5
            com.google.android.exoplayer2.upstream.Loader$d<? extends com.google.android.exoplayer2.upstream.Loader$e> r0 = r3.f6699b
            r2 = 4
            if (r0 == 0) goto L1d
            r2 = 2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r2
            if (r4 != r1) goto L12
            int r4 = r0.f6703c
        L12:
            java.io.IOException r1 = r0.n
            if (r1 == 0) goto L1d
            int r0 = r0.f6707t
            if (r0 > r4) goto L1b
            goto L1e
        L1b:
            throw r1
            r2 = 5
        L1d:
            r2 = 7
        L1e:
            return
        L1f:
            r2 = 3
            throw r0
            r2 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.c(int):void");
    }

    public void d(f fVar) {
        d<? extends e> dVar = this.f6699b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f6698a.execute(new g(fVar));
        }
        this.f6698a.shutdown();
    }

    public <T extends e> long e(T t2, b<T> bVar, int i10) {
        Looper myLooper = Looper.myLooper();
        k8.a.g(myLooper);
        this.f6700c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(myLooper, t2, bVar, i10, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }
}
