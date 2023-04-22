package le;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class j extends f0 implements i {
    @Override // le.i
    public boolean b(Throwable th) {
        h0 l10 = l();
        if (th instanceof CancellationException) {
            return true;
        }
        return l10.f(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Throwable th) {
        l();
        throw null;
    }

    @Override // le.o
    public void k(Throwable th) {
        l();
        throw null;
    }
}
