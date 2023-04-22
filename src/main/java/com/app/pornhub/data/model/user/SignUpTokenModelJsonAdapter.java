package com.app.pornhub.data.model.user;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/user/SignUpTokenModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/user/SignUpTokenModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "longAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SignUpTokenModelJsonAdapter extends f<SignUpTokenModel> {
    private final f<Long> longAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public SignUpTokenModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("signup_token", "expiration");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"signup_token\", \"expiration\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "token", "moshi.adapter(String::cl…mptySet(),\n      \"token\")");
        this.longAdapter = a.d(moshi, Long.TYPE, "expiration", "moshi.adapter(Long::clas…et(),\n      \"expiration\")");
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
    public com.app.pornhub.data.model.user.SignUpTokenModel fromJson(com.squareup.moshi.JsonReader r11) {
        /*
            r10 = this;
            r7 = r10
            java.lang.String r9 = "reader"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r11.c()
            r9 = 0
            r0 = r9
            r1 = r0
        Lf:
            boolean r9 = r11.h()
            r2 = r9
            java.lang.String r3 = "signup_token"
            java.lang.String r4 = "token"
            r9 = 5
            java.lang.String r5 = "expiration"
            if (r2 == 0) goto L6c
            r9 = 3
            com.squareup.moshi.JsonReader$a r2 = r7.options
            int r2 = r11.F(r2)
            r9 = -1
            r6 = r9
            if (r2 == r6) goto L64
            if (r2 == 0) goto L4a
            r9 = 6
            r3 = 1
            r9 = 3
            if (r2 == r3) goto L31
            r9 = 6
            goto Lf
        L31:
            com.squareup.moshi.f<java.lang.Long> r1 = r7.longAdapter
            java.lang.Object r1 = r1.fromJson(r11)
            java.lang.Long r1 = (java.lang.Long) r1
            r9 = 1
            if (r1 == 0) goto L3d
            goto Lf
        L3d:
            com.squareup.moshi.JsonDataException r9 = kd.c.n(r5, r5, r11)
            r11 = r9
            java.lang.String r9 = "unexpectedNull(\"expirati…    \"expiration\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 3
        L4a:
            r9 = 3
            com.squareup.moshi.f<java.lang.String> r0 = r7.stringAdapter
            r9 = 5
            java.lang.Object r0 = r0.fromJson(r11)
            java.lang.String r0 = (java.lang.String) r0
            r9 = 5
            if (r0 == 0) goto L58
            goto Lf
        L58:
            com.squareup.moshi.JsonDataException r11 = kd.c.n(r4, r3, r11)
            java.lang.String r0 = "unexpectedNull(\"token\",\n…  \"signup_token\", reader)"
            r9 = 2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 3
        L64:
            r11.P()
            r9 = 4
            r11.S()
            goto Lf
        L6c:
            r11.e()
            r9 = 2
            com.app.pornhub.data.model.user.SignUpTokenModel r2 = new com.app.pornhub.data.model.user.SignUpTokenModel
            r9 = 7
            if (r0 == 0) goto L90
            r9 = 4
            if (r1 == 0) goto L82
            r9 = 1
            long r3 = r1.longValue()
            r2.<init>(r0, r3)
            r9 = 7
            return r2
        L82:
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r5, r5, r11)
            r11 = r9
            java.lang.String r0 = "missingProperty(\"expirat…n\", \"expiration\", reader)"
            r9 = 1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r9 = 1
            throw r11
            r9 = 6
        L90:
            r9 = 1
            com.squareup.moshi.JsonDataException r9 = kd.c.h(r4, r3, r11)
            r11 = r9
            java.lang.String r9 = "missingProperty(\"token\", \"signup_token\", reader)"
            r0 = r9
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            throw r11
            r9 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.data.model.user.SignUpTokenModelJsonAdapter.fromJson(com.squareup.moshi.JsonReader):com.app.pornhub.data.model.user.SignUpTokenModel");
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, SignUpTokenModel signUpTokenModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(signUpTokenModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("signup_token");
        this.stringAdapter.toJson(writer, (j) signUpTokenModel.getToken());
        writer.i("expiration");
        this.longAdapter.toJson(writer, (j) Long.valueOf(signUpTokenModel.getExpiration()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(SignUpTokenModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(SignUpTokenModel)";
    }
}
