package w9;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzfj;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class a2 {

    /* renamed from: h  reason: collision with root package name */
    public static volatile a2 f17058h;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f17059a;

    /* renamed from: b  reason: collision with root package name */
    public final AppMeasurementSdk f17060b;

    /* renamed from: c  reason: collision with root package name */
    public final List f17061c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17062e;

    /* renamed from: f  reason: collision with root package name */
    public final String f17063f;

    /* renamed from: g  reason: collision with root package name */
    public volatile p0 f17064g;

    public a2(Context context, String str, String str2, String str3, Bundle bundle) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o1());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f17059a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f17060b = new AppMeasurementSdk(this);
        this.f17061c = new ArrayList();
        try {
            zzic.zzc(context, "google_app_id", zzfj.zza(context));
        } catch (IllegalStateException unused) {
        }
        this.f17063f = "fa";
        if (str2 == null || str3 == null) {
            if ((str3 == null) ^ (str2 == null)) {
                Log.w("FA", "Specified origin or custom app id is null. Both parameters will be ignored.");
            }
        } else {
            Log.v("FA", "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
        }
        this.f17059a.execute(new g1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new z1(this));
        }
    }

    public static a2 j(Context context, String str, String str2, String str3, Bundle bundle) {
        Objects.requireNonNull(context, "null reference");
        if (f17058h == null) {
            synchronized (a2.class) {
                if (f17058h == null) {
                    f17058h = new a2(context, str, str2, str3, bundle);
                }
            }
        }
        return f17058h;
    }

    public final void a(zzgs zzgsVar) {
        Objects.requireNonNull(zzgsVar, "null reference");
        synchronized (this.f17061c) {
            for (int i10 = 0; i10 < this.f17061c.size(); i10++) {
                try {
                    if (zzgsVar.equals(((Pair) this.f17061c.get(i10)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            w1 w1Var = new w1(zzgsVar);
            this.f17061c.add(new Pair(zzgsVar, w1Var));
            if (this.f17064g != null) {
                try {
                    this.f17064g.registerOnMeasurementEventListener(w1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            this.f17059a.execute(new f1(this, w1Var, 2));
        }
    }

    public final void b(zzgr zzgrVar) {
        v1 v1Var = new v1(zzgrVar);
        if (this.f17064g != null) {
            try {
                this.f17064g.setEventInterceptor(v1Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w("FA", "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        this.f17059a.execute(new i1(this, v1Var, 1));
    }

    public final void c(String str, String str2, Object obj, boolean z10) {
        this.f17059a.execute(new t1(this, str, str2, obj, z10));
    }

    public final void d(zzgs zzgsVar) {
        Pair pair;
        Objects.requireNonNull(zzgsVar, "null reference");
        synchronized (this.f17061c) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= this.f17061c.size()) {
                        pair = null;
                        break;
                    } else if (zzgsVar.equals(((Pair) this.f17061c.get(i10)).first)) {
                        pair = (Pair) this.f17061c.get(i10);
                        break;
                    } else {
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                Log.w("FA", "OnEventListener had not been registered.");
                return;
            }
            this.f17061c.remove(pair);
            w1 w1Var = (w1) pair.second;
            if (this.f17064g != null) {
                try {
                    this.f17064g.unregisterOnMeasurementEventListener(w1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            this.f17059a.execute(new j1(this, w1Var, 1));
        }
    }

    public final void e(Exception exc, boolean z10, boolean z11) {
        this.f17062e |= z10;
        if (z10) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            this.f17059a.execute(new m1(this, "Error with data collection. Data lost.", exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final void f(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        this.f17059a.execute(new s1(this, l10, str, str2, bundle, z10, z11));
    }

    public final int g(String str) {
        l0 l0Var = new l0();
        this.f17059a.execute(new p1(this, str, l0Var));
        Integer num = (Integer) l0.c1(l0Var.a1(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long h() {
        l0 l0Var = new l0();
        this.f17059a.execute(new j1(this, l0Var, 0));
        Long l10 = (Long) l0.c1(l0Var.a1(500L), Long.class);
        if (l10 == null) {
            long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            int i10 = this.d + 1;
            this.d = i10;
            return nextLong + i10;
        }
        return l10.longValue();
    }

    public final Bundle i(Bundle bundle, boolean z10) {
        l0 l0Var = new l0();
        this.f17059a.execute(new n1(this, bundle, l0Var));
        if (z10) {
            return l0Var.a1(5000L);
        }
        return null;
    }

    public final String k() {
        l0 l0Var = new l0();
        this.f17059a.execute(new f1(this, l0Var, 1));
        return l0Var.b1(50L);
    }

    public final String l() {
        l0 l0Var = new l0();
        this.f17059a.execute(new h1(this, l0Var, 1));
        return l0Var.b1(500L);
    }

    public final String m() {
        l0 l0Var = new l0();
        this.f17059a.execute(new i1(this, l0Var, 0));
        return l0Var.b1(500L);
    }

    public final List n(String str, String str2) {
        l0 l0Var = new l0();
        this.f17059a.execute(new c1(this, str, str2, l0Var));
        List list = (List) l0.c1(l0Var.a1(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map o(String str, String str2, boolean z10) {
        l0 l0Var = new l0();
        this.f17059a.execute(new l1(this, str, str2, z10, l0Var));
        Bundle a12 = l0Var.a1(5000L);
        if (a12 != null && a12.size() != 0) {
            HashMap hashMap = new HashMap(a12.size());
            for (String str3 : a12.keySet()) {
                Object obj = a12.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
