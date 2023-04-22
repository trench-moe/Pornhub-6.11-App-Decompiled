package com.app.pornhub.data.model.update;

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

@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/app/pornhub/data/model/update/UpdateMetadataModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/update/UpdateMetadataModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "intAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", BuildConfig.FLAVOR, "nullableLongAdapter", BuildConfig.FLAVOR, "booleanAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UpdateMetadataModelJsonAdapter extends f<UpdateMetadataModel> {
    private final f<Boolean> booleanAdapter;
    private final f<Integer> intAdapter;
    private final f<Long> nullableLongAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public UpdateMetadataModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "application_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "checksum", "version_code", "version_name", "lenght", "url", "sdk", "extras", "creation_time", "mandatory", "changelog", "validated", "validation_time", "updated");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"application_id…idation_time\", \"updated\")");
        this.options = a10;
        this.intAdapter = a.d(moshi, Integer.TYPE, "id", "moshi.adapter(Int::class.java, emptySet(), \"id\")");
        this.stringAdapter = a.d(moshi, String.class, AppMeasurementSdk.ConditionalUserProperty.NAME, "moshi.adapter(String::cl…emptySet(),\n      \"name\")");
        this.nullableLongAdapter = a.d(moshi, Long.class, "lenght", "moshi.adapter(Long::clas…    emptySet(), \"lenght\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "isMandatory", "moshi.adapter(Boolean::c…t(),\n      \"isMandatory\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "changelog", "moshi.adapter(String::cl… emptySet(), \"changelog\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public UpdateMetadataModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        String str3 = null;
        Long l10 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        while (true) {
            Long l11 = l10;
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            String str10 = str6;
            String str11 = str5;
            Integer num5 = num4;
            String str12 = str4;
            String str13 = str3;
            Integer num6 = num3;
            String str14 = str2;
            String str15 = str;
            Integer num7 = num2;
            Integer num8 = num;
            if (!reader.h()) {
                reader.e();
                if (num8 == null) {
                    JsonDataException h10 = c.h("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
                    throw h10;
                }
                int intValue = num8.intValue();
                if (num7 == null) {
                    JsonDataException h11 = c.h("appId", "application_id", reader);
                    Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"appId\", \"application_id\", reader)");
                    throw h11;
                }
                int intValue2 = num7.intValue();
                if (str15 == null) {
                    JsonDataException h12 = c.h(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"name\", \"name\", reader)");
                    throw h12;
                } else if (str14 == null) {
                    JsonDataException h13 = c.h("checksum", "checksum", reader);
                    Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"checksum\", \"checksum\", reader)");
                    throw h13;
                } else if (num6 == null) {
                    JsonDataException h14 = c.h("versionCode", "version_code", reader);
                    Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"version…ode\",\n            reader)");
                    throw h14;
                } else {
                    int intValue3 = num6.intValue();
                    if (str13 == null) {
                        JsonDataException h15 = c.h("versionName", "version_name", reader);
                        Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"version…ame\",\n            reader)");
                        throw h15;
                    } else if (str12 == null) {
                        JsonDataException h16 = c.h("url", "url", reader);
                        Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"url\", \"url\", reader)");
                        throw h16;
                    } else if (num5 == null) {
                        JsonDataException h17 = c.h("sdk", "sdk", reader);
                        Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"sdk\", \"sdk\", reader)");
                        throw h17;
                    } else {
                        int intValue4 = num5.intValue();
                        if (str11 == null) {
                            JsonDataException h18 = c.h("extras", "extras", reader);
                            Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"extras\", \"extras\", reader)");
                            throw h18;
                        } else if (str10 == null) {
                            JsonDataException h19 = c.h("creationTime", "creation_time", reader);
                            Intrinsics.checkNotNullExpressionValue(h19, "missingProperty(\"creatio…ime\",\n            reader)");
                            throw h19;
                        } else if (bool4 == null) {
                            JsonDataException h20 = c.h("isMandatory", "mandatory", reader);
                            Intrinsics.checkNotNullExpressionValue(h20, "missingProperty(\"isManda…ry\", \"mandatory\", reader)");
                            throw h20;
                        } else {
                            boolean booleanValue = bool4.booleanValue();
                            if (bool3 == null) {
                                JsonDataException h21 = c.h("isValidated", "validated", reader);
                                Intrinsics.checkNotNullExpressionValue(h21, "missingProperty(\"isValid…ed\", \"validated\", reader)");
                                throw h21;
                            }
                            boolean booleanValue2 = bool3.booleanValue();
                            if (str8 == null) {
                                JsonDataException h22 = c.h("validationTime", "validation_time", reader);
                                Intrinsics.checkNotNullExpressionValue(h22, "missingProperty(\"validat…validation_time\", reader)");
                                throw h22;
                            } else if (str9 != null) {
                                return new UpdateMetadataModel(intValue, intValue2, str15, str14, intValue3, str13, l11, str12, intValue4, str11, str10, booleanValue, str7, booleanValue2, str8, str9);
                            } else {
                                JsonDataException h23 = c.h("updated", "updated", reader);
                                Intrinsics.checkNotNullExpressionValue(h23, "missingProperty(\"updated\", \"updated\", reader)");
                                throw h23;
                            }
                        }
                    }
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 0:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    continue;
                case 1:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        JsonDataException n10 = c.n("appId", "application_id", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"appId\",\n…\"application_id\", reader)");
                        throw n10;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n11 = c.n(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"name\", \"name\",\n            reader)");
                        throw n11;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    num2 = num7;
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n12 = c.n("checksum", "checksum", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"checksum…      \"checksum\", reader)");
                        throw n12;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str = str15;
                    num2 = num7;
                    break;
                case 4:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        JsonDataException n13 = c.n("versionCode", "version_code", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"versionC…  \"version_code\", reader)");
                        throw n13;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n14 = c.n("versionName", "version_name", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"versionN…, \"version_name\", reader)");
                        throw n14;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 6:
                    l10 = this.nullableLongAdapter.fromJson(reader);
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 7:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n15 = c.n("url", "url", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"url\", \"url\", reader)");
                        throw n15;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 8:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        JsonDataException n16 = c.n("sdk", "sdk", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"sdk\", \"sdk\", reader)");
                        throw n16;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 9:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n17 = c.n("extras", "extras", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"extras\",…        \"extras\", reader)");
                        throw n17;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 10:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n18 = c.n("creationTime", "creation_time", reader);
                        Intrinsics.checkNotNullExpressionValue(n18, "unexpectedNull(\"creation… \"creation_time\", reader)");
                        throw n18;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 11:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n19 = c.n("isMandatory", "mandatory", reader);
                        Intrinsics.checkNotNullExpressionValue(n19, "unexpectedNull(\"isMandatory\", \"mandatory\", reader)");
                        throw n19;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 12:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 13:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        JsonDataException n20 = c.n("isValidated", "validated", reader);
                        Intrinsics.checkNotNullExpressionValue(n20, "unexpectedNull(\"isValidated\", \"validated\", reader)");
                        throw n20;
                    }
                    l10 = l11;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 14:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        JsonDataException n21 = c.n("validationTime", "validation_time", reader);
                        Intrinsics.checkNotNullExpressionValue(n21, "unexpectedNull(\"validati…validation_time\", reader)");
                        throw n21;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                case 15:
                    str9 = this.stringAdapter.fromJson(reader);
                    if (str9 == null) {
                        JsonDataException n22 = c.n("updated", "updated", reader);
                        Intrinsics.checkNotNullExpressionValue(n22, "unexpectedNull(\"updated\"…       \"updated\", reader)");
                        throw n22;
                    }
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
                default:
                    l10 = l11;
                    bool2 = bool3;
                    bool = bool4;
                    str6 = str10;
                    str5 = str11;
                    num4 = num5;
                    str4 = str12;
                    str3 = str13;
                    num3 = num6;
                    str2 = str14;
                    str = str15;
                    num2 = num7;
                    break;
            }
            num = num8;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, UpdateMetadataModel updateMetadataModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(updateMetadataModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(updateMetadataModel.getId()));
        writer.i("application_id");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(updateMetadataModel.getAppId()));
        writer.i(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getName());
        writer.i("checksum");
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getChecksum());
        writer.i("version_code");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(updateMetadataModel.getVersionCode()));
        writer.i("version_name");
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getVersionName());
        writer.i("lenght");
        this.nullableLongAdapter.toJson(writer, (j) updateMetadataModel.getLenght());
        writer.i("url");
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getUrl());
        writer.i("sdk");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(updateMetadataModel.getSdk()));
        writer.i("extras");
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getExtras());
        writer.i("creation_time");
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getCreationTime());
        writer.i("mandatory");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(updateMetadataModel.isMandatory()));
        writer.i("changelog");
        this.nullableStringAdapter.toJson(writer, (j) updateMetadataModel.getChangelog());
        writer.i("validated");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(updateMetadataModel.isValidated()));
        writer.i("validation_time");
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getValidationTime());
        writer.i("updated");
        this.stringAdapter.toJson(writer, (j) updateMetadataModel.getUpdated());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(UpdateMetadataModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UpdateMetadataModel)";
    }
}
