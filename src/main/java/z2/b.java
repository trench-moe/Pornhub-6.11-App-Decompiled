package z2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.x;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof wd.a) {
            Objects.requireNonNull(activity, "activity");
            Application application = activity.getApplication();
            if (!(application instanceof wd.a)) {
                throw new RuntimeException(String.format("%s does not implement %s", application.getClass().getCanonicalName(), wd.a.class.getCanonicalName()));
            }
            wd.a aVar = (wd.a) application;
            dagger.android.a<Object> d = aVar.d();
            m9.a.m(d, "%s.androidInjector() returned null", aVar.getClass());
            d.a(activity);
        }
        if (activity instanceof androidx.fragment.app.o) {
            ((androidx.fragment.app.o) activity).u().n.f2279a.add(new x.a(new a(), true));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
