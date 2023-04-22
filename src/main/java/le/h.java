package le;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.JvmField;

/* loaded from: classes3.dex */
public final class h extends f0 {
    @JvmField
    public final f<?> n;

    public h(f<?> fVar) {
        this.n = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        k(th);
        return Unit.INSTANCE;
    }

    @Override // le.o
    public void k(Throwable th) {
        f<?> fVar = this.n;
        h0 l10 = l();
        Objects.requireNonNull(fVar);
        CancellationException d = l10.d();
        boolean z10 = false;
        if ((fVar.f12834j == 2) && fVar.p()) {
            z10 = ((ne.d) fVar.f12799m).h(d);
        }
        if (z10) {
            return;
        }
        fVar.j(d);
        fVar.l();
    }
}
