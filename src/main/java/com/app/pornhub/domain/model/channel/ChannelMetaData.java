package com.app.pornhub.domain.model.channel;

import a1.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jc\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006'"}, d2 = {"Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "title", "rank", "avatar", "cover", "isPremium", BuildConfig.FLAVOR, "videoViewsCount", "videosCount", "subscribersCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getCover", "getId", "()Z", "getRank", "getSubscribersCount", "getTitle", "getVideoViewsCount", "getVideosCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChannelMetaData {
    private final String avatar;
    private final String cover;

    /* renamed from: id  reason: collision with root package name */
    private final String f4897id;
    private final boolean isPremium;
    private final String rank;
    private final String subscribersCount;
    private final String title;
    private final String videoViewsCount;
    private final String videosCount;

    public ChannelMetaData(String id2, String title, String rank, String avatar, String cover, boolean z10, String videoViewsCount, String videosCount, String subscribersCount) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(videoViewsCount, "videoViewsCount");
        Intrinsics.checkNotNullParameter(videosCount, "videosCount");
        Intrinsics.checkNotNullParameter(subscribersCount, "subscribersCount");
        this.f4897id = id2;
        this.title = title;
        this.rank = rank;
        this.avatar = avatar;
        this.cover = cover;
        this.isPremium = z10;
        this.videoViewsCount = videoViewsCount;
        this.videosCount = videosCount;
        this.subscribersCount = subscribersCount;
    }

    public final String component1() {
        return this.f4897id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.rank;
    }

    public final String component4() {
        return this.avatar;
    }

    public final String component5() {
        return this.cover;
    }

    public final boolean component6() {
        return this.isPremium;
    }

    public final String component7() {
        return this.videoViewsCount;
    }

    public final String component8() {
        return this.videosCount;
    }

    public final String component9() {
        return this.subscribersCount;
    }

    public final ChannelMetaData copy(String id2, String title, String rank, String avatar, String cover, boolean z10, String videoViewsCount, String videosCount, String subscribersCount) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(rank, "rank");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(cover, "cover");
        Intrinsics.checkNotNullParameter(videoViewsCount, "videoViewsCount");
        Intrinsics.checkNotNullParameter(videosCount, "videosCount");
        Intrinsics.checkNotNullParameter(subscribersCount, "subscribersCount");
        return new ChannelMetaData(id2, title, rank, avatar, cover, z10, videoViewsCount, videosCount, subscribersCount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChannelMetaData) {
            ChannelMetaData channelMetaData = (ChannelMetaData) obj;
            return Intrinsics.areEqual(this.f4897id, channelMetaData.f4897id) && Intrinsics.areEqual(this.title, channelMetaData.title) && Intrinsics.areEqual(this.rank, channelMetaData.rank) && Intrinsics.areEqual(this.avatar, channelMetaData.avatar) && Intrinsics.areEqual(this.cover, channelMetaData.cover) && this.isPremium == channelMetaData.isPremium && Intrinsics.areEqual(this.videoViewsCount, channelMetaData.videoViewsCount) && Intrinsics.areEqual(this.videosCount, channelMetaData.videosCount) && Intrinsics.areEqual(this.subscribersCount, channelMetaData.subscribersCount);
        }
        return false;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getId() {
        return this.f4897id;
    }

    public final String getRank() {
        return this.rank;
    }

    public final String getSubscribersCount() {
        return this.subscribersCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVideoViewsCount() {
        return this.videoViewsCount;
    }

    public final String getVideosCount() {
        return this.videosCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.cover, a.b(this.avatar, a.b(this.rank, a.b(this.title, this.f4897id.hashCode() * 31, 31), 31), 31), 31);
        boolean z10 = this.isPremium;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.subscribersCount.hashCode() + a.b(this.videosCount, a.b(this.videoViewsCount, (b10 + i10) * 31, 31), 31);
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public String toString() {
        StringBuilder m10 = a.m("ChannelMetaData(id=");
        m10.append(this.f4897id);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", rank=");
        m10.append(this.rank);
        m10.append(", avatar=");
        m10.append(this.avatar);
        m10.append(", cover=");
        m10.append(this.cover);
        m10.append(", isPremium=");
        m10.append(this.isPremium);
        m10.append(", videoViewsCount=");
        m10.append(this.videoViewsCount);
        m10.append(", videosCount=");
        m10.append(this.videosCount);
        m10.append(", subscribersCount=");
        return b.l(m10, this.subscribersCount, ')');
    }
}
