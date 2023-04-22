package com.app.pornhub.domain.model.sections;

import a1.a;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.channel.ChannelVideosContainer;
import com.app.pornhub.domain.model.dvd.Dvd;
import com.app.pornhub.domain.model.network.Network;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003¢\u0006\u0002\u0010 J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u009d\u0002\u0010M\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00062\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00062\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00062\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00062\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00062\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003HÆ\u0001J\u0013\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Q\u001a\u00020RHÖ\u0001J\t\u0010S\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\"R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%¨\u0006T"}, d2 = {"Lcom/app/pornhub/domain/model/sections/HomePage;", BuildConfig.FLAVOR, "carouselBanners", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/sections/CarouselBanner;", "hottestVideosTitle", BuildConfig.FLAVOR, "hottestVideos", "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "popularPremiumVideosTitle", "popularPremiumVideos", "recommendedVideosTitle", "recommendedVideos", "recentVideosTitle", "recentVideos", "popularDvdsTitle", "popularDvds", "Lcom/app/pornhub/domain/model/dvd/Dvd;", "featuredChannelsTitle", "featuredChannels", "Lcom/app/pornhub/domain/model/channel/ChannelVideosContainer;", "popularPornstarsTitle", "popularPerformers", "Lcom/app/pornhub/domain/model/performer/PerformerMetaData;", "featuredNetworkTitle", "featuredNetwork", "Lcom/app/pornhub/domain/model/network/Network;", "popularChannelsTitle", "popularChannels", "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "trendingChannelsTitle", "trendingChannels", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getCarouselBanners", "()Ljava/util/List;", "getFeaturedChannels", "getFeaturedChannelsTitle", "()Ljava/lang/String;", "getFeaturedNetwork", "getFeaturedNetworkTitle", "getHottestVideos", "getHottestVideosTitle", "getPopularChannels", "getPopularChannelsTitle", "getPopularDvds", "getPopularDvdsTitle", "getPopularPerformers", "getPopularPornstarsTitle", "getPopularPremiumVideos", "getPopularPremiumVideosTitle", "getRecentVideos", "getRecentVideosTitle", "getRecommendedVideos", "getRecommendedVideosTitle", "getTrendingChannels", "getTrendingChannelsTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HomePage {
    private final List<CarouselBanner> carouselBanners;
    private final List<ChannelVideosContainer> featuredChannels;
    private final String featuredChannelsTitle;
    private final List<Network> featuredNetwork;
    private final String featuredNetworkTitle;
    private final List<VideoMetaData> hottestVideos;
    private final String hottestVideosTitle;
    private final List<ChannelMetaData> popularChannels;
    private final String popularChannelsTitle;
    private final List<Dvd> popularDvds;
    private final String popularDvdsTitle;
    private final List<PerformerMetaData> popularPerformers;
    private final String popularPornstarsTitle;
    private final List<VideoMetaData> popularPremiumVideos;
    private final String popularPremiumVideosTitle;
    private final List<VideoMetaData> recentVideos;
    private final String recentVideosTitle;
    private final List<VideoMetaData> recommendedVideos;
    private final String recommendedVideosTitle;
    private final List<ChannelMetaData> trendingChannels;
    private final String trendingChannelsTitle;

    public HomePage(List<CarouselBanner> carouselBanners, String hottestVideosTitle, List<VideoMetaData> hottestVideos, String popularPremiumVideosTitle, List<VideoMetaData> popularPremiumVideos, String recommendedVideosTitle, List<VideoMetaData> recommendedVideos, String recentVideosTitle, List<VideoMetaData> recentVideos, String popularDvdsTitle, List<Dvd> popularDvds, String featuredChannelsTitle, List<ChannelVideosContainer> featuredChannels, String popularPornstarsTitle, List<PerformerMetaData> popularPerformers, String featuredNetworkTitle, List<Network> featuredNetwork, String popularChannelsTitle, List<ChannelMetaData> popularChannels, String trendingChannelsTitle, List<ChannelMetaData> trendingChannels) {
        Intrinsics.checkNotNullParameter(carouselBanners, "carouselBanners");
        Intrinsics.checkNotNullParameter(hottestVideosTitle, "hottestVideosTitle");
        Intrinsics.checkNotNullParameter(hottestVideos, "hottestVideos");
        Intrinsics.checkNotNullParameter(popularPremiumVideosTitle, "popularPremiumVideosTitle");
        Intrinsics.checkNotNullParameter(popularPremiumVideos, "popularPremiumVideos");
        Intrinsics.checkNotNullParameter(recommendedVideosTitle, "recommendedVideosTitle");
        Intrinsics.checkNotNullParameter(recommendedVideos, "recommendedVideos");
        Intrinsics.checkNotNullParameter(recentVideosTitle, "recentVideosTitle");
        Intrinsics.checkNotNullParameter(recentVideos, "recentVideos");
        Intrinsics.checkNotNullParameter(popularDvdsTitle, "popularDvdsTitle");
        Intrinsics.checkNotNullParameter(popularDvds, "popularDvds");
        Intrinsics.checkNotNullParameter(featuredChannelsTitle, "featuredChannelsTitle");
        Intrinsics.checkNotNullParameter(featuredChannels, "featuredChannels");
        Intrinsics.checkNotNullParameter(popularPornstarsTitle, "popularPornstarsTitle");
        Intrinsics.checkNotNullParameter(popularPerformers, "popularPerformers");
        Intrinsics.checkNotNullParameter(featuredNetworkTitle, "featuredNetworkTitle");
        Intrinsics.checkNotNullParameter(featuredNetwork, "featuredNetwork");
        Intrinsics.checkNotNullParameter(popularChannelsTitle, "popularChannelsTitle");
        Intrinsics.checkNotNullParameter(popularChannels, "popularChannels");
        Intrinsics.checkNotNullParameter(trendingChannelsTitle, "trendingChannelsTitle");
        Intrinsics.checkNotNullParameter(trendingChannels, "trendingChannels");
        this.carouselBanners = carouselBanners;
        this.hottestVideosTitle = hottestVideosTitle;
        this.hottestVideos = hottestVideos;
        this.popularPremiumVideosTitle = popularPremiumVideosTitle;
        this.popularPremiumVideos = popularPremiumVideos;
        this.recommendedVideosTitle = recommendedVideosTitle;
        this.recommendedVideos = recommendedVideos;
        this.recentVideosTitle = recentVideosTitle;
        this.recentVideos = recentVideos;
        this.popularDvdsTitle = popularDvdsTitle;
        this.popularDvds = popularDvds;
        this.featuredChannelsTitle = featuredChannelsTitle;
        this.featuredChannels = featuredChannels;
        this.popularPornstarsTitle = popularPornstarsTitle;
        this.popularPerformers = popularPerformers;
        this.featuredNetworkTitle = featuredNetworkTitle;
        this.featuredNetwork = featuredNetwork;
        this.popularChannelsTitle = popularChannelsTitle;
        this.popularChannels = popularChannels;
        this.trendingChannelsTitle = trendingChannelsTitle;
        this.trendingChannels = trendingChannels;
    }

    public final List<CarouselBanner> component1() {
        return this.carouselBanners;
    }

    public final String component10() {
        return this.popularDvdsTitle;
    }

    public final List<Dvd> component11() {
        return this.popularDvds;
    }

    public final String component12() {
        return this.featuredChannelsTitle;
    }

    public final List<ChannelVideosContainer> component13() {
        return this.featuredChannels;
    }

    public final String component14() {
        return this.popularPornstarsTitle;
    }

    public final List<PerformerMetaData> component15() {
        return this.popularPerformers;
    }

    public final String component16() {
        return this.featuredNetworkTitle;
    }

    public final List<Network> component17() {
        return this.featuredNetwork;
    }

    public final String component18() {
        return this.popularChannelsTitle;
    }

    public final List<ChannelMetaData> component19() {
        return this.popularChannels;
    }

    public final String component2() {
        return this.hottestVideosTitle;
    }

    public final String component20() {
        return this.trendingChannelsTitle;
    }

    public final List<ChannelMetaData> component21() {
        return this.trendingChannels;
    }

    public final List<VideoMetaData> component3() {
        return this.hottestVideos;
    }

    public final String component4() {
        return this.popularPremiumVideosTitle;
    }

    public final List<VideoMetaData> component5() {
        return this.popularPremiumVideos;
    }

    public final String component6() {
        return this.recommendedVideosTitle;
    }

    public final List<VideoMetaData> component7() {
        return this.recommendedVideos;
    }

    public final String component8() {
        return this.recentVideosTitle;
    }

    public final List<VideoMetaData> component9() {
        return this.recentVideos;
    }

    public final HomePage copy(List<CarouselBanner> carouselBanners, String hottestVideosTitle, List<VideoMetaData> hottestVideos, String popularPremiumVideosTitle, List<VideoMetaData> popularPremiumVideos, String recommendedVideosTitle, List<VideoMetaData> recommendedVideos, String recentVideosTitle, List<VideoMetaData> recentVideos, String popularDvdsTitle, List<Dvd> popularDvds, String featuredChannelsTitle, List<ChannelVideosContainer> featuredChannels, String popularPornstarsTitle, List<PerformerMetaData> popularPerformers, String featuredNetworkTitle, List<Network> featuredNetwork, String popularChannelsTitle, List<ChannelMetaData> popularChannels, String trendingChannelsTitle, List<ChannelMetaData> trendingChannels) {
        Intrinsics.checkNotNullParameter(carouselBanners, "carouselBanners");
        Intrinsics.checkNotNullParameter(hottestVideosTitle, "hottestVideosTitle");
        Intrinsics.checkNotNullParameter(hottestVideos, "hottestVideos");
        Intrinsics.checkNotNullParameter(popularPremiumVideosTitle, "popularPremiumVideosTitle");
        Intrinsics.checkNotNullParameter(popularPremiumVideos, "popularPremiumVideos");
        Intrinsics.checkNotNullParameter(recommendedVideosTitle, "recommendedVideosTitle");
        Intrinsics.checkNotNullParameter(recommendedVideos, "recommendedVideos");
        Intrinsics.checkNotNullParameter(recentVideosTitle, "recentVideosTitle");
        Intrinsics.checkNotNullParameter(recentVideos, "recentVideos");
        Intrinsics.checkNotNullParameter(popularDvdsTitle, "popularDvdsTitle");
        Intrinsics.checkNotNullParameter(popularDvds, "popularDvds");
        Intrinsics.checkNotNullParameter(featuredChannelsTitle, "featuredChannelsTitle");
        Intrinsics.checkNotNullParameter(featuredChannels, "featuredChannels");
        Intrinsics.checkNotNullParameter(popularPornstarsTitle, "popularPornstarsTitle");
        Intrinsics.checkNotNullParameter(popularPerformers, "popularPerformers");
        Intrinsics.checkNotNullParameter(featuredNetworkTitle, "featuredNetworkTitle");
        Intrinsics.checkNotNullParameter(featuredNetwork, "featuredNetwork");
        Intrinsics.checkNotNullParameter(popularChannelsTitle, "popularChannelsTitle");
        Intrinsics.checkNotNullParameter(popularChannels, "popularChannels");
        Intrinsics.checkNotNullParameter(trendingChannelsTitle, "trendingChannelsTitle");
        Intrinsics.checkNotNullParameter(trendingChannels, "trendingChannels");
        return new HomePage(carouselBanners, hottestVideosTitle, hottestVideos, popularPremiumVideosTitle, popularPremiumVideos, recommendedVideosTitle, recommendedVideos, recentVideosTitle, recentVideos, popularDvdsTitle, popularDvds, featuredChannelsTitle, featuredChannels, popularPornstarsTitle, popularPerformers, featuredNetworkTitle, featuredNetwork, popularChannelsTitle, popularChannels, trendingChannelsTitle, trendingChannels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomePage) {
            HomePage homePage = (HomePage) obj;
            return Intrinsics.areEqual(this.carouselBanners, homePage.carouselBanners) && Intrinsics.areEqual(this.hottestVideosTitle, homePage.hottestVideosTitle) && Intrinsics.areEqual(this.hottestVideos, homePage.hottestVideos) && Intrinsics.areEqual(this.popularPremiumVideosTitle, homePage.popularPremiumVideosTitle) && Intrinsics.areEqual(this.popularPremiumVideos, homePage.popularPremiumVideos) && Intrinsics.areEqual(this.recommendedVideosTitle, homePage.recommendedVideosTitle) && Intrinsics.areEqual(this.recommendedVideos, homePage.recommendedVideos) && Intrinsics.areEqual(this.recentVideosTitle, homePage.recentVideosTitle) && Intrinsics.areEqual(this.recentVideos, homePage.recentVideos) && Intrinsics.areEqual(this.popularDvdsTitle, homePage.popularDvdsTitle) && Intrinsics.areEqual(this.popularDvds, homePage.popularDvds) && Intrinsics.areEqual(this.featuredChannelsTitle, homePage.featuredChannelsTitle) && Intrinsics.areEqual(this.featuredChannels, homePage.featuredChannels) && Intrinsics.areEqual(this.popularPornstarsTitle, homePage.popularPornstarsTitle) && Intrinsics.areEqual(this.popularPerformers, homePage.popularPerformers) && Intrinsics.areEqual(this.featuredNetworkTitle, homePage.featuredNetworkTitle) && Intrinsics.areEqual(this.featuredNetwork, homePage.featuredNetwork) && Intrinsics.areEqual(this.popularChannelsTitle, homePage.popularChannelsTitle) && Intrinsics.areEqual(this.popularChannels, homePage.popularChannels) && Intrinsics.areEqual(this.trendingChannelsTitle, homePage.trendingChannelsTitle) && Intrinsics.areEqual(this.trendingChannels, homePage.trendingChannels);
        }
        return false;
    }

    public final List<CarouselBanner> getCarouselBanners() {
        return this.carouselBanners;
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

    public final List<PerformerMetaData> getPopularPerformers() {
        return this.popularPerformers;
    }

    public final String getPopularPornstarsTitle() {
        return this.popularPornstarsTitle;
    }

    public final List<VideoMetaData> getPopularPremiumVideos() {
        return this.popularPremiumVideos;
    }

    public final String getPopularPremiumVideosTitle() {
        return this.popularPremiumVideosTitle;
    }

    public final List<VideoMetaData> getRecentVideos() {
        return this.recentVideos;
    }

    public final String getRecentVideosTitle() {
        return this.recentVideosTitle;
    }

    public final List<VideoMetaData> getRecommendedVideos() {
        return this.recommendedVideos;
    }

    public final String getRecommendedVideosTitle() {
        return this.recommendedVideosTitle;
    }

    public final List<ChannelMetaData> getTrendingChannels() {
        return this.trendingChannels;
    }

    public final String getTrendingChannelsTitle() {
        return this.trendingChannelsTitle;
    }

    public int hashCode() {
        return this.trendingChannels.hashCode() + a.b(this.trendingChannelsTitle, android.support.v4.media.a.b(this.popularChannels, a.b(this.popularChannelsTitle, android.support.v4.media.a.b(this.featuredNetwork, a.b(this.featuredNetworkTitle, android.support.v4.media.a.b(this.popularPerformers, a.b(this.popularPornstarsTitle, android.support.v4.media.a.b(this.featuredChannels, a.b(this.featuredChannelsTitle, android.support.v4.media.a.b(this.popularDvds, a.b(this.popularDvdsTitle, android.support.v4.media.a.b(this.recentVideos, a.b(this.recentVideosTitle, android.support.v4.media.a.b(this.recommendedVideos, a.b(this.recommendedVideosTitle, android.support.v4.media.a.b(this.popularPremiumVideos, a.b(this.popularPremiumVideosTitle, android.support.v4.media.a.b(this.hottestVideos, a.b(this.hottestVideosTitle, this.carouselBanners.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder m10 = a.m("HomePage(carouselBanners=");
        m10.append(this.carouselBanners);
        m10.append(", hottestVideosTitle=");
        m10.append(this.hottestVideosTitle);
        m10.append(", hottestVideos=");
        m10.append(this.hottestVideos);
        m10.append(", popularPremiumVideosTitle=");
        m10.append(this.popularPremiumVideosTitle);
        m10.append(", popularPremiumVideos=");
        m10.append(this.popularPremiumVideos);
        m10.append(", recommendedVideosTitle=");
        m10.append(this.recommendedVideosTitle);
        m10.append(", recommendedVideos=");
        m10.append(this.recommendedVideos);
        m10.append(", recentVideosTitle=");
        m10.append(this.recentVideosTitle);
        m10.append(", recentVideos=");
        m10.append(this.recentVideos);
        m10.append(", popularDvdsTitle=");
        m10.append(this.popularDvdsTitle);
        m10.append(", popularDvds=");
        m10.append(this.popularDvds);
        m10.append(", featuredChannelsTitle=");
        m10.append(this.featuredChannelsTitle);
        m10.append(", featuredChannels=");
        m10.append(this.featuredChannels);
        m10.append(", popularPornstarsTitle=");
        m10.append(this.popularPornstarsTitle);
        m10.append(", popularPerformers=");
        m10.append(this.popularPerformers);
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
