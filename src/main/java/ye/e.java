package ye;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ye.f;
import ye.j;

/* loaded from: classes3.dex */
public final class e implements j.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f18646a;

    public e(String str) {
        this.f18646a = str;
    }

    @Override // ye.j.a
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return StringsKt.startsWith$default(name, android.support.v4.media.b.l(new StringBuilder(), this.f18646a, '.'), false, 2, (Object) null);
    }

    @Override // ye.j.a
    public k b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        f.a aVar = f.f18648g;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        Intrinsics.checkNotNull(cls2);
        return new f(cls2);
    }
}
