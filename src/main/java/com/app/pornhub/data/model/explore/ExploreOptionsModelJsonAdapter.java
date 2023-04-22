package com.app.pornhub.data.model.explore;

import android.support.v4.media.a;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/explore/ExploreOptionsModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/explore/ExploreOptionsModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "nullableStringAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ExploreOptionsModelJsonAdapter extends f<ExploreOptionsModel> {
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;

    public ExploreOptionsModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("order", PerformersConfig.TYPE_FILTER, DvdsConfig.TYPE_CATEGORY);
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"order\", \"filter\", \"c\")");
        this.options = a10;
        this.nullableStringAdapter = a.d(moshi, String.class, "order", "moshi.adapter(String::cl…     emptySet(), \"order\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public ExploreOptionsModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (F == 1) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            } else if (F == 2) {
                str3 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.e();
        return new ExploreOptionsModel(str, str2, str3);
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, ExploreOptionsModel exploreOptionsModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(exploreOptionsModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("order");
        this.nullableStringAdapter.toJson(writer, (j) exploreOptionsModel.getOrder());
        writer.i(PerformersConfig.TYPE_FILTER);
        this.nullableStringAdapter.toJson(writer, (j) exploreOptionsModel.getFilter());
        writer.i(DvdsConfig.TYPE_CATEGORY);
        this.nullableStringAdapter.toJson(writer, (j) exploreOptionsModel.getC());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(ExploreOptionsModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ExploreOptionsModel)";
    }
}
