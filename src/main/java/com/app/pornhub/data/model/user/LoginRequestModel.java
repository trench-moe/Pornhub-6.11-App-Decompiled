package com.app.pornhub.data.model.user;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/user/LoginRequestModel;", BuildConfig.FLAVOR, "username", BuildConfig.FLAVOR, "password", "captchaToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCaptchaToken", "()Ljava/lang/String;", "getPassword", "getUsername", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LoginRequestModel {
    private final String captchaToken;
    private final String password;
    private final String username;

    public LoginRequestModel(String username, String password, @f(name = "g-recaptcha-response") String str) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        this.username = username;
        this.password = password;
        this.captchaToken = str;
    }

    public static /* synthetic */ LoginRequestModel copy$default(LoginRequestModel loginRequestModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginRequestModel.username;
        }
        if ((i10 & 2) != 0) {
            str2 = loginRequestModel.password;
        }
        if ((i10 & 4) != 0) {
            str3 = loginRequestModel.captchaToken;
        }
        return loginRequestModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.captchaToken;
    }

    public final LoginRequestModel copy(String username, String password, @f(name = "g-recaptcha-response") String str) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        return new LoginRequestModel(username, password, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoginRequestModel) {
            LoginRequestModel loginRequestModel = (LoginRequestModel) obj;
            if (Intrinsics.areEqual(this.username, loginRequestModel.username) && Intrinsics.areEqual(this.password, loginRequestModel.password) && Intrinsics.areEqual(this.captchaToken, loginRequestModel.captchaToken)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getCaptchaToken() {
        return this.captchaToken;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int b10 = a.b(this.password, this.username.hashCode() * 31, 31);
        String str = this.captchaToken;
        return b10 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("LoginRequestModel(username=");
        m10.append(this.username);
        m10.append(", password=");
        m10.append(this.password);
        m10.append(", captchaToken=");
        m10.append((Object) this.captchaToken);
        m10.append(')');
        return m10.toString();
    }
}
