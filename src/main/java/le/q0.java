package le;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes3.dex */
public final class q0<T> extends ne.m<T> {

    /* renamed from: f  reason: collision with root package name */
    public CoroutineContext f12830f;

    /* renamed from: j  reason: collision with root package name */
    public Object f12831j;

    @Override // ne.m, le.a
    public void C(Object obj) {
        CoroutineContext coroutineContext = this.f12830f;
        if (coroutineContext != null) {
            ThreadContextKt.a(coroutineContext, this.f12831j);
            this.f12830f = null;
            this.f12831j = null;
        }
        t9.k0.i(obj, null);
        throw null;
    }

    public final boolean D() {
        if (this.f12830f == null) {
            return false;
        }
        this.f12830f = null;
        this.f12831j = null;
        return true;
    }
}
