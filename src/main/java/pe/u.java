package pe;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.o;
import pe.p;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public c f14048a;

    /* renamed from: b  reason: collision with root package name */
    public final p f14049b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14050c;
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final x f14051e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, Object> f14052f;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public p f14053a;

        /* renamed from: b  reason: collision with root package name */
        public String f14054b;

        /* renamed from: c  reason: collision with root package name */
        public o.a f14055c;
        public x d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f14056e;

        public a() {
            this.f14056e = new LinkedHashMap();
            this.f14054b = "GET";
            this.f14055c = new o.a();
        }

        public a(u request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f14056e = new LinkedHashMap();
            this.f14053a = request.f14049b;
            this.f14054b = request.f14050c;
            this.d = request.f14051e;
            this.f14056e = request.f14052f.isEmpty() ? new LinkedHashMap<>() : MapsKt.toMutableMap(request.f14052f);
            this.f14055c = request.d.g();
        }

        public u a() {
            Map unmodifiableMap;
            p pVar = this.f14053a;
            if (pVar != null) {
                String str = this.f14054b;
                o c10 = this.f14055c.c();
                x xVar = this.d;
                Map<Class<?>, Object> toImmutableMap = this.f14056e;
                byte[] bArr = qe.c.f14512a;
                Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
                if (toImmutableMap.isEmpty()) {
                    unmodifiableMap = MapsKt.emptyMap();
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
                    Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
                }
                return new u(pVar, str, c10, xVar, unmodifiableMap);
            }
            throw new IllegalStateException("url == null".toString());
        }

        public a b() {
            d("GET", null);
            return this;
        }

        public a c(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            o.a aVar = this.f14055c;
            Objects.requireNonNull(aVar);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            o.b bVar = o.f13982f;
            bVar.a(name);
            bVar.b(value, name);
            aVar.d(name);
            aVar.b(name, value);
            return this;
        }

        public a d(String method, x xVar) {
            Intrinsics.checkNotNullParameter(method, "method");
            boolean z10 = false;
            if (method.length() > 0) {
                if (xVar == null) {
                    Intrinsics.checkNotNullParameter(method, "method");
                    if (!(!((Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")) ? true : true))) {
                        throw new IllegalArgumentException(android.support.v4.media.b.j("method ", method, " must have a request body.").toString());
                    }
                } else if (!ue.f.a(method)) {
                    throw new IllegalArgumentException(android.support.v4.media.b.j("method ", method, " must not have a request body.").toString());
                }
                this.f14054b = method;
                this.d = xVar;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public a e(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f14055c.d(name);
            return this;
        }

        public <T> a f(Class<? super T> type, T t2) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (t2 == null) {
                this.f14056e.remove(type);
            } else {
                if (this.f14056e.isEmpty()) {
                    this.f14056e = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.f14056e;
                T cast = type.cast(t2);
                Intrinsics.checkNotNull(cast);
                map.put(type, cast);
            }
            return this;
        }

        public a g(String toHttpUrl) {
            Intrinsics.checkNotNullParameter(toHttpUrl, "url");
            if (StringsKt.startsWith(toHttpUrl, "ws:", true)) {
                StringBuilder m10 = a1.a.m("http:");
                String substring = toHttpUrl.substring(3);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                m10.append(substring);
                toHttpUrl = m10.toString();
            } else if (StringsKt.startsWith(toHttpUrl, "wss:", true)) {
                StringBuilder m11 = a1.a.m("https:");
                String substring2 = toHttpUrl.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.String).substring(startIndex)");
                m11.append(substring2);
                toHttpUrl = m11.toString();
            }
            Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
            p.a aVar = new p.a();
            aVar.d(null, toHttpUrl);
            h(aVar.a());
            return this;
        }

        public a h(p url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f14053a = url;
            return this;
        }
    }

    public u(p url, String method, o headers, x xVar, Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f14049b = url;
        this.f14050c = method;
        this.d = headers;
        this.f14051e = xVar;
        this.f14052f = tags;
    }

    @JvmName(name = "cacheControl")
    public final c a() {
        c cVar = this.f14048a;
        if (cVar == null) {
            c b10 = c.n.b(this.d);
            this.f14048a = b10;
            return b10;
        }
        return cVar;
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.d.b(name);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Request{method=");
        m10.append(this.f14050c);
        m10.append(", url=");
        m10.append(this.f14049b);
        if (this.d.size() != 0) {
            m10.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : this.d) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String component1 = pair2.component1();
                String component2 = pair2.component2();
                if (i10 > 0) {
                    m10.append(", ");
                }
                m10.append(component1);
                m10.append(':');
                m10.append(component2);
                i10 = i11;
            }
            m10.append(']');
        }
        if (!this.f14052f.isEmpty()) {
            m10.append(", tags=");
            m10.append(this.f14052f);
        }
        m10.append('}');
        String sb2 = m10.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
