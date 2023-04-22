package le;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a<T> extends h0 implements Continuation<T> {
    public void C(Object obj) {
        b(obj);
    }

    @Override // le.h0, le.e0
    public boolean e() {
        return super.e();
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return null;
    }

    @Override // le.h0
    public String j() {
        return Intrinsics.stringPlus(getClass().getSimpleName(), " was cancelled");
    }

    @Override // le.h0
    public final void r(Throwable th) {
        l9.e.g(null, th);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object A;
        Object j10 = t9.k0.j(obj, null);
        do {
            A = A(q(), j10);
            if (A == i0.f12809a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + j10;
                m mVar = j10 instanceof m ? (m) j10 : null;
                throw new IllegalStateException(str, mVar != null ? mVar.f12823a : null);
            }
        } while (A == i0.f12811c);
        if (A == i0.f12810b) {
            return;
        }
        C(A);
    }

    @Override // le.h0
    public String t() {
        boolean z10 = p.f12826a;
        return super.t();
    }

    @Override // le.h0
    public final void w(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            Throwable th = mVar.f12823a;
            mVar.a();
        }
    }
}
