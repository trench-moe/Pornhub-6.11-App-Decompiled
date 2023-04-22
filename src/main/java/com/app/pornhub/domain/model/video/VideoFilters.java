package com.app.pornhub.domain.model.video;

import a1.a;
import android.support.v4.media.b;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0006\u0010\u001a\u001a\u00020\u0000J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020\u001fHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\""}, d2 = {"Lcom/app/pornhub/domain/model/video/VideoFilters;", BuildConfig.FLAVOR, SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "quality", "production", "duration", ExploreModel.CATEGORY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getDuration", "setDuration", "getProduction", "setProduction", "getQuality", "setQuality", "getVideos", "setVideos", "component1", "component2", "component3", "component4", "component5", "copy", "equals", BuildConfig.FLAVOR, "other", "getFiltersCount", BuildConfig.FLAVOR, "hashCode", "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoFilters {
    private String category;
    private String duration;
    private String production;
    private String quality;
    private String videos;

    public VideoFilters() {
        this(null, null, null, null, null, 31, null);
    }

    public VideoFilters(String videos, String quality, String production, String duration, String category) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(category, "category");
        this.videos = videos;
        this.quality = quality;
        this.production = production;
        this.duration = duration;
        this.category = category;
    }

    public /* synthetic */ VideoFilters(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? BuildConfig.FLAVOR : str, (i10 & 2) != 0 ? BuildConfig.FLAVOR : str2, (i10 & 4) != 0 ? BuildConfig.FLAVOR : str3, (i10 & 8) != 0 ? BuildConfig.FLAVOR : str4, (i10 & 16) != 0 ? BuildConfig.FLAVOR : str5);
    }

    public static /* synthetic */ VideoFilters copy$default(VideoFilters videoFilters, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = videoFilters.videos;
        }
        if ((i10 & 2) != 0) {
            str2 = videoFilters.quality;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = videoFilters.production;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = videoFilters.duration;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = videoFilters.category;
        }
        return videoFilters.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.videos;
    }

    public final String component2() {
        return this.quality;
    }

    public final String component3() {
        return this.production;
    }

    public final String component4() {
        return this.duration;
    }

    public final String component5() {
        return this.category;
    }

    public final VideoFilters copy() {
        return new VideoFilters(this.videos, this.quality, this.production, this.duration, this.category);
    }

    public final VideoFilters copy(String videos, String quality, String production, String duration, String category) {
        Intrinsics.checkNotNullParameter(videos, "videos");
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(production, "production");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(category, "category");
        return new VideoFilters(videos, quality, production, duration, category);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoFilters) {
            VideoFilters videoFilters = (VideoFilters) obj;
            return Intrinsics.areEqual(this.videos, videoFilters.videos) && Intrinsics.areEqual(this.quality, videoFilters.quality) && Intrinsics.areEqual(this.production, videoFilters.production) && Intrinsics.areEqual(this.duration, videoFilters.duration) && Intrinsics.areEqual(this.category, videoFilters.category);
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final int getFiltersCount() {
        int i10 = this.videos.length() > 0 ? 1 : 0;
        if (this.quality.length() > 0) {
            i10++;
        }
        if (this.production.length() > 0) {
            i10++;
        }
        if (this.duration.length() > 0) {
            i10++;
        }
        return this.category.length() > 0 ? i10 + 1 : i10;
    }

    public final String getProduction() {
        return this.production;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return this.category.hashCode() + a.b(this.duration, a.b(this.production, a.b(this.quality, this.videos.hashCode() * 31, 31), 31), 31);
    }

    public final void setCategory(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.category = str;
    }

    public final void setDuration(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.duration = str;
    }

    public final void setProduction(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.production = str;
    }

    public final void setQuality(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.quality = str;
    }

    public final void setVideos(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videos = str;
    }

    public String toString() {
        StringBuilder m10 = a.m("VideoFilters(videos=");
        m10.append(this.videos);
        m10.append(", quality=");
        m10.append(this.quality);
        m10.append(", production=");
        m10.append(this.production);
        m10.append(", duration=");
        m10.append(this.duration);
        m10.append(", category=");
        return b.l(m10, this.category, ')');
    }
}
