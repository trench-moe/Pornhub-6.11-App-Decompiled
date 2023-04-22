package com.app.pornhub.data.model.comments;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/comments/RateCommentRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/comments/RateCommentRequest;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class RateCommentRequestJsonAdapter extends f<RateCommentRequest> {
    private final f<Integer> intAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public RateCommentRequestJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("itemId", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"itemId\", \"value\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "itemId", "moshi.adapter(String::cl…ptySet(),\n      \"itemId\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, AppMeasurementSdk.ConditionalUserProperty.VALUE, "moshi.adapter(Int::class…ava, emptySet(), \"value\")");
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
    public com.app.pornhub.data.model.comments.RateCommentRequest fromJson(com.squareup.moshi.JsonReader r12) {
        /*
            r11 = this;
            r7 = r11
            java.lang.String r10 = "reader"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r10 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r12.c()
            r0 = 0
            r9 = 2
            r1 = r0
        Lf:
            boolean r9 = r12.h()
            r2 = r9
            java.lang.String r3 = "value"
            r9 = 4
            java.lang.String r9 = "value__"
            r4 = r9
            java.lang.String r5 = "itemId"
            if (r2 == 0) goto L73
            r10 = 3
            com.squareup.moshi.JsonReader$a r2 = r7.options
            r9 = 7
            int r9 = r12.F(r2)
            r2 = r9
            r9 = -1
            r6 = r9
            if (r2 == r6) goto L6a
            if (r2 == 0) goto L4b
            r10 = 1
            r5 = r10
            if (r2 == r5) goto L33
            r10 = 7
            goto Lf
        L33:
            com.squareup.moshi.f<java.lang.Integer> r1 = r7.intAdapter
            java.lang.Object r1 = r1.fromJson(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9 = 3
            if (r1 == 0) goto L40
            r9 = 5
            goto Lf
        L40:
            com.squareup.moshi.JsonDataException r10 = kd.c.n(r4, r3, r12)
            r12 = r10
            java.lang.String r0 = "unexpectedNull(\"value__\"…lue\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
        L4b:
            r9 = 4
            com.squareup.moshi.f<java.lang.String> r0 = r7.stringAdapter
            r10 = 4
            java.lang.Object r9 = r0.fromJson(r12)
            r0 = r9
            java.lang.String r0 = (java.lang.String) r0
            r9 = 6
            if (r0 == 0) goto L5b
            r10 = 4
            goto Lf
        L5b:
            r9 = 2
            com.squareup.moshi.JsonDataException r10 = kd.c.n(r5, r5, r12)
            r12 = r10
            java.lang.String r9 = "unexpectedNull(\"itemId\",…        \"itemId\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            r10 = 1
            throw r12
            r9 = 4
        L6a:
            r9 = 7
            r12.P()
            r10 = 3
            r12.S()
            goto Lf
        L73:
            r12.e()
            com.app.pornhub.data.model.comments.RateCommentRequest r2 = new com.app.pornhub.data.model.comments.RateCommentRequest
            if (r0 == 0) goto L90
            if (r1 == 0) goto L86
            r10 = 2
            int r12 = r1.intValue()
            r2.<init>(r0, r12)
            r10 = 1
            return r2
        L86:
            com.squareup.moshi.JsonDataException r12 = kd.c.h(r4, r3, r12)
            java.lang.String r0 = "missingProperty(\"value__\", \"value\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
        L90:
            com.squareup.moshi.JsonDataException r12 = kd.c.h(r5, r5, r12)
            java.lang.String r0 = "missingProperty(\"itemId\", \"itemId\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            r9 = 4
            throw r12
            r10 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.comments.RateCommentRequestJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.comments.RateCommentRequest");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, RateCommentRequest rateCommentRequest) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(rateCommentRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("itemId");
        this.stringAdapter.toJson(writer, (j) rateCommentRequest.getItemId());
        writer.i(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.intAdapter.toJson(writer, (j) Integer.valueOf(rateCommentRequest.getValue()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(RateCommentRequest)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(RateCommentRequest)";
    }
}
