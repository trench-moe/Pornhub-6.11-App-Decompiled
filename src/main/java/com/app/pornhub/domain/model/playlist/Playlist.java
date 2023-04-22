package com.app.pornhub.domain.model.playlist;

import a1.a;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017¢\u0006\u0002\u0010\u001cJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u000bHÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\t\u0010I\u001a\u00020\u000bHÆ\u0003JÕ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017HÆ\u0001J\u0013\u0010K\u001a\u00020\u00102\b\u0010L\u001a\u0004\u0018\u00010MHÖ\u0003J\t\u0010N\u001a\u00020\u000bHÖ\u0001J\t\u0010O\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010%R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010 R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010(\"\u0004\b5\u00106R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\"¨\u0006P"}, d2 = {"Lcom/app/pornhub/domain/model/playlist/Playlist;", "Ljava/io/Serializable;", "id", BuildConfig.FLAVOR, "userId", "username", BuildConfig.FLAVOR, "title", "description", "status", "percent", BuildConfig.FLAVOR, "videoCount", "favouriteCount", "views", "isPremium", BuildConfig.FLAVOR, "segment", "isFull", "type", "tags", BuildConfig.FLAVOR, "urlThumbnails", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/playlist/PlaylistThumbs;", "playlistVkeys", SearchSuggestionsConfig.sourceVideos, "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIZIZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getFavouriteCount", "()I", "getId", "()J", "()Z", "getPercent", "getPlaylistVkeys", "()Ljava/util/List;", "getSegment", "getStatus", "setStatus", "getTags", "getTitle", "setTitle", "getType", "getUrlThumbnails", "getUserId", "getUsername", "getVideoCount", "getVideos", "setVideos", "(Ljava/util/List;)V", "getViews", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Playlist implements Serializable {
    private String description;
    private final int favouriteCount;

    /* renamed from: id  reason: collision with root package name */
    private final long f4905id;
    private final boolean isFull;
    private final boolean isPremium;
    private final int percent;
    private final List<String> playlistVkeys;
    private final int segment;
    private String status;
    private final List<String> tags;
    private String title;
    private final String type;
    private final List<PlaylistThumbs> urlThumbnails;
    private final long userId;
    private final String username;
    private final int videoCount;
    private List<VideoMetaData> videos;
    private final int views;

    public Playlist(long j10, long j11, String username, String title, String description, String status, int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11, String type, List<String> tags, List<PlaylistThumbs> urlThumbnails, List<String> playlistVkeys, List<VideoMetaData> videos) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(urlThumbnails, "urlThumbnails");
        Intrinsics.checkNotNullParameter(playlistVkeys, "playlistVkeys");
        Intrinsics.checkNotNullParameter(videos, "videos");
        this.f4905id = j10;
        this.userId = j11;
        this.username = username;
        this.title = title;
        this.description = description;
        this.status = status;
        this.percent = i10;
        this.videoCount = i11;
        this.favouriteCount = i12;
        this.views = i13;
        this.isPremium = z10;
        this.segment = i14;
        this.isFull = z11;
        this.type = type;
        this.tags = tags;
        this.urlThumbnails = urlThumbnails;
        this.playlistVkeys = playlistVkeys;
        this.videos = videos;
    }

    public /* synthetic */ Playlist(long j10, long j11, String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11, String str5, List list, List list2, List list3, List list4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, str, str2, str3, str4, i10, i11, i12, i13, z10, i14, z11, str5, (i15 & 16384) != 0 ? new ArrayList() : list, list2, list3, list4);
    }

    public final long component1() {
        return this.f4905id;
    }

    public final int component10() {
        return this.views;
    }

    public final boolean component11() {
        return this.isPremium;
    }

    public final int component12() {
        return this.segment;
    }

    public final boolean component13() {
        return this.isFull;
    }

    public final String component14() {
        return this.type;
    }

    public final List<String> component15() {
        return this.tags;
    }

    public final List<PlaylistThumbs> component16() {
        return this.urlThumbnails;
    }

    public final List<String> component17() {
        return this.playlistVkeys;
    }

    public final List<VideoMetaData> component18() {
        return this.videos;
    }

    public final long component2() {
        return this.userId;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.status;
    }

    public final int component7() {
        return this.percent;
    }

    public final int component8() {
        return this.videoCount;
    }

    public final int component9() {
        return this.favouriteCount;
    }

    public final Playlist copy(long j10, long j11, String username, String title, String description, String status, int i10, int i11, int i12, int i13, boolean z10, int i14, boolean z11, String type, List<String> tags, List<PlaylistThumbs> urlThumbnails, List<String> playlistVkeys, List<VideoMetaData> videos) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(urlThumbnails, "urlThumbnails");
        Intrinsics.checkNotNullParameter(playlistVkeys, "playlistVkeys");
        Intrinsics.checkNotNullParameter(videos, "videos");
        return new Playlist(j10, j11, username, title, description, status, i10, i11, i12, i13, z10, i14, z11, type, tags, urlThumbnails, playlistVkeys, videos);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Playlist) {
            Playlist playlist = (Playlist) obj;
            return this.f4905id == playlist.f4905id && this.userId == playlist.userId && Intrinsics.areEqual(this.username, playlist.username) && Intrinsics.areEqual(this.title, playlist.title) && Intrinsics.areEqual(this.description, playlist.description) && Intrinsics.areEqual(this.status, playlist.status) && this.percent == playlist.percent && this.videoCount == playlist.videoCount && this.favouriteCount == playlist.favouriteCount && this.views == playlist.views && this.isPremium == playlist.isPremium && this.segment == playlist.segment && this.isFull == playlist.isFull && Intrinsics.areEqual(this.type, playlist.type) && Intrinsics.areEqual(this.tags, playlist.tags) && Intrinsics.areEqual(this.urlThumbnails, playlist.urlThumbnails) && Intrinsics.areEqual(this.playlistVkeys, playlist.playlistVkeys) && Intrinsics.areEqual(this.videos, playlist.videos);
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getFavouriteCount() {
        return this.favouriteCount;
    }

    public final long getId() {
        return this.f4905id;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final List<String> getPlaylistVkeys() {
        return this.playlistVkeys;
    }

    public final int getSegment() {
        return this.segment;
    }

    public final String getStatus() {
        return this.status;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final List<PlaylistThumbs> getUrlThumbnails() {
        return this.urlThumbnails;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final String getUsername() {
        return this.username;
    }

    public final int getVideoCount() {
        return this.videoCount;
    }

    public final List<VideoMetaData> getVideos() {
        return this.videos;
    }

    public final int getViews() {
        return this.views;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        long j10 = this.f4905id;
        long j11 = this.userId;
        int b10 = (((((((a.b(this.status, a.b(this.description, a.b(this.title, a.b(this.username, ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31), 31), 31), 31) + this.percent) * 31) + this.videoCount) * 31) + this.favouriteCount) * 31) + this.views) * 31;
        boolean z10 = this.isPremium;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (((b10 + i11) * 31) + this.segment) * 31;
        boolean z11 = this.isFull;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return this.videos.hashCode() + android.support.v4.media.a.b(this.playlistVkeys, android.support.v4.media.a.b(this.urlThumbnails, android.support.v4.media.a.b(this.tags, a.b(this.type, (i12 + i10) * 31, 31), 31), 31), 31);
    }

    public final boolean isFull() {
        return this.isFull;
    }

    public final boolean isPremium() {
        return this.isPremium;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setVideos(List<VideoMetaData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.videos = list;
    }

    public String toString() {
        StringBuilder m10 = a.m("Playlist(id=");
        m10.append(this.f4905id);
        m10.append(", userId=");
        m10.append(this.userId);
        m10.append(", username=");
        m10.append(this.username);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", description=");
        m10.append(this.description);
        m10.append(", status=");
        m10.append(this.status);
        m10.append(", percent=");
        m10.append(this.percent);
        m10.append(", videoCount=");
        m10.append(this.videoCount);
        m10.append(", favouriteCount=");
        m10.append(this.favouriteCount);
        m10.append(", views=");
        m10.append(this.views);
        m10.append(", isPremium=");
        m10.append(this.isPremium);
        m10.append(", segment=");
        m10.append(this.segment);
        m10.append(", isFull=");
        m10.append(this.isFull);
        m10.append(", type=");
        m10.append(this.type);
        m10.append(", tags=");
        m10.append(this.tags);
        m10.append(", urlThumbnails=");
        m10.append(this.urlThumbnails);
        m10.append(", playlistVkeys=");
        m10.append(this.playlistVkeys);
        m10.append(", videos=");
        return android.support.v4.media.a.k(m10, this.videos, ')');
    }
}
