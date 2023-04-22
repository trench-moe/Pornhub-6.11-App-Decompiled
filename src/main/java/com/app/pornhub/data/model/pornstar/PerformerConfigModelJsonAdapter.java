package com.app.pornhub.data.model.pornstar;

import a1.a;
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

@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerConfigModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformerConfigModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/pornstar/PerformerOptionsModel;", "listOfPerformerOptionsModelAdapter", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformerAdditionalFiltersModel;", "nullableListOfPerformerAdditionalFiltersModelAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformerConfigModelJsonAdapter extends f<PerformerConfigModel> {
    private volatile Constructor<PerformerConfigModel> constructorRef;
    private final f<List<PerformerOptionsModel>> listOfPerformerOptionsModelAdapter;
    private final f<List<PerformerAdditionalFiltersModel>> nullableListOfPerformerAdditionalFiltersModelAdapter;
    private final JsonReader.a options;

    public PerformerConfigModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("options", "additionalFilters");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"options\", \"additionalFilters\")");
        this.options = a10;
        this.listOfPerformerOptionsModelAdapter = a.e(moshi, jd.k.e(List.class, PerformerOptionsModel.class), "options", "moshi.adapter(Types.newP…   emptySet(), \"options\")");
        this.nullableListOfPerformerAdditionalFiltersModelAdapter = a.e(moshi, jd.k.e(List.class, PerformerAdditionalFiltersModel.class), "additionalFilters", "moshi.adapter(Types.newP…t(), \"additionalFilters\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public PerformerConfigModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        List<PerformerOptionsModel> list = null;
        List<PerformerAdditionalFiltersModel> list2 = null;
        int i10 = -1;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                list = this.listOfPerformerOptionsModelAdapter.fromJson(reader);
                if (list == null) {
                    JsonDataException n = c.n("options_", "options", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"options_\", \"options\", reader)");
                    throw n;
                }
            } else if (F == 1) {
                list2 = this.nullableListOfPerformerAdditionalFiltersModelAdapter.fromJson(reader);
                i10 &= -3;
            }
        }
        reader.e();
        if (i10 == -3) {
            if (list != null) {
                return new PerformerConfigModel(list, list2);
            }
            JsonDataException h10 = c.h("options_", "options", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"options_\", \"options\", reader)");
            throw h10;
        }
        Constructor<PerformerConfigModel> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PerformerConfigModel.class.getDeclaredConstructor(List.class, List.class, Integer.TYPE, c.f12069c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "PerformerConfigModel::cl…his.constructorRef = it }");
        }
        Object[] objArr = new Object[4];
        if (list == null) {
            JsonDataException h11 = c.h("options_", "options", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"options_\", \"options\", reader)");
            throw h11;
        }
        objArr[0] = list;
        objArr[1] = list2;
        objArr[2] = Integer.valueOf(i10);
        objArr[3] = null;
        PerformerConfigModel newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PerformerConfigModel performerConfigModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(performerConfigModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("options");
        this.listOfPerformerOptionsModelAdapter.toJson(writer, (j) performerConfigModel.getOptions());
        writer.i("additionalFilters");
        this.nullableListOfPerformerAdditionalFiltersModelAdapter.toJson(writer, (j) performerConfigModel.getAdditionalFilters());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PerformerConfigModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PerformerConfigModel)";
    }
}
