package ne;

import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import t9.k0;

/* loaded from: classes3.dex */
public class m<T> extends le.a<T> implements CoroutineStackFrame {
    @Override // le.a
    public void C(Object obj) {
        k0.i(obj, null);
        throw null;
    }

    @Override // le.h0
    public void b(Object obj) {
        e.a(IntrinsicsKt.intercepted(null), k0.i(obj, null), null, 2);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // le.h0
    public final boolean s() {
        return true;
    }
}
