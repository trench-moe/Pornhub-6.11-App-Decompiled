package com.app.pornhub.data.model.search;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0003J\u0087\u0001\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00032\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006#"}, d2 = {"Lcom/app/pornhub/data/model/search/SuggestionsResultModel;", BuildConfig.FLAVOR, SearchSuggestionsConfig.sourcePornstars, BuildConfig.FLAVOR, BuildConfig.FLAVOR, SearchSuggestionsConfig.sourceVideos, SearchSuggestionsConfig.sourceGifs, SearchSuggestionsConfig.sourcePhotos, SearchSuggestionsConfig.sourceMembers, "pornstarSuggestions", "Lcom/app/pornhub/data/model/search/SuggestionItemModel;", "channelSuggestions", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getChannelSuggestions", "()Ljava/util/List;", "getGifs", "getMembers", "getPhotos", "getPornstarSuggestions", "getPornstars", "getVideos", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuggestionsResultModel {
    private final List<SuggestionItemModel> channelSuggestions;
    private final List<String> gifs;
    private final List<String> members;
    private final List<String> photos;
    private final List<SuggestionItemModel> pornstarSuggestions;
    private final List<String> pornstars;
    private final List<String> videos;

    public SuggestionsResultModel(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, @f(name = "pornstar_suggestions") List<SuggestionItemModel> list6, @f(name = "channel_suggestions") List<SuggestionItemModel> list7) {
        this.pornstars = list;
        this.videos = list2;
        this.gifs = list3;
        this.photos = list4;
        this.members = list5;
        this.pornstarSuggestions = list6;
        this.channelSuggestions = list7;
    }

    public static /* synthetic */ SuggestionsResultModel copy$default(SuggestionsResultModel suggestionsResultModel, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i10, Object obj) {
        List<String> list8 = list;
        if ((i10 & 1) != 0) {
            list8 = suggestionsResultModel.pornstars;
        }
        List<String> list9 = list2;
        if ((i10 & 2) != 0) {
            list9 = suggestionsResultModel.videos;
        }
        List list10 = list9;
        List<String> list11 = list3;
        if ((i10 & 4) != 0) {
            list11 = suggestionsResultModel.gifs;
        }
        List list12 = list11;
        List<String> list13 = list4;
        if ((i10 & 8) != 0) {
            list13 = suggestionsResultModel.photos;
        }
        List list14 = list13;
        List<String> list15 = list5;
        if ((i10 & 16) != 0) {
            list15 = suggestionsResultModel.members;
        }
        List list16 = list15;
        List<SuggestionItemModel> list17 = list6;
        if ((i10 & 32) != 0) {
            list17 = suggestionsResultModel.pornstarSuggestions;
        }
        List list18 = list17;
        List<SuggestionItemModel> list19 = list7;
        if ((i10 & 64) != 0) {
            list19 = suggestionsResultModel.channelSuggestions;
        }
        return suggestionsResultModel.copy(list8, list10, list12, list14, list16, list18, list19);
    }

    public final List<String> component1() {
        return this.pornstars;
    }

    public final List<String> component2() {
        return this.videos;
    }

    public final List<String> component3() {
        return this.gifs;
    }

    public final List<String> component4() {
        return this.photos;
    }

    public final List<String> component5() {
        return this.members;
    }

    public final List<SuggestionItemModel> component6() {
        return this.pornstarSuggestions;
    }

    public final List<SuggestionItemModel> component7() {
        return this.channelSuggestions;
    }

    public final SuggestionsResultModel copy(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, @f(name = "pornstar_suggestions") List<SuggestionItemModel> list6, @f(name = "channel_suggestions") List<SuggestionItemModel> list7) {
        return new SuggestionsResultModel(list, list2, list3, list4, list5, list6, list7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuggestionsResultModel) {
            SuggestionsResultModel suggestionsResultModel = (SuggestionsResultModel) obj;
            if (Intrinsics.areEqual(this.pornstars, suggestionsResultModel.pornstars) && Intrinsics.areEqual(this.videos, suggestionsResultModel.videos) && Intrinsics.areEqual(this.gifs, suggestionsResultModel.gifs) && Intrinsics.areEqual(this.photos, suggestionsResultModel.photos) && Intrinsics.areEqual(this.members, suggestionsResultModel.members) && Intrinsics.areEqual(this.pornstarSuggestions, suggestionsResultModel.pornstarSuggestions) && Intrinsics.areEqual(this.channelSuggestions, suggestionsResultModel.channelSuggestions)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<SuggestionItemModel> getChannelSuggestions() {
        return this.channelSuggestions;
    }

    public final List<String> getGifs() {
        return this.gifs;
    }

    public final List<String> getMembers() {
        return this.members;
    }

    public final List<String> getPhotos() {
        return this.photos;
    }

    public final List<SuggestionItemModel> getPornstarSuggestions() {
        return this.pornstarSuggestions;
    }

    public final List<String> getPornstars() {
        return this.pornstars;
    }

    public final List<String> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        List<String> list = this.pornstars;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.videos;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.gifs;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.photos;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.members;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<SuggestionItemModel> list6 = this.pornstarSuggestions;
        int hashCode6 = (hashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<SuggestionItemModel> list7 = this.channelSuggestions;
        if (list7 != null) {
            i10 = list7.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("SuggestionsResultModel(pornstars=");
        m10.append(this.pornstars);
        m10.append(", videos=");
        m10.append(this.videos);
        m10.append(", gifs=");
        m10.append(this.gifs);
        m10.append(", photos=");
        m10.append(this.photos);
        m10.append(", members=");
        m10.append(this.members);
        m10.append(", pornstarSuggestions=");
        m10.append(this.pornstarSuggestions);
        m10.append(", channelSuggestions=");
        return android.support.v4.media.a.k(m10, this.channelSuggestions, ')');
    }
}
