package com.app.pornhub.data.model.search;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/app/pornhub/data/model/search/SearchSuggestionsResponse;", BuildConfig.FLAVOR, "source", BuildConfig.FLAVOR, "results", "Lcom/app/pornhub/data/model/search/SuggestionsResultModel;", "(Ljava/lang/String;Lcom/app/pornhub/data/model/search/SuggestionsResultModel;)V", "getResults", "()Lcom/app/pornhub/data/model/search/SuggestionsResultModel;", "getSource", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchSuggestionsResponse {
    private final SuggestionsResultModel results;
    private final String source;

    public SearchSuggestionsResponse(String source, SuggestionsResultModel results) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(results, "results");
        this.source = source;
        this.results = results;
    }

    public static /* synthetic */ SearchSuggestionsResponse copy$default(SearchSuggestionsResponse searchSuggestionsResponse, String str, SuggestionsResultModel suggestionsResultModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchSuggestionsResponse.source;
        }
        if ((i10 & 2) != 0) {
            suggestionsResultModel = searchSuggestionsResponse.results;
        }
        return searchSuggestionsResponse.copy(str, suggestionsResultModel);
    }

    public final String component1() {
        return this.source;
    }

    public final SuggestionsResultModel component2() {
        return this.results;
    }

    public final SearchSuggestionsResponse copy(String source, SuggestionsResultModel results) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(results, "results");
        return new SearchSuggestionsResponse(source, results);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchSuggestionsResponse) {
            SearchSuggestionsResponse searchSuggestionsResponse = (SearchSuggestionsResponse) obj;
            return Intrinsics.areEqual(this.source, searchSuggestionsResponse.source) && Intrinsics.areEqual(this.results, searchSuggestionsResponse.results);
        }
        return false;
    }

    public final SuggestionsResultModel getResults() {
        return this.results;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.results.hashCode() + (this.source.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("SearchSuggestionsResponse(source=");
        m10.append(this.source);
        m10.append(", results=");
        m10.append(this.results);
        m10.append(')');
        return m10.toString();
    }
}
