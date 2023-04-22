package w2;

import com.app.pornhub.data.model.adspromos.PromoBannerResponse;
import com.app.pornhub.data.model.adspromos.TrafficJunkyAdModel;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import jf.y;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002H'¨\u0006\n"}, d2 = {"Lw2/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "url", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/adspromos/TrafficJunkyAdModel;", "b", "segment", "Lcom/app/pornhub/data/model/adspromos/PromoBannerResponse;", "a", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface a {
    @jf.f("getPromoBanner")
    Single<PromoBannerResponse> a(@t("segment") String str);

    @jf.f
    Single<TrafficJunkyAdModel> b(@y String str);
}
