package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.a;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.request.SingleRequest;
import e6.a;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import l5.a;
import l5.i;

/* loaded from: classes.dex */
public class f implements j5.e, i.a, h.a {

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f5772h = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    public final g2.h f5773a;

    /* renamed from: b  reason: collision with root package name */
    public final r3.c f5774b;

    /* renamed from: c  reason: collision with root package name */
    public final l5.i f5775c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final j5.k f5776e;

    /* renamed from: f  reason: collision with root package name */
    public final a f5777f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.load.engine.a f5778g;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final DecodeJob.d f5779a;

        /* renamed from: b  reason: collision with root package name */
        public final m0.c<DecodeJob<?>> f5780b = e6.a.a(150, new C0073a());

        /* renamed from: c  reason: collision with root package name */
        public int f5781c;

        /* renamed from: com.bumptech.glide.load.engine.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0073a implements a.b<DecodeJob<?>> {
            public C0073a() {
            }

            @Override // e6.a.b
            public DecodeJob<?> a() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f5779a, aVar.f5780b);
            }
        }

        public a(DecodeJob.d dVar) {
            this.f5779a = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final m5.a f5783a;

        /* renamed from: b  reason: collision with root package name */
        public final m5.a f5784b;

        /* renamed from: c  reason: collision with root package name */
        public final m5.a f5785c;
        public final m5.a d;

        /* renamed from: e  reason: collision with root package name */
        public final j5.e f5786e;

        /* renamed from: f  reason: collision with root package name */
        public final h.a f5787f;

        /* renamed from: g  reason: collision with root package name */
        public final m0.c<g<?>> f5788g = e6.a.a(150, new a());

        /* loaded from: classes.dex */
        public class a implements a.b<g<?>> {
            public a() {
            }

            @Override // e6.a.b
            public g<?> a() {
                b bVar = b.this;
                return new g<>(bVar.f5783a, bVar.f5784b, bVar.f5785c, bVar.d, bVar.f5786e, bVar.f5787f, bVar.f5788g);
            }
        }

        public b(m5.a aVar, m5.a aVar2, m5.a aVar3, m5.a aVar4, j5.e eVar, h.a aVar5) {
            this.f5783a = aVar;
            this.f5784b = aVar2;
            this.f5785c = aVar3;
            this.d = aVar4;
            this.f5786e = eVar;
            this.f5787f = aVar5;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements DecodeJob.d {

        /* renamed from: a  reason: collision with root package name */
        public final a.InterfaceC0201a f5790a;

        /* renamed from: b  reason: collision with root package name */
        public volatile l5.a f5791b;

        public c(a.InterfaceC0201a interfaceC0201a) {
            this.f5790a = interfaceC0201a;
        }

        public l5.a a() {
            if (this.f5791b == null) {
                synchronized (this) {
                    if (this.f5791b == null) {
                        l5.d dVar = (l5.d) this.f5790a;
                        l5.f fVar = (l5.f) dVar.f12240b;
                        File cacheDir = fVar.f12245a.getCacheDir();
                        l5.e eVar = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else if (fVar.f12246b != null) {
                            cacheDir = new File(cacheDir, fVar.f12246b);
                        }
                        if (cacheDir != null) {
                            if (cacheDir.isDirectory() || cacheDir.mkdirs()) {
                                eVar = new l5.e(cacheDir, dVar.f12239a);
                            }
                        }
                        this.f5791b = eVar;
                    }
                    if (this.f5791b == null) {
                        this.f5791b = new l5.b();
                    }
                }
            }
            return this.f5791b;
        }
    }

    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public final g<?> f5792a;

        /* renamed from: b  reason: collision with root package name */
        public final z5.g f5793b;

        public d(z5.g gVar, g<?> gVar2) {
            this.f5793b = gVar;
            this.f5792a = gVar2;
        }
    }

    public f(l5.i iVar, a.InterfaceC0201a interfaceC0201a, m5.a aVar, m5.a aVar2, m5.a aVar3, m5.a aVar4, boolean z10) {
        this.f5775c = iVar;
        c cVar = new c(interfaceC0201a);
        com.bumptech.glide.load.engine.a aVar5 = new com.bumptech.glide.load.engine.a(z10);
        this.f5778g = aVar5;
        synchronized (this) {
            synchronized (aVar5) {
                aVar5.d = this;
            }
        }
        this.f5774b = new r3.c();
        this.f5773a = new g2.h(1);
        this.d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f5777f = new a(cVar);
        this.f5776e = new j5.k();
        ((l5.h) iVar).d = this;
    }

    public static void d(String str, long j10, h5.b bVar) {
        StringBuilder l10 = android.support.v4.media.a.l(str, " in ");
        l10.append(d6.h.a(j10));
        l10.append("ms, key: ");
        l10.append(bVar);
        Log.v("Engine", l10.toString());
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public void a(h5.b bVar, h<?> hVar) {
        com.bumptech.glide.load.engine.a aVar = this.f5778g;
        synchronized (aVar) {
            a.b remove = aVar.f5739b.remove(bVar);
            if (remove != null) {
                remove.f5744c = null;
                remove.clear();
            }
        }
        if (hVar.f5810c) {
            ((l5.h) this.f5775c).d(bVar, hVar);
        } else {
            this.f5776e.a(hVar, false);
        }
    }

    public <R> d b(com.bumptech.glide.d dVar, Object obj, h5.b bVar, int i10, int i11, Class<?> cls, Class<R> cls2, Priority priority, j5.d dVar2, Map<Class<?>, h5.g<?>> map, boolean z10, boolean z11, h5.d dVar3, boolean z12, boolean z13, boolean z14, boolean z15, z5.g gVar, Executor executor) {
        long j10;
        if (f5772h) {
            int i12 = d6.h.f8793b;
            j10 = SystemClock.elapsedRealtimeNanos();
        } else {
            j10 = 0;
        }
        long j11 = j10;
        Objects.requireNonNull(this.f5774b);
        j5.f fVar = new j5.f(obj, bVar, i10, i11, map, cls, cls2, dVar3);
        synchronized (this) {
            h<?> c10 = c(fVar, z12, j11);
            if (c10 == null) {
                return g(dVar, obj, bVar, i10, i11, cls, cls2, priority, dVar2, map, z10, z11, dVar3, z12, z13, z14, z15, gVar, executor, fVar, j11);
            }
            ((SingleRequest) gVar).o(c10, DataSource.MEMORY_CACHE, false);
            return null;
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
    public final com.bumptech.glide.load.engine.h<?> c(j5.f r10, boolean r11, long r12) {
        /*
            Method dump skipped, instructions count: 169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.f.c(j5.f, boolean, long):com.bumptech.glide.load.engine.h");
    }

    public synchronized void e(g<?> gVar, h5.b bVar, h<?> hVar) {
        if (hVar != null) {
            if (hVar.f5810c) {
                this.f5778g.a(bVar, hVar);
            }
        }
        g2.h hVar2 = this.f5773a;
        Objects.requireNonNull(hVar2);
        Map e10 = hVar2.e(gVar.F);
        if (gVar.equals(e10.get(bVar))) {
            e10.remove(bVar);
        }
    }

    public void f(j5.i<?> iVar) {
        if (!(iVar instanceof h)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((h) iVar).e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:19:0x00d5, B:21:0x00e1, B:27:0x00ec, B:35:0x00ff, B:28:0x00ef, B:30:0x00f3, B:31:0x00f6, B:33:0x00fa, B:34:0x00fd), top: B:48:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef A[Catch: all -> 0x0116, TryCatch #0 {, blocks: (B:19:0x00d5, B:21:0x00e1, B:27:0x00ec, B:35:0x00ff, B:28:0x00ef, B:30:0x00f3, B:31:0x00f6, B:33:0x00fa, B:34:0x00fd), top: B:48:0x00d5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> com.bumptech.glide.load.engine.f.d g(com.bumptech.glide.d r17, java.lang.Object r18, h5.b r19, int r20, int r21, java.lang.Class<?> r22, java.lang.Class<R> r23, com.bumptech.glide.Priority r24, j5.d r25, java.util.Map<java.lang.Class<?>, h5.g<?>> r26, boolean r27, boolean r28, h5.d r29, boolean r30, boolean r31, boolean r32, boolean r33, z5.g r34, java.util.concurrent.Executor r35, j5.f r36, long r37) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.f.g(com.bumptech.glide.d, java.lang.Object, h5.b, int, int, java.lang.Class, java.lang.Class, com.bumptech.glide.Priority, j5.d, java.util.Map, boolean, boolean, h5.d, boolean, boolean, boolean, boolean, z5.g, java.util.concurrent.Executor, j5.f, long):com.bumptech.glide.load.engine.f$d");
    }
}
