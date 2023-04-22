package r4;

import com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.playlists.PlaylistsCommonFragment;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes2.dex */
public final class i implements NotifyingLinearLayoutManager.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NotifyingLinearLayoutManager f14674a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PlaylistsCommonFragment f14675b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f14676c;

    public i(NotifyingLinearLayoutManager notifyingLinearLayoutManager, PlaylistsCommonFragment playlistsCommonFragment, e eVar) {
        this.f14674a = notifyingLinearLayoutManager;
        this.f14675b = playlistsCommonFragment;
        this.f14676c = eVar;
    }

    @Override // com.app.pornhub.view.common.widget.NotifyingLinearLayoutManager.a
    public void a() {
        int Y0 = this.f14674a.Y0();
        int X0 = this.f14674a.X0();
        if (X0 != -1 && Y0 != -1) {
            int i10 = (Y0 - X0) + 1;
            HomeActivityViewModel homeActivityViewModel = this.f14675b.f5248r0;
            if (homeActivityViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                homeActivityViewModel = null;
            }
            homeActivityViewModel.f(o.c(this.f14676c, i10));
            this.f14674a.E = null;
        }
    }
}
