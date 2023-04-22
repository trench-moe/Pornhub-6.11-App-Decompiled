package pe;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CertificatePinner;
import okhttp3.Protocol;
import pe.p;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final p f13906a;

    /* renamed from: b  reason: collision with root package name */
    public final List<Protocol> f13907b;

    /* renamed from: c  reason: collision with root package name */
    public final List<h> f13908c;
    public final l d;

    /* renamed from: e  reason: collision with root package name */
    public final SocketFactory f13909e;

    /* renamed from: f  reason: collision with root package name */
    public final SSLSocketFactory f13910f;

    /* renamed from: g  reason: collision with root package name */
    public final HostnameVerifier f13911g;

    /* renamed from: h  reason: collision with root package name */
    public final CertificatePinner f13912h;

    /* renamed from: i  reason: collision with root package name */
    public final b f13913i;

    /* renamed from: j  reason: collision with root package name */
    public final Proxy f13914j;

    /* renamed from: k  reason: collision with root package name */
    public final ProxySelector f13915k;

    public a(String host, int i10, l dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, b proxyAuthenticator, Proxy proxy, List<? extends Protocol> protocols, List<h> connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.d = dns;
        this.f13909e = socketFactory;
        this.f13910f = sSLSocketFactory;
        this.f13911g = hostnameVerifier;
        this.f13912h = certificatePinner;
        this.f13913i = proxyAuthenticator;
        this.f13914j = null;
        this.f13915k = proxySelector;
        p.a aVar = new p.a();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        boolean z10 = true;
        if (StringsKt.equals(scheme, "http", true)) {
            aVar.f13996a = "http";
        } else if (!StringsKt.equals(scheme, "https", true)) {
            throw new IllegalArgumentException(a1.a.l("unexpected scheme: ", scheme));
        } else {
            aVar.f13996a = "https";
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String d02 = a0.b.d0(p.b.d(p.f13986l, host, 0, 0, false, 7));
        if (d02 == null) {
            throw new IllegalArgumentException(a1.a.l("unexpected host: ", host));
        }
        aVar.d = d02;
        if (!((1 > i10 || 65535 < i10) ? false : false)) {
            throw new IllegalArgumentException(a1.a.j("unexpected port: ", i10).toString());
        }
        aVar.f13999e = i10;
        this.f13906a = aVar.a();
        this.f13907b = qe.c.v(protocols);
        this.f13908c = qe.c.v(connectionSpecs);
    }

    public final boolean a(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.d, that.d) && Intrinsics.areEqual(this.f13913i, that.f13913i) && Intrinsics.areEqual(this.f13907b, that.f13907b) && Intrinsics.areEqual(this.f13908c, that.f13908c) && Intrinsics.areEqual(this.f13915k, that.f13915k) && Intrinsics.areEqual(this.f13914j, that.f13914j) && Intrinsics.areEqual(this.f13910f, that.f13910f) && Intrinsics.areEqual(this.f13911g, that.f13911g) && Intrinsics.areEqual(this.f13912h, that.f13912h) && this.f13906a.f13991f == that.f13906a.f13991f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (Intrinsics.areEqual(this.f13906a, aVar.f13906a) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = this.f13913i.hashCode();
        int b10 = android.support.v4.media.a.b(this.f13908c, android.support.v4.media.a.b(this.f13907b, (hashCode2 + ((hashCode + ((this.f13906a.hashCode() + 527) * 31)) * 31)) * 31, 31), 31);
        int hashCode3 = Objects.hashCode(this.f13914j);
        int hashCode4 = Objects.hashCode(this.f13910f);
        int hashCode5 = Objects.hashCode(this.f13911g);
        return Objects.hashCode(this.f13912h) + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((this.f13915k.hashCode() + b10) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder m10;
        Object obj;
        StringBuilder m11 = a1.a.m("Address{");
        m11.append(this.f13906a.f13990e);
        m11.append(':');
        m11.append(this.f13906a.f13991f);
        m11.append(", ");
        if (this.f13914j != null) {
            m10 = a1.a.m("proxy=");
            obj = this.f13914j;
        } else {
            m10 = a1.a.m("proxySelector=");
            obj = this.f13915k;
        }
        m10.append(obj);
        m11.append(m10.toString());
        m11.append("}");
        return m11.toString();
    }
}
