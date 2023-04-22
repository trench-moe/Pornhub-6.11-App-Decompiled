package com.app.pornhub.data.model.channels;

import a1.a;
import com.app.pornhub.data.model.ErrorModel;
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

@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R&\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013¨\u0006\""}, d2 = {"Lcom/app/pornhub/data/model/channels/ChannelResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/channels/ChannelResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/videos/VideoModel;", "listOfVideoModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/channels/ChannelModel;", "channelModelAdapter", BuildConfig.FLAVOR, "mapOfStringStringAdapter", BuildConfig.FLAVOR, "nullableBooleanAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ChannelResponseJsonAdapter extends f<ChannelResponse> {
    private final f<ChannelModel> channelModelAdapter;
    private final f<Integer> intAdapter;
    private final f<List<VideoModel>> listOfVideoModelAdapter;
    private final f<Map<String, String>> mapOfStringStringAdapter;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public ChannelResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(SearchSuggestionsConfig.sourceVideos, "count", "channel", "orders", "emailVerificationRequired", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"videos\", \"count\", \"c…cationRequired\", \"error\")");
        this.options = a10;
        this.listOfVideoModelAdapter = a.e(moshi, jd.k.e(List.class, VideoModel.class), SearchSuggestionsConfig.sourceVideos, "moshi.adapter(Types.newP…    emptySet(), \"videos\")");
        this.intAdapter = android.support.v4.media.a.d(moshi, Integer.TYPE, "count", "moshi.adapter(Int::class…ava, emptySet(), \"count\")");
        this.channelModelAdapter = android.support.v4.media.a.d(moshi, ChannelModel.class, "channel", "moshi.adapter(ChannelMod…a, emptySet(), \"channel\")");
        this.mapOfStringStringAdapter = a.e(moshi, jd.k.e(Map.class, String.class, String.class), "orders", "moshi.adapter(Types.newP…a), emptySet(), \"orders\")");
        this.nullableBooleanAdapter = android.support.v4.media.a.d(moshi, Boolean.class, "emailVerificationRequired", "moshi.adapter(Boolean::c…ailVerificationRequired\")");
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
    public com.app.pornhub.data.model.channels.ChannelResponse fromJson(com.squareup.moshi.JsonReader r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.channels.ChannelResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.channels.ChannelResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, ChannelResponse channelResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(channelResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(SearchSuggestionsConfig.sourceVideos);
        this.listOfVideoModelAdapter.toJson(writer, (j) channelResponse.getVideos());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(channelResponse.getCount()));
        writer.i("channel");
        this.channelModelAdapter.toJson(writer, (j) channelResponse.getChannel());
        writer.i("orders");
        this.mapOfStringStringAdapter.toJson(writer, (j) channelResponse.getOrders());
        writer.i("emailVerificationRequired");
        this.nullableBooleanAdapter.toJson(writer, (j) channelResponse.getEmailVerificationRequired());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) channelResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(ChannelResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ChannelResponse)";
    }
}
