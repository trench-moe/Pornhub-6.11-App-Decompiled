package com.app.pornhub.domain.model.video;

import a1.a;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B½\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0014HÆ\u0003J\t\u0010>\u001a\u00020\u0010HÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0010HÆ\u0003J\t\u0010G\u001a\u00020\u001eHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\t\u0010M\u001a\u00020\fHÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003Jï\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001J\u0013\u0010P\u001a\u00020\u00102\b\u0010Q\u001a\u0004\u0018\u00010RHÖ\u0003J\t\u0010S\u001a\u00020\u0007HÖ\u0001J\u0006\u0010T\u001a\u00020\u0010J\t\u0010U\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u0018\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010#R\u0011\u0010\u001c\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0011\u0010\u0017\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010#R\u0011\u0010\u0015\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010#R\u0011\u0010\u0016\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010#R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010#R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010%R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010%¨\u0006V"}, d2 = {"Lcom/app/pornhub/domain/model/video/VideoMetaData;", "Ljava/io/Serializable;", "id", BuildConfig.FLAVOR, "vkey", "title", "duration", BuildConfig.FLAVOR, "rating", "viewCount", "commentsCount", "approvedOn", BuildConfig.FLAVOR, "urlThumbnail", "previewUrl", "isHd", BuildConfig.FLAVOR, "isVr", "canSeeVideo", "videoContentType", "Lcom/app/pornhub/domain/model/video/VideoContentType;", "isPrivate", "isVerified", "isPaid", "isAvailable", "price", "channelLink", "channelTitle", "isContentPartner", "userMetaData", "Lcom/app/pornhub/domain/model/user/UserMetaData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIJLjava/lang/String;Ljava/lang/String;ZZZLcom/app/pornhub/domain/model/video/VideoContentType;ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/app/pornhub/domain/model/user/UserMetaData;)V", "getApprovedOn", "()J", "getCanSeeVideo", "()Z", "getChannelLink", "()Ljava/lang/String;", "getChannelTitle", "getCommentsCount", "()I", "getDuration", "getId", "getPreviewUrl", "setPreviewUrl", "(Ljava/lang/String;)V", "getPrice", "getRating", "getTitle", "getUrlThumbnail", "getUserMetaData", "()Lcom/app/pornhub/domain/model/user/UserMetaData;", "getVideoContentType", "()Lcom/app/pornhub/domain/model/video/VideoContentType;", "getViewCount", "getVkey", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", BuildConfig.FLAVOR, "hashCode", "isLocked", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoMetaData implements Serializable {
    private final long approvedOn;
    private final boolean canSeeVideo;
    private final String channelLink;
    private final String channelTitle;
    private final int commentsCount;
    private final int duration;

    /* renamed from: id  reason: collision with root package name */
    private final String f4909id;
    private final boolean isAvailable;
    private final boolean isContentPartner;
    private final boolean isHd;
    private final boolean isPaid;
    private final boolean isPrivate;
    private final boolean isVerified;
    private final boolean isVr;
    private String previewUrl;
    private final String price;
    private final int rating;
    private final String title;
    private final String urlThumbnail;
    private final UserMetaData userMetaData;
    private final VideoContentType videoContentType;
    private final int viewCount;
    private final String vkey;

    public VideoMetaData(String id2, String vkey, String title, int i10, int i11, int i12, int i13, long j10, String urlThumbnail, String previewUrl, boolean z10, boolean z11, boolean z12, VideoContentType videoContentType, boolean z13, boolean z14, boolean z15, boolean z16, String price, String channelLink, String channelTitle, boolean z17, UserMetaData userMetaData) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        Intrinsics.checkNotNullParameter(videoContentType, "videoContentType");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(channelLink, "channelLink");
        Intrinsics.checkNotNullParameter(channelTitle, "channelTitle");
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        this.f4909id = id2;
        this.vkey = vkey;
        this.title = title;
        this.duration = i10;
        this.rating = i11;
        this.viewCount = i12;
        this.commentsCount = i13;
        this.approvedOn = j10;
        this.urlThumbnail = urlThumbnail;
        this.previewUrl = previewUrl;
        this.isHd = z10;
        this.isVr = z11;
        this.canSeeVideo = z12;
        this.videoContentType = videoContentType;
        this.isPrivate = z13;
        this.isVerified = z14;
        this.isPaid = z15;
        this.isAvailable = z16;
        this.price = price;
        this.channelLink = channelLink;
        this.channelTitle = channelTitle;
        this.isContentPartner = z17;
        this.userMetaData = userMetaData;
    }

    public final String component1() {
        return this.f4909id;
    }

    public final String component10() {
        return this.previewUrl;
    }

    public final boolean component11() {
        return this.isHd;
    }

    public final boolean component12() {
        return this.isVr;
    }

    public final boolean component13() {
        return this.canSeeVideo;
    }

    public final VideoContentType component14() {
        return this.videoContentType;
    }

    public final boolean component15() {
        return this.isPrivate;
    }

    public final boolean component16() {
        return this.isVerified;
    }

    public final boolean component17() {
        return this.isPaid;
    }

    public final boolean component18() {
        return this.isAvailable;
    }

    public final String component19() {
        return this.price;
    }

    public final String component2() {
        return this.vkey;
    }

    public final String component20() {
        return this.channelLink;
    }

    public final String component21() {
        return this.channelTitle;
    }

    public final boolean component22() {
        return this.isContentPartner;
    }

    public final UserMetaData component23() {
        return this.userMetaData;
    }

    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.duration;
    }

    public final int component5() {
        return this.rating;
    }

    public final int component6() {
        return this.viewCount;
    }

    public final int component7() {
        return this.commentsCount;
    }

    public final long component8() {
        return this.approvedOn;
    }

    public final String component9() {
        return this.urlThumbnail;
    }

    public final VideoMetaData copy(String id2, String vkey, String title, int i10, int i11, int i12, int i13, long j10, String urlThumbnail, String previewUrl, boolean z10, boolean z11, boolean z12, VideoContentType videoContentType, boolean z13, boolean z14, boolean z15, boolean z16, String price, String channelLink, String channelTitle, boolean z17, UserMetaData userMetaData) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        Intrinsics.checkNotNullParameter(videoContentType, "videoContentType");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(channelLink, "channelLink");
        Intrinsics.checkNotNullParameter(channelTitle, "channelTitle");
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        return new VideoMetaData(id2, vkey, title, i10, i11, i12, i13, j10, urlThumbnail, previewUrl, z10, z11, z12, videoContentType, z13, z14, z15, z16, price, channelLink, channelTitle, z17, userMetaData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoMetaData) {
            VideoMetaData videoMetaData = (VideoMetaData) obj;
            if (Intrinsics.areEqual(this.f4909id, videoMetaData.f4909id) && Intrinsics.areEqual(this.vkey, videoMetaData.vkey) && Intrinsics.areEqual(this.title, videoMetaData.title) && this.duration == videoMetaData.duration && this.rating == videoMetaData.rating && this.viewCount == videoMetaData.viewCount && this.commentsCount == videoMetaData.commentsCount && this.approvedOn == videoMetaData.approvedOn && Intrinsics.areEqual(this.urlThumbnail, videoMetaData.urlThumbnail) && Intrinsics.areEqual(this.previewUrl, videoMetaData.previewUrl) && this.isHd == videoMetaData.isHd && this.isVr == videoMetaData.isVr && this.canSeeVideo == videoMetaData.canSeeVideo && this.videoContentType == videoMetaData.videoContentType && this.isPrivate == videoMetaData.isPrivate && this.isVerified == videoMetaData.isVerified && this.isPaid == videoMetaData.isPaid && this.isAvailable == videoMetaData.isAvailable && Intrinsics.areEqual(this.price, videoMetaData.price) && Intrinsics.areEqual(this.channelLink, videoMetaData.channelLink) && Intrinsics.areEqual(this.channelTitle, videoMetaData.channelTitle) && this.isContentPartner == videoMetaData.isContentPartner && Intrinsics.areEqual(this.userMetaData, videoMetaData.userMetaData)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long getApprovedOn() {
        return this.approvedOn;
    }

    public final boolean getCanSeeVideo() {
        return this.canSeeVideo;
    }

    public final String getChannelLink() {
        return this.channelLink;
    }

    public final String getChannelTitle() {
        return this.channelTitle;
    }

    public final int getCommentsCount() {
        return this.commentsCount;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getId() {
        return this.f4909id;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getRating() {
        return this.rating;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrlThumbnail() {
        return this.urlThumbnail;
    }

    public final UserMetaData getUserMetaData() {
        return this.userMetaData;
    }

    public final VideoContentType getVideoContentType() {
        return this.videoContentType;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final String getVkey() {
        return this.vkey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.vkey, this.f4909id.hashCode() * 31, 31);
        long j10 = this.approvedOn;
        int b11 = a.b(this.previewUrl, a.b(this.urlThumbnail, (((((((((a.b(this.title, b10, 31) + this.duration) * 31) + this.rating) * 31) + this.viewCount) * 31) + this.commentsCount) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31);
        boolean z10 = this.isHd;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (b11 + i11) * 31;
        boolean z11 = this.isVr;
        int i13 = z11;
        if (z11 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.canSeeVideo;
        int i15 = z12;
        if (z12 != 0) {
            i15 = 1;
        }
        int hashCode = (this.videoContentType.hashCode() + ((i14 + i15) * 31)) * 31;
        boolean z13 = this.isPrivate;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (hashCode + i16) * 31;
        boolean z14 = this.isVerified;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z15 = this.isPaid;
        int i20 = z15;
        if (z15 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z16 = this.isAvailable;
        int i22 = z16;
        if (z16 != 0) {
            i22 = 1;
        }
        int b12 = a.b(this.channelTitle, a.b(this.channelLink, a.b(this.price, (i21 + i22) * 31, 31), 31), 31);
        boolean z17 = this.isContentPartner;
        if (!z17) {
            i10 = z17 ? 1 : 0;
        }
        return this.userMetaData.hashCode() + ((b12 + i10) * 31);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isContentPartner() {
        return this.isContentPartner;
    }

    public final boolean isHd() {
        return this.isHd;
    }

    public final boolean isLocked() {
        return this.isPrivate && !this.canSeeVideo;
    }

    public final boolean isPaid() {
        return this.isPaid;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final boolean isVr() {
        return this.isVr;
    }

    public final void setPreviewUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.previewUrl = str;
    }

    public String toString() {
        StringBuilder m10 = a.m("VideoMetaData(id=");
        m10.append(this.f4909id);
        m10.append(", vkey=");
        m10.append(this.vkey);
        m10.append(", title=");
        m10.append(this.title);
        m10.append(", duration=");
        m10.append(this.duration);
        m10.append(", rating=");
        m10.append(this.rating);
        m10.append(", viewCount=");
        m10.append(this.viewCount);
        m10.append(", commentsCount=");
        m10.append(this.commentsCount);
        m10.append(", approvedOn=");
        m10.append(this.approvedOn);
        m10.append(", urlThumbnail=");
        m10.append(this.urlThumbnail);
        m10.append(", previewUrl=");
        m10.append(this.previewUrl);
        m10.append(", isHd=");
        m10.append(this.isHd);
        m10.append(", isVr=");
        m10.append(this.isVr);
        m10.append(", canSeeVideo=");
        m10.append(this.canSeeVideo);
        m10.append(", videoContentType=");
        m10.append(this.videoContentType);
        m10.append(", isPrivate=");
        m10.append(this.isPrivate);
        m10.append(", isVerified=");
        m10.append(this.isVerified);
        m10.append(", isPaid=");
        m10.append(this.isPaid);
        m10.append(", isAvailable=");
        m10.append(this.isAvailable);
        m10.append(", price=");
        m10.append(this.price);
        m10.append(", channelLink=");
        m10.append(this.channelLink);
        m10.append(", channelTitle=");
        m10.append(this.channelTitle);
        m10.append(", isContentPartner=");
        m10.append(this.isContentPartner);
        m10.append(", userMetaData=");
        m10.append(this.userMetaData);
        m10.append(')');
        return m10.toString();
    }
}
