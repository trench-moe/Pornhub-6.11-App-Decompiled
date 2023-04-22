package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.h;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements q1.b<k> {
    @Override // q1.b
    public List<Class<? extends q1.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // q1.b
    public k b(Context context) {
        if (!h.f2373a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new h.a());
        }
        s sVar = s.y;
        Objects.requireNonNull(sVar);
        sVar.n = new Handler();
        sVar.f2393t.e(Lifecycle.Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new t(sVar));
        return sVar;
    }
}
