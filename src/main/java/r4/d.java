package r4;

import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.appcompat.widget.e0;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityLockedPayVideoBinding;
import com.app.pornhub.databinding.ItemPlaylistBindingBinding;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.home.playlists.PlaylistsOverviewAdapter;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import kotlin.jvm.internal.Intrinsics;
import x2.e1;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14660c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14661f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14662j;

    public /* synthetic */ d(Object obj, Object obj2, int i10) {
        this.f14660c = i10;
        this.f14661f = obj;
        this.f14662j = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f14660c) {
            case 0:
                ItemPlaylistBindingBinding binding = (ItemPlaylistBindingBinding) this.f14661f;
                e this$0 = (e) this.f14662j;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Playlist playlist = binding.f4758x;
                if (playlist == null) {
                    return;
                }
                e0 e0Var = new e0(new j.c(view.getContext(), (int) R.style.PlaylistOptionsPopupMenu), view);
                e0Var.a(R.menu.menu_playlist_options);
                if (Intrinsics.areEqual(playlist.getStatus(), PlaylistsConfig.TYPE_PRIVATE)) {
                    e0Var.f981b.findItem(R.id.share).setVisible(false);
                }
                e0Var.d = new e1(this$0, playlist, 2);
                e0Var.b();
                return;
            case 1:
                PlaylistsOverviewAdapter.Item item = (PlaylistsOverviewAdapter.Item) this.f14661f;
                PlaylistsOverviewAdapter this$02 = (PlaylistsOverviewAdapter) this.f14662j;
                int i10 = PlaylistsOverviewAdapter.c.f5255w;
                Intrinsics.checkNotNullParameter(item, "$item");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (item.b() == null) {
                    return;
                }
                this$02.d.b(item.b());
                return;
            default:
                LockedPayVideoActivity this$03 = (LockedPayVideoActivity) this.f14661f;
                AlphaAnimation fadeOutAnim = (AlphaAnimation) this.f14662j;
                int i11 = LockedPayVideoActivity.R;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(fadeOutAnim, "$fadeOutAnim");
                view.setEnabled(false);
                ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this$03.N;
                if (activityLockedPayVideoBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    activityLockedPayVideoBinding = null;
                }
                activityLockedPayVideoBinding.f4415u.startAnimation(fadeOutAnim);
                return;
        }
    }
}
