package b4;

import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f implements NotifyingGridLayoutManager.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotifyingGridLayoutManager f3566a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f3567b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(NotifyingGridLayoutManager notifyingGridLayoutManager, Function1<? super Integer, Unit> function1) {
        this.f3566a = notifyingGridLayoutManager;
        this.f3567b = function1;
    }

    @Override // com.app.pornhub.view.common.widget.NotifyingGridLayoutManager.a
    public void a() {
        int Y0 = this.f3566a.Y0();
        int X0 = this.f3566a.X0();
        if (X0 != -1 && Y0 != -1) {
            this.f3567b.invoke(Integer.valueOf((Y0 - X0) + 1));
            this.f3566a.M = null;
        }
    }
}
