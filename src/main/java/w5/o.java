package w5;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import w5.b;

/* loaded from: classes2.dex */
public final class o {
    public static volatile o d;

    /* renamed from: a  reason: collision with root package name */
    public final c f16418a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<b.a> f16419b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public boolean f16420c;

    /* loaded from: classes2.dex */
    public class a implements d6.g<ConnectivityManager> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16421a;

        public a(o oVar, Context context) {
            this.f16421a = context;
        }

        @Override // d6.g
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f16421a.getSystemService("connectivity");
        }
    }

    /* loaded from: classes2.dex */
    public class b implements b.a {
        public b() {
        }

        @Override // w5.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            synchronized (o.this) {
                try {
                    arrayList = new ArrayList(o.this.f16419b);
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a();

        boolean b();
    }

    /* loaded from: classes2.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f16423a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f16424b;

        /* renamed from: c  reason: collision with root package name */
        public final d6.g<ConnectivityManager> f16425c;
        public final ConnectivityManager.NetworkCallback d = new a();

        /* loaded from: classes2.dex */
        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                d6.l.k(new p(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                d6.l.k(new p(this, false));
            }
        }

        public d(d6.g<ConnectivityManager> gVar, b.a aVar) {
            this.f16425c = gVar;
            this.f16424b = aVar;
        }

        @Override // w5.o.c
        public void a() {
            this.f16425c.get().unregisterNetworkCallback(this.d);
        }

        @Override // w5.o.c
        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.f16423a = this.f16425c.get().getActiveNetwork() != null;
            try {
                this.f16425c.get().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16427a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a f16428b;

        /* renamed from: c  reason: collision with root package name */
        public final d6.g<ConnectivityManager> f16429c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final BroadcastReceiver f16430e = new a();

        /* loaded from: classes2.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e eVar = e.this;
                boolean z10 = eVar.d;
                eVar.d = eVar.c();
                if (z10 != e.this.d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        StringBuilder m10 = a1.a.m("connectivity changed, isConnected: ");
                        m10.append(e.this.d);
                        Log.d("ConnectivityMonitor", m10.toString());
                    }
                    e eVar2 = e.this;
                    eVar2.f16428b.a(eVar2.d);
                }
            }
        }

        public e(Context context, d6.g<ConnectivityManager> gVar, b.a aVar) {
            this.f16427a = context.getApplicationContext();
            this.f16429c = gVar;
            this.f16428b = aVar;
        }

        @Override // w5.o.c
        public void a() {
            this.f16427a.unregisterReceiver(this.f16430e);
        }

        @Override // w5.o.c
        public boolean b() {
            this.d = c();
            try {
                this.f16427a.registerReceiver(this.f16430e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                return true;
            } catch (SecurityException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e10);
                }
                return false;
            }
        }

        @SuppressLint({"MissingPermission"})
        public boolean c() {
            try {
                this.f16429c.get().getActiveNetworkInfo();
                NetworkInfo networkInfo = null;
                return 0 != 0 && networkInfo.isConnected();
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
                }
                return true;
            }
        }
    }

    public o(Context context) {
        d6.f fVar = new d6.f(new a(this, context));
        b bVar = new b();
        this.f16418a = Build.VERSION.SDK_INT >= 24 ? new d(fVar, bVar) : new e(context, fVar, bVar);
    }

    public static o a(Context context) {
        if (d == null) {
            synchronized (o.class) {
                if (d == null) {
                    d = new o(context.getApplicationContext());
                }
            }
        }
        return d;
    }
}
