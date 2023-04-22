package w9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class z1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a2 f17388c;

    public z1(a2 a2Var) {
        this.f17388c = a2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a2 a2Var = this.f17388c;
        a2Var.f17059a.execute(new m1(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a2 a2Var = this.f17388c;
        a2Var.f17059a.execute(new i1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a2 a2Var = this.f17388c;
        a2Var.f17059a.execute(new k1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a2 a2Var = this.f17388c;
        a2Var.f17059a.execute(new j1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l0 l0Var = new l0();
        a2 a2Var = this.f17388c;
        a2Var.f17059a.execute(new y1(this, activity, l0Var));
        Bundle a12 = l0Var.a1(50L);
        if (a12 != null) {
            bundle.putAll(a12);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a2 a2Var = this.f17388c;
        a2Var.f17059a.execute(new f1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a2 a2Var = this.f17388c;
        a2Var.f17059a.execute(new h1(this, activity));
    }
}
