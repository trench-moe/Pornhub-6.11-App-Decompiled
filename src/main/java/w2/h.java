package w2;

import com.app.pornhub.data.model.ResultResponse;
import com.app.pornhub.data.model.gifs.AddFavoriteGifRequest;
import com.app.pornhub.data.model.gifs.GifListResponse;
import com.app.pornhub.data.model.gifs.GifResponse;
import com.app.pornhub.data.model.gifs.MostRecentGifsResponse;
import com.app.pornhub.data.model.gifs.RateGifRequest;
import com.app.pornhub.data.model.gifs.RelatedGifsResponse;
import com.app.pornhub.data.model.gifs.ReportGifRequest;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Completable;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JR\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002H'J,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0002H'J,\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0002H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\b\b\u0001\u0010\r\u001a\u00020\u0002H'J\u0012\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H'J\u0012\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0018H'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\n2\b\b\u0001\u0010\u0015\u001a\u00020\u001aH'¨\u0006\u001d"}, d2 = {"Lw2/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "order", PerformersConfig.TYPE_FILTER, BuildConfig.FLAVOR, "limit", "offset", "segment", "searchQuery", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/gifs/GifListResponse;", DvdsConfig.TYPE_CATEGORY, "id", "Lcom/app/pornhub/data/model/gifs/RelatedGifsResponse;", "g", "Lcom/app/pornhub/data/model/gifs/MostRecentGifsResponse;", "d", "Lcom/app/pornhub/data/model/gifs/GifResponse;", "a", "Lcom/app/pornhub/data/model/gifs/RateGifRequest;", "body", "Lio/reactivex/Completable;", "e", "Lcom/app/pornhub/data/model/gifs/ReportGifRequest;", "f", "Lcom/app/pornhub/data/model/gifs/AddFavoriteGifRequest;", "Lcom/app/pornhub/data/model/ResultResponse;", "b", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface h {
    @jf.f("getGif")
    Single<GifResponse> a(@t("id") String str);

    @jf.o("addFavoriteGif")
    Single<ResultResponse> b(@jf.a AddFavoriteGifRequest addFavoriteGifRequest);

    @jf.f("getGifs")
    Single<GifListResponse> c(@t("order") String str, @t("filter") String str2, @t("limit") int i10, @t("offset") int i11, @t("segment") String str3, @t("search") String str4);

    @jf.f("getMostRecentGifs")
    Single<MostRecentGifsResponse> d(@t("limit") int i10, @t("offset") int i11, @t("id") String str);

    @jf.o("addRateGif")
    Completable e(@jf.a RateGifRequest rateGifRequest);

    @jf.o("flagGif")
    Completable f(@jf.a ReportGifRequest reportGifRequest);

    @jf.f("getRelatedGifs")
    Single<RelatedGifsResponse> g(@t("limit") int i10, @t("offset") int i11, @t("id") String str);
}
