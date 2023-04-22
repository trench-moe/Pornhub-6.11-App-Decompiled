package w2;

import com.app.pornhub.data.model.ResultResponse;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.data.model.videos.AddFavoriteVideoRequest;
import com.app.pornhub.data.model.videos.AddVideoHistoryRequest;
import com.app.pornhub.data.model.videos.RateVideoRequest;
import com.app.pornhub.data.model.videos.RelatedVideosResponse;
import com.app.pornhub.data.model.videos.RemoveFavoriteVideoRequest;
import com.app.pornhub.data.model.videos.UserVideosResponse;
import com.app.pornhub.data.model.videos.VideoResponse;
import com.app.pornhub.data.model.videos.VideosResponse;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Completable;
import io.reactivex.Single;
import jf.t;
import jf.y;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0087\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0010\u0010\u0011J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u00022\b\b\u0001\u0010\u0013\u001a\u00020\u0002H'JK\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\b\b\u0001\u0010\u0016\u001a\u00020\u0002H'J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\b\b\u0001\u0010 \u001a\u00020\u001fH'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\b\b\u0001\u0010 \u001a\u00020\"H'J\u0012\u0010&\u001a\u00020%2\b\b\u0001\u0010 \u001a\u00020$H'J\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000e2\b\b\u0001\u0010 \u001a\u00020'H'J\u0012\u0010*\u001a\u00020%2\b\b\u0001\u0010)\u001a\u00020\u0002H'¨\u0006+"}, d2 = {"Lw2/p;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "order", PerformersConfig.TYPE_FILTER, BuildConfig.FLAVOR, "limit", "offset", "segment", "searchQuery", ExploreModel.CATEGORY, "quality", "production", "duration", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/videos/VideosResponse;", "h", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Single;", "targetUserId", "type", "Lcom/app/pornhub/data/model/videos/UserVideosResponse;", "g", "vkey", "lockedPage", "Lcom/app/pornhub/data/model/videos/RelatedVideosResponse;", "d", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/videos/VideoResponse;", "a", "Lcom/app/pornhub/data/model/ResultResponse;", "i", "Lcom/app/pornhub/data/model/videos/AddFavoriteVideoRequest;", "body", "b", "Lcom/app/pornhub/data/model/videos/RemoveFavoriteVideoRequest;", "f", "Lcom/app/pornhub/data/model/videos/AddVideoHistoryRequest;", "Lio/reactivex/Completable;", DvdsConfig.TYPE_CATEGORY, "Lcom/app/pornhub/data/model/videos/RateVideoRequest;", "j", "url", "e", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface p {
    @jf.f("getVideo")
    Single<VideoResponse> a(@t("vkey") String str);

    @jf.o("addFavoriteVideo")
    Single<ResultResponse> b(@jf.a AddFavoriteVideoRequest addFavoriteVideoRequest);

    @jf.o("addVideoToHistory")
    Completable c(@jf.a AddVideoHistoryRequest addVideoHistoryRequest);

    @jf.f("getRelatedVideos")
    Single<RelatedVideosResponse> d(@t("limit") int i10, @t("offset") Integer num, @t("vkey") String str, @t("segment") String str2, @t("lockedPage") Integer num2);

    @jf.f
    Completable e(@y String str);

    @jf.o("removeFavoriteVideo")
    Single<ResultResponse> f(@jf.a RemoveFavoriteVideoRequest removeFavoriteVideoRequest);

    @jf.f("getUserVideos")
    Single<UserVideosResponse> g(@t("limit") int i10, @t("offset") int i11, @t("targetUserId") String str, @t("show") String str2);

    @jf.f("getVideos")
    Single<VideosResponse> h(@t("order") String str, @t("filter") String str2, @t("limit") int i10, @t("offset") int i11, @t("segment") String str3, @t("search") String str4, @t("c") String str5, @t("hd") Integer num, @t("production") String str6, @t("min_duration") Integer num2);

    @jf.f("isFavoriteVideo")
    Single<ResultResponse> i(@t("vkey") String str);

    @jf.o("addRateVideo")
    Single<ResultResponse> j(@jf.a RateVideoRequest rateVideoRequest);
}
