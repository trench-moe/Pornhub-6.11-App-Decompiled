package com.app.pornhub.data.model.playlist;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/playlist/FavoritePlaylistsResponse;", BuildConfig.FLAVOR, "favoritePlayLists", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/playlist/PlaylistModel;", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;Lcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getFavoritePlayLists", "()Ljava/util/List;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FavoritePlaylistsResponse {
    private final ErrorModel error;
    private final List<PlaylistModel> favoritePlayLists;

    public FavoritePlaylistsResponse(List<PlaylistModel> favoritePlayLists, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(favoritePlayLists, "favoritePlayLists");
        this.favoritePlayLists = favoritePlayLists;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoritePlaylistsResponse copy$default(FavoritePlaylistsResponse favoritePlaylistsResponse, List list, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = favoritePlaylistsResponse.favoritePlayLists;
        }
        if ((i10 & 2) != 0) {
            errorModel = favoritePlaylistsResponse.error;
        }
        return favoritePlaylistsResponse.copy(list, errorModel);
    }

    public final List<PlaylistModel> component1() {
        return this.favoritePlayLists;
    }

    public final ErrorModel component2() {
        return this.error;
    }

    public final FavoritePlaylistsResponse copy(List<PlaylistModel> favoritePlayLists, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(favoritePlayLists, "favoritePlayLists");
        return new FavoritePlaylistsResponse(favoritePlayLists, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FavoritePlaylistsResponse) {
            FavoritePlaylistsResponse favoritePlaylistsResponse = (FavoritePlaylistsResponse) obj;
            return Intrinsics.areEqual(this.favoritePlayLists, favoritePlaylistsResponse.favoritePlayLists) && Intrinsics.areEqual(this.error, favoritePlaylistsResponse.error);
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final List<PlaylistModel> getFavoritePlayLists() {
        return this.favoritePlayLists;
    }

    public int hashCode() {
        int hashCode = this.favoritePlayLists.hashCode() * 31;
        ErrorModel errorModel = this.error;
        return hashCode + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("FavoritePlaylistsResponse(favoritePlayLists=");
        m10.append(this.favoritePlayLists);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
