package com.app.pornhub.domain.model.search;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/domain/model/search/SearchSuggestions;", BuildConfig.FLAVOR, "source", BuildConfig.FLAVOR, "suggestions", BuildConfig.FLAVOR, "pornstarSuggestions", "Lcom/app/pornhub/domain/model/search/PornstarSuggestion;", "channelSuggestions", "Lcom/app/pornhub/domain/model/search/ChannelSuggestion;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getChannelSuggestions", "()Ljava/util/List;", "getPornstarSuggestions", "getSource", "()Ljava/lang/String;", "getSuggestions", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchSuggestions {
    private final List<ChannelSuggestion> channelSuggestions;
    private final List<PornstarSuggestion> pornstarSuggestions;
    private final String source;
    private final List<String> suggestions;

    public SearchSuggestions(String source, List<String> suggestions, List<PornstarSuggestion> pornstarSuggestions, List<ChannelSuggestion> channelSuggestions) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(pornstarSuggestions, "pornstarSuggestions");
        Intrinsics.checkNotNullParameter(channelSuggestions, "channelSuggestions");
        this.source = source;
        this.suggestions = suggestions;
        this.pornstarSuggestions = pornstarSuggestions;
        this.channelSuggestions = channelSuggestions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchSuggestions copy$default(SearchSuggestions searchSuggestions, String str, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = searchSuggestions.source;
        }
        if ((i10 & 2) != 0) {
            list = searchSuggestions.suggestions;
        }
        if ((i10 & 4) != 0) {
            list2 = searchSuggestions.pornstarSuggestions;
        }
        if ((i10 & 8) != 0) {
            list3 = searchSuggestions.channelSuggestions;
        }
        return searchSuggestions.copy(str, list, list2, list3);
    }

    public final String component1() {
        return this.source;
    }

    public final List<String> component2() {
        return this.suggestions;
    }

    public final List<PornstarSuggestion> component3() {
        return this.pornstarSuggestions;
    }

    public final List<ChannelSuggestion> component4() {
        return this.channelSuggestions;
    }

    public final SearchSuggestions copy(String source, List<String> suggestions, List<PornstarSuggestion> pornstarSuggestions, List<ChannelSuggestion> channelSuggestions) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        Intrinsics.checkNotNullParameter(pornstarSuggestions, "pornstarSuggestions");
        Intrinsics.checkNotNullParameter(channelSuggestions, "channelSuggestions");
        return new SearchSuggestions(source, suggestions, pornstarSuggestions, channelSuggestions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SearchSuggestions) {
            SearchSuggestions searchSuggestions = (SearchSuggestions) obj;
            if (Intrinsics.areEqual(this.source, searchSuggestions.source) && Intrinsics.areEqual(this.suggestions, searchSuggestions.suggestions) && Intrinsics.areEqual(this.pornstarSuggestions, searchSuggestions.pornstarSuggestions) && Intrinsics.areEqual(this.channelSuggestions, searchSuggestions.channelSuggestions)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<ChannelSuggestion> getChannelSuggestions() {
        return this.channelSuggestions;
    }

    public final List<PornstarSuggestion> getPornstarSuggestions() {
        return this.pornstarSuggestions;
    }

    public final String getSource() {
        return this.source;
    }

    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        return this.channelSuggestions.hashCode() + a.b(this.pornstarSuggestions, a.b(this.suggestions, this.source.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("SearchSuggestions(source=");
        m10.append(this.source);
        m10.append(", suggestions=");
        m10.append(this.suggestions);
        m10.append(", pornstarSuggestions=");
        m10.append(this.pornstarSuggestions);
        m10.append(", channelSuggestions=");
        return a.k(m10, this.channelSuggestions, ')');
    }
}
