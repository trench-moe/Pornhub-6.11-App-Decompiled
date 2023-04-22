package we;

import bf.w;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import okio.ByteString;
import pe.t;
import pe.u;
import pe.y;
import we.m;

/* loaded from: classes3.dex */
public final class k implements ue.d {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f17547g = qe.c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f17548h = qe.c.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public volatile m f17549a;

    /* renamed from: b  reason: collision with root package name */
    public final Protocol f17550b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f17551c;
    public final okhttp3.internal.connection.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ue.g f17552e;

    /* renamed from: f  reason: collision with root package name */
    public final d f17553f;

    public k(t client, okhttp3.internal.connection.a connection, ue.g chain, d http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.d = connection;
        this.f17552e = chain;
        this.f17553f = http2Connection;
        List<Protocol> list = client.H;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f17550b = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // ue.d
    public void a(u request) {
        int i10;
        m mVar;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f17549a != null) {
            return;
        }
        boolean z10 = false;
        boolean z11 = request.f14051e != null;
        Intrinsics.checkNotNullParameter(request, "request");
        pe.o oVar = request.d;
        ArrayList requestHeaders = new ArrayList(oVar.size() + 4);
        requestHeaders.add(new a(a.f17464f, request.f14050c));
        ByteString byteString = a.f17465g;
        pe.p url = request.f14049b;
        Intrinsics.checkNotNullParameter(url, "url");
        String b10 = url.b();
        String d = url.d();
        if (d != null) {
            b10 = b10 + '?' + d;
        }
        requestHeaders.add(new a(byteString, b10));
        String b11 = request.b("Host");
        if (b11 != null) {
            requestHeaders.add(new a(a.f17467i, b11));
        }
        requestHeaders.add(new a(a.f17466h, request.f14049b.f13988b));
        int size = oVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String e10 = oVar.e(i11);
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(e10, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = e10.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            if (!f17547g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(oVar.h(i11), "trailers"))) {
                requestHeaders.add(new a(lowerCase, oVar.h(i11)));
            }
        }
        d dVar = this.f17553f;
        Objects.requireNonNull(dVar);
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z12 = !z11;
        synchronized (dVar.P) {
            synchronized (dVar) {
                if (dVar.f17497t > 1073741823) {
                    dVar.f(ErrorCode.REFUSED_STREAM);
                }
                if (dVar.f17498u) {
                    throw new ConnectionShutdownException();
                }
                i10 = dVar.f17497t;
                dVar.f17497t = i10 + 2;
                mVar = new m(i10, dVar, z12, false, null);
                z10 = (!z11 || dVar.M >= dVar.N || mVar.f17566c >= mVar.d) ? true : true;
                if (mVar.i()) {
                    dVar.f17495j.put(Integer.valueOf(i10), mVar);
                }
                Unit unit = Unit.INSTANCE;
            }
            dVar.P.f(z12, i10, requestHeaders);
        }
        if (z10) {
            dVar.P.flush();
        }
        this.f17549a = mVar;
        if (this.f17551c) {
            m mVar2 = this.f17549a;
            Intrinsics.checkNotNull(mVar2);
            mVar2.e(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        m mVar3 = this.f17549a;
        Intrinsics.checkNotNull(mVar3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mVar3.f17571i.g(this.f17552e.f15890h, timeUnit);
        m mVar4 = this.f17549a;
        Intrinsics.checkNotNull(mVar4);
        mVar4.f17572j.g(this.f17552e.f15891i, timeUnit);
    }

    @Override // ue.d
    public void b() {
        m mVar = this.f17549a;
        Intrinsics.checkNotNull(mVar);
        ((m.a) mVar.g()).close();
    }

    @Override // ue.d
    public long c(y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (ue.e.a(response)) {
            return qe.c.k(response);
        }
        return 0L;
    }

    @Override // ue.d
    public void cancel() {
        this.f17551c = true;
        m mVar = this.f17549a;
        if (mVar != null) {
            mVar.e(ErrorCode.CANCEL);
        }
    }

    @Override // ue.d
    public bf.y d(y response) {
        Intrinsics.checkNotNullParameter(response, "response");
        m mVar = this.f17549a;
        Intrinsics.checkNotNull(mVar);
        return mVar.f17569g;
    }

    @Override // ue.d
    public y.a e(boolean z10) {
        pe.o headerBlock;
        m mVar = this.f17549a;
        Intrinsics.checkNotNull(mVar);
        synchronized (mVar) {
            mVar.f17571i.h();
            while (mVar.f17567e.isEmpty() && mVar.f17573k == null) {
                mVar.l();
            }
            mVar.f17571i.l();
            if (!(!mVar.f17567e.isEmpty())) {
                IOException iOException = mVar.f17574l;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCode = mVar.f17573k;
                Intrinsics.checkNotNull(errorCode);
                throw new StreamResetException(errorCode);
            }
            pe.o removeFirst = mVar.f17567e.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
            headerBlock = removeFirst;
        }
        Protocol protocol = this.f17550b;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = headerBlock.size();
        ue.j jVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            String name = headerBlock.e(i10);
            String value = headerBlock.h(i10);
            if (Intrinsics.areEqual(name, ":status")) {
                jVar = ue.j.a("HTTP/1.1 " + value);
            } else if (!f17548h.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.trim((CharSequence) value).toString());
            }
        }
        if (jVar != null) {
            y.a aVar = new y.a();
            aVar.f(protocol);
            aVar.f14072c = jVar.f15897b;
            aVar.e(jVar.f15898c);
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            aVar.d(new pe.o((String[]) array, null));
            if (z10 && aVar.f14072c == 100) {
                return null;
            }
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // ue.d
    public okhttp3.internal.connection.a f() {
        return this.d;
    }

    @Override // ue.d
    public void g() {
        this.f17553f.P.flush();
    }

    @Override // ue.d
    public w h(u request, long j10) {
        Intrinsics.checkNotNullParameter(request, "request");
        m mVar = this.f17549a;
        Intrinsics.checkNotNull(mVar);
        return mVar.g();
    }
}
