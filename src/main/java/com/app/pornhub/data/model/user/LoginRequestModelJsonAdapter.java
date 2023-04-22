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

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/data/model/user/LoginRequestModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/user/LoginRequestModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "nullableStringAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LoginRequestModelJsonAdapter extends f<LoginRequestModel> {
    private final f<String> nullableStringAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public LoginRequestModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("username", "password", "g-recaptcha-response");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"username\", \"password…  \"g-recaptcha-response\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "username", "moshi.adapter(String::cl…ySet(),\n      \"username\")");
        this.nullableStringAdapter = a.d(moshi, String.class, "captchaToken", "moshi.adapter(String::cl…ptySet(), \"captchaToken\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public LoginRequestModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        String str3 = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    JsonDataException n = c.n("username", "username", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"username…      \"username\", reader)");
                    throw n;
                }
            } else if (F == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    JsonDataException n10 = c.n("password", "password", reader);
                    Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"password…      \"password\", reader)");
                    throw n10;
                }
            } else if (F == 2) {
                str3 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.e();
        if (str == null) {
            JsonDataException h10 = c.h("username", "username", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"username\", \"username\", reader)");
            throw h10;
        } else if (str2 != null) {
            return new LoginRequestModel(str, str2, str3);
        } else {
            JsonDataException h11 = c.h("password", "password", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"password\", \"password\", reader)");
            throw h11;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, LoginRequestModel loginRequestModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(loginRequestModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("username");
        this.stringAdapter.toJson(writer, (j) loginRequestModel.getUsername());
        writer.i("password");
        this.stringAdapter.toJson(writer, (j) loginRequestModel.getPassword());
        writer.i("g-recaptcha-response");
        this.nullableStringAdapter.toJson(writer, (j) loginRequestModel.getCaptchaToken());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(LoginRequestModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(LoginRequestModel)";
    }
}
