package q3;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kf.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f14318a;

    public b(c cVar) {
        this.f14318a = cVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        a.C0174a c0174a = kf.a.f12078a;
        c0174a.a("Network " + network + ". is now available", new Object[0]);
        this.f14318a.f14321c.put(network, null);
        c0174a.a("There are now " + this.f14318a.f14321c.size() + " active networks", new Object[0]);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        a.C0174a c0174a = kf.a.f12078a;
        c0174a.a("The network " + network + " has capabilities " + networkCapabilities, new Object[0]);
        this.f14318a.f14321c.put(network, networkCapabilities);
        c.e(this.f14318a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        a.C0174a c0174a = kf.a.f12078a;
        c0174a.a("Network " + network + " is now lost", new Object[0]);
        this.f14318a.f14321c.remove(network);
        c0174a.a("There are now " + this.f14318a.f14321c.size() + " active networks", new Object[0]);
        c.e(this.f14318a);
    }
}
