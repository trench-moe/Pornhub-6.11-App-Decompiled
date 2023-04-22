package w2;

import com.app.pornhub.data.model.photo.AlbumResponse;
import com.app.pornhub.data.model.photo.CommunityAlbumsResponse;
import com.app.pornhub.data.model.photo.FavoritePhotosResponse;
import com.app.pornhub.data.model.photo.UserAlbumsResponse;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JP\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'J,\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0002H'¨\u0006\u0015"}, d2 = {"Lw2/j;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "order", PerformersConfig.TYPE_FILTER, BuildConfig.FLAVOR, "limit", "offset", "segment", "search", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/photo/CommunityAlbumsResponse;", "a", "targetUserId", "Lcom/app/pornhub/data/model/photo/UserAlbumsResponse;", "d", "albumId", "Lcom/app/pornhub/data/model/photo/AlbumResponse;", DvdsConfig.TYPE_CATEGORY, "Lcom/app/pornhub/data/model/photo/FavoritePhotosResponse;", "b", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface j {
    @jf.f("getCommunityAlbums")
    Single<CommunityAlbumsResponse> a(@t("order") String str, @t("filter") String str2, @t("limit") int i10, @t("offset") int i11, @t("segment") String str3, @t("search") String str4);

    @jf.f("getUserFavoritePhotos")
    Single<FavoritePhotosResponse> b(@t("limit") int i10, @t("offset") int i11, @t("targetUserId") String str);

    @jf.f("getAlbumPhotos")
    Single<AlbumResponse> c(@t("limit") int i10, @t("offset") int i11, @t("albumId") String str);

    @jf.f("getUserAlbums")
    Single<UserAlbumsResponse> d(@t("limit") int i10, @t("offset") int i11, @t("targetUserId") String str, @t("filter") String str2);
}
