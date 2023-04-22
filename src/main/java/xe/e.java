package xe;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;

/* loaded from: classes3.dex */
public final class e extends h {
    public final Method d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f18368e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f18369f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f18370g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f18371h;

    /* loaded from: classes3.dex */
    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18372a;

        /* renamed from: b  reason: collision with root package name */
        public String f18373b;

        /* renamed from: c  reason: collision with root package name */
        public final List<String> f18374c;

        public a(List<String> protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f18374c = protocols;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
                this.f18372a = true;
                return null;
            }
            if (Intrinsics.areEqual(name, "protocols")) {
                if (objArr.length == 0) {
                    return this.f18374c;
                }
            }
            if ((!Intrinsics.areEqual(name, "selectProtocol") && !Intrinsics.areEqual(name, "select")) || !Intrinsics.areEqual(String.class, returnType) || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((Intrinsics.areEqual(name, "protocolSelected") || Intrinsics.areEqual(name, "selected")) && objArr.length == 1) {
                    Object obj = objArr[0];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    this.f18373b = (String) obj;
                    return null;
                }
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj2 = objArr[0];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            List list = (List) obj2;
            int size = list.size();
            if (size >= 0) {
                int i10 = 0;
                while (true) {
                    Object obj3 = list.get(i10);
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj3;
                    if (!this.f18374c.contains(str)) {
                        if (i10 == size) {
                            break;
                        }
                        i10++;
                    } else {
                        this.f18373b = str;
                        return str;
                    }
                }
            }
            String str2 = this.f18374c.get(0);
            this.f18373b = str2;
            return str2;
        }
    }

    public e(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.d = putMethod;
        this.f18368e = getMethod;
        this.f18369f = removeMethod;
        this.f18370g = clientProviderClass;
        this.f18371h = serverProviderClass;
    }

    @Override // xe.h
    public void a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f18369f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // xe.h
    public void d(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = protocols.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Protocol) next) != Protocol.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Protocol) it2.next()).toString());
        }
        try {
            this.d.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f18370g, this.f18371h}, new a(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // xe.h
    public String f(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f18368e.invoke(null, sslSocket));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z10 = aVar.f18372a;
                if (!z10 && aVar.f18373b == null) {
                    i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                    return null;
                } else if (z10) {
                    return null;
                } else {
                    return aVar.f18373b;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
