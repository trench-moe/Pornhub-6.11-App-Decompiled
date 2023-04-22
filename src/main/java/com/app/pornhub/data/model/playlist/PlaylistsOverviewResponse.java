package com.app.pornhub.data.model.playlist;

import android.support.v4.media.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistsOverviewResponse;", BuildConfig.FLAVOR, "publicPlayLists", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/playlist/PlaylistModel;", "privatePlayLists", "favoritePlayLists", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/app/pornhub/data/model/ErrorModel;)V", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getFavoritePlayLists", "()Ljava/util/List;", "getPrivatePlayLists", "getPublicPlayLists", "component1", "component2", "component3", "component4", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistsOverviewResponse {
    private final ErrorModel error;
    private final List<PlaylistModel> favoritePlayLists;
    private final List<PlaylistModel> privatePlayLists;
    private final List<PlaylistModel> publicPlayLists;

    public PlaylistsOverviewResponse(List<PlaylistModel> publicPlayLists, List<PlaylistModel> privatePlayLists, List<PlaylistModel> favoritePlayLists, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(publicPlayLists, "publicPlayLists");
        Intrinsics.checkNotNullParameter(privatePlayLists, "privatePlayLists");
        Intrinsics.checkNotNullParameter(favoritePlayLists, "favoritePlayLists");
        this.publicPlayLists = publicPlayLists;
        this.privatePlayLists = privatePlayLists;
        this.favoritePlayLists = favoritePlayLists;
        this.error = errorModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaylistsOverviewResponse copy$default(PlaylistsOverviewResponse playlistsOverviewResponse, List list, List list2, List list3, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = playlistsOverviewResponse.publicPlayLists;
        }
        if ((i10 & 2) != 0) {
            list2 = playlistsOverviewResponse.privatePlayLists;
        }
        if ((i10 & 4) != 0) {
            list3 = playlistsOverviewResponse.favoritePlayLists;
        }
        if ((i10 & 8) != 0) {
            errorModel = playlistsOverviewResponse.error;
        }
        return playlistsOverviewResponse.copy(list, list2, list3, errorModel);
    }

    public final List<PlaylistModel> component1() {
        return this.publicPlayLists;
    }

    public final List<PlaylistModel> component2() {
        return this.privatePlayLists;
    }

    public final List<PlaylistModel> component3() {
        return this.favoritePlayLists;
    }

    public final ErrorModel component4() {
        return this.error;
    }

    public final PlaylistsOverviewResponse copy(List<PlaylistModel> publicPlayLists, List<PlaylistModel> privatePlayLists, List<PlaylistModel> favoritePlayLists, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(publicPlayLists, "publicPlayLists");
        Intrinsics.checkNotNullParameter(privatePlayLists, "privatePlayLists");
        Intrinsics.checkNotNullParameter(favoritePlayLists, "favoritePlayLists");
        return new PlaylistsOverviewResponse(publicPlayLists, privatePlayLists, favoritePlayLists, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaylistsOverviewResponse) {
            PlaylistsOverviewResponse playlistsOverviewResponse = (PlaylistsOverviewResponse) obj;
            return Intrinsics.areEqual(this.publicPlayLists, playlistsOverviewResponse.publicPlayLists) && Intrinsics.areEqual(this.privatePlayLists, playlistsOverviewResponse.privatePlayLists) && Intrinsics.areEqual(this.favoritePlayLists, playlistsOverviewResponse.favoritePlayLists) && Intrinsics.areEqual(this.error, playlistsOverviewResponse.error);
        }
        return false;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final List<PlaylistModel> getFavoritePlayLists() {
        return this.favoritePlayLists;
    }

    public final List<PlaylistModel> getPrivatePlayLists() {
        return this.privatePlayLists;
    }

    public final List<PlaylistModel> getPublicPlayLists() {
        return this.publicPlayLists;
    }

    public int hashCode() {
        int b10 = a.b(this.favoritePlayLists, a.b(this.privatePlayLists, this.publicPlayLists.hashCode() * 31, 31), 31);
        ErrorModel errorModel = this.error;
        return b10 + (errorModel == null ? 0 : errorModel.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PlaylistsOverviewResponse(publicPlayLists=");
        m10.append(this.publicPlayLists);
        m10.append(", privatePlayLists=");
        m10.append(this.privatePlayLists);
        m10.append(", favoritePlayLists=");
        m10.append(this.favoritePlayLists);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
