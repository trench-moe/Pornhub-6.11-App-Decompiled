package p3;

import android.view.View;
import androidx.lifecycle.p;
import com.app.pornhub.databinding.ActivityPlaylistDetailsBindingImpl;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import java.util.Collections;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0242a f13787c;

    /* renamed from: f  reason: collision with root package name */
    public final int f13788f;

    /* renamed from: p3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0242a {
    }

    public a(InterfaceC0242a interfaceC0242a, int i10) {
        this.f13787c = interfaceC0242a;
        this.f13788f = i10;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Boolean d;
        InterfaceC0242a interfaceC0242a = this.f13787c;
        int i10 = this.f13788f;
        ActivityPlaylistDetailsBindingImpl activityPlaylistDetailsBindingImpl = (ActivityPlaylistDetailsBindingImpl) interfaceC0242a;
        Objects.requireNonNull(activityPlaylistDetailsBindingImpl);
        boolean z10 = false;
        if (i10 == 1) {
            PlaylistDetailsActivity.a aVar = activityPlaylistDetailsBindingImpl.f4462w;
            if (aVar != null) {
                z10 = true;
            }
            if (z10) {
                aVar.a();
            }
        } else if (i10 == 2) {
            PlaylistDetailsActivity.a aVar2 = activityPlaylistDetailsBindingImpl.f4462w;
            Playlist playlist = activityPlaylistDetailsBindingImpl.f4463x;
            if (aVar2 != null) {
                if (playlist != null) {
                    z10 = true;
                }
                if (z10) {
                    aVar2.c(playlist.getId());
                }
            }
        } else if (i10 == 3) {
            PlaylistDetailsActivity.a aVar3 = activityPlaylistDetailsBindingImpl.f4462w;
            Playlist playlist2 = activityPlaylistDetailsBindingImpl.f4463x;
            if (aVar3 != null) {
                if (playlist2 != null) {
                    z10 = true;
                }
                if (z10) {
                    aVar3.b(playlist2.getUserId(), playlist2.getUsername());
                }
            }
        } else if (i10 == 4) {
            PlaylistDetailsActivity.a aVar4 = activityPlaylistDetailsBindingImpl.f4462w;
            if (aVar4 != null) {
                z10 = true;
            }
            if (z10) {
                aVar4.d();
            }
        } else if (i10 != 5) {
        } else {
            PlaylistDetailsViewModel playlistDetailsViewModel = activityPlaylistDetailsBindingImpl.f4461v;
            if (playlistDetailsViewModel != null) {
                z10 = true;
            }
            if (z10) {
                p<Boolean> pVar = playlistDetailsViewModel.f5440l;
                Intrinsics.checkNotNull(pVar.d());
                pVar.l(Boolean.valueOf(!d.booleanValue()));
                Boolean d10 = playlistDetailsViewModel.f5440l.d();
                Intrinsics.checkNotNull(d10);
                Intrinsics.checkNotNullExpressionValue(d10, "shuffleLiveData.value!!");
                if (!d10.booleanValue()) {
                    playlistDetailsViewModel.f5437i.l(playlistDetailsViewModel.f5438j);
                    return;
                }
                Collections.shuffle(playlistDetailsViewModel.f5439k);
                playlistDetailsViewModel.f5437i.l(playlistDetailsViewModel.f5439k);
            }
        }
    }
}
