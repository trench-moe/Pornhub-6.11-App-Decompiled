package com.app.pornhub.data.model.pornstar;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerAdditionalFiltersModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformerAdditionalFiltersModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "listOfStringAdapter", "Lcom/app/pornhub/data/model/pornstar/PerformerIncompatibleFilterChoiceModel;", "nullableListOfPerformerIncompatibleFilterChoiceModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformerAdditionalFiltersModelJsonAdapter extends f<PerformerAdditionalFiltersModel> {
    private final f<List<String>> listOfStringAdapter;
    private final f<List<PerformerIncompatibleFilterChoiceModel>> nullableListOfPerformerIncompatibleFilterChoiceModelAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PerformerAdditionalFiltersModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("title", AppMeasurementSdk.ConditionalUserProperty.VALUE, "options", "incompatibleChoice");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"title\", \"value\", \"op…    \"incompatibleChoice\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "title", "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.listOfStringAdapter = a1.a.e(moshi, jd.k.e(List.class, String.class), "options", "moshi.adapter(Types.newP…tySet(),\n      \"options\")");
        this.nullableListOfPerformerIncompatibleFilterChoiceModelAdapter = a1.a.e(moshi, jd.k.e(List.class, PerformerIncompatibleFilterChoiceModel.class), "incompatibleChoice", "moshi.adapter(Types.newP…(), \"incompatibleChoice\")");
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
    public com.app.pornhub.data.model.pornstar.PerformerAdditionalFiltersModel fromJson(com.squareup.moshi.JsonReader r14) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.pornstar.PerformerAdditionalFiltersModelJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.pornstar.PerformerAdditionalFiltersModel");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PerformerAdditionalFiltersModel performerAdditionalFiltersModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(performerAdditionalFiltersModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) performerAdditionalFiltersModel.getTitle());
        writer.i(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.stringAdapter.toJson(writer, (j) performerAdditionalFiltersModel.getValue());
        writer.i("options");
        this.listOfStringAdapter.toJson(writer, (j) performerAdditionalFiltersModel.getOptions());
        writer.i("incompatibleChoice");
        this.nullableListOfPerformerIncompatibleFilterChoiceModelAdapter.toJson(writer, (j) performerAdditionalFiltersModel.getIncompatibleChoice());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PerformerAdditionalFiltersModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PerformerAdditionalFiltersModel)";
    }
}
