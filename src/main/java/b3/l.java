package b3;

import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.search.SearchSuggestions;
import io.reactivex.Single;

/* loaded from: classes.dex */
public interface l {
    Single<SearchSuggestions> a(String str, SearchSuggestionsConfig.SearchSource searchSource);
}
