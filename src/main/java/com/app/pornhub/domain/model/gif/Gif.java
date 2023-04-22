package com.app.pornhub.domain.model.gif;

import a1.a;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\u0002\u0010\u001dJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\u000fHÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0007HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u001aHÆ\u0003J\u0015\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001cHÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\t\u0010D\u001a\u00020\u0007HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\nHÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003JÙ\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001cHÆ\u0001J\u0013\u0010L\u001a\u00020\u000f2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\nHÖ\u0001J\t\u0010P\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001c¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0012\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u00104R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u00104¨\u0006Q"}, d2 = {"Lcom/app/pornhub/domain/model/gif/Gif;", "Ljava/io/Serializable;", "gifMetaData", "Lcom/app/pornhub/domain/model/gif/GifMetaData;", "postedOn", BuildConfig.FLAVOR, "mediaUrl", BuildConfig.FLAVOR, "fallbackMediaUrl", "views", BuildConfig.FLAVOR, "voteUp", "voteDown", "votePercent", "hasVideo", BuildConfig.FLAVOR, "older", "newer", "isFavorite", "fromVkey", "fromVideoTitle", "categories", "tags", BuildConfig.FLAVOR, "pornStar", "userMetaData", "Lcom/app/pornhub/domain/model/user/UserMetaData;", "flagTypes", BuildConfig.FLAVOR, "(Lcom/app/pornhub/domain/model/gif/GifMetaData;JLjava/lang/String;Ljava/lang/String;IIIIZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/app/pornhub/domain/model/user/UserMetaData;Ljava/util/Map;)V", "getCategories", "()Ljava/lang/String;", "getFallbackMediaUrl", "getFlagTypes", "()Ljava/util/Map;", "getFromVideoTitle", "getFromVkey", "getGifMetaData", "()Lcom/app/pornhub/domain/model/gif/GifMetaData;", "getHasVideo", "()Z", "getMediaUrl", "getNewer", "getOlder", "getPornStar", "getPostedOn", "()J", "getTags", "()Ljava/util/List;", "getUserMetaData", "()Lcom/app/pornhub/domain/model/user/UserMetaData;", "getViews", "()I", "getVoteDown", "getVotePercent", "getVoteUp", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Gif implements Serializable {
    private final String categories;
    private final String fallbackMediaUrl;
    private final Map<String, String> flagTypes;
    private final String fromVideoTitle;
    private final String fromVkey;
    private final GifMetaData gifMetaData;
    private final boolean hasVideo;
    private final boolean isFavorite;
    private final String mediaUrl;
    private final String newer;
    private final String older;
    private final String pornStar;
    private final long postedOn;
    private final List<String> tags;
    private final UserMetaData userMetaData;
    private final int views;
    private final int voteDown;
    private final int votePercent;
    private final int voteUp;

    public Gif(GifMetaData gifMetaData, long j10, String mediaUrl, String fallbackMediaUrl, int i10, int i11, int i12, int i13, boolean z10, String older, String newer, boolean z11, String fromVkey, String fromVideoTitle, String categories, List<String> tags, String pornStar, UserMetaData userMetaData, Map<String, String> flagTypes) {
        Intrinsics.checkNotNullParameter(gifMetaData, "gifMetaData");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(fallbackMediaUrl, "fallbackMediaUrl");
        Intrinsics.checkNotNullParameter(older, "older");
        Intrinsics.checkNotNullParameter(newer, "newer");
        Intrinsics.checkNotNullParameter(fromVkey, "fromVkey");
        Intrinsics.checkNotNullParameter(fromVideoTitle, "fromVideoTitle");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(pornStar, "pornStar");
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        Intrinsics.checkNotNullParameter(flagTypes, "flagTypes");
        this.gifMetaData = gifMetaData;
        this.postedOn = j10;
        this.mediaUrl = mediaUrl;
        this.fallbackMediaUrl = fallbackMediaUrl;
        this.views = i10;
        this.voteUp = i11;
        this.voteDown = i12;
        this.votePercent = i13;
        this.hasVideo = z10;
        this.older = older;
        this.newer = newer;
        this.isFavorite = z11;
        this.fromVkey = fromVkey;
        this.fromVideoTitle = fromVideoTitle;
        this.categories = categories;
        this.tags = tags;
        this.pornStar = pornStar;
        this.userMetaData = userMetaData;
        this.flagTypes = flagTypes;
    }

    public final GifMetaData component1() {
        return this.gifMetaData;
    }

    public final String component10() {
        return this.older;
    }

    public final String component11() {
        return this.newer;
    }

    public final boolean component12() {
        return this.isFavorite;
    }

    public final String component13() {
        return this.fromVkey;
    }

    public final String component14() {
        return this.fromVideoTitle;
    }

    public final String component15() {
        return this.categories;
    }

    public final List<String> component16() {
        return this.tags;
    }

    public final String component17() {
        return this.pornStar;
    }

    public final UserMetaData component18() {
        return this.userMetaData;
    }

    public final Map<String, String> component19() {
        return this.flagTypes;
    }

    public final long component2() {
        return this.postedOn;
    }

    public final String component3() {
        return this.mediaUrl;
    }

    public final String component4() {
        return this.fallbackMediaUrl;
    }

    public final int component5() {
        return this.views;
    }

    public final int component6() {
        return this.voteUp;
    }

    public final int component7() {
        return this.voteDown;
    }

    public final int component8() {
        return this.votePercent;
    }

    public final boolean component9() {
        return this.hasVideo;
    }

    public final Gif copy(GifMetaData gifMetaData, long j10, String mediaUrl, String fallbackMediaUrl, int i10, int i11, int i12, int i13, boolean z10, String older, String newer, boolean z11, String fromVkey, String fromVideoTitle, String categories, List<String> tags, String pornStar, UserMetaData userMetaData, Map<String, String> flagTypes) {
        Intrinsics.checkNotNullParameter(gifMetaData, "gifMetaData");
        Intrinsics.checkNotNullParameter(mediaUrl, "mediaUrl");
        Intrinsics.checkNotNullParameter(fallbackMediaUrl, "fallbackMediaUrl");
        Intrinsics.checkNotNullParameter(older, "older");
        Intrinsics.checkNotNullParameter(newer, "newer");
        Intrinsics.checkNotNullParameter(fromVkey, "fromVkey");
        Intrinsics.checkNotNullParameter(fromVideoTitle, "fromVideoTitle");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(pornStar, "pornStar");
        Intrinsics.checkNotNullParameter(userMetaData, "userMetaData");
        Intrinsics.checkNotNullParameter(flagTypes, "flagTypes");
        return new Gif(gifMetaData, j10, mediaUrl, fallbackMediaUrl, i10, i11, i12, i13, z10, older, newer, z11, fromVkey, fromVideoTitle, categories, tags, pornStar, userMetaData, flagTypes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Gif) {
            Gif gif = (Gif) obj;
            return Intrinsics.areEqual(this.gifMetaData, gif.gifMetaData) && this.postedOn == gif.postedOn && Intrinsics.areEqual(this.mediaUrl, gif.mediaUrl) && Intrinsics.areEqual(this.fallbackMediaUrl, gif.fallbackMediaUrl) && this.views == gif.views && this.voteUp == gif.voteUp && this.voteDown == gif.voteDown && this.votePercent == gif.votePercent && this.hasVideo == gif.hasVideo && Intrinsics.areEqual(this.older, gif.older) && Intrinsics.areEqual(this.newer, gif.newer) && this.isFavorite == gif.isFavorite && Intrinsics.areEqual(this.fromVkey, gif.fromVkey) && Intrinsics.areEqual(this.fromVideoTitle, gif.fromVideoTitle) && Intrinsics.areEqual(this.categories, gif.categories) && Intrinsics.areEqual(this.tags, gif.tags) && Intrinsics.areEqual(this.pornStar, gif.pornStar) && Intrinsics.areEqual(this.userMetaData, gif.userMetaData) && Intrinsics.areEqual(this.flagTypes, gif.flagTypes);
        }
        return false;
    }

    public final String getCategories() {
        return this.categories;
    }

    public final String getFallbackMediaUrl() {
        return this.fallbackMediaUrl;
    }

    public final Map<String, String> getFlagTypes() {
        return this.flagTypes;
    }

    public final String getFromVideoTitle() {
        return this.fromVideoTitle;
    }

    public final String getFromVkey() {
        return this.fromVkey;
    }

    public final GifMetaData getGifMetaData() {
        return this.gifMetaData;
    }

    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final String getNewer() {
        return this.newer;
    }

    public final String getOlder() {
        return this.older;
    }

    public final String getPornStar() {
        return this.pornStar;
    }

    public final long getPostedOn() {
        return this.postedOn;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final UserMetaData getUserMetaData() {
        return this.userMetaData;
    }

    public final int getViews() {
        return this.views;
    }

    public final int getVoteDown() {
        return this.voteDown;
    }

    public final int getVotePercent() {
        return this.votePercent;
    }

    public final int getVoteUp() {
        return this.voteUp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        long j10 = this.postedOn;
        int b10 = (((((((a.b(this.fallbackMediaUrl, a.b(this.mediaUrl, ((this.gifMetaData.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31) + this.views) * 31) + this.voteUp) * 31) + this.voteDown) * 31) + this.votePercent) * 31;
        boolean z10 = this.hasVideo;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int b11 = a.b(this.newer, a.b(this.older, (b10 + i11) * 31, 31), 31);
        boolean z11 = this.isFavorite;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        return this.flagTypes.hashCode() + ((this.userMetaData.hashCode() + a.b(this.pornStar, android.support.v4.media.a.b(this.tags, a.b(this.categories, a.b(this.fromVideoTitle, a.b(this.fromVkey, (b11 + i10) * 31, 31), 31), 31), 31), 31)) * 31);
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public String toString() {
        StringBuilder m10 = a.m("Gif(gifMetaData=");
        m10.append(this.gifMetaData);
        m10.append(", postedOn=");
        m10.append(this.postedOn);
        m10.append(", mediaUrl=");
        m10.append(this.mediaUrl);
        m10.append(", fallbackMediaUrl=");
        m10.append(this.fallbackMediaUrl);
        m10.append(", views=");
        m10.append(this.views);
        m10.append(", voteUp=");
        m10.append(this.voteUp);
        m10.append(", voteDown=");
        m10.append(this.voteDown);
        m10.append(", votePercent=");
        m10.append(this.votePercent);
        m10.append(", hasVideo=");
        m10.append(this.hasVideo);
        m10.append(", older=");
        m10.append(this.older);
        m10.append(", newer=");
        m10.append(this.newer);
        m10.append(", isFavorite=");
        m10.append(this.isFavorite);
        m10.append(", fromVkey=");
        m10.append(this.fromVkey);
        m10.append(", fromVideoTitle=");
        m10.append(this.fromVideoTitle);
        m10.append(", categories=");
        m10.append(this.categories);
        m10.append(", tags=");
        m10.append(this.tags);
        m10.append(", pornStar=");
        m10.append(this.pornStar);
        m10.append(", userMetaData=");
        m10.append(this.userMetaData);
        m10.append(", flagTypes=");
        m10.append(this.flagTypes);
        m10.append(')');
        return m10.toString();
    }
}
