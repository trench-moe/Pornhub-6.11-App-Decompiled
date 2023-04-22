package com.app.pornhub.data.model.update;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/data/model/update/PronstoreEventResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/update/PronstoreEventResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "longAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "nullableIntAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PronstoreEventResponseJsonAdapter extends f<PronstoreEventResponse> {
    private final f<Long> longAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;

    public PronstoreEventResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "status", "version", "ip", "device_id");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"status\", \"vers… \"ip\",\n      \"device_id\")");
        this.options = a10;
        this.longAdapter = a.d(moshi, Long.TYPE, "id", "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.nullableIntAdapter = a.d(moshi, Integer.class, "status", "moshi.adapter(Int::class…    emptySet(), \"status\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "ip", "moshi.adapter(String::cl…,\n      emptySet(), \"ip\")");
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
    public com.app.pornhub.data.model.update.PronstoreEventResponse fromJson(com.squareup.moshi.JsonReader r12) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.update.PronstoreEventResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.update.PronstoreEventResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PronstoreEventResponse pronstoreEventResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(pronstoreEventResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.longAdapter.toJson(writer, (j) Long.valueOf(pronstoreEventResponse.getId()));
        writer.i("status");
        this.nullableIntAdapter.toJson(writer, (j) pronstoreEventResponse.getStatus());
        writer.i("version");
        this.nullableIntAdapter.toJson(writer, (j) pronstoreEventResponse.getVersion());
        writer.i("ip");
        this.nullableStringAdapter.toJson(writer, (j) pronstoreEventResponse.getIp());
        writer.i("device_id");
        this.nullableStringAdapter.toJson(writer, (j) pronstoreEventResponse.getDeviceId());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PronstoreEventResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PronstoreEventResponse)";
    }
}
