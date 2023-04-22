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

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/ErrorModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/ErrorModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "intAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ErrorModelJsonAdapter extends f<ErrorModel> {
    private final f<Integer> intAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public ErrorModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("code", "message");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"code\", \"message\")");
        this.options = a10;
        this.intAdapter = a.d(moshi, Integer.TYPE, "code", "moshi.adapter(Int::class.java, emptySet(), \"code\")");
        this.stringAdapter = a.d(moshi, String.class, "message", "moshi.adapter(String::cl…tySet(),\n      \"message\")");
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
    public com.app.pornhub.data.model.ErrorModel fromJson(com.squareup.moshi.JsonReader r11) {
        /*
            r10 = this;
            java.lang.String r0 = "reader"
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r7 = 5
            r11.c()
            r7 = 4
            r0 = 0
            r9 = 2
            r1 = r0
        Lf:
            boolean r6 = r11.h()
            r2 = r6
            java.lang.String r6 = "message"
            r3 = r6
            java.lang.String r6 = "code"
            r4 = r6
            if (r2 == 0) goto L6a
            r9 = 5
            com.squareup.moshi.JsonReader$a r2 = r10.options
            int r2 = r11.F(r2)
            r5 = -1
            r9 = 4
            if (r2 == r5) goto L63
            r8 = 7
            if (r2 == 0) goto L49
            r7 = 1
            r6 = 1
            r4 = r6
            if (r2 == r4) goto L30
            goto Lf
        L30:
            com.squareup.moshi.f<java.lang.String> r1 = r10.stringAdapter
            r9 = 3
            java.lang.Object r1 = r1.fromJson(r11)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3d
            r7 = 5
            goto Lf
        L3d:
            com.squareup.moshi.JsonDataException r6 = kd.c.n(r3, r3, r11)
            r11 = r6
            java.lang.String r6 = "unexpectedNull(\"message\"…       \"message\", reader)"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
        L49:
            com.squareup.moshi.f<java.lang.Integer> r0 = r10.intAdapter
            java.lang.Object r6 = r0.fromJson(r11)
            r0 = r6
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L56
            r8 = 1
            goto Lf
        L56:
            r7 = 4
            com.squareup.moshi.JsonDataException r11 = kd.c.n(r4, r4, r11)
            java.lang.String r0 = "unexpectedNull(\"code\", \"code\", reader)"
            r7 = 2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 3
        L63:
            r11.P()
            r11.S()
            goto Lf
        L6a:
            r11.e()
            com.app.pornhub.data.model.ErrorModel r2 = new com.app.pornhub.data.model.ErrorModel
            if (r0 == 0) goto L89
            r7 = 1
            int r6 = r0.intValue()
            r0 = r6
            if (r1 == 0) goto L7d
            r2.<init>(r0, r1)
            return r2
        L7d:
            com.squareup.moshi.JsonDataException r11 = kd.c.h(r3, r3, r11)
            java.lang.String r0 = "missingProperty(\"message\", \"message\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r8 = 1
            throw r11
            r9 = 3
        L89:
            com.squareup.moshi.JsonDataException r6 = kd.c.h(r4, r4, r11)
            r11 = r6
            java.lang.String r0 = "missingProperty(\"code\", \"code\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.ErrorModelJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.ErrorModel");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(errorModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("code");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(errorModel.getCode()));
        writer.i("message");
        this.stringAdapter.toJson(writer, (j) errorModel.getMessage());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(ErrorModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ErrorModel)";
    }
}
