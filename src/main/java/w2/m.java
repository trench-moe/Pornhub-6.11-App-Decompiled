package w2;

import com.app.pornhub.data.model.search.SearchSuggestionsResponse;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¨\u0006\t"}, d2 = {"Lw2/m;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "segment", "searchQuery", "source", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/search/SearchSuggestionsResponse;", "a", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface m {
    @jf.f("searchAutocomplete")
    Single<SearchSuggestionsResponse> a(@t("segment") String str, @t("search") String str2, @t("source") String str3);
}
