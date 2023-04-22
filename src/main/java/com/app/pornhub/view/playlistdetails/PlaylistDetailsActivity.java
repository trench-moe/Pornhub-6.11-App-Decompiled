package com.app.pornhub.view.playlistdetails;

import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.d;
import androidx.lifecycle.z;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityPlaylistDetailsBinding;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.view.editplaylist.EditPlaylistActivity;
import com.app.pornhub.view.user.ProfileActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import g4.c;
import h4.h;
import i4.g;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import r4.b;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/app/pornhub/view/playlistdetails/PlaylistDetailsActivity;", "Lv3/b;", "Lr4/b$a;", "<init>", "()V", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PlaylistDetailsActivity extends v3.b implements b.a {
    public static final /* synthetic */ int M = 0;
    public PlaylistDetailsViewModel K;
    public ActivityPlaylistDetailsBinding L;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b(long j10, String str);

        void c(long j10);

        void d();
    }

    /* loaded from: classes.dex */
    public static final class b implements a {
        public b() {
        }

        @Override // com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity.a
        public void a() {
            PlaylistDetailsActivity.this.finish();
        }

        @Override // com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity.a
        public void b(long j10, String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            PlaylistDetailsActivity playlistDetailsActivity = PlaylistDetailsActivity.this;
            String valueOf = String.valueOf(j10);
            int i10 = ProfileActivity.L;
            Intent intent = new Intent();
            intent.setClass(playlistDetailsActivity, ProfileActivity.class);
            intent.putExtra("username", username);
            intent.putExtra("userId", valueOf);
            playlistDetailsActivity.startActivity(intent);
        }

        @Override // com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity.a
        public void c(long j10) {
            PlaylistDetailsActivity playlistDetailsActivity = PlaylistDetailsActivity.this;
            playlistDetailsActivity.startActivity(EditPlaylistActivity.C(playlistDetailsActivity, j10, null));
        }

        @Override // com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity.a
        public void d() {
            Playlist d = PlaylistDetailsActivity.this.C().e().d();
            if (d == null || d.getVideoCount() <= 0) {
                return;
            }
            PlaylistDetailsActivity.this.C().f(d, null);
            PlaylistDetailsActivity playlistDetailsActivity = PlaylistDetailsActivity.this;
            playlistDetailsActivity.startActivity(VideoDetailsActivity.F(playlistDetailsActivity, d));
        }
    }

    public PlaylistDetailsActivity() {
        new LinkedHashMap();
    }

    public final PlaylistDetailsViewModel C() {
        PlaylistDetailsViewModel playlistDetailsViewModel = this.K;
        if (playlistDetailsViewModel != null) {
            return playlistDetailsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playlistDetailsViewModel");
        return null;
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding d = d.d(this, R.layout.activity_playlist_details);
        Intrinsics.checkNotNullExpressionValue(d, "setContentView(this, R.l…ctivity_playlist_details)");
        this.L = (ActivityPlaylistDetailsBinding) d;
        PlaylistDetailsViewModel playlistDetailsViewModel = (PlaylistDetailsViewModel) new z(this, B()).a(PlaylistDetailsViewModel.class);
        Intrinsics.checkNotNullParameter(playlistDetailsViewModel, "<set-?>");
        this.K = playlistDetailsViewModel;
        long longExtra = getIntent().getLongExtra("playlist_id", 0L);
        PlaylistDetailsViewModel C = C();
        if (C.n == 0) {
            C.n = longExtra;
        }
        C.e().f(this, new h(this, 6));
        C().f5436h.f(this, new g(this, 5));
        C().f5440l.f(this, new c(this, 8));
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding = this.L;
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding2 = null;
        if (activityPlaylistDetailsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPlaylistDetailsBinding = null;
        }
        activityPlaylistDetailsBinding.n(new b());
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding3 = this.L;
        if (activityPlaylistDetailsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityPlaylistDetailsBinding2 = activityPlaylistDetailsBinding3;
        }
        activityPlaylistDetailsBinding2.f4452l.f4698a.setOnClickListener(new x3.b(this, 13));
    }
}
