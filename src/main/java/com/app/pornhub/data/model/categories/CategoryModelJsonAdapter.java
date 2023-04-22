package com.app.pornhub.data.model.categories;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/categories/CategoryModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/categories/CategoryModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "booleanAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CategoryModelJsonAdapter extends f<CategoryModel> {
    private final f<Boolean> booleanAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public CategoryModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", AppMeasurementSdk.ConditionalUserProperty.NAME, "slug", "imageUrl", "videosCount", "isVerified");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"name\", \"slug\",…deosCount\", \"isVerified\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "isVerified", "moshi.adapter(Boolean::c…et(),\n      \"isVerified\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public CategoryModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (reader.h()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"name\", \"name\",\n            reader)");
                        throw n10;
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n11 = c.n("slug", "slug", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"slug\", \"slug\",\n            reader)");
                        throw n11;
                    }
                    break;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n12 = c.n("imageUrl", "imageUrl", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"imageUrl…      \"imageUrl\", reader)");
                        throw n12;
                    }
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n13 = c.n("videosCount", "videosCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"videosCo…\", \"videosCount\", reader)");
                        throw n13;
                    }
                    break;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n14 = c.n("isVerified", "isVerified", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"isVerifi…    \"isVerified\", reader)");
                        throw n14;
                    }
                    break;
            }
        }
        reader.e();
        if (str == null) {
            JsonDataException h10 = c.h("id", "id", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
            throw h10;
        } else if (str2 == null) {
            JsonDataException h11 = c.h(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"name\", \"name\", reader)");
            throw h11;
        } else if (str3 == null) {
            JsonDataException h12 = c.h("slug", "slug", reader);
            Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"slug\", \"slug\", reader)");
            throw h12;
        } else if (str4 == null) {
            JsonDataException h13 = c.h("imageUrl", "imageUrl", reader);
            Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"imageUrl\", \"imageUrl\", reader)");
            throw h13;
        } else if (str5 == null) {
            JsonDataException h14 = c.h("videosCount", "videosCount", reader);
            Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"videosC…unt\",\n            reader)");
            throw h14;
        } else if (bool != null) {
            return new CategoryModel(str, str2, str3, str4, str5, bool.booleanValue());
        } else {
            JsonDataException h15 = c.h("isVerified", "isVerified", reader);
            Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"isVerif…d\", \"isVerified\", reader)");
            throw h15;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, CategoryModel categoryModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(categoryModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) categoryModel.getId());
        writer.i(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.toJson(writer, (j) categoryModel.getName());
        writer.i("slug");
        this.stringAdapter.toJson(writer, (j) categoryModel.getSlug());
        writer.i("imageUrl");
        this.stringAdapter.toJson(writer, (j) categoryModel.getImageUrl());
        writer.i("videosCount");
        this.stringAdapter.toJson(writer, (j) categoryModel.getVideosCount());
        writer.i("isVerified");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(categoryModel.isVerified()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(CategoryModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(CategoryModel)";
    }
}
