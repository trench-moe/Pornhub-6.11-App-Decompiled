package com.app.pornhub.data.model.dvds;

import android.support.v4.media.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.config.SectionedPagesConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/dvds/DvdResponse;", BuildConfig.FLAVOR, SectionedPagesConfig.TYPE_DVD, "Lcom/app/pornhub/data/model/dvds/DvdModel;", SearchSuggestionsConfig.sourceVideos, BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Lcom/app/pornhub/data/model/dvds/DvdModel;Ljava/util/List;Lcom/app/pornhub/data/model/ErrorModel;)V", "getDvd", "()Lcom/app/pornhub/data/model/dvds/DvdModel;", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getVideos", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DvdResponse {
    private final DvdModel dvd;
    private final ErrorModel error;
    private final List<VideoModel> videos;

    public DvdResponse(DvdModel dvd, List<VideoModel> videos, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(dvd, "dvd");
        Intrinsics.checkNotNullParameter(videos, "videos");
        this.dvd = dvd;
        this.videos = videos;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DvdResponse copy$default(DvdResponse dvdResponse, DvdModel dvdModel, List list, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dvdModel = dvdResponse.dvd;
        }
        if ((i10 & 2) != 0) {
            list = dvdResponse.videos;
        }
        if ((i10 & 4) != 0) {
            errorModel = dvdResponse.error;
        }
        return dvdResponse.copy(dvdModel, list, errorModel);
    }

    public final DvdModel component1() {
        return this.dvd;
    }

    public final List<VideoModel> component2() {
        return this.videos;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final DvdResponse copy(DvdModel dvd, List<VideoModel> videos, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(dvd, "dvd");
        Intrinsics.checkNotNullParameter(videos, "videos");
        return new DvdResponse(dvd, videos, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DvdResponse) {
            DvdResponse dvdResponse = (DvdResponse) obj;
            return Intrinsics.areEqual(this.dvd, dvdResponse.dvd) && Intrinsics.areEqual(this.videos, dvdResponse.videos) && Intrinsics.areEqual(this.error, dvdResponse.error);
        }
        return false;
    }

    public final DvdModel getDvd() {
        return this.dvd;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final List<VideoModel> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        int b10 = a.b(this.videos, this.dvd.hashCode() * 31, 31);
        ErrorModel errorModel = this.error;
        return b10 + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("DvdResponse(dvd=");
        m10.append(this.dvd);
        m10.append(", videos=");
        m10.append(this.videos);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
