package com.app.pornhub.data.model.pornstar;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Map;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003JU\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerResponse;", BuildConfig.FLAVOR, ExploreModel.PORNSTAR, "Lcom/app/pornhub/data/model/pornstar/PerformerModel;", SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "count", BuildConfig.FLAVOR, "orders", BuildConfig.FLAVOR, "premium", "(Lcom/app/pornhub/data/model/pornstar/PerformerModel;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getCount", "()Ljava/lang/String;", "getOrders", "()Ljava/util/Map;", "getPornstar", "()Lcom/app/pornhub/data/model/pornstar/PerformerModel;", "getPremium", "()Ljava/util/List;", "getVideos", "component1", "component2", "component3", "component4", "component5", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PerformerResponse {
    private final String count;
    private final Map<String, String> orders;
    private final PerformerModel pornstar;
    private final List<String> premium;
    private final List<VideoModel> videos;

    public PerformerResponse(PerformerModel pornstar, List<VideoModel> videos, String count, Map<String, String> orders, List<String> list) {
        Intrinsics.checkNotNullParameter(pornstar, "pornstar");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(count, "count");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.pornstar = pornstar;
        this.videos = videos;
        this.count = count;
        this.orders = orders;
        this.premium = list;
    }

    public static /* synthetic */ PerformerResponse copy$default(PerformerResponse performerResponse, PerformerModel performerModel, List list, String str, Map map, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            performerModel = performerResponse.pornstar;
        }
        List<VideoModel> list3 = list;
        if ((i10 & 2) != 0) {
            list3 = performerResponse.videos;
        }
        List list4 = list3;
        if ((i10 & 4) != 0) {
            str = performerResponse.count;
        }
        String str2 = str;
        Map<String, String> map2 = map;
        if ((i10 & 8) != 0) {
            map2 = performerResponse.orders;
        }
        Map map3 = map2;
        List<String> list5 = list2;
        if ((i10 & 16) != 0) {
            list5 = performerResponse.premium;
        }
        return performerResponse.copy(performerModel, list4, str2, map3, list5);
    }

    public final PerformerModel component1() {
        return this.pornstar;
    }

    public final List<VideoModel> component2() {
        return this.videos;
    }

    public final String component3() {
        return this.count;
    }

    public final Map<String, String> component4() {
        return this.orders;
    }

    public final List<String> component5() {
        return this.premium;
    }

    public final PerformerResponse copy(PerformerModel pornstar, List<VideoModel> videos, String count, Map<String, String> orders, List<String> list) {
        Intrinsics.checkNotNullParameter(pornstar, "pornstar");
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(count, "count");
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new PerformerResponse(pornstar, videos, count, orders, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PerformerResponse) {
            PerformerResponse performerResponse = (PerformerResponse) obj;
            if (Intrinsics.areEqual(this.pornstar, performerResponse.pornstar) && Intrinsics.areEqual(this.videos, performerResponse.videos) && Intrinsics.areEqual(this.count, performerResponse.count) && Intrinsics.areEqual(this.orders, performerResponse.orders) && Intrinsics.areEqual(this.premium, performerResponse.premium)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getCount() {
        return this.count;
    }

    public final Map<String, String> getOrders() {
        return this.orders;
    }

    public final PerformerModel getPornstar() {
        return this.pornstar;
    }

    public final List<String> getPremium() {
        return this.premium;
    }

    public final List<VideoModel> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int hashCode = (this.orders.hashCode() + a.b(this.count, android.support.v4.media.a.b(this.videos, this.pornstar.hashCode() * 31, 31), 31)) * 31;
        List<String> list = this.premium;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("PerformerResponse(pornstar=");
        m10.append(this.pornstar);
        m10.append(", videos=");
        m10.append(this.videos);
        m10.append(", count=");
        m10.append(this.count);
        m10.append(", orders=");
        m10.append(this.orders);
        m10.append(", premium=");
        return android.support.v4.media.a.k(m10, this.premium, ')');
    }
}
