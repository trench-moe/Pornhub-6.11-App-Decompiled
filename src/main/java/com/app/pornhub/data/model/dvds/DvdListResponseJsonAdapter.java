package com.app.pornhub.data.model.dvds;

import a1.a;
import com.app.pornhub.data.model.ErrorModel;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R4\u0010\u0018\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/app/pornhub/data/model/dvds/DvdListResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/dvds/DvdListResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/dvds/DvdModel;", "listOfDvdModelAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "nullableMapOfStringMapOfStringAnyAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DvdListResponseJsonAdapter extends f<DvdListResponse> {
    private final f<Integer> intAdapter;
    private final f<List<DvdModel>> listOfDvdModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final f<Map<String, Map<String, Object>>> nullableMapOfStringMapOfStringAnyAdapter;
    private final JsonReader.a options;

    public DvdListResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("dvds", "count", "orders", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"dvds\", \"count\", \"orders\",\n      \"error\")");
        this.options = a10;
        this.listOfDvdModelAdapter = a.e(moshi, jd.k.e(List.class, DvdModel.class), "dvds", "moshi.adapter(Types.newP…emptySet(),\n      \"dvds\")");
        this.intAdapter = android.support.v4.media.a.d(moshi, Integer.TYPE, "count", "moshi.adapter(Int::class…ava, emptySet(), \"count\")");
        this.nullableMapOfStringMapOfStringAnyAdapter = a.e(moshi, jd.k.e(Map.class, String.class, jd.k.e(Map.class, String.class, Object.class)), "orders", "moshi.adapter(Types.newP…ptySet(),\n      \"orders\")");
        this.nullableErrorModelAdapter = android.support.v4.media.a.d(moshi, ErrorModel.class, "error", "moshi.adapter(ErrorModel…ava, emptySet(), \"error\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public DvdListResponse fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        List<DvdModel> list = null;
        Integer num = null;
        Map<String, Map<String, Object>> map = null;
        ErrorModel errorModel = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                list = this.listOfDvdModelAdapter.fromJson(reader);
                if (list == null) {
                    JsonDataException n = c.n("dvds", "dvds", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"dvds\",\n            \"dvds\", reader)");
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
                map = this.nullableMapOfStringMapOfStringAnyAdapter.fromJson(reader);
            } else if (F == 3) {
                errorModel = this.nullableErrorModelAdapter.fromJson(reader);
            }
        }
        reader.e();
        if (list == null) {
            JsonDataException h10 = c.h("dvds", "dvds", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"dvds\", \"dvds\", reader)");
            throw h10;
        } else if (num != null) {
            return new DvdListResponse(list, num.intValue(), map, errorModel);
        } else {
            JsonDataException h11 = c.h("count", "count", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"count\", \"count\", reader)");
            throw h11;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, DvdListResponse dvdListResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(dvdListResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("dvds");
        this.listOfDvdModelAdapter.toJson(writer, (j) dvdListResponse.getDvds());
        writer.i("count");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(dvdListResponse.getCount()));
        writer.i("orders");
        this.nullableMapOfStringMapOfStringAnyAdapter.toJson(writer, (j) dvdListResponse.getOrders());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) dvdListResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(DvdListResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(DvdListResponse)";
    }
}
