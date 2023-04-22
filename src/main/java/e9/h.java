package e9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import d9.a;
import h9.b;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements a.f, ServiceConnection {
    @Override // d9.a.f
    public final Set<Scope> a() {
        return Collections.emptySet();
    }

    @Override // d9.a.f
    public final void connect(b.c cVar) {
        Thread.currentThread();
        throw null;
    }

    @Override // d9.a.f
    public final void disconnect(String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // d9.a.f
    public final c9.d[] getAvailableFeatures() {
        return new c9.d[0];
    }

    @Override // d9.a.f
    public final String getEndpointPackageName() {
        Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }

    @Override // d9.a.f
    public final String getLastDisconnectMessage() {
        return null;
    }

    @Override // d9.a.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // d9.a.f
    public final void getRemoteService(h9.h hVar, Set<Scope> set) {
    }

    @Override // d9.a.f
    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    @Override // d9.a.f
    public final boolean isConnecting() {
        Thread.currentThread();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    @Override // d9.a.f
    public final void onUserSignOut(b.e eVar) {
    }

    @Override // d9.a.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // d9.a.f
    public final boolean requiresSignIn() {
        return false;
    }
}
