package com.app.pornhub.data.model.user;

import a1.a;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/user/SubscribersResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/user/SubscribersResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/user/UserModel;", "listOfUserModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SubscribersResponseJsonAdapter extends f<SubscribersResponse> {
    private final f<Integer> intAdapter;
    private final f<List<UserModel>> listOfUserModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public SubscribersResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("subscribers", "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"subscribers\", \"count\", \"error\")");
        this.options = a10;
        this.listOfUserModelAdapter = a.e(moshi, jd.k.e(List.class, UserModel.class), "subscribers", "moshi.adapter(Types.newP…t(),\n      \"subscribers\")");
        this.intAdapter = android.support.v4.media.a.d(moshi, Integer.TYPE, "count", "moshi.adapter(Int::class…ava, emptySet(), \"count\")");
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
    public com.app.pornhub.data.model.user.SubscribersResponse fromJson(com.squareup.moshi.JsonReader r12) {
        /*
            r11 = this;
            r7 = r11
            java.lang.String r0 = "reader"
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r12.c()
            r9 = 0
            r0 = r9
            r1 = r0
            r2 = r1
        Lf:
            boolean r9 = r12.h()
            r3 = r9
            java.lang.String r9 = "count"
            r4 = r9
            java.lang.String r9 = "subscribers"
            r5 = r9
            if (r3 == 0) goto L75
            r10 = 7
            com.squareup.moshi.JsonReader$a r3 = r7.options
            int r3 = r12.F(r3)
            r6 = -1
            if (r3 == r6) goto L6d
            if (r3 == 0) goto L56
            r9 = 2
            r5 = 1
            if (r3 == r5) goto L3b
            r10 = 5
            r4 = 2
            if (r3 == r4) goto L31
            goto Lf
        L31:
            com.squareup.moshi.f<com.app.pornhub.data.model.ErrorModel> r2 = r7.nullableErrorModelAdapter
            java.lang.Object r10 = r2.fromJson(r12)
            r2 = r10
            com.app.pornhub.data.model.ErrorModel r2 = (com.app.pornhub.data.model.ErrorModel) r2
            goto Lf
        L3b:
            r10 = 7
            com.squareup.moshi.f<java.lang.Integer> r1 = r7.intAdapter
            r9 = 6
            java.lang.Object r9 = r1.fromJson(r12)
            r1 = r9
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L49
            goto Lf
        L49:
            com.squareup.moshi.JsonDataException r12 = kd.c.n(r4, r4, r12)
            java.lang.String r10 = "unexpectedNull(\"count\", …unt\",\n            reader)"
            r0 = r10
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            r10 = 3
            throw r12
            r9 = 4
        L56:
            r9 = 3
            com.squareup.moshi.f<java.util.List<com.app.pornhub.data.model.user.UserModel>> r0 = r7.listOfUserModelAdapter
            java.lang.Object r0 = r0.fromJson(r12)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L62
            goto Lf
        L62:
            com.squareup.moshi.JsonDataException r12 = kd.c.n(r5, r5, r12)
            java.lang.String r9 = "unexpectedNull(\"subscrib…\", \"subscribers\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
        L6d:
            r12.P()
            r10 = 7
            r12.S()
            goto Lf
        L75:
            r12.e()
            r9 = 5
            com.app.pornhub.data.model.user.SubscribersResponse r3 = new com.app.pornhub.data.model.user.SubscribersResponse
            if (r0 == 0) goto L97
            r10 = 2
            if (r1 == 0) goto L8a
            int r9 = r1.intValue()
            r12 = r9
            r3.<init>(r0, r12, r2)
            r9 = 4
            return r3
        L8a:
            r10 = 3
            com.squareup.moshi.JsonDataException r12 = kd.c.h(r4, r4, r12)
            java.lang.String r0 = "missingProperty(\"count\", \"count\", reader)"
            r9 = 5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            throw r12
            r9 = 5
        L97:
            r10 = 3
            com.squareup.moshi.JsonDataException r12 = kd.c.h(r5, r5, r12)
            java.lang.String r9 = "missingProperty(\"subscri…ers\",\n            reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            r10 = 1
            throw r12
            r10 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.user.SubscribersResponseJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.user.SubscribersResponse");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, SubscribersResponse subscribersResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(subscribersResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("subscribers");
        this.listOfUserModelAdapter.toJson(writer, (j) subscribersResponse.getSubscribers());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(subscribersResponse.getCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) subscribersResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(SubscribersResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(SubscribersResponse)";
    }
}
