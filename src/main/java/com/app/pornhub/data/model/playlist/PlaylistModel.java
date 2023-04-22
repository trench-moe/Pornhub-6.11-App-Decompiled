package com.app.pornhub.data.model.playlist;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015¢\u0006\u0002\u0010\u001bJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\u0010HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015HÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u000bHÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003JÙ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015HÆ\u0001J\u0013\u0010E\u001a\u00020\u00102\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u000bHÖ\u0001J\t\u0010H\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001f¨\u0006I"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "userId", "username", BuildConfig.FLAVOR, "title", "description", "status", "percent", BuildConfig.FLAVOR, "videoCount", "favouriteCount", "views", "premium", BuildConfig.FLAVOR, "segment", "isFull", "type", "tags", BuildConfig.FLAVOR, "urlThumbnails", "Lcom/app/pornhub/data/model/playlist/PlaylistThumbsModel;", "playlistVkeys", SearchSuggestionsConfig.sourceVideos, "Lcom/app/pornhub/data/model/videos/VideoModel;", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIZLjava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getFavouriteCount", "()I", "getId", "()J", "()Z", "getPercent", "getPlaylistVkeys", "()Ljava/util/List;", "getPremium", "getSegment", "getStatus", "getTags", "getTitle", "getType", "getUrlThumbnails", "getUserId", "getUsername", "getVideoCount", "getVideos", "getViews", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistModel {
    private final String description;
    private final int favouriteCount;

    /* renamed from: id  reason: collision with root package name */
    private final long f4343id;
    private final boolean isFull;
    private final int percent;
    private final List<String> playlistVkeys;
    private final boolean premium;
    private final String segment;
    private final String status;
    private final List<String> tags;
    private final String title;
    private final String type;
    private final List<PlaylistThumbsModel> urlThumbnails;
    private final long userId;
    private final String username;
    private final int videoCount;
    private final List<VideoModel> videos;
    private final int views;

    public PlaylistModel(long j10, long j11, String username, String title, String description, String status, int i10, int i11, int i12, int i13, boolean z10, String segment, boolean z11, String type, List<String> tags, List<PlaylistThumbsModel> urlThumbnails, List<String> list, List<VideoModel> list2) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(urlThumbnails, "urlThumbnails");
        this.f4343id = j10;
        this.userId = j11;
        this.username = username;
        this.title = title;
        this.description = description;
        this.status = status;
        this.percent = i10;
        this.videoCount = i11;
        this.favouriteCount = i12;
        this.views = i13;
        this.premium = z10;
        this.segment = segment;
        this.isFull = z11;
        this.type = type;
        this.tags = tags;
        this.urlThumbnails = urlThumbnails;
        this.playlistVkeys = list;
        this.videos = list2;
    }

    public final long component1() {
        return this.f4343id;
    }

    public final int component10() {
        return this.views;
    }

    public final boolean component11() {
        return this.premium;
    }

    public final String component12() {
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

    public final List<PlaylistThumbsModel> component16() {
        return this.urlThumbnails;
    }

    public final List<String> component17() {
        return this.playlistVkeys;
    }

    public final List<VideoModel> component18() {
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

    public final PlaylistModel copy(long j10, long j11, String username, String title, String description, String status, int i10, int i11, int i12, int i13, boolean z10, String segment, boolean z11, String type, List<String> tags, List<PlaylistThumbsModel> urlThumbnails, List<String> list, List<VideoModel> list2) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(urlThumbnails, "urlThumbnails");
        return new PlaylistModel(j10, j11, username, title, description, status, i10, i11, i12, i13, z10, segment, z11, type, tags, urlThumbnails, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaylistModel) {
            PlaylistModel playlistModel = (PlaylistModel) obj;
            return this.f4343id == playlistModel.f4343id && this.userId == playlistModel.userId && Intrinsics.areEqual(this.username, playlistModel.username) && Intrinsics.areEqual(this.title, playlistModel.title) && Intrinsics.areEqual(this.description, playlistModel.description) && Intrinsics.areEqual(this.status, playlistModel.status) && this.percent == playlistModel.percent && this.videoCount == playlistModel.videoCount && this.favouriteCount == playlistModel.favouriteCount && this.views == playlistModel.views && this.premium == playlistModel.premium && Intrinsics.areEqual(this.segment, playlistModel.segment) && this.isFull == playlistModel.isFull && Intrinsics.areEqual(this.type, playlistModel.type) && Intrinsics.areEqual(this.tags, playlistModel.tags) && Intrinsics.areEqual(this.urlThumbnails, playlistModel.urlThumbnails) && Intrinsics.areEqual(this.playlistVkeys, playlistModel.playlistVkeys) && Intrinsics.areEqual(this.videos, playlistModel.videos);
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
        return this.f4343id;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final List<String> getPlaylistVkeys() {
        return this.playlistVkeys;
    }

    public final boolean getPremium() {
        return this.premium;
    }

    public final String getSegment() {
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

    public final List<PlaylistThumbsModel> getUrlThumbnails() {
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

    public final List<VideoModel> getVideos() {
        return this.videos;
    }

    public final int getViews() {
        return this.views;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        long j10 = this.f4343id;
        long j11 = this.userId;
        int b10 = (((((((a.b(this.status, a.b(this.description, a.b(this.title, a.b(this.username, ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31, 31), 31), 31), 31) + this.percent) * 31) + this.videoCount) * 31) + this.favouriteCount) * 31) + this.views) * 31;
        boolean z10 = this.premium;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int b11 = a.b(this.segment, (b10 + i11) * 31, 31);
        boolean z11 = this.isFull;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int b12 = android.support.v4.media.a.b(this.urlThumbnails, android.support.v4.media.a.b(this.tags, a.b(this.type, (b11 + i10) * 31, 31), 31), 31);
        List<String> list = this.playlistVkeys;
        int i12 = 0;
        int hashCode = (b12 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoModel> list2 = this.videos;
        if (list2 != null) {
            i12 = list2.hashCode();
        }
        return hashCode + i12;
    }

    public final boolean isFull() {
        return this.isFull;
    }

    public String toString() {
        StringBuilder m10 = a.m("PlaylistModel(id=");
        m10.append(this.f4343id);
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
        m10.append(", premium=");
        m10.append(this.premium);
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
