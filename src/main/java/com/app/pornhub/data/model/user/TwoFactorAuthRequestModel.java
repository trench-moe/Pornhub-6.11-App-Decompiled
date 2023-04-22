package com.app.pornhub.data.model.user;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/app/pornhub/data/model/user/TwoFactorAuthRequestModel;", BuildConfig.FLAVOR, "token", BuildConfig.FLAVOR, "code", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TwoFactorAuthRequestModel {
    private final String code;
    private final String token;

    public TwoFactorAuthRequestModel(String token, String str) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.code = str;
    }

    public /* synthetic */ TwoFactorAuthRequestModel(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ TwoFactorAuthRequestModel copy$default(TwoFactorAuthRequestModel twoFactorAuthRequestModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = twoFactorAuthRequestModel.token;
        }
        if ((i10 & 2) != 0) {
            str2 = twoFactorAuthRequestModel.code;
        }
        return twoFactorAuthRequestModel.copy(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.code;
    }

    public final TwoFactorAuthRequestModel copy(String token, String str) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new TwoFactorAuthRequestModel(token, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TwoFactorAuthRequestModel) {
            TwoFactorAuthRequestModel twoFactorAuthRequestModel = (TwoFactorAuthRequestModel) obj;
            return Intrinsics.areEqual(this.token, twoFactorAuthRequestModel.token) && Intrinsics.areEqual(this.code, twoFactorAuthRequestModel.code);
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.code;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder m10 = a.m("TwoFactorAuthRequestModel(token=");
        m10.append(this.token);
        m10.append(", code=");
        m10.append((Object) this.code);
        m10.append(')');
        return m10.toString();
    }
}
