package com.app.pornhub.data.model.photo;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/data/model/photo/AlbumResponse;", BuildConfig.FLAVOR, "albumPhotos", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/photo/PhotoModel;", "count", BuildConfig.FLAVOR, "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;Ljava/lang/String;Lcom/app/pornhub/data/model/ErrorModel;)V", "getAlbumPhotos", "()Ljava/util/List;", "getCount", "()Ljava/lang/String;", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlbumResponse {
    private final List<PhotoModel> albumPhotos;
    private final String count;
    private final ErrorModel error;

    public AlbumResponse(List<PhotoModel> albumPhotos, String count, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(albumPhotos, "albumPhotos");
        Intrinsics.checkNotNullParameter(count, "count");
        this.albumPhotos = albumPhotos;
        this.count = count;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AlbumResponse copy$default(AlbumResponse albumResponse, List list, String str, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = albumResponse.albumPhotos;
        }
        if ((i10 & 2) != 0) {
            str = albumResponse.count;
        }
        if ((i10 & 4) != 0) {
            errorModel = albumResponse.error;
        }
        return albumResponse.copy(list, str, errorModel);
    }

    public final List<PhotoModel> component1() {
        return this.albumPhotos;
    }

    public final String component2() {
        return this.count;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final AlbumResponse copy(List<PhotoModel> albumPhotos, String count, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(albumPhotos, "albumPhotos");
        Intrinsics.checkNotNullParameter(count, "count");
        return new AlbumResponse(albumPhotos, count, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlbumResponse) {
            AlbumResponse albumResponse = (AlbumResponse) obj;
            return Intrinsics.areEqual(this.albumPhotos, albumResponse.albumPhotos) && Intrinsics.areEqual(this.count, albumResponse.count) && Intrinsics.areEqual(this.error, albumResponse.error);
        }
        return false;
    }

    public final List<PhotoModel> getAlbumPhotos() {
        return this.albumPhotos;
    }

    public final String getCount() {
        return this.count;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public int hashCode() {
        int b10 = a.b(this.count, this.albumPhotos.hashCode() * 31, 31);
        ErrorModel errorModel = this.error;
        return b10 + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("AlbumResponse(albumPhotos=");
        m10.append(this.albumPhotos);
        m10.append(", count=");
        m10.append(this.count);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
