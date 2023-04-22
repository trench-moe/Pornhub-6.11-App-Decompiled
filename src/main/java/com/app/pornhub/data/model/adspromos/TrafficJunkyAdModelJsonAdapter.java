package com.app.pornhub.data.model.adspromos;

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

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/adspromos/TrafficJunkyAdModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/adspromos/TrafficJunkyAdModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class TrafficJunkyAdModelJsonAdapter extends f<TrafficJunkyAdModel> {
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public TrafficJunkyAdModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("third_party_name", "adtool_uuid", "creative_id", "tj_uuid", "media_type", "adtool_impression_id", "link", "tj_impression_id", "campaign_id", "request_id", "html", "spot_id", "img_url", "remote_call_time");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"third_party_name\", \"…url\", \"remote_call_time\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "thirdPartyName", "moshi.adapter(String::cl…,\n      \"thirdPartyName\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public TrafficJunkyAdModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (true) {
            String str15 = str12;
            String str16 = str11;
            String str17 = str10;
            String str18 = str9;
            String str19 = str8;
            String str20 = str7;
            String str21 = str6;
            String str22 = str5;
            String str23 = str4;
            String str24 = str3;
            String str25 = str2;
            String str26 = str;
            if (!reader.h()) {
                reader.e();
                if (str26 == null) {
                    JsonDataException h10 = c.h("thirdPartyName", "third_party_name", reader);
                    Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"thirdPa…hird_party_name\", reader)");
                    throw h10;
                } else if (str25 == null) {
                    JsonDataException h11 = c.h("adToolUuid", "adtool_uuid", reader);
                    Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"adToolU…\", \"adtool_uuid\", reader)");
                    throw h11;
                } else if (str24 == null) {
                    JsonDataException h12 = c.h("creativeId", "creative_id", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"creativ…\", \"creative_id\", reader)");
                    throw h12;
                } else if (str23 == null) {
                    JsonDataException h13 = c.h("tjUuid", "tj_uuid", reader);
                    Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"tjUuid\", \"tj_uuid\", reader)");
                    throw h13;
                } else if (str22 == null) {
                    JsonDataException h14 = c.h("mediaType", "media_type", reader);
                    Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"mediaType\", \"media_type\", reader)");
                    throw h14;
                } else if (str21 == null) {
                    JsonDataException h15 = c.h("adToolImpressionId", "adtool_impression_id", reader);
                    Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"adToolI…l_impression_id\", reader)");
                    throw h15;
                } else if (str20 == null) {
                    JsonDataException h16 = c.h("link", "link", reader);
                    Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"link\", \"link\", reader)");
                    throw h16;
                } else if (str19 == null) {
                    JsonDataException h17 = c.h("tjImpressionId", "tj_impression_id", reader);
                    Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"tjImpre…j_impression_id\", reader)");
                    throw h17;
                } else if (str18 == null) {
                    JsonDataException h18 = c.h("campaignId", "campaign_id", reader);
                    Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"campaig…\", \"campaign_id\", reader)");
                    throw h18;
                } else if (str17 == null) {
                    JsonDataException h19 = c.h("requestId", "request_id", reader);
                    Intrinsics.checkNotNullExpressionValue(h19, "missingProperty(\"requestId\", \"request_id\", reader)");
                    throw h19;
                } else if (str16 == null) {
                    JsonDataException h20 = c.h("html", "html", reader);
                    Intrinsics.checkNotNullExpressionValue(h20, "missingProperty(\"html\", \"html\", reader)");
                    throw h20;
                } else if (str15 == null) {
                    JsonDataException h21 = c.h("spotId", "spot_id", reader);
                    Intrinsics.checkNotNullExpressionValue(h21, "missingProperty(\"spotId\", \"spot_id\", reader)");
                    throw h21;
                } else if (str13 == null) {
                    JsonDataException h22 = c.h("imgUrl", "img_url", reader);
                    Intrinsics.checkNotNullExpressionValue(h22, "missingProperty(\"imgUrl\", \"img_url\", reader)");
                    throw h22;
                } else if (str14 != null) {
                    return new TrafficJunkyAdModel(str26, str25, str24, str23, str22, str21, str20, str19, str18, str17, str16, str15, str13, str14);
                } else {
                    JsonDataException h23 = c.h("remoteCallTime", "remote_call_time", reader);
                    Intrinsics.checkNotNullExpressionValue(h23, "missingProperty(\"remoteC…emote_call_time\", reader)");
                    throw h23;
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("thirdPartyName", "third_party_name", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"thirdPar…hird_party_name\", reader)");
                        throw n;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("adToolUuid", "adtool_uuid", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"adToolUu…   \"adtool_uuid\", reader)");
                        throw n10;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n11 = c.n("creativeId", "creative_id", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"creative…   \"creative_id\", reader)");
                        throw n11;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str2 = str25;
                    break;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n12 = c.n("tjUuid", "tj_uuid", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"tjUuid\",…       \"tj_uuid\", reader)");
                        throw n12;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n13 = c.n("mediaType", "media_type", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"mediaTyp…    \"media_type\", reader)");
                        throw n13;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 5:
                    String fromJson = this.stringAdapter.fromJson(reader);
                    if (fromJson == null) {
                        JsonDataException n14 = c.n("adToolImpressionId", "adtool_impression_id", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"adToolIm…l_impression_id\", reader)");
                        throw n14;
                    }
                    str6 = fromJson;
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 6:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        JsonDataException n15 = c.n("link", "link", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"link\", \"link\",\n            reader)");
                        throw n15;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 7:
                    String fromJson2 = this.stringAdapter.fromJson(reader);
                    if (fromJson2 == null) {
                        JsonDataException n16 = c.n("tjImpressionId", "tj_impression_id", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"tjImpres…j_impression_id\", reader)");
                        throw n16;
                    }
                    str8 = fromJson2;
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 8:
                    String fromJson3 = this.stringAdapter.fromJson(reader);
                    if (fromJson3 == null) {
                        JsonDataException n17 = c.n("campaignId", "campaign_id", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"campaign…   \"campaign_id\", reader)");
                        throw n17;
                    }
                    str9 = fromJson3;
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 9:
                    str10 = this.stringAdapter.fromJson(reader);
                    if (str10 == null) {
                        JsonDataException n18 = c.n("requestId", "request_id", reader);
                        Intrinsics.checkNotNullExpressionValue(n18, "unexpectedNull(\"requestI…    \"request_id\", reader)");
                        throw n18;
                    }
                    str12 = str15;
                    str11 = str16;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 10:
                    str11 = this.stringAdapter.fromJson(reader);
                    if (str11 == null) {
                        JsonDataException n19 = c.n("html", "html", reader);
                        Intrinsics.checkNotNullExpressionValue(n19, "unexpectedNull(\"html\", \"html\",\n            reader)");
                        throw n19;
                    }
                    str12 = str15;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 11:
                    str12 = this.stringAdapter.fromJson(reader);
                    if (str12 == null) {
                        JsonDataException n20 = c.n("spotId", "spot_id", reader);
                        Intrinsics.checkNotNullExpressionValue(n20, "unexpectedNull(\"spotId\",…       \"spot_id\", reader)");
                        throw n20;
                    }
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 12:
                    str13 = this.stringAdapter.fromJson(reader);
                    if (str13 == null) {
                        JsonDataException n21 = c.n("imgUrl", "img_url", reader);
                        Intrinsics.checkNotNullExpressionValue(n21, "unexpectedNull(\"imgUrl\",…       \"img_url\", reader)");
                        throw n21;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                case 13:
                    str14 = this.stringAdapter.fromJson(reader);
                    if (str14 == null) {
                        JsonDataException n22 = c.n("remoteCallTime", "remote_call_time", reader);
                        Intrinsics.checkNotNullExpressionValue(n22, "unexpectedNull(\"remoteCa…emote_call_time\", reader)");
                        throw n22;
                    }
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
                default:
                    str12 = str15;
                    str11 = str16;
                    str10 = str17;
                    str9 = str18;
                    str8 = str19;
                    str7 = str20;
                    str6 = str21;
                    str5 = str22;
                    str4 = str23;
                    str3 = str24;
                    str2 = str25;
                    break;
            }
            str = str26;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, TrafficJunkyAdModel trafficJunkyAdModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(trafficJunkyAdModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("third_party_name");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getThirdPartyName());
        writer.i("adtool_uuid");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getAdToolUuid());
        writer.i("creative_id");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getCreativeId());
        writer.i("tj_uuid");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getTjUuid());
        writer.i("media_type");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getMediaType());
        writer.i("adtool_impression_id");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getAdToolImpressionId());
        writer.i("link");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getLink());
        writer.i("tj_impression_id");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getTjImpressionId());
        writer.i("campaign_id");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getCampaignId());
        writer.i("request_id");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getRequestId());
        writer.i("html");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getHtml());
        writer.i("spot_id");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getSpotId());
        writer.i("img_url");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getImgUrl());
        writer.i("remote_call_time");
        this.stringAdapter.toJson(writer, (j) trafficJunkyAdModel.getRemoteCallTime());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(TrafficJunkyAdModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(TrafficJunkyAdModel)";
    }
}
