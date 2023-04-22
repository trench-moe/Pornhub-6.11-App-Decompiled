package n4;

import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.explore.ExploreFragment;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes2.dex */
public final class e implements NotifyingLinearLayoutManager.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotifyingLinearLayoutManager f13293a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExploreFragment f13294b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o4.c f13295c;

    public e(NotifyingLinearLayoutManager notifyingLinearLayoutManager, ExploreFragment exploreFragment, o4.c cVar) {
        this.f13293a = notifyingLinearLayoutManager;
        this.f13294b = exploreFragment;
        this.f13295c = cVar;
    }

    @Override // com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager.a
    public void a() {
        int Y0 = this.f13293a.Y0();
        int X0 = this.f13293a.X0();
        if (X0 != -1 && Y0 != -1) {
            int i10 = (Y0 - X0) + 1;
            HomeActivityViewModel homeActivityViewModel = this.f13294b.f5159s0;
            if (homeActivityViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel = null;
            }
            homeActivityViewModel.f(o.c(this.f13295c, i10));
            this.f13293a.E = null;
        }
    }
}
