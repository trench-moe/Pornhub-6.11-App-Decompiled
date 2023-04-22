package com.app.pornhub.data.model.user;

import android.support.v4.media.a;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/user/UserResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/user/UserResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/user/UserModel;", "nullableUserModelAdapter", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/user/AdditionalSecurityModel;", "nullableAdditionalSecurityModelAdapter", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class UserResponseJsonAdapter extends f<UserResponse> {
    private final f<AdditionalSecurityModel> nullableAdditionalSecurityModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final f<UserModel> nullableUserModelAdapter;
    private final JsonReader.a options;

    public UserResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(UsersConfig.USER_PREF_KEY, "additionalSecurity", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"user\", \"additionalSecurity\",\n      \"error\")");
        this.options = a10;
        this.nullableUserModelAdapter = a.d(moshi, UserModel.class, UsersConfig.USER_PREF_KEY, "moshi.adapter(UserModel:…java, emptySet(), \"user\")");
        this.nullableAdditionalSecurityModelAdapter = a.d(moshi, AdditionalSecurityModel.class, "additionalSecurity", "moshi.adapter(Additional…(), \"additionalSecurity\")");
        this.nullableErrorModelAdapter = a.d(moshi, ErrorModel.class, "error", "moshi.adapter(ErrorModel…ava, emptySet(), \"error\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public UserResponse fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        UserModel userModel = null;
        AdditionalSecurityModel additionalSecurityModel = null;
        ErrorModel errorModel = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                userModel = this.nullableUserModelAdapter.fromJson(reader);
            } else if (F == 1) {
                additionalSecurityModel = this.nullableAdditionalSecurityModelAdapter.fromJson(reader);
            } else if (F == 2) {
                errorModel = this.nullableErrorModelAdapter.fromJson(reader);
            }
        }
        reader.e();
        return new UserResponse(userModel, additionalSecurityModel, errorModel);
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, UserResponse userResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(userResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(UsersConfig.USER_PREF_KEY);
        this.nullableUserModelAdapter.toJson(writer, (j) userResponse.getUser());
        writer.i("additionalSecurity");
        this.nullableAdditionalSecurityModelAdapter.toJson(writer, (j) userResponse.getAdditionalSecurity());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) userResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(UserResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(UserResponse)";
    }
}
