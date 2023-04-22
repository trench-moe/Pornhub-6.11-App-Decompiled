package ye;

import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import xe.d;
import ye.j;

/* loaded from: classes3.dex */
public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public static final j.a f18657a = new a();

    /* loaded from: classes3.dex */
    public static final class a implements j.a {
        @Override // ye.j.a
        public boolean a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            d.a aVar = xe.d.f18366f;
            return xe.d.f18365e && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // ye.j.a
        public k b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new i();
        }
    }

    @Override // ye.k
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // ye.k
    public boolean b() {
        d.a aVar = xe.d.f18366f;
        return xe.d.f18365e;
    }

    @Override // ye.k
    public String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // ye.k
    public void d(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = xe.h.f18380c.a(protocols).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
