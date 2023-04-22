package com.app.pornhub.data.model.photo;

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

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/photo/AlbumResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/photo/AlbumResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/photo/PhotoModel;", "listOfPhotoModelAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AlbumResponseJsonAdapter extends f<AlbumResponse> {
    private final f<List<PhotoModel>> listOfPhotoModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public AlbumResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("albumPhotos", "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"albumPhotos\", \"count\", \"error\")");
        this.options = a10;
        this.listOfPhotoModelAdapter = a.e(moshi, jd.k.e(List.class, PhotoModel.class), "albumPhotos", "moshi.adapter(Types.newP…mptySet(), \"albumPhotos\")");
        this.stringAdapter = android.support.v4.media.a.d(moshi, String.class, "count", "moshi.adapter(String::cl…mptySet(),\n      \"count\")");
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
    public com.app.pornhub.data.model.photo.AlbumResponse fromJson(com.squareup.moshi.JsonReader r9) {
        /*
            r8 = this;
            java.lang.String r0 = "reader"
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r9.c()
            r0 = 0
            r1 = r0
            r2 = r1
        Ld:
            boolean r3 = r9.h()
            java.lang.String r7 = "count"
            r4 = r7
            java.lang.String r7 = "albumPhotos"
            r5 = r7
            if (r3 == 0) goto L78
            com.squareup.moshi.JsonReader$a r3 = r8.options
            r7 = 2
            int r3 = r9.F(r3)
            r7 = -1
            r6 = r7
            if (r3 == r6) goto L6f
            r7 = 7
            if (r3 == 0) goto L53
            r7 = 4
            r7 = 1
            r5 = r7
            if (r3 == r5) goto L3b
            r4 = 2
            r7 = 3
            if (r3 == r4) goto L31
            goto Ld
        L31:
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r8.nullableErrorModelAdapter
            r7 = 7
            java.lang.Object r2 = r2.fromJson(r9)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            goto Ld
        L3b:
            com.squareup.moshi.f<java.lang.String> r1 = r8.stringAdapter
            r7 = 3
            java.lang.Object r7 = r1.fromJson(r9)
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L48
            goto Ld
        L48:
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r4, r4, r9)
            r9 = r7
            java.lang.String r0 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
        L53:
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.photo.PhotoModel>> r0 = r8.listOfPhotoModelAdapter
            r7 = 3
            java.lang.Object r0 = r0.fromJson(r9)
            java.util.List r0 = (java.util.List) r0
            r7 = 3
            if (r0 == 0) goto L61
            r7 = 4
            goto Ld
        L61:
            r7 = 1
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r5, r5, r9)
            r9 = r7
            java.lang.String r0 = "unexpectedNull(\"albumPho…\", \"albumPhotos\", reader)"
            r7 = 2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 7
            throw r9
        L6f:
            r7 = 2
            r9.P()
            r7 = 7
            r9.S()
            goto Ld
        L78:
            r7 = 3
            r9.e()
            com.app.pornhub.data.model.photo.AlbumResponse r3 = new com.app.pornhub.data.model.photo.AlbumResponse
            r7 = 4
            if (r0 == 0) goto L95
            if (r1 == 0) goto L88
            r7 = 4
            r3.<init>(r0, r1, r2)
            return r3
        L88:
            r7 = 7
            com.squareup.moshi.JsonDataException r7 = kd.c.h(r4, r4, r9)
            r9 = r7
            java.lang.String r0 = "missingProperty(\"count\", \"count\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 1
        L95:
            r7 = 1
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r5, r5, r9)
            java.lang.String r0 = "missingProperty(\"albumPh…tos\",\n            reader)"
            r7 = 3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.photo.AlbumResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.photo.AlbumResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, AlbumResponse albumResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(albumResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("albumPhotos");
        this.listOfPhotoModelAdapter.toJson(writer, (j) albumResponse.getAlbumPhotos());
        writer.i("count");
        this.stringAdapter.toJson(writer, (j) albumResponse.getCount());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) albumResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(AlbumResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AlbumResponse)";
    }
}
