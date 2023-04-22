package com.app.pornhub.domain.model.network;

import android.support.v4.media.a;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/domain/model/network/Network;", BuildConfig.FLAVOR, "network", "Lcom/app/pornhub/domain/model/network/NetworkMetaData;", "channels", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", SearchSuggestionsConfig.sourceVideos, "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "(Lcom/app/pornhub/domain/model/network/NetworkMetaData;Ljava/util/List;Ljava/util/List;)V", "getChannels", "()Ljava/util/List;", "getNetwork", "()Lcom/app/pornhub/domain/model/network/NetworkMetaData;", "getVideos", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Network {
    private final List<ChannelMetaData> channels;
    private final NetworkMetaData network;
    private final List<VideoMetaData> videos;

    public Network(NetworkMetaData network, List<ChannelMetaData> channels, List<VideoMetaData> videos) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(videos, "videos");
        this.network = network;
        this.channels = channels;
        this.videos = videos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Network copy$default(Network network, NetworkMetaData networkMetaData, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkMetaData = network.network;
        }
        if ((i10 & 2) != 0) {
            list = network.channels;
        }
        if ((i10 & 4) != 0) {
            list2 = network.videos;
        }
        return network.copy(networkMetaData, list, list2);
    }

    public final NetworkMetaData component1() {
        return this.network;
    }

    public final List<ChannelMetaData> component2() {
        return this.channels;
    }

    public final List<VideoMetaData> component3() {
        return this.videos;
    }

    public final Network copy(NetworkMetaData network, List<ChannelMetaData> channels, List<VideoMetaData> videos) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(videos, "videos");
        return new Network(network, channels, videos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Network) {
            Network network = (Network) obj;
            return Intrinsics.areEqual(this.network, network.network) && Intrinsics.areEqual(this.channels, network.channels) && Intrinsics.areEqual(this.videos, network.videos);
        }
        return false;
    }

    public final List<ChannelMetaData> getChannels() {
        return this.channels;
    }

    public final NetworkMetaData getNetwork() {
        return this.network;
    }

    public final List<VideoMetaData> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return this.videos.hashCode() + a.b(this.channels, this.network.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Network(network=");
        m10.append(this.network);
        m10.append(", channels=");
        m10.append(this.channels);
        m10.append(", videos=");
        return a.k(m10, this.videos, ')');
    }
}
