package we;

import bf.w;
import bf.y;
import bf.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public long f17564a;

    /* renamed from: b  reason: collision with root package name */
    public long f17565b;

    /* renamed from: c  reason: collision with root package name */
    public long f17566c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<pe.o> f17567e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17568f;

    /* renamed from: g  reason: collision with root package name */
    public final b f17569g;

    /* renamed from: h  reason: collision with root package name */
    public final a f17570h;

    /* renamed from: i  reason: collision with root package name */
    public final c f17571i;

    /* renamed from: j  reason: collision with root package name */
    public final c f17572j;

    /* renamed from: k  reason: collision with root package name */
    public ErrorCode f17573k;

    /* renamed from: l  reason: collision with root package name */
    public IOException f17574l;

    /* renamed from: m  reason: collision with root package name */
    public final int f17575m;
    public final d n;

    /* loaded from: classes3.dex */
    public final class a implements w {

        /* renamed from: c  reason: collision with root package name */
        public final bf.f f17576c = new bf.f();

        /* renamed from: f  reason: collision with root package name */
        public boolean f17577f;

        /* renamed from: j  reason: collision with root package name */
        public boolean f17578j;

        public a(boolean z10) {
            this.f17578j = z10;
        }

        public final void a(boolean z10) {
            long min;
            boolean z11;
            synchronized (m.this) {
                m.this.f17572j.h();
                while (true) {
                    m mVar = m.this;
                    if (mVar.f17566c < mVar.d || this.f17578j || this.f17577f || mVar.f() != null) {
                        break;
                    }
                    m.this.l();
                }
                m.this.f17572j.l();
                m.this.b();
                m mVar2 = m.this;
                min = Math.min(mVar2.d - mVar2.f17566c, this.f17576c.f3669f);
                m mVar3 = m.this;
                mVar3.f17566c += min;
                z11 = z10 && min == this.f17576c.f3669f && mVar3.f() == null;
                Unit unit = Unit.INSTANCE;
            }
            m.this.f17572j.h();
            try {
                m mVar4 = m.this;
                mVar4.n.i(mVar4.f17575m, z11, this.f17576c, min);
            } finally {
                m.this.f17572j.l();
            }
        }

        @Override // bf.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m mVar = m.this;
            byte[] bArr = qe.c.f14512a;
            synchronized (mVar) {
                if (this.f17577f) {
                    return;
                }
                boolean z10 = m.this.f() == null;
                Unit unit = Unit.INSTANCE;
                m mVar2 = m.this;
                if (!mVar2.f17570h.f17578j) {
                    if (this.f17576c.f3669f > 0) {
                        while (this.f17576c.f3669f > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        mVar2.n.i(mVar2.f17575m, true, null, 0L);
                    }
                }
                synchronized (m.this) {
                    this.f17577f = true;
                    Unit unit2 = Unit.INSTANCE;
                }
                m.this.n.P.flush();
                m.this.a();
            }
        }

        @Override // bf.w, java.io.Flushable
        public void flush() {
            m mVar = m.this;
            byte[] bArr = qe.c.f14512a;
            synchronized (mVar) {
                m.this.b();
                Unit unit = Unit.INSTANCE;
            }
            while (this.f17576c.f3669f > 0) {
                a(false);
                m.this.n.P.flush();
            }
        }

        @Override // bf.w
        public z g() {
            return m.this.f17572j;
        }

        @Override // bf.w
        public void l0(bf.f source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            byte[] bArr = qe.c.f14512a;
            this.f17576c.l0(source, j10);
            while (this.f17576c.f3669f >= 16384) {
                a(false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class b implements y {

        /* renamed from: c  reason: collision with root package name */
        public final bf.f f17580c = new bf.f();

        /* renamed from: f  reason: collision with root package name */
        public final bf.f f17581f = new bf.f();

        /* renamed from: j  reason: collision with root package name */
        public boolean f17582j;

        /* renamed from: m  reason: collision with root package name */
        public final long f17583m;
        public boolean n;

        public b(long j10, boolean z10) {
            this.f17583m = j10;
            this.n = z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // bf.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long O(bf.f r12, long r13) {
            /*
                Method dump skipped, instructions count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: we.m.b.O(bf.f, long):long");
        }

        public final void a(long j10) {
            m mVar = m.this;
            byte[] bArr = qe.c.f14512a;
            mVar.n.h(j10);
        }

        @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long j10;
            synchronized (m.this) {
                this.f17582j = true;
                bf.f fVar = this.f17581f;
                j10 = fVar.f3669f;
                fVar.l(j10);
                m mVar = m.this;
                if (mVar == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                mVar.notifyAll();
                Unit unit = Unit.INSTANCE;
            }
            if (j10 > 0) {
                a(j10);
            }
            m.this.a();
        }

        @Override // bf.y
        public z g() {
            return m.this.f17571i;
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends bf.c {
        public c() {
        }

        @Override // bf.c
        public IOException j(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // bf.c
        public void k() {
            m.this.e(ErrorCode.CANCEL);
            d dVar = m.this.n;
            synchronized (dVar) {
                long j10 = dVar.F;
                long j11 = dVar.E;
                if (j10 < j11) {
                    return;
                }
                dVar.E = j11 + 1;
                dVar.H = System.nanoTime() + 1000000000;
                Unit unit = Unit.INSTANCE;
                se.c cVar = dVar.y;
                String m10 = android.support.v4.media.b.m(new StringBuilder(), dVar.f17496m, " ping");
                cVar.c(new j(m10, true, m10, true, dVar), 0L);
            }
        }

        public final void l() {
            if (i()) {
                throw new SocketTimeoutException("timeout");
            }
        }
    }

    public m(int i10, d connection, boolean z10, boolean z11, pe.o oVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f17575m = i10;
        this.n = connection;
        this.d = connection.J.a();
        ArrayDeque<pe.o> arrayDeque = new ArrayDeque<>();
        this.f17567e = arrayDeque;
        this.f17569g = new b(connection.I.a(), z11);
        this.f17570h = new a(z10);
        this.f17571i = new c();
        this.f17572j = new c();
        if (oVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else if (!(!h())) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else {
            arrayDeque.add(oVar);
        }
    }

    public final void a() {
        boolean z10;
        boolean i10;
        byte[] bArr = qe.c.f14512a;
        synchronized (this) {
            b bVar = this.f17569g;
            if (!bVar.n && bVar.f17582j) {
                a aVar = this.f17570h;
                if (aVar.f17578j || aVar.f17577f) {
                    z10 = true;
                    i10 = i();
                    Unit unit = Unit.INSTANCE;
                }
            }
            z10 = false;
            i10 = i();
            Unit unit2 = Unit.INSTANCE;
        }
        if (z10) {
            c(ErrorCode.CANCEL, null);
        } else if (i10) {
        } else {
            this.n.e(this.f17575m);
        }
    }

    public final void b() {
        a aVar = this.f17570h;
        if (aVar.f17577f) {
            throw new IOException("stream closed");
        }
        if (aVar.f17578j) {
            throw new IOException("stream finished");
        }
        if (this.f17573k != null) {
            IOException iOException = this.f17574l;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f17573k;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void c(ErrorCode statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            d dVar = this.n;
            int i10 = this.f17575m;
            Objects.requireNonNull(dVar);
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            dVar.P.i(i10, statusCode);
        }
    }

    public final boolean d(ErrorCode errorCode, IOException iOException) {
        byte[] bArr = qe.c.f14512a;
        synchronized (this) {
            if (this.f17573k != null) {
                return false;
            }
            if (this.f17569g.n && this.f17570h.f17578j) {
                return false;
            }
            this.f17573k = errorCode;
            this.f17574l = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.n.e(this.f17575m);
            return true;
        }
    }

    public final void e(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.n.m(this.f17575m, errorCode);
        }
    }

    public final synchronized ErrorCode f() {
        return this.f17573k;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final bf.w g() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f17568f     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.h()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            we.m$a r0 = r2.f17570h
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: we.m.g():bf.w");
    }

    public final boolean h() {
        return this.n.f17493c == ((this.f17575m & 1) == 1);
    }

    public final synchronized boolean i() {
        if (this.f17573k != null) {
            return false;
        }
        b bVar = this.f17569g;
        if (bVar.n || bVar.f17582j) {
            a aVar = this.f17570h;
            if (aVar.f17578j || aVar.f17577f) {
                if (this.f17568f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0008, B:8:0x0010, B:11:0x001f, B:12:0x0023, B:9:0x0016), top: B:20:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(pe.o r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = qe.c.f14512a
            monitor-enter(r2)
            boolean r0 = r2.f17568f     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            we.m$b r3 = r2.f17569g     // Catch: java.lang.Throwable -> L37
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L37
            goto L1d
        L16:
            r2.f17568f = r1     // Catch: java.lang.Throwable -> L37
            java.util.ArrayDeque<pe.o> r0 = r2.f17567e     // Catch: java.lang.Throwable -> L37
            r0.add(r3)     // Catch: java.lang.Throwable -> L37
        L1d:
            if (r4 == 0) goto L23
            we.m$b r3 = r2.f17569g     // Catch: java.lang.Throwable -> L37
            r3.n = r1     // Catch: java.lang.Throwable -> L37
        L23:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L37
            r2.notifyAll()     // Catch: java.lang.Throwable -> L37
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            if (r3 != 0) goto L36
            we.d r3 = r2.n
            int r4 = r2.f17575m
            r3.e(r4)
        L36:
            return
        L37:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: we.m.j(pe.o, boolean):void");
    }

    public final synchronized void k(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f17573k == null) {
            this.f17573k = errorCode;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
