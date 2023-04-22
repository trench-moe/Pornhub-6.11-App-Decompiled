package com.app.pornhub.domain.model.playlist;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/domain/model/playlist/PlaylistsOverview;", BuildConfig.FLAVOR, "publicPlayLists", BuildConfig.FLAVOR, "Lcom/app/pornhub/domain/model/playlist/Playlist;", "privatePlayLists", "favoritePlayLists", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getFavoritePlayLists", "()Ljava/util/List;", "getPrivatePlayLists", "getPublicPlayLists", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistsOverview {
    private final List<Playlist> favoritePlayLists;
    private final List<Playlist> privatePlayLists;
    private final List<Playlist> publicPlayLists;

    public PlaylistsOverview(List<Playlist> publicPlayLists, List<Playlist> privatePlayLists, List<Playlist> favoritePlayLists) {
        Intrinsics.checkNotNullParameter(publicPlayLists, "publicPlayLists");
        Intrinsics.checkNotNullParameter(privatePlayLists, "privatePlayLists");
        Intrinsics.checkNotNullParameter(favoritePlayLists, "favoritePlayLists");
        this.publicPlayLists = publicPlayLists;
        this.privatePlayLists = privatePlayLists;
        this.favoritePlayLists = favoritePlayLists;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaylistsOverview copy$default(PlaylistsOverview playlistsOverview, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = playlistsOverview.publicPlayLists;
        }
        if ((i10 & 2) != 0) {
            list2 = playlistsOverview.privatePlayLists;
        }
        if ((i10 & 4) != 0) {
            list3 = playlistsOverview.favoritePlayLists;
        }
        return playlistsOverview.copy(list, list2, list3);
    }

    public final List<Playlist> component1() {
        return this.publicPlayLists;
    }

    public final List<Playlist> component2() {
        return this.privatePlayLists;
    }

    public final List<Playlist> component3() {
        return this.favoritePlayLists;
    }

    public final PlaylistsOverview copy(List<Playlist> publicPlayLists, List<Playlist> privatePlayLists, List<Playlist> favoritePlayLists) {
        Intrinsics.checkNotNullParameter(publicPlayLists, "publicPlayLists");
        Intrinsics.checkNotNullParameter(privatePlayLists, "privatePlayLists");
        Intrinsics.checkNotNullParameter(favoritePlayLists, "favoritePlayLists");
        return new PlaylistsOverview(publicPlayLists, privatePlayLists, favoritePlayLists);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlaylistsOverview) {
            PlaylistsOverview playlistsOverview = (PlaylistsOverview) obj;
            if (Intrinsics.areEqual(this.publicPlayLists, playlistsOverview.publicPlayLists) && Intrinsics.areEqual(this.privatePlayLists, playlistsOverview.privatePlayLists) && Intrinsics.areEqual(this.favoritePlayLists, playlistsOverview.favoritePlayLists)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final List<Playlist> getFavoritePlayLists() {
        return this.favoritePlayLists;
    }

    public final List<Playlist> getPrivatePlayLists() {
        return this.privatePlayLists;
    }

    public final List<Playlist> getPublicPlayLists() {
        return this.publicPlayLists;
    }

    public int hashCode() {
        return this.favoritePlayLists.hashCode() + a.b(this.privatePlayLists, this.publicPlayLists.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PlaylistsOverview(publicPlayLists=");
        m10.append(this.publicPlayLists);
        m10.append(", privatePlayLists=");
        m10.append(this.privatePlayLists);
        m10.append(", favoritePlayLists=");
        return a.k(m10, this.favoritePlayLists, ')');
    }
}
