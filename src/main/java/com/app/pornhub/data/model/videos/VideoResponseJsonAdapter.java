package com.app.pornhub.data.model.videos;

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

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/videos/VideoResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/videos/VideoResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/videos/VideoModel;", "videoModelAdapter", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class VideoResponseJsonAdapter extends f<VideoResponse> {
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;
    private final f<VideoModel> videoModelAdapter;

    public VideoResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("video", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"video\", \"error\")");
        this.options = a10;
        this.videoModelAdapter = a.d(moshi, VideoModel.class, "video", "moshi.adapter(VideoModel…     emptySet(), \"video\")");
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
    public com.app.pornhub.data.model.videos.VideoResponse fromJson(com.squareup.moshi.JsonReader r10) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r8 = 4
            r10.c()
            r8 = 4
            r0 = 0
            r1 = r0
        Le:
            boolean r5 = r10.h()
            r2 = r5
            java.lang.String r3 = "video"
            r6 = 5
            if (r2 == 0) goto L57
            r6 = 5
            com.squareup.moshi.JsonReader$a r2 = r9.options
            int r2 = r10.F(r2)
            r4 = -1
            if (r2 == r4) goto L4e
            if (r2 == 0) goto L34
            r3 = 1
            if (r2 == r3) goto L28
            goto Le
        L28:
            r6 = 7
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r1 = r9.nullableErrorModelAdapter
            r6 = 7
            java.lang.Object r5 = r1.fromJson(r10)
            r1 = r5
            com.app.pornhub.data.model.ErrorModel r1 = (com.app.pornhub.data.model.ErrorModel) r1
            goto Le
        L34:
            com.squareup.moshi.f<com.app.pornhub.data.model.videos.VideoModel> r0 = r9.videoModelAdapter
            java.lang.Object r5 = r0.fromJson(r10)
            r0 = r5
            com.app.pornhub.data.model.videos.VideoModel r0 = (com.app.pornhub.data.model.videos.VideoModel) r0
            if (r0 == 0) goto L41
            r7 = 7
            goto Le
        L41:
            r7 = 3
            com.squareup.moshi.JsonDataException r10 = kd.c.n(r3, r3, r10)
            java.lang.String r5 = "unexpectedNull(\"video\",\n…         \"video\", reader)"
            r0 = r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            throw r10
            r8 = 5
        L4e:
            r8 = 6
            r10.P()
            r10.S()
            r6 = 6
            goto Le
        L57:
            r10.e()
            r7 = 5
            com.app.pornhub.data.model.videos.VideoResponse r2 = new com.app.pornhub.data.model.videos.VideoResponse
            if (r0 == 0) goto L63
            r2.<init>(r0, r1)
            return r2
        L63:
            r6 = 2
            com.squareup.moshi.JsonDataException r5 = kd.c.h(r3, r3, r10)
            r10 = r5
            java.lang.String r0 = "missingProperty(\"video\", \"video\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r6 = 2
            throw r10
            r6 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.videos.VideoResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.videos.VideoResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, VideoResponse videoResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(videoResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("video");
        this.videoModelAdapter.toJson(writer, (j) videoResponse.getVideo());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) videoResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(VideoResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(VideoResponse)";
    }
}
