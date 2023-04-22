package pe;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import pe.d;
import pe.m;
import xe.h;

/* loaded from: classes3.dex */
public class t implements Cloneable, d.a {
    public final l A;
    public final ProxySelector B;
    public final pe.b C;
    public final SocketFactory D;
    public final SSLSocketFactory E;
    public final X509TrustManager F;
    public final List<h> G;
    public final List<Protocol> H;
    public final HostnameVerifier I;
    public final CertificatePinner J;
    public final af.c K;
    public final int L;
    public final int M;
    public final int N;
    public final te.h O;

    /* renamed from: c  reason: collision with root package name */
    public final k f14021c;

    /* renamed from: f  reason: collision with root package name */
    public final o3.d f14022f;

    /* renamed from: j  reason: collision with root package name */
    public final List<q> f14023j;

    /* renamed from: m  reason: collision with root package name */
    public final List<q> f14024m;
    public final m.b n;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f14025t;

    /* renamed from: u  reason: collision with root package name */
    public final pe.b f14026u;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f14027w;
    public final boolean y;

    /* renamed from: z  reason: collision with root package name */
    public final j f14028z;
    public static final b R = new b(null);
    public static final List<Protocol> P = qe.c.l(Protocol.HTTP_2, Protocol.HTTP_1_1);
    public static final List<h> Q = qe.c.l(h.f13950e, h.f13951f);

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public k f14029a = new k();

        /* renamed from: b  reason: collision with root package name */
        public o3.d f14030b = new o3.d(8);

        /* renamed from: c  reason: collision with root package name */
        public final List<q> f14031c = new ArrayList();
        public final List<q> d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public m.b f14032e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f14033f;

        /* renamed from: g  reason: collision with root package name */
        public pe.b f14034g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f14035h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f14036i;

        /* renamed from: j  reason: collision with root package name */
        public j f14037j;

        /* renamed from: k  reason: collision with root package name */
        public l f14038k;

        /* renamed from: l  reason: collision with root package name */
        public pe.b f14039l;

        /* renamed from: m  reason: collision with root package name */
        public SocketFactory f14040m;
        public List<h> n;

        /* renamed from: o  reason: collision with root package name */
        public List<? extends Protocol> f14041o;

        /* renamed from: p  reason: collision with root package name */
        public HostnameVerifier f14042p;

        /* renamed from: q  reason: collision with root package name */
        public CertificatePinner f14043q;

        /* renamed from: r  reason: collision with root package name */
        public int f14044r;

        /* renamed from: s  reason: collision with root package name */
        public int f14045s;

        /* renamed from: t  reason: collision with root package name */
        public int f14046t;

        /* renamed from: u  reason: collision with root package name */
        public long f14047u;

        public a() {
            m asFactory = m.f13975a;
            byte[] bArr = qe.c.f14512a;
            Intrinsics.checkNotNullParameter(asFactory, "$this$asFactory");
            this.f14032e = new qe.a(asFactory);
            this.f14033f = true;
            pe.b bVar = pe.b.f13916e;
            this.f14034g = bVar;
            this.f14035h = true;
            this.f14036i = true;
            this.f14037j = j.f13970g;
            this.f14038k = l.f13974h;
            this.f14039l = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "SocketFactory.getDefault()");
            this.f14040m = socketFactory;
            b bVar2 = t.R;
            this.n = t.Q;
            this.f14041o = t.P;
            this.f14042p = af.d.f360a;
            this.f14043q = CertificatePinner.f13661c;
            this.f14044r = 10000;
            this.f14045s = 10000;
            this.f14046t = 10000;
            this.f14047u = 1024L;
        }

        public final a a(q interceptor) {
            Intrinsics.checkNotNullParameter(interceptor, "interceptor");
            this.f14031c.add(interceptor);
            return this;
        }

        public final t b() {
            return new t(this);
        }

        public final a c(CertificatePinner certificatePinner) {
            Intrinsics.checkNotNullParameter(certificatePinner, "certificatePinner");
            Intrinsics.areEqual(certificatePinner, this.f14043q);
            this.f14043q = certificatePinner;
            return this;
        }

        public final a d(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f14044r = qe.c.b("timeout", j10, unit);
            return this;
        }

        public final a e(List<h> connectionSpecs) {
            Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
            Intrinsics.areEqual(connectionSpecs, this.n);
            this.n = qe.c.v(connectionSpecs);
            return this;
        }

        public final a f(List<? extends Protocol> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            boolean z10 = false;
            if (!(mutableList.contains(protocol) || mutableList.contains(Protocol.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (!((!mutableList.contains(protocol) || mutableList.size() <= 1) ? true : true)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            } else if (!(!mutableList.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            } else if (!mutableList.contains(null)) {
                mutableList.remove(Protocol.SPDY_3);
                Intrinsics.areEqual(mutableList, this.f14041o);
                List<? extends Protocol> unmodifiableList = Collections.unmodifiableList(mutableList);
                Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
                this.f14041o = unmodifiableList;
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
        }

        public final a g(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f14045s = qe.c.b("timeout", j10, unit);
            return this;
        }

        public final a h(long j10, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f14046t = qe.c.b("timeout", j10, unit);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public t() {
        this(new a());
    }

    public t(a builder) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f14021c = builder.f14029a;
        this.f14022f = builder.f14030b;
        this.f14023j = qe.c.v(builder.f14031c);
        this.f14024m = qe.c.v(builder.d);
        this.n = builder.f14032e;
        this.f14025t = builder.f14033f;
        this.f14026u = builder.f14034g;
        this.f14027w = builder.f14035h;
        this.y = builder.f14036i;
        this.f14028z = builder.f14037j;
        this.A = builder.f14038k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.B = proxySelector == null ? ze.a.f21943a : proxySelector;
        this.C = builder.f14039l;
        this.D = builder.f14040m;
        List<h> list = builder.n;
        this.G = list;
        this.H = builder.f14041o;
        this.I = builder.f14042p;
        this.L = builder.f14044r;
        this.M = builder.f14045s;
        this.N = builder.f14046t;
        this.O = new te.h();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (h hVar : list) {
                if (hVar.f13952a) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            this.E = null;
            this.K = null;
            this.F = null;
            this.J = CertificatePinner.f13661c;
        } else {
            h.a aVar = xe.h.f18380c;
            X509TrustManager trustManager = xe.h.f18378a.n();
            this.F = trustManager;
            xe.h hVar2 = xe.h.f18378a;
            Intrinsics.checkNotNull(trustManager);
            this.E = hVar2.m(trustManager);
            Intrinsics.checkNotNull(trustManager);
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            af.c b10 = xe.h.f18378a.b(trustManager);
            this.K = b10;
            CertificatePinner certificatePinner = builder.f14043q;
            Intrinsics.checkNotNull(b10);
            this.J = certificatePinner.c(b10);
        }
        List<q> list2 = this.f14023j;
        Objects.requireNonNull(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list2.contains(null))) {
            StringBuilder m10 = a1.a.m("Null interceptor: ");
            m10.append(this.f14023j);
            throw new IllegalStateException(m10.toString().toString());
        }
        List<q> list3 = this.f14024m;
        Objects.requireNonNull(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!(!list3.contains(null))) {
            StringBuilder m11 = a1.a.m("Null network interceptor: ");
            m11.append(this.f14024m);
            throw new IllegalStateException(m11.toString().toString());
        }
        List<h> list4 = this.G;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            for (h hVar3 : list4) {
                if (hVar3.f13952a) {
                    z11 = false;
                    break;
                }
            }
        }
        z11 = true;
        if (!z11) {
            if (this.E == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            }
            if (this.K == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            }
            if (this.F == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
            return;
        }
        if (!(this.E == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.K == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!(this.F == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!Intrinsics.areEqual(this.J, CertificatePinner.f13661c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    @Override // pe.d.a
    public d a(u request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new te.e(this, request, false);
    }

    public Object clone() {
        return super.clone();
    }
}
