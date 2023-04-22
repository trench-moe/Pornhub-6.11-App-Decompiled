package te;

import com.appsflyer.oaid.BuildConfig;
import gf.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pe.k;
import pe.m;
import pe.t;
import pe.u;
import pe.y;
import xe.h;

/* loaded from: classes3.dex */
public final class e implements pe.d {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public volatile te.c D;
    public volatile okhttp3.internal.connection.a E;
    public final t F;
    public final u G;
    public final boolean H;

    /* renamed from: c  reason: collision with root package name */
    public final g f15442c;

    /* renamed from: f  reason: collision with root package name */
    public final m f15443f;

    /* renamed from: j  reason: collision with root package name */
    public final c f15444j;

    /* renamed from: m  reason: collision with root package name */
    public final AtomicBoolean f15445m;
    public Object n;

    /* renamed from: t  reason: collision with root package name */
    public d f15446t;

    /* renamed from: u  reason: collision with root package name */
    public okhttp3.internal.connection.a f15447u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15448w;
    public te.c y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f15449z;

    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public volatile AtomicInteger f15450c;

        /* renamed from: f  reason: collision with root package name */
        public final pe.e f15451f;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ e f15452j;

        public a(e eVar, pe.e responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f15452j = eVar;
            this.f15451f = responseCallback;
            this.f15450c = new AtomicInteger(0);
        }

        public final String a() {
            return this.f15452j.G.f14049b.f13990e;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            StringBuilder m10 = a1.a.m("OkHttp ");
            m10.append(this.f15452j.G.f14049b.g());
            String sb2 = m10.toString();
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
            String name = currentThread.getName();
            currentThread.setName(sb2);
            try {
                this.f15452j.f15444j.h();
                boolean z10 = false;
                try {
                    y g10 = this.f15452j.g();
                    try {
                        ((l.a) this.f15451f).b(this.f15452j, g10);
                        eVar = this.f15452j;
                    } catch (IOException e10) {
                        e = e10;
                        z10 = true;
                        if (z10) {
                            h.a aVar = xe.h.f18380c;
                            xe.h hVar = xe.h.f18378a;
                            hVar.i("Callback failure for " + e.a(this.f15452j), 4, e);
                        } else {
                            ((l.a) this.f15451f).a(this.f15452j, e);
                        }
                        eVar = this.f15452j;
                        eVar.F.f14021c.b(this);
                    } catch (Throwable th) {
                        th = th;
                        z10 = true;
                        this.f15452j.cancel();
                        if (!z10) {
                            IOException iOException = new IOException("canceled due to " + th);
                            ExceptionsKt.addSuppressed(iOException, th);
                            ((l.a) this.f15451f).a(this.f15452j, iOException);
                        }
                        throw th;
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (Throwable th2) {
                    th = th2;
                }
                eVar.F.f14021c.b(this);
            } finally {
                currentThread.setName(name);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends WeakReference<e> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f15453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f15453a = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends bf.c {
        public c() {
        }

        @Override // bf.c
        public void k() {
            e.this.cancel();
        }
    }

    public e(t client, u originalRequest, boolean z10) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.F = client;
        this.G = originalRequest;
        this.H = z10;
        this.f15442c = (g) client.f14022f.f13543c;
        this.f15443f = client.n.a(this);
        c cVar = new c();
        cVar.g(0, TimeUnit.MILLISECONDS);
        Unit unit = Unit.INSTANCE;
        this.f15444j = cVar;
        this.f15445m = new AtomicBoolean();
        this.B = true;
    }

    public static final String a(e eVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eVar.C ? "canceled " : BuildConfig.FLAVOR);
        sb2.append(eVar.H ? "web socket" : "call");
        sb2.append(" to ");
        sb2.append(eVar.G.f14049b.g());
        return sb2.toString();
    }

    public final void b(okhttp3.internal.connection.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = qe.c.f14512a;
        if (!(this.f15447u == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.f15447u = connection;
        connection.f13694o.add(new b(this, this.n));
    }

    public final <E extends IOException> E c(E e10) {
        InterruptedIOException interruptedIOException;
        Socket k10;
        byte[] bArr = qe.c.f14512a;
        okhttp3.internal.connection.a connection = this.f15447u;
        if (connection != null) {
            synchronized (connection) {
                k10 = k();
            }
            if (this.f15447u == null) {
                if (k10 != null) {
                    qe.c.e(k10);
                }
                Objects.requireNonNull(this.f15443f);
                Intrinsics.checkNotNullParameter(this, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else {
                if (!(k10 == null)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }
        if (!this.f15448w && this.f15444j.i()) {
            InterruptedIOException interruptedIOException2 = new InterruptedIOException("timeout");
            interruptedIOException = interruptedIOException2;
            if (e10 != null) {
                interruptedIOException2.initCause(e10);
                interruptedIOException = interruptedIOException2;
            }
        } else {
            interruptedIOException = e10;
        }
        if (e10 != null) {
            m mVar = this.f15443f;
            Intrinsics.checkNotNull(interruptedIOException);
            Objects.requireNonNull(mVar);
            Intrinsics.checkNotNullParameter(this, "call");
            E ioe = interruptedIOException;
            Intrinsics.checkNotNullParameter(ioe, "ioe");
        } else {
            Objects.requireNonNull(this.f15443f);
            Intrinsics.checkNotNullParameter(this, "call");
        }
        return interruptedIOException;
    }

    @Override // pe.d
    public void cancel() {
        Socket socket;
        if (this.C) {
            return;
        }
        this.C = true;
        te.c cVar = this.D;
        if (cVar != null) {
            cVar.f15423f.cancel();
        }
        okhttp3.internal.connection.a aVar = this.E;
        if (aVar != null && (socket = aVar.f13683b) != null) {
            qe.c.e(socket);
        }
        Objects.requireNonNull(this.f15443f);
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public Object clone() {
        return new e(this.F, this.G, this.H);
    }

    public final void d() {
        h.a aVar = xe.h.f18380c;
        this.n = xe.h.f18378a.g("response.body().close()");
        Objects.requireNonNull(this.f15443f);
        Intrinsics.checkNotNullParameter(this, "call");
    }

    @Override // pe.d
    public y e() {
        if (this.f15445m.compareAndSet(false, true)) {
            this.f15444j.h();
            d();
            try {
                k kVar = this.F.f14021c;
                synchronized (kVar) {
                    Intrinsics.checkNotNullParameter(this, "call");
                    kVar.d.add(this);
                }
                return g();
            } finally {
                k kVar2 = this.F.f14021c;
                Objects.requireNonNull(kVar2);
                Intrinsics.checkNotNullParameter(this, "call");
                kVar2.a(kVar2.d, this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final void f(boolean z10) {
        te.c cVar;
        synchronized (this) {
            if (!this.B) {
                throw new IllegalStateException("released".toString());
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z10 && (cVar = this.D) != null) {
            cVar.f15423f.cancel();
            cVar.f15421c.i(cVar, true, true, null);
        }
        this.y = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pe.y g() {
        /*
            r10 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            pe.t r0 = r10.F
            java.util.List<pe.q> r0 = r0.f14023j
            kotlin.collections.CollectionsKt.addAll(r2, r0)
            ue.i r0 = new ue.i
            pe.t r1 = r10.F
            r0.<init>(r1)
            r2.add(r0)
            ue.a r0 = new ue.a
            pe.t r1 = r10.F
            pe.j r1 = r1.f14028z
            r0.<init>(r1)
            r2.add(r0)
            re.a r0 = new re.a
            pe.t r1 = r10.F
            java.util.Objects.requireNonNull(r1)
            r0.<init>()
            r2.add(r0)
            te.a r0 = te.a.f15415a
            r2.add(r0)
            boolean r0 = r10.H
            if (r0 != 0) goto L3f
            pe.t r0 = r10.F
            java.util.List<pe.q> r0 = r0.f14024m
            kotlin.collections.CollectionsKt.addAll(r2, r0)
        L3f:
            ue.b r0 = new ue.b
            boolean r1 = r10.H
            r0.<init>(r1)
            r2.add(r0)
            ue.g r9 = new ue.g
            r3 = 0
            r4 = 0
            pe.u r5 = r10.G
            pe.t r0 = r10.F
            int r6 = r0.L
            int r7 = r0.M
            int r8 = r0.N
            r0 = r9
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            pe.u r2 = r10.G     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            pe.y r2 = r9.c(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            boolean r3 = r10.C     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            if (r3 != 0) goto L6c
            r10.j(r1)
            return r2
        L6c:
            qe.c.d(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            throw r2     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
        L77:
            r2 = move-exception
            goto L8c
        L79:
            r0 = move-exception
            java.io.IOException r0 = r10.j(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L88
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L88:
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L8c:
            if (r0 != 0) goto L91
            r10.j(r1)
        L91:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: te.e.g():pe.y");
    }

    @Override // pe.d
    public void g0(pe.e responseCallback) {
        a other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f15445m.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        d();
        k kVar = this.F.f14021c;
        a call = new a(this, responseCallback);
        Objects.requireNonNull(kVar);
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (kVar) {
            kVar.f13972b.add(call);
            if (!call.f15452j.H) {
                String a10 = call.a();
                Iterator<a> it = kVar.f13973c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<a> it2 = kVar.f13972b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            }
                            other = it2.next();
                            if (Intrinsics.areEqual(other.a(), a10)) {
                                break;
                            }
                        }
                    } else {
                        other = it.next();
                        if (Intrinsics.areEqual(other.a(), a10)) {
                            break;
                        }
                    }
                }
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f15450c = other.f15450c;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        kVar.c();
    }

    @Override // pe.d
    public boolean h() {
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:34:0x0043, B:14:0x001d), top: B:54:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:8:0x0014, B:17:0x0023, B:19:0x0027, B:20:0x0029, B:22:0x002d, B:27:0x0036, B:29:0x003a, B:34:0x0043, B:14:0x001d), top: B:54:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E i(te.c r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            te.c r0 = r2.D
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.f15449z     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L62
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.A     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.f15449z = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.A = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.f15449z     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.A     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r4 != 0) goto L3f
            boolean r4 = r2.A     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            boolean r4 = r2.B     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L3f
            r3 = 1
        L3f:
            r4 = r3
            r3 = r5
            goto L43
        L42:
            r4 = 0
        L43:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L5a
            r3 = 0
            r2.D = r3
            okhttp3.internal.connection.a r3 = r2.f15447u
            if (r3 == 0) goto L5a
            monitor-enter(r3)
            int r5 = r3.f13692l     // Catch: java.lang.Throwable -> L57
            int r5 = r5 + r0
            r3.f13692l = r5     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            goto L5a
        L57:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L5a:
            if (r4 == 0) goto L61
            java.io.IOException r3 = r2.c(r6)
            return r3
        L61:
            return r6
        L62:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: te.e.i(te.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException j(IOException iOException) {
        boolean z10;
        synchronized (this) {
            z10 = false;
            if (this.B) {
                this.B = false;
                if (!this.f15449z && !this.A) {
                    z10 = true;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return z10 ? c(iOException) : iOException;
    }

    public final Socket k() {
        okhttp3.internal.connection.a connection = this.f15447u;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = qe.c.f14512a;
        List<Reference<e>> list = connection.f13694o;
        Iterator<Reference<e>> it = list.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().get(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            list.remove(i10);
            this.f15447u = null;
            if (list.isEmpty()) {
                connection.f13695p = System.nanoTime();
                g gVar = this.f15442c;
                Objects.requireNonNull(gVar);
                Intrinsics.checkNotNullParameter(connection, "connection");
                byte[] bArr2 = qe.c.f14512a;
                if (connection.f13689i || gVar.f15458e == 0) {
                    connection.f13689i = true;
                    gVar.d.remove(connection);
                    if (gVar.d.isEmpty()) {
                        gVar.f15456b.a();
                    }
                    z10 = true;
                } else {
                    gVar.f15456b.c(gVar.f15457c, 0L);
                }
                if (z10) {
                    Socket socket = connection.f13684c;
                    Intrinsics.checkNotNull(socket);
                    return socket;
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // pe.d
    public u m() {
        return this.G;
    }
}
