package com.app.pornhub.data.model.photo;

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

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/photo/PhotoModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/photo/PhotoModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PhotoModelJsonAdapter extends f<PhotoModel> {
    private final f<Integer> intAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PhotoModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "idAlbum", "idNext", "idPrevious", "position", "urlThumbnail", "urlPhoto", "commentCount");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"idAlbum\", \"idN…rlPhoto\", \"commentCount\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "position", "moshi.adapter(Int::class…, emptySet(), \"position\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public PhotoModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (true) {
            Integer num3 = num2;
            String str7 = str6;
            String str8 = str5;
            if (!reader.h()) {
                reader.e();
                if (str == null) {
                    JsonDataException h10 = c.h("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
                    throw h10;
                } else if (str2 == null) {
                    JsonDataException h11 = c.h("idAlbum", "idAlbum", reader);
                    Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"idAlbum\", \"idAlbum\", reader)");
                    throw h11;
                } else if (str3 == null) {
                    JsonDataException h12 = c.h("idNext", "idNext", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"idNext\", \"idNext\", reader)");
                    throw h12;
                } else if (str4 == null) {
                    JsonDataException h13 = c.h("idPrevious", "idPrevious", reader);
                    Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"idPrevi…s\", \"idPrevious\", reader)");
                    throw h13;
                } else if (num == null) {
                    JsonDataException h14 = c.h("position", "position", reader);
                    Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"position\", \"position\", reader)");
                    throw h14;
                } else {
                    int intValue = num.intValue();
                    if (str8 == null) {
                        JsonDataException h15 = c.h("urlThumbnail", "urlThumbnail", reader);
                        Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"urlThum…ail\",\n            reader)");
                        throw h15;
                    } else if (str7 == null) {
                        JsonDataException h16 = c.h("urlPhoto", "urlPhoto", reader);
                        Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"urlPhoto\", \"urlPhoto\", reader)");
                        throw h16;
                    } else if (num3 != null) {
                        return new PhotoModel(str, str2, str3, str4, intValue, str8, str7, num3.intValue());
                    } else {
                        JsonDataException h17 = c.h("commentCount", "commentCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"comment…unt\",\n            reader)");
                        throw h17;
                    }
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    num2 = num3;
                    str6 = str7;
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    num2 = num3;
                    str6 = str7;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("idAlbum", "idAlbum", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"idAlbum\"…       \"idAlbum\", reader)");
                        throw n10;
                    }
                    num2 = num3;
                    str6 = str7;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n11 = c.n("idNext", "idNext", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"idNext\",…        \"idNext\", reader)");
                        throw n11;
                    }
                    num2 = num3;
                    str6 = str7;
                    break;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n12 = c.n("idPrevious", "idPrevious", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"idPrevio…    \"idPrevious\", reader)");
                        throw n12;
                    }
                    num2 = num3;
                    str6 = str7;
                    break;
                case 4:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        JsonDataException n13 = c.n("position", "position", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"position…      \"position\", reader)");
                        throw n13;
                    }
                    num2 = num3;
                    str6 = str7;
                    break;
                case 5:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n14 = c.n("urlThumbnail", "urlThumbnail", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"urlThumb…, \"urlThumbnail\", reader)");
                        throw n14;
                    }
                    num2 = num3;
                    str6 = str7;
                    continue;
                case 6:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n15 = c.n("urlPhoto", "urlPhoto", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"urlPhoto…      \"urlPhoto\", reader)");
                        throw n15;
                    }
                    num2 = num3;
                    break;
                case 7:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        JsonDataException n16 = c.n("commentCount", "commentCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"commentC…  \"commentCount\", reader)");
                        throw n16;
                    }
                    str6 = str7;
                    break;
                default:
                    num2 = num3;
                    str6 = str7;
                    break;
            }
            str5 = str8;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PhotoModel photoModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(photoModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) photoModel.getId());
        writer.i("idAlbum");
        this.stringAdapter.toJson(writer, (j) photoModel.getIdAlbum());
        writer.i("idNext");
        this.stringAdapter.toJson(writer, (j) photoModel.getIdNext());
        writer.i("idPrevious");
        this.stringAdapter.toJson(writer, (j) photoModel.getIdPrevious());
        writer.i("position");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(photoModel.getPosition()));
        writer.i("urlThumbnail");
        this.stringAdapter.toJson(writer, (j) photoModel.getUrlThumbnail());
        writer.i("urlPhoto");
        this.stringAdapter.toJson(writer, (j) photoModel.getUrlPhoto());
        writer.i("commentCount");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(photoModel.getCommentCount()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PhotoModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PhotoModel)";
    }
}
