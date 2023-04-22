package com.app.pornhub.domain.model.channel;

import a1.a;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/domain/model/channel/ChannelVideosContainer;", BuildConfig.FLAVOR, "channel", "Lcom/app/pornhub/domain/model/channel/Channel;", SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "(Lcom/app/pornhub/domain/model/channel/Channel;Ljava/util/List;)V", "getChannel", "()Lcom/app/pornhub/domain/model/channel/Channel;", "getVideos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelVideosContainer {
    private final Channel channel;
    private final List<VideoMetaData> videos;

    public ChannelVideosContainer(Channel channel, List<VideoMetaData> videos) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(videos, "videos");
        this.channel = channel;
        this.videos = videos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelVideosContainer copy$default(ChannelVideosContainer channelVideosContainer, Channel channel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            channel = channelVideosContainer.channel;
        }
        if ((i10 & 2) != 0) {
            list = channelVideosContainer.videos;
        }
        return channelVideosContainer.copy(channel, list);
    }

    public final Channel component1() {
        return this.channel;
    }

    public final List<VideoMetaData> component2() {
        return this.videos;
    }

    public final ChannelVideosContainer copy(Channel channel, List<VideoMetaData> videos) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(videos, "videos");
        return new ChannelVideosContainer(channel, videos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelVideosContainer) {
            ChannelVideosContainer channelVideosContainer = (ChannelVideosContainer) obj;
            return Intrinsics.areEqual(this.channel, channelVideosContainer.channel) && Intrinsics.areEqual(this.videos, channelVideosContainer.videos);
        }
        return false;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final List<VideoMetaData> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return this.videos.hashCode() + (this.channel.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("ChannelVideosContainer(channel=");
        m10.append(this.channel);
        m10.append(", videos=");
        return android.support.v4.media.a.k(m10, this.videos, ')');
    }
}
