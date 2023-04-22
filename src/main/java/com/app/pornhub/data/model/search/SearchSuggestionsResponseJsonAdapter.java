package com.app.pornhub.data.model.search;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/search/SearchSuggestionsResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/search/SearchSuggestionsResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/search/SuggestionsResultModel;", "suggestionsResultModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SearchSuggestionsResponseJsonAdapter extends f<SearchSuggestionsResponse> {
    private final JsonReader.a options;
    private final f<String> stringAdapter;
    private final f<SuggestionsResultModel> suggestionsResultModelAdapter;

    public SearchSuggestionsResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("source", "results");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"source\", \"results\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "source", "moshi.adapter(String::cl…ptySet(),\n      \"source\")");
        this.suggestionsResultModelAdapter = a.d(moshi, SuggestionsResultModel.class, "results", "moshi.adapter(Suggestion…a, emptySet(), \"results\")");
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
    public com.app.pornhub.data.model.search.SearchSuggestionsResponse fromJson(com.squareup.moshi.JsonReader r9) {
        /*
            r8 = this;
            java.lang.String r6 = "reader"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r9.c()
            r7 = 6
            r6 = 0
            r0 = r6
            r1 = r0
        Lf:
            boolean r6 = r9.h()
            r2 = r6
            java.lang.String r6 = "results"
            r3 = r6
            java.lang.String r4 = "source"
            if (r2 == 0) goto L6b
            com.squareup.moshi.JsonReader$a r2 = r8.options
            int r6 = r9.F(r2)
            r2 = r6
            r6 = -1
            r5 = r6
            if (r2 == r5) goto L62
            r7 = 4
            if (r2 == 0) goto L49
            r6 = 1
            r4 = r6
            if (r2 == r4) goto L2e
            goto Lf
        L2e:
            com.squareup.moshi.f<com.app.pornhub.data.model.search.SuggestionsResultModel> r1 = r8.suggestionsResultModelAdapter
            java.lang.Object r1 = r1.fromJson(r9)
            com.app.pornhub.data.model.search.SuggestionsResultModel r1 = (com.app.pornhub.data.model.search.SuggestionsResultModel) r1
            r7 = 7
            if (r1 == 0) goto L3a
            goto Lf
        L3a:
            r7 = 2
            com.squareup.moshi.JsonDataException r6 = kd.c.n(r3, r3, r9)
            r9 = r6
            java.lang.String r0 = "unexpectedNull(\"results\", \"results\", reader)"
            r7 = 1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 1
            throw r9
            r7 = 7
        L49:
            com.squareup.moshi.f<java.lang.String> r0 = r8.stringAdapter
            java.lang.Object r0 = r0.fromJson(r9)
            java.lang.String r0 = (java.lang.String) r0
            r7 = 4
            if (r0 == 0) goto L55
            goto Lf
        L55:
            com.squareup.moshi.JsonDataException r6 = kd.c.n(r4, r4, r9)
            r9 = r6
            java.lang.String r6 = "unexpectedNull(\"source\",…        \"source\", reader)"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            throw r9
            r7 = 3
        L62:
            r7 = 5
            r9.P()
            r9.S()
            r7 = 1
            goto Lf
        L6b:
            r9.e()
            r7 = 2
            com.app.pornhub.data.model.search.SearchSuggestionsResponse r2 = new com.app.pornhub.data.model.search.SearchSuggestionsResponse
            r7 = 7
            if (r0 == 0) goto L8a
            r7 = 4
            if (r1 == 0) goto L7c
            r2.<init>(r0, r1)
            r7 = 4
            return r2
        L7c:
            r7 = 7
            com.squareup.moshi.JsonDataException r6 = kd.c.h(r3, r3, r9)
            r9 = r6
            java.lang.String r0 = "missingProperty(\"results\", \"results\", reader)"
            r7 = 5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 3
            throw r9
        L8a:
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r4, r4, r9)
            java.lang.String r0 = "missingProperty(\"source\", \"source\", reader)"
            r7 = 3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r0)
            r7 = 2
            throw r9
            r7 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.search.SearchSuggestionsResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.search.SearchSuggestionsResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, SearchSuggestionsResponse searchSuggestionsResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(searchSuggestionsResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("source");
        this.stringAdapter.toJson(writer, (j) searchSuggestionsResponse.getSource());
        writer.i("results");
        this.suggestionsResultModelAdapter.toJson(writer, (j) searchSuggestionsResponse.getResults());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(SearchSuggestionsResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(SearchSuggestionsResponse)";
    }
}
