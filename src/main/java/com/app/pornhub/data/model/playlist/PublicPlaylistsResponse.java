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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PublicPlaylistsResponse;", BuildConfig.FLAVOR, "publicPlayLists", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/playlist/PlaylistModel;", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;Lcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getPublicPlayLists", "()Ljava/util/List;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PublicPlaylistsResponse {
    private final ErrorModel error;
    private final List<PlaylistModel> publicPlayLists;

    public PublicPlaylistsResponse(List<PlaylistModel> publicPlayLists, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(publicPlayLists, "publicPlayLists");
        this.publicPlayLists = publicPlayLists;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublicPlaylistsResponse copy$default(PublicPlaylistsResponse publicPlaylistsResponse, List list, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = publicPlaylistsResponse.publicPlayLists;
        }
        if ((i10 & 2) != 0) {
            errorModel = publicPlaylistsResponse.error;
        }
        return publicPlaylistsResponse.copy(list, errorModel);
    }

    public final List<PlaylistModel> component1() {
        return this.publicPlayLists;
    }

    public final ErrorModel component2() {
        return this.error;
    }

    public final PublicPlaylistsResponse copy(List<PlaylistModel> publicPlayLists, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(publicPlayLists, "publicPlayLists");
        return new PublicPlaylistsResponse(publicPlayLists, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PublicPlaylistsResponse) {
            PublicPlaylistsResponse publicPlaylistsResponse = (PublicPlaylistsResponse) obj;
            if (Intrinsics.areEqual(this.publicPlayLists, publicPlaylistsResponse.publicPlayLists) && Intrinsics.areEqual(this.error, publicPlaylistsResponse.error)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final List<PlaylistModel> getPublicPlayLists() {
        return this.publicPlayLists;
    }

    public int hashCode() {
        int hashCode = this.publicPlayLists.hashCode() * 31;
        ErrorModel errorModel = this.error;
        return hashCode + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("PublicPlaylistsResponse(publicPlayLists=");
        m10.append(this.publicPlayLists);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
