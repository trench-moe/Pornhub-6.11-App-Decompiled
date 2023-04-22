package com.app.pornhub.data.model.photo;

import android.support.v4.media.a;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.UsersConfig;
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

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/app/pornhub/data/model/photo/AlbumModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/photo/AlbumModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "nullableIntAdapter", "intAdapter", BuildConfig.FLAVOR, "longAdapter", "Lcom/app/pornhub/data/model/user/UserModel;", "userModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AlbumModelJsonAdapter extends f<AlbumModel> {
    private final f<Integer> intAdapter;
    private final f<Long> longAdapter;
    private final f<Integer> nullableIntAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;
    private final f<UserModel> userModelAdapter;

    public AlbumModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "title", "votesPercent", "imgCount", "dateAdded", "urlThumbnail", "viewCount", "tags", "segment", UsersConfig.USER_PREF_KEY);
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"title\", \"votes…tags\", \"segment\", \"user\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.nullableIntAdapter = a.d(moshi, Integer.class, "rating", "moshi.adapter(Int::class…    emptySet(), \"rating\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "imgCount", "moshi.adapter(Int::class…, emptySet(), \"imgCount\")");
        this.longAdapter = a.d(moshi, Long.TYPE, "dateAdded", "moshi.adapter(Long::clas…Set(),\n      \"dateAdded\")");
        this.userModelAdapter = a.d(moshi, UserModel.class, UsersConfig.USER_PREF_KEY, "moshi.adapter(UserModel:…      emptySet(), \"user\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public AlbumModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        Long l10 = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        Integer num3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        UserModel userModel = null;
        while (true) {
            Integer num4 = num3;
            UserModel userModel2 = userModel;
            String str6 = str5;
            String str7 = str4;
            Integer num5 = num2;
            String str8 = str3;
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
                } else if (num == null) {
                    JsonDataException h12 = c.h("imgCount", "imgCount", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"imgCount\", \"imgCount\", reader)");
                    throw h12;
                } else {
                    int intValue = num.intValue();
                    if (l10 == null) {
                        JsonDataException h13 = c.h("dateAdded", "dateAdded", reader);
                        Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"dateAdded\", \"dateAdded\", reader)");
                        throw h13;
                    }
                    long longValue = l10.longValue();
                    if (str8 == null) {
                        JsonDataException h14 = c.h("urlThumbnail", "urlThumbnail", reader);
                        Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"urlThum…ail\",\n            reader)");
                        throw h14;
                    } else if (num5 == null) {
                        JsonDataException h15 = c.h("viewCount", "viewCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"viewCount\", \"viewCount\", reader)");
                        throw h15;
                    } else {
                        int intValue2 = num5.intValue();
                        if (str7 == null) {
                            JsonDataException h16 = c.h("tags", "tags", reader);
                            Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"tags\", \"tags\", reader)");
                            throw h16;
                        } else if (str6 == null) {
                            JsonDataException h17 = c.h("segment", "segment", reader);
                            Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"segment\", \"segment\", reader)");
                            throw h17;
                        } else if (userModel2 != null) {
                            return new AlbumModel(str, str2, num4, intValue, longValue, str8, intValue2, str7, str6, userModel2);
                        } else {
                            JsonDataException h18 = c.h(UsersConfig.USER_PREF_KEY, UsersConfig.USER_PREF_KEY, reader);
                            Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"user\", \"user\", reader)");
                            throw h18;
                        }
                    }
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw n10;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
                case 2:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        JsonDataException n11 = c.n("imgCount", "imgCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"imgCount…      \"imgCount\", reader)");
                        throw n11;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
                case 4:
                    l10 = this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        JsonDataException n12 = c.n("dateAdded", "dateAdded", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"dateAdde…     \"dateAdded\", reader)");
                        throw n12;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
                case 5:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n13 = c.n("urlThumbnail", "urlThumbnail", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"urlThumb…, \"urlThumbnail\", reader)");
                        throw n13;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    continue;
                case 6:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        JsonDataException n14 = c.n("viewCount", "viewCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"viewCoun…     \"viewCount\", reader)");
                        throw n14;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    break;
                case 7:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n15 = c.n("tags", "tags", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"tags\", \"tags\",\n            reader)");
                        throw n15;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    num2 = num5;
                    break;
                case 8:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n16 = c.n("segment", "segment", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"segment\"…       \"segment\", reader)");
                        throw n16;
                    }
                    num3 = num4;
                    userModel = userModel2;
                    str4 = str7;
                    num2 = num5;
                    break;
                case 9:
                    userModel = this.userModelAdapter.fromJson(reader);
                    if (userModel == null) {
                        JsonDataException n17 = c.n(UsersConfig.USER_PREF_KEY, UsersConfig.USER_PREF_KEY, reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"user\", \"user\",\n            reader)");
                        throw n17;
                    }
                    num3 = num4;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
                default:
                    num3 = num4;
                    userModel = userModel2;
                    str5 = str6;
                    str4 = str7;
                    num2 = num5;
                    break;
            }
            str3 = str8;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, AlbumModel albumModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(albumModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) albumModel.getId());
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) albumModel.getTitle());
        writer.i("votesPercent");
        this.nullableIntAdapter.toJson(writer, (j) albumModel.getRating());
        writer.i("imgCount");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(albumModel.getImgCount()));
        writer.i("dateAdded");
        this.longAdapter.toJson(writer, (j) Long.valueOf(albumModel.getDateAdded()));
        writer.i("urlThumbnail");
        this.stringAdapter.toJson(writer, (j) albumModel.getUrlThumbnail());
        writer.i("viewCount");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(albumModel.getViewCount()));
        writer.i("tags");
        this.stringAdapter.toJson(writer, (j) albumModel.getTags());
        writer.i("segment");
        this.stringAdapter.toJson(writer, (j) albumModel.getSegment());
        writer.i(UsersConfig.USER_PREF_KEY);
        this.userModelAdapter.toJson(writer, (j) albumModel.getUser());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(AlbumModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(AlbumModel)";
    }
}
