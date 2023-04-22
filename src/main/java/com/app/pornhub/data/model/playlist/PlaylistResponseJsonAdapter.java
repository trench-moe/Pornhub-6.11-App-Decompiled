package com.app.pornhub.data.model.playlist;

import android.support.v4.media.a;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/playlist/PlaylistResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/playlist/PlaylistModel;", "playlistModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "nullableListOfVideoModelAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PlaylistResponseJsonAdapter extends f<PlaylistResponse> {
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final f<List<VideoModel>> nullableListOfVideoModelAdapter;
    private final JsonReader.a options;
    private final f<PlaylistModel> playlistModelAdapter;

    public PlaylistResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(PlaylistsConfig.TYPE_PLAYLIST, SearchSuggestionsConfig.sourceVideos, "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"playlist\", \"videos\", \"error\")");
        this.options = a10;
        this.playlistModelAdapter = a.d(moshi, PlaylistModel.class, PlaylistsConfig.TYPE_PLAYLIST, "moshi.adapter(PlaylistMo…, emptySet(), \"playlist\")");
        this.nullableListOfVideoModelAdapter = a1.a.e(moshi, jd.k.e(List.class, VideoModel.class), SearchSuggestionsConfig.sourceVideos, "moshi.adapter(Types.newP…    emptySet(), \"videos\")");
        this.nullableErrorModelAdapter = a.d(moshi, ErrorModel.class, "error", "moshi.adapter(ErrorModel…ava, emptySet(), \"error\")");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public com.app.pornhub.data.model.playlist.PlaylistResponse fromJson(com.squareup.moshi.JsonReader r8) {
        /*
            r7 = this;
            java.lang.String r6 = "reader"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r8.c()
            r6 = 4
            r0 = 0
            r6 = 3
            r1 = r0
            r2 = r1
        L10:
            boolean r3 = r8.h()
            java.lang.String r6 = "playlist"
            r4 = r6
            if (r3 == 0) goto L67
            r6 = 2
            com.squareup.moshi.JsonReader$a r3 = r7.options
            r6 = 5
            int r6 = r8.F(r3)
            r3 = r6
            r6 = -1
            r5 = r6
            if (r3 == r5) goto L5f
            r6 = 5
            if (r3 == 0) goto L45
            r4 = 1
            if (r3 == r4) goto L3b
            r6 = 4
            r4 = 2
            r6 = 6
            if (r3 == r4) goto L32
            goto L10
        L32:
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r7.nullableErrorModelAdapter
            java.lang.Object r2 = r2.fromJson(r8)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            goto L10
        L3b:
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.videos.VideoModel>> r1 = r7.nullableListOfVideoModelAdapter
            r6 = 6
            java.lang.Object r1 = r1.fromJson(r8)
            java.util.List r1 = (java.util.List) r1
            goto L10
        L45:
            r6 = 3
            com.squareup.moshi.f<com.app.pornhub.data.model.playlist.PlaylistModel> r0 = r7.playlistModelAdapter
            r6 = 4
            java.lang.Object r0 = r0.fromJson(r8)
            com.app.pornhub.data.model.playlist.PlaylistModel r0 = (com.app.pornhub.data.model.playlist.PlaylistModel) r0
            if (r0 == 0) goto L53
            r6 = 6
            goto L10
        L53:
            r6 = 7
            com.squareup.moshi.JsonDataException r8 = kd.c.n(r4, r4, r8)
            java.lang.String r0 = "unexpectedNull(\"playlist\", \"playlist\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            throw r8
            r6 = 6
        L5f:
            r8.P()
            r8.S()
            r6 = 6
            goto L10
        L67:
            r6 = 4
            r8.e()
            com.app.pornhub.data.model.playlist.PlaylistResponse r3 = new com.app.pornhub.data.model.playlist.PlaylistResponse
            if (r0 == 0) goto L74
            r6 = 1
            r3.<init>(r0, r1, r2)
            return r3
        L74:
            r6 = 3
            com.squareup.moshi.JsonDataException r8 = kd.c.h(r4, r4, r8)
            java.lang.String r6 = "missingProperty(\"playlist\", \"playlist\", reader)"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            r6 = 3
            throw r8
            r6 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.playlist.PlaylistResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.playlist.PlaylistResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PlaylistResponse playlistResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(playlistResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(PlaylistsConfig.TYPE_PLAYLIST);
        this.playlistModelAdapter.toJson(writer, (j) playlistResponse.getPlaylist());
        writer.i(SearchSuggestionsConfig.sourceVideos);
        this.nullableListOfVideoModelAdapter.toJson(writer, (j) playlistResponse.getVideos());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) playlistResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PlaylistResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PlaylistResponse)";
    }
}
