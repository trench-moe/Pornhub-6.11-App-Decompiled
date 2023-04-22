package xe;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import ye.f;
import ye.i;
import ye.j;
import ye.k;
import ye.l;

/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f18358f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f18359g = new a(null);
    public final List<k> d;

    /* renamed from: e  reason: collision with root package name */
    public final ye.h f18360e;

    /* loaded from: classes3.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* renamed from: xe.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0306b implements af.e {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f18361a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f18362b;

        public C0306b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f18361a = trustManager;
            this.f18362b = findByIssuerAndSignatureMethod;
        }

        @Override // af.e
        public X509Certificate a(X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object invoke = this.f18362b.invoke(this.f18361a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C0306b) {
                    C0306b c0306b = (C0306b) obj;
                    return Intrinsics.areEqual(this.f18361a, c0306b.f18361a) && Intrinsics.areEqual(this.f18362b, c0306b.f18362b);
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            X509TrustManager x509TrustManager = this.f18361a;
            int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f18362b;
            return hashCode + (method != null ? method.hashCode() : 0);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("CustomTrustRootIndex(trustManager=");
            m10.append(this.f18361a);
            m10.append(", findByIssuerAndSignatureMethod=");
            m10.append(this.f18362b);
            m10.append(")");
            return m10.toString();
        }
    }

    static {
        boolean z10 = false;
        if (h.f18380c.c() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f18358f = z10;
    }

    public b() {
        l lVar;
        Method method;
        Method method2;
        k[] kVarArr = new k[4];
        l.a aVar = l.f18660h;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramsClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            lVar = new l(cls, cls2, paramsClass);
        } catch (Exception e10) {
            h.f18378a.i("unable to load android socket classes", 5, e10);
            lVar = null;
        }
        kVarArr[0] = lVar;
        f.a aVar2 = ye.f.f18648g;
        kVarArr[1] = new j(ye.f.f18647f);
        kVarArr[2] = new j(i.f18657a);
        kVarArr[3] = new j(ye.g.f18653a);
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) kVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
        try {
            Class<?> cls3 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls3.getMethod("get", new Class[0]);
            method2 = cls3.getMethod("open", String.class);
            method = cls3.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f18360e = new ye.h(method3, method2, method);
    }

    @Override // xe.h
    public af.c b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ye.b bVar = x509TrustManagerExtensions != null ? new ye.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.b(trustManager);
    }

    @Override // xe.h
    public af.e c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            method.setAccessible(true);
            return new C0306b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // xe.h
    public void d(SSLSocket sslSocket, String str, List<Protocol> protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sslSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            kVar.d(sslSocket, str, protocols);
        }
    }

    @Override // xe.h
    public void e(Socket socket, InetSocketAddress address, int i10) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // xe.h
    public String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((k) obj).a(sslSocket)) {
                break;
            }
        }
        k kVar = (k) obj;
        if (kVar != null) {
            return kVar.c(sslSocket);
        }
        return null;
    }

    @Override // xe.h
    public Object g(String closer) {
        Intrinsics.checkNotNullParameter(closer, "closer");
        ye.h hVar = this.f18360e;
        Objects.requireNonNull(hVar);
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = hVar.f18654a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = hVar.f18655b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // xe.h
    public boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        }
        if (i10 >= 23) {
            NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            Intrinsics.checkNotNullExpressionValue(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
            return networkSecurityPolicy.isCleartextTrafficPermitted();
        }
        return true;
    }

    @Override // xe.h
    public void k(String message, Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        ye.h hVar = this.f18360e;
        Objects.requireNonNull(hVar);
        boolean z10 = false;
        if (obj != null) {
            try {
                Method method = hVar.f18656c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                z10 = true;
            } catch (Exception unused) {
            }
        }
        if (z10) {
            return;
        }
        h.j(this, message, 5, null, 4, null);
    }
}
