package com.app.pornhub.data.model.playlist;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistResponse;", BuildConfig.FLAVOR, PlaylistsConfig.TYPE_PLAYLIST, "Lcom/app/pornhub/data/model/playlist/PlaylistModel;", SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Lcom/app/pornhub/data/model/playlist/PlaylistModel;Ljava/util/List;Lcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getPlaylist", "()Lcom/app/pornhub/data/model/playlist/PlaylistModel;", "getVideos", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistResponse {
    private final ErrorModel error;
    private final PlaylistModel playlist;
    private final List<VideoModel> videos;

    public PlaylistResponse(PlaylistModel playlist, List<VideoModel> list, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        this.playlist = playlist;
        this.videos = list;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaylistResponse copy$default(PlaylistResponse playlistResponse, PlaylistModel playlistModel, List list, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            playlistModel = playlistResponse.playlist;
        }
        if ((i10 & 2) != 0) {
            list = playlistResponse.videos;
        }
        if ((i10 & 4) != 0) {
            errorModel = playlistResponse.error;
        }
        return playlistResponse.copy(playlistModel, list, errorModel);
    }

    public final PlaylistModel component1() {
        return this.playlist;
    }

    public final List<VideoModel> component2() {
        return this.videos;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final PlaylistResponse copy(PlaylistModel playlist, List<VideoModel> list, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(playlist, "playlist");
        return new PlaylistResponse(playlist, list, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaylistResponse) {
            PlaylistResponse playlistResponse = (PlaylistResponse) obj;
            if (Intrinsics.areEqual(this.playlist, playlistResponse.playlist) && Intrinsics.areEqual(this.videos, playlistResponse.videos) && Intrinsics.areEqual(this.error, playlistResponse.error)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final PlaylistModel getPlaylist() {
        return this.playlist;
    }

    public final List<VideoModel> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int hashCode = this.playlist.hashCode() * 31;
        List<VideoModel> list = this.videos;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ErrorModel errorModel = this.error;
        if (errorModel != null) {
            i10 = errorModel.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("PlaylistResponse(playlist=");
        m10.append(this.playlist);
        m10.append(", videos=");
        m10.append(this.videos);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
