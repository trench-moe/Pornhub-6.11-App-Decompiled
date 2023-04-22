package xe;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import ye.f;
import ye.i;
import ye.j;
import ye.k;

/* loaded from: classes3.dex */
public final class a extends h {

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f18356e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f18357f = null;
    public final List<k> d;

    static {
        f18356e = h.f18380c.c() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        k[] kVarArr = new k[4];
        kVarArr[0] = Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new ye.a() : null;
        f.a aVar = ye.f.f18648g;
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
    public void d(SSLSocket sslSocket, String str, List<? extends Protocol> protocols) {
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
    @SuppressLint({"NewApi"})
    public boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
