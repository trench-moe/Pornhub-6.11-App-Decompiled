package com.app.pornhub.data.model.videos;

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

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/videos/RateVideoRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/videos/RateVideoRequest;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class RateVideoRequestJsonAdapter extends f<RateVideoRequest> {
    private final f<Integer> intAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public RateVideoRequestJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("vkey", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"vkey\", \"value\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "vkey", "moshi.adapter(String::cl…emptySet(),\n      \"vkey\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, AppMeasurementSdk.ConditionalUserProperty.VALUE, "moshi.adapter(Int::class…ava, emptySet(), \"value\")");
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
    public com.app.pornhub.data.model.videos.RateVideoRequest fromJson(com.squareup.moshi.JsonReader r11) {
        /*
            r10 = this;
            java.lang.String r7 = "reader"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r11.c()
            r8 = 1
            r7 = 0
            r0 = r7
            r1 = r0
        Lf:
            boolean r7 = r11.h()
            r2 = r7
            java.lang.String r7 = "value"
            r3 = r7
            java.lang.String r7 = "value__"
            r4 = r7
            java.lang.String r7 = "vkey"
            r5 = r7
            if (r2 == 0) goto L6e
            r8 = 5
            com.squareup.moshi.JsonReader$a r2 = r10.options
            r9 = 1
            int r2 = r11.F(r2)
            r7 = -1
            r6 = r7
            if (r2 == r6) goto L66
            if (r2 == 0) goto L4d
            r7 = 1
            r5 = r7
            if (r2 == r5) goto L33
            r8 = 6
            goto Lf
        L33:
            r9 = 4
            com.squareup.moshi.f<java.lang.Integer> r1 = r10.intAdapter
            java.lang.Object r1 = r1.fromJson(r11)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9 = 6
            if (r1 == 0) goto L41
            r9 = 2
            goto Lf
        L41:
            com.squareup.moshi.JsonDataException r11 = kd.c.n(r4, r3, r11)
            java.lang.String r0 = "unexpectedNull(\"value__\"…lue\",\n            reader)"
            r9 = 6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 1
        L4d:
            r9 = 5
            com.squareup.moshi.f<java.lang.String> r0 = r10.stringAdapter
            r9 = 5
            java.lang.Object r0 = r0.fromJson(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5a
            goto Lf
        L5a:
            com.squareup.moshi.JsonDataException r7 = kd.c.n(r5, r5, r11)
            r11 = r7
            java.lang.String r7 = "unexpectedNull(\"vkey\", \"vkey\",\n            reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
        L66:
            r11.P()
            r9 = 2
            r11.S()
            goto Lf
        L6e:
            r8 = 3
            r11.e()
            r9 = 6
            com.app.pornhub.data.model.videos.RateVideoRequest r2 = new com.app.pornhub.data.model.videos.RateVideoRequest
            if (r0 == 0) goto L93
            r8 = 3
            if (r1 == 0) goto L85
            r9 = 7
            int r7 = r1.intValue()
            r11 = r7
            r2.<init>(r0, r11)
            r9 = 2
            return r2
        L85:
            com.squareup.moshi.JsonDataException r7 = kd.c.h(r4, r3, r11)
            r11 = r7
            java.lang.String r7 = "missingProperty(\"value__\", \"value\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r9 = 4
            throw r11
            r8 = 6
        L93:
            r9 = 5
            com.squareup.moshi.JsonDataException r7 = kd.c.h(r5, r5, r11)
            r11 = r7
            java.lang.String r7 = "missingProperty(\"vkey\", \"vkey\", reader)"
            r0 = r7
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r8 = 6
            throw r11
            r8 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.videos.RateVideoRequestJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.videos.RateVideoRequest");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, RateVideoRequest rateVideoRequest) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(rateVideoRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("vkey");
        this.stringAdapter.toJson(writer, (j) rateVideoRequest.getVkey());
        writer.i(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.intAdapter.toJson(writer, (j) Integer.valueOf(rateVideoRequest.getValue()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(RateVideoRequest)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(RateVideoRequest)";
    }
}
