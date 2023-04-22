package q3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import q3.a;

/* loaded from: classes2.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final List<a.InterfaceC0247a> f14319a;

    /* renamed from: b  reason: collision with root package name */
    public ConnectivityManager f14320b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Network, NetworkCapabilities> f14321c;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14319a = new ArrayList();
        Object systemService = context.getSystemService("connectivity");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f14320b = (ConnectivityManager) systemService;
        this.f14321c = new HashMap();
        kf.a.f12078a.a("Registering network callbacks", new Object[0]);
        this.f14320b.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).removeCapability(15).build(), new b(this));
    }

    public static final void e(c cVar) {
        for (a.InterfaceC0247a interfaceC0247a : cVar.f14319a) {
            cVar.f(interfaceC0247a);
        }
    }

    @Override // q3.a
    public boolean a() {
        return !this.f14321c.isEmpty();
    }

    @Override // q3.a
    public void b(a.InterfaceC0247a connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f14319a.remove(connectionListener);
    }

    @Override // q3.a
    public void c(a.InterfaceC0247a connectionListener) {
        Intrinsics.checkNotNullParameter(connectionListener, "connectionListener");
        this.f14319a.add(connectionListener);
        f(connectionListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[SYNTHETIC] */
    @Override // q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            r7 = this;
            java.util.Map<android.net.Network, android.net.NetworkCapabilities> r0 = r7.f14321c
            java.util.Collection r0 = r0.values()
            java.util.Iterator r6 = r0.iterator()
            r0 = r6
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 0
            r6 = 4
            r6 = 1
            r3 = r6
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            r4 = r1
            android.net.NetworkCapabilities r4 = (android.net.NetworkCapabilities) r4
            if (r4 != 0) goto L21
            r6 = 2
        L1f:
            r4 = 0
            goto L2c
        L21:
            r6 = 2
            r5 = 11
            boolean r4 = r4.hasCapability(r5)
            if (r4 != r3) goto L1f
            r4 = 1
            r6 = 5
        L2c:
            if (r4 == 0) goto Lb
            r6 = 5
            goto L32
        L30:
            r6 = 6
            r1 = 0
        L32:
            if (r1 == 0) goto L36
            r2 = 1
            r6 = 7
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.c.d():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(q3.a.InterfaceC0247a r12) {
        /*
            r11 = this;
            r7 = r11
            boolean r0 = r7.a()
            java.util.Map<android.net.Network, android.net.NetworkCapabilities> r1 = r7.f14321c
            r10 = 2
            java.util.Collection r1 = r1.values()
            java.util.Iterator r9 = r1.iterator()
            r1 = r9
        L11:
            r10 = 3
            boolean r9 = r1.hasNext()
            r2 = r9
            r3 = 0
            r10 = 1
            r4 = r10
            if (r2 == 0) goto L3b
            r10 = 3
            java.lang.Object r2 = r1.next()
            r5 = r2
            android.net.NetworkCapabilities r5 = (android.net.NetworkCapabilities) r5
            if (r5 != 0) goto L28
            r10 = 7
            goto L35
        L28:
            r9 = 4
            r6 = r9
            boolean r9 = r5.hasTransport(r6)
            r5 = r9
            if (r5 != r4) goto L34
            r9 = 4
            r5 = 1
            goto L37
        L34:
            r9 = 6
        L35:
            r10 = 0
            r5 = r10
        L37:
            if (r5 == 0) goto L11
            r10 = 2
            goto L3d
        L3b:
            r2 = 0
            r9 = 4
        L3d:
            if (r2 == 0) goto L41
            r10 = 6
            r3 = 1
        L41:
            r12.a(r0, r3)
            r10 = 6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.c.f(q3.a$a):void");
    }
}
