package h9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class j1 extends g {
    public final HashMap<g1, h1> d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final Context f10339e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Handler f10340f;

    /* renamed from: g  reason: collision with root package name */
    public final k9.a f10341g;

    /* renamed from: h  reason: collision with root package name */
    public final long f10342h;

    /* renamed from: i  reason: collision with root package name */
    public final long f10343i;

    public j1(Context context, Looper looper) {
        i1 i1Var = new i1(this);
        this.f10339e = context.getApplicationContext();
        this.f10340f = new u9.d(looper, i1Var);
        this.f10341g = k9.a.b();
        this.f10342h = 5000L;
        this.f10343i = 300000L;
    }

    @Override // h9.g
    public final boolean d(g1 g1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean z10;
        synchronized (this.d) {
            try {
                h1 h1Var = this.d.get(g1Var);
                if (h1Var == null) {
                    h1Var = new h1(this, g1Var);
                    h1Var.f10328a.put(serviceConnection, serviceConnection);
                    h1Var.a(str, executor);
                    this.d.put(g1Var, h1Var);
                } else {
                    this.f10340f.removeMessages(0, g1Var);
                    if (h1Var.f10328a.containsKey(serviceConnection)) {
                        String g1Var2 = g1Var.toString();
                        StringBuilder sb2 = new StringBuilder(g1Var2.length() + 81);
                        sb2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb2.append(g1Var2);
                        throw new IllegalStateException(sb2.toString());
                    }
                    h1Var.f10328a.put(serviceConnection, serviceConnection);
                    int i10 = h1Var.f10329b;
                    if (i10 == 1) {
                        ((z0) serviceConnection).onServiceConnected(h1Var.f10332f, h1Var.d);
                    } else if (i10 == 2) {
                        h1Var.a(str, executor);
                    }
                }
                z10 = h1Var.f10330c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }
}
