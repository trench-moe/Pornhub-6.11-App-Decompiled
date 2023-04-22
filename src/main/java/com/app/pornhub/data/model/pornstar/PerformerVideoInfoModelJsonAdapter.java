package com.app.pornhub.data.model.pornstar;

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

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerVideoInfoModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformerVideoInfoModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformerVideoInfoModelJsonAdapter extends f<PerformerVideoInfoModel> {
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PerformerVideoInfoModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("slug", AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"slug\", \"name\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "slug", "moshi.adapter(String::cl…emptySet(),\n      \"slug\")");
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
    public com.app.pornhub.data.model.pornstar.PerformerVideoInfoModel fromJson(com.squareup.moshi.JsonReader r8) {
        /*
            r7 = this;
            java.lang.String r6 = "reader"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r8.c()
            r6 = 4
            r6 = 0
            r0 = r6
            r1 = r0
        Lf:
            boolean r6 = r8.h()
            r2 = r6
            java.lang.String r3 = "name"
            java.lang.String r4 = "slug"
            r6 = 5
            if (r2 == 0) goto L67
            r6 = 3
            com.squareup.moshi.JsonReader$a r2 = r7.options
            int r2 = r8.F(r2)
            r6 = -1
            r5 = r6
            if (r2 == r5) goto L60
            if (r2 == 0) goto L47
            r6 = 6
            r4 = 1
            if (r2 == r4) goto L2d
            goto Lf
        L2d:
            r6 = 6
            com.squareup.moshi.f<java.lang.String> r1 = r7.stringAdapter
            r6 = 4
            java.lang.Object r6 = r1.fromJson(r8)
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3b
            goto Lf
        L3b:
            r6 = 1
            com.squareup.moshi.JsonDataException r8 = kd.c.n(r3, r3, r8)
            java.lang.String r0 = "unexpectedNull(\"name\", \"name\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            throw r8
            r6 = 1
        L47:
            r6 = 4
            com.squareup.moshi.f<java.lang.String> r0 = r7.stringAdapter
            r6 = 6
            java.lang.Object r0 = r0.fromJson(r8)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L54
            goto Lf
        L54:
            com.squareup.moshi.JsonDataException r8 = kd.c.n(r4, r4, r8)
            java.lang.String r6 = "unexpectedNull(\"slug\", \"slug\",\n            reader)"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            throw r8
            r6 = 3
        L60:
            r8.P()
            r8.S()
            goto Lf
        L67:
            r8.e()
            com.app.pornhub.data.model.pornstar.PerformerVideoInfoModel r2 = new com.app.pornhub.data.model.pornstar.PerformerVideoInfoModel
            r6 = 4
            if (r0 == 0) goto L80
            if (r1 == 0) goto L76
            r2.<init>(r0, r1)
            r6 = 2
            return r2
        L76:
            com.squareup.moshi.JsonDataException r8 = kd.c.h(r3, r3, r8)
            java.lang.String r0 = "missingProperty(\"name\", \"name\", reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            throw r8
        L80:
            r6 = 3
            com.squareup.moshi.JsonDataException r6 = kd.c.h(r4, r4, r8)
            r8 = r6
            java.lang.String r0 = "missingProperty(\"slug\", \"slug\", reader)"
            r6 = 1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            throw r8
            r6 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.pornstar.PerformerVideoInfoModelJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.pornstar.PerformerVideoInfoModel");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PerformerVideoInfoModel performerVideoInfoModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(performerVideoInfoModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("slug");
        this.stringAdapter.toJson(writer, (j) performerVideoInfoModel.getSlug());
        writer.i(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.toJson(writer, (j) performerVideoInfoModel.getName());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PerformerVideoInfoModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PerformerVideoInfoModel)";
    }
}
