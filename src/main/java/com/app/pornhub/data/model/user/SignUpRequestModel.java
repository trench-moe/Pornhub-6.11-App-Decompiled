package com.app.pornhub.data.model.user;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/app/pornhub/data/model/user/SignUpRequestModel;", BuildConfig.FLAVOR, "username", BuildConfig.FLAVOR, "password", "email", "signupToken", "captchaToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCaptchaToken", "()Ljava/lang/String;", "getEmail", "getPassword", "getSignupToken", "getUsername", "component1", "component2", "component3", "component4", "component5", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SignUpRequestModel {
    private final String captchaToken;
    private final String email;
    private final String password;
    private final String signupToken;
    private final String username;

    public SignUpRequestModel(String username, String password, String email, @f(name = "signup_token") String signupToken, @f(name = "g-recaptcha-response") String str) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(signupToken, "signupToken");
        this.username = username;
        this.password = password;
        this.email = email;
        this.signupToken = signupToken;
        this.captchaToken = str;
    }

    public static /* synthetic */ SignUpRequestModel copy$default(SignUpRequestModel signUpRequestModel, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signUpRequestModel.username;
        }
        if ((i10 & 2) != 0) {
            str2 = signUpRequestModel.password;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = signUpRequestModel.email;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = signUpRequestModel.signupToken;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = signUpRequestModel.captchaToken;
        }
        return signUpRequestModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.username;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.signupToken;
    }

    public final String component5() {
        return this.captchaToken;
    }

    public final SignUpRequestModel copy(String username, String password, String email, @f(name = "signup_token") String signupToken, @f(name = "g-recaptcha-response") String str) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(signupToken, "signupToken");
        return new SignUpRequestModel(username, password, email, signupToken, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignUpRequestModel) {
            SignUpRequestModel signUpRequestModel = (SignUpRequestModel) obj;
            if (Intrinsics.areEqual(this.username, signUpRequestModel.username) && Intrinsics.areEqual(this.password, signUpRequestModel.password) && Intrinsics.areEqual(this.email, signUpRequestModel.email) && Intrinsics.areEqual(this.signupToken, signUpRequestModel.signupToken) && Intrinsics.areEqual(this.captchaToken, signUpRequestModel.captchaToken)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getCaptchaToken() {
        return this.captchaToken;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getSignupToken() {
        return this.signupToken;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int b10 = a.b(this.signupToken, a.b(this.email, a.b(this.password, this.username.hashCode() * 31, 31), 31), 31);
        String str = this.captchaToken;
        return b10 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("SignUpRequestModel(username=");
        m10.append(this.username);
        m10.append(", password=");
        m10.append(this.password);
        m10.append(", email=");
        m10.append(this.email);
        m10.append(", signupToken=");
        m10.append(this.signupToken);
        m10.append(", captchaToken=");
        m10.append((Object) this.captchaToken);
        m10.append(')');
        return m10.toString();
    }
}
