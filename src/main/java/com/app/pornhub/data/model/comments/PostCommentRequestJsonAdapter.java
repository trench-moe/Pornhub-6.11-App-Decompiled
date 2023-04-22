package com.app.pornhub.data.model.comments;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/data/model/comments/PostCommentRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/comments/PostCommentRequest;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PostCommentRequestJsonAdapter extends f<PostCommentRequest> {
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PostCommentRequestJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("vkey", "comment", "itemId");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"vkey\", \"comment\", \"itemId\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "vkey", "moshi.adapter(String::cl…emptySet(),\n      \"vkey\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "itemId", "moshi.adapter(String::cl…    emptySet(), \"itemId\")");
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
    public com.app.pornhub.data.model.comments.PostCommentRequest fromJson(com.squareup.moshi.JsonReader r12) {
        /*
            r11 = this;
            r7 = r11
            java.lang.String r10 = "reader"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r12.c()
            r9 = 0
            r0 = r9
            r1 = r0
            r2 = r1
        L10:
            boolean r9 = r12.h()
            r3 = r9
            java.lang.String r9 = "comment"
            r4 = r9
            java.lang.String r10 = "vkey"
            r5 = r10
            if (r3 == 0) goto L7e
            r10 = 6
            com.squareup.moshi.JsonReader$a r3 = r7.options
            r10 = 5
            int r3 = r12.F(r3)
            r10 = -1
            r6 = r10
            if (r3 == r6) goto L76
            if (r3 == 0) goto L5d
            r9 = 4
            r5 = 1
            if (r3 == r5) goto L41
            r10 = 1
            r9 = 2
            r4 = r9
            if (r3 == r4) goto L35
            goto L10
        L35:
            com.squareup.moshi.f<java.lang.String> r2 = r7.nullableStringAdapter
            r9 = 7
            java.lang.Object r10 = r2.fromJson(r12)
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            r10 = 5
            goto L10
        L41:
            com.squareup.moshi.f<java.lang.String> r1 = r7.stringAdapter
            java.lang.Object r10 = r1.fromJson(r12)
            r1 = r10
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L4e
            r9 = 3
            goto L10
        L4e:
            r9 = 4
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r4, r4, r12)
            r12 = r9
            java.lang.String r10 = "unexpectedNull(\"comment\"…       \"comment\", reader)"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            r10 = 5
            throw r12
            r9 = 3
        L5d:
            com.squareup.moshi.f<java.lang.String> r0 = r7.stringAdapter
            java.lang.Object r0 = r0.fromJson(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L69
            r10 = 1
            goto L10
        L69:
            r10 = 5
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r5, r5, r12)
            r12 = r9
            java.lang.String r10 = "unexpectedNull(\"vkey\", \"vkey\",\n            reader)"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
        L76:
            r12.P()
            r12.S()
            r10 = 6
            goto L10
        L7e:
            r12.e()
            com.app.pornhub.data.model.comments.PostCommentRequest r3 = new com.app.pornhub.data.model.comments.PostCommentRequest
            if (r0 == 0) goto L9a
            r10 = 6
            if (r1 == 0) goto L8e
            r9 = 6
            r3.<init>(r0, r1, r2)
            r9 = 6
            return r3
        L8e:
            r10 = 7
            com.squareup.moshi.JsonDataException r12 = kd.c.h(r4, r4, r12)
            java.lang.String r10 = "missingProperty(\"comment\", \"comment\", reader)"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
        L9a:
            com.squareup.moshi.JsonDataException r12 = kd.c.h(r5, r5, r12)
            java.lang.String r10 = "missingProperty(\"vkey\", \"vkey\", reader)"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
            r9 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.comments.PostCommentRequestJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.comments.PostCommentRequest");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PostCommentRequest postCommentRequest) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(postCommentRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("vkey");
        this.stringAdapter.toJson(writer, (j) postCommentRequest.getVkey());
        writer.i("comment");
        this.stringAdapter.toJson(writer, (j) postCommentRequest.getComment());
        writer.i("itemId");
        this.nullableStringAdapter.toJson(writer, (j) postCommentRequest.getItemId());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PostCommentRequest)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PostCommentRequest)";
    }
}
