package com.app.pornhub.data.model.dvds;

import android.support.v4.media.a;
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

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/dvds/DvdModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/dvds/DvdModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "booleanAdapter", BuildConfig.FLAVOR, "nullableListOfDvdModelAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DvdModelJsonAdapter extends f<DvdModel> {
    private final f<Boolean> booleanAdapter;
    private final f<List<DvdModel>> nullableListOfDvdModelAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public DvdModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "title", "isPremium", "isHd", "fromChannel", "videosCount", "viewsCount", "cover", "channelId", "dvdSeries", "description", "duration");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"title\", \"isPre…description\", \"duration\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "isPremium", "moshi.adapter(Boolean::c…Set(),\n      \"isPremium\")");
        this.nullableListOfDvdModelAdapter = a1.a.e(moshi, jd.k.e(List.class, DvdModel.class), "dvdSeries", "moshi.adapter(Types.newP…Set(),\n      \"dvdSeries\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "description", "moshi.adapter(String::cl…mptySet(), \"description\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public DvdModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List<DvdModel> list = null;
        String str8 = null;
        String str9 = null;
        while (true) {
            String str10 = str9;
            String str11 = str8;
            List<DvdModel> list2 = list;
            String str12 = str7;
            String str13 = str6;
            String str14 = str5;
            String str15 = str4;
            String str16 = str3;
            if (!reader.h()) {
                reader.e();
                if (str == null) {
                    JsonDataException h10 = c.h("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
                    throw h10;
                } else if (str2 == null) {
                    JsonDataException h11 = c.h("title", "title", reader);
                    Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"title\", \"title\", reader)");
                    throw h11;
                } else if (bool == null) {
                    JsonDataException h12 = c.h("isPremium", "isPremium", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"isPremium\", \"isPremium\", reader)");
                    throw h12;
                } else {
                    boolean booleanValue = bool.booleanValue();
                    if (bool2 == null) {
                        JsonDataException h13 = c.h("isHd", "isHd", reader);
                        Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"isHd\", \"isHd\", reader)");
                        throw h13;
                    }
                    boolean booleanValue2 = bool2.booleanValue();
                    if (str16 == null) {
                        JsonDataException h14 = c.h("fromChannel", "fromChannel", reader);
                        Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"fromCha…nel\",\n            reader)");
                        throw h14;
                    } else if (str15 == null) {
                        JsonDataException h15 = c.h("videosCount", "videosCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"videosC…unt\",\n            reader)");
                        throw h15;
                    } else if (str14 == null) {
                        JsonDataException h16 = c.h("viewsCount", "viewsCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"viewsCo…t\", \"viewsCount\", reader)");
                        throw h16;
                    } else if (str13 == null) {
                        JsonDataException h17 = c.h("cover", "cover", reader);
                        Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"cover\", \"cover\", reader)");
                        throw h17;
                    } else if (str12 != null) {
                        return new DvdModel(str, str2, booleanValue, booleanValue2, str16, str15, str14, str13, str12, list2, str11, str10);
                    } else {
                        JsonDataException h18 = c.h("channelId", "channelId", reader);
                        Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"channelId\", \"channelId\", reader)");
                        throw h18;
                    }
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw n10;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 2:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n11 = c.n("isPremium", "isPremium", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"isPremiu…     \"isPremium\", reader)");
                        throw n11;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        JsonDataException n12 = c.n("isHd", "isHd", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"isHd\", \"isHd\",\n            reader)");
                        throw n12;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 4:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n13 = c.n("fromChannel", "fromChannel", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"fromChan…\", \"fromChannel\", reader)");
                        throw n13;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    continue;
                case 5:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n14 = c.n("videosCount", "videosCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"videosCo…\", \"videosCount\", reader)");
                        throw n14;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    break;
                case 6:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n15 = c.n("viewsCount", "viewsCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"viewsCou…    \"viewsCount\", reader)");
                        throw n15;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str4 = str15;
                    break;
                case 7:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n16 = c.n("cover", "cover", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"cover\", …ver\",\n            reader)");
                        throw n16;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 8:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        JsonDataException n17 = c.n("channelId", "channelId", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"channelI…     \"channelId\", reader)");
                        throw n17;
                    }
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 9:
                    list = this.nullableListOfDvdModelAdapter.fromJson(reader);
                    str9 = str10;
                    str8 = str11;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 10:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    str9 = str10;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                case 11:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
                default:
                    str9 = str10;
                    str8 = str11;
                    list = list2;
                    str7 = str12;
                    str6 = str13;
                    str5 = str14;
                    str4 = str15;
                    break;
            }
            str3 = str16;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, DvdModel dvdModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(dvdModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) dvdModel.getId());
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) dvdModel.getTitle());
        writer.i("isPremium");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(dvdModel.isPremium()));
        writer.i("isHd");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(dvdModel.isHd()));
        writer.i("fromChannel");
        this.stringAdapter.toJson(writer, (j) dvdModel.getFromChannel());
        writer.i("videosCount");
        this.stringAdapter.toJson(writer, (j) dvdModel.getVideosCount());
        writer.i("viewsCount");
        this.stringAdapter.toJson(writer, (j) dvdModel.getViewsCount());
        writer.i("cover");
        this.stringAdapter.toJson(writer, (j) dvdModel.getCover());
        writer.i("channelId");
        this.stringAdapter.toJson(writer, (j) dvdModel.getChannelId());
        writer.i("dvdSeries");
        this.nullableListOfDvdModelAdapter.toJson(writer, (j) dvdModel.getDvdSeries());
        writer.i("description");
        this.nullableStringAdapter.toJson(writer, (j) dvdModel.getDescription());
        writer.i("duration");
        this.nullableStringAdapter.toJson(writer, (j) dvdModel.getDuration());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(DvdModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(DvdModel)";
    }
}
