package com.app.pornhub.data.model.channels;

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

@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/channels/ChannelModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/channels/ChannelModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "booleanAdapter", "nullableStringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ChannelModelJsonAdapter extends f<ChannelModel> {
    private final f<Boolean> booleanAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public ChannelModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "title", "rank", "avatar", "cover", "isPremium", "videoViewsCount", "videosCount", "subscribersCount", "username", "joinChannelLink", "website", "joined", "about");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"title\", \"rank\"…site\", \"joined\", \"about\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "isPremium", "moshi.adapter(Boolean::c…Set(),\n      \"isPremium\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "username", "moshi.adapter(String::cl…  emptySet(), \"username\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public ChannelModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Boolean bool = null;
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
        while (true) {
            String str14 = str11;
            String str15 = str10;
            String str16 = str9;
            String str17 = str8;
            String str18 = str7;
            String str19 = str6;
            Boolean bool2 = bool;
            String str20 = str5;
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
                } else if (str3 == null) {
                    JsonDataException h12 = c.h("rank", "rank", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"rank\", \"rank\", reader)");
                    throw h12;
                } else if (str4 == null) {
                    JsonDataException h13 = c.h("avatar", "avatar", reader);
                    Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"avatar\", \"avatar\", reader)");
                    throw h13;
                } else if (str20 == null) {
                    JsonDataException h14 = c.h("cover", "cover", reader);
                    Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"cover\", \"cover\", reader)");
                    throw h14;
                } else if (bool2 == null) {
                    JsonDataException h15 = c.h("isPremium", "isPremium", reader);
                    Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"isPremium\", \"isPremium\", reader)");
                    throw h15;
                } else {
                    boolean booleanValue = bool2.booleanValue();
                    if (str19 == null) {
                        JsonDataException h16 = c.h("videoViewsCount", "videoViewsCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"videoVi…videoViewsCount\", reader)");
                        throw h16;
                    } else if (str18 == null) {
                        JsonDataException h17 = c.h("videosCount", "videosCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"videosC…unt\",\n            reader)");
                        throw h17;
                    } else if (str17 != null) {
                        return new ChannelModel(str, str2, str3, str4, str20, booleanValue, str19, str18, str17, str16, str15, str14, str12, str13);
                    } else {
                        JsonDataException h18 = c.h("subscribersCount", "subscribersCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"subscri…ubscribersCount\", reader)");
                        throw h18;
                    }
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw n10;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n11 = c.n("rank", "rank", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"rank\", \"rank\",\n            reader)");
                        throw n11;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n12 = c.n("avatar", "avatar", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"avatar\",…        \"avatar\", reader)");
                        throw n12;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n13 = c.n("cover", "cover", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"cover\", …ver\",\n            reader)");
                        throw n13;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    continue;
                case 5:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n14 = c.n("isPremium", "isPremium", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"isPremiu…     \"isPremium\", reader)");
                        throw n14;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    break;
                case 6:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n15 = c.n("videoViewsCount", "videoViewsCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"videoVie…videoViewsCount\", reader)");
                        throw n15;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    bool = bool2;
                    break;
                case 7:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        JsonDataException n16 = c.n("videosCount", "videosCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"videosCo…\", \"videosCount\", reader)");
                        throw n16;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 8:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        JsonDataException n17 = c.n("subscribersCount", "subscribersCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"subscrib…ubscribersCount\", reader)");
                        throw n17;
                    }
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 9:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str14;
                    str10 = str15;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 10:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str14;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 11:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 12:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                case 13:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
                default:
                    str11 = str14;
                    str10 = str15;
                    str9 = str16;
                    str8 = str17;
                    str7 = str18;
                    str6 = str19;
                    bool = bool2;
                    break;
            }
            str5 = str20;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, ChannelModel channelModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(channelModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) channelModel.getId());
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) channelModel.getTitle());
        writer.i("rank");
        this.stringAdapter.toJson(writer, (j) channelModel.getRank());
        writer.i("avatar");
        this.stringAdapter.toJson(writer, (j) channelModel.getAvatar());
        writer.i("cover");
        this.stringAdapter.toJson(writer, (j) channelModel.getCover());
        writer.i("isPremium");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(channelModel.isPremium()));
        writer.i("videoViewsCount");
        this.stringAdapter.toJson(writer, (j) channelModel.getVideoViewsCount());
        writer.i("videosCount");
        this.stringAdapter.toJson(writer, (j) channelModel.getVideosCount());
        writer.i("subscribersCount");
        this.stringAdapter.toJson(writer, (j) channelModel.getSubscribersCount());
        writer.i("username");
        this.nullableStringAdapter.toJson(writer, (j) channelModel.getUsername());
        writer.i("joinChannelLink");
        this.nullableStringAdapter.toJson(writer, (j) channelModel.getJoinChannelLink());
        writer.i("website");
        this.nullableStringAdapter.toJson(writer, (j) channelModel.getWebsite());
        writer.i("joined");
        this.nullableStringAdapter.toJson(writer, (j) channelModel.getJoined());
        writer.i("about");
        this.nullableStringAdapter.toJson(writer, (j) channelModel.getAbout());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(ChannelModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(ChannelModel)";
    }
}
