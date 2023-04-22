package x3;

import android.view.View;
import androidx.fragment.app.o;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.channel.Channel;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import com.app.pornhub.view.home.topnav.TopNavAdapter;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import r4.b;
import r4.c;
import t3.g;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17914c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17915f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f17916j;

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f17914c = i10;
        this.f17915f = obj;
        this.f17916j = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17914c) {
            case 0:
                ChannelActivity channelActivity = (ChannelActivity) this.f17915f;
                Channel channel = (Channel) this.f17916j;
                int i10 = ChannelActivity.O;
                Objects.requireNonNull(channelActivity);
                channelActivity.startActivity(BrowserActivity.B(channelActivity, channel.getJoinChannelLink(), String.format(channelActivity.getString(R.string.join_x), channel.getChannelMetaData().getTitle())));
                return;
            case 1:
                HomeActivity this$0 = (HomeActivity) this.f17915f;
                PromoBanner promoBanner = (PromoBanner) this.f17916j;
                int i11 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(promoBanner, "$promoBanner");
                this$0.J();
                g.f(this$0, false, null, null, null, promoBanner.getClickUrl());
                return;
            case 2:
                String str = (String) this.f17915f;
                r4.b this$02 = (r4.b) this.f17916j;
                int i12 = r4.b.E0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (str != null) {
                    o n = this$02.n();
                    if (n instanceof b.a) {
                        b.a aVar = (b.a) n;
                    }
                }
                this$02.K0();
                return;
            case 3:
                Playlist playlist = (Playlist) this.f17915f;
                PlaylistsOverviewAdapter this$03 = (PlaylistsOverviewAdapter) this.f17916j;
                int i13 = PlaylistsOverviewAdapter.e.f5262w;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (playlist == null) {
                    return;
                }
                this$03.d.a(playlist, c.b.f14657a);
                return;
            case 4:
                TopNavAdapter this$04 = (TopNavAdapter) this.f17915f;
                TopNavAdapter.TopNavItem item = (TopNavAdapter.TopNavItem) this.f17916j;
                int i14 = TopNavAdapter.e.f5329w;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                TopNavAdapter.a aVar2 = this$04.f5323f;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a(item);
                return;
            default:
                u4.d dVar = (u4.d) this.f17915f;
                dVar.S0.setVideos(BuildConfig.FLAVOR);
                dVar.S0.setQuality(BuildConfig.FLAVOR);
                dVar.S0.setProduction(BuildConfig.FLAVOR);
                dVar.S0.setDuration(BuildConfig.FLAVOR);
                dVar.S0.setCategory(BuildConfig.FLAVOR);
                dVar.S0((View) this.f17916j);
                return;
        }
    }
}
