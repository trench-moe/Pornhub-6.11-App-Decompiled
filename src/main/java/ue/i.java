package ue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.b;
import okhttp3.internal.http2.ConnectionShutdownException;
import pe.a0;
import pe.b0;
import pe.o;
import pe.p;
import pe.q;
import pe.t;
import pe.u;
import pe.x;
import pe.y;

/* loaded from: classes3.dex */
public final class i implements q {

    /* renamed from: a  reason: collision with root package name */
    public final t f15895a;

    public i(t client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f15895a = client;
    }

    @Override // pe.q
    public y a(q.a chain) {
        List list;
        int i10;
        te.e eVar;
        g gVar;
        i iVar;
        List plus;
        boolean z10;
        te.e eVar2;
        u uVar;
        Protocol protocol;
        int i11;
        String str;
        Handshake handshake;
        o.a g10;
        a0 a0Var;
        y yVar;
        y yVar2;
        long j10;
        g gVar2;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        te.e eVar3 = this;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar3 = (g) chain;
        u uVar2 = gVar3.f15888f;
        te.e eVar4 = gVar3.f15885b;
        boolean z11 = true;
        List emptyList = CollectionsKt.emptyList();
        int i12 = 0;
        y response = null;
        u request = uVar2;
        boolean z12 = true;
        while (true) {
            Objects.requireNonNull(eVar4);
            Intrinsics.checkNotNullParameter(request, "request");
            if (!(eVar4.y == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (eVar4) {
                try {
                } catch (Throwable th) {
                    th = th;
                    eVar3 = eVar4;
                }
                try {
                    if (!(eVar4.A ^ z11)) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                    }
                    if (!(eVar4.f15449z ^ z11)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            if (z12) {
                te.g gVar4 = eVar4.f15442c;
                p pVar = request.f14049b;
                if (pVar.f13987a) {
                    t tVar = eVar4.F;
                    SSLSocketFactory sSLSocketFactory2 = tVar.E;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    HostnameVerifier hostnameVerifier2 = tVar.I;
                    certificatePinner = tVar.J;
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = hostnameVerifier2;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    certificatePinner = null;
                }
                String str2 = pVar.f13990e;
                int i13 = pVar.f13991f;
                t tVar2 = eVar4.F;
                list = emptyList;
                i10 = i12;
                pe.a aVar = r15;
                pe.a aVar2 = new pe.a(str2, i13, tVar2.A, tVar2.D, sSLSocketFactory, hostnameVerifier, certificatePinner, tVar2.C, null, tVar2.H, tVar2.G, tVar2.B);
                eVar4.f15446t = new te.d(gVar4, aVar, eVar4, eVar4.f15443f);
                eVar = aVar;
            } else {
                list = emptyList;
                i10 = i12;
                eVar = eVar3;
            }
            try {
                if (eVar4.C) {
                    throw new IOException("Canceled");
                }
                try {
                    y response2 = gVar3.c(request);
                    if (response != null) {
                        try {
                            Intrinsics.checkNotNullParameter(response2, "response");
                            uVar = response2.f14062c;
                            protocol = response2.f14063f;
                            i11 = response2.f14065m;
                            str = response2.f14064j;
                            handshake = response2.n;
                            g10 = response2.f14066t.g();
                            a0Var = response2.f14067u;
                            yVar = response2.f14068w;
                            yVar2 = response2.y;
                            j10 = response2.A;
                            gVar2 = gVar3;
                            eVar2 = eVar4;
                        } catch (Throwable th3) {
                            th = th3;
                            eVar2 = eVar4;
                        }
                        try {
                            long j11 = response2.B;
                            te.c cVar = response2.C;
                            gVar = gVar2;
                            Intrinsics.checkNotNullParameter(response, "response");
                            u uVar3 = response.f14062c;
                            Protocol protocol2 = response.f14063f;
                            int i14 = response.f14065m;
                            String str3 = response.f14064j;
                            Handshake handshake2 = response.n;
                            o.a g11 = response.f14066t.g();
                            y yVar3 = response.f14068w;
                            y yVar4 = response.y;
                            y yVar5 = response.f14069z;
                            long j12 = response.A;
                            long j13 = response.B;
                            te.c cVar2 = response.C;
                            if (!(i14 >= 0)) {
                                throw new IllegalStateException(("code < 0: " + i14).toString());
                            } else if (uVar3 == null) {
                                throw new IllegalStateException("request == null".toString());
                            } else {
                                if (protocol2 == null) {
                                    throw new IllegalStateException("protocol == null".toString());
                                }
                                if (str3 == null) {
                                    throw new IllegalStateException("message == null".toString());
                                }
                                y yVar6 = new y(uVar3, protocol2, str3, i14, handshake2, g11.c(), null, yVar3, yVar4, yVar5, j12, j13, cVar2);
                                if (!(yVar6.f14067u == null)) {
                                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                                }
                                if (!(i11 >= 0)) {
                                    throw new IllegalStateException(("code < 0: " + i11).toString());
                                } else if (uVar == null) {
                                    throw new IllegalStateException("request == null".toString());
                                } else {
                                    if (protocol == null) {
                                        throw new IllegalStateException("protocol == null".toString());
                                    }
                                    if (str == null) {
                                        throw new IllegalStateException("message == null".toString());
                                    }
                                    response2 = new y(uVar, protocol, str, i11, handshake, g10.c(), a0Var, yVar, yVar2, yVar6, j10, j11, cVar);
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            eVar = eVar2;
                            eVar.f(true);
                            throw th;
                        }
                    } else {
                        gVar = gVar3;
                        eVar2 = eVar4;
                    }
                    response = response2;
                    eVar = eVar2;
                } catch (IOException e10) {
                    gVar = gVar3;
                    eVar = eVar4;
                    iVar = this;
                    if (!iVar.c(e10, eVar, request, !(e10 instanceof ConnectionShutdownException))) {
                        qe.c.z(e10, list);
                        throw e10;
                    }
                    plus = CollectionsKt.plus((Collection<? extends IOException>) list, e10);
                    z10 = true;
                    eVar.f(z10);
                    emptyList = plus;
                    i12 = i10;
                    z12 = false;
                    eVar4 = eVar;
                    eVar3 = iVar;
                    gVar3 = gVar;
                    z11 = true;
                } catch (RouteException e11) {
                    gVar = gVar3;
                    eVar = eVar4;
                    List list2 = list;
                    iVar = this;
                    if (!iVar.c(e11.c(), eVar, request, false)) {
                        IOException b10 = e11.b();
                        qe.c.z(b10, list2);
                        throw b10;
                    }
                    plus = CollectionsKt.plus((Collection<? extends IOException>) list2, e11.b());
                    z10 = true;
                    eVar.f(z10);
                    emptyList = plus;
                    i12 = i10;
                    z12 = false;
                    eVar4 = eVar;
                    eVar3 = iVar;
                    gVar3 = gVar;
                    z11 = true;
                }
                try {
                    te.c cVar3 = eVar.y;
                    iVar = this;
                    try {
                        u b11 = iVar.b(response, cVar3);
                        if (b11 == null) {
                            if (cVar3 != null && cVar3.f15419a) {
                                if (!(!eVar.f15448w)) {
                                    throw new IllegalStateException("Check failed.".toString());
                                }
                                eVar.f15448w = true;
                                eVar.f15444j.i();
                            }
                            eVar.f(false);
                            return response;
                        }
                        a0 a0Var2 = response.f14067u;
                        if (a0Var2 != null) {
                            qe.c.d(a0Var2);
                        }
                        i12 = i10 + 1;
                        if (i12 > 20) {
                            throw new ProtocolException("Too many follow-up requests: " + i12);
                        }
                        eVar.f(true);
                        request = b11;
                        emptyList = list;
                        z12 = true;
                        eVar4 = eVar;
                        eVar3 = iVar;
                        gVar3 = gVar;
                        z11 = true;
                    } catch (Throwable th5) {
                        th = th5;
                        eVar.f(true);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    eVar.f(true);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                eVar = eVar4;
            }
        }
    }

    public final u b(y yVar, te.c cVar) {
        String link;
        okhttp3.internal.connection.a aVar;
        b0 b0Var = (cVar == null || (aVar = cVar.f15420b) == null) ? null : aVar.f13696q;
        int i10 = yVar.f14065m;
        String method = yVar.f14062c.f14050c;
        boolean z10 = false;
        if (i10 != 307 && i10 != 308) {
            if (i10 != 401) {
                if (i10 == 421) {
                    if (cVar == null || !(!Intrinsics.areEqual(cVar.f15422e.f15439h.f13906a.f13990e, cVar.f15420b.f13696q.f13917a.f13906a.f13990e))) {
                        return null;
                    }
                    okhttp3.internal.connection.a aVar2 = cVar.f15420b;
                    synchronized (aVar2) {
                        aVar2.f13690j = true;
                    }
                    return yVar.f14062c;
                } else if (i10 == 503) {
                    y yVar2 = yVar.f14069z;
                    if ((yVar2 == null || yVar2.f14065m != 503) && d(yVar, IntCompanionObject.MAX_VALUE) == 0) {
                        return yVar.f14062c;
                    }
                    return null;
                } else if (i10 == 407) {
                    Intrinsics.checkNotNull(b0Var);
                    if (b0Var.f13918b.type() == Proxy.Type.HTTP) {
                        return this.f15895a.C.a(b0Var, yVar);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                } else if (i10 == 408) {
                    if (this.f15895a.f14025t) {
                        y yVar3 = yVar.f14069z;
                        if ((yVar3 == null || yVar3.f14065m != 408) && d(yVar, 0) <= 0) {
                            return yVar.f14062c;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (i10) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.f15895a.f14026u.a(b0Var, yVar);
            }
        }
        if (this.f15895a.f14027w && (link = y.d(yVar, "Location", null, 2)) != null) {
            p pVar = yVar.f14062c.f14049b;
            Objects.requireNonNull(pVar);
            Intrinsics.checkNotNullParameter(link, "link");
            p.a f10 = pVar.f(link);
            p a10 = f10 != null ? f10.a() : null;
            if (a10 != null) {
                if (Intrinsics.areEqual(a10.f13988b, yVar.f14062c.f14049b.f13988b) || this.f15895a.y) {
                    u uVar = yVar.f14062c;
                    Objects.requireNonNull(uVar);
                    u.a aVar3 = new u.a(uVar);
                    if (f.a(method)) {
                        int i11 = yVar.f14065m;
                        Intrinsics.checkNotNullParameter(method, "method");
                        z10 = (Intrinsics.areEqual(method, "PROPFIND") || i11 == 308 || i11 == 307) ? true : true;
                        Intrinsics.checkNotNullParameter(method, "method");
                        if (!(true ^ Intrinsics.areEqual(method, "PROPFIND")) || i11 == 308 || i11 == 307) {
                            aVar3.d(method, z10 ? yVar.f14062c.f14051e : null);
                        } else {
                            aVar3.d("GET", null);
                        }
                        if (!z10) {
                            aVar3.e("Transfer-Encoding");
                            aVar3.e("Content-Length");
                            aVar3.e("Content-Type");
                        }
                    }
                    if (!qe.c.a(yVar.f14062c.f14049b, a10)) {
                        aVar3.e("Authorization");
                    }
                    aVar3.h(a10);
                    return aVar3.a();
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final boolean c(IOException iOException, te.e eVar, u uVar, boolean z10) {
        boolean z11;
        okhttp3.internal.connection.b bVar;
        okhttp3.internal.connection.a aVar;
        if (this.f15895a.f14025t) {
            if (z10) {
                x xVar = uVar.f14051e;
                if (iOException instanceof FileNotFoundException) {
                    return false;
                }
            }
            if (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) : !((iOException instanceof SocketTimeoutException) && !z10))) {
                te.d dVar = eVar.f15446t;
                Intrinsics.checkNotNull(dVar);
                int i10 = dVar.f15435c;
                if (i10 == 0 && dVar.d == 0 && dVar.f15436e == 0) {
                    z11 = false;
                } else {
                    if (dVar.f15437f == null) {
                        b0 b0Var = null;
                        if (i10 <= 1 && dVar.d <= 1 && dVar.f15436e <= 0 && (aVar = dVar.f15440i.f15447u) != null) {
                            synchronized (aVar) {
                                if (aVar.f13691k == 0) {
                                    if (qe.c.a(aVar.f13696q.f13917a.f13906a, dVar.f15439h.f13906a)) {
                                        b0Var = aVar.f13696q;
                                    }
                                }
                            }
                        }
                        if (b0Var != null) {
                            dVar.f15437f = b0Var;
                        } else {
                            b.a aVar2 = dVar.f15433a;
                            if ((aVar2 == null || !aVar2.a()) && (bVar = dVar.f15434b) != null) {
                                z11 = bVar.a();
                            }
                        }
                    }
                    z11 = true;
                }
                return z11;
            }
            return false;
        }
        return false;
    }

    public final int d(y yVar, int i10) {
        String d = y.d(yVar, "Retry-After", null, 2);
        if (d != null) {
            if (new Regex("\\d+").matches(d)) {
                Integer valueOf = Integer.valueOf(d);
                Intrinsics.checkNotNullExpressionValue(valueOf, "Integer.valueOf(header)");
                return valueOf.intValue();
            }
            return IntCompanionObject.MAX_VALUE;
        }
        return i10;
    }
}
