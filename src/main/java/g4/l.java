package g4;

import android.content.Context;
import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.editplaylist.EditPlaylistActivity;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import com.app.pornhub.view.home.topnav.TopNavAdapter;
import com.app.pornhub.view.offline.OfflineVideoPopupDialog;
import com.appsflyer.oaid.BuildConfig;
import kotlin.jvm.internal.Intrinsics;
import r4.c;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9745c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f9746f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f9747j;

    public /* synthetic */ l(Object obj, Object obj2, int i10) {
        this.f9745c = i10;
        this.f9746f = obj;
        this.f9747j = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9745c) {
            case 0:
                HomeActivity this$0 = (HomeActivity) this.f9746f;
                PromoBanner promoBanner = (PromoBanner) this.f9747j;
                int i10 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(promoBanner, "$promoBanner");
                this$0.startActivity(BrowserActivity.B(this$0, promoBanner.getClickUrl(), BuildConfig.FLAVOR));
                t3.g.e(this$0, false, null, null, null, promoBanner.getClickUrl());
                return;
            case 1:
                r4.b this$02 = (r4.b) this.f9746f;
                int i11 = r4.b.E0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Context u02 = this$02.u0();
                Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
                this$02.I0(EditPlaylistActivity.C(u02, 0L, (String) this.f9747j));
                this$02.K0();
                return;
            case 2:
                Playlist playlist = (Playlist) this.f9746f;
                PlaylistsOverviewAdapter this$03 = (PlaylistsOverviewAdapter) this.f9747j;
                int i12 = PlaylistsOverviewAdapter.e.f5262w;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (playlist == null) {
                    return;
                }
                this$03.d.a(playlist, c.C0253c.f14658a);
                return;
            case 3:
                TopNavAdapter this$04 = (TopNavAdapter) this.f9746f;
                TopNavAdapter.TopNavItem item = (TopNavAdapter.TopNavItem) this.f9747j;
                int i13 = TopNavAdapter.b.f5324w;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                TopNavAdapter.a aVar = this$04.f5323f;
                if (aVar == null) {
                    return;
                }
                aVar.a(item);
                return;
            default:
                OfflineVideoPopupDialog offlineVideoPopupDialog = (OfflineVideoPopupDialog) this.f9746f;
                String str = (String) this.f9747j;
                int i14 = OfflineVideoPopupDialog.E0;
                t3.g.k(offlineVideoPopupDialog.q(), str.equals(offlineVideoPopupDialog.D0.l()) ? "offline_videos_menu" : "offline_video_action_button");
                offlineVideoPopupDialog.I0(PremiumRegistrationActivity.B(offlineVideoPopupDialog.q(), offlineVideoPopupDialog.I(R.string.get_pornhub_premium), str));
                offlineVideoPopupDialog.L0(false, false);
                return;
        }
    }
}
