package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: classes3.dex */
public final class r<T> extends ne.m<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12832f = AtomicIntegerFieldUpdater.newUpdater(r.class, "_decision");
    private volatile /* synthetic */ int _decision;

    @Override // ne.m, le.a
    public void C(Object obj) {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 == 0) {
                if (f12832f.compareAndSet(this, 0, 2)) {
                    z10 = true;
                    break;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (z10) {
            return;
        }
        ne.e.a(IntrinsicsKt.intercepted(null), t9.k0.i(obj, null), null, 2);
    }

    @Override // ne.m, le.h0
    public void b(Object obj) {
        C(obj);
    }
}
