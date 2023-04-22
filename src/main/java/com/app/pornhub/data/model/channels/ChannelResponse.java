package com.app.pornhub.data.model.channels;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Map;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003J`\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006*"}, d2 = {"Lcom/app/pornhub/data/model/channels/ChannelResponse;", BuildConfig.FLAVOR, SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "count", BuildConfig.FLAVOR, "channel", "Lcom/app/pornhub/data/model/channels/ChannelModel;", "orders", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "emailVerificationRequired", BuildConfig.FLAVOR, "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;ILcom/app/pornhub/data/model/channels/ChannelModel;Ljava/util/Map;Ljava/lang/Boolean;Lcom/app/pornhub/data/model/ErrorModel;)V", "getChannel", "()Lcom/app/pornhub/data/model/channels/ChannelModel;", "getCount", "()I", "getEmailVerificationRequired", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getOrders", "()Ljava/util/Map;", "getVideos", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;ILcom/app/pornhub/data/model/channels/ChannelModel;Ljava/util/Map;Ljava/lang/Boolean;Lcom/app/pornhub/data/model/ErrorModel;)Lcom/app/pornhub/data/model/channels/ChannelResponse;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelResponse {
    private final ChannelModel channel;
    private final int count;
    private final Boolean emailVerificationRequired;
    private final ErrorModel error;
    private final Map<String, String> orders;
    private final List<VideoModel> videos;

    public ChannelResponse(List<VideoModel> videos, int i10, ChannelModel channel, Map<String, String> orders, Boolean bool, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.videos = videos;
        this.count = i10;
        this.channel = channel;
        this.orders = orders;
        this.emailVerificationRequired = bool;
        this.error = errorModel;
    }

    public static /* synthetic */ ChannelResponse copy$default(ChannelResponse channelResponse, List list, int i10, ChannelModel channelModel, Map map, Boolean bool, ErrorModel errorModel, int i11, Object obj) {
        List<VideoModel> list2 = list;
        if ((i11 & 1) != 0) {
            list2 = channelResponse.videos;
        }
        if ((i11 & 2) != 0) {
            i10 = channelResponse.count;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            channelModel = channelResponse.channel;
        }
        ChannelModel channelModel2 = channelModel;
        Map<String, String> map2 = map;
        if ((i11 & 8) != 0) {
            map2 = channelResponse.orders;
        }
        Map map3 = map2;
        if ((i11 & 16) != 0) {
            bool = channelResponse.emailVerificationRequired;
        }
        Boolean bool2 = bool;
        if ((i11 & 32) != 0) {
            errorModel = channelResponse.error;
        }
        return channelResponse.copy(list2, i12, channelModel2, map3, bool2, errorModel);
    }

    public final List<VideoModel> component1() {
        return this.videos;
    }

    public final int component2() {
        return this.count;
    }

    public final ChannelModel component3() {
        return this.channel;
    }

    public final Map<String, String> component4() {
        return this.orders;
    }

    public final Boolean component5() {
        return this.emailVerificationRequired;
    }

    public final ErrorModel component6() {
        return this.error;
    }

    public final ChannelResponse copy(List<VideoModel> videos, int i10, ChannelModel channel, Map<String, String> orders, Boolean bool, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new ChannelResponse(videos, i10, channel, orders, bool, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelResponse) {
            ChannelResponse channelResponse = (ChannelResponse) obj;
            return Intrinsics.areEqual(this.videos, channelResponse.videos) && this.count == channelResponse.count && Intrinsics.areEqual(this.channel, channelResponse.channel) && Intrinsics.areEqual(this.orders, channelResponse.orders) && Intrinsics.areEqual(this.emailVerificationRequired, channelResponse.emailVerificationRequired) && Intrinsics.areEqual(this.error, channelResponse.error);
        }
        return false;
    }

    public final ChannelModel getChannel() {
        return this.channel;
    }

    public final int getCount() {
        return this.count;
    }

    public final Boolean getEmailVerificationRequired() {
        return this.emailVerificationRequired;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final Map<String, String> getOrders() {
        return this.orders;
    }

    public final List<VideoModel> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int hashCode = (this.orders.hashCode() + ((this.channel.hashCode() + (((this.videos.hashCode() * 31) + this.count) * 31)) * 31)) * 31;
        Boolean bool = this.emailVerificationRequired;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        ErrorModel errorModel = this.error;
        return hashCode2 + (errorModel != null ? errorModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a.m("ChannelResponse(videos=");
        m10.append(this.videos);
        m10.append(", count=");
        m10.append(this.count);
        m10.append(", channel=");
        m10.append(this.channel);
        m10.append(", orders=");
        m10.append(this.orders);
        m10.append(", emailVerificationRequired=");
        m10.append(this.emailVerificationRequired);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
