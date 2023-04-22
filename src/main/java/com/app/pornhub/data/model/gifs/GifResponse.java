package com.app.pornhub.data.model.gifs;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/gifs/GifResponse;", BuildConfig.FLAVOR, ExploreModel.GIF, "Lcom/app/pornhub/data/model/gifs/GifModel;", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Lcom/app/pornhub/data/model/gifs/GifModel;Lcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getGif", "()Lcom/app/pornhub/data/model/gifs/GifModel;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GifResponse {
    private final ErrorModel error;
    private final GifModel gif;

    public GifResponse(GifModel gif, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(gif, "gif");
        this.gif = gif;
        this.error = errorModel;
    }

    public static /* synthetic */ GifResponse copy$default(GifResponse gifResponse, GifModel gifModel, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gifModel = gifResponse.gif;
        }
        if ((i10 & 2) != 0) {
            errorModel = gifResponse.error;
        }
        return gifResponse.copy(gifModel, errorModel);
    }

    public final GifModel component1() {
        return this.gif;
    }

    public final ErrorModel component2() {
        return this.error;
    }

    public final GifResponse copy(GifModel gif, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(gif, "gif");
        return new GifResponse(gif, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GifResponse) {
            GifResponse gifResponse = (GifResponse) obj;
            return Intrinsics.areEqual(this.gif, gifResponse.gif) && Intrinsics.areEqual(this.error, gifResponse.error);
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final GifModel getGif() {
        return this.gif;
    }

    public int hashCode() {
        int hashCode = this.gif.hashCode() * 31;
        ErrorModel errorModel = this.error;
        return hashCode + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("GifResponse(gif=");
        m10.append(this.gif);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
