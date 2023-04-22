package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes.dex */
public class t extends d {
    public final /* synthetic */ s this$0;

    /* loaded from: classes.dex */
    public class a extends d {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            t.this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            t.this.this$0.d();
        }
    }

    public t(s sVar) {
        this.this$0 = sVar;
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = u.f2398f;
            ((u) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2399c = this.this$0.f2395w;
        }
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        s sVar = this.this$0;
        int i10 = sVar.f2390f - 1;
        sVar.f2390f = i10;
        if (i10 == 0) {
            sVar.n.postDelayed(sVar.f2394u, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    @Override // androidx.lifecycle.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        s sVar = this.this$0;
        int i10 = sVar.f2389c - 1;
        sVar.f2389c = i10;
        if (i10 == 0 && sVar.f2391j) {
            sVar.f2393t.e(Lifecycle.Event.ON_STOP);
            sVar.f2392m = true;
        }
    }
}
