package com.app.pornhub.data.model.playlist;

import android.support.v4.media.a;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistActionResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/playlist/PlaylistActionResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "booleanAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PlaylistActionResponseJsonAdapter extends f<PlaylistActionResponse> {
    private final f<Boolean> booleanAdapter;
    private final f<Integer> intAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public PlaylistActionResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("result", "videosCount", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"result\", \"videosCount\", \"error\")");
        this.options = a10;
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "result", "moshi.adapter(Boolean::c…ptySet(),\n      \"result\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "videosCount", "moshi.adapter(Int::class…t(),\n      \"videosCount\")");
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
    public com.app.pornhub.data.model.playlist.PlaylistActionResponse fromJson(com.squareup.moshi.JsonReader r10) {
        /*
            r9 = this;
            java.lang.String r7 = "reader"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r10.c()
            r8 = 7
            r7 = 0
            r0 = r7
            r1 = r0
            r2 = r1
        L10:
            boolean r3 = r10.h()
            java.lang.String r4 = "videosCount"
            java.lang.String r7 = "result"
            r5 = r7
            if (r3 == 0) goto L7d
            r8 = 5
            com.squareup.moshi.JsonReader$a r3 = r9.options
            int r7 = r10.F(r3)
            r3 = r7
            r6 = -1
            r8 = 3
            if (r3 == r6) goto L73
            if (r3 == 0) goto L5a
            r7 = 1
            r5 = r7
            if (r3 == r5) goto L3f
            r8 = 5
            r7 = 2
            r4 = r7
            if (r3 == r4) goto L33
            goto L10
        L33:
            r8 = 2
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r9.nullableErrorModelAdapter
            r8 = 1
            java.lang.Object r2 = r2.fromJson(r10)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            r8 = 6
            goto L10
        L3f:
            r8 = 4
            com.squareup.moshi.f<java.lang.Integer> r1 = r9.intAdapter
            java.lang.Object r7 = r1.fromJson(r10)
            r1 = r7
            java.lang.Integer r1 = (java.lang.Integer) r1
            r8 = 3
            if (r1 == 0) goto L4d
            goto L10
        L4d:
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r4, r4, r10)
            r10 = r7
            java.lang.String r0 = "unexpectedNull(\"videosCo…   \"videosCount\", reader)"
            r8 = 4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r8 = 6
            throw r10
        L5a:
            r8 = 2
            com.squareup.moshi.f<java.lang.Boolean> r0 = r9.booleanAdapter
            java.lang.Object r7 = r0.fromJson(r10)
            r0 = r7
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L67
            goto L10
        L67:
            r8 = 3
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r5, r5, r10)
            r10 = r7
            java.lang.String r0 = "unexpectedNull(\"result\",…        \"result\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            throw r10
        L73:
            r8 = 4
            r10.P()
            r8 = 1
            r10.S()
            r8 = 6
            goto L10
        L7d:
            r10.e()
            r8 = 4
            com.app.pornhub.data.model.playlist.PlaylistActionResponse r3 = new com.app.pornhub.data.model.playlist.PlaylistActionResponse
            if (r0 == 0) goto La0
            boolean r0 = r0.booleanValue()
            if (r1 == 0) goto L95
            r8 = 3
            int r10 = r1.intValue()
            r3.<init>(r0, r10, r2)
            r8 = 3
            return r3
        L95:
            com.squareup.moshi.JsonDataException r10 = kd.c.h(r4, r4, r10)
            java.lang.String r0 = "missingProperty(\"videosC…unt\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            throw r10
            r8 = 1
        La0:
            com.squareup.moshi.JsonDataException r7 = kd.c.h(r5, r5, r10)
            r10 = r7
            java.lang.String r0 = "missingProperty(\"result\", \"result\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r8 = 1
            throw r10
            r8 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.playlist.PlaylistActionResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.playlist.PlaylistActionResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PlaylistActionResponse playlistActionResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(playlistActionResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("result");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(playlistActionResponse.getResult()));
        writer.i("videosCount");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(playlistActionResponse.getVideosCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) playlistActionResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PlaylistActionResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PlaylistActionResponse)";
    }
}
