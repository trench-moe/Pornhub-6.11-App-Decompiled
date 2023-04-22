package com.app.pornhub.data.model.comments;

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

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/comments/CommentsResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/comments/CommentsResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/comments/CommentModel;", "listOfCommentModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CommentsResponseJsonAdapter extends f<CommentsResponse> {
    private final f<Integer> intAdapter;
    private final f<List<CommentModel>> listOfCommentModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public CommentsResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("comments", "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"comments\", \"count\", \"error\")");
        this.options = a10;
        this.listOfCommentModelAdapter = a.e(moshi, jd.k.e(List.class, CommentModel.class), "comments", "moshi.adapter(Types.newP…  emptySet(), \"comments\")");
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
    public com.app.pornhub.data.model.comments.CommentsResponse fromJson(com.squareup.moshi.JsonReader r11) {
        /*
            r10 = this;
            r7 = r10
            java.lang.String r9 = "reader"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r11.c()
            r0 = 0
            r1 = r0
            r2 = r1
        Lf:
            boolean r3 = r11.h()
            java.lang.String r4 = "count"
            r9 = 3
            java.lang.String r5 = "comments"
            r9 = 4
            if (r3 == 0) goto L7b
            r9 = 4
            com.squareup.moshi.JsonReader$a r3 = r7.options
            int r9 = r11.F(r3)
            r3 = r9
            r6 = -1
            if (r3 == r6) goto L72
            r9 = 3
            if (r3 == 0) goto L59
            r9 = 1
            r5 = r9
            if (r3 == r5) goto L3c
            r4 = 2
            r9 = 7
            if (r3 == r4) goto L32
            goto Lf
        L32:
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r7.nullableErrorModelAdapter
            java.lang.Object r2 = r2.fromJson(r11)
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            r9 = 7
            goto Lf
        L3c:
            r9 = 7
            com.squareup.moshi.f<java.lang.Integer> r1 = r7.intAdapter
            r9 = 1
            java.lang.Object r9 = r1.fromJson(r11)
            r1 = r9
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L4b
            r9 = 3
            goto Lf
        L4b:
            r9 = 2
            com.squareup.moshi.JsonDataException r11 = kd.c.n(r4, r4, r11)
            java.lang.String r9 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r9 = 3
            throw r11
            r9 = 5
        L59:
            r9 = 4
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.comments.CommentModel>> r0 = r7.listOfCommentModelAdapter
            java.lang.Object r9 = r0.fromJson(r11)
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L66
            goto Lf
        L66:
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r5, r5, r11)
            r11 = r9
            java.lang.String r0 = "unexpectedNull(\"comments\", \"comments\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r9 = 3
            throw r11
        L72:
            r9 = 1
            r11.P()
            r11.S()
            r9 = 5
            goto Lf
        L7b:
            r11.e()
            com.app.pornhub.data.model.comments.CommentsResponse r3 = new com.app.pornhub.data.model.comments.CommentsResponse
            if (r0 == 0) goto L9b
            if (r1 == 0) goto L8d
            int r9 = r1.intValue()
            r11 = r9
            r3.<init>(r0, r11, r2)
            return r3
        L8d:
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r4, r4, r11)
            r11 = r9
            java.lang.String r9 = "missingProperty(\"count\", \"count\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r9 = 5
            throw r11
            r9 = 7
        L9b:
            r9 = 2
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r5, r5, r11)
            r11 = r9
            java.lang.String r0 = "missingProperty(\"comments\", \"comments\", reader)"
            r9 = 7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.comments.CommentsResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.comments.CommentsResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, CommentsResponse commentsResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(commentsResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("comments");
        this.listOfCommentModelAdapter.toJson(writer, (j) commentsResponse.getComments());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(commentsResponse.getCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) commentsResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(CommentsResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(CommentsResponse)";
    }
}
