package com.app.pornhub.data.model.gifs;

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

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/gifs/MostRecentGifsResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/gifs/MostRecentGifsResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/gifs/MostRecentGifsModel;", "mostRecentGifsModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MostRecentGifsResponseJsonAdapter extends f<MostRecentGifsResponse> {
    private final f<Integer> intAdapter;
    private final f<MostRecentGifsModel> mostRecentGifsModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public MostRecentGifsResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("relatedGifs", "count", "errorModel");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"relatedGifs\", \"count\",\n      \"errorModel\")");
        this.options = a10;
        this.mostRecentGifsModelAdapter = a.d(moshi, MostRecentGifsModel.class, "relatedGifs", "moshi.adapter(MostRecent…mptySet(), \"relatedGifs\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "count", "moshi.adapter(Int::class…ava, emptySet(), \"count\")");
        this.nullableErrorModelAdapter = a.d(moshi, ErrorModel.class, "errorModel", "moshi.adapter(ErrorModel…emptySet(), \"errorModel\")");
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
    public com.app.pornhub.data.model.gifs.MostRecentGifsResponse fromJson(com.squareup.moshi.JsonReader r9) {
        /*
            r8 = this;
            java.lang.String r0 = "reader"
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r7 = 7
            r9.c()
            r7 = 2
            r7 = 0
            r0 = r7
            r1 = r0
            r2 = r1
        L10:
            boolean r3 = r9.h()
            java.lang.String r7 = "count"
            r4 = r7
            java.lang.String r5 = "relatedGifs"
            if (r3 == 0) goto L7c
            com.squareup.moshi.JsonReader$a r3 = r8.options
            int r3 = r9.F(r3)
            r7 = -1
            r6 = r7
            if (r3 == r6) goto L73
            r7 = 2
            if (r3 == 0) goto L56
            r7 = 6
            r7 = 1
            r5 = r7
            if (r3 == r5) goto L3d
            r7 = 2
            r4 = r7
            if (r3 == r4) goto L33
            r7 = 3
            goto L10
        L33:
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r8.nullableErrorModelAdapter
            java.lang.Object r2 = r2.fromJson(r9)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            r7 = 5
            goto L10
        L3d:
            com.squareup.moshi.f<java.lang.Integer> r1 = r8.intAdapter
            java.lang.Object r1 = r1.fromJson(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L49
            r7 = 6
            goto L10
        L49:
            r7 = 6
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r4, r4, r9)
            r9 = r7
            java.lang.String r0 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 2
        L56:
            r7 = 5
            com.squareup.moshi.f<com.app.pornhub.data.model.gifs.MostRecentGifsModel> r0 = r8.mostRecentGifsModelAdapter
            java.lang.Object r7 = r0.fromJson(r9)
            r0 = r7
            com.app.pornhub.data.model.gifs.MostRecentGifsModel r0 = (com.app.pornhub.data.model.gifs.MostRecentGifsModel) r0
            r7 = 2
            if (r0 == 0) goto L65
            r7 = 5
            goto L10
        L65:
            r7 = 2
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r5, r5, r9)
            java.lang.String r7 = "unexpectedNull(\"relatedG…\", \"relatedGifs\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 1
            throw r9
            r7 = 1
        L73:
            r9.P()
            r7 = 4
            r9.S()
            r7 = 4
            goto L10
        L7c:
            r9.e()
            com.app.pornhub.data.model.gifs.MostRecentGifsResponse r3 = new com.app.pornhub.data.model.gifs.MostRecentGifsResponse
            r7 = 5
            if (r0 == 0) goto L9e
            r7 = 7
            if (r1 == 0) goto L91
            r7 = 2
            int r7 = r1.intValue()
            r9 = r7
            r3.<init>(r0, r9, r2)
            return r3
        L91:
            r7 = 2
            com.squareup.moshi.JsonDataException r7 = kd.c.h(r4, r4, r9)
            r9 = r7
            java.lang.String r0 = "missingProperty(\"count\", \"count\", reader)"
            r7 = 1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
        L9e:
            r7 = 4
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r5, r5, r9)
            java.lang.String r7 = "missingProperty(\"related…ifs\",\n            reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.gifs.MostRecentGifsResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.gifs.MostRecentGifsResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, MostRecentGifsResponse mostRecentGifsResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(mostRecentGifsResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("relatedGifs");
        this.mostRecentGifsModelAdapter.toJson(writer, (j) mostRecentGifsResponse.getRelatedGifs());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(mostRecentGifsResponse.getCount()));
        writer.i("errorModel");
        this.nullableErrorModelAdapter.toJson(writer, (j) mostRecentGifsResponse.getErrorModel());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(MostRecentGifsResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(MostRecentGifsResponse)";
    }
}
