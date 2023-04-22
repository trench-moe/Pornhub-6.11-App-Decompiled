package k9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import h9.h1;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import m9.c;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12036b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f12037c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f12038a = new ConcurrentHashMap<>();

    public static a b() {
        if (f12037c == null) {
            synchronized (f12036b) {
                if (f12037c == null) {
                    f12037c = new a();
                }
            }
        }
        a aVar = f12037c;
        Objects.requireNonNull(aVar, "null reference");
        return aVar;
    }

    public static final boolean e(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return (!(Build.VERSION.SDK_INT >= 29) || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!(!(serviceConnection instanceof h1)) || !this.f12038a.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
                return;
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                return;
            }
        }
        try {
            try {
                context.unbindService(this.f12038a.get(serviceConnection));
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
            }
        } finally {
            this.f12038a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof h1)) {
            ServiceConnection putIfAbsent = this.f12038a.putIfAbsent(serviceConnection, serviceConnection);
            if (putIfAbsent != null && serviceConnection != putIfAbsent) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                boolean e10 = e(context, intent, serviceConnection, i10, executor);
                if (e10) {
                    return e10;
                }
                this.f12038a.remove(serviceConnection, serviceConnection);
                return false;
            } catch (Throwable th) {
                this.f12038a.remove(serviceConnection, serviceConnection);
                throw th;
            }
        }
        return e(context, intent, serviceConnection, i10, executor);
    }
}
