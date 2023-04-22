package com.app.pornhub.data.model.user;

import a0.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/app/pornhub/data/model/user/AdditionalSecurityModel;", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "phoneNumber", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "getToken", "getType", "component1", "component2", "component3", "copy", "equals", BuildConfig.FLAVOR, "other", "hashCode", BuildConfig.FLAVOR, "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdditionalSecurityModel {
    private final String phoneNumber;
    private final String token;
    private final String type;

    public AdditionalSecurityModel(String str, String str2, String str3) {
        a.u(str, "type", str2, "phoneNumber", str3, "token");
        this.type = str;
        this.phoneNumber = str2;
        this.token = str3;
    }

    public static /* synthetic */ AdditionalSecurityModel copy$default(AdditionalSecurityModel additionalSecurityModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = additionalSecurityModel.type;
        }
        if ((i10 & 2) != 0) {
            str2 = additionalSecurityModel.phoneNumber;
        }
        if ((i10 & 4) != 0) {
            str3 = additionalSecurityModel.token;
        }
        return additionalSecurityModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final String component3() {
        return this.token;
    }

    public final AdditionalSecurityModel copy(String type, String phoneNumber, String token) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(token, "token");
        return new AdditionalSecurityModel(type, phoneNumber, token);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdditionalSecurityModel) {
            AdditionalSecurityModel additionalSecurityModel = (AdditionalSecurityModel) obj;
            if (Intrinsics.areEqual(this.type, additionalSecurityModel.type) && Intrinsics.areEqual(this.phoneNumber, additionalSecurityModel.phoneNumber) && Intrinsics.areEqual(this.token, additionalSecurityModel.token)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.token.hashCode() + a1.a.b(this.phoneNumber, this.type.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("AdditionalSecurityModel(type=");
        m10.append(this.type);
        m10.append(", phoneNumber=");
        m10.append(this.phoneNumber);
        m10.append(", token=");
        return b.l(m10, this.token, ')');
    }
}
