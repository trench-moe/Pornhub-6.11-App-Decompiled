package okhttp3.internal.connection;

import af.c;
import bf.h;
import io.reactivex.annotations.SchedulerSupport;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.http2.ErrorCode;
import pe.b0;
import pe.g;
import pe.p;
import pe.t;
import te.e;
import te.f;
import we.d;
import we.k;
import we.m;
import we.n;
import we.q;
import xe.h;

/* loaded from: classes3.dex */
public final class a extends d.c implements g {

    /* renamed from: b  reason: collision with root package name */
    public Socket f13683b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f13684c;
    public Handshake d;

    /* renamed from: e  reason: collision with root package name */
    public Protocol f13685e;

    /* renamed from: f  reason: collision with root package name */
    public d f13686f;

    /* renamed from: g  reason: collision with root package name */
    public h f13687g;

    /* renamed from: h  reason: collision with root package name */
    public bf.g f13688h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f13689i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13690j;

    /* renamed from: k  reason: collision with root package name */
    public int f13691k;

    /* renamed from: l  reason: collision with root package name */
    public int f13692l;

    /* renamed from: m  reason: collision with root package name */
    public int f13693m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public final List<Reference<e>> f13694o;

    /* renamed from: p  reason: collision with root package name */
    public long f13695p;

    /* renamed from: q  reason: collision with root package name */
    public final b0 f13696q;

    public a(te.g connectionPool, b0 route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f13696q = route;
        this.n = 1;
        this.f13694o = new ArrayList();
        this.f13695p = Long.MAX_VALUE;
    }

    @Override // we.d.c
    public synchronized void a(d connection, q settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.n = (settings.f17599a & 16) != 0 ? settings.f17600b[4] : IntCompanionObject.MAX_VALUE;
    }

    @Override // we.d.c
    public void b(m stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(ErrorCode.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015b A[EDGE_INSN: B:94:0x015b->B:81:0x015b ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r17, int r18, int r19, int r20, boolean r21, pe.d r22, pe.m r23) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.a.c(int, int, int, int, boolean, pe.d, pe.m):void");
    }

    public final void d(t client, b0 failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f13918b.type() != Proxy.Type.DIRECT) {
            pe.a aVar = failedRoute.f13917a;
            aVar.f13915k.connectFailed(aVar.f13906a.h(), failedRoute.f13918b.address(), failure);
        }
        te.h hVar = client.O;
        synchronized (hVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            hVar.f15460a.add(failedRoute);
        }
    }

    public final void e(int i10, int i11, pe.d call, pe.m mVar) {
        Socket socket;
        int i12;
        b0 b0Var = this.f13696q;
        Proxy proxy = b0Var.f13918b;
        pe.a aVar = b0Var.f13917a;
        Proxy.Type type = proxy.type();
        if (type != null && ((i12 = f.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i12 == 2)) {
            socket = aVar.f13909e.createSocket();
            Intrinsics.checkNotNull(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.f13683b = socket;
        InetSocketAddress inetSocketAddress = this.f13696q.f13919c;
        Objects.requireNonNull(mVar);
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        socket.setSoTimeout(i11);
        try {
            h.a aVar2 = xe.h.f18380c;
            xe.h.f18378a.e(socket, this.f13696q.f13919c, i10);
            try {
                this.f13687g = cb.e.o(cb.e.e0(socket));
                this.f13688h = cb.e.n(cb.e.c0(socket));
            } catch (NullPointerException e10) {
                if (Intrinsics.areEqual(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            StringBuilder m10 = a1.a.m("Failed to connect to ");
            m10.append(this.f13696q.f13919c);
            ConnectException connectException = new ConnectException(m10.toString());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x017e, code lost:
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0180, code lost:
        r5 = r19.f13683b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0182, code lost:
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0184, code lost:
        qe.c.e(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0187, code lost:
        r5 = null;
        r19.f13683b = null;
        r19.f13688h = null;
        r19.f13687g = null;
        r6 = r19.f13696q;
        r8 = r6.f13919c;
        r6 = r6.f13918b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r23, "call");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "inetSocketAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "proxy");
        r7 = r7 + 1;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r20, int r21, int r22, pe.d r23, pe.m r24) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.a.f(int, int, int, pe.d, pe.m):void");
    }

    public final void g(te.b bVar, int i10, pe.d call, pe.m mVar) {
        Protocol protocol = Protocol.HTTP_1_1;
        pe.a aVar = this.f13696q.f13917a;
        if (aVar.f13910f == null) {
            List<Protocol> list = aVar.f13907b;
            Protocol protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(protocol2)) {
                this.f13684c = this.f13683b;
                this.f13685e = protocol;
                return;
            }
            this.f13684c = this.f13683b;
            this.f13685e = protocol2;
            m(i10);
            return;
        }
        Objects.requireNonNull(mVar);
        Intrinsics.checkNotNullParameter(call, "call");
        final pe.a aVar2 = this.f13696q.f13917a;
        SSLSocketFactory sSLSocketFactory = aVar2.f13910f;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f13683b;
            p pVar = aVar2.f13906a;
            Socket createSocket = sSLSocketFactory.createSocket(socket, pVar.f13990e, pVar.f13991f, true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                pe.h a10 = bVar.a(sSLSocket2);
                if (a10.f13953b) {
                    h.a aVar3 = xe.h.f18380c;
                    xe.h.f18378a.d(sSLSocket2, aVar2.f13906a.f13990e, aVar2.f13907b);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                final Handshake a11 = Handshake.a(sslSocketSession);
                HostnameVerifier hostnameVerifier = aVar2.f13911g;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (hostnameVerifier.verify(aVar2.f13906a.f13990e, sslSocketSession)) {
                    final CertificatePinner certificatePinner = aVar2.f13912h;
                    Intrinsics.checkNotNull(certificatePinner);
                    this.d = new Handshake(a11.f13668b, a11.f13669c, a11.d, new Function0<List<? extends Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public List<? extends Certificate> invoke() {
                            c cVar = CertificatePinner.this.f13663b;
                            Intrinsics.checkNotNull(cVar);
                            return cVar.e(a11.c(), aVar2.f13906a.f13990e);
                        }
                    });
                    certificatePinner.b(aVar2.f13906a.f13990e, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.internal.connection.RealConnection$connectTls$2
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public List<? extends X509Certificate> invoke() {
                            Handshake handshake = a.this.d;
                            Intrinsics.checkNotNull(handshake);
                            List<Certificate> c10 = handshake.c();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(c10, 10));
                            for (Certificate certificate : c10) {
                                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                arrayList.add((X509Certificate) certificate);
                            }
                            return arrayList;
                        }
                    });
                    if (a10.f13953b) {
                        h.a aVar4 = xe.h.f18380c;
                        str = xe.h.f18378a.f(sSLSocket2);
                    }
                    this.f13684c = sSLSocket2;
                    this.f13687g = cb.e.o(cb.e.e0(sSLSocket2));
                    this.f13688h = cb.e.n(cb.e.c0(sSLSocket2));
                    if (str != null) {
                        protocol = Protocol.f13676w.a(str);
                    }
                    this.f13685e = protocol;
                    h.a aVar5 = xe.h.f18380c;
                    xe.h.f18378a.a(sSLSocket2);
                    Intrinsics.checkNotNullParameter(call, "call");
                    if (this.f13685e == Protocol.HTTP_2) {
                        m(i10);
                        return;
                    }
                    return;
                }
                List<Certificate> c10 = a11.c();
                if (!(!c10.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.f13906a.f13990e + " not verified (no certificates)");
                }
                Certificate certificate = c10.get(0);
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                X509Certificate certificate2 = (X509Certificate) certificate;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\n              |Hostname ");
                sb2.append(aVar2.f13906a.f13990e);
                sb2.append(" not verified:\n              |    certificate: ");
                sb2.append(CertificatePinner.d.a(certificate2));
                sb2.append("\n              |    DN: ");
                Principal subjectDN = certificate2.getSubjectDN();
                Intrinsics.checkNotNullExpressionValue(subjectDN, "cert.subjectDN");
                sb2.append(subjectDN.getName());
                sb2.append("\n              |    subjectAltNames: ");
                af.d dVar = af.d.f360a;
                Intrinsics.checkNotNullParameter(certificate2, "certificate");
                sb2.append(CollectionsKt.plus((Collection) dVar.a(certificate2, 7), (Iterable) dVar.a(certificate2, 2)));
                sb2.append("\n              ");
                throw new SSLPeerUnverifiedException(StringsKt.trimMargin$default(sb2.toString(), null, 1, null));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    h.a aVar6 = xe.h.f18380c;
                    xe.h.f18378a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    qe.c.e(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
        if (r8 == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(pe.a r7, java.util.List<pe.b0> r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.a.h(pe.a, java.util.List):boolean");
    }

    public final boolean i(boolean z10) {
        long j10;
        byte[] bArr = qe.c.f14512a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f13683b;
        Intrinsics.checkNotNull(socket);
        Socket isHealthy = this.f13684c;
        Intrinsics.checkNotNull(isHealthy);
        bf.h source = this.f13687g;
        Intrinsics.checkNotNull(source);
        boolean z11 = false;
        if (socket.isClosed() || isHealthy.isClosed() || isHealthy.isInputShutdown() || isHealthy.isOutputShutdown()) {
            return false;
        }
        d dVar = this.f13686f;
        if (dVar != null) {
            synchronized (dVar) {
                if (dVar.f17498u) {
                    return false;
                }
                if (dVar.F < dVar.E) {
                    if (nanoTime >= dVar.H) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j10 = nanoTime - this.f13695p;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        Intrinsics.checkNotNullParameter(isHealthy, "$this$isHealthy");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = isHealthy.getSoTimeout();
            isHealthy.setSoTimeout(1);
            boolean z12 = !source.C();
            isHealthy.setSoTimeout(soTimeout);
            z11 = z12;
            return z11;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return z11;
        }
    }

    public final boolean j() {
        return this.f13686f != null;
    }

    public final ue.d k(t client, ue.g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f13684c;
        Intrinsics.checkNotNull(socket);
        bf.h hVar = this.f13687g;
        Intrinsics.checkNotNull(hVar);
        bf.g gVar = this.f13688h;
        Intrinsics.checkNotNull(gVar);
        d dVar = this.f13686f;
        if (dVar != null) {
            return new k(client, this, chain, dVar);
        }
        socket.setSoTimeout(chain.f15890h);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g().g(chain.f15890h, timeUnit);
        gVar.g().g(chain.f15891i, timeUnit);
        return new ve.b(client, this, hVar, gVar);
    }

    public final synchronized void l() {
        this.f13689i = true;
    }

    public final void m(int i10) {
        String l10;
        int a10;
        Socket socket = this.f13684c;
        Intrinsics.checkNotNull(socket);
        bf.h source = this.f13687g;
        Intrinsics.checkNotNull(source);
        bf.g sink = this.f13688h;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        se.d taskRunner = se.d.f15017h;
        d.b bVar = new d.b(true, taskRunner);
        String peerName = this.f13696q.f13917a.f13906a.f13990e;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        bVar.f17503a = socket;
        if (bVar.f17509h) {
            l10 = qe.c.f14516f + ' ' + peerName;
        } else {
            l10 = a1.a.l("MockWebServer ", peerName);
        }
        bVar.f17504b = l10;
        bVar.f17505c = source;
        bVar.d = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        bVar.f17506e = this;
        bVar.f17508g = i10;
        d dVar = new d(bVar);
        this.f13686f = dVar;
        d dVar2 = d.T;
        q qVar = d.S;
        this.n = (qVar.f17599a & 16) != 0 ? qVar.f17600b[4] : IntCompanionObject.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        n nVar = dVar.P;
        synchronized (nVar) {
            if (nVar.f17589j) {
                throw new IOException("closed");
            }
            if (nVar.f17591t) {
                Logger logger = n.f17586u;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(qe.c.i(">> CONNECTION " + we.c.f17489a.g(), new Object[0]));
                }
                nVar.n.e0(we.c.f17489a);
                nVar.n.flush();
            }
        }
        n nVar2 = dVar.P;
        q settings = dVar.I;
        synchronized (nVar2) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (nVar2.f17589j) {
                throw new IOException("closed");
            }
            nVar2.d(0, Integer.bitCount(settings.f17599a) * 6, 4, 0);
            int i11 = 0;
            while (i11 < 10) {
                if (((1 << i11) & settings.f17599a) != 0) {
                    nVar2.n.u(i11 != 4 ? i11 != 7 ? i11 : 4 : 3);
                    nVar2.n.x(settings.f17600b[i11]);
                }
                i11++;
            }
            nVar2.n.flush();
        }
        if (dVar.I.a() != 65535) {
            dVar.P.k(0, a10 - 65535);
        }
        se.c f10 = taskRunner.f();
        String str = dVar.f17496m;
        f10.c(new se.b(dVar.Q, str, true, str, true), 0L);
    }

    public String toString() {
        Object obj;
        StringBuilder m10 = a1.a.m("Connection{");
        m10.append(this.f13696q.f13917a.f13906a.f13990e);
        m10.append(':');
        m10.append(this.f13696q.f13917a.f13906a.f13991f);
        m10.append(',');
        m10.append(" proxy=");
        m10.append(this.f13696q.f13918b);
        m10.append(" hostAddress=");
        m10.append(this.f13696q.f13919c);
        m10.append(" cipherSuite=");
        Handshake handshake = this.d;
        if (handshake == null || (obj = handshake.f13669c) == null) {
            obj = SchedulerSupport.NONE;
        }
        m10.append(obj);
        m10.append(" protocol=");
        m10.append(this.f13685e);
        m10.append('}');
        return m10.toString();
    }
}
