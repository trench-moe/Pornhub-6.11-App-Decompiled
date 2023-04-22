package com.app.pornhub.data.model.user;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.domain.config.UsersConfig;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/app/pornhub/data/model/user/UserResponse;", BuildConfig.FLAVOR, UsersConfig.USER_PREF_KEY, "Lcom/app/pornhub/data/model/user/UserModel;", "additionalSecurity", "Lcom/app/pornhub/data/model/user/AdditionalSecurityModel;", "error", "Lcom/app/pornhub/data/model/ErrorModel;", "(Lcom/app/pornhub/data/model/user/UserModel;Lcom/app/pornhub/data/model/user/AdditionalSecurityModel;Lcom/app/pornhub/data/model/ErrorModel;)V", "getAdditionalSecurity", "()Lcom/app/pornhub/data/model/user/AdditionalSecurityModel;", "getError", "()Lcom/app/pornhub/data/model/ErrorModel;", "getUser", "()Lcom/app/pornhub/data/model/user/UserModel;", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserResponse {
    private final AdditionalSecurityModel additionalSecurity;
    private final ErrorModel error;
    private final UserModel user;

    public UserResponse(UserModel userModel, AdditionalSecurityModel additionalSecurityModel, ErrorModel errorModel) {
        this.user = userModel;
        this.additionalSecurity = additionalSecurityModel;
        this.error = errorModel;
    }

    public static /* synthetic */ UserResponse copy$default(UserResponse userResponse, UserModel userModel, AdditionalSecurityModel additionalSecurityModel, ErrorModel errorModel, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            userModel = userResponse.user;
        }
        if ((i10 & 2) != 0) {
            additionalSecurityModel = userResponse.additionalSecurity;
        }
        if ((i10 & 4) != 0) {
            errorModel = userResponse.error;
        }
        return userResponse.copy(userModel, additionalSecurityModel, errorModel);
    }

    public final UserModel component1() {
        return this.user;
    }

    public final AdditionalSecurityModel component2() {
        return this.additionalSecurity;
    }

    public final ErrorModel component3() {
        return this.error;
    }

    public final UserResponse copy(UserModel userModel, AdditionalSecurityModel additionalSecurityModel, ErrorModel errorModel) {
        return new UserResponse(userModel, additionalSecurityModel, errorModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserResponse) {
            UserResponse userResponse = (UserResponse) obj;
            return Intrinsics.areEqual(this.user, userResponse.user) && Intrinsics.areEqual(this.additionalSecurity, userResponse.additionalSecurity) && Intrinsics.areEqual(this.error, userResponse.error);
        }
        return false;
    }

    public final AdditionalSecurityModel getAdditionalSecurity() {
        return this.additionalSecurity;
    }

    public final ErrorModel getError() {
        return this.error;
    }

    public final UserModel getUser() {
        return this.user;
    }

    public int hashCode() {
        UserModel userModel = this.user;
        int hashCode = (userModel == null ? 0 : userModel.hashCode()) * 31;
        AdditionalSecurityModel additionalSecurityModel = this.additionalSecurity;
        int hashCode2 = (hashCode + (additionalSecurityModel == null ? 0 : additionalSecurityModel.hashCode())) * 31;
        ErrorModel errorModel = this.error;
        return hashCode2 + (errorModel != null ? errorModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m10 = a.m("UserResponse(user=");
        m10.append(this.user);
        m10.append(", additionalSecurity=");
        m10.append(this.additionalSecurity);
        m10.append(", error=");
        return b.k(m10, this.error, ')');
    }
}
