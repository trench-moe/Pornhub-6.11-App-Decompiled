package pe;

import java.io.Closeable;
import java.util.Objects;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;
import pe.o;

/* loaded from: classes3.dex */
public final class y implements Closeable {
    public final long A;
    public final long B;
    public final te.c C;

    /* renamed from: c  reason: collision with root package name */
    public final u f14062c;

    /* renamed from: f  reason: collision with root package name */
    public final Protocol f14063f;

    /* renamed from: j  reason: collision with root package name */
    public final String f14064j;

    /* renamed from: m  reason: collision with root package name */
    public final int f14065m;
    public final Handshake n;

    /* renamed from: t  reason: collision with root package name */
    public final o f14066t;

    /* renamed from: u  reason: collision with root package name */
    public final a0 f14067u;

    /* renamed from: w  reason: collision with root package name */
    public final y f14068w;
    public final y y;

    /* renamed from: z  reason: collision with root package name */
    public final y f14069z;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public u f14070a;

        /* renamed from: b  reason: collision with root package name */
        public Protocol f14071b;

        /* renamed from: c  reason: collision with root package name */
        public int f14072c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public Handshake f14073e;

        /* renamed from: f  reason: collision with root package name */
        public o.a f14074f;

        /* renamed from: g  reason: collision with root package name */
        public a0 f14075g;

        /* renamed from: h  reason: collision with root package name */
        public y f14076h;

        /* renamed from: i  reason: collision with root package name */
        public y f14077i;

        /* renamed from: j  reason: collision with root package name */
        public y f14078j;

        /* renamed from: k  reason: collision with root package name */
        public long f14079k;

        /* renamed from: l  reason: collision with root package name */
        public long f14080l;

        /* renamed from: m  reason: collision with root package name */
        public te.c f14081m;

        public a() {
            this.f14072c = -1;
            this.f14074f = new o.a();
        }

        public a(y response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.f14072c = -1;
            this.f14070a = response.f14062c;
            this.f14071b = response.f14063f;
            this.f14072c = response.f14065m;
            this.d = response.f14064j;
            this.f14073e = response.n;
            this.f14074f = response.f14066t.g();
            this.f14075g = response.f14067u;
            this.f14076h = response.f14068w;
            this.f14077i = response.y;
            this.f14078j = response.f14069z;
            this.f14079k = response.A;
            this.f14080l = response.B;
            this.f14081m = response.C;
        }

        public y a() {
            int i10 = this.f14072c;
            if (!(i10 >= 0)) {
                StringBuilder m10 = a1.a.m("code < 0: ");
                m10.append(this.f14072c);
                throw new IllegalStateException(m10.toString().toString());
            }
            u uVar = this.f14070a;
            if (uVar != null) {
                Protocol protocol = this.f14071b;
                if (protocol != null) {
                    String str = this.d;
                    if (str != null) {
                        return new y(uVar, protocol, str, i10, this.f14073e, this.f14074f.c(), this.f14075g, this.f14076h, this.f14077i, this.f14078j, this.f14079k, this.f14080l, this.f14081m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }

        public a b(y yVar) {
            c("cacheResponse", yVar);
            this.f14077i = yVar;
            return this;
        }

        public final void c(String str, y yVar) {
            if (yVar != null) {
                if (!(yVar.f14067u == null)) {
                    throw new IllegalArgumentException(a1.a.l(str, ".body != null").toString());
                }
                if (!(yVar.f14068w == null)) {
                    throw new IllegalArgumentException(a1.a.l(str, ".networkResponse != null").toString());
                }
                if (!(yVar.y == null)) {
                    throw new IllegalArgumentException(a1.a.l(str, ".cacheResponse != null").toString());
                }
                if (!(yVar.f14069z == null)) {
                    throw new IllegalArgumentException(a1.a.l(str, ".priorResponse != null").toString());
                }
            }
        }

        public a d(o headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f14074f = headers.g();
            return this;
        }

        public a e(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.d = message;
            return this;
        }

        public a f(Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            this.f14071b = protocol;
            return this;
        }

        public a g(u request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f14070a = request;
            return this;
        }
    }

    public y(u request, Protocol protocol, String message, int i10, Handshake handshake, o headers, a0 a0Var, y yVar, y yVar2, y yVar3, long j10, long j11, te.c cVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f14062c = request;
        this.f14063f = protocol;
        this.f14064j = message;
        this.f14065m = i10;
        this.n = handshake;
        this.f14066t = headers;
        this.f14067u = a0Var;
        this.f14068w = yVar;
        this.y = yVar2;
        this.f14069z = yVar3;
        this.A = j10;
        this.B = j11;
        this.C = cVar;
    }

    public static String d(y yVar, String name, String str, int i10) {
        Objects.requireNonNull(yVar);
        Intrinsics.checkNotNullParameter(name, "name");
        String b10 = yVar.f14066t.b(name);
        if (b10 != null) {
            return b10;
        }
        return null;
    }

    @JvmName(name = "body")
    public final a0 a() {
        return this.f14067u;
    }

    @JvmName(name = "code")
    public final int c() {
        return this.f14065m;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a0 a0Var = this.f14067u;
        if (a0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        a0Var.close();
    }

    @JvmName(name = "headers")
    public final o e() {
        return this.f14066t;
    }

    public final boolean f() {
        int i10 = this.f14065m;
        return 200 <= i10 && 299 >= i10;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Response{protocol=");
        m10.append(this.f14063f);
        m10.append(", code=");
        m10.append(this.f14065m);
        m10.append(", message=");
        m10.append(this.f14064j);
        m10.append(", url=");
        m10.append(this.f14062c.f14049b);
        m10.append('}');
        return m10.toString();
    }
}
