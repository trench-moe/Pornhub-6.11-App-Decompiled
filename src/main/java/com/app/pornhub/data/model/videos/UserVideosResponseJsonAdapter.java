package com.app.pornhub.data.model.videos;

import a1.a;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/videos/UserVideosResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/videos/UserVideosResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "listOfVideoModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UserVideosResponseJsonAdapter extends f<UserVideosResponse> {
    private final f<Integer> intAdapter;
    private final f<List<VideoModel>> listOfVideoModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public UserVideosResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("userVideos", "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"userVideos\", \"count\", \"error\")");
        this.options = a10;
        this.listOfVideoModelAdapter = a.e(moshi, jd.k.e(List.class, VideoModel.class), "userVideos", "moshi.adapter(Types.newP…emptySet(), \"userVideos\")");
        this.intAdapter = android.support.v4.media.a.d(moshi, Integer.TYPE, "count", "moshi.adapter(Int::class…ava, emptySet(), \"count\")");
        this.nullableErrorModelAdapter = android.support.v4.media.a.d(moshi, ErrorModel.class, "error", "moshi.adapter(ErrorModel…ava, emptySet(), \"error\")");
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
    public com.app.pornhub.data.model.videos.UserVideosResponse fromJson(com.squareup.moshi.JsonReader r10) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r10.c()
            r0 = 0
            r8 = 1
            r1 = r0
            r2 = r1
        Le:
            boolean r3 = r10.h()
            java.lang.String r7 = "count"
            r4 = r7
            java.lang.String r5 = "userVideos"
            r8 = 5
            if (r3 == 0) goto L79
            r8 = 6
            com.squareup.moshi.JsonReader$a r3 = r9.options
            r8 = 4
            int r7 = r10.F(r3)
            r3 = r7
            r6 = -1
            r8 = 3
            if (r3 == r6) goto L6f
            r8 = 2
            if (r3 == 0) goto L55
            r5 = 1
            if (r3 == r5) goto L3c
            r8 = 5
            r4 = 2
            if (r3 == r4) goto L32
            goto Le
        L32:
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r9.nullableErrorModelAdapter
            java.lang.Object r2 = r2.fromJson(r10)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            r8 = 7
            goto Le
        L3c:
            r8 = 3
            com.squareup.moshi.f<java.lang.Integer> r1 = r9.intAdapter
            java.lang.Object r7 = r1.fromJson(r10)
            r1 = r7
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L49
            goto Le
        L49:
            com.squareup.moshi.JsonDataException r10 = kd.c.n(r4, r4, r10)
            java.lang.String r0 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r8 = 3
            throw r10
            r8 = 1
        L55:
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.videos.VideoModel>> r0 = r9.listOfVideoModelAdapter
            java.lang.Object r0 = r0.fromJson(r10)
            java.util.List r0 = (java.util.List) r0
            r8 = 1
            if (r0 == 0) goto L62
            r8 = 5
            goto Le
        L62:
            r8 = 2
            com.squareup.moshi.JsonDataException r10 = kd.c.n(r5, r5, r10)
            java.lang.String r0 = "unexpectedNull(\"userVideos\", \"userVideos\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r8 = 3
            throw r10
            r8 = 2
        L6f:
            r8 = 6
            r10.P()
            r8 = 2
            r10.S()
            r8 = 6
            goto Le
        L79:
            r10.e()
            com.app.pornhub.data.model.videos.UserVideosResponse r3 = new com.app.pornhub.data.model.videos.UserVideosResponse
            if (r0 == 0) goto L9a
            r8 = 5
            if (r1 == 0) goto L8c
            int r7 = r1.intValue()
            r10 = r7
            r3.<init>(r0, r10, r2)
            return r3
        L8c:
            r8 = 3
            com.squareup.moshi.JsonDataException r10 = kd.c.h(r4, r4, r10)
            java.lang.String r7 = "missingProperty(\"count\", \"count\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r8 = 2
            throw r10
            r8 = 5
        L9a:
            r8 = 1
            com.squareup.moshi.JsonDataException r10 = kd.c.h(r5, r5, r10)
            java.lang.String r7 = "missingProperty(\"userVid…s\", \"userVideos\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            throw r10
            r8 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.videos.UserVideosResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.videos.UserVideosResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, UserVideosResponse userVideosResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(userVideosResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("userVideos");
        this.listOfVideoModelAdapter.toJson(writer, (j) userVideosResponse.getUserVideos());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(userVideosResponse.getCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) userVideosResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(UserVideosResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UserVideosResponse)";
    }
}
