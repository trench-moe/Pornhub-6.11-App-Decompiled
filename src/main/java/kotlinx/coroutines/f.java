package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import le.s0;

/* loaded from: classes3.dex */
public final class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public static final f f12117f = new f();

    @Override // kotlinx.coroutines.b
    public void m(CoroutineContext coroutineContext, Runnable runnable) {
        if (((s0) coroutineContext.get(s0.f12835c)) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // kotlinx.coroutines.b
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
