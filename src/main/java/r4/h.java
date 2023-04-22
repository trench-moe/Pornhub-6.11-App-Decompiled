package r4;

import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.playlists.PlaylistsCommonFragment;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes2.dex */
public final class h implements NotifyingLinearLayoutManager.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotifyingLinearLayoutManager f14671a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PlaylistsCommonFragment f14672b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ PlaylistsOverviewAdapter f14673c;

    public h(NotifyingLinearLayoutManager notifyingLinearLayoutManager, PlaylistsCommonFragment playlistsCommonFragment, PlaylistsOverviewAdapter playlistsOverviewAdapter) {
        this.f14671a = notifyingLinearLayoutManager;
        this.f14672b = playlistsCommonFragment;
        this.f14673c = playlistsOverviewAdapter;
    }

    @Override // com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager.a
    public void a() {
        int Y0 = this.f14671a.Y0();
        int X0 = this.f14671a.X0();
        if (X0 == -1 || Y0 == -1) {
            return;
        }
        int i10 = (Y0 - X0) + 1;
        HomeActivityViewModel homeActivityViewModel = this.f14672b.f5248r0;
        if (homeActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
            homeActivityViewModel = null;
        }
        homeActivityViewModel.f(o.c(this.f14673c, i10));
        this.f14671a.E = null;
    }
}
