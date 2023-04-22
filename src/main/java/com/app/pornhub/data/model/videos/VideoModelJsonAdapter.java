package com.app.pornhub.data.model.videos;

import android.support.v4.media.a;
import com.app.pornhub.data.model.pornstar.PerformerVideoInfoModel;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.config.UsersConfig;
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

@Metadata(bv = {}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0011R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0011¨\u0006'"}, d2 = {"Lcom/app/pornhub/data/model/videos/VideoModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/videos/VideoModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "intAdapter", BuildConfig.FLAVOR, "longAdapter", BuildConfig.FLAVOR, "booleanAdapter", "nullableStringAdapter", "Lcom/app/pornhub/data/model/user/UserModel;", "userModelAdapter", "Lcom/app/pornhub/data/model/videos/EncodingsModel;", "nullableEncodingsModelAdapter", BuildConfig.FLAVOR, "Lcom/app/pornhub/data/model/pornstar/PerformerVideoInfoModel;", "nullableListOfPerformerVideoInfoModelAdapter", "nullableLongAdapter", "nullableBooleanAdapter", "nullableIntAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class VideoModelJsonAdapter extends f<VideoModel> {
    private final f<Boolean> booleanAdapter;
    private final f<Integer> intAdapter;
    private final f<Long> longAdapter;
    private final f<Boolean> nullableBooleanAdapter;
    private final f<EncodingsModel> nullableEncodingsModelAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<List<PerformerVideoInfoModel>> nullableListOfPerformerVideoInfoModelAdapter;
    private final f<Long> nullableLongAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;
    private final f<UserModel> userModelAdapter;

    public VideoModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "vkey", "title", "duration", "rating", "viewCount", "commentsCount", "approvedOn", "urlThumbnail", "urlThumbnail16x9", "webm", DvdsConfig.TYPE_QUALITY, "vr", "canSeeVideo", "isPrivate", "contentType", "isVerified", "isPaidVideo", "isAvailable", "price", "categories", "tags", "production", UsersConfig.USER_PREF_KEY, "encodings", SearchSuggestionsConfig.sourcePornstars, "addedOn", "isPaidToDownload", "vrProjectionType", "vrStereoSrc", "vrStereoType", "trackUrl", "channelLink", "channelTitle", "isActiveSponsor");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"vkey\", \"title\"…itle\", \"isActiveSponsor\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "duration", "moshi.adapter(Int::class…, emptySet(), \"duration\")");
        this.longAdapter = a.d(moshi, Long.TYPE, "approvedOn", "moshi.adapter(Long::clas…et(),\n      \"approvedOn\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, DvdsConfig.TYPE_QUALITY, "moshi.adapter(Boolean::c…, emptySet(),\n      \"hd\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "price", "moshi.adapter(String::cl…     emptySet(), \"price\")");
        this.userModelAdapter = a.d(moshi, UserModel.class, UsersConfig.USER_PREF_KEY, "moshi.adapter(UserModel:…      emptySet(), \"user\")");
        this.nullableEncodingsModelAdapter = a.d(moshi, EncodingsModel.class, "encodings", "moshi.adapter(EncodingsM… emptySet(), \"encodings\")");
        this.nullableListOfPerformerVideoInfoModelAdapter = a1.a.e(moshi, jd.k.e(List.class, PerformerVideoInfoModel.class), SearchSuggestionsConfig.sourcePornstars, "moshi.adapter(Types.newP… emptySet(), \"pornstars\")");
        this.nullableLongAdapter = a.d(moshi, Long.class, "addedOn", "moshi.adapter(Long::clas…   emptySet(), \"addedOn\")");
        this.nullableBooleanAdapter = a.d(moshi, Boolean.class, "isPaidToDownload", "moshi.adapter(Boolean::c…et(), \"isPaidToDownload\")");
        this.nullableIntAdapter = a.d(moshi, Integer.class, "vrProjectionType", "moshi.adapter(Int::class…et(), \"vrProjectionType\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public VideoModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        Integer num3 = null;
        Long l10 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
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
        UserModel userModel = null;
        EncodingsModel encodingsModel = null;
        List<PerformerVideoInfoModel> list = null;
        Long l11 = null;
        Boolean bool9 = null;
        Integer num4 = null;
        Boolean bool10 = null;
        Integer num5 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        while (true) {
            Boolean bool11 = bool8;
            Boolean bool12 = bool7;
            Boolean bool13 = bool6;
            Boolean bool14 = bool5;
            Boolean bool15 = bool4;
            Boolean bool16 = bool3;
            Boolean bool17 = bool2;
            Boolean bool18 = bool;
            Long l12 = l10;
            Integer num6 = num3;
            Integer num7 = num2;
            Integer num8 = num;
            String str16 = str2;
            String str17 = str;
            if (!reader.h()) {
                reader.e();
                if (str17 == null) {
                    JsonDataException h10 = c.h("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
                    throw h10;
                } else if (str16 == null) {
                    JsonDataException h11 = c.h("vkey", "vkey", reader);
                    Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"vkey\", \"vkey\", reader)");
                    throw h11;
                } else if (str3 == null) {
                    JsonDataException h12 = c.h("title", "title", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"title\", \"title\", reader)");
                    throw h12;
                } else if (num8 == null) {
                    JsonDataException h13 = c.h("duration", "duration", reader);
                    Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"duration\", \"duration\", reader)");
                    throw h13;
                } else {
                    int intValue = num8.intValue();
                    if (num7 == null) {
                        JsonDataException h14 = c.h("rating", "rating", reader);
                        Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"rating\", \"rating\", reader)");
                        throw h14;
                    }
                    int intValue2 = num7.intValue();
                    if (num6 == null) {
                        JsonDataException h15 = c.h("viewCount", "viewCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"viewCount\", \"viewCount\", reader)");
                        throw h15;
                    }
                    int intValue3 = num6.intValue();
                    if (str4 == null) {
                        JsonDataException h16 = c.h("commentsCount", "commentsCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"comment… \"commentsCount\", reader)");
                        throw h16;
                    } else if (l12 == null) {
                        JsonDataException h17 = c.h("approvedOn", "approvedOn", reader);
                        Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"approve…n\", \"approvedOn\", reader)");
                        throw h17;
                    } else {
                        long longValue = l12.longValue();
                        if (str5 == null) {
                            JsonDataException h18 = c.h("urlThumbnail", "urlThumbnail", reader);
                            Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"urlThum…ail\",\n            reader)");
                            throw h18;
                        } else if (str6 == null) {
                            JsonDataException h19 = c.h("urlThumbnail16x9", "urlThumbnail16x9", reader);
                            Intrinsics.checkNotNullExpressionValue(h19, "missingProperty(\"urlThum…rlThumbnail16x9\", reader)");
                            throw h19;
                        } else if (str7 == null) {
                            JsonDataException h20 = c.h("webm", "webm", reader);
                            Intrinsics.checkNotNullExpressionValue(h20, "missingProperty(\"webm\", \"webm\", reader)");
                            throw h20;
                        } else if (bool18 == null) {
                            JsonDataException h21 = c.h(DvdsConfig.TYPE_QUALITY, DvdsConfig.TYPE_QUALITY, reader);
                            Intrinsics.checkNotNullExpressionValue(h21, "missingProperty(\"hd\", \"hd\", reader)");
                            throw h21;
                        } else {
                            boolean booleanValue = bool18.booleanValue();
                            if (bool17 == null) {
                                JsonDataException h22 = c.h("vr", "vr", reader);
                                Intrinsics.checkNotNullExpressionValue(h22, "missingProperty(\"vr\", \"vr\", reader)");
                                throw h22;
                            }
                            boolean booleanValue2 = bool17.booleanValue();
                            if (bool16 == null) {
                                JsonDataException h23 = c.h("canSeeVideo", "canSeeVideo", reader);
                                Intrinsics.checkNotNullExpressionValue(h23, "missingProperty(\"canSeeV…deo\",\n            reader)");
                                throw h23;
                            }
                            boolean booleanValue3 = bool16.booleanValue();
                            if (bool15 == null) {
                                JsonDataException h24 = c.h("isPrivate", "isPrivate", reader);
                                Intrinsics.checkNotNullExpressionValue(h24, "missingProperty(\"isPrivate\", \"isPrivate\", reader)");
                                throw h24;
                            }
                            boolean booleanValue4 = bool15.booleanValue();
                            if (str8 == null) {
                                JsonDataException h25 = c.h("contentType", "contentType", reader);
                                Intrinsics.checkNotNullExpressionValue(h25, "missingProperty(\"content…ype\",\n            reader)");
                                throw h25;
                            } else if (bool14 == null) {
                                JsonDataException h26 = c.h("isVerified", "isVerified", reader);
                                Intrinsics.checkNotNullExpressionValue(h26, "missingProperty(\"isVerif…d\", \"isVerified\", reader)");
                                throw h26;
                            } else {
                                boolean booleanValue5 = bool14.booleanValue();
                                if (bool13 == null) {
                                    JsonDataException h27 = c.h("isPaidVideo", "isPaidVideo", reader);
                                    Intrinsics.checkNotNullExpressionValue(h27, "missingProperty(\"isPaidV…deo\",\n            reader)");
                                    throw h27;
                                }
                                boolean booleanValue6 = bool13.booleanValue();
                                if (bool12 == null) {
                                    JsonDataException h28 = c.h("isAvailable", "isAvailable", reader);
                                    Intrinsics.checkNotNullExpressionValue(h28, "missingProperty(\"isAvail…ble\",\n            reader)");
                                    throw h28;
                                }
                                boolean booleanValue7 = bool12.booleanValue();
                                if (userModel == null) {
                                    JsonDataException h29 = c.h(UsersConfig.USER_PREF_KEY, UsersConfig.USER_PREF_KEY, reader);
                                    Intrinsics.checkNotNullExpressionValue(h29, "missingProperty(\"user\", \"user\", reader)");
                                    throw h29;
                                } else if (bool11 == null) {
                                    JsonDataException h30 = c.h("isActiveSponsor", "isActiveSponsor", reader);
                                    Intrinsics.checkNotNullExpressionValue(h30, "missingProperty(\"isActiv…isActiveSponsor\", reader)");
                                    throw h30;
                                } else {
                                    return new VideoModel(str17, str16, str3, intValue, intValue2, intValue3, str4, longValue, str5, str6, str7, booleanValue, booleanValue2, booleanValue3, booleanValue4, str8, booleanValue5, booleanValue6, booleanValue7, str9, str10, str11, str12, userModel, encodingsModel, list, l11, bool9, num4, bool10, num5, str13, str14, str15, bool11.booleanValue());
                                }
                            }
                        }
                    }
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    continue;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("vkey", "vkey", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"vkey\", \"vkey\",\n            reader)");
                        throw n10;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n11 = c.n("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw n11;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        JsonDataException n12 = c.n("duration", "duration", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"duration…      \"duration\", reader)");
                        throw n12;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    str2 = str16;
                    break;
                case 4:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        JsonDataException n13 = c.n("rating", "rating", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"rating\",…ing\",\n            reader)");
                        throw n13;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num = num8;
                    str2 = str16;
                    break;
                case 5:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        JsonDataException n14 = c.n("viewCount", "viewCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"viewCoun…     \"viewCount\", reader)");
                        throw n14;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 6:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n15 = c.n("commentsCount", "commentsCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"comments… \"commentsCount\", reader)");
                        throw n15;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 7:
                    l10 = this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        JsonDataException n16 = c.n("approvedOn", "approvedOn", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"approved…    \"approvedOn\", reader)");
                        throw n16;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 8:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n17 = c.n("urlThumbnail", "urlThumbnail", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"urlThumb…, \"urlThumbnail\", reader)");
                        throw n17;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 9:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n18 = c.n("urlThumbnail16x9", "urlThumbnail16x9", reader);
                        Intrinsics.checkNotNullExpressionValue(n18, "unexpectedNull(\"urlThumb…rlThumbnail16x9\", reader)");
                        throw n18;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 10:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        JsonDataException n19 = c.n("webm", "webm", reader);
                        Intrinsics.checkNotNullExpressionValue(n19, "unexpectedNull(\"webm\", \"webm\",\n            reader)");
                        throw n19;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 11:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n20 = c.n(DvdsConfig.TYPE_QUALITY, DvdsConfig.TYPE_QUALITY, reader);
                        Intrinsics.checkNotNullExpressionValue(n20, "unexpectedNull(\"hd\", \"hd\", reader)");
                        throw n20;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 12:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        JsonDataException n21 = c.n("vr", "vr", reader);
                        Intrinsics.checkNotNullExpressionValue(n21, "unexpectedNull(\"vr\", \"vr\", reader)");
                        throw n21;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 13:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        JsonDataException n22 = c.n("canSeeVideo", "canSeeVideo", reader);
                        Intrinsics.checkNotNullExpressionValue(n22, "unexpectedNull(\"canSeeVi…\", \"canSeeVideo\", reader)");
                        throw n22;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 14:
                    bool4 = this.booleanAdapter.fromJson(reader);
                    if (bool4 == null) {
                        JsonDataException n23 = c.n("isPrivate", "isPrivate", reader);
                        Intrinsics.checkNotNullExpressionValue(n23, "unexpectedNull(\"isPrivat…     \"isPrivate\", reader)");
                        throw n23;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 15:
                    str8 = this.stringAdapter.fromJson(reader);
                    if (str8 == null) {
                        JsonDataException n24 = c.n("contentType", "contentType", reader);
                        Intrinsics.checkNotNullExpressionValue(n24, "unexpectedNull(\"contentT…\", \"contentType\", reader)");
                        throw n24;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 16:
                    bool5 = this.booleanAdapter.fromJson(reader);
                    if (bool5 == null) {
                        JsonDataException n25 = c.n("isVerified", "isVerified", reader);
                        Intrinsics.checkNotNullExpressionValue(n25, "unexpectedNull(\"isVerified\", \"isVerified\", reader)");
                        throw n25;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 17:
                    bool6 = this.booleanAdapter.fromJson(reader);
                    if (bool6 == null) {
                        JsonDataException n26 = c.n("isPaidVideo", "isPaidVideo", reader);
                        Intrinsics.checkNotNullExpressionValue(n26, "unexpectedNull(\"isPaidVi…\", \"isPaidVideo\", reader)");
                        throw n26;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 18:
                    bool7 = this.booleanAdapter.fromJson(reader);
                    if (bool7 == null) {
                        JsonDataException n27 = c.n("isAvailable", "isAvailable", reader);
                        Intrinsics.checkNotNullExpressionValue(n27, "unexpectedNull(\"isAvaila…\", \"isAvailable\", reader)");
                        throw n27;
                    }
                    bool8 = bool11;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 19:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 20:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 21:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 22:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 23:
                    userModel = this.userModelAdapter.fromJson(reader);
                    if (userModel == null) {
                        JsonDataException n28 = c.n(UsersConfig.USER_PREF_KEY, UsersConfig.USER_PREF_KEY, reader);
                        Intrinsics.checkNotNullExpressionValue(n28, "unexpectedNull(\"user\", \"user\",\n            reader)");
                        throw n28;
                    }
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 24:
                    encodingsModel = this.nullableEncodingsModelAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 25:
                    list = this.nullableListOfPerformerVideoInfoModelAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 26:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 27:
                    bool9 = this.nullableBooleanAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 28:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 29:
                    bool10 = this.nullableBooleanAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 30:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 31:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 32:
                    str14 = this.nullableStringAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 33:
                    str15 = this.nullableStringAdapter.fromJson(reader);
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                case 34:
                    Boolean fromJson = this.booleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        JsonDataException n29 = c.n("isActiveSponsor", "isActiveSponsor", reader);
                        Intrinsics.checkNotNullExpressionValue(n29, "unexpectedNull(\"isActive…isActiveSponsor\", reader)");
                        throw n29;
                    }
                    bool8 = fromJson;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
                default:
                    bool8 = bool11;
                    bool7 = bool12;
                    bool6 = bool13;
                    bool5 = bool14;
                    bool4 = bool15;
                    bool3 = bool16;
                    bool2 = bool17;
                    bool = bool18;
                    l10 = l12;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str2 = str16;
                    break;
            }
            str = str17;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, VideoModel videoModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(videoModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) videoModel.getId());
        writer.i("vkey");
        this.stringAdapter.toJson(writer, (j) videoModel.getVkey());
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) videoModel.getTitle());
        writer.i("duration");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(videoModel.getDuration()));
        writer.i("rating");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(videoModel.getRating()));
        writer.i("viewCount");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(videoModel.getViewCount()));
        writer.i("commentsCount");
        this.stringAdapter.toJson(writer, (j) videoModel.getCommentsCount());
        writer.i("approvedOn");
        this.longAdapter.toJson(writer, (j) Long.valueOf(videoModel.getApprovedOn()));
        writer.i("urlThumbnail");
        this.stringAdapter.toJson(writer, (j) videoModel.getUrlThumbnail());
        writer.i("urlThumbnail16x9");
        this.stringAdapter.toJson(writer, (j) videoModel.getUrlThumbnail16x9());
        writer.i("webm");
        this.stringAdapter.toJson(writer, (j) videoModel.getWebm());
        writer.i(DvdsConfig.TYPE_QUALITY);
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.getHd()));
        writer.i("vr");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.getVr()));
        writer.i("canSeeVideo");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.getCanSeeVideo()));
        writer.i("isPrivate");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.isPrivate()));
        writer.i("contentType");
        this.stringAdapter.toJson(writer, (j) videoModel.getContentType());
        writer.i("isVerified");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.isVerified()));
        writer.i("isPaidVideo");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.isPaidVideo()));
        writer.i("isAvailable");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.isAvailable()));
        writer.i("price");
        this.nullableStringAdapter.toJson(writer, (j) videoModel.getPrice());
        writer.i("categories");
        this.nullableStringAdapter.toJson(writer, (j) videoModel.getCategories());
        writer.i("tags");
        this.nullableStringAdapter.toJson(writer, (j) videoModel.getTags());
        writer.i("production");
        this.nullableStringAdapter.toJson(writer, (j) videoModel.getProduction());
        writer.i(UsersConfig.USER_PREF_KEY);
        this.userModelAdapter.toJson(writer, (j) videoModel.getUser());
        writer.i("encodings");
        this.nullableEncodingsModelAdapter.toJson(writer, (j) videoModel.getEncodings());
        writer.i(SearchSuggestionsConfig.sourcePornstars);
        this.nullableListOfPerformerVideoInfoModelAdapter.toJson(writer, (j) videoModel.getPornstars());
        writer.i("addedOn");
        this.nullableLongAdapter.toJson(writer, (j) videoModel.getAddedOn());
        writer.i("isPaidToDownload");
        this.nullableBooleanAdapter.toJson(writer, (j) videoModel.isPaidToDownload());
        writer.i("vrProjectionType");
        this.nullableIntAdapter.toJson(writer, (j) videoModel.getVrProjectionType());
        writer.i("vrStereoSrc");
        this.nullableBooleanAdapter.toJson(writer, (j) videoModel.getVrStereoSrc());
        writer.i("vrStereoType");
        this.nullableIntAdapter.toJson(writer, (j) videoModel.getVrStereoType());
        writer.i("trackUrl");
        this.nullableStringAdapter.toJson(writer, (j) videoModel.getTrackUrl());
        writer.i("channelLink");
        this.nullableStringAdapter.toJson(writer, (j) videoModel.getChannelLink());
        writer.i("channelTitle");
        this.nullableStringAdapter.toJson(writer, (j) videoModel.getChannelTitle());
        writer.i("isActiveSponsor");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(videoModel.isActiveSponsor()));
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(VideoModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(VideoModel)";
    }
}
