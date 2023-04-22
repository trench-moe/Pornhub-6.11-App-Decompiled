package com.app.pornhub.domain.model.user;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f¨\u0006-"}, d2 = {"Lcom/app/pornhub/domain/model/user/UserMetaData;", "Ljava/io/Serializable;", "id", BuildConfig.FLAVOR, "username", "urlThumbnail", "isVerified", BuildConfig.FLAVOR, "channelId", "emailVerificationRequired", "userType", "accessToken", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getChannelId", "getEmailVerificationRequired", "()Z", "setEmailVerificationRequired", "(Z)V", "getId", "setVerified", "getRefreshToken", "getUrlThumbnail", "getUserType", "setUserType", "(Ljava/lang/String;)V", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "domain"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserMetaData implements Serializable {
    private final String accessToken;
    private final String channelId;
    private boolean emailVerificationRequired;

    /* renamed from: id  reason: collision with root package name */
    private final String f4908id;
    private boolean isVerified;
    private final String refreshToken;
    private final String urlThumbnail;
    private String userType;
    private final String username;

    public UserMetaData(String id2, String username, String urlThumbnail, boolean z10, String str, boolean z11, String userType, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(userType, "userType");
        this.f4908id = id2;
        this.username = username;
        this.urlThumbnail = urlThumbnail;
        this.isVerified = z10;
        this.channelId = str;
        this.emailVerificationRequired = z11;
        this.userType = userType;
        this.accessToken = str2;
        this.refreshToken = str3;
    }

    public final String component1() {
        return this.f4908id;
    }

    public final String component2() {
        return this.username;
    }

    public final String component3() {
        return this.urlThumbnail;
    }

    public final boolean component4() {
        return this.isVerified;
    }

    public final String component5() {
        return this.channelId;
    }

    public final boolean component6() {
        return this.emailVerificationRequired;
    }

    public final String component7() {
        return this.userType;
    }

    public final String component8() {
        return this.accessToken;
    }

    public final String component9() {
        return this.refreshToken;
    }

    public final UserMetaData copy(String id2, String username, String urlThumbnail, boolean z10, String str, boolean z11, String userType, String str2, String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(urlThumbnail, "urlThumbnail");
        Intrinsics.checkNotNullParameter(userType, "userType");
        return new UserMetaData(id2, username, urlThumbnail, z10, str, z11, userType, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserMetaData) {
            UserMetaData userMetaData = (UserMetaData) obj;
            if (Intrinsics.areEqual(this.f4908id, userMetaData.f4908id) && Intrinsics.areEqual(this.username, userMetaData.username) && Intrinsics.areEqual(this.urlThumbnail, userMetaData.urlThumbnail) && this.isVerified == userMetaData.isVerified && Intrinsics.areEqual(this.channelId, userMetaData.channelId) && this.emailVerificationRequired == userMetaData.emailVerificationRequired && Intrinsics.areEqual(this.userType, userMetaData.userType) && Intrinsics.areEqual(this.accessToken, userMetaData.accessToken) && Intrinsics.areEqual(this.refreshToken, userMetaData.refreshToken)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final boolean getEmailVerificationRequired() {
        return this.emailVerificationRequired;
    }

    public final String getId() {
        return this.f4908id;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getUrlThumbnail() {
        return this.urlThumbnail;
    }

    public final String getUserType() {
        return this.userType;
    }

    public final String getUsername() {
        return this.username;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.urlThumbnail, a.b(this.username, this.f4908id.hashCode() * 31, 31), 31);
        boolean z10 = this.isVerified;
        int i10 = 1;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int i12 = (b10 + i11) * 31;
        String str = this.channelId;
        int i13 = 0;
        int hashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z11 = this.emailVerificationRequired;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int b11 = a.b(this.userType, (hashCode + i10) * 31, 31);
        String str2 = this.accessToken;
        int hashCode2 = (b11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refreshToken;
        if (str3 != null) {
            i13 = str3.hashCode();
        }
        return hashCode2 + i13;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final void setEmailVerificationRequired(boolean z10) {
        this.emailVerificationRequired = z10;
    }

    public final void setUserType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userType = str;
    }

    public final void setVerified(boolean z10) {
        this.isVerified = z10;
    }

    public String toString() {
        StringBuilder m10 = a.m("UserMetaData(id=");
        m10.append(this.f4908id);
        m10.append(", username=");
        m10.append(this.username);
        m10.append(", urlThumbnail=");
        m10.append(this.urlThumbnail);
        m10.append(", isVerified=");
        m10.append(this.isVerified);
        m10.append(", channelId=");
        m10.append((Object) this.channelId);
        m10.append(", emailVerificationRequired=");
        m10.append(this.emailVerificationRequired);
        m10.append(", userType=");
        m10.append(this.userType);
        m10.append(", accessToken=");
        m10.append((Object) this.accessToken);
        m10.append(", refreshToken=");
        m10.append((Object) this.refreshToken);
        m10.append(')');
        return m10.toString();
    }
}
