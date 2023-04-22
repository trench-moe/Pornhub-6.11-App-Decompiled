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

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/comments/ReportSpamRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/comments/ReportSpamRequest;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ReportSpamRequestJsonAdapter extends f<ReportSpamRequest> {
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public ReportSpamRequestJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("itemId", "type");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"itemId\", \"type\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "itemId", "moshi.adapter(String::cl…ptySet(),\n      \"itemId\")");
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
    public com.app.pornhub.data.model.comments.ReportSpamRequest fromJson(com.squareup.moshi.JsonReader r11) {
        /*
            r10 = this;
            r6 = r10
            java.lang.String r8 = "reader"
            r0 = r8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r11.c()
            r9 = 1
            r9 = 0
            r0 = r9
            r1 = r0
        L10:
            boolean r2 = r11.h()
            java.lang.String r3 = "type"
            java.lang.String r4 = "itemId"
            r8 = 1
            if (r2 == 0) goto L6c
            r8 = 6
            com.squareup.moshi.JsonReader$a r2 = r6.options
            int r8 = r11.F(r2)
            r2 = r8
            r5 = -1
            r9 = 7
            if (r2 == r5) goto L63
            if (r2 == 0) goto L4b
            r8 = 1
            r4 = r8
            if (r2 == r4) goto L2f
            r8 = 7
            goto L10
        L2f:
            r9 = 1
            com.squareup.moshi.f<java.lang.String> r1 = r6.stringAdapter
            java.lang.Object r8 = r1.fromJson(r11)
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            r8 = 4
            if (r1 == 0) goto L3d
            goto L10
        L3d:
            r8 = 6
            com.squareup.moshi.JsonDataException r8 = kd.c.n(r3, r3, r11)
            r11 = r8
            java.lang.String r9 = "unexpectedNull(\"type\", \"type\",\n            reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r8 = 6
        L4b:
            com.squareup.moshi.f<java.lang.String> r0 = r6.stringAdapter
            java.lang.Object r0 = r0.fromJson(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L57
            r8 = 5
            goto L10
        L57:
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r4, r4, r11)
            r11 = r9
            java.lang.String r9 = "unexpectedNull(\"itemId\",…        \"itemId\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
        L63:
            r9 = 3
            r11.P()
            r8 = 6
            r11.S()
            goto L10
        L6c:
            r9 = 2
            r11.e()
            r9 = 1
            com.app.pornhub.data.model.comments.ReportSpamRequest r2 = new com.app.pornhub.data.model.comments.ReportSpamRequest
            if (r0 == 0) goto L88
            if (r1 == 0) goto L7c
            r8 = 2
            r2.<init>(r0, r1)
            return r2
        L7c:
            com.squareup.moshi.JsonDataException r8 = kd.c.h(r3, r3, r11)
            r11 = r8
            java.lang.String r0 = "missingProperty(\"type\", \"type\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r8 = 1
        L88:
            com.squareup.moshi.JsonDataException r11 = kd.c.h(r4, r4, r11)
            java.lang.String r9 = "missingProperty(\"itemId\", \"itemId\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.comments.ReportSpamRequestJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.comments.ReportSpamRequest");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, ReportSpamRequest reportSpamRequest) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(reportSpamRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("itemId");
        this.stringAdapter.toJson(writer, (j) reportSpamRequest.getItemId());
        writer.i("type");
        this.stringAdapter.toJson(writer, (j) reportSpamRequest.getType());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(ReportSpamRequest)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ReportSpamRequest)";
    }
}
