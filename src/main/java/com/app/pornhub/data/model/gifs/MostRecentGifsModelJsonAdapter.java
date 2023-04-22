package com.app.pornhub.data.model.gifs;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/data/model/gifs/MostRecentGifsModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/gifs/MostRecentGifsModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/gifs/GifModel;", "nullableListOfGifModelAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class MostRecentGifsModelJsonAdapter extends f<MostRecentGifsModel> {
    private final f<List<GifModel>> nullableListOfGifModelAdapter;
    private final JsonReader.a options;

    public MostRecentGifsModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("old", "new");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"old\", \"new\")");
        this.options = a10;
        this.nullableListOfGifModelAdapter = a.e(moshi, jd.k.e(List.class, GifModel.class), "old", "moshi.adapter(Types.newP… emptySet(),\n      \"old\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public MostRecentGifsModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        List<GifModel> list = null;
        List<GifModel> list2 = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                list = this.nullableListOfGifModelAdapter.fromJson(reader);
            } else if (F == 1) {
                list2 = this.nullableListOfGifModelAdapter.fromJson(reader);
            }
        }
        reader.e();
        return new MostRecentGifsModel(list, list2);
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, MostRecentGifsModel mostRecentGifsModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(mostRecentGifsModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("old");
        this.nullableListOfGifModelAdapter.toJson(writer, (j) mostRecentGifsModel.getOld());
        writer.i("new");
        this.nullableListOfGifModelAdapter.toJson(writer, (j) mostRecentGifsModel.getNew());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(MostRecentGifsModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(MostRecentGifsModel)";
    }
}
