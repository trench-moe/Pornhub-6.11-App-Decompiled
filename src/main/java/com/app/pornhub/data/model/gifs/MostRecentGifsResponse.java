package com.app.pornhub.data.model.gifs;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/gifs/MostRecentGifsResponse;", BuildConfig.FLAVOR, "relatedGifs", "Lcom/app/pornhub/data/model/gifs/MostRecentGifsModel;", "count", BuildConfig.FLAVOR, "errorModel", "Lcom/app/pornhub/data/model/ErrorModel;", "(Lcom/app/pornhub/data/model/gifs/MostRecentGifsModel;ILcom/app/pornhub/data/model/ErrorModel;)V", "getCount", "()I", "getErrorModel", "()Lcom/app/pornhub/data/model/ErrorModel;", "getRelatedGifs", "()Lcom/app/pornhub/data/model/gifs/MostRecentGifsModel;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MostRecentGifsResponse {
    private final int count;
    private final ErrorModel errorModel;
    private final MostRecentGifsModel relatedGifs;

    public MostRecentGifsResponse(MostRecentGifsModel relatedGifs, int i10, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(relatedGifs, "relatedGifs");
        this.relatedGifs = relatedGifs;
        this.count = i10;
        this.errorModel = errorModel;
    }

    public static /* synthetic */ MostRecentGifsResponse copy$default(MostRecentGifsResponse mostRecentGifsResponse, MostRecentGifsModel mostRecentGifsModel, int i10, ErrorModel errorModel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mostRecentGifsModel = mostRecentGifsResponse.relatedGifs;
        }
        if ((i11 & 2) != 0) {
            i10 = mostRecentGifsResponse.count;
        }
        if ((i11 & 4) != 0) {
            errorModel = mostRecentGifsResponse.errorModel;
        }
        return mostRecentGifsResponse.copy(mostRecentGifsModel, i10, errorModel);
    }

    public final MostRecentGifsModel component1() {
        return this.relatedGifs;
    }

    public final int component2() {
        return this.count;
    }

    public final ErrorModel component3() {
        return this.errorModel;
    }

    public final MostRecentGifsResponse copy(MostRecentGifsModel relatedGifs, int i10, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(relatedGifs, "relatedGifs");
        return new MostRecentGifsResponse(relatedGifs, i10, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MostRecentGifsResponse) {
            MostRecentGifsResponse mostRecentGifsResponse = (MostRecentGifsResponse) obj;
            return Intrinsics.areEqual(this.relatedGifs, mostRecentGifsResponse.relatedGifs) && this.count == mostRecentGifsResponse.count && Intrinsics.areEqual(this.errorModel, mostRecentGifsResponse.errorModel);
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public final ErrorModel getErrorModel() {
        return this.errorModel;
    }

    public final MostRecentGifsModel getRelatedGifs() {
        return this.relatedGifs;
    }

    public int hashCode() {
        int hashCode = ((this.relatedGifs.hashCode() * 31) + this.count) * 31;
        ErrorModel errorModel = this.errorModel;
        return hashCode + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("MostRecentGifsResponse(relatedGifs=");
        m10.append(this.relatedGifs);
        m10.append(", count=");
        m10.append(this.count);
        m10.append(", errorModel=");
        return b.k(m10, this.errorModel, ')');
    }
}
