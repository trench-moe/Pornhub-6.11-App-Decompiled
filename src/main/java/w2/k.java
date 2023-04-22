package w2;

import com.app.pornhub.data.model.playlist.FavoritePlaylistsResponse;
import com.app.pornhub.data.model.playlist.PlaylistResponse;
import com.app.pornhub.data.model.playlist.PlaylistsOverviewResponse;
import com.app.pornhub.data.model.playlist.PrivatePlaylistsResponse;
import com.app.pornhub.data.model.playlist.PublicPlaylistsResponse;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000fH'¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lw2/k;", BuildConfig.FLAVOR, "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/playlist/PlaylistsOverviewResponse;", "e", BuildConfig.FLAVOR, "playlistsType", "Lcom/app/pornhub/data/model/playlist/PublicPlaylistsResponse;", "b", "Lcom/app/pornhub/data/model/playlist/PrivatePlaylistsResponse;", "d", "Lcom/app/pornhub/data/model/playlist/FavoritePlaylistsResponse;", DvdsConfig.TYPE_CATEGORY, BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "limit", "offset", "Lcom/app/pornhub/data/model/playlist/PlaylistResponse;", "a", "(JLjava/lang/Integer;Ljava/lang/Integer;)Lio/reactivex/Single;", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface k {
    @jf.f("getPlaylist")
    Single<PlaylistResponse> a(@t("playlistId") long j10, @t("limit") Integer num, @t("offset") Integer num2);

    @jf.f("getPlaylists")
    Single<PublicPlaylistsResponse> b(@t("playlistsType") String str);

    @jf.f("getPlaylists")
    Single<FavoritePlaylistsResponse> c(@t("playlistsType") String str);

    @jf.f("getPlaylists")
    Single<PrivatePlaylistsResponse> d(@t("playlistsType") String str);

    @jf.f("getPlaylistsOverview")
    Single<PlaylistsOverviewResponse> e();
}
