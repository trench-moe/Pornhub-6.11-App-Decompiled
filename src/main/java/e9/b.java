package e9;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final b n = new b();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f9153c = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f9154f = new AtomicBoolean();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<a> f9155j = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public boolean f9156m = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    public static void a(Application application) {
        b bVar = n;
        synchronized (bVar) {
            if (!bVar.f9156m) {
                application.registerActivityLifecycleCallbacks(bVar);
                application.registerComponentCallbacks(bVar);
                bVar.f9156m = true;
            }
        }
    }

    public final void b(boolean z10) {
        synchronized (n) {
            Iterator<a> it = this.f9155j.iterator();
            while (it.hasNext()) {
                it.next().a(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f9153c.compareAndSet(true, false);
        this.f9154f.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f9153c.compareAndSet(true, false);
        this.f9154f.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f9153c.compareAndSet(false, true)) {
            this.f9154f.set(true);
            b(true);
        }
    }
}
