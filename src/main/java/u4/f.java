package u4;

import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.videolistings.VideoListingsFragment;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes2.dex */
public final class f implements NotifyingLinearLayoutManager.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotifyingLinearLayoutManager f15536a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VideoListingsFragment f15537b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f15538c;

    public f(NotifyingLinearLayoutManager notifyingLinearLayoutManager, VideoListingsFragment videoListingsFragment, i iVar) {
        this.f15536a = notifyingLinearLayoutManager;
        this.f15537b = videoListingsFragment;
        this.f15538c = iVar;
    }

    @Override // com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager.a
    public void a() {
        int Y0 = this.f15536a.Y0();
        int X0 = this.f15536a.X0();
        if (X0 == -1 || Y0 == -1) {
            return;
        }
        int i10 = (Y0 - X0) + 1;
        HomeActivityViewModel homeActivityViewModel = this.f15537b.f5335r0;
        if (homeActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel = null;
        }
        homeActivityViewModel.f(o.c(this.f15538c, i10));
        this.f15536a.E = null;
    }
}
