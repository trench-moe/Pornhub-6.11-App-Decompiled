package z2;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends y.k {
    @Override // androidx.fragment.app.y.k
    public void a(androidx.fragment.app.y fm, Fragment f10, Bundle bundle) {
        wd.a aVar;
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f10, "f");
        if (f10 instanceof cp) {
            Objects.requireNonNull(f10, "fragment");
            Fragment fragment = f10;
            while (true) {
                fragment = fragment.L;
                if (fragment == null) {
                    androidx.fragment.app.o n = f10.n();
                    if (n instanceof wd.a) {
                        aVar = (wd.a) n;
                    } else if (!(n.getApplication() instanceof wd.a)) {
                        throw new IllegalArgumentException(String.format("No injector was found for %s", f10.getClass().getCanonicalName()));
                    } else {
                        aVar = (wd.a) n.getApplication();
                    }
                } else if (fragment instanceof wd.a) {
                    aVar = (wd.a) fragment;
                    break;
                }
            }
            if (Log.isLoggable("dagger.android.support", 3)) {
                Log.d("dagger.android.support", String.format("An injector for %s was found in %s", f10.getClass().getCanonicalName(), aVar.getClass().getCanonicalName()));
            }
            dagger.android.a<Object> d = aVar.d();
            m9.a.m(d, "%s.androidInjector() returned null", aVar.getClass());
            d.a(f10);
        }
    }
}
