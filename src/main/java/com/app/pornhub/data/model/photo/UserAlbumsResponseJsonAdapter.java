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

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/photo/UserAlbumsResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/photo/UserAlbumsResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/photo/AlbumModel;", "listOfAlbumModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UserAlbumsResponseJsonAdapter extends f<UserAlbumsResponse> {
    private final f<Integer> intAdapter;
    private final f<List<AlbumModel>> listOfAlbumModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public UserAlbumsResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("userAlbums", "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"userAlbums\", \"count\", \"error\")");
        this.options = a10;
        this.listOfAlbumModelAdapter = a.e(moshi, jd.k.e(List.class, AlbumModel.class), "userAlbums", "moshi.adapter(Types.newP…emptySet(), \"userAlbums\")");
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
    public com.app.pornhub.data.model.photo.UserAlbumsResponse fromJson(com.squareup.moshi.JsonReader r9) {
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
            boolean r7 = r9.h()
            r3 = r7
            java.lang.String r7 = "count"
            r4 = r7
            java.lang.String r5 = "userAlbums"
            r7 = 2
            if (r3 == 0) goto L7b
            com.squareup.moshi.JsonReader$a r3 = r8.options
            int r7 = r9.F(r3)
            r3 = r7
            r6 = -1
            r7 = 2
            if (r3 == r6) goto L73
            if (r3 == 0) goto L57
            r5 = 1
            if (r3 == r5) goto L3c
            r4 = 2
            if (r3 == r4) goto L2f
            r7 = 3
            goto Ld
        L2f:
            r7 = 3
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r8.nullableErrorModelAdapter
            r7 = 3
            java.lang.Object r7 = r2.fromJson(r9)
            r2 = r7
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            r7 = 1
            goto Ld
        L3c:
            r7 = 7
            com.squareup.moshi.f<java.lang.Integer> r1 = r8.intAdapter
            java.lang.Object r1 = r1.fromJson(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r7 = 5
            if (r1 == 0) goto L4a
            r7 = 1
            goto Ld
        L4a:
            r7 = 7
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r4, r4, r9)
            java.lang.String r0 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            r7 = 1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 3
            throw r9
        L57:
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.photo.AlbumModel>> r0 = r8.listOfAlbumModelAdapter
            r7 = 1
            java.lang.Object r0 = r0.fromJson(r9)
            java.util.List r0 = (java.util.List) r0
            r7 = 7
            if (r0 == 0) goto L65
            r7 = 6
            goto Ld
        L65:
            r7 = 4
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r5, r5, r9)
            r9 = r7
            java.lang.String r7 = "unexpectedNull(\"userAlbums\", \"userAlbums\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 3
        L73:
            r7 = 7
            r9.P()
            r9.S()
            goto Ld
        L7b:
            r7 = 1
            r9.e()
            r7 = 4
            com.app.pornhub.data.model.photo.UserAlbumsResponse r3 = new com.app.pornhub.data.model.photo.UserAlbumsResponse
            r7 = 4
            if (r0 == 0) goto L9d
            if (r1 == 0) goto L91
            r7 = 7
            int r7 = r1.intValue()
            r9 = r7
            r3.<init>(r0, r9, r2)
            return r3
        L91:
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r4, r4, r9)
            java.lang.String r7 = "missingProperty(\"count\", \"count\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 3
        L9d:
            com.squareup.moshi.JsonDataException r7 = kd.c.h(r5, r5, r9)
            r9 = r7
            java.lang.String r0 = "missingProperty(\"userAlb…s\", \"userAlbums\", reader)"
            r7 = 4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.photo.UserAlbumsResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.photo.UserAlbumsResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, UserAlbumsResponse userAlbumsResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(userAlbumsResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("userAlbums");
        this.listOfAlbumModelAdapter.toJson(writer, (j) userAlbumsResponse.getUserAlbums());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(userAlbumsResponse.getCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) userAlbumsResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(UserAlbumsResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UserAlbumsResponse)";
    }
}
