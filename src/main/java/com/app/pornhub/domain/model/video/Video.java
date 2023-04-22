package com.app.pornhub.domain.model.video;

import android.support.v4.media.a;
import android.support.v4.media.b;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0002\u0010\u001aJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0014HÆ\u0003J\t\u00106\u001a\u00020\u0012HÆ\u0003J\t\u00107\u001a\u00020\u0014HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\t\u0010A\u001a\u00020\u0010HÆ\u0003J\t\u0010B\u001a\u00020\u0012HÆ\u0003J«\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u0007HÆ\u0001J\u0013\u0010D\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0012HÖ\u0001J\t\u0010G\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0018\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001e\"\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010$R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u0017\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0019\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001e\"\u0004\b-\u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b3\u0010)¨\u0006H"}, d2 = {"Lcom/app/pornhub/domain/model/video/Video;", BuildConfig.FLAVOR, "videoMetaData", "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "userMetaData", "Lcom/app/pornhub/domain/model/user/UserMetaData;", "categories", BuildConfig.FLAVOR, "tags", BuildConfig.FLAVOR, "production", SearchSuggestionsConfig.sourcePornstars, "Lcom/app/pornhub/domain/model/performer/PerformerMetaData;", "addedOn", BuildConfig.FLAVOR, "encodings", "Lcom/app/pornhub/domain/model/video/VideoEncodings;", "projectionType", BuildConfig.FLAVOR, "vrStereoSrc", BuildConfig.FLAVOR, "vrStereoType", "isPaidToDownload", "trackUrl", "description", "urlVideo", "(Lcom/app/pornhub/domain/model/video/VideoMetaData;Lcom/app/pornhub/domain/model/user/UserMetaData;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;JLcom/app/pornhub/domain/model/video/VideoEncodings;IZIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddedOn", "()J", "getCategories", "()Ljava/lang/String;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "getEncodings", "()Lcom/app/pornhub/domain/model/video/VideoEncodings;", "()Z", "getPornstars", "()Ljava/util/List;", "getProduction", "getProjectionType", "()I", "getTags", "getTrackUrl", "getUrlVideo", "setUrlVideo", "getUserMetaData", "()Lcom/app/pornhub/domain/model/user/UserMetaData;", "getVideoMetaData", "()Lcom/app/pornhub/domain/model/video/VideoMetaData;", "getVrStereoSrc", "getVrStereoType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Video {
    private final long addedOn;
    private final String categories;
    private String description;
    private final VideoEncodings encodings;
    private final boolean isPaidToDownload;
    private final List<PerformerMetaData> pornstars;
    private final String production;
    private final int projectionType;
    private final List<String> tags;
    private final String trackUrl;
    private String urlVideo;
    private final UserMetaData userMetaData;
    private final VideoMetaData videoMetaData;
    private final boolean vrStereoSrc;
    private final int vrStereoType;

    public Video(VideoMetaData videoMetaData, UserMetaData userMetaData, String categories, List<String> tags, String production, List<PerformerMetaData> pornstars, long j10, VideoEncodings encodings, int i10, boolean z10, int i11, boolean z11, String trackUrl, String description, String urlVideo) {
        Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(pornstars, "pornstars");
        Intrinsics.checkNotNullParameter(encodings, "encodings");
        Intrinsics.checkNotNullParameter(trackUrl, "trackUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(urlVideo, "urlVideo");
        this.videoMetaData = videoMetaData;
        this.userMetaData = userMetaData;
        this.categories = categories;
        this.tags = tags;
        this.production = production;
        this.pornstars = pornstars;
        this.addedOn = j10;
        this.encodings = encodings;
        this.projectionType = i10;
        this.vrStereoSrc = z10;
        this.vrStereoType = i11;
        this.isPaidToDownload = z11;
        this.trackUrl = trackUrl;
        this.description = description;
        this.urlVideo = urlVideo;
    }

    public /* synthetic */ Video(VideoMetaData videoMetaData, UserMetaData userMetaData, String str, List list, String str2, List list2, long j10, VideoEncodings videoEncodings, int i10, boolean z10, int i11, boolean z11, String str3, String str4, String str5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(videoMetaData, userMetaData, str, list, str2, list2, j10, videoEncodings, i10, z10, i11, z11, str3, (i12 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.FLAVOR : str4, str5);
    }

    public final VideoMetaData component1() {
        return this.videoMetaData;
    }

    public final boolean component10() {
        return this.vrStereoSrc;
    }

    public final int component11() {
        return this.vrStereoType;
    }

    public final boolean component12() {
        return this.isPaidToDownload;
    }

    public final String component13() {
        return this.trackUrl;
    }

    public final String component14() {
        return this.description;
    }

    public final String component15() {
        return this.urlVideo;
    }

    public final UserMetaData component2() {
        return this.userMetaData;
    }

    public final String component3() {
        return this.categories;
    }

    public final List<String> component4() {
        return this.tags;
    }

    public final String component5() {
        return this.production;
    }

    public final List<PerformerMetaData> component6() {
        return this.pornstars;
    }

    public final long component7() {
        return this.addedOn;
    }

    public final VideoEncodings component8() {
        return this.encodings;
    }

    public final int component9() {
        return this.projectionType;
    }

    public final Video copy(VideoMetaData videoMetaData, UserMetaData userMetaData, String categories, List<String> tags, String production, List<PerformerMetaData> pornstars, long j10, VideoEncodings encodings, int i10, boolean z10, int i11, boolean z11, String trackUrl, String description, String urlVideo) {
        Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(pornstars, "pornstars");
        Intrinsics.checkNotNullParameter(encodings, "encodings");
        Intrinsics.checkNotNullParameter(trackUrl, "trackUrl");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(urlVideo, "urlVideo");
        return new Video(videoMetaData, userMetaData, categories, tags, production, pornstars, j10, encodings, i10, z10, i11, z11, trackUrl, description, urlVideo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Video) {
            Video video = (Video) obj;
            if (Intrinsics.areEqual(this.videoMetaData, video.videoMetaData) && Intrinsics.areEqual(this.userMetaData, video.userMetaData) && Intrinsics.areEqual(this.categories, video.categories) && Intrinsics.areEqual(this.tags, video.tags) && Intrinsics.areEqual(this.production, video.production) && Intrinsics.areEqual(this.pornstars, video.pornstars) && this.addedOn == video.addedOn && Intrinsics.areEqual(this.encodings, video.encodings) && this.projectionType == video.projectionType && this.vrStereoSrc == video.vrStereoSrc && this.vrStereoType == video.vrStereoType && this.isPaidToDownload == video.isPaidToDownload && Intrinsics.areEqual(this.trackUrl, video.trackUrl) && Intrinsics.areEqual(this.description, video.description) && Intrinsics.areEqual(this.urlVideo, video.urlVideo)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long getAddedOn() {
        return this.addedOn;
    }

    public final String getCategories() {
        return this.categories;
    }

    public final String getDescription() {
        return this.description;
    }

    public final VideoEncodings getEncodings() {
        return this.encodings;
    }

    public final List<PerformerMetaData> getPornstars() {
        return this.pornstars;
    }

    public final String getProduction() {
        return this.production;
    }

    public final int getProjectionType() {
        return this.projectionType;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTrackUrl() {
        return this.trackUrl;
    }

    public final String getUrlVideo() {
        return this.urlVideo;
    }

    public final UserMetaData getUserMetaData() {
        return this.userMetaData;
    }

    public final VideoMetaData getVideoMetaData() {
        return this.videoMetaData;
    }

    public final boolean getVrStereoSrc() {
        return this.vrStereoSrc;
    }

    public final int getVrStereoType() {
        return this.vrStereoType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.pornstars, a1.a.b(this.production, a.b(this.tags, a1.a.b(this.categories, (this.userMetaData.hashCode() + (this.videoMetaData.hashCode() * 31)) * 31, 31), 31), 31), 31);
        long j10 = this.addedOn;
        int hashCode = (((this.encodings.hashCode() + ((b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31) + this.projectionType) * 31;
        boolean z10 = this.vrStereoSrc;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (((hashCode + i10) * 31) + this.vrStereoType) * 31;
        boolean z11 = this.isPaidToDownload;
        return this.urlVideo.hashCode() + a1.a.b(this.description, a1.a.b(this.trackUrl, (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31), 31);
    }

    public final boolean isPaidToDownload() {
        boolean z10 = this.isPaidToDownload;
        return false;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setUrlVideo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.urlVideo = str;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Video(videoMetaData=");
        m10.append(this.videoMetaData);
        m10.append(", userMetaData=");
        m10.append(this.userMetaData);
        m10.append(", categories=");
        m10.append(this.categories);
        m10.append(", tags=");
        m10.append(this.tags);
        m10.append(", production=");
        m10.append(this.production);
        m10.append(", pornstars=");
        m10.append(this.pornstars);
        m10.append(", addedOn=");
        m10.append(this.addedOn);
        m10.append(", encodings=");
        m10.append(this.encodings);
        m10.append(", projectionType=");
        m10.append(this.projectionType);
        m10.append(", vrStereoSrc=");
        m10.append(this.vrStereoSrc);
        m10.append(", vrStereoType=");
        m10.append(this.vrStereoType);
        m10.append(", isPaidToDownload=");
        m10.append(this.isPaidToDownload);
        m10.append(", trackUrl=");
        m10.append(this.trackUrl);
        m10.append(", description=");
        m10.append(this.description);
        m10.append(", urlVideo=");
        return b.l(m10, this.urlVideo, ')');
    }
}
