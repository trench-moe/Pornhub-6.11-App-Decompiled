package le;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class d0 extends g0 {
    public final Function1<Throwable, Unit> n;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(Function1<? super Throwable, Unit> function1) {
        this.n = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Throwable th) {
        this.n.invoke(th);
        return Unit.INSTANCE;
    }

    @Override // le.o
    public void k(Throwable th) {
        this.n.invoke(th);
    }
}
