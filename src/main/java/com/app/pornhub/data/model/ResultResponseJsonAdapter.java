package com.app.pornhub.data.model;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/data/model/ResultResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/ResultResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "booleanAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ResultResponseJsonAdapter extends f<ResultResponse> {
    private final f<Boolean> booleanAdapter;
    private final JsonReader.a options;

    public ResultResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("result");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"result\")");
        this.options = a10;
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "result", "moshi.adapter(Boolean::c…ptySet(),\n      \"result\")");
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
    public com.app.pornhub.data.model.ResultResponse fromJson(com.squareup.moshi.JsonReader r8) {
        /*
            r7 = this;
            java.lang.String r4 = "reader"
            r0 = r4
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r8.c()
            r6 = 1
            r0 = 0
            r5 = 7
        Le:
            boolean r4 = r8.h()
            r1 = r4
            java.lang.String r4 = "result"
            r2 = r4
            if (r1 == 0) goto L49
            r6 = 5
            com.squareup.moshi.JsonReader$a r1 = r7.options
            r5 = 1
            int r4 = r8.F(r1)
            r1 = r4
            r3 = -1
            if (r1 == r3) goto L42
            if (r1 == 0) goto L28
            r6 = 3
            goto Le
        L28:
            com.squareup.moshi.f<java.lang.Boolean> r0 = r7.booleanAdapter
            java.lang.Object r4 = r0.fromJson(r8)
            r0 = r4
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L35
            r5 = 1
            goto Le
        L35:
            com.squareup.moshi.JsonDataException r8 = kd.c.n(r2, r2, r8)
            java.lang.String r0 = "unexpectedNull(\"result\",…        \"result\", reader)"
            r6 = 1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            r5 = 2
            throw r8
            r6 = 6
        L42:
            r8.P()
            r8.S()
            goto Le
        L49:
            r6 = 2
            r8.e()
            r6 = 1
            com.app.pornhub.data.model.ResultResponse r1 = new com.app.pornhub.data.model.ResultResponse
            if (r0 == 0) goto L5c
            r6 = 7
            boolean r8 = r0.booleanValue()
            r1.<init>(r8)
            r5 = 4
            return r1
        L5c:
            com.squareup.moshi.JsonDataException r4 = kd.c.h(r2, r2, r8)
            r8 = r4
            java.lang.String r0 = "missingProperty(\"result\", \"result\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            throw r8
            r6 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.ResultResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.ResultResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, ResultResponse resultResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(resultResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("result");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(resultResponse.getResult()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(ResultResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ResultResponse)";
    }
}
