package l4;

import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.discover.DiscoverFragment;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes2.dex */
public final class c implements NotifyingLinearLayoutManager.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotifyingLinearLayoutManager f12226a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DiscoverFragment f12227b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o4.c f12228c;

    public c(NotifyingLinearLayoutManager notifyingLinearLayoutManager, DiscoverFragment discoverFragment, o4.c cVar) {
        this.f12226a = notifyingLinearLayoutManager;
        this.f12227b = discoverFragment;
        this.f12228c = cVar;
    }

    @Override // com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager.a
    public void a() {
        int Y0 = this.f12226a.Y0();
        int X0 = this.f12226a.X0();
        if (X0 != -1 && Y0 != -1) {
            int i10 = (Y0 - X0) + 1;
            HomeActivityViewModel homeActivityViewModel = this.f12227b.f5137s0;
            if (homeActivityViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel = null;
            }
            homeActivityViewModel.f(o.c(this.f12228c, i10));
            this.f12226a.E = null;
        }
    }
}
