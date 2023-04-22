package com.app.pornhub.data.model.user;

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

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/app/pornhub/data/model/user/UserModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/user/UserModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "nullableBooleanAdapter", "nullableStringAdapter", BuildConfig.FLAVOR, "nullableIntAdapter", BuildConfig.FLAVOR, "nullableLongAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UserModelJsonAdapter extends f<UserModel> {
    private final f<Boolean> nullableBooleanAdapter;
    private final f<Integer> nullableIntAdapter;
    private final f<Long> nullableLongAdapter;
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public UserModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "username", "urlThumbnail", "isVerified", "channelId", "emailVerificationRequired", "userType", "accessToken", "refreshToken", "fullName", "gender", "age", "relationStatus", "orientation", "videoWatchedCount", "myProfileViewedCount", "dateAdded", "lastLogin");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"username\", \"ur…\"dateAdded\", \"lastLogin\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.nullableBooleanAdapter = a.d(moshi, Boolean.class, "isVerified", "moshi.adapter(Boolean::c…emptySet(), \"isVerified\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "channelId", "moshi.adapter(String::cl… emptySet(), \"channelId\")");
        this.nullableIntAdapter = a.d(moshi, Integer.class, "gender", "moshi.adapter(Int::class…    emptySet(), \"gender\")");
        this.nullableLongAdapter = a.d(moshi, Long.class, "dateAdded", "moshi.adapter(Long::clas… emptySet(), \"dateAdded\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public UserModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        String str4 = null;
        Boolean bool2 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Long l10 = null;
        Long l11 = null;
        while (true) {
            Integer num7 = num2;
            Integer num8 = num;
            if (!reader.h()) {
                reader.e();
                if (str == null) {
                    JsonDataException h10 = c.h("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
                    throw h10;
                } else if (str2 == null) {
                    JsonDataException h11 = c.h("username", "username", reader);
                    Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"username\", \"username\", reader)");
                    throw h11;
                } else if (str3 != null) {
                    return new UserModel(str, str2, str3, bool, str4, bool2, str5, str6, str7, str8, num8, num7, num3, num4, num5, num6, l10, l11);
                } else {
                    JsonDataException h12 = c.h("urlThumbnail", "urlThumbnail", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"urlThum…ail\",\n            reader)");
                    throw h12;
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    num2 = num7;
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    num2 = num7;
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("username", "username", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"username…      \"username\", reader)");
                        throw n10;
                    }
                    num2 = num7;
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n11 = c.n("urlThumbnail", "urlThumbnail", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"urlThumb…, \"urlThumbnail\", reader)");
                        throw n11;
                    }
                    num2 = num7;
                    break;
                case 3:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 5:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 6:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 9:
                    str8 = this.nullableStringAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 10:
                    num = this.nullableIntAdapter.fromJson(reader);
                    num2 = num7;
                    continue;
                case 11:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 12:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 13:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 14:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 15:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 16:
                    l10 = this.nullableLongAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                case 17:
                    l11 = this.nullableLongAdapter.fromJson(reader);
                    num2 = num7;
                    break;
                default:
                    num2 = num7;
                    break;
            }
            num = num8;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, UserModel userModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(userModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) userModel.getId());
        writer.i("username");
        this.stringAdapter.toJson(writer, (j) userModel.getUsername());
        writer.i("urlThumbnail");
        this.stringAdapter.toJson(writer, (j) userModel.getUrlThumbnail());
        writer.i("isVerified");
        this.nullableBooleanAdapter.toJson(writer, (j) userModel.isVerified());
        writer.i("channelId");
        this.nullableStringAdapter.toJson(writer, (j) userModel.getChannelId());
        writer.i("emailVerificationRequired");
        this.nullableBooleanAdapter.toJson(writer, (j) userModel.getEmailVerificationRequired());
        writer.i("userType");
        this.nullableStringAdapter.toJson(writer, (j) userModel.getUserType());
        writer.i("accessToken");
        this.nullableStringAdapter.toJson(writer, (j) userModel.getAccessToken());
        writer.i("refreshToken");
        this.nullableStringAdapter.toJson(writer, (j) userModel.getRefreshToken());
        writer.i("fullName");
        this.nullableStringAdapter.toJson(writer, (j) userModel.getFullName());
        writer.i("gender");
        this.nullableIntAdapter.toJson(writer, (j) userModel.getGender());
        writer.i("age");
        this.nullableIntAdapter.toJson(writer, (j) userModel.getAge());
        writer.i("relationStatus");
        this.nullableIntAdapter.toJson(writer, (j) userModel.getRelationStatus());
        writer.i("orientation");
        this.nullableIntAdapter.toJson(writer, (j) userModel.getOrientation());
        writer.i("videoWatchedCount");
        this.nullableIntAdapter.toJson(writer, (j) userModel.getVideoWatchedCount());
        writer.i("myProfileViewedCount");
        this.nullableIntAdapter.toJson(writer, (j) userModel.getMyProfileViewedCount());
        writer.i("dateAdded");
        this.nullableLongAdapter.toJson(writer, (j) userModel.getDateAdded());
        writer.i("lastLogin");
        this.nullableLongAdapter.toJson(writer, (j) userModel.getLastLogin());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(UserModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UserModel)";
    }
}
