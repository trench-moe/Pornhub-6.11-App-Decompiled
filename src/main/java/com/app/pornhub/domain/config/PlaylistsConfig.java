package com.app.pornhub.domain.config;

import com.app.pornhub.domain.model.playlist.Playlist;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/domain/config/PlaylistsConfig;", BuildConfig.FLAVOR, "()V", "Companion", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaylistsConfig {
    public static final Companion Companion = new Companion(null);
    public static final int PLAYLIST_VIDEOS_LIMIT = 8;
    public static final String TYPE_FAVORITE = "favorite";
    public static final String TYPE_PLAYLIST = "playlist";
    public static final String TYPE_PRIVATE = "private";
    public static final String TYPE_PUBLIC = "public";
    public static final String TYPE_WATCH_LATER = "watchlater";

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/domain/config/PlaylistsConfig$Companion;", BuildConfig.FLAVOR, "()V", "PLAYLIST_VIDEOS_LIMIT", BuildConfig.FLAVOR, "TYPE_FAVORITE", BuildConfig.FLAVOR, "TYPE_PLAYLIST", "TYPE_PRIVATE", "TYPE_PUBLIC", "TYPE_WATCH_LATER", "hasMorePlaylistVideos", BuildConfig.FLAVOR, "size", "isPrivate", PlaylistsConfig.TYPE_PLAYLIST, "Lcom/app/pornhub/domain/model/playlist/Playlist;", "isPublic", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasMorePlaylistVideos(int i10) {
            return i10 % 8 == 0;
        }

        public final boolean isPrivate(Playlist playlist) {
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            return Intrinsics.areEqual(playlist.getStatus(), PlaylistsConfig.TYPE_PRIVATE);
        }

        public final boolean isPublic(Playlist playlist) {
            Intrinsics.checkNotNullParameter(playlist, "playlist");
            return Intrinsics.areEqual(playlist.getStatus(), PlaylistsConfig.TYPE_PUBLIC);
        }
    }
}
