package com.app.pornhub.data.model.gifs;

import a1.a;
import com.app.pornhub.data.model.ErrorModel;
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

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/gifs/GifListResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/gifs/GifListResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/gifs/GifModel;", "listOfGifModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class GifListResponseJsonAdapter extends f<GifListResponse> {
    private final f<Integer> intAdapter;
    private final f<List<GifModel>> listOfGifModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public GifListResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(SearchSuggestionsConfig.sourceGifs, "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"gifs\", \"count\", \"error\")");
        this.options = a10;
        this.listOfGifModelAdapter = a.e(moshi, jd.k.e(List.class, GifModel.class), SearchSuggestionsConfig.sourceGifs, "moshi.adapter(Types.newP…emptySet(),\n      \"gifs\")");
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
    public com.app.pornhub.data.model.gifs.GifListResponse fromJson(com.squareup.moshi.JsonReader r9) {
        /*
            r8 = this;
            java.lang.String r7 = "reader"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r9.c()
            r7 = 4
            r7 = 0
            r0 = r7
            r1 = r0
            r2 = r1
        L10:
            boolean r7 = r9.h()
            r3 = r7
            java.lang.String r4 = "count"
            java.lang.String r7 = "gifs"
            r5 = r7
            if (r3 == 0) goto L7d
            com.squareup.moshi.JsonReader$a r3 = r8.options
            r7 = 5
            int r7 = r9.F(r3)
            r3 = r7
            r6 = -1
            if (r3 == r6) goto L74
            if (r3 == 0) goto L59
            r5 = 1
            r7 = 6
            if (r3 == r5) goto L3e
            r7 = 1
            r7 = 2
            r4 = r7
            if (r3 == r4) goto L33
            goto L10
        L33:
            r7 = 6
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r8.nullableErrorModelAdapter
            java.lang.Object r2 = r2.fromJson(r9)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            r7 = 3
            goto L10
        L3e:
            r7 = 3
            com.squareup.moshi.f<java.lang.Integer> r1 = r8.intAdapter
            r7 = 3
            java.lang.Object r1 = r1.fromJson(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L4c
            r7 = 4
            goto L10
        L4c:
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r4, r4, r9)
            r9 = r7
            java.lang.String r0 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 5
            throw r9
            r7 = 3
        L59:
            r7 = 5
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.gifs.GifModel>> r0 = r8.listOfGifModelAdapter
            java.lang.Object r0 = r0.fromJson(r9)
            java.util.List r0 = (java.util.List) r0
            r7 = 5
            if (r0 == 0) goto L66
            goto L10
        L66:
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r5, r5, r9)
            r9 = r7
            java.lang.String r7 = "unexpectedNull(\"gifs\",\n            \"gifs\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 7
            throw r9
            r7 = 5
        L74:
            r9.P()
            r7 = 7
            r9.S()
            r7 = 6
            goto L10
        L7d:
            r7 = 4
            r9.e()
            r7 = 3
            com.app.pornhub.data.model.gifs.GifListResponse r3 = new com.app.pornhub.data.model.gifs.GifListResponse
            if (r0 == 0) goto L9f
            r7 = 7
            if (r1 == 0) goto L92
            int r9 = r1.intValue()
            r3.<init>(r0, r9, r2)
            r7 = 6
            return r3
        L92:
            com.squareup.moshi.JsonDataException r7 = kd.c.h(r4, r4, r9)
            r9 = r7
            java.lang.String r0 = "missingProperty(\"count\", \"count\", reader)"
            r7 = 2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 5
        L9f:
            r7 = 6
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r5, r5, r9)
            java.lang.String r0 = "missingProperty(\"gifs\", \"gifs\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.gifs.GifListResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.gifs.GifListResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, GifListResponse gifListResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(gifListResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(SearchSuggestionsConfig.sourceGifs);
        this.listOfGifModelAdapter.toJson(writer, (j) gifListResponse.getGifs());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(gifListResponse.getCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) gifListResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(GifListResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(GifListResponse)";
    }
}
