package com.app.pornhub.view.playlistdetails;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.o;
import androidx.lifecycle.z;
import b5.d;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import g4.b;
import g4.p;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t3.l;
import x2.g;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/playlistdetails/PlaylistVideosFragment;", "Ld4/a;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PlaylistVideosFragment extends d4.a {
    public static final /* synthetic */ int C0 = 0;
    public PlaylistDetailsViewModel A0;
    public d B0;

    /* renamed from: z0  reason: collision with root package name */
    public Map<Integer, View> f5449z0 = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a implements d.c {
        public a() {
        }

        @Override // c4.j.b
        public void a(VideoMetaData videoMetaData) {
            Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
            if (videoMetaData.isPaid() && !videoMetaData.isAvailable()) {
                PlaylistVideosFragment playlistVideosFragment = PlaylistVideosFragment.this;
                Context q10 = playlistVideosFragment.q();
                Intrinsics.checkNotNull(q10);
                Intrinsics.checkNotNullExpressionValue(q10, "context!!");
                playlistVideosFragment.I0(LockedPayVideoActivity.D(q10, videoMetaData));
                return;
            }
            Playlist d = PlaylistVideosFragment.this.X0().e().d();
            if (d == null) {
                return;
            }
            PlaylistVideosFragment playlistVideosFragment2 = PlaylistVideosFragment.this;
            playlistVideosFragment2.X0().f(d, videoMetaData.getVkey());
            playlistVideosFragment2.I0(VideoDetailsActivity.F(playlistVideosFragment2.q(), d));
        }

        @Override // b5.d.c
        public void e(VideoMetaData videoMetaData) {
            Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
            Context q10 = PlaylistVideosFragment.this.q();
            Intrinsics.checkNotNull(q10);
            l.f(q10, videoMetaData);
        }
    }

    @Override // d4.a
    public void K0() {
        PlaylistDetailsViewModel X0 = X0();
        boolean z10 = false;
        if (X0.f5438j.size() % 8 == 0) {
            if (Intrinsics.areEqual(X0.f5436h.d(), PlaylistDetailsViewModel.a.e.f5447a) || Intrinsics.areEqual(X0.f5436h.d(), PlaylistDetailsViewModel.a.f.f5448a)) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            Disposable subscribe = X0.f5433e.a(X0.n, Integer.valueOf(X0.f5438j.size())).subscribe(new g(X0, 16));
            Intrinsics.checkNotNullExpressionValue(subscribe, "getPlaylistUseCase.execu…          }\n            }");
            DisposableKt.addTo(subscribe, X0.f16001c);
        }
    }

    @Override // d4.a
    public c4.a L0() {
        return this.B0;
    }

    @Override // d4.a
    public String M0() {
        String I = I(R.string.no_video_to_display);
        Intrinsics.checkNotNullExpressionValue(I, "getString(R.string.no_video_to_display)");
        return I;
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.B0 = new d(new a(), X0());
    }

    @Override // d4.a
    public void W0() {
    }

    public final PlaylistDetailsViewModel X0() {
        PlaylistDetailsViewModel playlistDetailsViewModel = this.A0;
        if (playlistDetailsViewModel != null) {
            return playlistDetailsViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playlistDetailsViewModel");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        this.f5449z0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        o s02 = s0();
        Intrinsics.checkNotNullExpressionValue(s02, "requireActivity()");
        z.b viewModelFactory = this.f8758n0;
        Intrinsics.checkNotNullExpressionValue(viewModelFactory, "viewModelFactory");
        PlaylistDetailsViewModel playlistDetailsViewModel = (PlaylistDetailsViewModel) new z(s02, viewModelFactory).a(PlaylistDetailsViewModel.class);
        Intrinsics.checkNotNullParameter(playlistDetailsViewModel, "<set-?>");
        this.A0 = playlistDetailsViewModel;
        X0().f5437i.f(K(), new g4.o(this, 3));
        X0().f5441m.f(K(), new b(this, 4));
        X0().f5436h.f(K(), new p(this, 8));
    }
}
