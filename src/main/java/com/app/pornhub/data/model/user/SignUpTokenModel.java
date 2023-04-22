package com.app.pornhub.data.model.user;

import a1.a;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/app/pornhub/data/model/user/SignUpTokenModel;", BuildConfig.FLAVOR, "token", BuildConfig.FLAVOR, "expiration", BuildConfig.FLAVOR, "(Ljava/lang/String;J)V", "getExpiration", "()J", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SignUpTokenModel {
    private final long expiration;
    private final String token;

    public SignUpTokenModel(@f(name = "signup_token") String token, long j10) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.expiration = j10;
    }

    public static /* synthetic */ SignUpTokenModel copy$default(SignUpTokenModel signUpTokenModel, String str, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signUpTokenModel.token;
        }
        if ((i10 & 2) != 0) {
            j10 = signUpTokenModel.expiration;
        }
        return signUpTokenModel.copy(str, j10);
    }

    public final String component1() {
        return this.token;
    }

    public final long component2() {
        return this.expiration;
    }

    public final SignUpTokenModel copy(@f(name = "signup_token") String token, long j10) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new SignUpTokenModel(token, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignUpTokenModel) {
            SignUpTokenModel signUpTokenModel = (SignUpTokenModel) obj;
            return Intrinsics.areEqual(this.token, signUpTokenModel.token) && this.expiration == signUpTokenModel.expiration;
        }
        return false;
    }

    public final long getExpiration() {
        return this.expiration;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        long j10 = this.expiration;
        return (this.token.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        StringBuilder m10 = a.m("SignUpTokenModel(token=");
        m10.append(this.token);
        m10.append(", expiration=");
        m10.append(this.expiration);
        m10.append(')');
        return m10.toString();
    }
}
