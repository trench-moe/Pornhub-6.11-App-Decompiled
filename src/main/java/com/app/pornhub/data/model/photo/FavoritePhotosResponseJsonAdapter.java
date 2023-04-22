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

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/photo/FavoritePhotosResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/photo/FavoritePhotosResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/photo/PhotoModel;", "listOfPhotoModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FavoritePhotosResponseJsonAdapter extends f<FavoritePhotosResponse> {
    private final f<Integer> intAdapter;
    private final f<List<PhotoModel>> listOfPhotoModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public FavoritePhotosResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("userFavoritePhotos", "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"userFavoritePhotos\", \"count\",\n      \"error\")");
        this.options = a10;
        this.listOfPhotoModelAdapter = a.e(moshi, jd.k.e(List.class, PhotoModel.class), "userFavoritePhotos", "moshi.adapter(Types.newP…(), \"userFavoritePhotos\")");
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
    public com.app.pornhub.data.model.photo.FavoritePhotosResponse fromJson(com.squareup.moshi.JsonReader r12) {
        /*
            r11 = this;
            r7 = r11
            java.lang.String r9 = "reader"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r12.c()
            r10 = 2
            r0 = 0
            r1 = r0
            r2 = r1
        L10:
            boolean r3 = r12.h()
            java.lang.String r10 = "count"
            r4 = r10
            java.lang.String r5 = "userFavoritePhotos"
            r10 = 6
            if (r3 == 0) goto L7d
            com.squareup.moshi.JsonReader$a r3 = r7.options
            r10 = 6
            int r3 = r12.F(r3)
            r6 = -1
            r10 = 6
            if (r3 == r6) goto L76
            r10 = 6
            if (r3 == 0) goto L5c
            r10 = 6
            r5 = 1
            r10 = 4
            if (r3 == r5) goto L42
            r9 = 5
            r4 = 2
            r10 = 1
            if (r3 == r4) goto L36
            r10 = 5
            goto L10
        L36:
            r9 = 3
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r7.nullableErrorModelAdapter
            r10 = 7
            java.lang.Object r10 = r2.fromJson(r12)
            r2 = r10
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            goto L10
        L42:
            com.squareup.moshi.f<java.lang.Integer> r1 = r7.intAdapter
            r9 = 5
            java.lang.Object r9 = r1.fromJson(r12)
            r1 = r9
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L50
            r9 = 6
            goto L10
        L50:
            com.squareup.moshi.JsonDataException r10 = kd.c.n(r4, r4, r12)
            r12 = r10
            java.lang.String r0 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
            r10 = 1
        L5c:
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.photo.PhotoModel>> r0 = r7.listOfPhotoModelAdapter
            java.lang.Object r9 = r0.fromJson(r12)
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L69
            r9 = 6
            goto L10
        L69:
            r9 = 2
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r5, r5, r12)
            r12 = r9
            java.lang.String r10 = "unexpectedNull(\"userFavo…rFavoritePhotos\", reader)"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
        L76:
            r12.P()
            r12.S()
            goto L10
        L7d:
            r12.e()
            r10 = 3
            com.app.pornhub.data.model.photo.FavoritePhotosResponse r3 = new com.app.pornhub.data.model.photo.FavoritePhotosResponse
            r10 = 1
            if (r0 == 0) goto L9e
            if (r1 == 0) goto L92
            r9 = 4
            int r10 = r1.intValue()
            r12 = r10
            r3.<init>(r0, r12, r2)
            return r3
        L92:
            com.squareup.moshi.JsonDataException r10 = kd.c.h(r4, r4, r12)
            r12 = r10
            java.lang.String r0 = "missingProperty(\"count\", \"count\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
            r10 = 5
        L9e:
            com.squareup.moshi.JsonDataException r12 = kd.c.h(r5, r5, r12)
            java.lang.String r0 = "missingProperty(\"userFav…rFavoritePhotos\", reader)"
            r10 = 7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.photo.FavoritePhotosResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.photo.FavoritePhotosResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, FavoritePhotosResponse favoritePhotosResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(favoritePhotosResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("userFavoritePhotos");
        this.listOfPhotoModelAdapter.toJson(writer, (j) favoritePhotosResponse.getUserFavoritePhotos());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(favoritePhotosResponse.getCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) favoritePhotosResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(FavoritePhotosResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(FavoritePhotosResponse)";
    }
}
