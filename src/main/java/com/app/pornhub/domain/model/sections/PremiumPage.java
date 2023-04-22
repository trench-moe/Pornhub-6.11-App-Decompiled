package com.app.pornhub.domain.model.sections;

import a1.a;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.channel.ChannelVideosContainer;
import com.app.pornhub.domain.model.dvd.Dvd;
import com.app.pornhub.domain.model.network.Network;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\u0002\u0010\u0019J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005HÆ\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003JÙ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001d¨\u0006C"}, d2 = {"Lcom/app/pornhub/domain/model/sections/PremiumPage;", BuildConfig.FLAVOR, "popularPremiumVideosTitle", BuildConfig.FLAVOR, "popularPremiumVideos", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "hottestVideosTitle", "hottestVideos", "newPremiumVideosTitle", "newPremiumVideos", "featuredChannelsTitle", "featuredChannels", "Lcom/app/pornhub/domain/model/channel/ChannelVideosContainer;", "popularDvdsTitle", "popularDvds", "Lcom/app/pornhub/domain/model/dvd/Dvd;", "featuredNetworkTitle", "featuredNetwork", "Lcom/app/pornhub/domain/model/network/Network;", "popularChannelsTitle", "popularChannels", "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "trendingChannelsTitle", "trendingChannels", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getFeaturedChannels", "()Ljava/util/List;", "getFeaturedChannelsTitle", "()Ljava/lang/String;", "getFeaturedNetwork", "getFeaturedNetworkTitle", "getHottestVideos", "getHottestVideosTitle", "getNewPremiumVideos", "getNewPremiumVideosTitle", "getPopularChannels", "getPopularChannelsTitle", "getPopularDvds", "getPopularDvdsTitle", "getPopularPremiumVideos", "getPopularPremiumVideosTitle", "getTrendingChannels", "getTrendingChannelsTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PremiumPage {
    private final List<ChannelVideosContainer> featuredChannels;
    private final String featuredChannelsTitle;
    private final List<Network> featuredNetwork;
    private final String featuredNetworkTitle;
    private final List<VideoMetaData> hottestVideos;
    private final String hottestVideosTitle;
    private final List<VideoMetaData> newPremiumVideos;
    private final String newPremiumVideosTitle;
    private final List<ChannelMetaData> popularChannels;
    private final String popularChannelsTitle;
    private final List<Dvd> popularDvds;
    private final String popularDvdsTitle;
    private final List<VideoMetaData> popularPremiumVideos;
    private final String popularPremiumVideosTitle;
    private final List<ChannelMetaData> trendingChannels;
    private final String trendingChannelsTitle;

    public PremiumPage(String popularPremiumVideosTitle, List<VideoMetaData> popularPremiumVideos, String hottestVideosTitle, List<VideoMetaData> hottestVideos, String newPremiumVideosTitle, List<VideoMetaData> newPremiumVideos, String featuredChannelsTitle, List<ChannelVideosContainer> featuredChannels, String popularDvdsTitle, List<Dvd> popularDvds, String featuredNetworkTitle, List<Network> featuredNetwork, String popularChannelsTitle, List<ChannelMetaData> popularChannels, String trendingChannelsTitle, List<ChannelMetaData> trendingChannels) {
        Intrinsics.checkNotNullParameter(popularPremiumVideosTitle, "popularPremiumVideosTitle");
        Intrinsics.checkNotNullParameter(popularPremiumVideos, "popularPremiumVideos");
        Intrinsics.checkNotNullParameter(hottestVideosTitle, "hottestVideosTitle");
        Intrinsics.checkNotNullParameter(hottestVideos, "hottestVideos");
        Intrinsics.checkNotNullParameter(newPremiumVideosTitle, "newPremiumVideosTitle");
        Intrinsics.checkNotNullParameter(newPremiumVideos, "newPremiumVideos");
        Intrinsics.checkNotNullParameter(featuredChannelsTitle, "featuredChannelsTitle");
        Intrinsics.checkNotNullParameter(featuredChannels, "featuredChannels");
        Intrinsics.checkNotNullParameter(popularDvdsTitle, "popularDvdsTitle");
        Intrinsics.checkNotNullParameter(popularDvds, "popularDvds");
        Intrinsics.checkNotNullParameter(featuredNetworkTitle, "featuredNetworkTitle");
        Intrinsics.checkNotNullParameter(featuredNetwork, "featuredNetwork");
        Intrinsics.checkNotNullParameter(popularChannelsTitle, "popularChannelsTitle");
        Intrinsics.checkNotNullParameter(popularChannels, "popularChannels");
        Intrinsics.checkNotNullParameter(trendingChannelsTitle, "trendingChannelsTitle");
        Intrinsics.checkNotNullParameter(trendingChannels, "trendingChannels");
        this.popularPremiumVideosTitle = popularPremiumVideosTitle;
        this.popularPremiumVideos = popularPremiumVideos;
        this.hottestVideosTitle = hottestVideosTitle;
        this.hottestVideos = hottestVideos;
        this.newPremiumVideosTitle = newPremiumVideosTitle;
        this.newPremiumVideos = newPremiumVideos;
        this.featuredChannelsTitle = featuredChannelsTitle;
        this.featuredChannels = featuredChannels;
        this.popularDvdsTitle = popularDvdsTitle;
        this.popularDvds = popularDvds;
        this.featuredNetworkTitle = featuredNetworkTitle;
        this.featuredNetwork = featuredNetwork;
        this.popularChannelsTitle = popularChannelsTitle;
        this.popularChannels = popularChannels;
        this.trendingChannelsTitle = trendingChannelsTitle;
        this.trendingChannels = trendingChannels;
    }

    public final String component1() {
        return this.popularPremiumVideosTitle;
    }

    public final List<Dvd> component10() {
        return this.popularDvds;
    }

    public final String component11() {
        return this.featuredNetworkTitle;
    }

    public final List<Network> component12() {
        return this.featuredNetwork;
    }

    public final String component13() {
        return this.popularChannelsTitle;
    }

    public final List<ChannelMetaData> component14() {
        return this.popularChannels;
    }

    public final String component15() {
        return this.trendingChannelsTitle;
    }

    public final List<ChannelMetaData> component16() {
        return this.trendingChannels;
    }

    public final List<VideoMetaData> component2() {
        return this.popularPremiumVideos;
    }

    public final String component3() {
        return this.hottestVideosTitle;
    }

    public final List<VideoMetaData> component4() {
        return this.hottestVideos;
    }

    public final String component5() {
        return this.newPremiumVideosTitle;
    }

    public final List<VideoMetaData> component6() {
        return this.newPremiumVideos;
    }

    public final String component7() {
        return this.featuredChannelsTitle;
    }

    public final List<ChannelVideosContainer> component8() {
        return this.featuredChannels;
    }

    public final String component9() {
        return this.popularDvdsTitle;
    }

    public final PremiumPage copy(String popularPremiumVideosTitle, List<VideoMetaData> popularPremiumVideos, String hottestVideosTitle, List<VideoMetaData> hottestVideos, String newPremiumVideosTitle, List<VideoMetaData> newPremiumVideos, String featuredChannelsTitle, List<ChannelVideosContainer> featuredChannels, String popularDvdsTitle, List<Dvd> popularDvds, String featuredNetworkTitle, List<Network> featuredNetwork, String popularChannelsTitle, List<ChannelMetaData> popularChannels, String trendingChannelsTitle, List<ChannelMetaData> trendingChannels) {
        Intrinsics.checkNotNullParameter(popularPremiumVideosTitle, "popularPremiumVideosTitle");
        Intrinsics.checkNotNullParameter(popularPremiumVideos, "popularPremiumVideos");
        Intrinsics.checkNotNullParameter(hottestVideosTitle, "hottestVideosTitle");
        Intrinsics.checkNotNullParameter(hottestVideos, "hottestVideos");
        Intrinsics.checkNotNullParameter(newPremiumVideosTitle, "newPremiumVideosTitle");
        Intrinsics.checkNotNullParameter(newPremiumVideos, "newPremiumVideos");
        Intrinsics.checkNotNullParameter(featuredChannelsTitle, "featuredChannelsTitle");
        Intrinsics.checkNotNullParameter(featuredChannels, "featuredChannels");
        Intrinsics.checkNotNullParameter(popularDvdsTitle, "popularDvdsTitle");
        Intrinsics.checkNotNullParameter(popularDvds, "popularDvds");
        Intrinsics.checkNotNullParameter(featuredNetworkTitle, "featuredNetworkTitle");
        Intrinsics.checkNotNullParameter(featuredNetwork, "featuredNetwork");
        Intrinsics.checkNotNullParameter(popularChannelsTitle, "popularChannelsTitle");
        Intrinsics.checkNotNullParameter(popularChannels, "popularChannels");
        Intrinsics.checkNotNullParameter(trendingChannelsTitle, "trendingChannelsTitle");
        Intrinsics.checkNotNullParameter(trendingChannels, "trendingChannels");
        return new PremiumPage(popularPremiumVideosTitle, popularPremiumVideos, hottestVideosTitle, hottestVideos, newPremiumVideosTitle, newPremiumVideos, featuredChannelsTitle, featuredChannels, popularDvdsTitle, popularDvds, featuredNetworkTitle, featuredNetwork, popularChannelsTitle, popularChannels, trendingChannelsTitle, trendingChannels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PremiumPage) {
            PremiumPage premiumPage = (PremiumPage) obj;
            return Intrinsics.areEqual(this.popularPremiumVideosTitle, premiumPage.popularPremiumVideosTitle) && Intrinsics.areEqual(this.popularPremiumVideos, premiumPage.popularPremiumVideos) && Intrinsics.areEqual(this.hottestVideosTitle, premiumPage.hottestVideosTitle) && Intrinsics.areEqual(this.hottestVideos, premiumPage.hottestVideos) && Intrinsics.areEqual(this.newPremiumVideosTitle, premiumPage.newPremiumVideosTitle) && Intrinsics.areEqual(this.newPremiumVideos, premiumPage.newPremiumVideos) && Intrinsics.areEqual(this.featuredChannelsTitle, premiumPage.featuredChannelsTitle) && Intrinsics.areEqual(this.featuredChannels, premiumPage.featuredChannels) && Intrinsics.areEqual(this.popularDvdsTitle, premiumPage.popularDvdsTitle) && Intrinsics.areEqual(this.popularDvds, premiumPage.popularDvds) && Intrinsics.areEqual(this.featuredNetworkTitle, premiumPage.featuredNetworkTitle) && Intrinsics.areEqual(this.featuredNetwork, premiumPage.featuredNetwork) && Intrinsics.areEqual(this.popularChannelsTitle, premiumPage.popularChannelsTitle) && Intrinsics.areEqual(this.popularChannels, premiumPage.popularChannels) && Intrinsics.areEqual(this.trendingChannelsTitle, premiumPage.trendingChannelsTitle) && Intrinsics.areEqual(this.trendingChannels, premiumPage.trendingChannels);
        }
        return false;
    }

    public final List<ChannelVideosContainer> getFeaturedChannels() {
        return this.featuredChannels;
    }

    public final String getFeaturedChannelsTitle() {
        return this.featuredChannelsTitle;
    }

    public final List<Network> getFeaturedNetwork() {
        return this.featuredNetwork;
    }

    public final String getFeaturedNetworkTitle() {
        return this.featuredNetworkTitle;
    }

    public final List<VideoMetaData> getHottestVideos() {
        return this.hottestVideos;
    }

    public final String getHottestVideosTitle() {
        return this.hottestVideosTitle;
    }

    public final List<VideoMetaData> getNewPremiumVideos() {
        return this.newPremiumVideos;
    }

    public final String getNewPremiumVideosTitle() {
        return this.newPremiumVideosTitle;
    }

    public final List<ChannelMetaData> getPopularChannels() {
        return this.popularChannels;
    }

    public final String getPopularChannelsTitle() {
        return this.popularChannelsTitle;
    }

    public final List<Dvd> getPopularDvds() {
        return this.popularDvds;
    }

    public final String getPopularDvdsTitle() {
        return this.popularDvdsTitle;
    }

    public final List<VideoMetaData> getPopularPremiumVideos() {
        return this.popularPremiumVideos;
    }

    public final String getPopularPremiumVideosTitle() {
        return this.popularPremiumVideosTitle;
    }

    public final List<ChannelMetaData> getTrendingChannels() {
        return this.trendingChannels;
    }

    public final String getTrendingChannelsTitle() {
        return this.trendingChannelsTitle;
    }

    public int hashCode() {
        return this.trendingChannels.hashCode() + a.b(this.trendingChannelsTitle, android.support.v4.media.a.b(this.popularChannels, a.b(this.popularChannelsTitle, android.support.v4.media.a.b(this.featuredNetwork, a.b(this.featuredNetworkTitle, android.support.v4.media.a.b(this.popularDvds, a.b(this.popularDvdsTitle, android.support.v4.media.a.b(this.featuredChannels, a.b(this.featuredChannelsTitle, android.support.v4.media.a.b(this.newPremiumVideos, a.b(this.newPremiumVideosTitle, android.support.v4.media.a.b(this.hottestVideos, a.b(this.hottestVideosTitle, android.support.v4.media.a.b(this.popularPremiumVideos, this.popularPremiumVideosTitle.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("PremiumPage(popularPremiumVideosTitle=");
        m10.append(this.popularPremiumVideosTitle);
        m10.append(", popularPremiumVideos=");
        m10.append(this.popularPremiumVideos);
        m10.append(", hottestVideosTitle=");
        m10.append(this.hottestVideosTitle);
        m10.append(", hottestVideos=");
        m10.append(this.hottestVideos);
        m10.append(", newPremiumVideosTitle=");
        m10.append(this.newPremiumVideosTitle);
        m10.append(", newPremiumVideos=");
        m10.append(this.newPremiumVideos);
        m10.append(", featuredChannelsTitle=");
        m10.append(this.featuredChannelsTitle);
        m10.append(", featuredChannels=");
        m10.append(this.featuredChannels);
        m10.append(", popularDvdsTitle=");
        m10.append(this.popularDvdsTitle);
        m10.append(", popularDvds=");
        m10.append(this.popularDvds);
        m10.append(", featuredNetworkTitle=");
        m10.append(this.featuredNetworkTitle);
        m10.append(", featuredNetwork=");
        m10.append(this.featuredNetwork);
        m10.append(", popularChannelsTitle=");
        m10.append(this.popularChannelsTitle);
        m10.append(", popularChannels=");
        m10.append(this.popularChannels);
        m10.append(", trendingChannelsTitle=");
        m10.append(this.trendingChannelsTitle);
        m10.append(", trendingChannels=");
        return android.support.v4.media.a.k(m10, this.trendingChannels, ')');
    }
}
