package ye;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;

/* loaded from: classes3.dex */
public final class j implements k {

    /* renamed from: a  reason: collision with root package name */
    public k f18658a;

    /* renamed from: b  reason: collision with root package name */
    public final a f18659b;

    /* loaded from: classes3.dex */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f18659b = socketAdapterFactory;
    }

    @Override // ye.k
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f18659b.a(sslSocket);
    }

    @Override // ye.k
    public boolean b() {
        return true;
    }

    @Override // ye.k
    public String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        k e10 = e(sslSocket);
        if (e10 != null) {
            return e10.c(sslSocket);
        }
        return null;
    }

    @Override // ye.k
    public void d(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        k e10 = e(sslSocket);
        if (e10 != null) {
            e10.d(sslSocket, str, protocols);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        if (this.f18658a == null && this.f18659b.a(sSLSocket)) {
            this.f18658a = this.f18659b.b(sSLSocket);
        }
        return this.f18658a;
    }
}
