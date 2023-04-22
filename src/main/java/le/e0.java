package le;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface e0 extends CoroutineContext.Element {
    public static final /* synthetic */ int d = 0;

    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ u a(e0 e0Var, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return e0Var.c(z10, z11, function1);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements CoroutineContext.Key<e0> {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ b f12796c = new b();
    }

    u c(boolean z10, boolean z11, Function1<? super Throwable, Unit> function1);

    CancellationException d();

    boolean e();
}
