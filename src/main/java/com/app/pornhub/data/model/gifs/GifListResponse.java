package com.app.pornhub.data.model.gifs;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/data/model/gifs/GifListResponse;", BuildConfig.FLAVOR, SearchSuggestionsConfig.sourceGifs, BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/gifs/GifModel;", "count", BuildConfig.FLAVOR, "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;ILcom/app/pornhub/data/model/ErrorModel;)V", "getCount", "()I", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getGifs", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GifListResponse {
    private final int count;
    private final ErrorModel error;
    private final List<GifModel> gifs;

    public GifListResponse(List<GifModel> gifs, int i10, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(gifs, "gifs");
        this.gifs = gifs;
        this.count = i10;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GifListResponse copy$default(GifListResponse gifListResponse, List list, int i10, ErrorModel errorModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = gifListResponse.gifs;
        }
        if ((i11 & 2) != 0) {
            i10 = gifListResponse.count;
        }
        if ((i11 & 4) != 0) {
            errorModel = gifListResponse.error;
        }
        return gifListResponse.copy(list, i10, errorModel);
    }

    public final List<GifModel> component1() {
        return this.gifs;
    }

    public final int component2() {
        return this.count;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final GifListResponse copy(List<GifModel> gifs, int i10, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(gifs, "gifs");
        return new GifListResponse(gifs, i10, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GifListResponse) {
            GifListResponse gifListResponse = (GifListResponse) obj;
            return Intrinsics.areEqual(this.gifs, gifListResponse.gifs) && this.count == gifListResponse.count && Intrinsics.areEqual(this.error, gifListResponse.error);
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final List<GifModel> getGifs() {
        return this.gifs;
    }

    public int hashCode() {
        int hashCode = ((this.gifs.hashCode() * 31) + this.count) * 31;
        ErrorModel errorModel = this.error;
        return hashCode + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("GifListResponse(gifs=");
        m10.append(this.gifs);
        m10.append(", count=");
        m10.append(this.count);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
