package com.app.pornhub.data.model.dvds;

import android.support.v4.media.a;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.config.SectionedPagesConfig;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/dvds/DvdResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/dvds/DvdResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/dvds/DvdModel;", "dvdModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "listOfVideoModelAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DvdResponseJsonAdapter extends f<DvdResponse> {
    private final f<DvdModel> dvdModelAdapter;
    private final f<List<VideoModel>> listOfVideoModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public DvdResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(SectionedPagesConfig.TYPE_DVD, SearchSuggestionsConfig.sourceVideos, "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"dvd\", \"videos\", \"error\")");
        this.options = a10;
        this.dvdModelAdapter = a.d(moshi, DvdModel.class, SectionedPagesConfig.TYPE_DVD, "moshi.adapter(DvdModel::…\n      emptySet(), \"dvd\")");
        this.listOfVideoModelAdapter = a1.a.e(moshi, jd.k.e(List.class, VideoModel.class), SearchSuggestionsConfig.sourceVideos, "moshi.adapter(Types.newP…    emptySet(), \"videos\")");
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
    public com.app.pornhub.data.model.dvds.DvdResponse fromJson(com.squareup.moshi.JsonReader r11) {
        /*
            r10 = this;
            r7 = r10
            java.lang.String r0 = "reader"
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r9 = 7
            r11.c()
            r9 = 6
            r9 = 0
            r0 = r9
            r1 = r0
            r2 = r1
        L11:
            boolean r3 = r11.h()
            java.lang.String r4 = "videos"
            r9 = 4
            java.lang.String r5 = "dvd"
            r9 = 3
            if (r3 == 0) goto L7c
            com.squareup.moshi.JsonReader$a r3 = r7.options
            r9 = 6
            int r9 = r11.F(r3)
            r3 = r9
            r9 = -1
            r6 = r9
            if (r3 == r6) goto L74
            if (r3 == 0) goto L56
            r5 = 1
            if (r3 == r5) goto L3d
            r9 = 2
            r4 = r9
            if (r3 == r4) goto L33
            goto L11
        L33:
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r7.nullableErrorModelAdapter
            java.lang.Object r2 = r2.fromJson(r11)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            r9 = 5
            goto L11
        L3d:
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.videos.VideoModel>> r1 = r7.listOfVideoModelAdapter
            r9 = 3
            java.lang.Object r1 = r1.fromJson(r11)
            java.util.List r1 = (java.util.List) r1
            r9 = 3
            if (r1 == 0) goto L4a
            goto L11
        L4a:
            com.squareup.moshi.JsonDataException r11 = kd.c.n(r4, r4, r11)
            java.lang.String r9 = "unexpectedNull(\"videos\", \"videos\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 6
        L56:
            r9 = 5
            com.squareup.moshi.f<com.app.pornhub.data.model.dvds.DvdModel> r0 = r7.dvdModelAdapter
            r9 = 7
            java.lang.Object r9 = r0.fromJson(r11)
            r0 = r9
            com.app.pornhub.data.model.dvds.DvdModel r0 = (com.app.pornhub.data.model.dvds.DvdModel) r0
            r9 = 2
            if (r0 == 0) goto L66
            r9 = 2
            goto L11
        L66:
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r5, r5, r11)
            r11 = r9
            java.lang.String r9 = "unexpectedNull(\"dvd\", \"dvd\",\n            reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r9 = 7
            throw r11
            r9 = 4
        L74:
            r11.P()
            r11.S()
            r9 = 7
            goto L11
        L7c:
            r9 = 4
            r11.e()
            r9 = 1
            com.app.pornhub.data.model.dvds.DvdResponse r3 = new com.app.pornhub.data.model.dvds.DvdResponse
            r9 = 4
            if (r0 == 0) goto L98
            if (r1 == 0) goto L8c
            r3.<init>(r0, r1, r2)
            return r3
        L8c:
            r9 = 6
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r4, r4, r11)
            r11 = r9
            java.lang.String r0 = "missingProperty(\"videos\", \"videos\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
        L98:
            r9 = 7
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r5, r5, r11)
            r11 = r9
            java.lang.String r9 = "missingProperty(\"dvd\", \"dvd\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r9 = 6
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.dvds.DvdResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.dvds.DvdResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, DvdResponse dvdResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(dvdResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(SectionedPagesConfig.TYPE_DVD);
        this.dvdModelAdapter.toJson(writer, (j) dvdResponse.getDvd());
        writer.i(SearchSuggestionsConfig.sourceVideos);
        this.listOfVideoModelAdapter.toJson(writer, (j) dvdResponse.getVideos());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) dvdResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(DvdResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(DvdResponse)";
    }
}
