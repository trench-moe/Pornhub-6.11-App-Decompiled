package h9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class h1 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Map<ServiceConnection, ServiceConnection> f10328a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f10329b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10330c;
    public IBinder d;

    /* renamed from: e  reason: collision with root package name */
    public final g1 f10331e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f10332f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j1 f10333g;

    public h1(j1 j1Var, g1 g1Var) {
        this.f10333g = j1Var;
        this.f10331e = g1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r13, java.util.concurrent.Executor r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.h1.a(java.lang.String, java.util.concurrent.Executor):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f10333g.d) {
            this.f10333g.f10340f.removeMessages(1, this.f10331e);
            this.d = iBinder;
            this.f10332f = componentName;
            for (ServiceConnection serviceConnection : this.f10328a.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f10329b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f10333g.d) {
            this.f10333g.f10340f.removeMessages(1, this.f10331e);
            this.d = null;
            this.f10332f = componentName;
            for (ServiceConnection serviceConnection : this.f10328a.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f10329b = 2;
        }
    }
}
