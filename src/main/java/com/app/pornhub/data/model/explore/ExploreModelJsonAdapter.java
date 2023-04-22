package com.app.pornhub.data.model.explore;

import android.support.v4.media.a;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/app/pornhub/data/model/explore/ExploreModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/explore/ExploreModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "listOfAnyAdapter", "Lcom/app/pornhub/data/model/explore/ExploreOptionsModel;", "nullableExploreOptionsModelAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ExploreModelJsonAdapter extends f<ExploreModel> {
    private volatile Constructor<ExploreModel> constructorRef;
    private final f<List<Object>> listOfAnyAdapter;
    private final f<ExploreOptionsModel> nullableExploreOptionsModelAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public ExploreModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("title", "subtitle", "countryFlag", "type", "list", "options");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"title\", \"subtitle\",\n…type\", \"list\", \"options\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "title", "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "subtitle", "moshi.adapter(String::cl…  emptySet(), \"subtitle\")");
        this.listOfAnyAdapter = a1.a.e(moshi, jd.k.e(List.class, Object.class), "itemsList", "moshi.adapter(Types.newP…Set(),\n      \"itemsList\")");
        this.nullableExploreOptionsModelAdapter = a.d(moshi, ExploreOptionsModel.class, "options", "moshi.adapter(ExploreOpt…a, emptySet(), \"options\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public ExploreModel fromJson(JsonReader reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i10 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List<Object> list = null;
        ExploreOptionsModel exploreOptionsModel = null;
        while (reader.h()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    break;
                case 0:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n = c.n("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw n;
                    }
                    break;
                case 1:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n10 = c.n("type", "type", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"type\", \"type\",\n            reader)");
                        throw n10;
                    }
                    break;
                case 4:
                    list = this.listOfAnyAdapter.fromJson(reader);
                    if (list == null) {
                        JsonDataException n11 = c.n("itemsList", "list", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"itemsLis…          \"list\", reader)");
                        throw n11;
                    }
                    break;
                case 5:
                    exploreOptionsModel = this.nullableExploreOptionsModelAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.e();
        if (i10 == -33) {
            if (str2 == null) {
                JsonDataException h10 = c.h("title", "title", reader);
                Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"title\", \"title\", reader)");
                throw h10;
            } else if (str5 == null) {
                JsonDataException h11 = c.h("type", "type", reader);
                Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"type\", \"type\", reader)");
                throw h11;
            } else if (list != null) {
                return new ExploreModel(str2, str3, str4, str5, list, exploreOptionsModel);
            } else {
                JsonDataException h12 = c.h("itemsList", "list", reader);
                Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"itemsList\", \"list\", reader)");
                throw h12;
            }
        }
        Constructor<ExploreModel> constructor = this.constructorRef;
        if (constructor == null) {
            str = "missingProperty(\"type\", \"type\", reader)";
            constructor = ExploreModel.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, List.class, ExploreOptionsModel.class, Integer.TYPE, c.f12069c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "ExploreModel::class.java…his.constructorRef = it }");
        } else {
            str = "missingProperty(\"type\", \"type\", reader)";
        }
        Object[] objArr = new Object[8];
        if (str2 == null) {
            JsonDataException h13 = c.h("title", "title", reader);
            Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"title\", \"title\", reader)");
            throw h13;
        }
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = str4;
        if (str5 == null) {
            JsonDataException h14 = c.h("type", "type", reader);
            Intrinsics.checkNotNullExpressionValue(h14, str);
            throw h14;
        }
        objArr[3] = str5;
        if (list == null) {
            JsonDataException h15 = c.h("itemsList", "list", reader);
            Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"itemsList\", \"list\", reader)");
            throw h15;
        }
        objArr[4] = list;
        objArr[5] = exploreOptionsModel;
        objArr[6] = Integer.valueOf(i10);
        objArr[7] = null;
        ExploreModel newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, ExploreModel exploreModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(exploreModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) exploreModel.getTitle());
        writer.i("subtitle");
        this.nullableStringAdapter.toJson(writer, (j) exploreModel.getSubtitle());
        writer.i("countryFlag");
        this.nullableStringAdapter.toJson(writer, (j) exploreModel.getCountryFlag());
        writer.i("type");
        this.stringAdapter.toJson(writer, (j) exploreModel.getType());
        writer.i("list");
        this.listOfAnyAdapter.toJson(writer, (j) exploreModel.getItemsList());
        writer.i("options");
        this.nullableExploreOptionsModelAdapter.toJson(writer, (j) exploreModel.getOptions());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(ExploreModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ExploreModel)";
    }
}
