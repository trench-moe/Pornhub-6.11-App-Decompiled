package com.app.pornhub.domain.model.channel;

import a1.a;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/domain/model/channel/ChannelContainer;", BuildConfig.FLAVOR, SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "channel", "Lcom/app/pornhub/domain/model/channel/Channel;", "orders", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "(Ljava/util/List;Lcom/app/pornhub/domain/model/channel/Channel;Ljava/util/Map;)V", "getChannel", "()Lcom/app/pornhub/domain/model/channel/Channel;", "getOrders", "()Ljava/util/Map;", "getVideos", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelContainer {
    private final Channel channel;
    private final Map<String, String> orders;
    private final List<VideoMetaData> videos;

    public ChannelContainer(List<VideoMetaData> videos, Channel channel, Map<String, String> orders) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.videos = videos;
        this.channel = channel;
        this.orders = orders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelContainer copy$default(ChannelContainer channelContainer, List list, Channel channel, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = channelContainer.videos;
        }
        if ((i10 & 2) != 0) {
            channel = channelContainer.channel;
        }
        if ((i10 & 4) != 0) {
            map = channelContainer.orders;
        }
        return channelContainer.copy(list, channel, map);
    }

    public final List<VideoMetaData> component1() {
        return this.videos;
    }

    public final Channel component2() {
        return this.channel;
    }

    public final Map<String, String> component3() {
        return this.orders;
    }

    public final ChannelContainer copy(List<VideoMetaData> videos, Channel channel, Map<String, String> orders) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new ChannelContainer(videos, channel, orders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelContainer) {
            ChannelContainer channelContainer = (ChannelContainer) obj;
            return Intrinsics.areEqual(this.videos, channelContainer.videos) && Intrinsics.areEqual(this.channel, channelContainer.channel) && Intrinsics.areEqual(this.orders, channelContainer.orders);
        }
        return false;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Map<String, String> getOrders() {
        return this.orders;
    }

    public final List<VideoMetaData> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int hashCode = this.channel.hashCode();
        return this.orders.hashCode() + ((hashCode + (this.videos.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("ChannelContainer(videos=");
        m10.append(this.videos);
        m10.append(", channel=");
        m10.append(this.channel);
        m10.append(", orders=");
        m10.append(this.orders);
        m10.append(')');
        return m10.toString();
    }
}
