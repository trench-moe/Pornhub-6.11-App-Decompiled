package pe;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final a f13917a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f13918b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f13919c;

    public b0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f13917a = address;
        this.f13918b = proxy;
        this.f13919c = socketAddress;
    }

    public final boolean a() {
        return this.f13917a.f13910f != null && this.f13918b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (Intrinsics.areEqual(b0Var.f13917a, this.f13917a) && Intrinsics.areEqual(b0Var.f13918b, this.f13918b) && Intrinsics.areEqual(b0Var.f13919c, this.f13919c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f13918b.hashCode();
        return this.f13919c.hashCode() + ((hashCode + ((this.f13917a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Route{");
        m10.append(this.f13919c);
        m10.append('}');
        return m10.toString();
    }
}
