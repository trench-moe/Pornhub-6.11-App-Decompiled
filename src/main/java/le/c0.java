package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class c0 extends f0 {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12795t = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;
    public final Function1<Throwable, Unit> n;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(Function1<? super Throwable, Unit> function1) {
        this.n = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        k(th);
        return Unit.INSTANCE;
    }

    @Override // le.o
    public void k(Throwable th) {
        if (f12795t.compareAndSet(this, 0, 1)) {
            this.n.invoke(th);
        }
    }
}
