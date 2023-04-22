package ea;

import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class t extends LifecycleCallback {

    /* renamed from: f  reason: collision with root package name */
    public final List<WeakReference<p<?>>> f9301f;

    public t(e9.f fVar) {
        super(fVar);
        this.f9301f = new ArrayList();
        fVar.d("TaskOnStopCallback", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        synchronized (this.f9301f) {
            for (WeakReference<p<?>> weakReference : this.f9301f) {
                p<?> pVar = weakReference.get();
                if (pVar != null) {
                    pVar.a();
                }
            }
            this.f9301f.clear();
        }
    }
}
