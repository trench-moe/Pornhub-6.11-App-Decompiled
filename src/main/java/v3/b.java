package v3;

import android.annotation.SuppressLint;
import androidx.lifecycle.z;
import dagger.android.DispatchingAndroidInjector;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

@SuppressLint({"Registered"})
/* loaded from: classes.dex */
public class b extends y4.b {
    public DispatchingAndroidInjector<Object> H;
    public z.b I;
    public j.a J;

    public b() {
        new LinkedHashMap();
    }

    public final z.b B() {
        z.b bVar = this.I;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // y4.b, wd.a
    public dagger.android.a<Object> d() {
        DispatchingAndroidInjector<Object> dispatchingAndroidInjector = this.H;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dispatchingAndroidInjector");
        return null;
    }

    public void i() {
    }
}
