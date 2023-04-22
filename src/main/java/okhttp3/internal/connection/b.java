package okhttp3.internal.connection;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pe.b0;
import pe.d;
import pe.m;
import pe.p;
import qe.c;
import te.h;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Proxy> f13697a;

    /* renamed from: b  reason: collision with root package name */
    public int f13698b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends InetSocketAddress> f13699c;
    public final List<b0> d;

    /* renamed from: e  reason: collision with root package name */
    public final pe.a f13700e;

    /* renamed from: f  reason: collision with root package name */
    public final h f13701f;

    /* renamed from: g  reason: collision with root package name */
    public final d f13702g;

    /* renamed from: h  reason: collision with root package name */
    public final m f13703h;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f13704a;

        /* renamed from: b  reason: collision with root package name */
        public final List<b0> f13705b;

        public a(List<b0> routes) {
            Intrinsics.checkNotNullParameter(routes, "routes");
            this.f13705b = routes;
        }

        public final boolean a() {
            return this.f13704a < this.f13705b.size();
        }

        public final b0 b() {
            if (a()) {
                List<b0> list = this.f13705b;
                int i10 = this.f13704a;
                this.f13704a = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public b(pe.a address, h routeDatabase, d call, m eventListener) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f13700e = address;
        this.f13701f = routeDatabase;
        this.f13702g = call;
        this.f13703h = eventListener;
        this.f13697a = CollectionsKt.emptyList();
        this.f13699c = CollectionsKt.emptyList();
        this.d = new ArrayList();
        final p url = address.f13906a;
        final Proxy proxy = address.f13914j;
        Function0<List<? extends Proxy>> function0 = new Function0<List<? extends Proxy>>() { // from class: okhttp3.internal.connection.RouteSelector$resetNextProxy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Proxy> invoke() {
                Proxy proxy2 = proxy;
                if (proxy2 != null) {
                    return CollectionsKt.listOf(proxy2);
                }
                URI h10 = url.h();
                if (h10.getHost() == null) {
                    return c.l(Proxy.NO_PROXY);
                }
                List<Proxy> select = b.this.f13700e.f13915k.select(h10);
                return select == null || select.isEmpty() ? c.l(Proxy.NO_PROXY) : c.v(select);
            }
        };
        Objects.requireNonNull(eventListener);
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        List<? extends Proxy> proxies = function0.invoke();
        this.f13697a = proxies;
        this.f13698b = 0;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public final boolean a() {
        return b() || (this.d.isEmpty() ^ true);
    }

    public final boolean b() {
        return this.f13698b < this.f13697a.size();
    }
}
