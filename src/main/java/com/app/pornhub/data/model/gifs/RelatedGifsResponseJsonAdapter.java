package com.app.pornhub.data.model.gifs;

import a1.a;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/gifs/RelatedGifsResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/gifs/RelatedGifsResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/gifs/GifModel;", "listOfGifModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class RelatedGifsResponseJsonAdapter extends f<RelatedGifsResponse> {
    private final f<Integer> intAdapter;
    private final f<List<GifModel>> listOfGifModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public RelatedGifsResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("relatedGifs", "count", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"relatedGifs\", \"count\", \"error\")");
        this.options = a10;
        this.listOfGifModelAdapter = a.e(moshi, jd.k.e(List.class, GifModel.class), "relatedGifs", "moshi.adapter(Types.newP…t(),\n      \"relatedGifs\")");
        this.intAdapter = android.support.v4.media.a.d(moshi, Integer.TYPE, "count", "moshi.adapter(Int::class…ava, emptySet(), \"count\")");
        this.nullableErrorModelAdapter = android.support.v4.media.a.d(moshi, ErrorModel.class, "error", "moshi.adapter(ErrorModel…ava, emptySet(), \"error\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public RelatedGifsResponse fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        List<GifModel> list = null;
        Integer num = null;
        ErrorModel errorModel = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                list = this.listOfGifModelAdapter.fromJson(reader);
                if (list == null) {
                    JsonDataException n = c.n("relatedGifs", "relatedGifs", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"relatedG…\", \"relatedGifs\", reader)");
                    throw n;
                }
            } else if (F == 1) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    JsonDataException n10 = c.n("count", "count", reader);
                    Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"count\", …unt\",\n            reader)");
                    throw n10;
                }
            } else if (F == 2) {
                errorModel = this.nullableErrorModelAdapter.fromJson(reader);
            }
        }
        reader.e();
        if (list == null) {
            JsonDataException h10 = c.h("relatedGifs", "relatedGifs", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"related…ifs\",\n            reader)");
            throw h10;
        } else if (num != null) {
            return new RelatedGifsResponse(list, num.intValue(), errorModel);
        } else {
            JsonDataException h11 = c.h("count", "count", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"count\", \"count\", reader)");
            throw h11;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, RelatedGifsResponse relatedGifsResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(relatedGifsResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("relatedGifs");
        this.listOfGifModelAdapter.toJson(writer, (j) relatedGifsResponse.getRelatedGifs());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(relatedGifsResponse.getCount()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) relatedGifsResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(RelatedGifsResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(RelatedGifsResponse)";
    }
}