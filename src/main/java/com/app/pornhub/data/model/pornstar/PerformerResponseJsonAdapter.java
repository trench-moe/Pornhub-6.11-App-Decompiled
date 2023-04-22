package com.app.pornhub.data.model.pornstar;

import android.support.v4.media.a;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R&\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformerResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/pornstar/PerformerModel;", "performerModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "listOfVideoModelAdapter", "stringAdapter", BuildConfig.FLAVOR, "mapOfStringStringAdapter", "nullableListOfStringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformerResponseJsonAdapter extends f<PerformerResponse> {
    private final f<List<VideoModel>> listOfVideoModelAdapter;
    private final f<Map<String, String>> mapOfStringStringAdapter;
    private final f<List<String>> nullableListOfStringAdapter;
    private final JsonReader.a options;
    private final f<PerformerModel> performerModelAdapter;
    private final f<String> stringAdapter;

    public PerformerResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(ExploreModel.PORNSTAR, SearchSuggestionsConfig.sourceVideos, "count", "orders", "premium");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"pornstar\", \"videos\",…     \"orders\", \"premium\")");
        this.options = a10;
        this.performerModelAdapter = a.d(moshi, PerformerModel.class, ExploreModel.PORNSTAR, "moshi.adapter(PerformerM…, emptySet(), \"pornstar\")");
        this.listOfVideoModelAdapter = a1.a.e(moshi, jd.k.e(List.class, VideoModel.class), SearchSuggestionsConfig.sourceVideos, "moshi.adapter(Types.newP…    emptySet(), \"videos\")");
        this.stringAdapter = a.d(moshi, String.class, "count", "moshi.adapter(String::cl…mptySet(),\n      \"count\")");
        this.mapOfStringStringAdapter = a1.a.e(moshi, jd.k.e(Map.class, String.class, String.class), "orders", "moshi.adapter(Types.newP…a), emptySet(), \"orders\")");
        this.nullableListOfStringAdapter = a1.a.e(moshi, jd.k.e(List.class, String.class), "premium", "moshi.adapter(Types.newP…tySet(),\n      \"premium\")");
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
    public com.app.pornhub.data.model.pornstar.PerformerResponse fromJson(com.squareup.moshi.JsonReader r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.pornstar.PerformerResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.pornstar.PerformerResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PerformerResponse performerResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(performerResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(ExploreModel.PORNSTAR);
        this.performerModelAdapter.toJson(writer, (j) performerResponse.getPornstar());
        writer.i(SearchSuggestionsConfig.sourceVideos);
        this.listOfVideoModelAdapter.toJson(writer, (j) performerResponse.getVideos());
        writer.i("count");
        this.stringAdapter.toJson(writer, (j) performerResponse.getCount());
        writer.i("orders");
        this.mapOfStringStringAdapter.toJson(writer, (j) performerResponse.getOrders());
        writer.i("premium");
        this.nullableListOfStringAdapter.toJson(writer, (j) performerResponse.getPremium());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PerformerResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PerformerResponse)";
    }
}
