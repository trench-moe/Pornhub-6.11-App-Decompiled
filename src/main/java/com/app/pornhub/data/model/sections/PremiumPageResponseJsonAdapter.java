package com.app.pornhub.data.model.sections;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/data/model/sections/PremiumPageResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/sections/PremiumPageResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/sections/PremiumPageModel;", "premiumPageModelAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PremiumPageResponseJsonAdapter extends f<PremiumPageResponse> {
    private final JsonReader.a options;
    private final f<PremiumPageModel> premiumPageModelAdapter;

    public PremiumPageResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("sections");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"sections\")");
        this.options = a10;
        this.premiumPageModelAdapter = a.d(moshi, PremiumPageModel.class, "sections", "moshi.adapter(PremiumPag…, emptySet(), \"sections\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public PremiumPageResponse fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        PremiumPageModel premiumPageModel = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0 && (premiumPageModel = this.premiumPageModelAdapter.fromJson(reader)) == null) {
                JsonDataException n = c.n("sections", "sections", reader);
                Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"sections\", \"sections\", reader)");
                throw n;
            }
        }
        reader.e();
        if (premiumPageModel != null) {
            return new PremiumPageResponse(premiumPageModel);
        }
        JsonDataException h10 = c.h("sections", "sections", reader);
        Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"sections\", \"sections\", reader)");
        throw h10;
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PremiumPageResponse premiumPageResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(premiumPageResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("sections");
        this.premiumPageModelAdapter.toJson(writer, (j) premiumPageResponse.getSections());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PremiumPageResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PremiumPageResponse)";
    }
}
