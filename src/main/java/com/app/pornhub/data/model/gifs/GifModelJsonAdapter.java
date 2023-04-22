package com.app.pornhub.data.model.gifs;

import android.support.v4.media.a;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/app/pornhub/data/model/gifs/GifModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/gifs/GifModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", BuildConfig.FLAVOR, "intAdapter", BuildConfig.FLAVOR, "longAdapter", "Lcom/app/pornhub/data/model/user/UserModel;", "nullableUserModelAdapter", BuildConfig.FLAVOR, "nullableMapOfStringStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class GifModelJsonAdapter extends f<GifModel> {
    private volatile Constructor<GifModel> constructorRef;
    private final f<Integer> intAdapter;
    private final f<Long> longAdapter;
    private final f<Map<String, String>> nullableMapOfStringStringAdapter;
    private final f<String> nullableStringAdapter;
    private final f<UserModel> nullableUserModelAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public GifModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "title", "urlThumbnail", "urlThumbnail16x9", ExploreModel.GIF, "gif16x9", "jpg", "jpg16x9", "webm", "mp4", "views", "vote_up", "vote_down", "vote_percent", "hasVideo", "posted_on", "categories", "older", "newer", "isFavorite", "from_vkey", "fromTitle", "tags", "pornStar", UsersConfig.USER_PREF_KEY, "flagTypes");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"title\", \"urlTh…ar\", \"user\", \"flagTypes\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "urlThumbnail", "moshi.adapter(String::cl…ptySet(), \"urlThumbnail\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "views", "moshi.adapter(Int::class…ava, emptySet(), \"views\")");
        this.longAdapter = a.d(moshi, Long.TYPE, "postedOn", "moshi.adapter(Long::clas…ySet(),\n      \"postedOn\")");
        this.nullableUserModelAdapter = a.d(moshi, UserModel.class, UsersConfig.USER_PREF_KEY, "moshi.adapter(UserModel:…java, emptySet(), \"user\")");
        this.nullableMapOfStringStringAdapter = a1.a.e(moshi, jd.k.e(Map.class, String.class, String.class), "flagTypes", "moshi.adapter(Types.newP… emptySet(), \"flagTypes\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public GifModel fromJson(JsonReader reader) {
        int i10;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Integer num = 0;
        reader.c();
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = num4;
        Long l10 = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i11 = -1;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        UserModel userModel = null;
        Map<String, String> map = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Integer num6 = num5;
        while (true) {
            String str18 = str4;
            String str19 = str;
            if (!reader.h()) {
                String str20 = str2;
                reader.e();
                if (i11 == -16776961) {
                    if (str6 == null) {
                        JsonDataException h10 = c.h("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
                        throw h10;
                    } else if (str7 == null) {
                        JsonDataException h11 = c.h("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"title\", \"title\", reader)");
                        throw h11;
                    } else {
                        Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
                        int intValue = num.intValue();
                        int intValue2 = num6.intValue();
                        int intValue3 = num2.intValue();
                        int intValue4 = num3.intValue();
                        int intValue5 = num4.intValue();
                        long longValue = l10.longValue();
                        Objects.requireNonNull(str20, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str19, "null cannot be cast to non-null type kotlin.String");
                        Objects.requireNonNull(str18, "null cannot be cast to non-null type kotlin.String");
                        int intValue6 = num5.intValue();
                        String str21 = str14;
                        Objects.requireNonNull(str21, "null cannot be cast to non-null type kotlin.String");
                        String str22 = str15;
                        Objects.requireNonNull(str22, "null cannot be cast to non-null type kotlin.String");
                        String str23 = str16;
                        Objects.requireNonNull(str23, "null cannot be cast to non-null type kotlin.String");
                        String str24 = str17;
                        Objects.requireNonNull(str24, "null cannot be cast to non-null type kotlin.String");
                        return new GifModel(str6, str7, str8, str9, str10, str11, str12, str13, str5, str3, intValue, intValue2, intValue3, intValue4, intValue5, longValue, str20, str19, str18, intValue6, str21, str22, str23, str24, userModel, map);
                    }
                }
                String str25 = str5;
                Constructor<GifModel> constructor = this.constructorRef;
                if (constructor == null) {
                    Class cls = Integer.TYPE;
                    constructor = GifModel.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, cls, cls, cls, cls, Long.TYPE, String.class, String.class, String.class, cls, String.class, String.class, String.class, String.class, UserModel.class, Map.class, cls, c.f12069c);
                    this.constructorRef = constructor;
                    Unit unit = Unit.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(constructor, "GifModel::class.java.get…his.constructorRef = it }");
                }
                Object[] objArr = new Object[28];
                if (str6 == null) {
                    JsonDataException h12 = c.h("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"id\", \"id\", reader)");
                    throw h12;
                }
                objArr[0] = str6;
                if (str7 == null) {
                    JsonDataException h13 = c.h("title", "title", reader);
                    Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"title\", \"title\", reader)");
                    throw h13;
                }
                objArr[1] = str7;
                objArr[2] = str8;
                objArr[3] = str9;
                objArr[4] = str10;
                objArr[5] = str11;
                objArr[6] = str12;
                objArr[7] = str13;
                objArr[8] = str25;
                objArr[9] = str3;
                objArr[10] = num;
                objArr[11] = num6;
                objArr[12] = num2;
                objArr[13] = num3;
                objArr[14] = num4;
                objArr[15] = l10;
                objArr[16] = str20;
                objArr[17] = str19;
                objArr[18] = str18;
                objArr[19] = num5;
                objArr[20] = str14;
                objArr[21] = str15;
                objArr[22] = str16;
                objArr[23] = str17;
                objArr[24] = userModel;
                objArr[25] = map;
                objArr[26] = Integer.valueOf(i11);
                objArr[27] = null;
                GifModel newInstance = constructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
                return newInstance;
            }
            String str26 = str2;
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    str2 = str26;
                    str = str19;
                    break;
                case 0:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    str2 = str26;
                    str = str19;
                    break;
                case 1:
                    str7 = this.stringAdapter.fromJson(reader);
                    if (str7 == null) {
                        JsonDataException n10 = c.n("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw n10;
                    }
                    str2 = str26;
                    str = str19;
                    break;
                case 2:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                case 3:
                    str9 = this.nullableStringAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                case 4:
                    str10 = this.nullableStringAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                case 5:
                    str11 = this.nullableStringAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                case 6:
                    str12 = this.nullableStringAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                case 7:
                    str13 = this.nullableStringAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                case 8:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n11 = c.n("webm", "webm", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"webm\", \"webm\", reader)");
                        throw n11;
                    }
                    i11 &= -257;
                    str2 = str26;
                    str = str19;
                    break;
                case 9:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n12 = c.n("mp4", "mp4", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"mp4\", \"mp4\", reader)");
                        throw n12;
                    }
                    i11 &= -513;
                    str2 = str26;
                    str = str19;
                    break;
                case 10:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        JsonDataException n13 = c.n("views", "views", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"views\", \"views\", reader)");
                        throw n13;
                    }
                    i11 &= -1025;
                    str2 = str26;
                    str = str19;
                    break;
                case 11:
                    num6 = this.intAdapter.fromJson(reader);
                    if (num6 == null) {
                        JsonDataException n14 = c.n("voteUp", "vote_up", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"voteUp\",…p\",\n              reader)");
                        throw n14;
                    }
                    i11 &= -2049;
                    str2 = str26;
                    str = str19;
                    break;
                case 12:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        JsonDataException n15 = c.n("voteDown", "vote_down", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"voteDown…     \"vote_down\", reader)");
                        throw n15;
                    }
                    i11 &= -4097;
                    str2 = str26;
                    str = str19;
                    break;
                case 13:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        JsonDataException n16 = c.n("votePercent", "vote_percent", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"votePerc…  \"vote_percent\", reader)");
                        throw n16;
                    }
                    i11 &= -8193;
                    str2 = str26;
                    str = str19;
                    break;
                case 14:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        JsonDataException n17 = c.n("hasVideo", "hasVideo", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"hasVideo…      \"hasVideo\", reader)");
                        throw n17;
                    }
                    i11 &= -16385;
                    str2 = str26;
                    str = str19;
                    break;
                case 15:
                    l10 = this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        JsonDataException n18 = c.n("postedOn", "posted_on", reader);
                        Intrinsics.checkNotNullExpressionValue(n18, "unexpectedNull(\"postedOn…     \"posted_on\", reader)");
                        throw n18;
                    }
                    i10 = -32769;
                    i11 &= i10;
                    str2 = str26;
                    str = str19;
                    break;
                case 16:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n19 = c.n("categories", "categories", reader);
                        Intrinsics.checkNotNullExpressionValue(n19, "unexpectedNull(\"categori…    \"categories\", reader)");
                        throw n19;
                    }
                    i11 &= -65537;
                    str = str19;
                    break;
                case 17:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n20 = c.n("older", "older", reader);
                        Intrinsics.checkNotNullExpressionValue(n20, "unexpectedNull(\"older\", …r\",\n              reader)");
                        throw n20;
                    }
                    i11 &= -131073;
                    str2 = str26;
                    break;
                case 18:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n21 = c.n("newer", "newer", reader);
                        Intrinsics.checkNotNullExpressionValue(n21, "unexpectedNull(\"newer\", …r\",\n              reader)");
                        throw n21;
                    }
                    i11 &= -262145;
                    str2 = str26;
                    str = str19;
                    continue;
                case 19:
                    num5 = this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        JsonDataException n22 = c.n("isFavorite", "isFavorite", reader);
                        Intrinsics.checkNotNullExpressionValue(n22, "unexpectedNull(\"isFavori…    \"isFavorite\", reader)");
                        throw n22;
                    }
                    i10 = -524289;
                    i11 &= i10;
                    str2 = str26;
                    str = str19;
                    break;
                case 20:
                    str14 = this.stringAdapter.fromJson(reader);
                    if (str14 == null) {
                        JsonDataException n23 = c.n("from_vkey", "from_vkey", reader);
                        Intrinsics.checkNotNullExpressionValue(n23, "unexpectedNull(\"from_vke…     \"from_vkey\", reader)");
                        throw n23;
                    }
                    i10 = -1048577;
                    i11 &= i10;
                    str2 = str26;
                    str = str19;
                    break;
                case 21:
                    str15 = this.stringAdapter.fromJson(reader);
                    if (str15 == null) {
                        JsonDataException n24 = c.n("fromTitle", "fromTitle", reader);
                        Intrinsics.checkNotNullExpressionValue(n24, "unexpectedNull(\"fromTitl…     \"fromTitle\", reader)");
                        throw n24;
                    }
                    i10 = -2097153;
                    i11 &= i10;
                    str2 = str26;
                    str = str19;
                    break;
                case 22:
                    str16 = this.stringAdapter.fromJson(reader);
                    if (str16 == null) {
                        JsonDataException n25 = c.n("tags", "tags", reader);
                        Intrinsics.checkNotNullExpressionValue(n25, "unexpectedNull(\"tags\", \"tags\", reader)");
                        throw n25;
                    }
                    i10 = -4194305;
                    i11 &= i10;
                    str2 = str26;
                    str = str19;
                    break;
                case 23:
                    str17 = this.stringAdapter.fromJson(reader);
                    if (str17 == null) {
                        JsonDataException n26 = c.n("pornStar", "pornStar", reader);
                        Intrinsics.checkNotNullExpressionValue(n26, "unexpectedNull(\"pornStar…      \"pornStar\", reader)");
                        throw n26;
                    }
                    i10 = -8388609;
                    i11 &= i10;
                    str2 = str26;
                    str = str19;
                    break;
                case 24:
                    userModel = this.nullableUserModelAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                case 25:
                    map = this.nullableMapOfStringStringAdapter.fromJson(reader);
                    str2 = str26;
                    str = str19;
                    break;
                default:
                    str2 = str26;
                    str = str19;
                    break;
            }
            str4 = str18;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, GifModel gifModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(gifModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) gifModel.getId());
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) gifModel.getTitle());
        writer.i("urlThumbnail");
        this.nullableStringAdapter.toJson(writer, (j) gifModel.getUrlThumbnail());
        writer.i("urlThumbnail16x9");
        this.nullableStringAdapter.toJson(writer, (j) gifModel.getUrlThumbnail16x9());
        writer.i(ExploreModel.GIF);
        this.nullableStringAdapter.toJson(writer, (j) gifModel.getGif());
        writer.i("gif16x9");
        this.nullableStringAdapter.toJson(writer, (j) gifModel.getGif16x9());
        writer.i("jpg");
        this.nullableStringAdapter.toJson(writer, (j) gifModel.getJpg());
        writer.i("jpg16x9");
        this.nullableStringAdapter.toJson(writer, (j) gifModel.getJpg16x9());
        writer.i("webm");
        this.stringAdapter.toJson(writer, (j) gifModel.getWebm());
        writer.i("mp4");
        this.stringAdapter.toJson(writer, (j) gifModel.getMp4());
        writer.i("views");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(gifModel.getViews()));
        writer.i("vote_up");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(gifModel.getVoteUp()));
        writer.i("vote_down");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(gifModel.getVoteDown()));
        writer.i("vote_percent");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(gifModel.getVotePercent()));
        writer.i("hasVideo");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(gifModel.getHasVideo()));
        writer.i("posted_on");
        this.longAdapter.toJson(writer, (j) Long.valueOf(gifModel.getPostedOn()));
        writer.i("categories");
        this.stringAdapter.toJson(writer, (j) gifModel.getCategories());
        writer.i("older");
        this.stringAdapter.toJson(writer, (j) gifModel.getOlder());
        writer.i("newer");
        this.stringAdapter.toJson(writer, (j) gifModel.getNewer());
        writer.i("isFavorite");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(gifModel.isFavorite()));
        writer.i("from_vkey");
        this.stringAdapter.toJson(writer, (j) gifModel.getFrom_vkey());
        writer.i("fromTitle");
        this.stringAdapter.toJson(writer, (j) gifModel.getFromTitle());
        writer.i("tags");
        this.stringAdapter.toJson(writer, (j) gifModel.getTags());
        writer.i("pornStar");
        this.stringAdapter.toJson(writer, (j) gifModel.getPornStar());
        writer.i(UsersConfig.USER_PREF_KEY);
        this.nullableUserModelAdapter.toJson(writer, (j) gifModel.getUser());
        writer.i("flagTypes");
        this.nullableMapOfStringStringAdapter.toJson(writer, (j) gifModel.getFlagTypes());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(GifModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(GifModel)";
    }
}
