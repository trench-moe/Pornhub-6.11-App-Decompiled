package com.app.pornhub.data.model.pornstar;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformersResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformersResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/pornstar/PerformerModel;", "listOfPerformerModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformersResponseJsonAdapter extends f<PerformersResponse> {
    private final f<Integer> intAdapter;
    private final f<List<PerformerModel>> listOfPerformerModelAdapter;
    private final JsonReader.a options;

    public PerformersResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("items", "total");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"items\", \"total\")");
        this.options = a10;
        this.listOfPerformerModelAdapter = a.e(moshi, jd.k.e(List.class, PerformerModel.class), "items", "moshi.adapter(Types.newP…     emptySet(), \"items\")");
        this.intAdapter = android.support.v4.media.a.d(moshi, Integer.TYPE, "total", "moshi.adapter(Int::class…ava, emptySet(), \"total\")");
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
    public com.app.pornhub.data.model.pornstar.PerformersResponse fromJson(com.squareup.moshi.JsonReader r10) {
        /*
            r9 = this;
            java.lang.String r0 = "reader"
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r7 = 2
            r10.c()
            r0 = 0
            r7 = 2
            r1 = r0
        Le:
            boolean r6 = r10.h()
            r2 = r6
            java.lang.String r3 = "total"
            java.lang.String r6 = "items"
            r4 = r6
            if (r2 == 0) goto L6b
            r8 = 4
            com.squareup.moshi.JsonReader$a r2 = r9.options
            r8 = 1
            int r6 = r10.F(r2)
            r2 = r6
            r6 = -1
            r5 = r6
            if (r2 == r5) goto L64
            r7 = 3
            if (r2 == 0) goto L49
            r4 = 1
            r8 = 3
            if (r2 == r4) goto L30
            r7 = 1
            goto Le
        L30:
            com.squareup.moshi.f<java.lang.Integer> r1 = r9.intAdapter
            java.lang.Object r6 = r1.fromJson(r10)
            r1 = r6
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3c
            goto Le
        L3c:
            com.squareup.moshi.JsonDataException r6 = kd.c.n(r3, r3, r10)
            r10 = r6
            java.lang.String r0 = "unexpectedNull(\"total\", …tal\",\n            reader)"
            r8 = 2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            throw r10
            r7 = 6
        L49:
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.pornstar.PerformerModel>> r0 = r9.listOfPerformerModelAdapter
            java.lang.Object r0 = r0.fromJson(r10)
            java.util.List r0 = (java.util.List) r0
            r8 = 4
            if (r0 == 0) goto L56
            r7 = 4
            goto Le
        L56:
            r7 = 4
            com.squareup.moshi.JsonDataException r6 = kd.c.n(r4, r4, r10)
            r10 = r6
            java.lang.String r0 = "unexpectedNull(\"items\", \"items\", reader)"
            r7 = 4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            throw r10
            r7 = 6
        L64:
            r10.P()
            r10.S()
            goto Le
        L6b:
            r8 = 7
            r10.e()
            com.app.pornhub.data.model.pornstar.PerformersResponse r2 = new com.app.pornhub.data.model.pornstar.PerformersResponse
            if (r0 == 0) goto L8b
            if (r1 == 0) goto L7f
            r7 = 1
            int r10 = r1.intValue()
            r2.<init>(r0, r10)
            r7 = 6
            return r2
        L7f:
            r8 = 3
            com.squareup.moshi.JsonDataException r10 = kd.c.h(r3, r3, r10)
            java.lang.String r6 = "missingProperty(\"total\", \"total\", reader)"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            throw r10
        L8b:
            com.squareup.moshi.JsonDataException r10 = kd.c.h(r4, r4, r10)
            java.lang.String r6 = "missingProperty(\"items\", \"items\", reader)"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
            r8 = 5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.pornstar.PerformersResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.pornstar.PerformersResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PerformersResponse performersResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(performersResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("items");
        this.listOfPerformerModelAdapter.toJson(writer, (j) performersResponse.getItems());
        writer.i("total");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(performersResponse.getTotal()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PerformersResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PerformersResponse)";
    }
}
