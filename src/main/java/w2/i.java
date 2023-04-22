package w2;

import com.app.pornhub.data.model.pornstar.PerformerConfigModel;
import com.app.pornhub.data.model.pornstar.PerformerResponse;
import com.app.pornhub.data.model.pornstar.PerformersResponse;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import java.util.Map;
import jf.t;
import jf.u;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001Jt\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH'JI\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014JI\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00022\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0015\u0010\u0014J\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002H'¨\u0006\u0018"}, d2 = {"Lw2/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "order", PerformersConfig.TYPE_FILTER, BuildConfig.FLAVOR, "limit", "offset", "segment", "performerType", "search", BuildConfig.FLAVOR, "additionalFilters", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/pornstar/PerformersResponse;", DvdsConfig.TYPE_CATEGORY, "slug", "premium", "Lcom/app/pornhub/data/model/pornstar/PerformerResponse;", "a", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Single;", "d", "Lcom/app/pornhub/data/model/pornstar/PerformerConfigModel;", "b", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface i {
    @jf.f("getPornstar")
    Single<PerformerResponse> a(@t("limit") int i10, @t("offset") int i11, @t("order") String str, @t("slug") String str2, @t("premium") Integer num);

    @jf.f("getConfiguration")
    Single<PerformerConfigModel> b(@t("segment") String str);

    @jf.f("getPornstars")
    Single<PerformersResponse> c(@t("order") String str, @t("filter") String str2, @t("limit") int i10, @t("offset") int i11, @t("segment") String str3, @t("performerType") String str4, @t("search") String str5, @u Map<String, String> map);

    @jf.f("getAmateur")
    Single<PerformerResponse> d(@t("limit") int i10, @t("offset") int i11, @t("order") String str, @t("slug") String str2, @t("premium") Integer num);
}
