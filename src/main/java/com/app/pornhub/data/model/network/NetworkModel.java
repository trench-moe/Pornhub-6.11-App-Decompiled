package com.app.pornhub.data.model.network;

import a1.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/app/pornhub/data/model/network/NetworkModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "username", "thumbnail", "isVerified", BuildConfig.FLAVOR, "videoViewsCount", "videosCount", BuildConfig.FLAVOR, "subscribersCount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getSubscribersCount", "getThumbnail", "getUsername", "getVideoViewsCount", "getVideosCount", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkModel {

    /* renamed from: id  reason: collision with root package name */
    private final String f4340id;
    private final boolean isVerified;
    private final String subscribersCount;
    private final String thumbnail;
    private final String username;
    private final String videoViewsCount;
    private final int videosCount;

    public NetworkModel(String id2, String username, String thumbnail, boolean z10, String videoViewsCount, int i10, String subscribersCount) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(videoViewsCount, "videoViewsCount");
        Intrinsics.checkNotNullParameter(subscribersCount, "subscribersCount");
        this.f4340id = id2;
        this.username = username;
        this.thumbnail = thumbnail;
        this.isVerified = z10;
        this.videoViewsCount = videoViewsCount;
        this.videosCount = i10;
        this.subscribersCount = subscribersCount;
    }

    public static /* synthetic */ NetworkModel copy$default(NetworkModel networkModel, String str, String str2, String str3, boolean z10, String str4, int i10, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = networkModel.f4340id;
        }
        if ((i11 & 2) != 0) {
            str2 = networkModel.username;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = networkModel.thumbnail;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            z10 = networkModel.isVerified;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            str4 = networkModel.videoViewsCount;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            i10 = networkModel.videosCount;
        }
        int i12 = i10;
        if ((i11 & 64) != 0) {
            str5 = networkModel.subscribersCount;
        }
        return networkModel.copy(str, str6, str7, z11, str8, i12, str5);
    }

    public final String component1() {
        return this.f4340id;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.thumbnail;
    }

    public final boolean component4() {
        return this.isVerified;
    }

    public final String component5() {
        return this.videoViewsCount;
    }

    public final int component6() {
        return this.videosCount;
    }

    public final String component7() {
        return this.subscribersCount;
    }

    public final NetworkModel copy(String id2, String username, String thumbnail, boolean z10, String videoViewsCount, int i10, String subscribersCount) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(videoViewsCount, "videoViewsCount");
        Intrinsics.checkNotNullParameter(subscribersCount, "subscribersCount");
        return new NetworkModel(id2, username, thumbnail, z10, videoViewsCount, i10, subscribersCount);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetworkModel) {
            NetworkModel networkModel = (NetworkModel) obj;
            if (Intrinsics.areEqual(this.f4340id, networkModel.f4340id) && Intrinsics.areEqual(this.username, networkModel.username) && Intrinsics.areEqual(this.thumbnail, networkModel.thumbnail) && this.isVerified == networkModel.isVerified && Intrinsics.areEqual(this.videoViewsCount, networkModel.videoViewsCount) && this.videosCount == networkModel.videosCount && Intrinsics.areEqual(this.subscribersCount, networkModel.subscribersCount)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getId() {
        return this.f4340id;
    }

    public final String getSubscribersCount() {
        return this.subscribersCount;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getVideoViewsCount() {
        return this.videoViewsCount;
    }

    public final int getVideosCount() {
        return this.videosCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.thumbnail, a.b(this.username, this.f4340id.hashCode() * 31, 31), 31);
        boolean z10 = this.isVerified;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.subscribersCount.hashCode() + ((a.b(this.videoViewsCount, (b10 + i10) * 31, 31) + this.videosCount) * 31);
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public String toString() {
        StringBuilder m10 = a.m("NetworkModel(id=");
        m10.append(this.f4340id);
        m10.append(", username=");
        m10.append(this.username);
        m10.append(", thumbnail=");
        m10.append(this.thumbnail);
        m10.append(", isVerified=");
        m10.append(this.isVerified);
        m10.append(", videoViewsCount=");
        m10.append(this.videoViewsCount);
        m10.append(", videosCount=");
        m10.append(this.videosCount);
        m10.append(", subscribersCount=");
        return b.l(m10, this.subscribersCount, ')');
    }
}
