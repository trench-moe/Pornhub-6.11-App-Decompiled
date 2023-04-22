package q4;

import android.view.View;
import androidx.appcompat.widget.e0;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import com.app.pornhub.view.user.UserVideoListingsFragment;
import j1.g0;
import kotlin.jvm.internal.Intrinsics;
import q4.d;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14362c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14363f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14364j;

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f14362c = i10;
        this.f14363f = obj;
        this.f14364j = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14362c) {
            case 0:
                d this$0 = (d) this.f14363f;
                d.e item = (d.e) this.f14364j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                d.a aVar = this$0.f14349m;
                if (aVar == null) {
                    return;
                }
                aVar.b(item.f14356c);
                return;
            case 1:
                Playlist playlist = (Playlist) this.f14363f;
                PlaylistsOverviewAdapter this$02 = (PlaylistsOverviewAdapter) this.f14364j;
                int i10 = PlaylistsOverviewAdapter.e.f5262w;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (playlist == null) {
                    return;
                }
                e0 e0Var = new e0(new j.c(view.getContext(), (int) R.style.PlaylistOptionsPopupMenu), view);
                e0Var.a(R.menu.menu_playlist_options);
                if (Intrinsics.areEqual(playlist.getStatus(), PlaylistsConfig.TYPE_PRIVATE)) {
                    e0Var.f981b.findItem(R.id.share).setVisible(false);
                }
                e0Var.d = new g0(this$02, playlist, 1);
                e0Var.b();
                return;
            default:
                UserVideoListingsFragment userVideoListingsFragment = (UserVideoListingsFragment) this.f14363f;
                String str = (String) this.f14364j;
                int i11 = UserVideoListingsFragment.Q0;
                if (userVideoListingsFragment.q() != null) {
                    userVideoListingsFragment.I0(BrowserActivity.B(userVideoListingsFragment.q(), userVideoListingsFragment.G0.i(), str));
                    return;
                }
                return;
        }
    }
}
