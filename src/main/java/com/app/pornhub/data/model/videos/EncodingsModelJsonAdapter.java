package com.app.pornhub.data.model.videos;

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

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/videos/EncodingsModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/videos/EncodingsModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "nullableStringAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", BuildConfig.FLAVOR, "booleanAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class EncodingsModelJsonAdapter extends f<EncodingsModel> {
    private final f<Boolean> booleanAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public EncodingsModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("2160p", "1440p", "1080p", "720p", "480p", "1440p_available", "2160p_available");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"2160p\", \"1440p\", \"10…able\", \"2160p_available\")");
        this.options = a10;
        this.nullableStringAdapter = a.d(moshi, String.class, "res2160Url", "moshi.adapter(String::cl…emptySet(), \"res2160Url\")");
        this.stringAdapter = a.d(moshi, String.class, "res480Url", "moshi.adapter(String::cl…Set(),\n      \"res480Url\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "is1440pAvailable", "moshi.adapter(Boolean::c…      \"is1440pAvailable\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public EncodingsModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Boolean bool = null;
        Boolean bool2 = null;
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
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n = c.n("res480Url", "480p", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"res480Ur…          \"480p\", reader)");
                        throw n;
                    }
                    break;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n10 = c.n("is1440pAvailable", "1440p_available", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"is1440pA…1440p_available\", reader)");
                        throw n10;
                    }
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        JsonDataException n11 = c.n("is2160pAvailable", "2160p_available", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"is2160pA…2160p_available\", reader)");
                        throw n11;
                    }
                    break;
            }
        }
        reader.e();
        if (str5 == null) {
            JsonDataException h10 = c.h("res480Url", "480p", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"res480Url\", \"480p\", reader)");
            throw h10;
        } else if (bool == null) {
            JsonDataException h11 = c.h("is1440pAvailable", "1440p_available", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"is1440p…1440p_available\", reader)");
            throw h11;
        } else {
            boolean booleanValue = bool.booleanValue();
            if (bool2 != null) {
                return new EncodingsModel(str, str2, str3, str4, str5, booleanValue, bool2.booleanValue());
            }
            JsonDataException h12 = c.h("is2160pAvailable", "2160p_available", reader);
            Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"is2160p…2160p_available\", reader)");
            throw h12;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, EncodingsModel encodingsModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(encodingsModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("2160p");
        this.nullableStringAdapter.toJson(writer, (j) encodingsModel.getRes2160Url());
        writer.i("1440p");
        this.nullableStringAdapter.toJson(writer, (j) encodingsModel.getRes1440Url());
        writer.i("1080p");
        this.nullableStringAdapter.toJson(writer, (j) encodingsModel.getRes1080Url());
        writer.i("720p");
        this.nullableStringAdapter.toJson(writer, (j) encodingsModel.getRes720Url());
        writer.i("480p");
        this.stringAdapter.toJson(writer, (j) encodingsModel.getRes480Url());
        writer.i("1440p_available");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(encodingsModel.is1440pAvailable()));
        writer.i("2160p_available");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(encodingsModel.is2160pAvailable()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(EncodingsModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(EncodingsModel)";
    }
}
