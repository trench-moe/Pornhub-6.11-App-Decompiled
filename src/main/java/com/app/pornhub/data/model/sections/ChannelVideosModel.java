package com.app.pornhub.data.model.sections;

import a1.a;
import com.app.pornhub.data.model.channels.ChannelModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/sections/ChannelVideosModel;", BuildConfig.FLAVOR, "channel", "Lcom/app/pornhub/data/model/channels/ChannelModel;", SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "(Lcom/app/pornhub/data/model/channels/ChannelModel;Ljava/util/List;)V", "getChannel", "()Lcom/app/pornhub/data/model/channels/ChannelModel;", "getVideos", "()Ljava/util/List;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelVideosModel {
    private final ChannelModel channel;
    private final List<VideoModel> videos;

    public ChannelVideosModel(ChannelModel channel, List<VideoModel> videos) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(videos, "videos");
        this.channel = channel;
        this.videos = videos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelVideosModel copy$default(ChannelVideosModel channelVideosModel, ChannelModel channelModel, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            channelModel = channelVideosModel.channel;
        }
        if ((i10 & 2) != 0) {
            list = channelVideosModel.videos;
        }
        return channelVideosModel.copy(channelModel, list);
    }

    public final ChannelModel component1() {
        return this.channel;
    }

    public final List<VideoModel> component2() {
        return this.videos;
    }

    public final ChannelVideosModel copy(ChannelModel channel, List<VideoModel> videos) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(videos, "videos");
        return new ChannelVideosModel(channel, videos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelVideosModel) {
            ChannelVideosModel channelVideosModel = (ChannelVideosModel) obj;
            return Intrinsics.areEqual(this.channel, channelVideosModel.channel) && Intrinsics.areEqual(this.videos, channelVideosModel.videos);
        }
        return false;
    }

    public final ChannelModel getChannel() {
        return this.channel;
    }

    public final List<VideoModel> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return this.videos.hashCode() + (this.channel.hashCode() * 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("ChannelVideosModel(channel=");
        m10.append(this.channel);
        m10.append(", videos=");
        return android.support.v4.media.a.k(m10, this.videos, ')');
    }
}
