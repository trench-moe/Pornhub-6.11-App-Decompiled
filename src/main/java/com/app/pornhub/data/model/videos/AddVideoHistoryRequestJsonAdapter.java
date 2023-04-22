package com.app.pornhub.data.model.videos;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/videos/AddVideoHistoryRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/videos/AddVideoHistoryRequest;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AddVideoHistoryRequestJsonAdapter extends f<AddVideoHistoryRequest> {
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public AddVideoHistoryRequestJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("vkey");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"vkey\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "vkey", "moshi.adapter(String::cl…emptySet(),\n      \"vkey\")");
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
    public com.app.pornhub.data.model.videos.AddVideoHistoryRequest fromJson(com.squareup.moshi.JsonReader r8) {
        /*
            r7 = this;
            r4 = r7
            java.lang.String r0 = "reader"
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r8.c()
            r6 = 0
            r0 = r6
        Ld:
            boolean r1 = r8.h()
            java.lang.String r6 = "vkey"
            r2 = r6
            if (r1 == 0) goto L46
            com.squareup.moshi.JsonReader$a r1 = r4.options
            r6 = 1
            int r1 = r8.F(r1)
            r6 = -1
            r3 = r6
            if (r1 == r3) goto L3d
            if (r1 == 0) goto L24
            goto Ld
        L24:
            com.squareup.moshi.f<java.lang.String> r0 = r4.stringAdapter
            java.lang.Object r0 = r0.fromJson(r8)
            java.lang.String r0 = (java.lang.String) r0
            r6 = 4
            if (r0 == 0) goto L30
            goto Ld
        L30:
            r6 = 2
            com.squareup.moshi.JsonDataException r8 = kd.c.n(r2, r2, r8)
            java.lang.String r0 = "unexpectedNull(\"vkey\", \"vkey\",\n            reader)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            r6 = 4
            throw r8
            r6 = 7
        L3d:
            r6 = 5
            r8.P()
            r8.S()
            r6 = 4
            goto Ld
        L46:
            r6 = 5
            r8.e()
            r6 = 3
            com.app.pornhub.data.model.videos.AddVideoHistoryRequest r1 = new com.app.pornhub.data.model.videos.AddVideoHistoryRequest
            if (r0 == 0) goto L53
            r1.<init>(r0)
            return r1
        L53:
            r6 = 4
            com.squareup.moshi.JsonDataException r8 = kd.c.h(r2, r2, r8)
            java.lang.String r6 = "missingProperty(\"vkey\", \"vkey\", reader)"
            r0 = r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            throw r8
            r6 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.videos.AddVideoHistoryRequestJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.videos.AddVideoHistoryRequest");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, AddVideoHistoryRequest addVideoHistoryRequest) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(addVideoHistoryRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("vkey");
        this.stringAdapter.toJson(writer, (j) addVideoHistoryRequest.getVkey());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(AddVideoHistoryRequest)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AddVideoHistoryRequest)";
    }
}
