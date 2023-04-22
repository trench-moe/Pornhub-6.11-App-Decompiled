package ve;

import bf.g;
import bf.h;
import bf.k;
import bf.w;
import bf.y;
import bf.z;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import pe.j;
import pe.o;
import pe.p;
import pe.t;
import pe.u;
import pe.y;

/* loaded from: classes3.dex */
public final class b implements ue.d {

    /* renamed from: a  reason: collision with root package name */
    public int f16206a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.a f16207b;

    /* renamed from: c  reason: collision with root package name */
    public o f16208c;
    public final t d;

    /* renamed from: e  reason: collision with root package name */
    public final okhttp3.internal.connection.a f16209e;

    /* renamed from: f  reason: collision with root package name */
    public final h f16210f;

    /* renamed from: g  reason: collision with root package name */
    public final g f16211g;

    /* loaded from: classes3.dex */
    public abstract class a implements y {

        /* renamed from: c  reason: collision with root package name */
        public final k f16212c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16213f;

        public a() {
            this.f16212c = new k(b.this.f16210f.g());
        }

        @Override // bf.y
        public long O(bf.f sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return b.this.f16210f.O(sink, j10);
            } catch (IOException e10) {
                b.this.f16209e.l();
                a();
                throw e10;
            }
        }

        public final void a() {
            b bVar = b.this;
            int i10 = bVar.f16206a;
            if (i10 == 6) {
                return;
            }
            if (i10 == 5) {
                b.i(bVar, this.f16212c);
                b.this.f16206a = 6;
                return;
            }
            StringBuilder m10 = a1.a.m("state: ");
            m10.append(b.this.f16206a);
            throw new IllegalStateException(m10.toString());
        }

        @Override // bf.y
        public z g() {
            return this.f16212c;
        }
    }

    /* renamed from: ve.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0281b implements w {

        /* renamed from: c  reason: collision with root package name */
        public final k f16215c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16216f;

        public C0281b() {
            this.f16215c = new k(b.this.f16211g.g());
        }

        @Override // bf.w, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f16216f) {
                return;
            }
            this.f16216f = true;
            b.this.f16211g.N("0\r\n\r\n");
            b.i(b.this, this.f16215c);
            b.this.f16206a = 3;
        }

        @Override // bf.w, java.io.Flushable
        public synchronized void flush() {
            if (this.f16216f) {
                return;
            }
            b.this.f16211g.flush();
        }

        @Override // bf.w
        public z g() {
            return this.f16215c;
        }

        @Override // bf.w
        public void l0(bf.f source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f16216f)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            b.this.f16211g.U(j10);
            b.this.f16211g.N("\r\n");
            b.this.f16211g.l0(source, j10);
            b.this.f16211g.N("\r\n");
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends a {

        /* renamed from: m  reason: collision with root package name */
        public long f16218m;
        public boolean n;

        /* renamed from: t  reason: collision with root package name */
        public final p f16219t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ b f16220u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, p url) {
            super();
            Intrinsics.checkNotNullParameter(url, "url");
            this.f16220u = bVar;
            this.f16219t = url;
            this.f16218m = -1L;
            this.n = true;
        }

        @Override // ve.b.a, bf.y
        public long O(bf.f sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            boolean z10 = true;
            if (j10 >= 0) {
                if (!this.f16213f) {
                    if (this.n) {
                        long j11 = this.f16218m;
                        if (j11 == 0 || j11 == -1) {
                            if (j11 != -1) {
                                this.f16220u.f16210f.a0();
                            }
                            try {
                                this.f16218m = this.f16220u.f16210f.n0();
                                String a02 = this.f16220u.f16210f.a0();
                                if (a02 != null) {
                                    String obj = StringsKt.trim((CharSequence) a02).toString();
                                    if (this.f16218m >= 0) {
                                        if (obj.length() <= 0) {
                                            z10 = false;
                                        }
                                        if (!z10 || StringsKt.startsWith$default(obj, ";", false, 2, (Object) null)) {
                                            if (this.f16218m == 0) {
                                                this.n = false;
                                                b bVar = this.f16220u;
                                                bVar.f16208c = bVar.f16207b.a();
                                                t tVar = this.f16220u.d;
                                                Intrinsics.checkNotNull(tVar);
                                                j jVar = tVar.f14028z;
                                                p pVar = this.f16219t;
                                                o oVar = this.f16220u.f16208c;
                                                Intrinsics.checkNotNull(oVar);
                                                ue.e.b(jVar, pVar, oVar);
                                                a();
                                            }
                                            if (!this.n) {
                                                return -1L;
                                            }
                                        }
                                    }
                                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f16218m + obj + Typography.quote);
                                }
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            } catch (NumberFormatException e10) {
                                throw new ProtocolException(e10.getMessage());
                            }
                        }
                        long O = super.O(sink, Math.min(j10, this.f16218m));
                        if (O != -1) {
                            this.f16218m -= O;
                            return O;
                        }
                        this.f16220u.f16209e.l();
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        a();
                        throw protocolException;
                    }
                    return -1L;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
        }

        @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16213f) {
                return;
            }
            if (this.n && !qe.c.h(this, 100, TimeUnit.MILLISECONDS)) {
                this.f16220u.f16209e.l();
                a();
            }
            this.f16213f = true;
        }
    }

    /* loaded from: classes3.dex */
    public final class d extends a {

        /* renamed from: m  reason: collision with root package name */
        public long f16221m;

        public d(long j10) {
            super();
            this.f16221m = j10;
            if (j10 == 0) {
                a();
            }
        }

        @Override // ve.b.a, bf.y
        public long O(bf.f sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 >= 0) {
                if (!this.f16213f) {
                    long j11 = this.f16221m;
                    if (j11 == 0) {
                        return -1L;
                    }
                    long O = super.O(sink, Math.min(j11, j10));
                    if (O == -1) {
                        b.this.f16209e.l();
                        ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                        a();
                        throw protocolException;
                    }
                    long j12 = this.f16221m - O;
                    this.f16221m = j12;
                    if (j12 == 0) {
                        a();
                    }
                    return O;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
        }

        @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16213f) {
                return;
            }
            if (this.f16221m != 0 && !qe.c.h(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.f16209e.l();
                a();
            }
            this.f16213f = true;
        }
    }

    /* loaded from: classes3.dex */
    public final class e implements w {

        /* renamed from: c  reason: collision with root package name */
        public final k f16222c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f16223f;

        public e() {
            this.f16222c = new k(b.this.f16211g.g());
        }

        @Override // bf.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16223f) {
                return;
            }
            this.f16223f = true;
            b.i(b.this, this.f16222c);
            b.this.f16206a = 3;
        }

        @Override // bf.w, java.io.Flushable
        public void flush() {
            if (this.f16223f) {
                return;
            }
            b.this.f16211g.flush();
        }

        @Override // bf.w
        public z g() {
            return this.f16222c;
        }

        @Override // bf.w
        public void l0(bf.f source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f16223f)) {
                throw new IllegalStateException("closed".toString());
            }
            qe.c.c(source.f3669f, 0L, j10);
            b.this.f16211g.l0(source, j10);
        }
    }

    /* loaded from: classes3.dex */
    public final class f extends a {

        /* renamed from: m  reason: collision with root package name */
        public boolean f16225m;

        public f(b bVar) {
            super();
        }

        @Override // ve.b.a, bf.y
        public long O(bf.f sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j10 >= 0) {
                if (!this.f16213f) {
                    if (this.f16225m) {
                        return -1L;
                    }
                    long O = super.O(sink, j10);
                    if (O == -1) {
                        this.f16225m = true;
                        a();
                        return -1L;
                    }
                    return O;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(android.support.v4.media.b.h("byteCount < 0: ", j10).toString());
        }

        @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16213f) {
                return;
            }
            if (!this.f16225m) {
                a();
            }
            this.f16213f = true;
        }
    }

    public b(t tVar, okhttp3.internal.connection.a connection, h source, g sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.d = tVar;
        this.f16209e = connection;
        this.f16210f = source;
        this.f16211g = sink;
        this.f16207b = new ve.a(source);
    }

    public static final void i(b bVar, k kVar) {
        Objects.requireNonNull(bVar);
        z zVar = kVar.f3673e;
        z delegate = z.d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        kVar.f3673e = delegate;
        zVar.a();
        zVar.b();
    }

    @Override // ue.d
    public void a(u request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = this.f16209e.f13696q.f13918b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f14050c);
        sb2.append(' ');
        p url = request.f14049b;
        if (!url.f13987a && proxyType == Proxy.Type.HTTP) {
            sb2.append(url);
        } else {
            Intrinsics.checkNotNullParameter(url, "url");
            String b10 = url.b();
            String d10 = url.d();
            if (d10 != null) {
                b10 = b10 + '?' + d10;
            }
            sb2.append(b10);
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        k(request.d, sb3);
    }

    @Override // ue.d
    public void b() {
        this.f16211g.flush();
    }

    @Override // ue.d
    public long c(pe.y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (ue.e.a(response)) {
            if (StringsKt.equals("chunked", pe.y.d(response, "Transfer-Encoding", null, 2), true)) {
                return -1L;
            }
            return qe.c.k(response);
        }
        return 0L;
    }

    @Override // ue.d
    public void cancel() {
        Socket socket = this.f16209e.f13683b;
        if (socket != null) {
            qe.c.e(socket);
        }
    }

    @Override // ue.d
    public y d(pe.y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (ue.e.a(response)) {
            if (StringsKt.equals("chunked", pe.y.d(response, "Transfer-Encoding", null, 2), true)) {
                p pVar = response.f14062c.f14049b;
                if (this.f16206a == 4) {
                    this.f16206a = 5;
                    return new c(this, pVar);
                }
                StringBuilder m10 = a1.a.m("state: ");
                m10.append(this.f16206a);
                throw new IllegalStateException(m10.toString().toString());
            }
            long k10 = qe.c.k(response);
            if (k10 != -1) {
                return j(k10);
            }
            if (this.f16206a == 4) {
                this.f16206a = 5;
                this.f16209e.l();
                return new f(this);
            }
            StringBuilder m11 = a1.a.m("state: ");
            m11.append(this.f16206a);
            throw new IllegalStateException(m11.toString().toString());
        }
        return j(0L);
    }

    @Override // ue.d
    public y.a e(boolean z10) {
        int i10 = this.f16206a;
        boolean z11 = true;
        if (i10 != 1 && i10 != 3) {
            z11 = false;
        }
        if (!z11) {
            StringBuilder m10 = a1.a.m("state: ");
            m10.append(this.f16206a);
            throw new IllegalStateException(m10.toString().toString());
        }
        try {
            ue.j a10 = ue.j.a(this.f16207b.b());
            y.a aVar = new y.a();
            aVar.f(a10.f15896a);
            aVar.f14072c = a10.f15897b;
            aVar.e(a10.f15898c);
            aVar.d(this.f16207b.a());
            if (z10 && a10.f15897b == 100) {
                return null;
            }
            if (a10.f15897b == 100) {
                this.f16206a = 3;
                return aVar;
            }
            this.f16206a = 4;
            return aVar;
        } catch (EOFException e10) {
            throw new IOException(a1.a.l("unexpected end of stream on ", this.f16209e.f13696q.f13917a.f13906a.g()), e10);
        }
    }

    @Override // ue.d
    public okhttp3.internal.connection.a f() {
        return this.f16209e;
    }

    @Override // ue.d
    public void g() {
        this.f16211g.flush();
    }

    @Override // ue.d
    public w h(u request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (StringsKt.equals("chunked", request.b("Transfer-Encoding"), true)) {
            if (this.f16206a == 1) {
                this.f16206a = 2;
                return new C0281b();
            }
            StringBuilder m10 = a1.a.m("state: ");
            m10.append(this.f16206a);
            throw new IllegalStateException(m10.toString().toString());
        } else if (j10 != -1) {
            if (this.f16206a == 1) {
                this.f16206a = 2;
                return new e();
            }
            StringBuilder m11 = a1.a.m("state: ");
            m11.append(this.f16206a);
            throw new IllegalStateException(m11.toString().toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    public final bf.y j(long j10) {
        if (this.f16206a == 4) {
            this.f16206a = 5;
            return new d(j10);
        }
        StringBuilder m10 = a1.a.m("state: ");
        m10.append(this.f16206a);
        throw new IllegalStateException(m10.toString().toString());
    }

    public final void k(o headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (!(this.f16206a == 0)) {
            StringBuilder m10 = a1.a.m("state: ");
            m10.append(this.f16206a);
            throw new IllegalStateException(m10.toString().toString());
        }
        this.f16211g.N(requestLine).N("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f16211g.N(headers.e(i10)).N(": ").N(headers.h(i10)).N("\r\n");
        }
        this.f16211g.N("\r\n");
        this.f16206a = 1;
    }
}
