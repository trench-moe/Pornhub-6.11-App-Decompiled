package com.app.pornhub.data.model.network;

import android.support.v4.media.a;
import com.app.pornhub.data.model.channels.ChannelModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/data/model/network/NetworkInfoModel;", BuildConfig.FLAVOR, "network", "Lcom/app/pornhub/data/model/network/NetworkModel;", "channels", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/channels/ChannelModel;", SearchSuggestionsConfig.sourceVideos, "Lcom/app/pornhub/data/model/videos/VideoModel;", "(Lcom/app/pornhub/data/model/network/NetworkModel;Ljava/util/List;Ljava/util/List;)V", "getChannels", "()Ljava/util/List;", "getNetwork", "()Lcom/app/pornhub/data/model/network/NetworkModel;", "getVideos", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkInfoModel {
    private final List<ChannelModel> channels;
    private final NetworkModel network;
    private final List<VideoModel> videos;

    public NetworkInfoModel(NetworkModel network, List<ChannelModel> channels, List<VideoModel> videos) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(videos, "videos");
        this.network = network;
        this.channels = channels;
        this.videos = videos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInfoModel copy$default(NetworkInfoModel networkInfoModel, NetworkModel networkModel, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            networkModel = networkInfoModel.network;
        }
        if ((i10 & 2) != 0) {
            list = networkInfoModel.channels;
        }
        if ((i10 & 4) != 0) {
            list2 = networkInfoModel.videos;
        }
        return networkInfoModel.copy(networkModel, list, list2);
    }

    public final NetworkModel component1() {
        return this.network;
    }

    public final List<ChannelModel> component2() {
        return this.channels;
    }

    public final List<VideoModel> component3() {
        return this.videos;
    }

    public final NetworkInfoModel copy(NetworkModel network, List<ChannelModel> channels, List<VideoModel> videos) {
        Intrinsics.checkNotNullParameter(network, "network");
        Intrinsics.checkNotNullParameter(channels, "channels");
        Intrinsics.checkNotNullParameter(videos, "videos");
        return new NetworkInfoModel(network, channels, videos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetworkInfoModel) {
            NetworkInfoModel networkInfoModel = (NetworkInfoModel) obj;
            if (Intrinsics.areEqual(this.network, networkInfoModel.network) && Intrinsics.areEqual(this.channels, networkInfoModel.channels) && Intrinsics.areEqual(this.videos, networkInfoModel.videos)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<ChannelModel> getChannels() {
        return this.channels;
    }

    public final NetworkModel getNetwork() {
        return this.network;
    }

    public final List<VideoModel> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return this.videos.hashCode() + a.b(this.channels, this.network.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("NetworkInfoModel(network=");
        m10.append(this.network);
        m10.append(", channels=");
        m10.append(this.channels);
        m10.append(", videos=");
        return a.k(m10, this.videos, ')');
    }
}
