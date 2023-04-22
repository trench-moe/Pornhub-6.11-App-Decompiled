package ye;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import xe.b;
import ye.j;

/* loaded from: classes3.dex */
public class f implements k {

    /* renamed from: f  reason: collision with root package name */
    public static final j.a f18647f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f18648g;

    /* renamed from: a  reason: collision with root package name */
    public final Method f18649a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f18650b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f18651c;
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<? super SSLSocket> f18652e;

    /* loaded from: classes3.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        a aVar = new a(null);
        f18648g = aVar;
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f18647f = new e("com.google.android.gms.org.conscrypt");
    }

    public f(Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f18652e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f18649a = declaredMethod;
        this.f18650b = sslSocketClass.getMethod("setHostname", String.class);
        this.f18651c = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ye.k
    public boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f18652e.isInstance(sslSocket);
    }

    @Override // ye.k
    public boolean b() {
        b.a aVar = xe.b.f18359g;
        return xe.b.f18358f;
    }

    @Override // ye.k
    public String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f18651c.invoke(sslSocket, new Object[0]);
                if (bArr != null) {
                    Charset charset = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
                    return new String(bArr, charset);
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (NullPointerException e11) {
                if (Intrinsics.areEqual(e11.getMessage(), "ssl == null")) {
                    return null;
                }
                throw e11;
            } catch (InvocationTargetException e12) {
                throw new AssertionError(e12);
            }
        }
        return null;
    }

    @Override // ye.k
    public void d(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f18649a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f18650b.invoke(sslSocket, str);
                }
                this.d.invoke(sslSocket, xe.h.f18380c.b(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
