package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/k;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "<anonymous parameter 1>", BuildConfig.FLAVOR, "onStateChanged", "(Landroidx/lifecycle/k;Landroidx/lifecycle/Lifecycle$Event;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes.dex */
final class LifecycleController$observer$1 implements i {
    @Override // androidx.lifecycle.i
    public final void c(k kVar, Lifecycle.Event event) {
        Lifecycle b10 = kVar.b();
        Intrinsics.checkExpressionValueIsNotNull(b10, "source.lifecycle");
        if (((l) b10).f2375b == Lifecycle.State.DESTROYED) {
            throw null;
        }
        Lifecycle b11 = kVar.b();
        Intrinsics.checkExpressionValueIsNotNull(b11, "source.lifecycle");
        Lifecycle.State state = ((l) b11).f2375b;
        Objects.requireNonNull(null);
        throw null;
    }
}
