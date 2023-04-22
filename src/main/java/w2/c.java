package w2;

import com.app.pornhub.data.model.categories.CategoriesResponse;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import java.util.Map;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'J.\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H'¨\u0006\r"}, d2 = {"Lw2/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "segment", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/categories/CategoriesResponse;", "a", ExploreModel.CATEGORY, "categoryList", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface c {
    @jf.f("categories")
    Single<CategoriesResponse> a(@t("segment") String str);

    @jf.f("categoriesInvalidCombos")
    Single<Map<Integer, Boolean>> b(@t("category") String str, @t("categoryList") String str2);
}
