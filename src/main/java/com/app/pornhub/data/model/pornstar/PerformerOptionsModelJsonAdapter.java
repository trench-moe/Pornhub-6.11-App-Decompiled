package com.app.pornhub.data.model.pornstar;

import android.support.v4.media.a;
import com.app.pornhub.domain.config.PerformersConfig;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/pornstar/PerformerOptionsModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/pornstar/PerformerOptionsModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PerformerOptionsModelJsonAdapter extends f<PerformerOptionsModel> {
    private volatile Constructor<PerformerOptionsModel> constructorRef;
    private final f<Map<String, String>> nullableMapOfStringStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PerformerOptionsModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("title", AppMeasurementSdk.ConditionalUserProperty.VALUE, PerformersConfig.TYPE_FILTER);
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"title\", \"value\", \"filter\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "title", "moshi.adapter(String::cl…mptySet(),\n      \"title\")");
        this.nullableMapOfStringStringAdapter = a1.a.e(moshi, jd.k.e(Map.class, String.class, String.class), PerformersConfig.TYPE_FILTER, "moshi.adapter(Types.newP…a), emptySet(), \"filter\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public PerformerOptionsModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i10 = -1;
        String str = null;
        String str2 = null;
        Map<String, String> map = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    JsonDataException n = c.n("title", "title", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"title\", …tle\",\n            reader)");
                    throw n;
                }
            } else if (F == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    JsonDataException n10 = c.n("value__", AppMeasurementSdk.ConditionalUserProperty.VALUE, reader);
                    Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"value__\"…         \"value\", reader)");
                    throw n10;
                }
            } else if (F == 2) {
                map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                i10 &= -5;
            }
        }
        reader.e();
        if (i10 == -5) {
            if (str == null) {
                JsonDataException h10 = c.h("title", "title", reader);
                Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"title\", \"title\", reader)");
                throw h10;
            } else if (str2 != null) {
                return new PerformerOptionsModel(str, str2, map);
            } else {
                JsonDataException h11 = c.h("value__", AppMeasurementSdk.ConditionalUserProperty.VALUE, reader);
                Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"value__\", \"value\", reader)");
                throw h11;
            }
        }
        Constructor<PerformerOptionsModel> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PerformerOptionsModel.class.getDeclaredConstructor(String.class, String.class, Map.class, Integer.TYPE, c.f12069c);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "PerformerOptionsModel::c…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        if (str == null) {
            JsonDataException h12 = c.h("title", "title", reader);
            Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"title\", \"title\", reader)");
            throw h12;
        }
        objArr[0] = str;
        if (str2 == null) {
            JsonDataException h13 = c.h("value__", AppMeasurementSdk.ConditionalUserProperty.VALUE, reader);
            Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"value__\", \"value\", reader)");
            throw h13;
        }
        objArr[1] = str2;
        objArr[2] = map;
        objArr[3] = Integer.valueOf(i10);
        objArr[4] = null;
        PerformerOptionsModel newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PerformerOptionsModel performerOptionsModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(performerOptionsModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) performerOptionsModel.getTitle());
        writer.i(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.stringAdapter.toJson(writer, (j) performerOptionsModel.getValue());
        writer.i(PerformersConfig.TYPE_FILTER);
        this.nullableMapOfStringStringAdapter.toJson(writer, (j) performerOptionsModel.getFilter());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PerformerOptionsModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PerformerOptionsModel)";
    }
}
