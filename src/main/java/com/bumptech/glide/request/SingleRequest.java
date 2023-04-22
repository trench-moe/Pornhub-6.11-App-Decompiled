package com.bumptech.glide.request;

import a6.f;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.bumptech.glide.Priority;
import com.bumptech.glide.c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.f;
import d6.h;
import d6.l;
import e6.d;
import j5.i;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import n5.k;
import z5.c;
import z5.e;
import z5.g;

/* loaded from: classes.dex */
public final class SingleRequest<R> implements c, f, g {
    public static final boolean D = Log.isLoggable("GlideRequest", 2);
    public int A;
    public boolean B;
    public RuntimeException C;

    /* renamed from: a  reason: collision with root package name */
    public final String f5889a;

    /* renamed from: b  reason: collision with root package name */
    public final d f5890b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5891c;
    public final e<R> d;

    /* renamed from: e  reason: collision with root package name */
    public final RequestCoordinator f5892e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f5893f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bumptech.glide.d f5894g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f5895h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f5896i;

    /* renamed from: j  reason: collision with root package name */
    public final z5.a<?> f5897j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5898k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5899l;

    /* renamed from: m  reason: collision with root package name */
    public final Priority f5900m;
    public final a6.g<R> n;

    /* renamed from: o  reason: collision with root package name */
    public final List<e<R>> f5901o;

    /* renamed from: p  reason: collision with root package name */
    public final b6.c<? super R> f5902p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f5903q;

    /* renamed from: r  reason: collision with root package name */
    public i<R> f5904r;

    /* renamed from: s  reason: collision with root package name */
    public f.d f5905s;

    /* renamed from: t  reason: collision with root package name */
    public long f5906t;

    /* renamed from: u  reason: collision with root package name */
    public volatile com.bumptech.glide.load.engine.f f5907u;

    /* renamed from: v  reason: collision with root package name */
    public Status f5908v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f5909w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f5910x;
    public Drawable y;

    /* renamed from: z  reason: collision with root package name */
    public int f5911z;

    /* loaded from: classes.dex */
    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, z5.a<?> aVar, int i10, int i11, Priority priority, a6.g<R> gVar, e<R> eVar, List<e<R>> list, RequestCoordinator requestCoordinator, com.bumptech.glide.load.engine.f fVar, b6.c<? super R> cVar, Executor executor) {
        this.f5889a = D ? String.valueOf(hashCode()) : null;
        this.f5890b = new d.b();
        this.f5891c = obj;
        this.f5893f = context;
        this.f5894g = dVar;
        this.f5895h = obj2;
        this.f5896i = cls;
        this.f5897j = aVar;
        this.f5898k = i10;
        this.f5899l = i11;
        this.f5900m = priority;
        this.n = gVar;
        this.d = eVar;
        this.f5901o = list;
        this.f5892e = requestCoordinator;
        this.f5907u = fVar;
        this.f5902p = cVar;
        this.f5903q = executor;
        this.f5908v = Status.PENDING;
        if (this.C == null && dVar.f5647h.f5650a.containsKey(c.d.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // z5.c
    public boolean a() {
        boolean z10;
        synchronized (this.f5891c) {
            z10 = this.f5908v == Status.COMPLETE;
        }
        return z10;
    }

    @Override // a6.f
    public void b(int i10, int i11) {
        Object obj;
        int i12 = i10;
        this.f5890b.a();
        Object obj2 = this.f5891c;
        synchronized (obj2) {
            try {
                boolean z10 = D;
                if (z10) {
                    m("Got onSizeReady in " + h.a(this.f5906t));
                }
                if (this.f5908v == Status.WAITING_FOR_SIZE) {
                    Status status = Status.RUNNING;
                    this.f5908v = status;
                    float f10 = this.f5897j.f21786f;
                    if (i12 != Integer.MIN_VALUE) {
                        i12 = Math.round(i12 * f10);
                    }
                    this.f5911z = i12;
                    this.A = i11 == Integer.MIN_VALUE ? i11 : Math.round(f10 * i11);
                    if (z10) {
                        m("finished setup for calling load in " + h.a(this.f5906t));
                    }
                    com.bumptech.glide.load.engine.f fVar = this.f5907u;
                    com.bumptech.glide.d dVar = this.f5894g;
                    Object obj3 = this.f5895h;
                    z5.a<?> aVar = this.f5897j;
                    try {
                        obj = obj2;
                        try {
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                    }
                    try {
                        this.f5905s = fVar.b(dVar, obj3, aVar.B, this.f5911z, this.A, aVar.I, this.f5896i, this.f5900m, aVar.f21787j, aVar.H, aVar.C, aVar.O, aVar.G, aVar.y, aVar.M, aVar.P, aVar.N, this, this.f5903q);
                        if (this.f5908v != status) {
                            this.f5905s = null;
                        }
                        if (z10) {
                            m("finished onSizeReady in " + h.a(this.f5906t));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    public final void c() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:4:0x0005, B:6:0x0016, B:9:0x0019, B:11:0x0023, B:13:0x002a, B:15:0x002f, B:21:0x003f, B:22:0x0049, B:23:0x004c), top: B:33:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    @Override // z5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void clear() {
        /*
            r8 = this;
            r5 = r8
            java.lang.Object r0 = r5.f5891c
            r7 = 3
            monitor-enter(r0)
            r5.c()     // Catch: java.lang.Throwable -> L58
            e6.d r1 = r5.f5890b     // Catch: java.lang.Throwable -> L58
            r7 = 6
            r1.a()     // Catch: java.lang.Throwable -> L58
            r7 = 3
            com.bumptech.glide.request.SingleRequest$Status r1 = r5.f5908v     // Catch: java.lang.Throwable -> L58
            com.bumptech.glide.request.SingleRequest$Status r2 = com.bumptech.glide.request.SingleRequest.Status.CLEARED     // Catch: java.lang.Throwable -> L58
            r7 = 6
            if (r1 != r2) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            r7 = 5
            return
        L19:
            r5.d()     // Catch: java.lang.Throwable -> L58
            r7 = 2
            j5.i<R> r1 = r5.f5904r     // Catch: java.lang.Throwable -> L58
            r3 = 0
            r7 = 3
            if (r1 == 0) goto L28
            r7 = 4
            r5.f5904r = r3     // Catch: java.lang.Throwable -> L58
            r7 = 2
            goto L2a
        L28:
            r7 = 3
            r1 = r3
        L2a:
            com.bumptech.glide.request.RequestCoordinator r3 = r5.f5892e     // Catch: java.lang.Throwable -> L58
            r7 = 6
            if (r3 == 0) goto L3b
            r7 = 6
            boolean r7 = r3.g(r5)     // Catch: java.lang.Throwable -> L58
            r3 = r7
            if (r3 == 0) goto L38
            goto L3b
        L38:
            r7 = 0
            r3 = r7
            goto L3d
        L3b:
            r7 = 1
            r3 = r7
        L3d:
            if (r3 == 0) goto L49
            a6.g<R> r3 = r5.n     // Catch: java.lang.Throwable -> L58
            android.graphics.drawable.Drawable r7 = r5.g()     // Catch: java.lang.Throwable -> L58
            r4 = r7
            r3.k(r4)     // Catch: java.lang.Throwable -> L58
        L49:
            r7 = 6
            r5.f5908v = r2     // Catch: java.lang.Throwable -> L58
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L56
            r7 = 6
            com.bumptech.glide.load.engine.f r0 = r5.f5907u
            r7 = 7
            r0.f(r1)
        L56:
            r7 = 6
            return
        L58:
            r1 = move-exception
            r7 = 3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L58
            throw r1
            r7 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.clear():void");
    }

    public final void d() {
        c();
        this.f5890b.a();
        this.n.a(this);
        f.d dVar = this.f5905s;
        if (dVar != null) {
            synchronized (com.bumptech.glide.load.engine.f.this) {
                dVar.f5792a.h(dVar.f5793b);
            }
            this.f5905s = null;
        }
    }

    public final Drawable e() {
        int i10;
        if (this.y == null) {
            z5.a<?> aVar = this.f5897j;
            Drawable drawable = aVar.E;
            this.y = drawable;
            if (drawable == null && (i10 = aVar.F) > 0) {
                this.y = l(i10);
            }
        }
        return this.y;
    }

    @Override // z5.c
    public boolean f() {
        boolean z10;
        synchronized (this.f5891c) {
            z10 = this.f5908v == Status.CLEARED;
        }
        return z10;
    }

    public final Drawable g() {
        int i10;
        if (this.f5910x == null) {
            z5.a<?> aVar = this.f5897j;
            Drawable drawable = aVar.f21790u;
            this.f5910x = drawable;
            if (drawable == null && (i10 = aVar.f21791w) > 0) {
                this.f5910x = l(i10);
            }
        }
        return this.f5910x;
    }

    @Override // z5.c
    public boolean h(z5.c cVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        z5.a<?> aVar;
        Priority priority;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        z5.a<?> aVar2;
        Priority priority2;
        int size2;
        if (cVar instanceof SingleRequest) {
            synchronized (this.f5891c) {
                i10 = this.f5898k;
                i11 = this.f5899l;
                obj = this.f5895h;
                cls = this.f5896i;
                aVar = this.f5897j;
                priority = this.f5900m;
                List<e<R>> list = this.f5901o;
                size = list != null ? list.size() : 0;
            }
            SingleRequest singleRequest = (SingleRequest) cVar;
            synchronized (singleRequest.f5891c) {
                i12 = singleRequest.f5898k;
                i13 = singleRequest.f5899l;
                obj2 = singleRequest.f5895h;
                cls2 = singleRequest.f5896i;
                aVar2 = singleRequest.f5897j;
                priority2 = singleRequest.f5900m;
                List<e<R>> list2 = singleRequest.f5901o;
                size2 = list2 != null ? list2.size() : 0;
            }
            if (i10 == i12 && i11 == i13) {
                char[] cArr = l.f8803a;
                if ((obj == null ? obj2 == null : obj instanceof k ? ((k) obj).a(obj2) : obj.equals(obj2)) && cls.equals(cls2) && aVar.equals(aVar2) && priority == priority2 && size == size2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[Catch: all -> 0x00fd, TryCatch #0 {, blocks: (B:4:0x0006, B:6:0x001e, B:8:0x002a, B:9:0x0032, B:13:0x003e, B:14:0x004a, B:16:0x004c, B:18:0x0051, B:20:0x0057, B:21:0x0060, B:23:0x0062, B:33:0x0089, B:35:0x009a, B:37:0x00a9, B:49:0x00cd, B:51:0x00d1, B:53:0x00f1, B:41:0x00b0, B:43:0x00b6, B:48:0x00c3, B:36:0x00a3, B:26:0x0069, B:28:0x006f, B:30:0x0076, B:32:0x0082, B:56:0x00f4, B:57:0x00fc), top: B:61:0x0006 }] */
    @Override // z5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.i():void");
    }

    @Override // z5.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f5891c) {
            Status status = this.f5908v;
            z10 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
        }
        return z10;
    }

    public final boolean j() {
        RequestCoordinator requestCoordinator = this.f5892e;
        return requestCoordinator == null || !requestCoordinator.b().a();
    }

    @Override // z5.c
    public boolean k() {
        boolean z10;
        synchronized (this.f5891c) {
            z10 = this.f5908v == Status.COMPLETE;
        }
        return z10;
    }

    public final Drawable l(int i10) {
        Resources.Theme theme = this.f5897j.K;
        if (theme == null) {
            theme = this.f5893f.getTheme();
        }
        com.bumptech.glide.d dVar = this.f5894g;
        return s5.b.a(dVar, dVar, i10, theme);
    }

    public final void m(String str) {
        StringBuilder l10 = android.support.v4.media.a.l(str, " this: ");
        l10.append(this.f5889a);
        Log.v("GlideRequest", l10.toString());
    }

    public final void n(GlideException glideException, int i10) {
        boolean z10;
        this.f5890b.a();
        synchronized (this.f5891c) {
            glideException.i(this.C);
            int i11 = this.f5894g.f5648i;
            if (i11 <= i10) {
                Log.w("Glide", "Load failed for " + this.f5895h + " with size [" + this.f5911z + "x" + this.A + "]", glideException);
                if (i11 <= 4) {
                    glideException.e("Glide");
                }
            }
            this.f5905s = null;
            this.f5908v = Status.FAILED;
            boolean z11 = true;
            this.B = true;
            List<e<R>> list = this.f5901o;
            if (list != null) {
                z10 = false;
                for (e<R> eVar : list) {
                    z10 |= eVar.l(glideException, this.f5895h, this.n, j());
                }
            } else {
                z10 = false;
            }
            e<R> eVar2 = this.d;
            if (eVar2 == null || !eVar2.l(glideException, this.f5895h, this.n, j())) {
                z11 = false;
            }
            if (!(z10 | z11)) {
                q();
            }
            this.B = false;
            RequestCoordinator requestCoordinator = this.f5892e;
            if (requestCoordinator != null) {
                requestCoordinator.d(this);
            }
        }
    }

    public void o(i<?> iVar, DataSource dataSource, boolean z10) {
        this.f5890b.a();
        i<?> iVar2 = null;
        try {
            synchronized (this.f5891c) {
                try {
                    this.f5905s = null;
                    if (iVar == null) {
                        n(new GlideException("Expected to receive a Resource<R> with an object of " + this.f5896i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = iVar.get();
                    try {
                        if (obj != null && this.f5896i.isAssignableFrom(obj.getClass())) {
                            RequestCoordinator requestCoordinator = this.f5892e;
                            if (requestCoordinator == null || requestCoordinator.e(this)) {
                                p(iVar, obj, dataSource);
                                return;
                            }
                            this.f5904r = null;
                            this.f5908v = Status.COMPLETE;
                            this.f5907u.f(iVar);
                            return;
                        }
                        this.f5904r = null;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected to receive an object of ");
                        sb2.append(this.f5896i);
                        sb2.append(" but instead got ");
                        sb2.append(obj != null ? obj.getClass() : BuildConfig.FLAVOR);
                        sb2.append("{");
                        sb2.append(obj);
                        sb2.append("} inside Resource{");
                        sb2.append(iVar);
                        sb2.append("}.");
                        sb2.append(obj != null ? BuildConfig.FLAVOR : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        n(new GlideException(sb2.toString()), 5);
                        this.f5907u.f(iVar);
                    } catch (Throwable th) {
                        iVar2 = iVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (iVar2 != null) {
                this.f5907u.f(iVar2);
            }
            throw th3;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void p(i iVar, Object obj, DataSource dataSource) {
        boolean z10;
        boolean j10 = j();
        this.f5908v = Status.COMPLETE;
        this.f5904r = iVar;
        if (this.f5894g.f5648i <= 3) {
            StringBuilder m10 = a1.a.m("Finished loading ");
            m10.append(obj.getClass().getSimpleName());
            m10.append(" from ");
            m10.append(dataSource);
            m10.append(" for ");
            m10.append(this.f5895h);
            m10.append(" with size [");
            m10.append(this.f5911z);
            m10.append("x");
            m10.append(this.A);
            m10.append("] in ");
            m10.append(h.a(this.f5906t));
            m10.append(" ms");
            Log.d("Glide", m10.toString());
        }
        boolean z11 = true;
        this.B = true;
        try {
            List<e<R>> list = this.f5901o;
            if (list != null) {
                z10 = false;
                for (e<R> eVar : list) {
                    z10 |= eVar.b(obj, this.f5895h, this.n, dataSource, j10);
                }
            } else {
                z10 = false;
            }
            e<R> eVar2 = this.d;
            if (eVar2 == null || !eVar2.b(obj, this.f5895h, this.n, dataSource, j10)) {
                z11 = false;
            }
            if (!(z11 | z10)) {
                Objects.requireNonNull(this.f5902p);
                this.n.d(obj, b6.a.f3581a);
            }
            this.B = false;
            RequestCoordinator requestCoordinator = this.f5892e;
            if (requestCoordinator != null) {
                requestCoordinator.j(this);
            }
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    @Override // z5.c
    public void pause() {
        synchronized (this.f5891c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            r4 = this;
            com.bumptech.glide.request.RequestCoordinator r0 = r4.f5892e
            if (r0 == 0) goto L11
            boolean r2 = r0.c(r4)
            r0 = r2
            if (r0 == 0) goto Ld
            r3 = 4
            goto L12
        Ld:
            r3 = 5
            r0 = 0
            r3 = 3
            goto L14
        L11:
            r3 = 1
        L12:
            r2 = 1
            r0 = r2
        L14:
            if (r0 != 0) goto L18
            r3 = 4
            return
        L18:
            r3 = 7
            r0 = 0
            java.lang.Object r1 = r4.f5895h
            r3 = 3
            if (r1 != 0) goto L25
            r3 = 4
            android.graphics.drawable.Drawable r2 = r4.e()
            r0 = r2
        L25:
            if (r0 != 0) goto L48
            r3 = 7
            android.graphics.drawable.Drawable r0 = r4.f5909w
            if (r0 != 0) goto L44
            r3 = 6
            z5.a<?> r0 = r4.f5897j
            r3 = 5
            android.graphics.drawable.Drawable r1 = r0.n
            r4.f5909w = r1
            if (r1 != 0) goto L44
            r3 = 7
            int r0 = r0.f21789t
            r3 = 1
            if (r0 <= 0) goto L44
            r3 = 6
            android.graphics.drawable.Drawable r0 = r4.l(r0)
            r4.f5909w = r0
            r3 = 7
        L44:
            r3 = 7
            android.graphics.drawable.Drawable r0 = r4.f5909w
            r3 = 5
        L48:
            r3 = 4
            if (r0 != 0) goto L51
            r3 = 7
            android.graphics.drawable.Drawable r2 = r4.g()
            r0 = r2
        L51:
            r3 = 3
            a6.g<R> r1 = r4.n
            r3 = 1
            r1.f(r0)
            r3 = 1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.SingleRequest.q():void");
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f5891c) {
            obj = this.f5895h;
            cls = this.f5896i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
