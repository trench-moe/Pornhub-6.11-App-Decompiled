package h9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f10316a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static j1 f10317b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f10318c;

    public static g a(Context context) {
        synchronized (f10316a) {
            try {
                if (f10317b == null) {
                    f10317b = new j1(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10317b;
    }

    public static HandlerThread b() {
        synchronized (f10316a) {
            HandlerThread handlerThread = f10318c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f10318c = handlerThread2;
            handlerThread2.start();
            return f10318c;
        }
    }

    public final void c(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        g1 g1Var = new g1(str, str2, i10, z10);
        j1 j1Var = (j1) this;
        synchronized (j1Var.d) {
            h1 h1Var = j1Var.d.get(g1Var);
            if (h1Var == null) {
                String g1Var2 = g1Var.toString();
                StringBuilder sb2 = new StringBuilder(g1Var2.length() + 50);
                sb2.append("Nonexistent connection status for service config: ");
                sb2.append(g1Var2);
                throw new IllegalStateException(sb2.toString());
            } else if (!h1Var.f10328a.containsKey(serviceConnection)) {
                String g1Var3 = g1Var.toString();
                StringBuilder sb3 = new StringBuilder(g1Var3.length() + 76);
                sb3.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb3.append(g1Var3);
                throw new IllegalStateException(sb3.toString());
            } else {
                h1Var.f10328a.remove(serviceConnection);
                if (h1Var.f10328a.isEmpty()) {
                    j1Var.f10340f.sendMessageDelayed(j1Var.f10340f.obtainMessage(0, g1Var), j1Var.f10342h);
                }
            }
        }
    }

    public abstract boolean d(g1 g1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
